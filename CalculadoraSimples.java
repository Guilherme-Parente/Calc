//Herança: CalculadoraSimples estendendo Calculadora
public class CalculadoraSimples implements Calculadora {
    private double numero1, numero2;

    //construtor: permitir inicializar as variaveis
    public CalculadoraSimples(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Getters
    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    // Implementação concreta dos métodos definidos na interface
    @Override
    public double somar() {
        return getNumero1() + getNumero2();
    }

    @Override
    public double subtrair() {
        return numero1 - numero2;
    }

    @Override
    public double multiplicar() {
        return numero1 * numero2;
    }

    @Override
    public double dividir() {
        if (numero2 == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        return numero1 / numero2;
    }
}
