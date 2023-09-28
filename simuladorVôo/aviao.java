package simuladorVôo;

public class aviao {
    private String numSerie;
    int altitude;
    double velocidade;

    public aviao(String numSerie) {
        this.numSerie = numSerie;
    }

    public void reduzirAltitude(int valor) {
        this.altitude = getAltitude() - valor;
    }

    public void reduziVelocidade(double valor) {
        this.velocidade = getVelocidade() - valor;
    }

    public void imprimeAtributos() {
        System.out.println("Altitude: " + getAltitude());
        System.out.println("Velocidade: " + getVelocidade());
    }

    public int getAltitude() {
        return altitude;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
