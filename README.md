# Project 4 - Visitor
COMP 373/473 - Project 4 - Visitor Pattern - Joseph Conroy and Nigel Castelino

Our other Project 4 program, using the Builder Pattern, can be found [here.](https://github.com/jconroy5/Project-4-Builder)

The complete documentation on both programs can be found [here.](https://docs.google.com/document/d/1BW9LqjgYKb-UkST9ezza5xXmOWNW3Q2J5LcnLgNSkGA/edit?usp=sharing)

# To run the client:
Run SystemCheck.java, found in 
```
src/com/visitor/client
```

# Project Description:
For our Visitor pattern, we created a System Check program which checks the status of peripherals and components of a computer or laptop. The visitor pattern works well for this type of program, as it allows for a visitor class to visit each peripheral used by a computer or laptop, and report its status to the console. Without using this pattern, each peripheral would have to use its own unique method for checking and reporting its status, which is far less efficient.

The client package contains SystemCheck, which contains the program’s main method. The method initiates two new peripherals, a Computer and a Laptop, and then has each one accept the PeripheralChecker visitor, which reports the status of each component to the console as it visits them.

The visitors package contains the ComputerVisitor interface, and its implementer, PeripheralChecker. Each visit method in PeripheralChecker contains the status of the specified peripheral (e.g. Keyboard, Mouse, etc.). By default, when a peripheral is visited, it reports that it is functioning normally. However, each method could be expanded so that, in a more advanced scenario, different reports could be made depending on the behavior or detection of a given peripheral.

The elements package contains the Peripheral interface, as well as all of its implementers. The Peripheral interface has an accept method, used to accept ComputerVisitor implementations (in this case PeripheralChecker). Computer and Laptop are implementations of Peripheral, and the accept method for each uses an array (called computer/laptopPeripherals) containing the peripherals typically attached to it based on type (e.g. a Laptop typically has a trackpad, webcam, microphone, etc.). The method iterates through the array, accepting the ComputerVisitor for each peripheral.

# Project Rubric:

Project 4: Implementing Patterns II

Project Description:

In this project, we will practice the implementation of design patterns.
You need to design and implement:

– Visitor Pattern

– Any Pattern of your choice from the list that we have covered in class “Patterns Deep
Dive II”. 

You can implement both patterns in the same implementation or separately.

Supporting documents:

- Class notes and examples as well as links for patterns

- Design Patterns book by Gamma

- Search on the web to get more information on the patterns

Project Expectation:

- Group executed project

- Submission of Design and Code

Project Submission and Grading:

- 10% of total grade

- Email

- Complete documentation on what problem you solved with the patterns

- Your code OR the location of your solution for the implementation

Project Due Date:

- Submission of the Implementation: EOD 04/21/2019
