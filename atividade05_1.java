public class atividade05_1 {
    protected double salario;
    protected String departamento;

    public atividade05_1(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}


