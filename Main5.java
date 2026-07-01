/*
public class Main4{
    public static void main(String[]args){
    
        car s1=new car();
        s1.speed=100;
        System.out.println(s1.speed);
    }
}



public class Main5{
    public static void main(String[]args){
        car s1=new car();
        s1.setspeed(100);
        s1.setcolour("black");
        s1.settest1(true);
        


        System.out.println(s1.getspeed());
        System.out.println(s1.getcolour());
        System.out.println(s1.istest1());
        
    }
}
    

public class Main5{
    public static void main(String[]args){
        car s1=new car();
        s1.setname("viraj"); // to set the value
        s1.setmarks(65);
        s1.showdetails();
        s1.checkGrade();
        System.out.println(s1.getname()); // to gives you value back
        System.out.println(s1.getmarks());
        

    }
} 

public class Main5{
    public static void main(String[]args){
        Car s1= new Car("viraj",51000);
        s1.showdetails();
        s1.checksalary();

    }
}
class Car{
    private String name;
    private int salary;

     Car(String name,int salary){
        this.name=name;
        this.salary=salary;

     }
     public String getname(){
        return name;
     }
     public int getsalary(){
        return salary;
     }
     public void showdetails(){
        System.out.println("name: " +name);
        System.out.println("salary: " +salary);
    }
    public void checksalary(){
        if(salary>=50000){
            System.out.println("good");

        }else if(salary>=30000){
            System.out.println("not bad");

        }else{
            System.out.println(" bad");

        }
    }

}

public class Main5{  // Inheritance
    public static void main(String[]args){
        bike b1=new bike("bie","honda",100);
        truck t1=new truck("truk","tata",140);
        System.out.println(b1);
        System.out.println(t1);
    }
}
class vehicle{
    private String vehiclename;

    vehicle(String vehiclename){
        this.vehiclename=vehiclename;

    }
    public String getvehiclename(){
        return vehiclename;
    }
    
    public String toString(){
        return "vehiclename: " +vehiclename ;
    }


}



class bike extends vehicle{
    private String name;
    private int speed;

    bike(String vehiclename,String name,int speed){
        super(vehiclename);
        this.name=name;
        this.speed=speed;

    }
    @Override
    public String toString(){
        return super.toString() +"\nname:" +name +"\nspeed:" +speed;
    }
}
class truck extends vehicle{
    private String name;
    private int speed;
    truck(String vehiclename, String name,int speed){
        super(vehiclename);
        this.name=name;
        this.speed=speed;
    }
    @Override
    public String toString(){
        return super.toString() +"\nname:" +name +"\nspeed:" +speed;
    }
}

public class Main5{   //Inheritance e.g
    public static void main(String[]args){
        croco r1=new croco(164,54,"reptile", "croco","yes","yes",true,"yes");
        truck t1=new truck(165,56,"mammal","warm","tata",140);
        System.out.println(t1);
       System.out.println(r1);


    }
}
class animal{
    private int  height;
    private int  weight;
    private String animaltype;
    private String bloodtype;

    animal(int  height ,int weight,String animaltype,String bloodtype){
        this.height=height;
        this.weight=weight;
        this.animaltype=animaltype;
        this.bloodtype=bloodtype;
    }
    public String toString(){
        return "Height:" +height +"\nWeight: " +weight +"\nanimaltype: " +animaltype +"\nbloodtype: " +bloodtype;

    }
}
class reptile extends animal{
    private String dryskin;
    private String backbone;
    private boolean eggs;
    reptile(int  height ,int weight,String animaltype,String bloodtype,String dryskin,String backbone,boolean eggs){
        super(height, weight, animaltype, bloodtype);
        this.dryskin=dryskin;
        this.backbone=backbone;
        this.eggs=eggs;

    }
    @Override
    public String toString(){
        return super.toString() +"\ndryskin: " +dryskin +"\nbackbone: " +backbone +"\neggs:  " +eggs;

    }
}
class croco extends reptile{
    private String heggs;

    croco(int  height ,int weight,String animaltype,String bloodtype,String dryskin,String backbone,boolean eggs,String heggs){
        super(height, weight, animaltype, bloodtype,dryskin,backbone,eggs);
        this.heggs=heggs;

    }
    @Override
    public String toString(){
        return super.toString() +"\nhard eggs: " +heggs;
    }
}
class bike extends animal{
    private String name;
    private int speed;

    bike(int  height ,int weight,String animaltype,String bloodtype,String name,int speed){
        super(height, weight, animaltype, bloodtype);
        this.name=name;
        this.speed=speed;

    }
    @Override
    public String toString(){
        return super.toString() +"\nname:" +name +"\nspeed:" +speed;
    }
}
class truck extends bike{
    private String name;
    private int speed;
    truck(int  height ,int weight,String animaltype,String bloodtype,String name,int speed){
        super(height, weight, animaltype, bloodtype,name,speed);
        this.name=name;
        this.speed=speed;
    }
    @Override
    public String toString(){
        return super.toString() +"\nname:" +name +"\nspeed:" +speed;
    }
}    
  


// Composition
public class Main5{
    public static void main(String[]args){
        processor p1= new processor("intel");
        Ram r1=new Ram(4);
        laptop l1= new laptop(p1,r1,"xyz",45000);
        System.out.println(l1);


    }
}
class processor{
    private String name;
    processor(String name){
        this.name=name;
    }
    public String toString(){
        return "name:" +name;
    }
}
class Ram {
    private int size;

    Ram(int size){
        this.size = size;
    }

    public String toString(){
        return "RAM: " + size + "GB";
    }
}
class laptop {
    private processor p;
    private Ram r;
    private String lname;
    private int prize;
    laptop(processor p,Ram r, String lname,int prize){
        this.r=r;
        this.p=p;
        this.lname=lname;
        this.prize=prize;
    }
    @Override
    public String toString(){
        return p.toString() +"\n"+ r.toString() +"\nlname:" +lname +"\nprize:" +prize;
    }
}
      
public class Main5{
    public static void main(String[]args){
        Engine e1=new Engine("xyz");
        battery b1= new battery(560);
        Car c1= new Car(e1,b1,"vi");
        System.out.println(c1);
        


    }
}
class Engine{
    private String name;
    Engine(String name){
        this.name=name;
    }
    public String toString(){
        return "Name: " +name;
    }
}
class battery{
    private int capacity;
    battery(int capacity){
        this.capacity=capacity;
    }
    public String toString(){
        return "capacity: " +capacity;
    }
}
class Car{
    private Engine e;
    private battery b;
    private String name;
    Car(Engine e,battery b,String name){
        this.e=e;
        this.b=b;
        this.name=name;

    }
    public String toString(){
        return e.toString() +"\n" +b.toString() +"\nname:" +name;  
    }
}
    
public class Main5{
    public static void main(String[]args){
        address a1=new address("mumbai",545544);
        course c1=new course("java",6);
        student s1=new student(a1,c1,"viraj");
        System.out.println(s1);

    }
}  
class address{
    private String city;
    private int pincode;
    address(String city,int pincode){
        this.city=city;
        this.pincode=pincode;
    }
    public String toString(){
        return "city:" +city +"\npincode:" +pincode;
    }


}
class course{
    private String name;
    private int duration;
    course(String name,int duration){
        this.name=name; 66
        this.duration=duration;

    }
    public String toString(){
        return "name:" +name +"\nduration:" +duration;
    }

}
class student{
    private address a;
    private course c;
    private String name;
    student(address a, course c,String name){
        this.a=a;
        this.c=c;
        this.name=name;
    }
    public String toString(){
        return "\nname:" +name +"\n"+ a.toString() +"\n" +c.toString()  ;
    }
}

//Encapsulation= controls the accress
public class Main5{
    public static void main(String[]args){
        account a1=new account(45000,"viraj");
        System.out.println(a1);
        a1.setname("zhb");
        System.out.println(a1);

        
        

    }
}
class account{
    private int balance;
    private String name;
    account(int balance,String name){
        this.balance=balance;
        this.name=name;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    public int  getbalance(){
        return balance;
    } 
    public String toString(){
        return "balance:" +balance +"name:" +name;
    }
}   
    
//Encapsulation + composition
public class Main5{
    public static void main(String[]args){
        account a1=new account(45000,"viraj");
        person p1=new person(a1,"bank of india00");
        System.out.println(a1);        //this both value directly print only the input value not cahnges will be made by user in the next line
        System.out.println(p1);   
        p1.setbankname("boi");  //this set the changes
        a1.setname("zhb");
        System.out.println(a1);           //  it will show you the chnagees in the output 
        System.out.println(p1);
    }
}
class account{
    private int balance;
    private String name;
    account(int balance,String name){
        this.balance=balance;
        this.name=name;1
        }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    public void setbalance(int balance){
        this.balance=balance;
    }
    public int  getbalance(){
        return balance;
    }
    public String toString(){
        return "balance:" +balance +"name:" +name;
    }
}   
class person{
    private account a;
    private String bankname;
    person(account a,String bankname ){
        this.a=a;
        this.bankname=bankname;
    }
    public void seta(account a){
        this.a=a;
    }
    public account geta(){
        return a;

    }
    public void setbankname(String bankname){
        this.bankname=bankname;
    }
    public String getbankname(){
        return bankname;
    }
    public String toString(){
        return a.toString() +"bankname:" +bankname;
    }

} 
 
// polymorphism = same thing , differnt forms
public class Main5{
    public static void main(String[]args){
        vehicle t1=new vehicle();
        vehicle v1=new car();
        vehicle v2=new bike();
        v1.s1();
        v2.s1();
        t1.s1();
        

    }
}
class vehicle{
    void s1(){
        System.out.println("vehicle start");
    }
}


class car extends vehicle{
     void s1(){
        System.out.println("car starts");

    }
}
class bike extends vehicle{
    void s1(){
        System.out.println("bike starts");
    }
}
   

//This is e.g of composition + inheritance + encapsulation + polymorphism
//understand who has what? who is what??
// first composition then inheritance then encapsulation then polymorphism


public class Main5{
    public static void main(String[]args){
        payment p1 = new payment(136);
        payment p2 = new payment(165);

        order o1 = new onlineorder(102,p2, "Pune");
        order o2 = new inorder(101,p1,5);

        System.out.println(o1);
        System.out.println(o2);     
    }
}   
class order{
    private payment p;
    private int orderid;
    

    order(int orderid, payment p){
        this.orderid = orderid;
        this.p = p;
    }

    public String toString(){
        return "Order ID: " + orderid +p.toString()  ;
    }
}  
class onlineorder extends order{
    private String delivery;

    onlineorder(int orderid, payment p, String delivery){
        super(orderid, p);
        this.delivery = delivery;
    }

    public String toString(){
        return super.toString() + "\nDelivery: " + delivery;
    }
}
class inorder extends order{
    private int tableorder;

    inorder(int orderid, payment p, int tableorder){
        super(orderid, p);
        this.tableorder = tableorder;
    }

    public String toString(){
        return super.toString() + "\nTable: " + tableorder;
    }
}
class payment{

    private int pay;
    payment(int pay){
    this.pay=pay;
    }
    public void setpay(int pay){
        this.pay=pay;
    }
    public int getpay(){
        return pay;
    }
    public String toString(){
        return "\npay:" +pay;
    }
}

public class Main5{
    public static void main(String[]args){
        driver r1=new driver("viraj",4.5);
        driver r2=new driver("xyz",5.6);
        ride b1=new bikeride(r1,156,true);
        ride b2=new carride(r2,123,"car");
        System.out.println(b1);
        System.out.println(b2);
    }
}
class driver{
    private String name;
    private double rating;  

    driver(String name,double rating){//
        this.name=name;
        this.rating=rating;
    }  
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }    
    public String toString(){
        return "\nname:" +name +"("+rating+")";
++    }
}
class ride{
    private driver d;
    private int id;
    ride(driver d,int id){
        this.d=d;
        this.id=id;
    }
    public void setid(int id){
        this.id=id;
    }
    public int getid(){
        return id;
    }
    public String toString(){
        return d.toString() +"\nriderid:" +id;
    }    
}
class bikeride extends ride{
    private boolean helmet;
    bikeride(driver d,int id,boolean helmet){
        super(d,id);
        this.helmet=helmet;
    }   
    public String toString(){
        return super.toString() +"\nhelmet:" +helmet;
    } 
}
class carride extends ride{
    private String ctype;
    carride(driver d,int id,String ctype){
        super(d,id);
        this.ctype=ctype;
    }   
    public String toString(){
        return super.toString() +"\ncartype:" +ctype;
    } 

}
*/
public class Main5{
    public static void main(String[]args){
        employee e1=new dev("viraj",152,15000,"java");
        employee e2=new manager("shubahm",152,46000,5);
        System.out.println(e1);
        e1.work();
        e1.setsalary(-5000);
        System.out.println(e2);
        e2.work();
        



    }
}
class employee{
    private String name;
    private int id;
    private int salary;
    employee(String name, int id, int salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void setname(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }public void setid(int id){
        this.id=id;

    }
    public int getid(){
        return id;
    }public void setsalary(int salary){
        if(salary<0){
            System.out.println("invalid salary");

        }else{
            this.salary=salary;
        }

    }
    public void work(){
        System.out.println("employee is working");
    }
    public String toString(){
        return "name:"+name +"\nid: "+id +"\nsalary:"+salary;
    }


}
class dev extends employee{
    private String lan;
    dev(String name, int id, int salary, String lan){
        super(name,id,salary);
        this.lan=lan;
    }
    public void setlan(String lan){
        this.lan=lan;
    }
    public String getlan(){
        return lan;

    }
    @Override
    public void work(){
        System.out.println("developer is writing code");
    }
    public String toString(){
        return super.toString() +"\nlan:" +lan;
    }


}
class manager extends employee{
    private int teams;
    manager(String name,int id,int salary,int teams){
        super(name,id,salary);
        this.teams=teams;

    }
    public void setteams(int teams){
        this.teams=teams;
    }
    public int getteams(){
        return teams;
    }
    @Override
    public void work(){
        System.out.println("manager is conduting  meeting");

    }
    public String toString(){
        return super.toString()+"\nteams sixe:"+teams;
    }
}
