import java.util.Scanner;

public class Main {

    private final static String WELCOME_MESSAGE = "Bem-vindo ";

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String name = scanner.next();
            System.out.println(WELCOME_MESSAGE + name);
            scanner.close();
        }
    }
}