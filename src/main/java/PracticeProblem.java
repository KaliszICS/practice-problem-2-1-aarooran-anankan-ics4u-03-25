public class PracticeProblem {

	public static void main(String args[]) {}

	public static int find(int[] array, int number) {
		
		int firstOcc = -1;

		for (int i=0; i<array.length; i++) {
			if (array[i] == number) {
				firstOcc = i;
				return firstOcc;
			}
		}

		return firstOcc;

	}
	
	public static int findLast(String[] array, String string) {

		int lastOcc = -1;

		for (int i=0; i<array.length; i++) {
			if (array[i] == string) {
				lastOcc = i;
			}
		}

		return lastOcc;

	}

	public static int findSecond(char[] array, char character) {

		int secOcc = -1;
		int occ = 0;

		for (int i=0; i<array.length; i++) {
			if (array[i]==character) {
				secOcc = i;
				occ++;
				if (occ>=2) {
					secOcc = i;
					return secOcc;
				}

			}
		}

		return secOcc;
	}

}
