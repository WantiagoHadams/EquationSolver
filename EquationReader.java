public class EquationReader {

	// Instance Variables
	String equation;

	// Initializer
	public EquationReader(String equationInput) {
		equation = equationInput;
	}

	// Converts the Equation to an array
	public char[] equationConverter() {
		char[] convertedEquation = new char[equation.length()];
		for (int a = 0; a < equation.length(); a++ ) {
			convertedEquation[a] = equation.charAt(a);
		}
		for (int b = 0; b < equation.length(); b++ ) {
			System.out.println(convertedEquation[b]);
		}
		return convertedEquation;
	}

	//
}