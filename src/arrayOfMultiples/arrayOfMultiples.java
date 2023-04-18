package arrayOfMultiples;
import java.util.Arrays;

public class arrayOfMultiples {
	public static void main(String[] args) {
		int[] array1 = arrayOfMultiples(7,5);
		System.out.println(Arrays.toString(array1));
		int[] array2 = arrayOfMultiples(12,10);
		System.out.println(Arrays.toString(array2));
		int[] array3 = arrayOfMultiples(17,6);
		System.out.println(Arrays.toString(array3));
	}
	
	public static int[] arrayOfMultiples(int num, int length) {
		int[] array = new int[length];
		int newNum = num;
		for(int i=0;i<length;i++) {
			array[i] = newNum;
			newNum=newNum+num;
		}
		return array;
	}

}
