package oop_encapsulate;

class person{
    private String name;
    private int age;
    public int value;
    person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age; 
    }
    public void setName(String newName){
        this.name = newName;
    }
    public boolean greaterThan (MyInteger other) {
        return (this.value > other.value);
}
}

public class access_modifier{
    public static void main(String args[]){
        person d = new person("tiendung",19);
        System.out.println(d.getName());   
        d.setAge(22);
        System.out.println(d.getAge()); 
    }
}





public class Ex13 {
    static class Car{
        private String manufacturer;
        private String model;
        private float expense;
        private int time;
        private int Wnum;
        public void initCar(String newM,String newMo,float newEx,int newtime,int newW){
            manufacturer = newM;
            model = newMo;
            expense = newEx;
            time = newtime;
            Wnum = newW;
        }
        public float price(){
            return 2*expense* (float)Math.sqrt(time);
        }
        public void Print(){
            System.out.println("Car attribut\nManufacturer :"+manufacturer+"\nmodel :"+model+"\nProduction expense :"+expense+"\nPruduction time :"+time+"\nWheel number :"+Wnum+"\n");
        }
    }
    public static void main(String[] args){
        Car[] Lcar = new Car[5];
        //creat an array. of 5 car
        for (int i = 0; i < Lcar.length; i++) {
            Lcar[i] = new Car();
            Lcar[i].initCar("Maker" + (i+1), "Model" + (i+1), 1000f + i * 500, 12 + i, 4);
        }
        int Sim = 0;
        for (Car c : Lcar) {
            c.Print();
            System.out.println("Le prix est de :"+c.price()+"\n");
            Sim += c.price();
        }
        System.out.println("Le prix total pour toute les voitures est de :"+Sim);
    }
}
