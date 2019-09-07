class pattern9
{
    public static void main(String args[])
    {
        String s="BLUEJ";
        int i,l;
        l=s.length();
        for(i=1;i<=l;i++)
        {
            System.out.println(s.substring((l-i),l));
        }
    }
}