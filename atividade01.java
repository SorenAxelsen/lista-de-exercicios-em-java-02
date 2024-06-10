public class atividade01 {
    
    private String nome;
    private int idade;

    
    public atividade01(String nome, int idade) {
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

        public static void main(String[] args) {
        
        atividade01 pessoa = new atividade01("João", 30);

        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());

        
        pessoa.setNome("Maria");
        pessoa.setIdade(25);

        
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
    }
}
