package com.softacad.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class PathFinderv3 {

	public static void findPaths(ArrayList<String> tempPath, int start_i, int start_j, int end_i, int end_j,
			char[][] arr, ArrayList<ArrayList<String>> results){
		
		if(!results.isEmpty()){
			return;
		}

		if (arr[start_i][start_j] != '0') {
			return;
		}

		tempPath.add(new String("(" + start_i + ", " + start_j + ")"));

		if (start_i == end_i && start_j == end_j) {
			System.out.println("Path found!");
			results.add(tempPath);
			return;
		}

		if (arr[start_i][start_j] == '0') {
			arr[start_i][start_j] = 'v';
			// right
			if (0 <= start_j + 1 && start_j + 1 < arr.length) {
				findPaths(tempPath, start_i, start_j + 1, end_i, end_j, arr, results);
			}
			
			// left
			if (0 <= start_j - 1 && start_j - 1 < arr.length) {
				findPaths(tempPath, start_i, start_j - 1, end_i, end_j, arr, results);
			}
			
			// down
			if (0 <= start_i + 1 && start_i + 1 < arr.length) {
				findPaths(tempPath, start_i + 1, start_j, end_i, end_j, arr, results);
			}

			// up
			if (0 <= start_i - 1 && start_i - 1 < arr.length) {
				findPaths(tempPath, start_i - 1, start_j, end_i, end_j, arr, results);
			}

//			arr[start_i][start_j] = 'v';
		}

	}

	public static void main(String[] args) {
		char[][] arr = { {'0', '0', '1'},
				         {'0', '1', '1'},
				         {'0', '0', '0'}, };
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a start point : ");

		int start_i = sc.nextInt();
		int start_j = sc.nextInt();

		System.out.println("Input an end point : ");

		int end_i = sc.nextInt();
		int end_j = sc.nextInt();

		ArrayList<String> tempPath = new ArrayList<>(arr.length * arr.length);
		ArrayList<ArrayList<String>> results = new ArrayList<>(arr.length * arr.length);
		findPaths(tempPath, start_i, start_j, end_i, end_j, arr, results);
		if(!results.isEmpty()){
		    System.out.println("The path is : " + results);
		} else {
			System.out.println("No path between ("+start_i+", "+start_j+") and ("+end_i+","+end_j+")");
		}
		sc.close();

	}

}
