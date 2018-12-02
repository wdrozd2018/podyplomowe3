import java.util.Locale;

public class StringFormater {
    public static void main(String[] args) {
        int accountBalance=15_005;
        System.out.printf("Saldo: %,d zł %n", accountBalance);

        double pi= Math.PI;
        System.out.println(pi); //nie uwzględnia ustawienia systemowe chodzi o separator
        System.out.printf("%.3f %n", pi); //
        System.out.printf(new Locale("us"),"%.5f %n", pi); //

        double pp=Math.sqrt(9);
        System.out.println(pp);
    }
}
