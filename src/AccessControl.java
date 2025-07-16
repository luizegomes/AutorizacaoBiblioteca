import java.util.Scanner;

public class AccessControl {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita permissão
    System.out.print("Você tem permissão? (true/false): ");
    boolean hasPermission = scanner.nextBoolean();

    // Solicita idade
    System.out.print("Qual a sua idade? ");
    int age = scanner.nextInt();

    if (hasPermission && age >= 18) {
      System.out.println("Acesso permitido");
    } else if (!hasPermission) {
      System.out.println("Acesso negado");
    } else {
      System.out.println("Idade insuficiente");
    }

    scanner.close();
  }
}