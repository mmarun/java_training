Dependency lifecyle management means..

Configuration before creation
Configuration after creation
Actual execution.
Number of instances creation
Configuration before destruction the object
Configuration after the destruction of the object..
 

Spring CORE contains an IOC container.

IOC - Inversion of Controls.
It manages dependency injection 

Rather than creating the class object by new method the spring container users reflection

Class.forName
Class.newInstance 

------------------------------------------------

Spring framework there are two classes 1. Application context and 2. BeanFactory (deprecated)..

-- Bean scope --
When is a bean created...
Bean will be created based on its scope - 
Singleton - same object will be passed for all getBean instances..
Prototype - everytime you say getBean then a new bean is created..
