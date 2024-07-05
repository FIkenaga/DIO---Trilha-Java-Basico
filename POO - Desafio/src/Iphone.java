public class Iphone implements ReprodutorMusical, AparelhoCelular, NavegadorInternet {

    @Override
    public void ligar() {
        System.out.println("Fazendo Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Ligação Atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando Página Web");
    }

    @Override
    public void tocar() {
        System.out.println("Musica Iniciada");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música Selecionada.");
    }
}