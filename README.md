# smartwatch
sample for java
Step 1: Set Up Your Java Development Environment
Install Java:
Ensure you have Java Development Kit (JDK) installed. If not, you can download it from the official Oracle JDK website or use OpenJDK.

Set Up Environment Variables (Optional):
Set up the PATH environment variable to include the JDK's bin directory so you can run javac and java from the terminal.

Step 2: Create the SmartWatch Class
Create a New File for SmartWatch Class:
Create a new file named SmartWatch.java and open it in your favorite code editor.

Define the SmartWatch Class:
Copy and paste the provided SmartWatch class code into SmartWatch.java. This class represents a smartwatch and contains properties and methods to display information and perform actions.

Save the File:
Save the SmartWatch.java file.

Step 3: Compile the SmartWatch Class
Open Terminal:
Open a terminal or command prompt.

Navigate to the Directory Containing SmartWatch.java:
Use the cd command to change the directory to the location where SmartWatch.java is saved.

Compile the SmartWatch Class:
Run the following command to compile the SmartWatch class:

bash
Copy code
javac SmartWatch.java
Step 4: Create the MainWatch Class
Create a New File for MainWatch Class:
Create a new file named MainWatch.java and open it in your code editor.

Define the MainWatch Class:
Copy and paste the provided MainWatch class code into MainWatch.java. This class creates a SmartWatch instance, sets its properties, and invokes its methods.

Save the File:
Save the MainWatch.java file.

Step 5: Compile the MainWatch Class
Open Terminal:
Open a terminal or command prompt.

Navigate to the Directory Containing MainWatch.java:
Use the cd command to change the directory to the location where MainWatch.java is saved.

Compile the MainWatch Class:
Run the following command to compile the MainWatch class. The -cp flag specifies the classpath and includes the current directory:

bash
Copy code
javac -cp . MainWatch.java
Step 6: Run the Java Program
Run the Java Program:
Run the compiled Java program using the java command:

bash
Copy code
java MainWatch
The program will create a SmartWatch instance, set its properties, and display information about the smartwatch, simulate displaying notifications, and simulate making a call.

Step 7: Customize and Experiment
Feel free to customize the properties and behavior of the SmartWatch class to match your requirements. You can modify the properties, add new methods, or enhance the display formatting in the displayInfo() method.

Experiment with different values for the smartwatch properties and observe how the information is displayed when you run the program.

Congratulations! You've now successfully created and used the SmartWatch class in Java. Feel free to explore and extend the functionality based on your needs.
