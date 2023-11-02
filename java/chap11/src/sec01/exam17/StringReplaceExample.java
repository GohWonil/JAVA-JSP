package sec01.exam17;

public class StringReplaceExample {

	public static void main(String[] args) {

		String oldStr = "자바는 객체 지향 언어입니다."
						+ "자바는 풍부한 API를 지원합니다";
		
//			oldStr = """
//					자바는 객체 지향 언어입니다.
//					자바는 풍부한 API를 지원합니다
//					""";

		// 자바를 java로 변경
		String newStr = oldStr.replace("자바", "JAVA");

		System.out.println("oldStr: " + oldStr);
		System.out.println("newStr: " + newStr);

	}

}
