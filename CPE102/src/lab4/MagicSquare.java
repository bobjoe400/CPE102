package lab4;

import java.util.ArrayList;

public class MagicSquare {

	int[][] numbers;

	public MagicSquare(int num) {
		numbers = new int[num][num];
	}

	public String toString() {
		int val = 2;
		int currx = (int) Math.floor(numbers[0].length / 2);
		int curry = numbers[0].length - 1;
		//System.out.println(currx + "" + curry);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i][i]);
		}
		numbers[currx][curry] = 1;
		for (int i = 0; i < Math.pow(numbers.length, 2) - 1; i++) {
			currx++;
			curry++;
			if (currx >= numbers.length) {
				currx = 0;
			} if (curry >= numbers.length) {
				curry = 0;
			} else {
				if (numbers[currx][curry] != 0) {
					curry -= 2;
					if(curry < 0){
						curry = numbers.length -1;
					}
				} else if (currx == numbers.length - 1 && curry == numbers.length - 1) {
					curry -= 2;
				}
			}
			numbers[currx][curry] = val;
			val++;
		}
		
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; i < numbers.length; i++){
				System.out.println(numbers[i][j]);
			}
		}
		System.out.println("dixdix");
		return "";
	}
}
