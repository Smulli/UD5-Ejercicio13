import java.util.Scanner;
import javax.swing.JOptionPane;


public class CalculadoraInversa {
	
	public static void main(String args[]) {
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer numero"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero"));
		double operador;
		
		String signo = JOptionPane.showInputDialog("Introducir el signo");
		
		switch(signo) {
		case"+":
			operador = (num1 + num2);
			JOptionPane.showMessageDialog(null, "El resultado de la suma es" +operador);
			break;
		case"-":
			operador = (num1 - num2);
			JOptionPane.showMessageDialog(null, "El resultado de la resta es" +operador);
			break;
		case"*":
			operador = (num1 * num2);
			JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es" +operador);
			break;
		case"/":
			operador = (num1 / num2);
			JOptionPane.showMessageDialog(null, "El resultado de la division es" +operador);
			break;
		case"%":
			operador = (num1 % num2);
			JOptionPane.showMessageDialog(null, "El residuo de la division es" +operador);
			break;
		case"^":
			operador = (Math.pow(num1, num2));
			JOptionPane.showMessageDialog(null, "El resultado de" +num1+" Y "+num2+"Es: " +operador);
			break;
			default:
				break;
		}
	}

}
