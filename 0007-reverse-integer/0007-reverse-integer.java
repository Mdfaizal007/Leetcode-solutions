class Solution {
    public int reverse(int x) {
        boolean status=false;
        if(x<0)
        {x=Math.abs(x);status=true;}
     double rev=x%10;
        x/=10;
        while(x!=0)
        {
           rev=(rev*10)+(x%10);
           x/=10;
        }
        if(status)
        {rev=0-rev;}
        if(rev>((Math.pow(2,31))-1) || rev< Math.pow(-2,31))
        return 0;
        else
        return (int)rev;

    }
}