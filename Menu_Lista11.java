import java.util.Scanner;

public class Menu_Lista11 {
    public static void main (String args[]) {

        Calculadora_Lista11 calculo = new Calculadora_Lista11();

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        String opcao2;

        do {
            do {
         System.out.println("Bem-vindo! Escolha sua operação: \n 1 - Adição | 2 - Subtração | 3 - Multiplicação | 4 - Divisão | 5 - Potenciação | 6 - Raiz");
        opcao = scanner.nextInt();
       
        switch (opcao) {
            
            case 1:
            calculo.adicao();
            break;

            case 2:
            calculo.subtracao();
            break;

            case 3:
            calculo.multiplicacao();
            break;

            case 4:
            calculo.divisao();
            break;

            case 5:
            calculo.potenciacao();
            break;

            case 6:
            calculo.raiz();
            break;

            default:
            System.out.println("Opção inválida. Selecione novamente.");
            break;}} while (opcao > 6 || opcao < 1);

        System.out.println("Deseja realizar outra operação? S | N");
        opcao2 = scanner.next();}
        
        while (opcao2.equalsIgnoreCase("S"));
    
}  }