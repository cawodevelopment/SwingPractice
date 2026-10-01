import javax.swing.*;
import java.awt.*;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class SwingClass {

    public  static void main(String[] args) {

        //Frame
        JFrame frame = new JFrame();

        //Panels
        JPanel resultPanel = new JPanel();
        JPanel inputPanel = new JPanel();

        //Result Panel objects
        JLabel result = new JLabel("This is the result");

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
}
