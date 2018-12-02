import java.awt.*;
import java.sql.SQLOutput;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr= new int[100];  //tak
        int arr1[]=new int[100];  //lub tak
        int[] arr3={1,2,3}; //lub tak. To jes uproszczona wersja ale mniej stosowana

        System.out.println(arr3[0]);
        System.out.println(arr3[2]);

        //przechowywanie punktów
        Point[] points={new Point(1,1), new Point(2,3), new Point(4,1)};
        System.out.println(points[0].x);

        String[] titles= {"Pan", "Pani", "Państwo", "PAnna", "Doktor"};
        System.out.println(titles[4]);

        //jaki ma rozmiar tablica
        System.out.println(points.length);
    }
}
