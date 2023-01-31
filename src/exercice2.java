import java.util.Scanner;

public class exercice2 {

    public static void main(String[] args) {

    System.out.println("Enter the time difference between their home and where they are going" +
            "If the destination time zone is “behind” the user’s home time zone the user should enter a negative number");

        Scanner clavier = new Scanner(System.in);
        int decalageHoraire = clavier.nextInt();

        int heuredeDestinationNuit = decalageHoraire < 0 ? 24 + decalageHoraire : decalageHoraire;

        int decalageDestinationJournee = 12 + decalageHoraire;

        //out message
        System.out.println("It will be" + decalageDestinationJournee + "Hours at the destination when it will the jorney " +
                "it will" + heuredeDestinationNuit + "Hours at the destination when it will be nigth 00Hour");
    }
}
