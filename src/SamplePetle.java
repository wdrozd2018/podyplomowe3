public class SamplePetle {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ": aaaaaaaaaa");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("jjj");
        }

        //do.. while
        boolean isOK = false;
        do {
            System.out.println("jest ok");
        }
        while (isOK);
        System.out.println("nie jest dobrze");

        //--------------------
 int[] arr= {1,2,3,5,4,7,8,6,1,4};
        for (int i: arr){
            System.out.println(i);
        }
    }
}

