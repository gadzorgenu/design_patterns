
There are 3 categories of design patterns: 
**Creational patterns, behaviour patterns and structural patterns**

# Creational Patterns
Focuses on object creation mechanisms, providing flexibility in creating objects and isolating the details of object instantiation.
They help to decouple the client code from the specific classes and make the system more flexible and reusable.
Examples:
1) **Singleton pattern:**  Ensures a class has a only one instance and provides a global point of access to it. 
Useful when you want ot restrict object creation to a single instance, such as a logger ot a database creation

2) **Factory method pattern:**  Defines an interface for creating objects, but lets subclasses decide which class to instantiate.
Allows client code to create objects without specifying the exact class of the object that will be created

3) **Abstract factory pattern:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
It allows you to create objects that are related and designed to work together without coupling them to specific classes

4) **Builder pattern :** Separates the construction of complex objects from their representation, allowing the same construction process to create different representations.
It is useful when you want to create complex objects step by step, providing control over the construction process.

5) **Prototype pattern:** Creates new objects by copying existing ones and modifying them as required. 
The pattern avoids the need for subclassing to create new objects, providing an alternate way to create objects based on existing ones 

# Structural Patterns
They deal with object composition, providing ways to create relationships between objects and form larger structures while keeping the sysytem flexible and efficient.
They help in defining how objects and classes can be combined to form larger structures and provide new functionality
Examples: 
1) **Adapter Pattern:** Converts the interface of a class into another interface that clients expect, enabling classes with incompatible interfaces to work together. 
It allows objects with different interfaces to collaborate without modifying their existing code.

2) **Decorator pattern:** Dynamically adds new behavior to an object by wrapping it with one or more decorator objects. 
This pattern provides an alternative to subclassing for extending an object's behavior at runtime.

3) **Proxy Pattern:** Provides a surrogate or placeholder for another object to control access to it. 
It allows you to add an additional layer of indirection to control the access to an object, enabling you to perform additional operations before or after accessing the real object.

4) **Composite Pattern:** Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions uniformly. 
It lets you represent objects in a hierarchical structure, simplifying the client's code when working with both individual objects and groups of objects.

5) **Facade Pattern:** Provides a simplified interface to a subsystem of classes, making it easier to use.
It encapsulates a complex subsystem behind a simpler interface, providing a higher-level interface that is easier to understand and use.

# Behavioural Patterns
They focus on the interaction between objects, defining how they communicate and distribute responsibilities.
They provide solutions for effective communication and collaboration between objects, enhancing flexibility and maintainability.
Examples:

1) **Observer pattern:** Defines one-to-many dependency between objects, so that when one object changes state, all its dependencies are notified and updated automatically. 
It establishes a publish-subscribe relationship, where the observers ( subcribers) are notified of changes in the observed subject (publisher)

2) **Strategy pattern:** Encapsulates interchangeable algorithms within a family of classes and makes them interchangeable at runtime.
It allows you to define a family of algorithms and select one at runtime without tightly coupling the objects.

3) **Command pattern:** Encapsulates a request as an object, therby allowing users to parameterize clients with queues, requests and operations.

4) **Interpreter Pattern:** Defines a representation of grammar and provides an interpreter to interpret sentences in the language.

5) **Template Method pattern:** Defines the skeleton of an algorithm in a base class, allowing subclasses to provide specific implementations of certain steps


**Each design pattern categories addresses specific design problems and provides proven solutions that promote modularity, reusability, and maintainability in software development. 
By understanding and utilizing these patterns, developers can improve the structure and flexibility of their code, making it easier to manage and extend over time.**


**Inheritance is static whilst composition is dynamic**

# Java Reflection API

Used as a class manipulator to manipulate classes and everything in a class.
Because it is dynamic,it can slow down a program because the JVM can't optimize the code.

Should be used sparingly because it is used to access private fields and methods.

