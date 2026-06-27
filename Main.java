public class Main{
    public static void main(String[]args){
        mobile s1=new mobile();
        s1.setbrand("samsung");
        s1.setprize(25000);
        s1.setstorage(32);
        System.out.println(s1.getbrand());
        System.out.println(s1.getprize());
        System.out.println(s1.getstorage());
        s1.call();
        s1.camera();
        s1.charge();
        s1.marks=100;
        System.out.println(s1.marks);

    }
}
class mobile{
    private String brand;
    private int prize;
    private int storage;
    public int marks;

    public void setbrand(String brand){
        this.brand=brand;
    }
    public String getbrand(){
        return brand;
    }
    public void setprize(int prize){
        this.prize=prize;
    }
    public int getprize(){
        return prize;
    }
    public void setstorage(int storage){
        this.storage=storage;
    }
    public int getstorage(){
        return storage;
    }
    public void call(){
        System.out.println(brand+"  is calling");
    }
    public void charge(){
        System.out.println(brand+" is charging");

    }public void  camera(){
        System.out.println(brand+" camera opend" );
    }


}