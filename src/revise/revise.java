package revise;

class animal{
    void makesound(){
        System.out.println("make noise");
    }

}
class dog extends animal{
    @Override
    void makesound(){
        System.out.println("wouf wouf");
    }

}
class cat extends animal{
    @Override
    void makesound(){
        System.out.println("meow meow");
    }
}
public class revise {
    static public void main(String [] args){
        
        animal [] a = new animal[3];
        a[0] = new dog();
        a[1] = new cat();
        a[2] = new dog();
        for(animal b : a ){
            b.makesound();
        }
    }
    
    
}



/*Create an array of polymorphic objects in Java to show that
objects of child classes can be treated as if they are objects of
the parent class.
10. Present the
 concept of abstraction
 in object-oriented
progra  */