public class Number 
{
    static int count=0;
    Number()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Number obj1 = new Number();
        Number obj2 = new Number();
        Number obj3 = new Number();
        Number obj4 = new Number();
        System.out.println("Number of objects created:"+count);
    }
}
