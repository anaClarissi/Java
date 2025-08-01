class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        try {
            switch (operation) {
                case "+":
                    return operand1 + " " + operation + " " + operand2 + " = " + (operand1 + operand2);

                case "*":
                    return operand1 + " " + operation + " " + operand2 + " = " + (operand1 * operand2);

                case "/":
                    return operand1 + " " + operation + " " + operand2 + " = " + (operand1 / operand2);

                default:
                    if (operation.equals("")) {
                        throw new IllegalArgumentException("Operation cannot be empty");
                    } else {
                        throw new IllegalOperationException("Operation '" + operation + "' does not exist");
                    }
            }
        }
        catch (NullPointerException e){
            throw new IllegalArgumentException("Operation cannot be null");
        }
        catch (ArithmeticException e){
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }

    }

}
