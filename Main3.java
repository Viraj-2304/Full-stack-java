public class Main3{
    public static void main(String[]args){
        int x= 52; //numbers
        switch(x){
            case 1:
                System.out.println("x is 1");
                break ;
            case 2:
                System.out.println("x is 2");
                break ;
            case 3:
                System.out.println("x is 3");
                break;
              
            default:
                System.out.println("x is none other than 1,2,3");
                          
        }
         String y="VIRAJ";  // string 

         switch(y.toLowerCase()){
            case "viraj": 
            
                System.out.println("x is a");
                break ;
            case "B":
           
          
                System.out.println("x is b");
                break ;
            case "C":
           
                System.out.println("x is c");
                break;
              
            default:
                System.out.println("x is none other than a,b,c");
                          
        }
        char z ='n';  // character

         switch(Character.toUpperCase(z)){
            case 'A': 
            
                System.out.println("x is a");
                break ;
            case 'B':
           
          
                System.out.println("x is b");
                break ;
            case 'C':
           
                System.out.println("x is c");
                break;
              
            default:
                System.out.println("x is none other than a,b,c");
                          
        }
        for(int i=1;i<10;++i){ // in proper way
            System.out.println(i);
        }
        for(int i=10;i>1;i--){ //reverse
            System.out.println(i);
        }
        for(int i=1;i<50;++i){ // even or odd
            if(i%2==0){
                System.out.println(i+"even");
            }else{
                System.out.println(i+"odd");

            }
            
            
        }
        int i=1;   //while loop
        while(i<10){
            System.out.println("iteration:"+i);
            i++;
        }
  
        int b=1;  // do while loop
        do{
            System.out.println(b);
            b++;
        }while(b<10);

        for(int m=1,j=1;m<10 && j<10;m++,j++){ // for loop double  implementations
            System.out.println("value of i and j:"+m + ">>"+j);
        } 
        
        int p=1,l=1;   //while loop double implementation
        while(p<10 || l<10){
            System.out.println("iteration:"+p +"&" +l);
            p++;
            l++;
        }

        for(int d=1;d<10;d++){ // in proper way
            System.out.println("continue");
            if(d==5){
                continue;

            }   System.out.println(d);
         }


        int []f={1,2,3,4,56};   // for each loop
        for(int temp: f){
            System.out.println(temp);
        }
        
        for(int r=1;r<=10;r++){   //nested loop
            for(int h=1;h<=10;h++){
                System.out.println("the value of r: "+r +" and" +" the value of h : "+h);

            }
            System.out.println("****");
        }


int num    = 1234;      // Dsa level
int rev = 0;

while(num > 0){
    int digit = num % 10;        // get last digit
    rev = rev * 10 + digit;      // build reversed number
    num = num / 10;              // remove last digit
}

System.out.println("Reversed = " + rev);
       


        int t=2468;   //reverse of input
        while(true){
            System.out.println(t%10);
            t=t/10;
            if(t<1){
                break;
            }
        }
        int k1=5678;  // without if reverse 
        while(k1>0){
            System.out.println(k1%10);
            k1=k1/10;

        }



        int d=1249644; //sum of digit (with if)
        int sumOfDigits= 0;
        while(true){
            sumOfDigits =sumOfDigits + (d%10);
            d=d/10;
            if(d<1){
                break; 
            }
        }System.out.println("sum of digit:"+sumOfDigits);

        int d1=1249644; //sum of digit (without if)
        int sumOfDigits1= 0;
        while(d1>0){
            sumOfDigits1 =sumOfDigits1 + (d1%10);
            d1=d1/10;
            
        }System.out.println("sum of digit:"+sumOfDigits1);




        for (int s = 10;s>1;--s){   // reverse number 
            System.out.println(s);
        }
        for (int e = 10;e>=1;--e){  // even numbers
            if(e%2==0){
                System.out.println(+e +" is even");
            }
        }
        int n1=74664;
        int count=0;
        while(n1>0){
            n1=n1/10;
            count++;
        }System.out.println("count of numbers is:" +count);
       }
}
public class Main{
    public static void main(String[]args) {
        String product="laptop";
        int quantity = 3;
        double prize=50000;
        double totalprice=quantity*prize;
        if (product.equals("laptop") &&  quantity > 0) {
            System.out.println("ordr palced");
        } else {
            System.out.println("out of stock");
        }
        System.out.println("total prize="+quantity*prize);
        if(totalprice>=100000){
            System.out.println("free delivery");

        }else{
            System.out.println("extra charges "+500);
        }

    }
}



