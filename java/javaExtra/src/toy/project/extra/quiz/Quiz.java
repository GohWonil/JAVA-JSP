package toy.project.extra.quiz;

public abstract class Quiz implements HintHelp {

	// 이 클래스는 퀴즈를 만드는 
	//   추상클래스 입니다.
	// 이 클래스를 상속한 구현클래스는
	//  반드시 아래의 필드와 메소드를 
	//  가지고 있습니다.
	// 필드 
	String question; // 문제를 저장하는 
	String answer; // 문제의 해답
	
	// 구현클래스는 반드시 createQuestion()
	//   메소드를 구현하여야 한다.
	//   문제를 만드는 경우 반드시 새로
	//   작성하여야 한다.
	abstract void createQuestion();
	
	// 문제를 알려줍니다.
	String getQuestion() {
		return this.question;
	}
	
	//  정답을 알려줍니다.
	String getAnswer() {
		return this.answer;
		
	}
	

}
