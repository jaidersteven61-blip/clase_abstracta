public class Trapecio extends Figura {
    private int baseMayor, baseMenor, altura;

    public Trapecio(String tipo, int baseMayor, int baseMenor, int altura) {
        super(tipo);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    //getters and setters
    public int getBaseMayor() {
        return baseMayor;
    }
    public void setBaseMayor(int baseMayor) {
        this.baseMayor = baseMayor;
    }
    public int getBaseMenor() {
        return baseMenor;
    }
    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (double)((this.getBaseMayor() + this.getBaseMenor()) * this.getAltura()) / 2;
    }
    
}
