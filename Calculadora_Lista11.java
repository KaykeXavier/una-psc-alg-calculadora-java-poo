import java.util.Scanner;

public class Calculadora_Lista11 {

    Scanner scanner = new Scanner(System.in);

    public void adicao() {

    
        System.out.println("Digite o numero 1: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o numero 2: ");
        double numero2 = scanner.nextDouble();

        double soma = numero1 + numero2;

        System.out.println("A soma dos numeros informados é: " + soma);}

    public void subtracao() {

        System.out.println("Digite o numero 1: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o numero 2: ");
        double numero2 = scanner.nextDouble();

        double sub = numero1 - numero2;

        System.out.println("A subtração dos numeros informados é: " + sub);}

    public void multiplicacao() {

        System.out.println("Digite o numero 1: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o numero 2: ");
        double numero2 = scanner.nextDouble();

        double mult = numero1 * numero2;

        System.out.println("A multiplicação dos numeros informados é: " + mult);}

    public void divisao() {

        System.out.println("Digite o numero 1: ");
        double numero1 = scanner.nextDouble();
        double numero2;
        do {
        System.out.println("Digite o numero 2: ");
        numero2 = scanner.nextDouble();
        if (numero2 == 0) {
            System.out.println("Divisão por zero não existe. Digite um número que não seja 0.");
        } } while (numero2 == 0);

        double div = numero1 / numero2;

        System.out.println("A divisão dos numeros informados é: " + div);}

    public void potenciacao() {

        System.out.println("Digite a base: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o expoente: ");
        double numero2 = scanner.nextDouble();

        double pot = Math.pow(numero1, numero2);

        System.out.println("A potenciação dos numeros informados é: " + pot);}

    public void raiz() {

        double numero1;
        do {
        System.out.println("Digite o numero: ");
        numero1 = scanner.nextDouble();
        if (numero1 < 0) {
            System.out.println("Raiz de numero negativo não existe. Digite um número que não seja negativo.");
        } } while (numero1 < 0);

        double raizz = Math.sqrt(numero1);

        System.out.println("A raiz quadrada do numero informado é: " + raizz);}


    }