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

Measures to take when refactoring:

- Extracting methods when there are groups of related code together
- Refactor repetitive patterns 

IntelliJ allows us to refactor method by highlighting related statements and selecting:

`Refactor -> Extract1 Method`

- We will get prompted for name of method, parameters, and see preview

## Debugging and Deploying Applications

### Errors

- Compile-time Erros (syntax, our IDE usually tells us these)
  - Stack Overflow
- Run-time Errors
  - Use a tool called "Debugger"
    
### Common erros

XXX DON'T DO THESE XXX
- forgeting to specific the data type of a variable
- forget to add semicolon (') unless we are defining a code block
- calling a method without using paranthesis ()
- using single quotes instead of double quotes ('single quotes represent single character')
- misspelling variable and other identifiers
- using reserved words
- using single equal sign to compare values

### Debugging

- Add breakpoints in InteliJ by clciking on colum to the left of our code
    - Java will execute all statements up that point
    - We will see a line of code highlighted, which means code hasn't been executed yet
    - Run the code from Run -> `Debug 'Main'`
    - Place the debugger at specific part of code that we are suspicious
    
- Executing Debug mode line by line
    - `Step over`: execute the current line
    - `Step into`: takes us into a method
    - `Step out`: When we are done stepping through a method we can do
    - `Stop`: terminates debug session
    
- Variables window automatically detects values of various variables in our program
    - InteliJ also shows us hints for current values of variable inline code
    - We can also add a watch on other variables that are not showing up automatically
        - We can always remove watches we don't need
    
- Frames: shows methods called in reverse order - know as the `Call Stack`

















