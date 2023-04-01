 class MergeSort implements Strategy
{
	 int[] merge(int array1[],int array2[])
	{
		int L1=0;                                                                   // L1 is a 1st index of 1st array
		int R1=array1.length;                                                       // R1 is a last index of 1st array
		int L2=0;                                                                   // L2 is a 1st index of 2nd array
		int R2=array2.length;                                                       // R2 is a last index of 2nd array
		int length=array1.length+array2.length;
		int temp[]= new int[length] ;                                         // temp is a temporary array
		int k=0;
		while(L1<R1 && L2<R2)
		{
			if(array1[L1]<array2[L2])
				temp[k++]=array1[L1++];
			else
				temp[k++]=array2[L2++];
		}
		if(L1==R1)
			while(L2<R2)
				temp[k++]=array2[L2++];
		else if(L2==R2)
			while(L1<R1)
				temp[k++]=array1[L1++];
		return temp;
	}
	
	public int[] sortstrategy(int array[])
	{
		return split(array,0,array.length-1);
	}

	int[] split(int array[],int left,int right)
	{
		int middle;
		int temp[] = new int[right+1];
		if(left==right)
		{
			int array1[]={array[left]};
			return array1;
		}
		if(left < right)
		{
			middle=(left+right)/2;
			int array1[]=split(array,left,middle);
			int array2[]=split(array,middle+1,right);
			temp= merge(array1,array2);
		}
		return temp;
	}

	void display(int array[])
	{
		int i;
		for (i=0;i<array.length ;i++ ) 
		{
			System.out.println(array[i]);	
		}
		System.out.println();
	}

}
