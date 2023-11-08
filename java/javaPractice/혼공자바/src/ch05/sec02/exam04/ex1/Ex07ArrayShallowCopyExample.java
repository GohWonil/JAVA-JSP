package ch05.sec02.exam04.ex1;

public class Ex07ArrayShallowCopyExample {

	public static void main(String[] args) {

		int[] list = { 10, 20, 30, 40, 50 };
//		얕은복사(ShallowCopy)를 이용한 배열요소 복사
		int[] numbers = list;
		
//		원본 배열 출력
		for(int number : list) {
			System.out.println(number);
		}
		
		System.out.println("---------------------------");
//		복사된 배열 출력
		for(int number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("---------------------------");
		if(list == numbers) {
			System.out.println("list배열과 numbers 배열이 같습니다.");
		} else {
			System.out.println("list배열과 numbers 배열이 다릅니다");
		}

//		내용을 비교하는 equals()메소드 확인
		if(list.equals(numbers)) {
			System.out.println("list배열과 numbers 배열이 같습니다.");
		} else {
			System.out.println("list배열과 numbers 배열이 다릅니다.");
		}
		
		for(int i = 0; i < list.length; i++) {
			if (list[i] == numbers[i]) {
				System.out.println("List와 numbers의 개별요소가 같습니다.");
			} else {
				System.out.println("List와 numbers의 개별요소가 다릅니다");
			}
		}
		
//		데이터객체의 정보의 특징을 해쉬값으로 출력
		System.out.println(list.toString());
		System.out.println(numbers.toString());
//		list = null;
//		System.out.println(list.toString());
//		System.out.println(numbers.toString());
		
//		복사본 numbers의 데이터값을 데이터요소 * 10을 해서 내용을
//		바꿉니다. list 원본에 영향이 있을지 살펴보겠습니다
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers[i] * 10;
		}
		
//		numbers 배열의 내용이 바뀌었는지 확인
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("----numbers와 list가 바뀌었는가 -----");
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		
	}
}