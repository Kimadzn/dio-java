// Classe SmartTv representa o molde para criar objetos do tipo SmartTv
public class SmartTv {
    // Atributos da classe SmartTv
    boolean ligada = false; // Indica se a TV está ligada ou desligada
    int canal = 1; // Canal atual da TV
    int volume = 10; // Volume atual da TV

    // Método para ligar a TV
    public void ligar() {
        ligada = true; // Define o estado da TV como ligada
    }

    public void desligar(){
        ligada = false;
    }

    public void setCanal(int novoCanal) {
        canal = novoCanal;
    }

    // Método principal (método estático) que será executado quando o programa for iniciado
    public static void main(String[] args) {
        // Criando um objeto do tipo SmartTv chamado minhaTv
        SmartTv minhaTv = new SmartTv();

        // Ligando a TV utilizando o método ligar() da classe SmartTv
        minhaTv.ligar();

        minhaTv.setCanal(13);
        // Exibindo informações sobre a TV após ligá-la
        System.out.println("A TV ligada? " + minhaTv.ligada); // Exibe se a TV está ligada
        minhaTv.desligar();
        System.out.println("A TV ligada? ATT " + minhaTv.ligada); // Exibe se a TV está ligada
        System.out.println("Canal: " + minhaTv.canal); // Exibe o canal atual da TV
        System.out.println("Volume: " + minhaTv.volume); // Exibe o volume atual da TV
    }
}
