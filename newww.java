class newww
{
    public static void main(String args[])
    {
        int arrr[][]=new int[2][2];
        int arr[]={1,2,3,4};
        int size=2,k=0,j=0;
        
        for(int i=0;i<4;i++)
        {
            if(i==size)
            {
                k++;
                j=0;
            }
                arrr[k][j]=arr[i];
                j++;
        }
        
        for(int i=0;i<2;i++)
        {
            for(int jj=0;jj<2;jj++)
            {
                System.out.print(arrr[i][jj]+" ");
            }
            System.out.println();
        }
    }
}