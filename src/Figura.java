public abstract class Figura {
    private String tipo;
    public Figura(String tipo) {
        this.tipo = tipo;
    }

    //getters and setters
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //abstract methods
    public abstract double area();
}