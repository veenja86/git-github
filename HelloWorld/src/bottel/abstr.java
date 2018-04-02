package bottel;

abstract class Base{
	Base(){System.out.println("Base Costructor is called");}
	abstract void fun();
}
class Derived extends Base{
	Derived(){System.out.println("Derived class constructor");}
	void fun(){System.out.println("Derived class fun() is called");}
}
public class abstr {
	public static void main(String[] args) {
		 Derived d= new Derived();
		 d.fun();
	}

}
