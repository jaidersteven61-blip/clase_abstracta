public class Circulo extends Figura {
    private int radio;

    public Circulo(String tipo, int radio) {
        super(tipo);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.getRadio(), 2);
    }
}
