public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 30;

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarVolume(int Clicks) {
        volume = volume + Clicks;
    }

    public void diminuirVolume(int Clicks) {
        volume = volume - Clicks;
    }

    public void ligar() {
        ligada=true;
    }

    public void desligar() {
        ligada=false;
    }
}
