public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Вычисление с помощью класса Calculator:\nРезультат возведение числа: "
                + calculator.newFormula().
                addOperand(2).
                addOperand(10).
                calculate(Calculator.Operation.POW)
                .result());

        System.out.println();
        Ints intsCalc = new IntsCalculator(new Calculator());
        System.out.println("Вычисления с помощью класса-адаптера IntsCalculator: ");
        System.out.println("Результат суммы: " + intsCalc.sum(2, 2));
        System.out.println("Результат суммы: " + intsCalc.sum(10, 22));
        System.out.println("Результат умножения: " + intsCalc.mult(3, 3));
        System.out.println("Результат возведения числа: " + intsCalc.pow(2, 10));
        System.out.println("Результат деления: " + intsCalc.div(9, 3));
        System.out.println("Результат вычитания: " + intsCalc.sub(10, 5));
    }
}
