public class SelectionSort {
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				
				double temp = list[i];
				list[i] = list[currentMinIndex];
				list[currentMinIndex] = temp;
			}
		}
	}

	
	public static void main(String[] args) {
		double[] numbers = {3.2, 5.1, 2.4, 1.7, 4.9}; 
		selectionSort(numbers); 

		
		for (double num : numbers) {
			System.out.print(num + " ");
		}
	}
}
