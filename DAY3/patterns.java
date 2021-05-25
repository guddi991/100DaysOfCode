public class patterns{
    public static void main(String[] args) {
         for(int i=1;i<=5;i++){ 
            for(int j=1;j<=5;j++){ 
                System.out.print(" * "); 
            } 
            System.out.println(" "); 
        } 
    } 
}

//<--------------- Labeled break statement----------------------->//

public static void main(String[] args) {
    GUDDI:
     for(int i=1;i<=6;i++){ 
        for(int j=1;j<=7;j++){ 
            if(i==3)
              break GUDDI;
            System.out.print(" * "); 
        } 
        System.out.println(" "); 
    } 
} 






    