import java.util.Scanner; 
 
public class App { 
    public static void main(String[] args) { 
 
        System.out.println("Quantos graus:"); 
         
        Scanner s = new Scanner(System.in); 
        double graus= s.nextInt(); 
 
        System.out.println("A conversao de Graus para Fahrenhel:" +  (graus * 1.8) + 32); 
    }  
 
 
 
}