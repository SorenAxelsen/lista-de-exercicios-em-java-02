public class atividade05_2 extends atividade05_1 {
    private double bonus;

    public atividade05_2(double salario, String departamento, double bonus) {
        super(salario, departamento);
        this.bonus = bonus;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Bônus: " + bonus);
    }

    public static void main(String[] args) {
        atividade05_1 funcionario = new atividade05_1(3000, "TI");
        funcionario.exibirInformacoes();

        atividade05_2 gerente = new atividade05_2(5000, "Administração", 1000);
        gerente.exibirInformacoes();
    }
}