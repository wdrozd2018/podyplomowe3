public class EqualsTester {
    public static void main(String[] args) {
        //Przypadek 1 (pporównai e stringów poprzez ==) - wynik true
        /*String str1, str2;
        str1="raz dwa trzy";
        str2=str1; // referencja- w pamięcie znajduuje się w tym samym miejscu

        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);
        System.out.println("ten sam obiekt? "+ (str1==str2));*/

        //Przypadek 2 - wynik true
        /*String str1, str2;
        str1="raz dwa trzy";
        str2= "raz dwa trzy";

        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);
        System.out.println("ten sam obiekt? "+ (str1==str2));*/

        //Przypadek 3 - wynik false
        /*String str1, str2;
        str1="raz dwa trzy";
        str2= new String("raz dwa trzy");

        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);
        System.out.println("ten sam obiekt? "+ (str1==str2));*/

        // Przypadek 4 z equals - (wynik true) porónuje czy dane obiekty są identyczne.
        // w przypadku == sprawdzał czy są w tym samym miejscu w pamieci a nie czy obiekty są identyczne
        /*String str1, str2;
        str1="raz dwa trzy";
        str2= new String("raz dwa trzy");

        System.out.println("str1 " + str1);
        System.out.println("str2 " + str2);
        System.out.println("ten sam obiekt? "+ (str1.equals(str2)));*/


        // Inne coś: sprawdzamy co to za klasa i jak ta klasa sie nazywa
       String name="Tomek";
       System.out.println(name.getClass());
       System.out.println(name.getClass().getName());

        System.out.println();
        // sprawdzamy czy nasz oboekt name jest instancją klasy String- tak
        System.out.println(name instanceof String);
        // czy obiekt name jest instanjcja klasy object - tak
        System.out.println(name instanceof Object);
        //sprawdzamy czy nasz object jest instancją klasy Integer - nie
        Object object = new Object();
        object=name;
        System.out.println(object instanceof Integer);



    }
}
