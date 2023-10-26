import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String quest1 = "etos";
		String sol1 = "RBC";
		String[] rubric1 = {"manu", "arsenal", "liverpool"};
		Question question1 = new Question(quest1, sol1, rubric1);
		
		String quest2 = "etos";
		String sol2 = "RBC";
		String[] rubric2 = {"manu", "arsenal", "liverpool"};
		Question question2 = new Question(quest2, sol2, rubric2);
		
		String quest3 = "etos";
		String sol3 = "RBC";
		String[] rubric3 = {"manu", "arsenal", "liverpool"};
		Question question3 = new Question(quest3, sol3, rubric3);
		
		String quest4 = "etos";
		String sol4 = "RBC";
		String[] rubric4 = {"manu", "arsenal", "liverpool"};
		Question newQuestion = new Question(quest4, sol4, rubric4);
		
		ArrayList<Question> questions = new ArrayList<Question>();
		questions.add(question1);
		questions.add(question2);
		questions.add(question3);
		
		
		//obj1 - obj2
		Worksheet5_1 obj1 = new Worksheet5_1(questions);
		Worksheet5_1 obj2 = new Worksheet5_1(obj1);
		System.out.println("Same Worksheet objects? " + (obj1 == obj2));
		System.out.println("Same instance variable? " + (obj1.getList() == obj2.getList()));
		System.out.println("Same instance variable's component? " + (obj1.getQuestion(0) == obj2.getQuestion(0)));
		
		obj1.setQuestion(0, newQuestion);
		System.out.println("Same instance variable's component? " + (obj1.getQuestion(0) == obj2.getQuestion(0)));
		obj1.Nullify();
		System.out.println("Both are null? " + (obj1.getList() == obj2.getList()));
		
		
		//obj3 - obj4
//		Worksheet5_2 obj3 = new Worksheet5_2(questions);
//		Worksheet5_2 obj4 = new Worksheet5_2(obj3);
//		System.out.println("Same Worksheet objects? " + (obj3 == obj4));
//		System.out.println("Same instance variable? " + (obj4.getList() == obj4.getList()));
//		System.out.println("Same instance variable's component? " + (obj3.getQuestion(0) == obj4.getQuestion(0)));
//	
//		obj3.setQuestion(0, newQuestion);
//		System.out.println("Same instance variable's component? " + (obj3.getQuestion(0) == obj4.getQuestion(0)));	
//		obj3.Nullify();
//		System.out.println("Both are null? " + (obj3.getList() == obj4.getList()));
		
		
		//obj5 - obj6
//		Worksheet5_3 obj5 = new Worksheet5_3(questions);
//		Worksheet5_3 obj6 = new Worksheet5_3(obj5);
//		System.out.println("Same Worksheet objects? " + (obj5 == obj6));
//		System.out.println("Same instance variable? " + (obj5.getList() == obj6.getList()));
//		System.out.println("Same instance variable's component? " + (obj5.getQuestion(0) == obj6.getQuestion(0)));
//			
//		obj5.setQuestion(0, newQuestion);
//		System.out.println("Same instance variable's component? " + (obj5.getQuestion(0) == obj6.getQuestion(0)));	
//		obj5.Nullify();
//		System.out.println("Both are null? " + (obj5.getList() == obj6.getList()));
		
		
		
		

	}

}
