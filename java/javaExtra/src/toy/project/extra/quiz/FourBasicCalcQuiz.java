package toy.project.extra.quiz;

import java.util.Random;

public class FourBasicCalcQuiz extends Quiz {

	@Override
	public String getHint() {
		return "사칙연산";
	}

	@Override
	void createQuestion() {
		Random rnd = new Random();
		
		int choice = rnd.nextInt(4);
		
		int num1 = rnd.nextInt(100);;
		int num2 = rnd.nextInt(100);;
		int result = 0;
		
		switch (choice) {
		case 0 : //덧셈
			//두수의 난수를 발생
			//두수와 연산자를 화면에 출력
			//문제를 출력
			//(예시) 문제: 100+100=?? / 정답: 100+100=200 / 도움말: 두 수의 연산에 대한 문제
			result = num1 + num2;
			
			this.question = """
					#num1 + #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + "[***]");
			
			this.getHint();
			
			this.answer = """
					#num1 + #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + result);
			break;
			
		case 1 : //뺄셈
			result = num1 - num2;
			
			this.question = """
					#num1 - #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + "[***]");
			
			this.getHint();

			this.answer = """
					#num1 - #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + result);			
			break;
			
		case 2 : //곱셈
			result = num1 * num2;
			
			this.question = """
					#num1 * #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + "[***]");
			
			this.getHint();

			this.answer = """
					#num1 - #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + result);		
			break;
			
		case 3 : //나눗셈
			num1 = rnd.nextInt(100) + 1;
			num2 = rnd.nextInt(100) + 1;
			result = num1 / num2;
			
			this.question = """
					#num1 / #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + "[***]");
			
			this.getHint();

			this.answer = """
					#num1 - #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + result);		
			break;
			
		case 4 : //나머지

			result = num1 % num2;
			
			this.question = """
					#num1 % #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + "[***]");
			
			this.getHint();

			this.answer = """
					#num1 - #num2 = #result
					"""
					.replace("#num1","" + num1)
					.replace("#num2","" + num2)
					.replace("#result","" + result);		
			break;	
			
		default:
			break;
		}
	}

}
