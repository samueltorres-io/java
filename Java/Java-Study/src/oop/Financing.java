package oop;

public class Financing {

    public double totalValue;
    public double downPayment;
    public int installments;

    public Financing(double totalValue, double downPayment, int installments) {
        if (downPayment < totalValue * 0.2) {
            throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total!");
        } else if (installments < 6) {
            throw new RuntimeException("A quantidade de parcelas deve ser maior do que 6!");
        }

        this.totalValue = totalValue;
        this.downPayment = downPayment;
        this.installments = installments;

    }

    public double provision() {
        return (totalValue - downPayment) / installments;
    }

}
