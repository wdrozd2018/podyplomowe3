public class ArrayCopier {
    public static void main(String[] args) {
        //while. kopiujemy tablice zmiennoprzecinkowa, jezeli bedzie wartosc=1 to przerywamy
        int[] arrSource= {7,4,8,1,4,1,4};
        double[] arrTarget = new double[arrSource.length];

        System.out.print("arrSource: [");
        for (int i = 0; i <arrSource.length ; i++) {
            System.out.print(arrSource[i] + " ");
        }

        System.out.println("]");

        int count=0;
        System.out.print("arrTarget: [");
        while (count < arrSource.length && arrSource[count]!=1) {
            arrTarget[count]=arrSource[count];
            System.out.print(arrTarget[count++] + " ");
        }
        System.out.println("]");
    }
}
