The Observer pattern is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes , usually by calling one of their methods.
**When to use the observer pattern**
* When you need other obejects to receive an update when another object changes
  The subject (Publisher) sends many stocks to the Observers
The observers (subscribers) takes the ones they want and use them

**Benefits of observer pattern**
* Loose coupling: The Subject(publiser) does not need to know anything about the Observer( subcriber)

**Disadvantage of Observer pattern**
* The subject(publisher) might send updates that don't matter to the Observer(subscriber)

