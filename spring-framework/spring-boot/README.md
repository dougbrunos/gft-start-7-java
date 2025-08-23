# Spring Boot

## O que é?
Enquanto o **Spring Framework** é baseado no padrão de injeção de dependências, o **Spring Boot** fica na configuração automática. Foca na produtividade, nos padrões de estruturação de projetos.

## Starters
São **descritores de dependências**. Com eles, só precisamos informar que nossa aplicação é uma aplicação **Spring Boot**, que ela encapsula todas as depências necessárias.

### Benefícios dos Starters
- Coesão
- Versões compatíveis das depêndencias
- Otimização do tempo
- Configuração simples
- Foco no negócio

### Principais Starters
- **Spring-boot-starter-***
    - **data-jpa:** Integração ao banco de dados via JPA -Hibernate.
    - **data-mongodb:** Interação com banco de dados MongoDB.
    - **web:** Inclusão do container Tomcat para aplicações REST.
    - **web-services:** Webservices baseados na arquitetura SOAP.
    - **batch:** Implementação de JOBs de processos.
    - **teste:** Recursos para testes unitários como JUnit.
    - **openfeign:** Client HTTP baseado em interfaces.
    - **actuator:** Gerenciamento de monitoramento da aplicação.

## Beans x Component

No Spring, tanto **@Component** quanto **@Bean** são usados para registrar objetos no contexto do Spring, mas possuem diferenças importantes:

**@Component** é uma anotação usada diretamente em classes. O Spring faz a varredura automática (component scanning) e registra todas as classes anotadas como beans. Use quando você controla o código da classe e quer que o Spring gerencie a instância automaticamente.

**@Bean** é usado em métodos dentro de classes anotadas com @Configuration. O método retorna uma instância que será registrada como bean. Use quando precisa criar ou configurar manualmente um bean, especialmente para classes de terceiros ou quando precisa de lógica personalizada na criação.

### Quando usar cada um:

Use **@Component** para classes próprias, como serviços, repositórios, controllers.
Use **@Bean** para instanciar beans de bibliotecas externas ou quando precisa de configuração específica na criação do bean.

### Exemplos:
```
// Usando @Component
@Component
public class MeuServico { ... }

// Usando @Bean
@Configuration
public class MinhaConfig {
    @Bean
    public DataSource dataSource() {
        // configuração personalizada
        return new DataSource(...);
    }
}
```

## Scopes - Singleton ou Prototype

No Spring, o "scope" define o ciclo de vida e a visibilidade de um bean. Os dois principais são:

**Singleton:** É o padrão. Apenas uma instância do bean é criada para toda a aplicação. Todo mundo compartilha o mesmo objeto. Use para serviços, repositórios e componentes que não precisam de estado próprio por usuário ou requisição.

**Prototype:** Uma nova instância do bean é criada cada vez que ele é solicitado do container. Use quando precisa de objetos independentes, com estado próprio, como modelos temporários ou beans que não podem ser compartilhados.

### Exemplo de uso:

```
@Component
@Scope("singleton") // padrão, pode omitir
public class MeuServicoSingleton { ... }

@Component
@Scope("prototype")
public class MeuModeloPrototype { ... }
```

## Properties Value

No Spring Boot, **Properties Value** refere-se à configuração de valores em arquivos de propriedades, como o application.properties. Esses valores são usados para parametrizar a aplicação, como URLs, credenciais, mensagens, etc.

Para acessar esses valores no código, usa-se a anotação **@Value**:

```
@Value("${minha.configuracao}")
private String valor;

// Tratar valores não encontrados com ":"
@Value("${minha.configuracao:Sem-Valor}")
private String valor;
```

Exemplo no application.properties:
```
minha.configuracao=Olá, Spring!
```

## Configuration Properties

**@ConfigurationProperties** é uma forma avançada de mapear vários valores do application.properties ou application.yml para uma classe Java, facilitando a organização e o acesso às configurações.

### Como funciona:

- Crie uma classe com atributos que representam as propriedades.
- Anote com @ConfigurationProperties(prefix = "meu.prefixo").
Adicione @Component ou registre como bean.
- O Spring injeta automaticamente os valores.

Exemplo no application.properties:
```
@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String titulo;
    private String versao;
    // getters e setters
}
```

Exemplo no application.properties:
```
app.titulo=Teste
app.versao=1.0
```
Veja que o prefixo(prefix) é o "app"

### Vantagens:

- Agrupa várias propriedades relacionadas.
- Facilita testes e manutenção.
- Suporta tipos complexos (listas, objetos).

Use @ConfigurationProperties quando precisar mapear várias configurações para uma classe, em vez de usar vários @Value.

## ORM e JPA

### ORM

ORM (Object-Relational Mapping) é uma técnica que permite mapear objetos do mundo Java (classes, atributos) para tabelas de um banco de dados relacional (como MySQL, PostgreSQL).

Com ORM, você trabalha com objetos em vez de comandos SQL diretamente. O framework cuida de converter operações com objetos (salvar, buscar, atualizar, deletar) em comandos SQL para o banco.

#### Vantagens

- Facilita o desenvolvimento: menos código SQL, mais foco na lógica de negócio.
- Reduz erros de conversão entre tipos Java e tipos do banco.
- Permite usar recursos avançados, como relacionamentos e transações, de forma simples.

#### Exemplo

```
@Entity
public class Produto {
    @Id
    private Long id;
    private String nome;
}
```
Essa classe pode ser salva, buscada ou atualizada no banco sem escrever SQL manualmente.

### JPA

JPA (Java Persistence API) é uma especificação do Java para persistência de dados, ou seja, para salvar, buscar, atualizar e remover objetos Java em bancos de dados relacionais.

Ela define um padrão para mapeamento objeto-relacional (ORM), mas não é uma implementação: frameworks como Hibernate, EclipseLink e OpenJPA implementam JPA.

Com JPA, você usa anotações para indicar como suas classes e atributos se relacionam com tabelas e colunas do banco. O framework cuida de transformar operações com objetos em comandos SQL.

#### Exemplo:

```
@Entity
public class Cliente {
    @Id
    private Long id;
    private String nome;
}
```
Aqui, a classe Cliente será mapeada para uma tabela no banco, e cada instância representa uma linha.

### Mapeamento na prática

Suponha que você tem uma tabela produto no banco de dados. Para mapear essa tabela para uma classe Java usando JPA:

```
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity // Indica que a classe é uma entidade JPA
@Table(name = "produto") // Mapeia para a tabela "produto"
public class Produto {

    @Id // Indica a chave primária
    private Long id;

    @Column(name = "nome") // Mapeia para a coluna "nome"
    private String nome;

    @Column(name = "preco") // Mapeia para a coluna "preco"
    private Double preco;

    // getters e setters
}
```
Com esse mapeamento, o JPA/Hibernate consegue salvar, buscar e atualizar objetos Produto diretamente na tabela produto do banco de dados, sem precisar escrever SQL manualmente.

# Spring Data JPA

O Spring Data JPA é um módulo do Spring que facilita o uso do JPA em aplicações Java. Ele automatiza grande parte do trabalho de persistência, tornando o acesso ao banco de dados mais simples e rápido.

## Principais vantagens:

- Criação automática de repositórios (interfaces) para entidades JPA.
- Métodos prontos para salvar, buscar, atualizar e deletar dados.
- Permite criar consultas personalizadas apenas declarando métodos na interface.
- Integração fácil com o Spring Boot.

## Interfaces

- CrudRepository
- JPARepository
- PagingAndSortingRepository

## Anotações

- @Query
- @Param

## Exemplo:

```
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Busca produtos por nome
    List<Produto> findByNome(String nome);
}
```
Com isso, você não precisa implementar métodos para acessar o banco: o Spring Data JPA faz tudo automaticamente.
