//If a class implements an interface, then the implementing class must provide the definition of the abstract
//methods of the interface.

//If a class inherit and implements, then "extends" must be performed before "implements"
public abstract class Regular extends AbstractClass implements Interface_A, Interface_B, Interface_C, Interface_D
{
    @Override
    public void method_1_A()
    {
        System.out.println("Regular class is implementing method_1_A.");
    }

    @Override
    public void method_2_A()
    {
        System.out.println("Regular class is implementing method_2_A.");
    }
    public void display_information()
    {
        System.out.println("Regular class is overriding the super class display_information method.");
    }
    @Override
    public void method_1_B()
    {
        System.out.println("Regular class is overriding method_1_B.");
    }
    @Override
    public void method_2_B()
    {
        System.out.println("Regular class is overriding method_2_B.");
    }
    public void abstract_method_AC()
    {
        System.out.println("Regular class is defining the abstract_method_AC.");
    }
    @Override
    public void method_1_C()
    {
        System.out.println("Regular class is defining method_1_C");
    }
    @Override
    public void method_2_C()
    {
        System.out.println("Regular class is defining method_2_C");
    }
    @Override
    public void method_1_D()
    {
        System.out.println("Regular class is defining method_1_D");
    }
    @Override
    public void method_2_D()
    {
        System.out.println("Regular class is defining method_2_D");
    }
    public void abstract_method_E()
    {
        System.out.println("Regular class is defining the abstract_method_E.");
    }
}
