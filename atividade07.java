
interface Trabalhador {
    void trabalhar();
}


class atividade07 implements Trabalhador {
    protected double salario;
    protected String departamento;

    public atividade07(double salario, String departamento) {
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirInformacoes() {
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }

    @Override
    public void trabalhar() {
        System.out.println("Funcionário está trabalhando.");
    }

    public static void main(String[] args) {
        atividade07 funcionario = new atividade07(3000, "TI");
        funcionario.trabalhar();
    }
}


class Gerente extends atividade07 {
    private double bonus;

    public Gerente(double salario, String departamento, double bonus) {
        super(salario, departamento);
        this.bonus = bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente está trabalhando.");
    }

    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public static void main(String[] args) {
        Gerente gerente = new Gerente(5000, "Administração", 1000);
        gerente.trabalhar();
    }
}
