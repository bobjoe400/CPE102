package lab5;

public class NumericQuestion extends Question {
	private double answer;

	public NumericQuestion(String question) {
		super(question);
		answer = 0;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	public boolean checkAnswer(String answer){
		if(Math.abs(Double.parseDouble(answer) - this.answer) < 0.01) return true;
		return false;
	}
}
