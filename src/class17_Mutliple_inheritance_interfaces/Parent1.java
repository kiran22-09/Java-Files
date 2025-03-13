package class17_Mutliple_inheritance_interfaces;

public interface Parent1 {
	
	public abstract void disp();
	
	public abstract void display();

}

/*  1.Since Interfaces cannot create objects, we can make interface as parent to another class and can create object to call the 
methods of those interfaces which were in the class.

2.Multiple Inheritance is possible in java only by using the Interfaces 
because methods in the interfaces have only the method declaration(signature), not the method body(method definition) 

3.Multiple Inheritance is not possible in java by using the classes 
because two independent parent classes can have any method signature and if the child class tries to access the parent,
it will get confused thaat which parent class method it tries to access.

4.If any of the method is marked as abstract then whole class should be marked as abstract.

5.Abstract classes cannot be instantiated means we can't the object out of a abstract class.

6.Intrefaces cannot be instantiated means we can't the object out of an interface.

7.Concrete method: Method that has both the method declaration(signature) and also method definition(method body).

8.Abstract method: Method that has only method declaration not the method definition.

*/