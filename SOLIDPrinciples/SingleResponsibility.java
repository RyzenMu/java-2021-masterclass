public class SingleResponsibility {
    /*
    * A class should have one, and only one, reason to change.
As the name suggests, this principle states that each class should have one responsibility, one single purpose. This means that a class will do only one job, which leads us to conclude it should have only one reason to change.
We don’t want objects that know too much and have unrelated behavior. These classes are harder to maintain. For example, if we have a class that we change a lot, and for different reasons, then this class should be broken down into more classes, each handling a single concern. Surely, if an error occurs, it will be easier to find.


Frequency and Effects of Changes:
We all know that requirements change over time. Each of them also changes the responsibility of at least one class. The more responsibilities your class has, the more often you need to change it. If your class implements multiple responsibilities, they are no longer independent of each other.You need to change your class as soon as one of its responsibilities changes. That is obviously more often than you would need to change it if it had only one responsibility.That might not seem like a big deal, but it also affects all classes or components that depend on the changed class.
In the end, you need to change your class more often, and each change is more complicated, has more side-effects, and requires a lot more work than it should have. So, it’s better to avoid these problems by making sure that each class has only one responsibility.

Easier to Understand
The single responsibility principle provides another substantial benefit. Classes, software components and microservices that have only one responsibility are much easier to explain, understand and implement than the ones that provide a solution for everything. This reduces the number of bugs, improves your development speed, and makes your life as a software developer a lot easier.


Summary
The single responsibility principle is one of the most commonly used design principles in object-oriented programming. You can apply it to classes, software components, and microservices.

To follow this principle, your class isn’t allowed to have more than one responsibility, e.g., the management of entities or the conversion of data types. This avoids any unnecessary, technical coupling between responsibilities and reduces the probability that you need to change your class. It also lowers the complexity of each change because it reduces the number of dependent classes that are affected by it. However, be reasonable.

    * */
}
