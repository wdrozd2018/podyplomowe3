public class Sample {
    public static void main(String[] args) {
        //rzutowanie
        byte a=7;
        short b;
        int c;

        c=a; // lub c=(int)a ale to nie jest potrzebne
        b=(short)c;

        int d=5;
        double e=13.5;
        double f=d/e;  //konwersja niejawna. d konwertowane do double
        int g=(int)e/d;  // bez (int) w ten sposób się nie da bo wynikiem jest z mniejszą precyzją.

        //rzutowanie obiektów

        Employee emp= new Employee();
        VicePresident vp= new VicePresident();
       //emp=vp; // wszytsko to co ma Employee ma tez Vicepresident wiec ok- konwersja niejawna
        vp=(VicePresident)emp; // tak się nie da więc trzeba dopisać (VicePresienet) chociaz wtedy te zmoga byc problemy


        // typy z duzych liter odnoszą się do obiektu ale można wykorzytsywac
        Float f1=12.5F;
        Float f2=2.2f;
        Math.min(f1,f2);

    }
}
class Employee{}
class VicePresident extends Employee{};