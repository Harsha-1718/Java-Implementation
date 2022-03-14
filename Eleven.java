package cap;

public class Eleven {
	public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        int bonus[]=new int[15];
        for(int i=0;i<bonus.length;i++){
        bonus[i]=1;
        }
        
        for (int i : bonus) {
            System.out.print(i+" ");
        }
        System.out.println();
        int bestscores[]={20,30,40,50,60};
        for(int i=0;i<bestscores.length;i++){
            System.out.print(bestscores[i]+" ");
        }

	}

}
