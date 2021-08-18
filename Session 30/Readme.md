Monolithic application:

Single java application which usually is created using Spring/Spring boot and along with core java.
It will use Tomcat or JETTY..

In dot net will be a asp.net web application and it will be targeted IIS server..


Whenever you are using monolithic applications it will have almost every thing..

Amazon 
Customer management.. Constumer service..(10 million customers browsed amazon - Browsing) (50 million - on Prime day)
Product management.. (Same)
Delivery management.. (Heavy Increase)
Order management.. (Heavy Increase)
Inventory management.. (Same)
Sponsor management. (Slight increase)
Offers and discount management.. (Slight increase)
Prime video management.. (Remain same)
Alexa integration management.. (Remain same)

Flipkart started getting popular 2013 - 2014.
People were buying mobiles and everthing from the Brick mortar shops.
Not very sure..

Xiomi mobiles were launched in India. (Very popular)..
Flipkart. Sale started flipkart crashed..
Flipkart got free advertisement..

Disaster recovery: Something due to which your service can go down.
Db got locked..
Power failure in entire state - c
Your server is located in Mumbai and there are floods in Mumbai. Disaster.
Earth quake (Natural calamity)

Riots, terrorist attacks, Cyber attacks, Network Failure..

load balancer = Software 
Incoming requests they will route to a specific service..
10000 requests per second..
2 services and add load balancer in front of them and route the service accordingly..
load balancer (1 or 2) 

Scaling: If my load is increased at that time I must increase the number of servers or service instances..
If load is decreasing I should be able to decrease the number of server instances..

Load balancer: Software..
One server instance if it goes down then the site crashes..




Monolithic server.
Need for disaster recovery.
Need for scaling.
Load balancer.

Startup scenario:
2 servers for scaling - 2 unix servers
1 server for disaster recovery - 1 unix server
1 database 
1 load balancer..

Before AWS : There were companies like Rackspace - They used to provide server inventory..
2006 .. - 50000$ for all of this server on 2year/3year/5year contract.. Similar to your gym membership.. 
 60% startup fail in first year..

Gym membership: 1 month -  rs 3000, 3 months - 7000, 6 months - 12000, year - 16000

Innovation works: If people are not afraid to try new things they will innovate.
If people start losing their houses because they tried to innovate this is sad..

After AWS:
In order to innovate we should minimize the risk of failure..
They came up with a plan.. Buy services on hourly basis..
2 servers for scaling - 2 unix servers
1 server for disaster recovery - 1 unix server
1 database 
1 load balancer

on hourly basis..
10$ per hour 
240$ day.. 

50000$
10 * 240 = 2400$ cost for 10 days..
Try it immediately.. Check if it works..
Else bye bye... Only 2400 to test your idea..


=== AWS got popular.. and it started to make billions in revenue ======
== Microsoft will not stay away == they came with better plans than AWS ===
== VMWare came with their plans =============== 
=== Virtual box == These AWS and MS guys selling DB==== They also jumped in == They also had virtual box ===== 
Over all cloud scene today roughly..
Situation may change for better in next few years to come.


Current cloud situation...




Mono-Lithic: Single Stone..

Benefits:

Simple to design..
Simple to debug..
Simple to deploy..
Code is available at one location..


Disadvantages:
Scaling is in-efficient..
=================================================

Docker -

Big physical machines they were called as main-frame only huge companies like IBM, Hewlett Packard (HP) ... 
This was until Apple introduced Macintosh in 1984.. Apple was selling Hardware + Software...

Nobody sold only software till that point...

This was started with Microsoft. (Licensing and selling software) - (Pirates of the silicon valley)

Datacentres..
 
You had to by the server and then hire teams to maintain hardware and software on the server.
Rich people and big companies were able to afford that..
 
Some companies like Rackspace started to rent out the hardware and software to other companies.

Instead of installing OS on a physical machine what they started they started virtualization...
VMWare you would install VMWare on your machine and it allowed you to install multiple OS on one VM ware instance..
Data servers - multiple OSes were install..

=======================================================================================================

Memory requirements of OS - 5GB of space - 1 GB, other requirements..
OS - has GNOME, File handling, Networking,Device drivers, Printers, Kernel, Antivirus.. - 10GB...
They used to share this OS with multiple teams and applications...

One team will be using Dot net, other team will be using Java, One will be using Python...

In java there are multiple JDK's 1.6, 1.7 and 1.8...
JAVA_HOME = 1.6 to 1.7 and then there are 7 java applications..
There is a possibility that one team released anything and due to that other team's application stopped working..

Production outage..

============================================================================================================

Docker advantages..
Google chairman (Eric Schmidt) - Android..
Unix image (CENTOS image) - Redhat, Canonical (UBUNTU), Opensuse (Novell)

8085..
OS - Device drivers, they will remove some elements of kernel,   
2-3GB - 10-300 MB..

One application will run in one docker container..

It is as good to say one application will have its own OS. 

VMWare - at a time you can run 10 Virtual machines = (60GB)...
Docker - 10 times more efficient..

=======================================================================

Spring application..


