package lab5;

import java.util.LinkedHashMap;

public class MultiChoiceQuestion extends Question {

	private LinkedHashMap<String, Boolean> answers;
	private String question;

	public MultiChoiceQuestion(String question) {
		super(question);
		this.question = question;
		answers = new LinkedHashMap<String, Boolean>();
	}

	public void addChoice(String answer, boolean correct) {
		answers.put(answer, correct); 
	}

	public boolean checkAnswer(String answer) {
		String[] ans = answer.split(" ");
		boolean cor = true;
		for (String s : ans) {
			if (!cor)
				continue;
			cor = (answers.get(answers.keySet().toArray()[Integer.parseInt(s) - 1])) ? true : false;
		}
		return cor;
	}

	public void display() {
		System.out.println(question);
		int counter = 1;
		for (String key : answers.keySet()) {
			System.out.println(counter + ": " + key);
			counter++;
		}
	}
}
