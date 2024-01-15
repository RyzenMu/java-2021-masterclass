public class LiskovSubstitution {
    /*
    * The Liskov substitution principle, written by Barbara Liskov in 1988, states that functions that reference base classes must be able to use objects of derived (child) classes without knowing it. It’s important for a programmer to notice that, unlike some other Gang of Four principles, whose breaking might result in bad, but working code, the violation of this principle will most likely lead to buggy or difficult to maintain code.
Liskov Substitution Principle states the following: “in a computer program, if S is a subtype of T, then objects of type T may be replaced with objects of type S (i.e., objects of type S may substitute objects of type T) without altering any of the desirable properties of that program (correctness, task performed, etc.)”. Simply said, any object of some class in an object-oriented program can be replaced by an object of a child class.
Subtypes must be substitutable for their base types.


Inheritance is a concept fairly simple to understand. It is when an object or a class are based on another object or class. When a class is “inherited” from another class, it means that the inherited class (also called subclass, or child class) contains all the characteristics of the superclass (parent class), but can also contain new properties
A subtype doesn't automatically become substitutable for its supertype. To be substitutable, the subtype must behave like its supertype.

An object's behavior is the contract that its clients can rely on. The behavior is specified by the public methods, any constraints placed on their inputs, any state changes that the object goes through, and the side effects from the execution of methods.

Subtyping in Java requires the base class's properties and methods are available in the subclass.

However, behavioral subtyping means that not only does a subtype provide all of the methods in the supertype, but it must adhere to the behavioral specification of the supertype. This ensures that any assumptions made by the clients about the supertype behavior are met by the subtype.

This is the additional constraint that the Liskov Substitution Principle brings to object-oriented design.







    * */
}
