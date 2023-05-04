public class Main {
    public static void main(String[] args) {
        // cria uma instância da classe Calculadora
        Calculator calc = new Calculator();
        
        // chama os métodos de soma e multiplicação
        int resultadoSoma = calc.sum(5, 3);
        int resultadoMult = calc.multiplication(5, 3);
        
        // imprime os resultados
        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da multiplicação: " + resultadoMult);
    }
}