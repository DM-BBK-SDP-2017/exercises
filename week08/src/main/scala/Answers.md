# Exercises on Design Patterns II
## Even more basics
### Strategy Design Pattern, Abstract Factory Design Pattern,
### Builder Design Pattern, Facade Design Pattern, Bridge
### Design Pattern, and Composite Design Pattern


### Q1. (a) Briefly describe the Strategy Design Pattern?

The strategy pattern allows a class behaviour to be decided at runtime. Supports the principle of open for extension, closed for modification

### Q1. (b)  When is it appropriate to use the Strategy Design Pattern?

When classes of a type e.g. sealed case classes inheriting from the same trait, have similar behaviours but the same method definition 

### 3. When is it appropriate to use the Abstract Factory design pattern?

To create groups of similar objects at runtime


### 5. “In general, the details of object construction, such as instantiating and initialising the components that comprise the object, are kept within the object, often as part of its constructor.”
####Comment on this statement with reference to modularity and construction bloat. 

Object constructors generally tell us nothing about the behaviours or state of an object so are best abstracted to another class as 
it's easy to see how, with multiple constructors, a class might extend to >100 lines or more just with these low-value constructor and initialiser methods
when that would ideally be the maximum length of class for conciseness. Modularity is impossible when object instantiation is a core function of the method class being instantiated
 

7. (a) What is the Facade Pattern?

The facade pattern is a simple wrapper interface that brings severals methods across several classes into ann easier to use interface of more limited methods which then call the other methods.  

(b) When, and why, would you use the Facade Pattern?

When using a helper library that features many classes.


**11. (a) What is the Composite Pattern?**



(b) Under what conditions would you use a Composite Design Pattern?
(c) What are the four participants of the Composite Design Pattern?