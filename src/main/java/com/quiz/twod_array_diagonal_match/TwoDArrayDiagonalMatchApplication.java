package com.quiz.twod_array_diagonal_match;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class TwoDArrayDiagonalMatchApplication {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [][]arr = new int[n][n];
        
        boolean checkD = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr [i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    checkD = false;
					break;
                }
            }
        }
        
        System.out.println(checkD ? "YES" : "NO");
		scan.close();
	}

}
