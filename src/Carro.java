public class Carro {
    private String placa;
    private String modelo;
    private int ano;
    private boolean disponivel;
    private static int totalCarros = 0;

    public Carro(String placa, String modelo, int ano, boolean disponivel) {
        this.placa = placa;
        this.modelo = modelo;
        setAno(ano);
        this.disponivel = disponivel;
        totalCarros++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public static int getTotalCarros() {
        return totalCarros;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano > 1900) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano precisa ser maior que 1900.");
        }
    }

    private void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    public void alugar () {
        if(this.disponivel == true){
            this.disponivel = false;
            System.out.print("Você alugou o carro com sucesso.\n");
        } else {
            System.out.print("O carro já está alugado.\n");
        }
    }
    public void devolver () {
        if(this.disponivel == false){
            this.disponivel = true;
            System.out.print("Carro devolvido com sucesso.\n");
        } else {
            System.out.print("O carro já foi devolvido.\n");
        }
    }
}

