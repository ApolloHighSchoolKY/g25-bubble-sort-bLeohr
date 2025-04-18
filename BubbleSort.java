public class BubbleSort
{

	public static void main(String[] args)
	{
		int[] myNums = {12, 15, 0, 44, 13, 1, 2};
		int passes;
		int comparisons;
		int tempNum=0;

		//Loop once for each pass, where passes is one less than the number of items.
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
				//If they are out of order, swap the values
			//End Loop for comparisons
    
			//The next pass will use one less comparison
    
		//End Loop for passes

		for(int x: myNums)
		System.out.print(x + " ");


		for(int i=0; i<myNums.length-1; i++)
			for(int j=0; j<myNums.length-1; j++)
				if(myNums[j]>myNums[j+1]){
				//Switch them if wrong
					tempNum=myNums[j];
					myNums[j]=myNums[j+1];
					myNums[j+1]=tempNum;}


					
					System.out.print("\n");
					for(int x: myNums)
					System.out.print(x + " ");
	}
}
