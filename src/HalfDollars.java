public class HalfDollars {
    public static void main(String[] args) {
        int[] denver= {1_700_000, 4_600_000, 2_100_000};
        int[] philadelhia= {1_800_000, 5_000_000, 1_800_000};
        int[] total = new int[denver.length];
        int average;

        //philadelhia[0]=1_800_000;
        //philadelhia[1]=5_000_000;
        //philadelhia[2]=1_800_000;

        for (int i = 0; i <=2 ; i++) {
            total[i]=denver[i]+philadelhia[i];
        }
       //total[0]=denver[0]+philadelhia[0];
       //total[1]=denver[1]+philadelhia[1];
       //total[2]=denver[2]+philadelhia[2];

        average= (total[0]+total[1]+total[2])/3;

        System.out.print("Produkcja w 2012 wynosiła: ");
        System.out.format("%,d%n", total[0]);
        System.out.print("Produkcja w 2013 wynosiła: ");
        System.out.format("%,d%n", total[1]);
        System.out.print("Produkcja w 2014 wynosiła: ");
        System.out.format("%,d%n", total[2]);
        System.out.print("Srednia produkcja: ");
        System.out.format("%,d%n", average);

        //tab;ica wielowymiarowa
        int [][][] arr3D=new int[4][3][1];

    }
}
