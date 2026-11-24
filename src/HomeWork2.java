import java.util.Scanner;

public class HomeWork2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qiymeti daxil edin:");
        String price = scan.nextLine();

        double result = Double.parseDouble(price);
        System.out.println("EDV ile birge: " + (result + (result*18/100)));


    }
}
