package revise;
abstract class shape{
    public double calArea(){
        return 0.0;
    }
    public double calVolume(){
        return 0.0;
    }
    public abstract String getName();
}
class point extends shape{
    protected double x,y;
    public point(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double calArea(){
        return 0.1;
    }
    @Override
    public double calVolume(){
        return 0.1;
    }
    @Override
    public String getName(){
        return "Point";
    }
    void showInfo(){
        System.out.println("Value x: "+this.x);
        System.out.println("Value y: "+ this.y);
    }

}
class circle extends point{
    protected double r;
    public circle(int x,int y,double r){
        super(x,y); 
        this.r = r;
    }
    @Override
    public double calArea(){
        return Math.PI * r * r;
    }
    @Override
    public String getName(){
        return "Circle";
    }
    public double getPerimeter(){
        return 2*Math.PI*r;
    }
}
class cylinder extends circle{
    private double h;
    public cylinder(int x,int y, double r, double h){
        super(x,y,r);
        this.h = h;
    }
   

    @Override
    public double calArea() {
        // diện tích toàn phần = 2πr(h + r)
        return 2 * Math.PI * r * (h + r);
    }

    @Override
    public double calVolume() {
        // thể tích = πr^2h
        return Math.PI * r * r * h;
    }

    @Override
    public String getName() {
        return "Cylinder";
    }
}

public class ex17 {
    static public void main(String [] args){
        shape[] shape = new shape[3];
        shape[0] = new point(3,4);
        shape[1] = new circle(9,12,13);
        shape[2] = new cylinder(3,4,5,6);
        for(shape a : shape){
            System.out.println("----------------------------------");
            System.out.println("Object Name: " + a.getName());
            System.out.println("Area: " + a.calArea());
            System.out.println("Volume: " + a.calVolume());
        }
    }
}


/*cái tính polymorphism ấy nó có thể kế thừa từ nhiều đời, đời cha đời cụ đời kỵ ..  ví dụ là cylinder kế thừa từ circle, 
 circle kế thừa từ point, point kế thừa từ shape.. 
 */