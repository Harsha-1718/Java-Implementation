import java.util.Arrays;

public class Transposematrix {
	public static void main(String[] args) {
		int arr[][]={{11,22,33},{44,55,66},{77,88,99}};
		int transpose[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=arr[j][i];
			}
		}
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=0;i<3;i++) {
		for(int j=0;j<3;j++) {
			System.out.print(transpose[i][j]+" ");
		}
		System.out.println();
	}
	}
}
