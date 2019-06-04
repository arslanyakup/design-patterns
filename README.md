# design-patterns

## State Design Pattern

### Problem
A monolithic object's behavior is a function of its state, and it must change its behavior at run-time depending on that state. Or, an application is characterized by large and numerous case statements that vector flow of control based on the state of the application.

### Structure
The state machine's interface is encapsulated in the "wrapper" class. The wrappee hierarchy's interface mirrors the wrapper's interface with the exception of one additional parameter. The extra parameter allows wrappee derived classes to call back to the wrapper class as necessary. Complexity that would otherwise drag down the wrapper class is neatly compartmented and encapsulated in a polymorphic hierarchy to which the wrapper object delegates.

### 	
* Consider the acceleration state of a car to sample the state design pattern.
  * 4 cases will be dealt with here for the car.
    * Start Engine
    * Stop Engine
    * Gas
    * Brake
    


More details: https://sourcemaking.com/design_patterns/state
