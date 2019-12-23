
public class int32toipv4 {
	public static String longToIP(long ip) {
		int[] arr = new int[32];
		long n = ip;
		for (int i = 0; i < 32; i++) {
			arr[i] = (int)(n%2);
			n = n/2;
		}
		int[] pos = new int[4];
		for(int i = 0; i < 4; i++) {
			int sum = 0;
			int k = 0;
			for(int j = i*8; j < 8*(i+1); j++) {
				sum = sum + (int)(Math.pow(2, k))*arr[j];
				k++;
			}
			pos[i] = sum;
		}
		//printarr(arr);
		return pos[3]+"."+pos[2]+"."+pos[1]+"."+pos[0];
	}
	
	public static void main(String[] args) {
		System.out.println(longToIP(2149583361L));
	}
	
	public static void printarr(int[] arr) {
		for (int i = 0; i < 32; i++) {
			if(i%8 == 0) System.out.print(" . ");
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
