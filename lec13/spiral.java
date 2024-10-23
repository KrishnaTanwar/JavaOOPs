package lec13;

public class spiral {

    public static void print(int[][] arr) {
		int minc = 0, minr = 0, maxc = arr[0].length, maxr = arr.length;
		int t = arr.length * arr[0].length;
		int c = 0;
		while(c<t) {
			for(int i = minc; i<maxc; i++) {
				System.out.print(arr[minr][i] + " ");
				c++;
			}
			minr++;
			
			for(int i = minr; i<maxr; i++) {
				System.out.print(arr[i][maxc] + " ");
				c++;
			}
			maxc--;
			
			for(int i = maxc; i>minc; i--) {
				System.out.print(arr[maxr][i] + " ");
				c++;
			}
			maxr--;
			
			for(int i = maxr; i<minr; i--) {
				System.out.print(arr[i][minc] + " ");
				c++;
			}
			minc++;
		}
	}
    
}
