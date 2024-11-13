###### metadata
**source** -> https://www.linkedin.com/learning/java-essential-training-syntax-and-structure-16025610/learn-the-essentials-of-java-17?contextUrn=urn%3Ali%3AlyndaLearningPath%3A632b30d9498ed176d11f2931
###### introduction
- [ ] computers do not think, they cannot think of themselves
- [ ] program is a set of instructions that a computer follows to perform a task
- [ ] programming languages are translated into the machine code
- [ ] algorithm -> is a step-by-step guide to completing a task
- [ ] algorithm can be written using programming language
- [ ] before creating algorithm, you need to have a problem, find what are the input-output values, and set the instructions that should be done to get from input result the output result
- [ ] algorithm of calculating an employee's gross pay:
    - [ ] 1. get the number of hours worked
    - [ ] 2. get the hourly pay rate
    - [ ] 3. multiply hours by pay rate
    - [ ] 4. display results
###### getting started with java
- [ ] ide -> is on Integrated Development Environment
- [ ] using the java version 17, from vendor Oracle, OpenJDK
###### java basics
- [ ] package -> is a folder or container that holds java files
- [ ] you can have multiple packages. packages are grouped for the logical grouping of the files
- [ ] the java convention is for ==package names== to be ==lowercase==
- [ ] by convention, java classes naming start with an uppercase letter
- [ ] no spaces allowed in java class naming
- [ ] keep all the words together, each word should start with an uppercase letter
- [ ] the statement is the one instruction
- [ ] reserved words -> words that in a programming language have with a predefined meaning
###### variables
- [ ] comments are ignored
- [ ] variable -> is a memory location that stores data
- [ ] dynamically typed programming languages -> variable types are determined at runtime through context in the code
- [ ] statically typed programming languages -> variable types must be declared before the program can be complied (the java is this type of language)
- [ ] primitive data types in java:

| Name    | Default  | Size   | Type           | Example           |
| ------- | -------- | ------ | -------------- | ----------------- |
| byte    | 0        | 8-bit  | Integral       | byte b = 100;     |
| short   | 0        | 16-bit | Integral       | short s = 10000;  |
| int     | 0        | 32-bit | Integral       | int i = 100000;   |
| long    | 0L       | 64-bit | Integral       | long l = 9999999; |
| float   | 0.0f     | 32-bit | Floating point | float f = 123.4f; |
| double  | 0.0d     | 64-bit | Floating point | double d = 12.4;  |
| boolean | FALSE    | 1-bit  | Boolean        | boolean b = true; |
| char    | '\u0000' | 16-bit | Character      | char c = 'C';     |
- [ ] java supports type inferences, where for the local variables the type is specified by java. to use it, use the reserved word 'var' (can be declared inside the methods)
- [ ] var cannot be used to declare the global variable (class scope)
- [ ] do not abbreviate variable names. make the understandable and short variables for the others to read them comfortably
- [ ] give variables descriptive names. follow the conventions. write code that others can easily understand
- [ ] variable name conventions
    - [ ] variables start with a lowercase letter -> int hours;
    - [ ] variables use the camel case -> double payRate;
    - [ ] cannot contain spaces (payRate)
    - [ ] can contain numbers (hour1)
    - [ ] cannot start with a number (1hour)
    - [ ] can contain some special characters as the ==dollar sign==, ==underscore== (tax_rate)
    - [ ] special character ==dash sign== is not allowed (tax-rate)
    - [ ] cannot  be reserved words (class)
- [ ] the compiler will identify  invalid variable names
- [ ] hard-coded variables will be the same every time the program is executed
- [ ] when given a default value to a variable, this process is known as *initialization*
- [ ] arithmetic operators in java perform basic calculations on numeric values (byte, short, int, long, float and double)
- [ ] arithmetic operators in java:

| Operator | Description                                                    | Example | ? Overloaded use              |
| -------- | -------------------------------------------------------------- | ------- | ----------------------------- |
| +        | Adds two numeric values                                        | a + b   | appending a value to a string |
| -        | Subtracts one numeric value from another                       | a - b   | --                            |
| *        | Multiplies two numeric values                                  | a * b   | --                            |
| /        | Divides one numeric value by another                           | a / b   | --                            |
| %        | Returns the remainder of dividing one numeric value by another | a % b   | --                            |
- [ ] note: java infers the data type by the value that is assigned
###### decision structures
- [ ] if statement -> if certain situation occurs, do something and then go back to the main flow
- [ ] include curly braces '{ }' for the if statements that contain 2+ statements
- [ ] for the 1 statements only what is enclosured by if statements, the curly braces '{}' can be skipped
- [ ] if-else statement -> if a certain situation occurs, do something. Otherwise, do something else
- [ ] if-else-if statement:
    - [ ] if situation A occurs, do something.
    - [ ] else if situation B occurs, do something else.
    - [ ] else if situation C occurs, do something else.
- [ ] switch statement:
    - [ ] if situation A occurs, do something.
    - [ ] else if situation B occurs, do something else.
    - [ ] else if situation C occurs, do something else.
- [ ] the difference between "if-else-if" and "switch":
    - [ ] if-else-if checks if the provided statement is true
    - [ ] switch checks for the equality between the switch-statement and the provided one
- [ ] switch statement cases do not use curly braces "{}". instead, you are using the tabulation, and the keyword "break" to finish the sequence of the statements
- [ ] switch statements have the event called "fall-through". it happens when you do not put in some case the keyword "break" and the switch statement continues to check the another cases
- [ ] switch expressions allow to directly assign a value to a variable when case is matched
- [ ] switch expression that return the value, and has only 1 expression, can use the arrow "->" sign and the following structure
- [ ] switch expressions that contain the more than 1 expression, should use the curly braces "{}" for enclosing the statements and the returning statement declared by the word "yield"
- [ ] switch statement vs switch expression:
    - [ ] switch expressions are great when you need to assign a value
    - [ ] switch statements are better when you need to invoke the statements

| Operator | Expression | Result |
| -------- | ---------- | ------ |
| >        | 2 > 3      | FALSE  |
| <        | 2 < 3      | TRUE   |
| >=       | 4 >= 4     | TRUE   |
| <=       | 4 <= 3     | FALSE  |
| ==       | 3 == 2     | FALSE  |
| !=       | 3 != 2     | TRUE   |
- [ ] single equal sign "=" is used for the assignment (assigning a value to a variable)
- [ ] logical operators are used to combine boolean expressions into one value

| Operator | Meaning | To Be True                          |
| -------- | ------- | ----------------------------------- |
| &&       | AND     | Both conditions must be true        |
| \|\|     | OR      | At least one condition must be true |
| !        | NOT     | Condition must be false             |
- [ ] short circuiting -> stops evaluating condition once the result is clear
###### repetition structures
- [ ] loops -> structures that cause a block of code to repeat
- [ ] key points about while loops
    - [ ] condition controlled -> loop continues running while the specified condition remains true
    - [ ] pretest -> condition is tested before entering the loop
    - [ ] execution -> best to use when the loop may or may not need to execute based on the situation
- [ ] "do while" -> loop that executes. then checks the condition to determine whether to repeat
- [ ] key points about do-while loops
    - [ ] condition controlled -> loop continues running while the specified condition remains true
    - [ ] post-test -> condition is tested after completing the loop
    - [ ] execution -> best to use when the loop may or may not need to execute based on the situation
- [ ] "for" -> loop that executes a specified number of times
- [ ] key-points about for loops
    - [ ] count-controlled -> loop runs specified amount of times
    - [ ] pretest -> condition is tested before entering the loop
    - [ ] execution -> best to use when you know how many times the loop should be executed
- [ ] nested loops -> are the loops inside loops
- [ ] break statement -> will end the loop no matter what iteration it is on
###### methods
- [ ] methods -> collection of code statements that perform a specific task
``` java

	method_header
			\_
	public static int calculateSum(int number1, int number2) {
		int sum = number1 + numer2;
		return sum;
	}
	
	access_modifier non-access_modifier return_type name_of_method(parameter_list)
```
- [ ] ==the header== -> the first line of the method
- [ ] ==access modifier== -> the first word in the method header
- [ ] ==access modifiers== -> indicate who is allowed access to use this method
    - [ ] ==public== means that any code from any class can use this method
    - [ ] if none is specified, the access level is ==private== and is accessible only from the domestic package
- [ ] non-access modifiers include ==static==, ==final==, ==abstract== and ==synchronized==
- [ ] ==return type== -> indicates the data type of the value that the method will return back
    - [ ] if the method does not return anything, the return type of this method is ==void==
- [ ] a method can only return one value
- [ ] naming should reflect the tasks the method was designed to do
- [ ] method naming convention -> it should begin with the verb, following the nouns or the adjectives to describe the action that will be done
- [ ] method naming convention -> naming should begin with the lowercase letter
- [ ] method naming convention -> if method returns the boolean data type, its naming "asks the question"
- [ ] ==parameter list== -> a comma-delimitated list of input into the method. it is the data that is supplies the method with all information needed
- [ ] ==method's signature== -> consists of the name of the method and the method's parameter list
- [ ] ==method's signature== must be unique within the class, as this is how the method is identified
- [ ] ==method's body== -> set of statements presented in the method (in the curly braces) that are to be executed fro the time this method is called
- [ ] if method has anything else than ==void== specified as the ==return type==, the ==method must include a return statement==
- [ ] ==return statement== -> returns the value which matches the return type specified in the header
- [ ] methods are executed in the order they are called
- [ ] variable scope -> variables are only valid within the scope in which they are defined
- [ ] scope is defined within the parentheses
- [ ] ==local variables== -> variables defined within methods, including within blocks, such as loops, and decision structures
- [ ] ==global variables== -> variables defined outside of methods.
- [ ] the scope of the ==global variable== is the entire class
- [ ] variables can have the same name if they are within the different scope
- [ ] ==this== (keyword) -> used for the referencing the class itself
- [ ] ==local variable declaration== -> used when the variable is needed within a limited scope
- [ ] ==global variable declaration== -> used when variable is needed within multiple methods
- [ ] parameters require the data and naming for the each variable passed
- [ ] ==overloaded methods== -> are the methods within the same class that have the same name, but different signatures
###### objects
- [ ] ==object== -> stores its state in fields (variables) and its behavior in methods
- [ ] ==encapsulation principle== -> specifies that the data of a class (which are fields) *should be private* and the behavior of the class (which are the methods) *can be public* for the other classes to use
    - [ ] =="public" access modifier== -> any class can access, use, or refer to the field
    - [ ] =="private" access modifier== -> only the current class can access, use, or refer to the field
    - [ ] =="protected" access modifier== -> only other classes within the same package can access it. *similar to having no access modifier at all*
- [ ] ==constructor== -> initializes a field or fields in an object. sets up the state of the class
    - [ ] ==default constructor== -> constructor with no parameters.
    - [ ] *every class in java has a default constructor*
    - [ ] 
- [ ] ==constructors== are not methods, because they do not return the value
- [ ] ==constructor's name== should be the exact same name as the name of the class
- [ ] constructors override the properties no matter what access modifier do they have
- [ ] to get an object, you need to instantiate the class
- [ ] objects do use class data types
- [ ] =="new"== keyword -> creates the instance of the class
- [ ] ==wrapper class== -> is an object representation of a primitive data type
    - [ ] the benefit of using ==wrapper class==, as opposed to the primitive data types, is the ability to utilize convenience methods that are available within the wrapper class
- [ ] primitive data types wrapper classes:

| Primitive Data Type | Wrapper Class |
| ------------------- | ------------- |
| byte                | Byte          |
| short               | Short         |
| int                 | Integer       |
| long                | Long          |
| float               | Float         |
| double              | Double        |
| boolean             | Boolean       |
| char                | Char          |
- [ ] ==record== -> a simple data class with only fields and methods to access those fields
``` java
// array example
public record Account(
	int id,
	int customerId,
	String type,
	double balance) {}
```
- [ ] ==records== can be instantiated just like classes
- [ ] ==records== are immutable. their fields on the definition are final
- [ ] ==POJO== -> Plain Old Java Object. the types of classes as the records and so on
###### arrays
- [ ] ==arrays== -> special container variables, that hold multiple values
``` java
// array example
String[] players = new String[6];
```
- [ ] the number inside the brackets represents the length of the array (meaning, how many values does this array can store)
    - [ ] one the length is declared -> it is fixed (final)
- [ ] ==variable arguments (varargs)== -> method parameter that accepts an arbitrary number of values
    - [ ] a method can only have one varargs parameter
    - [ ] the varargs parameter must be the last parameter
``` java
// vararg example
public static void calculateSum(int ...a) {
	 int sum = 0;
	 for (int i = 0; i < a.length; i++) {
		 sum = sum + a[i];
	 }
	 System.out.println(sum);
}

// vararg utilization
calculateSum();
calculateSum(2, 4);
calculateSum(2, 4, 6, 8, 10);
calculateSum(new int[]{3, 4, 6, 7});
```
###### text processing
- [ ] ==string== -> an object that is a sequence of characters
- [ ] ==text blocks== -> """ (for the multiple line text processing)
``` java
// text bloxk example
// ! it is important to start the new line after the """
return """
		Hey all! 
		""";
```