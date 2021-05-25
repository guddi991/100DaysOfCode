public class Ternary_operator{
     public static void main(String[] args) {
         int i = 3;
         int j = 5;
         j = i==3?6:7;
         if(i==5){
             System.out.println(i);
         }
         else{
             System.out.println("i is not equal to 5");
         }
         System.out.println("      Ternary operator"+j);
        
    }
}