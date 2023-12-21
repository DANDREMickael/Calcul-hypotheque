import java.text.NumberFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        final byte MOIS_DE_LANNEE = 12;
        final byte POURCENTAGE = 100;

        Scanner entreeutilisateur = new Scanner(System.in);

        System.out.print("Veuillez indiquer le montant du crédit (en €) : ");
        int montantcredit = entreeutilisateur.nextInt();

        System.out.print("Veuillez indiquer le taux d'intérêt (par an): ");
        float anneeinteret = Float.parseFloat(String.valueOf(entreeutilisateur.nextFloat()));
        float moisinterets = anneeinteret / (float)POURCENTAGE  / (float)MOIS_DE_LANNEE;

        System.out.print("Veuillez indiquer la durée de remboursement (en années) : ");
        byte anneeecheances = entreeutilisateur.nextByte();
        int nbecheances =  anneeecheances * MOIS_DE_LANNEE;

        //Formule de calcul pour les mensualités de prêt
        double hypotheque = ((montantcredit*anneeinteret)/MOIS_DE_LANNEE)
                /
                Math.pow((1-(1+(anneeinteret/MOIS_DE_LANNEE))),((-nbecheances)));

        NumberFormat mensualites = NumberFormat.getCurrencyInstance();
        System.out.print("Vos mensualités d'hypothèques seront de " + mensualites.toString());
    }
}