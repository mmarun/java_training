REST - REpresentational State Trasfer..

Based on HTTP protocol.

Request and Response as this http..

Spring Web MVC is the spring implementation for REST API and rest applications..


Prior to spring boot you used to install a container (tomcat,jetty or any other container) and then you had to configure that container..
And then you had to embed your application into that
This was a lot of work, so Spring boot does that all for you...

Spring BOOT Web MVC Starter
It a tomcat container and configures it for you..


Model - View - Controller..

Incoming requests come to the controller..

Model = Database or data..
View = is the way you want to represent data../
Controller -- Only control incoming and outgoing data...


Request comes to controller - > from controller it goes to model and performs operation -> Goes to view and returns the  view and information..

Requests will be categorized as one of four types..
CRUD -> Create, Read, Update and Delete.

Verbs - 
Create  ---- POST
Read    ---- GET
Update  ---- PUT
Delete  ---- DELETE 

Patch
Head 
Trace

URI - Uniform Resource Identifier..

Parent link...
http://localhost:8087/employees

I want employee 1 

http://localhost:8087/employees/1 - I am identifying an employee uniquely..
http://localhost:8087/employees/2 - Identify each resource uniquely..
GET..

PUT.. - Update 
Same uri.. http://localhost:8087/employees/1 
Method I will change. Instead of Get mapping we will use PUTMapping..

POST - You have a list of employees.. You want to add an employee..  
http://localhost:8087/employees
Databases have something called as ID or Identity..
First record = 1
Second record = 2 ...


100 th record will generally be 100..

This is with RDBMS- Relational Database management systems.. (SQL database)
Examples - MS - Sql Server, Oracle 9i, MS - Access, MySQL...

Other database system called NO-SQL (Now it is getting popular) 65 % RDBMS and 35% No-SQL..

200's  = It is success message. 200  - Ok, 201 - Means created , 202 - 
300's  = Redirects 
400's =  400-Bad request, 404-Object not found, 401 - Authentication failed. etc....  100000000 
500's = Server encountered an error.

You need to have a tool called as POST Man - Http CLient..
There are 10s of different http clients available in the market for Free..

Out of this Post man is the most popular.. 

choco install Postman







