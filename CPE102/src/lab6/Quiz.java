package lab6;

public class Quiz implements Measurable {

	private int score;
	private String letterGrade;
	
	public Quiz(int score, String letterGrade){
		this.score = score;
		this.letterGrade = letterGrade;
	}
	
	
	public double getMeasure() {
		return score;
	}
	
	public int getScore(){
		return score;
	}
	
	public String getGrade(){
		return letterGrade;
	}

}
