package simuladorVôo;

public class game {
    public static void main(String[] args) {
    aviao boing = new aviao("0015879");

    boing.setAltitude(10);
    boing.setVelocidade(900);
    boing.imprimeAtributos();
    System.out.println("==============");

    boing.reduziVelocidade(100);
    boing.reduzirAltitude(1);
    boing.imprimeAtributos();
    System.out.println("==============");

    boing.reduziVelocidade(200);
    boing.reduzirAltitude(10);
    boing.imprimeAtributos();
    }
    
}
