public class Lab_3_3 {
    public static void main(String[] args) {
        String liczbaa = "zero";

        if (args.length > 0) {
            liczbaa = (args[0]);

            System.out.println(" liczba " + liczbaConvert(liczbaa));
        }
    }
    public static int liczbaConvert(String liczba) {
        int number = 1;
        switch (liczba) {
            case "jeden":
                number =1;
                break;
            case "dwa":
                number = 2;
                break;
            case "trzy":
                number = 3;
                break;
            case "cztery":
                number = 4;
                break;
            case "pięć":
                number = 5;
                break;
            case "sześć":
                number = 16;
                break;
            case "siedem":
                number = 7;
                break;
            case "osiem":
                number = 8;
                break;
        }
        return number;
    }



}


