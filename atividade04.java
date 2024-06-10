public class atividade04 {
    private String nome;
    private int idade;

    public atividade04(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public static void main(String[] args) {
        atividade04 pessoa = new atividade04("João", 30);
        pessoa.exibirInformacoes();
        pessoa.setNome("Maria");
        pessoa.setIdade(25);
        pessoa.exibirInformacoes();
    }
}

class Estudante extends atividade04 {
    private String curso;

    public Estudante(String nome, int idade, String curso) {
        super(nome, idade);
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
        Estudante estudante = new Estudante("Ana", 22, "Engenharia");
        estudante.exibirInformacoes();
        estudante.setNome("Carlos");
        estudante.setIdade(23);
        estudante.setCurso("Medicina");
        estudante.exibirInformacoes();
    }
}
