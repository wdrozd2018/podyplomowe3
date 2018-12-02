public class StaticMember {
    public static void main(String[] args) {

        FamilyMember dad = new FamilyMember();
        dad.name= "Piotr";
        dad.age=32;

        FamilyMember mam= new FamilyMember();
        mam.name= "Anna";
        mam.age=31;

        FamilyMember kid=new FamilyMember();
        kid.name="Zosia";
        kid.age=3;

        show(mam);
        show(dad);
        show(kid);

    }

    static void show(FamilyMember familuMember){
        System.out.print(familuMember.name);
        System.out.print(" ");
        System.out.print(familuMember.surname);
        System.out.print(" ");
        System.out.print(familuMember.age);
        System.out.println(" lat/a");
    }
}

class FamilyMember{
    static String surname="Nowak";
    String name;
    int age;

}