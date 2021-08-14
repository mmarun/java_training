===Creational Patterns =====

Singleton
Abstract Factory
Simple Factory..

===== Behavioral Patterns =======

Decorator Pattern - 7-8 years...
Gang of Four - Design patterns..

======================================

SOLID (Actually very helpful when you write code)

S - Single Responsibility 

A class should serve a set of related functionality..

Logger - Logs application errors and warning.. (It should do only this) 
Logger is also doing file handling and if it has an abstract method called create File, readFile ..

Functions 
readFile - Read file
closeFile - close a file dont change its directory or access specifiers like readonly or hidden ..


Advantages - It facilitates code re-use..

Flexible to write logs to the file, Database, some Queues...

Logger has code to add to integers..

O - Open for extension and Closed for modification:



L - Leskov Substitution Principle 

Interface Rectangle
setWidth
setHeight

NormalRectangle 
setWidth - (It will change the width)
setHeight - (It will change the height)

Square
setWidth (It will change both Height and Width)
setHeight (It will change both Height and Width)

Client (Passing the square as a Rectangle)
Rectangle is an interface and Square is a concrete class.

setWidth to 10 - Width = 10, H = 10...

setheight to 5.. w = 5, h = 5

5 * 10 = 50
5 * 5 = 25...



I - Interface Segregation Principle 

Dont have a very huge interface..
Break it down with smaller interfaces..

Bird interface -- Ostrich cannot fly, Crows cannot swim...
very small and efficient interfaces..

Flyable interface..
void fly() -- No

Swimmable Interface...
void swim() -- No

Normal Bird interface...

void weight() -- yes
void color() -- 
void size() s 

Ostrich implements Bird
Sparrow implements Flyable, Bird
Crane implements Flyable, Bird, Swimmable..
Dog implements Swimmable

D - Dependency Injection

====================================
If parent is driving kids to school parent is dependent on kids.. (Kids throw a tantrum then what can a driver do)
If school bus is used it inversed the dependency (They should be at a location)


Client was dependent on implementation...
Client became free and dependency was transferred to the implementor..
 ========================================