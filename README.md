# Advanced-Assignments
## Building a Weather Monitoring System
To Build a Weather Monitoring System I implemented the Observer design pattern with the addition of decorator pattern to extend the behavior of observers. 

  In the Observer design pattern identifying the ```weather_subject``` interface watch is defined the method add, remove notify  Observers, identifying ``` weather_subject``` that implements the subject interface that notify the observers,  identifying ``` weather_observer ``` interface that implemented by ```current_conditions``` & ```statistics ``` that  need notify of change weather state.


In the  decorator pattern identifying the ```weather_decortor```  that is base   for decorators classes , that implements the  ```weather_observer ``` interface, the``` temperature_units```,```wind_spee```, ```precipitation``` extend, and the adding the additional responsibilities  to display additional information 

And that achieves design principles :  

+ Single Responsibility Principle:
Thet achieved in the  ``` weather_subject```, ```current_conditions```,``` statistics``` classes have a single clear purpose.
+ Open/Closed Principle:
Thet achieved in the``` weather_observer``` interface and its implementations are closed for modification but open for extension via decorators.
+ Interface Segregation Principle:
Thet achieved in the ```iweather_subject```, ```weather_observer``` contain specifically what's needed.
+ Dependency Inversion:
Thet achieved in the  High-level ```weather_subject``` depends on abstraction ```weather_observer```. This decouples the design.
### class diagram 
![class digram hw 3](https://github.com/halaassi/Advanced-Assignments/assets/92643585/596adcae-e889-43eb-9cd9-bb678d7f47aa)

