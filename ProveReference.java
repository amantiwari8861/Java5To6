public class ProveReference 
{
    int num=10;
    public static void main(String[] args) 
    {
        ProveReference pr=new ProveReference();
        System.out.println("before changing "+pr.num);
        Second sc=new Second();
        sc.change(pr);
        System.out.println("value of num after change "+pr.num);
    } 
}
class Second
{
    void change(ProveReference pr1) {       pr1.num=500;    }
}

