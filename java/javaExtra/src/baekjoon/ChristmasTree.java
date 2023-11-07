package baekjoon;

public class ChristmasTree {
    public static void main(String[] args) {
//        int height = 5; // 트리의 높이를 설정합니다.

        // 트리를 그리는 루프
        for (int i = 0; i < 5; i++) {
            // 공백을 출력하여 트리를 오른쪽 정렬합니다.
            for (int j = 0; j < 4 - i; j++) {
                System.out.print("1");
            }

            // '*' 문자로 트리를 그립니다.
            for (int k = 0; k < (2 * i) + 1; k++) {
                System.out.print("*");
            }

            // 개행 문자를 추가하여 다음 줄로 이동합니다.
            System.out.println();
        }

        // 트리의 기둥을 그립니다.
        for (int i = 0; i < 4; i++) {
            System.out.print("2");
        } System.out.print("|");
    }
}
