import java.util.Scanner;

public class MiniTestW1 {
    public static void main(String[] args) {
        String user;
        String pass;
        int count = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap ten user: ");
            user = sc.nextLine();
            System.out.print("Nhap password: ");
            pass = sc.nextLine();

            if (!user.equals("admin") || !pass.equals("123456")){
                count++;
                if (count==3){
                    System.exit(0);
                }
                System.out.println("NHAP LAI USER & PASSWORD");
            }

        } while (!user.equals("admin") && !pass.equals("123456"));


        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the Rectangle");
            System.out.println("2. Draw the square Triangle");
            System.out.println("3. Draw the isosceles Triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the Rectangle");
                    System.out.print("Enter width: ");
                    int width = sc.nextInt();
                    System.out.print("Enter the height: ");
                    int height = sc.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the square Triangle");
                    System.out.println("Enter size: ");
                    int s2 = sc.nextInt();
                    for (int i = 1; i <= s2; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the isosceles Triangle");
                    System.out.println("Enter size: ");
                    int s3 = sc.nextInt();
                    for (int i = 0; i < s3; i++) {
                        for (int j = 0; j < s3-i ; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k <(2*i+1) ; k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }

    }
}



