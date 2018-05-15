# README #

Katalon Studio automation examples using http://www.automationpractice.com (Shown below)

![AutomationPractice.com](http://tinyimg.io/i/TL2x0eg.png)

### Who is this repository for? ###

Newcomers to Katalon interested in automated web testing, looking for examples

### What is Katalon Studio? ###

Freeware tool for easy creation of automated web and mobile testing, with little to no programming required

See [here ](https://www.katalon.com/about-us/)for official About page

See [here ](http://www.qatestingtools.com/testing-tool/katalon_studio)for more details from QA Testing Tools

### What exactly is this? ###

A BASIC Katalon Studio Project covering the following:

* Automating the purchase of an item from automationpractice.com including signing up for an account

* Calculating that the prices including shipping are correct

* Use of custom keyword to [generate random email](https://forum.katalon.com/discussion/6532/random-e-mail-generation)

* Basic scripting to perform some mathematics and try and catches

* Test Objects required to perform the test cases


Specifically covering 2 scenarios that were requested from a fellow tester as proof of automation ability prior to being offered a job.

Four scenarios in total were requested:

### Scenarios requested ###
1.       Positive test : add a product to check out, register as new customer and complete the checkout

2.       Positive test : add a product to check out, login as existing customer and complete the checkout

3.       Negative Test :  add a product to check out, try to login and complete password recovery

4.       When you do test 1 can you also confirm the total is calculated correctly

Scenario 1 runs all the way through from clicking to add an item to shopping cart through registration and on to confirmation of order.

Scenario 2 has been left out purposefully for others to figure out using what is given in the scenario 1 test case, more test objects will need creating.

Scenario 3 that was requested is actually impossible as the webpage given doesn`t send out recovery emails?

Scenario 4 will check the price of the item at the point it was added to the cart, against the price when in the cart and that the total cost including shipping is correct, a basic output is printed to the console.

### How do I get set up? ###

* Sign up for an account at [Katalon.com](https://www.katalon.com)
* Download the correct version of Katalon for your operating system
* Extract folder from the download file and run katalon.exe from the extracted folder to start Katalon

    ![Katalon.exe icon](http://tinyimg.io/i/4qyvZ6j.png)

* Once Katalon starts up enter your account details when prompted and run through the welcome pages
* Open Katalon Studio preferences (Ctrl+SHIFT+P or via Window > Katalon Studio Preferences)
* Expand the Katalon option and click on Git
* Tick the checkbox to Enable Git Integration
* Click Apply followed by OK to close Katalon Studio preferences
* The git icon on the main window ribbon second from the right is now active 

    ![Git icon on ribbon](http://tinyimg.io/i/sENbJOf.png)

* Click to open the git drop down and choose clone
* Enter this repositorys address: https://anthonyfromtheuk@bitbucket.org/anthonyfromtheuk/automationpractice.git
* Click next followed by next and then finish
* You can now run either of the two test cases by expanding Test Cases and double clicking on either scenario test case to load it up and then click the play button on the ribbon!


### Want to Contribute? ###

Please critic and or suggest improvements, branch off & add more test cases


###Improvements to consider###

How to make the scripts run faster?

How to make the code cleaner?

Are there better approaches to obtain the same results?

More?


### Who do I talk to? ###

* Anthony O`Donnell - [LinkedIn](https://www.linkedin.com/in/anthonyodonnell)

