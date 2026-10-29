import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

                System.out.println("Введите фамилию: ");
                    String Фамилия = in.nextLine();

                System.out.println("Введите имя: ");
                    String Имя = in.nextLine();

                System.out.println("Введите отчество: ");
                    String Отчество = in.nextLine();

                    System.out.println("Привет, " + Фамилия + " " + Имя + " " + Отчество+ "!");
        in.close();
    }
}
