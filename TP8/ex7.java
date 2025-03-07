import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String   verb ;
    do {
        System.out.println("enterz un verbe");
        verb = sc.nextLine();
    } while (!verb.endsWith("er") || verb.equals("aller")); 
    System.out.println("entrez un entre verbe");
    System.out.println("je "+verb.replace("er", "e"));
    System.out.println("tu "+verb.replace("er", "es"));
    System.out.println("il "+verb.replace("er", "e"));
    System.out.println("elle "+verb.replace("er", "e"));
    if (verb.equals("manger")) {
        System.out.println("nous "+ verb.replace("er", "eons"));
    }else if (verb.equals("commencer")) {
        System.out.println("nous "+ verb.replace("cer", "çons"));
    }
    System.out.println("vous "+verb.replace("er", "ez"));
    System.out.println("ils "+verb.replace("er", "ent"));
    System.out.println("elles "+verb.replace("er", "ent"));
     }

}
