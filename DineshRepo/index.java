import java.util.Scanner;

public class index {

    static int  sum(int a,int b){
        return a+b;
    }
    static int sub(int a,int b){
        return a-b;
    }
    static int mul(int a,int b){
        return a*b;
    }
    static int divide(int a,int b){
        return a/b;
    }
    public static void main(String[] args) {
        System.out.println("Hello Dinesh");

        Scanner sc = new Scanner(System.in);
        int choice;
        
        do{
            System.out.println("1. Add");
            System.out.println("2. Sub");
            System.out.println("3. mul");
            System.out.println("4. divide");
            System.out.println("5. Exit");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter First Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    int b = sc.nextInt();
                    System.out.println("Sum: "+sum(a,b));
                    break;
                case 2:   
                    System.out.println("Enter First Number: ");
                    int c = sc.nextInt();
                    System.out.println("Enter Second Number: ");
                    int d = sc.nextInt(); 
            
                default:
                    break;
            }
        }while(choice != 5);

    }
}