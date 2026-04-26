abstract class person{
    private String name;
    private int age;
    public person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void introduce(){
        System.out.printf("My name is " + this.name + ", " + "i am " + this.age + "  years old" );
    }
    abstract void work();
}

interface Trainable{
    void attendTraining(String topic);
    default void feedback(){
        System.out.println("Thanks for the training session");
    }
}

class engineer extends person implements Trainable{
    private String specialtly;
    public engineer(String name,int age,String specialtly){
        super(name,age);
        this.specialtly = specialtly;
    }
    @Override
    public void work(){
        System.out.println("Engineer " + super.getName() + " is working on " + this.specialtly + " project" );
    }
    @Override
    public void attendTraining(String topic){
        System.out.println( "Engineer " + super.getName() + " is attending training on " + topic);
    }

}

class Manager extends person implements Trainable {
    private int teamSize;

    public Manager(String name, int age, int teamSize) {
        super(name, age);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.println("Manager " + super.getName() + " is managing a team of " + teamSize + " people.");
    }

    @Override
    public void attendTraining(String topic) {
        System.out.println("Manager " + super.getName() + " is attending management training on " + topic + ".");
    }
}

public class ex_ab_inter {
    public static void main(String [] args){
        person [] a = new person[3];
        a[0] = new engineer("tiendung",19 ,"al");
        a[1] = new Manager("Bob", 45, 10);

        for(person d : a){
            d.introduce();
            d.work();
        
        if (d instanceof Trainable) {
            Trainable t = (Trainable) p; // ép kiểu xuống interface
            t.attendTraining("Leadership");
            t.feedback();
        }
    }
    }
}

