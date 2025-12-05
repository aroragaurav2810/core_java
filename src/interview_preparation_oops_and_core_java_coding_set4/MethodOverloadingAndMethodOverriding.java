package interview_preparation_oops_and_core_java_coding_set4;

public class MethodOverloadingAndMethodOverriding

{

    public void firstMethod()
    {
        System.out.println("Overridden method");
    }

    public void firstMethodOverload(int a)
    {
        System.out.println("Overload method");
    }

    public MethodOverloadingAndMethodOverriding()
    {
        System.out.println("Parent class constructor");
    }

}


class SubClassOfMethodOverloadingAndMethodOverriding extends MethodOverloadingAndMethodOverriding
{


    public void firstMethod()
    {
        super.firstMethod();
        this.firstMethodOverload(10);
        System.out.println("Overriding method");

    }

    public SubClassOfMethodOverloadingAndMethodOverriding()
    {
        System.out.println("Subclass constructor");
    }




    static void main() {
        SubClassOfMethodOverloadingAndMethodOverriding sub=new SubClassOfMethodOverloadingAndMethodOverriding();
        sub.firstMethod();
    }
}