public class QUESTAO08 {
    public static void main(String[] args){
        int n = 4; 
        
        // Loop para iterar pelas linhas
        for (int i = 1; i <= n; i++) {
            // Loop para imprimir os valores de cada linha
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " "); // Calcula e imprime o valor
            }
            System.out.println(); // Muda para a próxima linha após cada linha da tabela
        }
    }
}
