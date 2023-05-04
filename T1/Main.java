public class Main {
    public static void main(String[] args) {
        // cria uma instância da classe Calculadora
        Calculator calc = new Calculator();
        
        // chama os métodos de soma e multiplicação
        double resultadoSoma = calc.sum(5, 3);
        double resultadoMult = calc.multiplication(5, 3);
        double resultadoPow = calc.pow(5, 2);
        int resultadoFat = calc.fatorial(2);
        
        // imprime os resultados
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da multiplicação: " + resultadoMult);
        System.out.println("Resultado da potenciação: " + resultadoPow);
        System.out.println("Resultado do fatorial: " + resultadoFat);
    }
}