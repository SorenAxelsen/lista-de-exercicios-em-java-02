public class atividade06 {
    private String nome;
    private int idade;

    
    public atividade06(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    public atividade06(String nome) {
        this(nome, 0); 
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
}

class Estudante extends atividade06 {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
        this.curso = curso;
    }

    
    public Estudante(String nome, String curso) {
        super(nome);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        atividade06 pessoa1 = new atividade06("João", 30);
        pessoa1.exibirInformacoes();

        atividade06 pessoa2 = new atividade06("Maria");
        pessoa2.exibirInformacoes();

        Estudante estudante1 = new Estudante("Ana", 22, "Engenharia");
        estudante1.exibirInformacoes();

        Estudante estudante2 = new Estudante("Carlos", 28, "Medicina");
        estudante2.exibirInformacoes();
    }
}
