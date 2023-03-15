package basics.print;


/*Create a program which produces the following output:

SHOPPING LIST
    - Milk
        > Semi-skimmed
        > Medium
    - Eggs
        > Free-range
    - Bread */

public class exe1 {
    public static void main(String[] args) {
        System.out.println("SHOPPING LIST");
        list();
    }

    public static void list() {
        System.out.println("\t-Milk");
        System .out.println("\t\t> Semi-skimmed");
        System .out.println("\t\t> Medium");
        System.out.println("\t-Eggs");
        System .out.println("\t\t> Free-range");
        System.out.println("\t-Bread");
    }
    
}
