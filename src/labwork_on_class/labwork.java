package labwork_on_class;

public class labwork {
    static void ex2(){
        for(int i = 0; i<10;i++){
            System.out.println("Welcome to Object-Oriented Programming");
        }
    }
    static void ex3() {
        for (int i = 10; i >= 1; i--) {
            if (i > 1) {
                System.out.println(i + " exams, we take in one week,");
                System.out.println("Now one exam has the result,");
            } else { // khi còn 1 exam
                System.out.println("1 exam, we take in one week,");
                System.out.println("Now one exam has the result,");
            }
        }
        System.out.println("Thanks god, no exam this week.");
    }
    static void ex4(){

    }
    public static void main(String[] args) {
        ex2();
        ex3();
}
