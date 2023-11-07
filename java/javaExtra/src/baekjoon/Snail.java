package baekjoon;

public class Snail {
    public static void main(String[] args) {
        int n = 5; // 달팽이 크기 (5x5 예제)
        int maxValue = n * n;
        int currentValue = 1;

        int row = 0, col = 0, direction = 1;

        while (currentValue <= maxValue) {
            // 오른쪽으로 이동
            if (direction == 1) {
                System.out.printf("%2d ", currentValue++);
                if (col == n - 1 || currentValue > maxValue) {
                    direction = 2;
                    row++;
                } else {
                    col++;
                } 
            } 
            // 아래로 이동
            else if (direction == 2) {
                System.out.printf("%2d ", currentValue++);
                if (row == n - 1 || currentValue > maxValue) {
                    direction = 3;
                    col--;
                } else {
                    row++;
                }
            }
            // 왼쪽으로 이동
            else if (direction == 3) {
                System.out.printf("%2d ", currentValue++);
                if (col == 0 || currentValue > maxValue) {
                    direction = 4;
                    row--;
                } else {
                    col--;
                }
            }
            // 위로 이동
            else if (direction == 4) {
                System.out.printf("%2d ", currentValue++);
                if (row == 0 || currentValue > maxValue) {
                    direction = 1;
                    col++;
                } else {
                    row--;
                }
            }
        }
    }
}
