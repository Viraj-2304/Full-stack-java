/* 
//E.X 1
public class InnerClass{
    public static void main(String[]args){
        university u=new university();
        university.department v1=u.new department();
        v1.uname();


    }
}
class university{
    private String uname="iit bombay";

    class department{
        private String dept="Computer science";
        void uname(){
            
            System.out.println(uname);
            System.out.println(dept);
        }


    }

}

//E.X 2
public class InnerClass{
    public static void main(String[]args){
        laptop l1=new laptop();
        laptop.keyboard v1=l1.new keyboard();
        v1.show();
    
    }
}

class laptop{
    private String brand="asus";
    private String model="A15";
    class keyboard{
        private String type="mechnicak";
        void show(){
            System.out.println("brand:"+brand);
            System.out.println("model:"+model);
            System.out.println("keyboardd:"+type);
        }
    }

}
*/
public class InnerClass{
    public static void main(String[]args){
        bank b1=new bank();
        bank.atm a1=b1.new atm();
        a1.show();

    }

}
class bank{
    private String bname="state bank of india";
    private String branch="mumbai";

    class atm{
        private int id=101;
        void show(){
            System.out.println("bankname:"+bname);
            System.out.println("branch:"+branch);
            System.out.println("id:"+id);
        }

    }
        

}
   