public class QUESTAO09 {
    public static void main(String[] args) {

        System.out.print("Digite o seu salario: ");
        double salario_atual = 200;
        double percentual;
        double aumento;
        double novoSalario;

        if (salario_atual <= 280.00) {
            percentual = 20;
        } else if (salario_atual <= 700.00) {
            percentual = 15;
        } else if (salario_atual <= 1500.00) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        aumento = salario_atual * (percentual / 100);
        novoSalario = salario_atual + aumento;

        System.out.println("Salário antes do reajuste: " + salario_atual);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do aumento: " + aumento);
        System.out.println("Novo salário após o aumento: R$" + novoSalario);

    }
}
