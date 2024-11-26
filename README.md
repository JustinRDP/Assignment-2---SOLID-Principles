# SOLID Principles

For my three SOLID principles, I chose Single Responsibility Principle, Open/Closed Principle, and Liskov Substitution Principle.

---

## Single Responsibility Principle

**Description**:  
A class should have only one reason to change, meaning it should only have one job or responsibility.

**Importance**:  
SRP makes code more maintainable and understandable. By focusing each class on one responsibility, it becomes easier to modify, debug, or extend without affecting unrelated functionality.

**SRP Violated**:  
A user class that lets you store a user's name, save a user to a database, and send a user an email.

**SRP Solved**:  
Separating those three functions into their own classes, so that each class only has a single responsibility.

---

## Open/Closed Principle

**Description**:  
A class should be open for extension but closed for modification. This means you should be able to add new functionality through extensions (such as subclasses) without altering existing code.

**Importance**:  
OCP makes code more reusable and flexible. It allows you to introduce new features or make changes to functionality without disrupting existing behavior.

**OCP Violated**:  
Modifying the PaymentProcessor class every time a new payment method is added.

**OCP Solved**:  
Using polymorphism and an abstract class for payment methods so new payment types can be added without modifying the core logic.

---

## Liskov Substitution Principle

**Description**:  
Objects of a subclass should be able to replace objects of the parent class without affecting the correctness of the program.

**Importance**:  
LSP ensures that inheritance hierarchies are properly designed and that derived classes truly represent "specialized" versions of the base class. This prevents errors or unexpected behavior in the code.

**LSP Violated**:  
The Manager class requires extra logic that doesn’t behave consistently when substituting it for a regular Employee.

**LSP Solved**:  
Using an abstract Employee class that ensures all subclasses behave in a consistent way and don't break expectations when substituted.
