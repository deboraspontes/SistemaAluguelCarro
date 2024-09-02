import java.util.ArrayList;
import java.util.List;

public class Frota {
    private List<Carro> carros;

    public Frota() {
        this.carros = new ArrayList<>();
    }
    public void adicionarCarro (Carro carro) {
        carros.add(carro);
    }
    public int listarCarrosDisponiveis () {
        int disponiveis=0;
        for (Carro carro : carros) {
            if (carro.isDisponivel()){
                disponiveis++;

            }
        }
        return disponiveis;
    }

    public void exibirTotalCarros () {
        System.out.println("Total de carros criados "+ Carro.getTotalCarros());
    }
}

