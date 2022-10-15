# Running the `donor.java` file

Link for code - [Donor.java](https://github.com/jacob5412/Java-Programming/blob/master/assignment4/src/Donor.java)

## Question
Write a program to demonstrate the knowledge of students in File handling
> Eg., Define a class ‘Donor’ to store the below mentioned details of a blood donor. Name, age, Address, Contact number, blood group, date of last donation Create ‘n’ objects of this class for all the regular donors at Vellore. Write these objects to a file. Read these objects from the file and display only those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.

## Instructions
**Note:** Please use an IDE to run this code.
### Ecilpse
_[Source for instructions](https://stackoverflow.com/questions/12105164/java-joda-time-download-and-install-step-by-step)_
1. Create your java project in eclipse
2. Download the latest [JodaTime](https://github.com/JodaOrg/joda-time/releases) .tar.gz file, and extract its contents
3. In Eclipse look for your project at package explorer and right click on it then call it `New -> Folder -> libs`
4. Copy/Drag joda-time-2.1.jar into the new created libs folder
5. Right click on your project again (in package explorer) then `Properties -> Java Build Path -> Libraries -> Add Jars -> joda-time-2.1.jar`
Now you can test with this code :
`DateTime test = new DateTime();`
if code compiled ok you are good to go

**OR**

_[Source for instructions](https://stackoverflow.com/questions/3280353/how-to-import-a-jar-in-eclipse)_
You can add the jar files in this [folder](https://github.com/jacob5412/Java-Programming/tree/master/assignment4/joda-time-2.4) manually.
1. You can add a jar in Eclipse by right-clicking on the `Project -> Build
   Path -> Configure Build Path`. Under Libraries tab, click Add Jars or Add External JARs and give the Jar. A quick demo [here](http://tech.bragboy.com/2016/01/quick-way-to-import-jar-in-eclipse.html).
    <p align="center">
    <img src="https://i.stack.imgur.com/A6xgq.png" width="750" alt="instructions">
    </p>
2. The above solution is obviously a "Quick" one. However, if you are working
   on a project where you need to commit files to the source control repository, I would recommend adding Jar files to a dedicated library folder within your source control repository and referencing few or all of them as mentioned above.
   
### IntelliJ Idea
_[Source for instructions](https://stackoverflow.com/questions/1051640/correct-way-to-add-external-jars-lib-jar-to-an-intellij-idea-project)_
1. Download the [.zip](https://github.com/JodaOrg/joda-time/releases) file
2. Click File from the toolbar on IntelliJ IDEA
3. Project Structure (`CTRL + SHIFT + ALT + S` on Windows/Linux, `⌘ (CMD) + ;` on Mac OS X)
   <p align="center">
    <img src="https://raw.githubusercontent.com/jacob5412/Java-Programming/master/assignment4/intelliJ-project-structure.png" width="750" alt="instructions">
    </p>
4. Select Modules at the left panel
5. Dependencies tab
6. '+' → JARs or directories

### Netbeans
_[Source for instructions](https://stackoverflow.com/questions/25847910/can-not-successfully-add-org-joda-time-2-4-library-to-netbeans)_
1. In the Projects window right-click on the `name of the project -> Properties ->  Project Properties window opens`. 
2. In Categories tree select `"Libraries" node -> On the right side of the Project Properties window press button "Add JAR/Folder" -> Select jars` you need.