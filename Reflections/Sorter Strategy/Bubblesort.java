public class Bubblesort implements Strategy{
	public int[] sortstrategy(int array[])
	{
		int Right = array.length;
		for(int i = 0 ; i < Right ; i++){
			for(int j = i ; j < Right ; j++){
				if(array[i] > array[j]){
					int swap = array[i];
					array[i]=array[j];
					array[j] = swap;
				}
			}
		}

		return array;
	}
}