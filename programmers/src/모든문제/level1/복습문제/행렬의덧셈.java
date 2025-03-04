package 모든문제.level1.복습문제;

import java.util.Arrays;

public class 행렬의덧셈 {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        행렬의덧셈 problem = new 행렬의덧셈();

        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};
        System.out.println("problem = " + Arrays.deepToString(problem.solution(arr1, arr2)));
    }
}
