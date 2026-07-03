/* 
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
    public class Main6{
    public static void main(String[]args){
        cloud c1=new gdrive();
        cloud c2=new dropbox();
        c1.dfile();
        c1.ufile();
        c1.sfile();
        c2.dfile();
        c2.ufile();
        c2.sfile();
        cloud.support();



    }
}
interface cloud{
    void ufile();
    void dfile();
    default void sfile(){
        System.out.println("Storage Capacity : 15 GB");
    }
    static void support(){
        System.out.println("Cloud Support : support@cloud.com");
    }
}
class gdrive implements cloud{
    public void ufile(){
        System.out.println("upload the file");
    }
    public void dfile(){
        System.out.println("download the file");
    }

}
class dropbox implements cloud{
    public void ufile(){
        System.out.println("upload the file");
    }
    public void dfile(){
        System.out.println("download the file");
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

public class Main6{
public static void main(String[]args){
    vehicle v1=new car("toyoto",150222);
    vehicle v2=new bike("honda",15000);
    v1.display();
    v1.start();
    v2.display();
    v2.start();


}
}abstract class vehicle{
    protected String brand;
    private int prize;
    vehicle(String brand,int prize){
        this.brand=brand;
        this.prize=prize;
    }
    public void display(){
        System.out.println("brand :"+brand);
        System.out.println("prize:"+prize);
    }
    abstract void start();
}
class car extends vehicle{
    car(String brand,int prize){
        super(brand,prize);
    }
    void start(){
        System.out.println("car is starting");
    }

}
class bike extends vehicle{
    bike(String brand,int prize){
        super(brand,prize);
    }
    void start(){
        System.out.println("bike is starting");
    }

}
    public static void main(String[]args){
        
        shape s1=new circle("red",5);
        shape s2=new rectangle("blue",5,6);
        s1.display();
        s1.carea();
        s2.display();
        s2.carea();

    }
}
abstract class shape{
    private String color;
    shape(String color){
        this.color=color;
    }
    public void display(){
        System.out.println("color:"+color);
    }
    abstract void carea();

}
class circle extends shape{
    private int radius;
    circle(String color,int radius){
        super(color);
        this.radius=radius;
    }
    void carea(){
        System.out.println("area of circle"+(3.14*radius*radius));
    }
   
} 
class rectangle extends shape{
    private int length;
    private int width;
    rectangle(String color,int length,int width){
        super(color);
        this.length=length;
        this.width=width;
    }
    void carea(){
        System.out.println("area of rectangle"+(3.14*length*width));
    }
   
} 


public class Main6{
    public static void main(String[]args){
        product p1=new mobil("samsung",25000);
        product p2=new laptop("asus",25000);
         p1.display();
         p1.discount();
         p2.display();
         p2.discount();
    

    }
}
abstract class product{
    protected String name;
    protected int prize;
    product(String name,int prize){
        this.name=name;
        this.prize=prize;
    }
    public void display(){
        System.out.println("product name:"+name);
        System.out.println("prize:"+prize);


    }
    abstract void discount();


}
class mobil extends product{
    mobil(String name,int prize){
        super(name,prize);
    }
    void discount(){
        System.out.println("mobile discount :" + (prize-2000));
    }
}
class laptop extends product{
    laptop(String name,int prize){
        super(name,prize);
    
    }
    void discount(){
        System.out.println("laptop discount :" +(prize-200));
    }
    

}*/
public class Main6{
    public static void main(String[]args){
        order o1=new dorder("viraj",102,156.0,"kalyan east");
        order o2=new diorder("ved",132,1561.3,5);
        System.out.println(o1);
        o1.process();
        System.out.println(o2);
        o2.process();
    }
}
abstract class order{
    private String name;
    private int id;
    private double amount;
    order(String name,int id,double amount){
        this.name=name;
        this.id=id;
        this.amount=amount;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public double getamount(){
        return amount;
    }    
    public void displayorder(){
        System.out.println("name :"+name);
        System.out.println("id :"+id);
        System.out.println("amount :"+amount);
    }
    public String toString(){
        return "name:"+name +"\nid:"+id +"\namount:"+amount;
    }
    abstract void process();
}
class dorder extends order{
    private String daddress;
    dorder(String name,int id,double amount,String daddress){
        super(name,id,amount);
        this.daddress=daddress;
    }
    void process(){
        System.out.println("order is out of delievry");
    }
    public String toString(){
        return super.toString() +"\ndaddress:"+daddress;
    }


}
class diorder extends order{
    private int tableno;
    diorder(String name,int id,double amount,int tableno){
        super(name,id,amount);
        this.tableno=tableno;
    }
    void process(){
        System.out.println("Order is being served at the table.");
    }
    public String toString(){
        return super.toString() +"\ntableno:"+tableno;
    }


}