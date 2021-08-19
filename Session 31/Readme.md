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
View = is the way you want to represent data..
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


