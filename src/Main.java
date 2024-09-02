public class Main {
    public static void main (String [] args) {
        Frota frota = new Frota();

        Carro carro1 = new Carro("EFGH4567", "Onix", 2013, true);
        Carro carro2 = new Carro("EFGH4568", "Onix", 1901, true);

        frota.adicionarCarro(carro1);
        frota.adicionarCarro(carro2);

        frota.exibirTotalCarros();
        frota.listarCarrosDisponiveis();

        carro1.alugar();
        carro1.alugar();
        carro2.alugar();
        frota.listarCarrosDisponiveis();

        carro1.devolver();
        carro2.devolver();
        frota.listarCarrosDisponiveis();
    }
}
