
public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void avançarCanal(int canal) {
        this.canal++;
    }

    public void recuarCanal(int canal) {
        this.canal--;
    }

    public void escolherCanal(int canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

}
