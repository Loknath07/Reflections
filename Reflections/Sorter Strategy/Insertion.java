public class Insertion implements Strategy {
    public int[] sortstrategy(int array[])
    {
        int pass,i = 0,swap = 0;
        for(pass = 1; pass<array.length;pass++)
        {
            swap = array[pass];
            for (i=pass-1; i>=0; i--)
            {
                if (swap >= array[i])
                break;
                else
                     array[i+1]=array[i];
            }
            array[i+1] = swap;
        }
        return array;
    }
}