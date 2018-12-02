import java.util.StringTokenizer;

public class Lab_3_2 {
    public static void main(String[] args) {

        //Zadanie 1
        StringTokenizer st1;

        String quote3  =" 29/04/2016";
        st1 = new StringTokenizer(quote3, "/");
        System.out.println("Token 1: " + st1.nextToken()) ;
        System.out.println("Token 2: " + st1.nextToken()) ;
        System.out.println("Token 3: " + st1.nextToken()) ;

        //Zadanie 2
        Dane dane1= new Dane();
        dane1.weight=45;
        dane1.depth=-15;

        dane1.show(dane1);

        Dane dane2= new Dane();
        dane2.weight=45;
        dane2.depth=-15;

        dane2.show(dane2);

        //Zadanie3
        CountObject numer1= new CountObject();
        numer1.obiekt="numer1";

    }

}

class Dane{
    static int height=36;
    int weight;
    int depth;

    public static void show(Dane dane){
        System.out.print("Weight: " + dane.weight);
        System.out.print(" ");
        System.out.print("Depth: " + dane.depth);
        System.out.print(" ");
        System.out.print("Height: " +dane.height);
        System.out.println(" ");
    }
}

class CountObject{
    String obiekt= "obiekt1";



}


