//Diseña una librería en java que me permita operar un trinomio cuadrado perfecto

public class PerfectSquareTrinomial {

    private int a;
    private int b;
    private int c;

    public PerfectSquareTrinomial(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean isPerfectSquare() {
        int discriminant = b * b - 4 * a * c;
        return discriminant >= 0 && (Math.sqrt(discriminant) % 1 == 0);
    }

    public int getRoot() {
        if (!isPerfectSquare()) {
            throw new IllegalStateException("The trinomial is not a perfect square.");
        }
        int discriminant = b * b - 4 * a * c;
        int sqrtDiscriminant = (int) Math.sqrt(discriminant);
        return (sqrtDiscriminant + Math.abs(b)) / (2 * a);
    }

}

public class Main {

    public static void main(String[] args) {
        PerfectSquareTrinomial pst = new PerfectSquareTrinomial(1, 10, 25);
        System.out.println("Is perfect square: " + pst.isPerfectSquare());
        System.out.println("Root: " + pst.getRoot());
    }

}