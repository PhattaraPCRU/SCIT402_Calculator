package phattara.scit402_calculator;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JTextField;

public class CalcController {
    static boolean onError = false;
    public static void addNumber(String button,JTextField txtf_output) {
        if(onError){
            txtf_output.setText("0.00");
            onError = false;
        }
        String display = txtf_output.getText().replace(",", "");
        if(display.equals("0.00")) {
            display = "";
        }
        switch(button){
            case ".":
            case "0":
            case "+":
            case "-":
            case "*":
            case "/":
                if(display.equals("")){
                    break;
                }
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                txtf_output.setText(display + button);
                break;
            case "=":
                calculate(txtf_output);
                break;
        }
    }
    static void calculate(JTextField txtf_ouput){
        if(!txtf_ouput.getText().equals("0.00")&&!txtf_ouput.getText().equals("")){
            // onError = false;
            String display = txtf_ouput.getText();
            BigDecimal number1, number2,total = BigDecimal.ZERO;
            OUTER:
            for (int i = 1; i<display.length(); i++) {
                String charAt = "" + display.charAt(i);
                switch(charAt){
                    case "+":
                        number1 = new BigDecimal(display.substring(0, i));
                        number2 = new BigDecimal(display.substring(i+1, display.length()));
                        total = number1.add(number2);
                        break OUTER;
                    case "-":
                        number1 = new BigDecimal(display.substring(0, i));
                        number2 = new BigDecimal(display.substring(i+1, display.length()));
                        total = number1.subtract(number2);
                        break OUTER;
                    case "*":
                        number1 = new BigDecimal(display.substring(0, i));
                        number2 = new BigDecimal(display.substring(i+1, display.length()));
                        total = number1.multiply(number2);
                        break OUTER;
                    case "/":
                        try {
                            number1 = new BigDecimal(display.substring(0, i));
                            number2 = new BigDecimal(display.substring(i+1, display.length()));
                            total = number1.divide(number2, 2, BigDecimal.ROUND_HALF_DOWN);
                            break OUTER;
                        } catch (ArithmeticException e) {
                            onError = true;
                            txtf_ouput.setText("Cant divide zero.");
                        } catch (NumberFormatException e) {
                            onError = true;
                            txtf_ouput.setText("Invalid input.");
                        }
                }
            }
            if(onError == false) {
                DecimalFormat df = new DecimalFormat("#,###.00");
                txtf_ouput.setText(df.format(total));
            }   
        }
    }
}