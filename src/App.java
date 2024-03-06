import java.util.Scanner; 
 
public class App { 
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in);

        //Exibir as opçoes para o usuario
        System.out.println("Escolha uma opção");
        System.out.println("1. Coverter celsius para fahrenheit" );
        System.out.println("2. Coverter fahrenheit para celsius");
        System.out.print("Opçao:");

        // Ler a opção escolhida pelo usuário
         int opcao =s.nextInt();
       
        // Realizar a ação correspondente à opção escolhida
       if (opcao == 1){
        System.out.println("Valor celsius:" );
        double celsius= s.nextInt();
        System.out.println("A conversão de Graus para Fahrenhel:" +  ((celsius * 1.8) + 32));
       } else if  (opcao == 2){
        System.out.println("Valor Fahrenhel:" );
        double fahrenhel= s.nextInt();
        System.out.println("A conversão de Graus para Fahrenhel:" + ((fahrenhel - 32) /1.8));
       } else {
        System.out.println("Opção invalida ");
       };
    };
};