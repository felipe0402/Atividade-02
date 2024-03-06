import java.util.Scanner; 
 
public class App { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);

        //Exibir as opçoes para o usuario
        System.out.println("Escolha uma opção");
        System.out.println("1. Coverter celsius para fahrenheit" );
        System.out.println("2. Coverter celsius para Kelvin ");
        System.out.println("3. Coverter fahrenheit para celsius");
        System.out.print("Opçao:");

        // Ler a opção escolhida pelo usuário
         int opcao =s.nextInt();
       
        // Realizar a ação correspondente à opção escolhida
       if (opcao == 1){
        System.out.println("Valor celsius:" );
        double celsius= s.nextInt();
        System.out.println("Conversão de celsius para Fahrenhel:" +  ((celsius * 1.8) + 32));

       } else if  (opcao == 2){
        System.out.println("Valor celsius:" );
        double Kelvin= s.nextInt();
        System.out.println("Cconversão de celsius para Kelvin:" + (Kelvin + 273.15));

       } else if  (opcao == 3){
        System.out.println("Valor Fahrenhel:" );
        double fahrenhel= s.nextInt();
        System.out.println("Conversão de Fahrenhel para celsius:" + ((fahrenhel - 32) /1.8));
      
       }
        else {
        System.out.println("Opcao invalida ");
       };
    }
}