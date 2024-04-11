## Connecting Java to MySQL Database

There are two ways to connect Java to MySQL database: using the command line (for Windows users) or through an IDE (I will demonstrate using NetBeans IDE).

### Command Line Method

1. **Open Command Prompt**: Open CMD and type the command `cd\` to change the current directory to the root of the main drive (Please note that not using the main drive will cause the process to fail).

2. **Create Project Directory**: Execute the command `mkdir javaToMysql` to create the main folder for our project. Then, type `cd javaToMysql` to change our current directory to `javaToMysql`.

3. **Create Folders**: Create two more folders inside our main folder by executing `mkdir lib` and `mkdir src` commands. 
   
4. **Download Connector/J**: Download the Connector/J JDBC driver from [MySQL Connector/J](https://dev.mysql.com/downloads/connector/j/). Choose "platform-independent" then download ZIP version. After downloading, extract the ZIP file and locate the `mysql-connector-j-8.3.0.jar` file. Move this JAR file into the `lib` folder.

5. **Create Java File**: Change the current directory to `src` by typing `cd src`. Then, create a new Java file named `check.java` by typing the command `Notepad check.java`. Tis commad will create and open the file for you in Notepad (A pop up message from Notepad will appear to confirm creating the file. Click yes)

6. **Insert Code In Java File**: Get the code from my repo *Command Line Method/javaToMysql > src > check.java*. Then, paste it in your `check.java` file. (Don't forget to follow my comments and make the changes suitable for your database information)

7. **Compile and Run**: Compile the `check.java` file by executing `javac check.java` command (ensure that `src` directory is the current one in CMD). If there are any errors, resolve them first. Then, run your code using the command `java -cp .;C:\javaToMysql\lib\mysql-connector-j-8.3.0.jar check`, where `C:\javaToMysql\lib\mysql-connector-j-8.3.0.jar` is the path to your JAR file, and `check` is your Java file name.

### Using NetBeans

1. **Create Project**: Create a new project in NetBeans.

2. **Add Jar File To The Project**: Open project contents from the projects window, right-click on libraries, and choose "Add JAR/Folder...". Select your JAR file location and click open.

3. **Create Properties File**: Right-click on "Source Packages", choose *New > Other... > Other > Properties File*, then name it `config`.

4. **Create Java Class**: Right-click on your main package, click "New Java Class", and name it `getPropertyValues`.
   
5. **Insert Code**: Get the code from my repo and paste it
   for `config.properties`      --> *NetBeans Method/javaToMysql > src > config.properties*
   for `getPropertyValues.java` --> *NetBeans Method/javaToMysql > src > javatomysql > getPropertyValues.java*
   for `JavaToMysql.java`       --> *NetBeans Method/javaToMysql > src > javatomysql > JavaToMysql.java*

6. **Edit Code**: Follow my comments in each file and make the necessary changes suitable for your database information.

7. **Run Code**: Run your code and observe the results.

Voilà! You have successfully connected Java to your MySQL database.
