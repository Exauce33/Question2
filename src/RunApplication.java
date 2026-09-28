import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select a console type:");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");
        System.out.print("Enter choice (1-3): ");
        int choice = Integer.parseInt(input.nextLine());

        String consoleType;
        switch (choice) {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.print("Enter store name: ");
        String store = input.nextLine();

        System.out.print("Enter total amount of PS5 sales: ");
        int totalSales = Integer.parseInt(input.nextLine());

        ConsoleSales sales = new ConsoleSales(consoleType, store, totalSales);
        sales.printReport();

        input.close();
    }
}