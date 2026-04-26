package last_rivise;
import java.util.Scanner;

class computer{
    private int memory;
    private String processor;
    computer(int memory,String processor){
        this.memory = memory;
        this.processor = processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public void setMemory(int memory){
        this.memory = memory;
    }
    public int getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    void turnON(){
        System.out.println("turn on your computer");
    }
    void turnOFF(){
        System.out.println("turn off your computer");
    }
    public void printInfo() {
        System.out.println("Processor: " + processor);
        System.out.println("Memory: " + memory + " GB");
    }
}

class laptop extends computer{
    String touchpad;
    laptop(int memory,String processor,String touchpad){
        super(memory,processor);
        this.touchpad = touchpad;
    }
    public String getTouchpad(){
        return touchpad;
    }
    void openlid(){
        System.out.println("click "+touchpad+ "to open laptop");
    }
     public void printInfo() {
        System.out.println("=== Laptop Information ===");
        super.printInfo();
        System.out.println("Touchpad: " + touchpad);
    }
}
class desktop extends computer{
    desktop(int memory,String processor){
        super(memory,processor);
    }
    void upgrade(int memory, String processor){
        setMemory(memory);
        setProcessor(processor);
        System.out.println("Suscessfully upgrade");
    }
    @Override
    public void printInfo(){
        super.printInfo();
    }
}

public class test2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        // nhập thông tin cho laptop
        System.out.print("Enter laptop's processor : ");
        String lab_processor = sc.nextLine();
        System.out.print("Touchpad type: ");
        String lab_Touchpad = sc.nextLine();
        System.out.print("Enter laptop's memory : ");
        int lab_memory = sc.nextInt(); 
        laptop lab = new laptop(lab_memory,lab_processor,lab_Touchpad);

        // nhập thông tin cho desktop
        sc.nextLine();
        System.out.print("Processor: ");
        String dProcessor = sc.nextLine();
        System.out.print("Enter desktop'memory : ");
        int dMemory = sc.nextInt();
        desktop desk = new desktop(dMemory, dProcessor);


        lab.openlid();
        System.out.println("--------------------------------");
        lab.printInfo();
        System.out.println("--------------------------------");

        desk.printInfo();
        System.out.println("--------------------------------");

        desk.upgrade(32,"invidial");
        System.out.println("--------------------------------");

        desk.printInfo();
    }
}
