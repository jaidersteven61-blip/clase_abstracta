public class App {
    public static void main() {
        polimorfismo(new Rectangulo("Rectangulo", 5, 10));
        polimorfismo(new Cuadrado("Cuadrado", 5));
        polimorfismo(new Circulo("Circulo", 5));
        polimorfismo(new Trapecio("Trapecio", 10, 5, 8));
        polimorfismo(new Triangulo("Triangulo", 5, 10));

    }

    public static void polimorfismo(Figura mifigura) {
        System.out.println("El area de la figura " + mifigura.getTipo() + " es: " + mifigura.area());
    }

}