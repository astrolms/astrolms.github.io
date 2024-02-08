package view;

public class Loops {
	
	public static void sort(){
		
		int[] arr = {2, 25, 13, 5, 0, 1};
		int i = 0;
		int cont;
		
		while (i < arr.length)
		{
			for (int j = 0; j < arr.length; j++) {
			if (arr[i] < arr[j]) {
				cont = arr[j];
				arr[j] = arr[i];
				arr[i]=cont;
			}}
			i++;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
			
		}
		
	}
	
	public static void changeOrder() {
		
		 int[] arr = {2, 19, 10, 45, 5};
		 int i = 0;
		 int temp = 0;
		 int l = arr.length - 1;
		 
		 while (i < l) {
			 temp = arr[i];
			 arr[i] = arr[l];
			 arr[l] = temp;
			 i++;
			 l--;
			 
			 if (i > (l / 2)) break;
			 
			 
		 }
		 
		 for (int j = 0; j < arr.length; j++) {
			 System.out.println(arr[j]);
			
		}
		
	}
	

	public static void main(String[] args) {

		sort();
		
		changeOrder();
	}

}
