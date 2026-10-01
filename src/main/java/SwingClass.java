import javax.swing.*;
import java.awt.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class SwingClass {

    public  static void main(String[] args) {

        //Calculation Logic
        StringBuilder calculation = new StringBuilder();
        boolean[] justCalculated = {false};

        //Frame
        JFrame frame = new JFrame();

        //Panels
        JPanel resultPanel = new JPanel();
        JPanel inputPanel = new JPanel();

        //Result Panel objects
        JLabel result = new JLabel("");

        resultPanel.add(result);

        //Input panel objects
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton nine = new JButton("9");
        JButton zero = new JButton("0");

        JButton add = new JButton("+");
        JButton subtract = new JButton("-");
        JButton multiply = new JButton("*");
        JButton divide = new JButton("/");

        JButton equal = new JButton("=");

        addButtonAction(one, "1", calculation, result, justCalculated);
        addButtonAction(two, "2", calculation, result, justCalculated);
        addButtonAction(three, "3", calculation, result, justCalculated);
        addButtonAction(four, "4", calculation, result, justCalculated);
        addButtonAction(five, "5", calculation, result, justCalculated);
        addButtonAction(six, "6", calculation, result, justCalculated);
        addButtonAction(seven, "7", calculation, result, justCalculated);
        addButtonAction(eight, "8", calculation, result, justCalculated);
        addButtonAction(nine, "9", calculation, result, justCalculated);
        addButtonAction(zero, "0", calculation, result, justCalculated);

        addButtonAction(add, "+", calculation, result, justCalculated);
        addButtonAction(subtract, "-", calculation, result, justCalculated);
        addButtonAction(multiply, "*", calculation, result, justCalculated);
        addButtonAction(divide, "/", calculation, result, justCalculated);

        equal.addActionListener(e -> {
            try {
                Expression expression = new ExpressionBuilder(calculation.toString()).build();

                double answer = expression.evaluate();

                result.setText(String.valueOf(answer));

                calculation.setLength(0);
                calculation.append(answer);

                justCalculated[0] = true;

            } catch (Exception ex) {
                result.setText("Invalid expression");
                calculation.setLength(0);
            }
        });

        inputPanel.add(one);
        inputPanel.add(two);
        inputPanel.add(three);
        inputPanel.add(four);
        inputPanel.add(five);
        inputPanel.add(six);
        inputPanel.add(seven);
        inputPanel.add(eight);
        inputPanel.add(nine);
        inputPanel.add(zero);

        inputPanel.add(add);
        inputPanel.add(subtract);
        inputPanel.add(multiply);
        inputPanel.add(divide);

        inputPanel.add(equal);

        inputPanel.setLayout(new GridLayout(5,3));

        //Frame settings

        frame.setSize(400,400);
        frame.setLayout(new GridLayout(2, 1));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(resultPanel);
        frame.add(inputPanel);
        frame.setVisible(true);
    }

    //Method to add button values

    private static void addButtonAction(
            JButton button, String value,
            StringBuilder calculation, JLabel result,
            boolean[] justCalculated) {

        button.addActionListener(e -> {

            if (justCalculated[0] && value.matches("\\d")) {
                calculation.setLength(0);
            }

            justCalculated[0] = false;

            calculation.append(value);
            result.setText(calculation.toString());
        });
    }
}
