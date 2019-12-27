
public class maxSubArray {
	
	public static void main(String[] args) {
		int[] arr = {};
		System.out.println(sequence(arr));
	}
	public static int sequence(int[] arr) {
		int sum = 0;
		if(arr.length == 0) return sum;
		else if(isnegative(arr)) return sum;
		else if(ispositive(arr)) {
			for (int i = 0; i < arr.length; i++) {
				sum = sum + arr[i];
			}
			return sum;
		}else {
			int sum2 = 0;
			for (int i = 1; i < arr.length; i++) {
				for (int j = 0; j < arr.length-i; j++) {
					for(int k = 0; k<=i; k++) {
						sum2 = sum2+arr[j+k];
					}
					if(sum < sum2) sum = sum2;
					sum2 = 0;
				}
			}
			
			return sum;
		}
	}
	
	public static boolean isnegative(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) return false;
		}
		return true;
	}
	
	public static boolean ispositive(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) return false;
		}
		return true;
	}
	
}
