public class QUESTAO05 {   
        public static void main(String[] args) {
            int primeiroTermo = 0;
            int segundoTermo = 1;
    
            while (primeiroTermo <= 100) {
                System.out.print(primeiroTermo + ", ");
    
                int somaDosDoisTermos = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = somaDosDoisTermos;
            }
        }
    
}
