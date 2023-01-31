import java.util.Scanner;
public class exercice1 {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("Enter  angle1");
        double angle1 = clavier.nextDouble();

        System.out.println("Enter  angle2");
        double angle2 = clavier.nextDouble();

        System.out.println("Enter  angle3");
        double angle3 = clavier.nextDouble();


        if ((angle1+angle2+angle3) == 180) {
            System.out.println("It is a valid triangle.");
        } else {
            System.out.println("It is not a valid triangle");
        }
    }
}
