wangjialei
lalalalalalalala
liwenting
package calculator;

public class Calculator {
	private double number1 = 0;
	private double number2 = 0;
	private double result = 0;
	private boolean alg = false;
	private String symbol;

	public void clean() {
		number1 = 0;
		number2 = 0;
		result = 0;
		alg = false;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public boolean isAlg() {
		return alg;
	}

	public void setAlg(boolean alg) {
		this.alg = alg;
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public void add() {
		result = number1 + number2;
	}

	public void desc() {
		result = number1 - number2;
	}

	public void mult() {
		result = number1 * number2;
	}

	public void div() {
		result = number1 / number2;
	}

	public void kaifang() {
		result = Math.sqrt(number1);
	}

	public void chengfang() {
		result = Math.pow(number1, number2);
	}

	public void yunsuan() {
		switch (symbol) {
		case "+": {
			add();
			break;
		}
		case "-": {
			desc();
			break;
		}
		case "*": {
			mult();
			break;
		}
		case "/": {
			div();
			break;
		}
		case "^": {
			chengfang();
			break;
		}
		case "sqrt": {
			kaifang();
		}
		}
	}
}
