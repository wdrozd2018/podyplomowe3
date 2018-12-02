public class Sample2 {
    public static void main(String[] args) {
        int a = 3;
        if (a < 0) {
            System.out.println("a mniejsze od 0");
        } else if (a > 0) {
            System.out.println("a większe od 0");
        } else {
            System.out.println(" a równe 0");
        }

        char grade = 'D';
        switch (grade) {
            case 'A':
                System.out.println("Wspaniale");
                break;
            case 'B':
                System.out.println("Dobrze");
                break;
            case 'C':
                System.out.println("Mogło być lepiej ");
                break;
            default:
                System.out.println("Niedobrze");
        }

        //operator trójargumentow- zamiast If
        int c=2;
        System.out.println(a>5 ? "większe" : "mniejsze");


    }
}