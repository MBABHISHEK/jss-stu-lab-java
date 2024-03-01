import java.util.Scanner;

public class Book {
    private String name;
    private String code;
    private double unitPrice;
    private int quantity;
    private double totalPrice;

    // Constructor
    public Book(String name, String code, double unitPrice, int quantity) {
        this.name = name;
        this.code = code;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = unitPrice * quantity;
    }

    
    // Function to update total price
    public void updateTotalPrice() {
        this.totalPrice = unitPrice * quantity;
    }

    // Function to display book details
    public void displayBook() {
        System.out.println(name + "          " + code + "      " + unitPrice + "             " + quantity + "        " + totalPrice);
    }
}

public class BookTransaction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store book objects
        Book[] books = new Book[10];

        // Read book details interactively
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for book " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Code: ");
            String code = scanner.nextLine();
            System.out.print("Unit Price: ");
            double unitPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            books[i] = new Book(name, code, unitPrice, quantity);
        }

        // Display table header
        displayTableHeader();

        // Display book details
        for (int i = 0; i < 10; i++) {
            books[i].displayBook();
        }
    }

    // Function to display the table header
    public static void displayTableHeader() {
        System.out.println("NAME           CODE      UNIT PRICE        QUANTITY      TOTAL PRICE");
    }
}
