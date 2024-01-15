public class OpenedClosedPrinciple {
    /*
    * The Open/Closed Principle is one of five design principles for object-oriented software development described by Robert C. Martin.

Robert C. Martin considered this principle as the “the most important principle of object-oriented design”. But he wasn’t the first one who defined it. Bertrand Meyer wrote about it in 1988 in his book Object-Oriented Software Construction. He explained the Open/Closed Principle as:

“Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification.”
The general idea of this principle is great. It tells you to write your code so that you will be able to add new functionality without changing the existing code.


As applications evolve, changes are required. Changes are required when new functionality is added or existing functionality is updated in the application. Often in both situations, you need to modify the existing code, and that carries the risk of breaking the application’s functionality. For good application design and the code writing part, you should avoid change in the existing code when requirements change. Instead, you should extend the existing functionality by adding new code to meet the new requirements. You can achieve this by following the Open Closed Principle.

“Open for extension “: This means that the behavior of a software module, say a class can be extended to make it behave in new and different ways. It is important to note here that the term “extended ” is not limited to inheritance using the Java extend keyword. As mentioned earlier, Java did not exist at that time. What it means here is that a module should provide extension points to alter its behavior. One way is to make use of polymorphism to invoke extended behaviors of an object at run time.

“Closed for modification “: This means that the source code of such a module remains unchanged.
It might initially appear that the phrases are conflicting- How can we change the behavior of a module without making changes to it? The answer in Java is abstraction. You can create abstractions (Java interfaces and abstract classes) that are fixed and yet represent an unbounded group of possible behaviors through concrete subclasses.















    * */
}
