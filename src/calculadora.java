import java.util.*;

/**
 * Classe Calculadora que proporciona operacions bàsiques de càlcul.
 * <p>
 * Aquesta classe permet realitzar sumes, restes, multiplicacions i divisions
 * de nombres enters.
 * </p>
 * @version 1.0
 * @since 2024-06-07
 */
public class Calculadora {

    /**
     * Suma dos nombres enters.
     * 
     * @param a El primer nombre enter.
     * @param b El segon nombre enter.
     * @return La suma de a i b.
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Resta dos nombres enters.
     * 
     * @param a El primer nombre enter.
     * @param b El segon nombre enter.
     * @return La resta de b de a.
     */
    public int resta(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dos nombres enters.
     * 
     * @param a El primer nombre enter.
     * @param b El segon nombre enter.
     * @return El producte de a i b.
     */
    public int multiplica(int a, int b) {
        return a * b;
    }

    /**
     * Divideix dos nombres enters.
     * 
     * @param a El primer nombre enter.
     * @param b El segon nombre enter.
     * @return El quocient de a dividit per b.
     * @throws ArithmeticException si b és 0.
     */
    public int divideix(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("No es pot dividir per zero.");
        }
        return a / b;
    }

    /**
     * Punt d'entrada per a l'execució de la calculadora.
     * 
     * @param args Arguments de la línia de comandes (no s'utilitzen).
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Suma: " + calc.suma(5, 3));
        System.out.println("Resta: " + calc.resta(5, 3));
        System.out.println("Multiplicació: " + calc.multiplica(5, 3));
        System.out.println("Divisió: " + calc.divideix(5, 3));
    }
}

