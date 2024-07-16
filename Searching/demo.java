public class demo{
    public static void main(String[] args) {
        long n=12345678910l;
        // String n2="324";
        // System.out.println(n2.length());
        long count=0;
        // for(int i=1;i<=n;i++)
        while(n>0)
        {     
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}