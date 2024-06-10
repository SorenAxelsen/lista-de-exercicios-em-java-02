
interface Trabalhador {
    void trabalhar();
}


class Funcionario implements Trabalhador {
    protected double salario;
    protected String departamento;

    public Funcionario(double salario, String departamento) {
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
}


class Gerente extends Funcionario {
    private double bonus;

    public Gerente(double salario, String departamento, double bonus) {
        super(salario, departamento);
        this.bonus = bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente está trabalhando. Bônus: " + bonus);
    }
}


class Empresa {
    public void adicionarTrabalhador(Trabalhador trabalhador) {
        trabalhador.trabalhar();
    }
}

public class atividade08 {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        
        Funcionario funcionario = new Funcionario(3000, "TI");
        Gerente gerente = new Gerente(5000, "Administração", 1000);

        
        empresa.adicionarTrabalhador(funcionario);
        empresa.adicionarTrabalhador(gerente);
    }
}
