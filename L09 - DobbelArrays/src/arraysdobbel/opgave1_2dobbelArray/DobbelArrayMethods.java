package arraysdobbel.opgave1_2dobbelArray;

/**
 * @author mad
 *
 */
public class DobbelArrayMethods {

	public void udskrivArray(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col] + "  ");
			}
			System.out.println();
		}
	}

	// Opgave 1.1
	public  int getValueAt(int[][] numbers, int row, int col){
		return numbers[row][col];
	}

	// Opgave 1.2
	public  void setValueAt(int[][] numbers, int row, int col, int value){
		numbers[row][col] = value;
	}

	// Opgave 1.3
	public  int sumRow(int[][] numbers, int row) {
		int sum = 0;
		int[] numbers1 = numbers[row];
		for (int value : numbers1) {
			sum += value;
		}

		return sum;
	}

	// Opgave 1.4
	public  int sumCol(int[][] numbers, int col) {
		int sum = 0;
		for (int[] array : numbers) {
			int[] currentArray = array;
			sum += currentArray[col];
		}
		return sum;
	}

	// Opgave 1.5
	public  int sum(int[][] numbers) {
		int sum = 0;
		for (int[] array : numbers) {
			int [] currentArray = array;
			for (int value : currentArray) {
				sum += value;
			}
		}
		return sum;
	}

}
