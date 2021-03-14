# Java Basics Notes

To execute a Java program in InteliJ open the Run Window (shortcut: CTRL + R)

To invoke Java Compiler (manually)

    javac Main.java

But InteliJ does this automatically and stores the Class file somewhere else

.class files are platform independent and can run on any machine that has a Java Runtime Environment (JRT)

To invoke Java Virtual Machine (JVM) manually:

    java com.hellowhirl.Main

- When we run a program from InteliJ all these steps are hidden from us

"Programming and problem sovling is all about trade offs""

## Clean Coding

Ideally our methods should be between 5 - 10 lines of code (no more than 20)

Measures to take:

- Extracting methods when there are groups of related code together
- Refactor repetitive patterns 

IntelliJ allows us to refactor method by highlighting related code and selecting:

`Refactor -> Extract1 Method`

- We will get prompted for name of method, parameters, and see preview
