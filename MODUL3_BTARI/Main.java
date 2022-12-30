import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IllegalArgumentException {
        int menu;
        boolean repeat = true;
        Scanner scan = new Scanner(System.in);
        Calculation calc = new Calculation();
        double z;

    do{
        try{
            System.out.println("""
                               ==Menu Program==
                               1. Square
                               2. Circle
                               3. Trapezoid""");
            
            System.out.print("Select menu : ");
            menu = scan.nextInt();
            switch (menu) {
                
                case 1:
                    System.out.print("\nEnter the length of the side of the square : ");
                    double side = scan.nextDouble();
                    calc.setSquare(side);
                    calc.run();
                    z=calc.getSquare();
                    System.out.println("\nThe calculation result: " + z);
                    break;
                    
                case 2:
                    System.out.print("\nEnter the length of the radius of the circle : ");
                    double radius = scan.nextDouble();
                    calc.setCircle(radius); 
                    calc.run();
                    z=calc.getCircle();
                    System.out.println("\nThe calculation result: " + z);
                    break;
                case 3:
                    System.out.print("\nEnter the side of the base of the trapezoid : ");
                    double a = scan.nextDouble();
                    System.out.print("Enter the upper side of the trapezoid : ");
                    double b = scan.nextDouble();
                    System.out.print("Enter the height of the trapezoid : ");
                    double t = scan.nextDouble();
                    calc.setTripezoid (a, b, t);
                    calc.run();
                    z=calc.getTrapezoid();
                    System.out.println("\nThe calculation result: " + z);
                    break;
                case 0:
                    System.out.println("\nProgram has ended");
                    break;                
                default:
                    System.out.println("\nOption not available\n");
                    continue;
            }
            repeat = false;    
        
        } catch (InputMismatchException except) {
            System.out.println("\n===Error: Input must be a number===\n");
            except.getStackTrace();
        } catch (IllegalAccessException except){
            System.out.println(except);
            except.getStackTrace();
        }
        scan.nextLine();
    } while (repeat);
    scan.close();
  }
}