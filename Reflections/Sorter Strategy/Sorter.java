public class Sorter{
	Strategy strategy;

	Sorter()
	{
		strategy = null;
	}

	int[] Sort(int array[] , Strategy strategy)
	{
		return strategy.sortstrategy(array);

	}

	int[] Sort(int array[])
	{
		return strategy.sortstrategy(array);
	}

	void setStrategy(Strategy strategy)
	{
		this.strategy = strategy;

	}

	public static void main(String[] args)
	{
		Sorter sorter = new Sorter();
		int temp[] = {22,4,67,23,89,100,8,42,99};

		int outBubble[] = sorter.Sort(temp,new Bubblesort());
		System.out.print("Result of BUBBLESORT :(");
		for(int i =0 ; i < outBubble.length ; i++ )
		{
			System.out.print(outBubble[i]+ " ");
		}
		
		System.out.print(")\n");
		System.out.print(" \n");

	    int outmerge[] = sorter.Sort(temp,new MergeSort());

		System.out.print("Result of MERGESORT  :(");
		for(int i =0 ; i < outmerge.length ; i++ )
		{
			System.out.print (outmerge[i]+" ");
		}
		
		 System.out.println(")\n");
		
		int outInsertion[] = sorter.Sort(temp,new Insertion());

		System.out.print("Result of Insertion  :(");
		for(int i =0 ; i < outInsertion.length ; i++ )
		{
			System.out.print (outInsertion[i]+" ");
		}
		
		 System.out.println(")");
	}
}