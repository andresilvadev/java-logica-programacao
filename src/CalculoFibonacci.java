
public class CalculoFibonacci {
	
	static long fibonacci(int n) {
        int atual = 0;     // atual
        int anterior = 0;   // anterior
 
        for (int i = 1; i <= n; i++) {
 
            if (i == 1) {
            	atual = 1;
                anterior = 0;
            } else {
            	atual += anterior;
            	anterior = atual - anterior;
            }
 
        }
 
        return atual;
    }
 
    public static void main(String[] args) {
 
	// teste do programa. Imprime os 30 primeiros termos
        for (int i = 0; i < 30; i++) {
            System.out.print("(" + i + "):" + CalculoFibonacci.fibonacci(i) + "\t");
        }
 
    }

}
