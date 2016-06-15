#IS2545 - Deliverable 2: Unit Testing
##CitySim9002
###Joseph Bender (jdb117@pitt.edu)

https://github.com/jdbender66/CityCim9002

A lot of this code required looping and multiple iterations through the same routines. It was difficult to keep track of accumulation of variables. Also, I had to be sure to clear variables for each new user and visit to a location. In addition, the random number generator can be very tricky. You have to keep track of seed values and ranges of random numbers returned. It is extremely easy to accidentally incur an off-by-one error. Also, different increments started at different points. Obviously the arrays storing the personas and locations started at position 0. However, the visitors needed to start at 1. It was important to keep the different accumulations organized. The unit testing was also challenging. I found that I did not have a lot of value returning methods as most of my code was in the main method of the CitySim9002 class. It was simple to do double testing for the random number generator class, but I could not pinpoint where to apply unit testing in the main program. I understand the concept proposed by double and stub testing, but my program was not conducive to this. In future assignments I will code in a more object oriented fashion to facilitate more unit testing. 
