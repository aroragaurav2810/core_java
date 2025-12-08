package interview_preparation_oops_and_core_java_coding_set4;

public class SingletonClass

{

    public static SingletonClass instance=new SingletonClass();

    private SingletonClass()
    {

    }

    public static SingletonClass getInstance()
    {

        return instance;
    }

}


class Example1
{

    static void main() {
    SingletonClass obj1=SingletonClass.getInstance();
    SingletonClass obj2=SingletonClass.getInstance();
    if(obj1==obj2)
    {
        System.out.println("Both are same as both instance are of singleton class");
    }
    else
    {
        System.out.println("Both objects are not same");
    }
    }

}


class Example2
{

    static void main() {
        SingletonClass obj1=SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();
        if(obj1==obj2)
        {
            System.out.println("Both are same as both instance are of singleton class");
        }
        else
        {
            System.out.println("Both objects are not same");
        }
    }

}