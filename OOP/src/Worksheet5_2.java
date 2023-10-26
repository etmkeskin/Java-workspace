import java.util.ArrayList;

public class Worksheet5_2 {
	
	ArrayList<Question> question;
	
	public Worksheet5_2(ArrayList<Question> quest) {
		this.question = new ArrayList<Question>(quest.size());
		for(Question obj : quest) {
			this.question.add(obj);
		}
	}
	
	public Worksheet5_2(Worksheet5_1 ws5) {
		this(ws5.question);
	}
	
	public ArrayList<Question> getList(){
		return this.question;
	}
	
	public Question getQuestion(int index) {
		return this.question.get(index);
	}
	
	public void setQuestion(int index, Question question) {
		this.question.set(index, question);
	}
	
	public void Nullify() {
		this.question = null;
	}
}
