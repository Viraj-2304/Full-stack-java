4/* 
public class Main6{    //interface
    public static void main(String[]args){
        playable p1=new music();
        playable p2=new video();
        p1.play();
        p2.play();              
    }
}
interface playable{
    void play();
}
class music implements playable{
    public void play(){
        System.out.println("music played");
    }
}
class video implements playable{
    public void play(){
        System.out.println("video played");
    }
}

public class Main6{
    public static void main(String[]args){
        fly f1=new duck();
        swim s1=new duck();
        walk w1=new duck();
        f1.fly();
        s1.swim();
        w1.walk();

    }
}
interface fly{
    void fly();
}
interface swim{
    void swim();
}
interface walk{
    void walk();
}
class duck implements fly,swim,walk{   //multiple inheritace
    public void fly(){
        System.out.println("duck is flying");
    }
    public void swim(){
        System.out.println("duck is swiming");
    }
    public void walk(){
        System.out.println("dusk is walkinhg");
    }
}


public class Main6{
    public static void main(String[]args){
        vehicle v1=new bike();
        
        vehicle v3=new car();
        v3.start();
        v1.stop();
        v1.start();
        v3.stop();
        
    }
}
interface vehicle{
    void start();
    default void stop(){              //default interface if i write here i dont have to write in bike class or any class
        System.out.println("vehicle stop");
    }
}
class bike implements vehicle{
    public void start(){
        System.out.println("bike start");
    }
}
class car implements vehicle{
    public void start(){
        System.out.println("car strts");
    }
    public void stop(){
        System.out.println("car stops");
    }
}

public class Main6{           //Interface + Polymorphism + Multiple Inheritance
    public static void main(String[]args){
        call c1=new phone();
        music m1=new phone();
        camera c2=new phone();
        c1.makecall();
        m1.playmusic();
        c2.ccamera();


    }
}
interface call {
    void makecall();
}
interface music {
    void playmusic();
    
}
interface camera{
    void ccamera();
    
}
class phone implements call,music,camera{
    public void makecall(){
        System.out.println("calling");
    }
    public void playmusic(){
        System.out.println("playing a music");
    }
    public void ccamera(){
        System.out.println("clicking a photos");
    }
}
 
public class Main6{
    public static void main(String[]args){
        engine e1=new car();
        gps g1=new car();
        music m1=new car();
        e1.start();
        g1.navigate();
        m1.play();
    }

}
interface engine{
    void start();
}
interface gps{
    default void navigate(){
        System.out.println("gps");
    }
}
interface music{
    void play();

}
class car implements engine,gps,music{
    public void start(){
        System.out.println("  engine start");
    }
    
    public void play(){
        System.out.println("music starts");
    }
}

public class Main6{    /// E.g with  all 
    public static void main(String[]args){
        payment p1=new payment(165);
        payment p2=new payment(156);
        order o1=new onlineorder(p1, 120, "viraj", "at kapsal");
        order o2=new dineinorder(p2,13,"mayaur",2);
       
        orderservice o3=new onlineorder(new payment(500),121,"shubham","dahivli");
        orderservice o4=new dineinorder(new payment(600),14,"ved",3);
        System.out.println(o1);
        o3.processor();
        System.out.println(o2);
        o4.processor();
        
        System.out.println(o3);
        o3.processor();
        System.out.println(o4);
        o4.processor();

    }
}
interface orderservice{
    void processor();
    
}
class payment{
    private int amount;
    payment(int amount){
        this.amount=amount;
    }
    public String toString(){
        return "amount:" +amount;
    }
}
class order{
    private payment p;
    private int id;
    private String name;
    order(payment p,int id,String name){
        this.p=p;
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return  "\nid:" +id +"\nname:" +name +"\n"+p.toString();
    }
}
class onlineorder extends order implements orderservice{
    private String daddress;
    onlineorder(payment p,int id,String name, String daddress){
        super(p,id,name);
        this.daddress=daddress;

    }
    public void processor(){
        System.out.println("order process online");
    }
    public String toString(){
        return super.toString() +"\ndeliveryaddress:" +daddress;
    }

}
class dineinorder extends order implements orderservice{
    private int tableno;
    dineinorder(payment p,int id,String name, int tableno){
        super(p,id,name);
        this.tableno=tableno;

    }
    public void processor(){
        System.out.println("order process at table");
    }
    public String toString(){
        return super.toString() +"\ntableno:" +tableno;
    }

}

//Abstract class
public class Main6{
    public static void main(String[]args){
        animal a1=new dog();
        
        a1.sound();

    }
}
abstract class animal{
    abstract void sound();
}
class dog extends animal{
    void sound(){
        System.out.println("dog barks");
    }
}
*/
public class Main6{
    public static void main(String[]args){
        car c=new car();
        car.engine e=c.new engine();
        e.start();

    }
}
class car{
    class engine{
        void start(){
            System.out.println("car strted");
        }
    }
}