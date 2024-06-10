public class atividade02 {
    private String nome;
    private int idade;

    public atividade02(String nome, int idade) {
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
        atividade02 pessoa = new atividade02("João", 30);

        pessoa.exibirInformacoes();

        pessoa.setNome("Maria");
        pessoa.setIdade(25);

        pessoa.exibirInformacoes();
    }
}
