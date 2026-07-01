public class Main2 {
    public static void main(String[] args){
        int x=10;

        // for postfix and prefix
        System.out.println(++x);
        System.out.println(x);

        //for decision making operator

        if(x!=9) {
            System.out.println("x is  not equal to 8");
        }else{
            System.out.println("x is qual to 8");

        }
        if(x<=10) {
            System.out.println("x is  greater than or equal to 8");
        }else{
            System.out.println("x is not greater than  or equal to 8");

        }
        boolean v1 =true;
        boolean v2= false;
        if(v1 && v2 ) {
            System.out.println("  true");
        }else{
            System.out.println("  false");

        }
        int boy= 65;
        int girl =23;
        if( (boy>21) || (girl <21)){
            System.out.println("they can do marry");
        }else{
            System.out.println("they cant do marry");
        }
//        for assignment operator
        float  m1= 4;
        m1 *=5 ;
        m1-= 6;
        m1+=1;
        m1/=2;
        System.out.println(m1);

//       Making decision with Else if
        int k = 6;
        if(k== 10){
            System.out.println("k is 10");
        }else if (k>10){
            System.out.println("k is greater than 10");

        }else{
            System.out.println("k is lesser tahn 10");

        }
        int g= 11;
        String result = (g==10)?"result is 10":"result is not 10";
        System.out.println(result);
        int marks =  32;
        if(marks>=90){
            System.out.println("A");

        }else if(marks>=75){
            System.out.println("B");

        }else if(marks>=60) {
            System.out.println("C)");


        }else{
            System.out.println("fail");

        }
        int a = 10;
        int b = 10;
        int c = 10;

        if(a>b && a>c){
            System.out.println("a is largets ");

        }else if(b>c && b>a){
            System.out.println("b is largest");

        }else if (c>a && c>b) {
            System.out.println("c largest");

        }else{
            System.out.println("all numbers aee equal");
        }



    }
}