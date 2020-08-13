class Palindrome
{
    public static void main (String args[])
    {
        int rem,base=0,temp;
        int n=101;
        temp=n;
        while(n>0)
        {
            rem=n%10;
            base=(base*10)+rem;
            n=n/10;
        }
        if(temp==base)
        System.out.println("Number given is a palindrome");
        else
        System.out.println("Number given is not a palindrome");
    }
}