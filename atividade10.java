import java.util.ArrayList;
import java.util.List;


abstract class Veiculo {
    
    public abstract void mover();
}


class Carro extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Carro se moveu na estrada.");
    }
}


class Moto extends Veiculo {
    @Override
    public void mover() {
        System.out.println("Moto se moveu na rodovia.");
    }
}

public class atividade10 {
    public static void main(String[] args) {
        
        List<Veiculo> veiculos = new ArrayList<>();

        
        veiculos.add(new Carro());
        veiculos.add(new Moto());

        
        for (Veiculo veiculo : veiculos) {
            veiculo.mover();
        }
    }
}

