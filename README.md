# AP Computer Science A [Java 101]

### 1. Overview of Summarization

the Java Programming 2024 Edition for The AP Exam

### 2. Structure

```java
// Main.java

public class Main{ // The name of the class is the same as the file name.
	public static void main(String[] args){
		// Code here
	}
}
```

### 3. Output

```java
// Main.java

public class Main{ 
	public static void main(String[] args){
		// This function will insert a new line.
		System.out.println(”Hello World!”);
		
		// This function will not insert a new line.
		System.out.print(”Hello World!”);
	}
}
```

### 4. Variables

In Java, there are different **types** of variables, for example:

**Text Variables**

- **String** stores text
- **char** stores single characters

**Number Variables**

- **int** stores integers
- **float** stores floating point numbers.
- **double** stores floating point numbers with higher precision than float**.**

- **byte** stores numbers from -128 to 127
- **short** stores numbers from -32,768 to 32,767
- **long** stores numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

**Boolean Variable**

- **boolean** stores true/false values

**The general rules for naming variables**

- Names can contain letters, digits, underscores, and $
- Names must start with a lower letter

**Declare variables**

- Declare a single variable
    
    ```java
    // type variableName = Value;
    int myNumber = 10;
    String myText = "Hello World";
    ```
    

- Declare multiple variables of the same type
    
    ```java
    // type variableName1 = Value1, variableName2 = Value2, ...;
    int num1 = 10, num2 = 20, num3 = 30;
    String text1 = "Hello", text2 = "World";
    ```
    

### 5. Data Types

Data types are divided into **two fields**

- **Primitive data types:** byte, short, int, long, float, double, boolean, and char
- **Non-primitive data types:** String, Arrays, and Classes

**How difference between primitive and non-primitive data types?**

|  | **Primitive** | **Non-primitive** |
| --- | --- | --- |
| **Value** | must be | can be null |
| **Declare** | lowercase letter | Uppercase letter |
| **Defined** | predefined
(provided by Java) | defined by developer
(except String) |
| **Call methods to perform certain operations** | No | Yes |

### 6. Type Casting

Type casting is when you assign a value of one primitive data type to another type.

There are two kinds of casting

- **Widening Casting (automatically):** converting a smaller type to a larger type size
    - byte -> short -> char -> int -> long -> float -> double
    - Example
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		int myInt = 9;
        		double myDouble = myInt;
        	}
        }
        ```
        

- **Narrow Casting (manually):** converting a larger type to a smaller size
    - double -> float -> long -> int -> char -> short -> byte
    - Example
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		double myDouble = 9.78d;
        		**int** myInt = **(int)** myDouble; // Manual casting: double to int **by added (int)**
        	}
        }
        ```
        
    

### 7. Operators

Operators are used to performing operations on variables and values.

- **Arithmetic Operators**
    
    
    | **Operator** | **Description** | **Example** |
    | --- | --- | --- |
    | **+** | Adds together two values | x + y |
    | **-** | Subtracts one value from another | x - y |
    | ***** | Multiplies two values | x * y |
    | **/** | Divides one value by another | x / y |
    | **%** | Returns the division remainder | x % y |
    | **++** | Increases the value of a variable by 1 | ++x |
    | **--** | Decreases the value of a variable by 1 | --x |

- **Assignment Operators**
    
    
    | **Operator** | **Example** | **Same As** |
    | --- | --- | --- |
    | **=** | x = 5 | x = 5 |
    | **+=** | x += 3 | x = x + 3 |
    | **-=** | x -= 3 | x = x - 3 |
    | ***=** | x *= 3 | x = x * 3 |
    | **/=** | x /= 3 | x = x / 3 |
    | **%=** | x %= 3 | x = x % 3 |
    | **&=** | x &= 3 | x = x & 3 |
    | **|=** | x |= 3 | x = x | 3 |
    | **^=** | x ^= 3 | x = x ^ 3 |
    | **>>=** | x >>= 3 | x = x >> 3 |
    | **<<=** | x <<= 3 | x = x << 3 |

### 8. Strings

Strings are used for storing text.

- **String operators**
    - String Length
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        		System.out.println(txt.length());
        	}
        }
        ```
        
    
    - Uppercase and lowercase text
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		System.out.println(txt.toUpperCase());   
        		System.out.println(txt.toLowerCase());
        	}
        }
        ```
        
    
    - Finding a Character in a String (return index)
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		String txt2 = "Please locate where 'locate' occurs!";
        		System.out.println(txt2.indexOf("locate")); // Outputs 7
        	}
        }
        ```
        
    
    - String concatenate
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		String firstName = "Pablo";
        		String lastName = "Escoabar";
        		System.out.println(firstName.concat(lastName));
        	}
        }
        ```
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		String firstName = "Pablo";
        		String lastName = "Escoabar";
        		System.out.println(firstName.concat(lastName));
        	}
        }
        ```
        

- **Number and String**
    
    When you concatenate a string and an integer, Java will change the integer type to a string type. 
    

### 9. Math

The Java Math class has many methods that allow you to perform mathematical tasks on numbers.

- **Math operators**
    - Min and max value
        
        ```java
        // Main.java
        
        public class Main{ 
        	public static void main(String[] args){
        		int maxNumber = Math.max(5,10);
        		int lowNumber = Math.min(5,10);
        	}
        }
        ```
        
    

### 10. Short Hand If..Else

```java
// variable = (condition) ? expressionTrue : expressionFalse
// Main.java

public class Main{ 
	public static void main(String[] args){
		score = 20
		String finalState = (score > 15) ? "Congratulations!" : "Try again";
	}
}
```

### 11. Switch case

```java
// Main.java

public class Main{ 
	public static void main(String[] args){
		switch(expression){
			case x:
				//code
				break;
			case y:
				//code
				break;
			default:
				//code
		}
	}
}
```

### 12. Loop

Loops can execute a code block as long as a specified condition is reached.

- While loop
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		while(condition){
    			// code here
    			i++;
    		}
    	}
    }
    ```
    

- Do/While loop
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		do{
    			// code here
    		}
    		while(condition);
    	}
    }
    ```
    
    The loop will always be executed at least once because we write a condition below a while() function.
    

- For loop
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		for (statement 1; statement 2; statement 3){
    			// code here
    		}
    	}
    }
    ```
    
    **Example:** print a number between 0 and 4 
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		for (int i = 0; i < 5; i++){
    			System.out.println(i);
    		}
    	}
    }
    ```
    

- For-Each loop
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		for (type variableName : arrayName) {
    		  // code block to be executed
    		}
    	}
    }
    ```
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		String[] cars = {"Volvo", "BMW", "Benze" , "Alpard"};
    		for (String i : cars){
    			System.out.println(i);
    		}
    	}
    }
    ```
    

### 13. Arrays

- General
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		String[] myVariable = {"val1", "val2" , "val3"};
    	}
    }
    ```
    

- Change an Array Element
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		String[] myVariable = {"val1", "val2" , "val3"};
    		myVariable[0] = "val0";
    	}
    }
    ```
    
- Array length
    
    ```java
    // Main.java
    
    public class Main{
    	public static void main(String[] args){
    		String[] myVariable = {"val1", "val2" , "val3"};
    		int lenOfArray = myVarible.length
    	}
    }
    ```
    
- Array loop
    - For loop
        
        ```java
        // Main.java
        
        public class Main{
        	public static void main(String[] args){
        		String[] myVariable = {"val1", "val2" , "val3"};
        		for (int i = 0; i < myVariable.length; i++) {
        		  System.out.println(myVariable[i]);
        		}
        	}
        }
        ```
        
    
    - For each loop
        
        ```java
        // Main.java
        
        public class Main{
        	public static void main(String[] args){
        		String[] cars = {"Volvo", "BMW", "Benze" , "Alpard"};
        		for (String i : cars){
        			System.out.println(i);
        		}
        	}
        }
        ```
        

### 14. Multidimensional Array

Look at the following 3x4 matrix

| 2 | 6 | 8 | 7 |
| --- | --- | --- | --- |
| 1 | 5 | 4 | 0 |
| 9 | 3 | 2 | 8 |

If mat = the above matrix variables

1. Rows go from 0 to 2
2. Columns go from 0 to 3

*mat[1][2] = 4 whereas mat[0][2] and mat[2][3] **are both 8***

- **Declaration**
    
    ```java
    int[][] table; // table can reference a 2D Array
    								// table is a null reference
    								
    double[][] matrix = new double[3][4]; // matrix 3*4 
    																					// Each element has a value 0.0			
    																																							
    String[][] strs = new String[2][5]; // matrix 2*5
    																				// Each element is null
    
    // An initializer list can be used following this declaration
    int[][] mat = { {3,4,5},
    									{6,7,8} };
    ```
    
- **Matrix as an Array of Rows Arrays**
    
    ```java
    /*
    	Matrix 3*4
    	------------------------
    	mat[0] contains {2,6,8,7}
    	mat[1] contains {1,5,4,0}
    	mat[2] contains {9,3,2,8}
    */
    int[][] mat = { {2,6,8,7},
    									{1,5,4,0}, 
    									{9,3,2,8}};
    									
    int matLength = mat.length // number of rows
    ```
    

- **Processing a Two-Dimensional Array**
    - Row-by-row-traversal
        
        ```java
        int[][] mat = { {2,6,8,7},
        									{1,5,4,0}, 
        									{9,3,2,8}};
        
        for(row = 0 ; row < mat.length ; row++){
        	for(col = 0; col < mat[row].length ; col++){
        		processElement();
        	}
        }				
        ```
        
    
    - Column-by-column-traversal
        
        ```java
        int[][] mat = { {2,6,8,7},
        									{1,5,4,0}, 
        									{9,3,2,8}};
        
        for(col = 0 ; row < col[0].length ; row++){
        	for(row = 0; row < row.length ; col++){
        		processElement();
        	}
        }				
        ```
        

### 15. Java Object-Oriented Programming (OOP)

When we talk about Object Oriented Programming (OOP), we will talk about 6 different domains

1. **Objects**
    
      Most programs you write involve at least one thing being created or manipulated(managed) by the program. This thing, together with the operations that manipulate it, is called an **object**
    
    For example, a program maintains a ***database of all books in a library*** that has at least two objects
    
    1. **A Book** with operations like *getTitle, getAuthor, isOnShelf, isFiction* 
    2. **A ListOfBooks** with operations like *search, addBook, removeBook, sortByAuthor*
    
    In Java, a var that represents an object is called an ***object reference***
    
2. **Class**
    
    A class is a blueprint
    
    An attribute is an instance value
    
    Behavior is a method
    
    ```java
    /*
    	- Class Snack
    		1. Attribute
    			- Name
    			- Calories
    		2. Behaviors
    			- Get value
    			- Set value
    */
    
    public class Snack{
    	// private instance var
    	private String name;
    	private int calories;
    	
    	// default constructor
    	public Snack(){
    		name = "";
    		calories = 0;
    	}
    	
    	// overloaded  constructor
    	public Snack(String n, int c){
    		name = n;
    		calories = c;
    	}
    	
    	// mutator method
    	public void setName(String n){
    		name = n;
    	}
    	
    	public void setCalories(int n){
    		calories = c;
    	}
    	
    	public static void main(String[] args){
    		Snack lay = new Snack("lay", 120);
    		System.out.println(lay.getName());
    		
    		lay.setClories(lay.getCalories()+100);
    		
    	}
    }
    ```
    
3. **Public, Private, and Static**
    - Public
        - Class is usable by *all client programs*
        
    - Private (Restriction Method)
        - Can be accessed only by methods of that class
        - Allow public instance value
        
    - Static
        - Contains a value that is shared by all instances of the class
        - Memory allocation happens once
        - Keep track of statistics for objects of the class
        - **accumulate(store) a total**
        - Provide a new identity number for each new object of the class
            
            ```java
            public class Employee{
            	private String name 
            	private static int employeeCount = 0;
            	public static final double OT_RATE = 20.00; // value cannot change (often declared public) same as a const in javascript
            	
            	public Employee(){
            		employeeCount++;
            	}
            }
            ```
            
        
4. **Methods**
    - Header
        
        ```java
        // 1    2       3                       4
        public void methodName (varType varName, varType varName2)
        /*
        	1. Access specifier
        	2. Return type (If void = not return a value)
        	3. Method name
        	4. Password list
        */
        ```
        
    
    - **Constructor**
        
        Constructor creates an object of the class
        
        ```java
        public class Snack{
        	// private instance var
        	private String name;
        	private int calories;
        	
        	// default constructor
        	public Snack(){
        		name = "";
        		calories = 0;
        	}
        	
        	// overloaded  constructor
        	public Snack(String n, int c){
        		name = n;
        		calories = c;
        	}
        	
        	
        	public static void main(String[] args){
        		Snack unknow = new Snack();
        		Snack lay = new Snack("lay", 120);
        	}
        }
        ```
        
        ![01.png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/01.png)
        
        Snack unknow = new Snack();
        
        ![02.png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/02.png)
        
        Snack lay = new Snack("lay", 120);
        
    - **Accessor (Get method)**
        
        ```java
        
        public class Snack{
        	// private instance var
        	private String name;
        	private int calories;
        	
        	// default constructor
        	public Snack(){
        		name = "";
        		calories = 0;
        	}
        	
        	// overloaded  constructor
        	public Snack(String n, int c){
        		name = n;
        		calories = c;
        	}
        	
        	//access method
        	// non-void method returns a single value
        	public String getName(){
        		return name; //return a copy of a string
        	}
        	
        	public int getCalories(){ 
        		return calories; 
        	}
        	
        	public static void main(String[] args){
        		Snack lay = new Snack("lay", 120);
        		System.out.println(lay.getName());
        		
        	}
        }
        ```
        
        **Visibility, Return type, and Signature**
        
        - Must be **public**
        - The return type must match the type of the instance variable
        - The name is often **getNameOfVar**
        - No params
        - accessor must be added System.out.print(myInstance.getName0fVar()); to display a value.
        - Can not change the value
    
    - **Mutator (Change method)**
        - Allow the change of value, for instance var outside the class
        - Often called a set method, a setter
        
        ```java
        // Snack.java
        
        public class Snack{
        	// private instance var
        	private String name;
        	private int calories;
        	
        	// default constructor
        	public Snack(){
        		name = "";
        		calories = 0;
        	}
        	
        	// overloaded  constructor
        	public Snack(String n, int c){
        		name = n;
        		calories = c;
        	}
        	
        	// mutator method
        	public void setName(String n){
        		name = n;
        	}
        	
        	public void setCalories(int n){
        		calories = c;
        	}
        	
        	public static void main(String[] args){
        		Snack lay = new Snack("lay", 120);
        		System.out.println(lay.getName());
        		
        		lay.setClories(lay.getCalories()+100);
        		
        	}
        }
        ```
        
        **Visibility, Return type, and Signature**
        
        - **Must be public**
        - The return type **must be void**
        - Name is often setNameOfVar
        - Params type must match the type of the instance var
        
    - **Writing method**
        - Recall
            - A class is a template that defines the data (instance variables) and behavior (methods) for the object
            - An object is an instance of a class
            
        - Encapsulate Data (control access to data in objects from outside) and Behaviour
            
            ```java
            // Dog.java
            
            public class Dog{
            	private String breed;
            	
            	public String getBreed(){
            		return breed;
            	}
            	
            	public boolean isSameBreed(Dog otherDog){
            		return getBreed().equals(otherDog.getBreed());
            		or
            		return breed.equals(otherDog.breed);
            	}
            	
            }
            ```
            
            Adding behavior (method)
            
            ```java
            // DogCompetition.java
            
            public class DogCompetition{
            	// data members not shown
            	
            	public boolean doBreedsMatch(Dog dog1, Dog dog2){
            		return dog1.getBreed().equals(dog2.getBreed());
            	}
            	
            }
            ```
            
    
    - **Static/instance methods and variables**
        
        
        **Static Method**
        
        Static data → Static method
        
        - Belong the class
        - **NO** access instance var
        - Access without object creation
        - **CAN NOT** be overridden
        
        ```java
        public class Assignment{
        	private static int nextClassworkID = 1;
        	private static int nextHomeworkID = 1;
        	private String name;
        	private int pointValue;
        	
        	
        	// accessor method always declares a method with an exact data type. 
        	public double getGrade(){
        		return (double) score/ pointValue;
        	}
        	
        	// static method
        	public static int getNumberOfAssignment(){
        		return nextClassworkID + nextHomeworkID -2;
        	}
        }
        ```
        
        **Instance method**
        
        Instance data → Non-static method. For instance, constructors, accessors, and all mutators operate on individual objects of a class.
        
    
5. **Scope**
- Th***is*** keyword (always called for a particular object)
    
    ```java
     public class Person{
        private String name;
        private int age;
        
        public Person(String n, int a){
            name = n;
            age = a;
        }
        
        public String toString(){
            return name + "" + age;
        }
        
        public void printPerson(){
            System.out.println(this);
        }
        
        public static void main(String[] args){
            Person p = new Person("Dan" , 10);
            p.printPerson();
        }
    }
    ```
    

1. **References**

Reference versus Primitive Data Types: The difference between primitive and reference data types lies in **how they are stored**.

**Primitive Data Types**

```java
int num1 = 3;
int num2 = num1;
```

**Reference** 

```java
//Two references for the same object is known as "aliasing"
Date d = new Date(2,17,1948);
Date birthday = d;
```

**The Null Reference**

```java
BankAccount b;
```

![03.png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/03.png)

If either of the above variables is now changed, the other is not effect 

![04.png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/04.png)

If either of the above variables is now changed, the other is affected 

defines a reference b that is uninitialized (null reference or null pointer)

### 16. Inheritance and Polymorphism

1. **Inheritance** 
    - **Superclass and Subclass (child and parent)**
        
        a relationship between objects that share characteristics (a subclass bigger than a superclass)
        
    - **Inheritance Hierarchy**
        
        A subclass can itself be a superclass for another subclass
        
        ![05.png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/05.png)
        
        is-a relationship is transitive: (GradStudent is-a Student → Student is-a Person; GradStudent is-a Person) 
        
    - **Implementing Subclasses**
        - The extends Keyword (relationship between a subclass and a superclass)
            
            
            ```java
            public class Student{
            	//data members
            	public final static int NUM_TESTS = 3;
            	private String name;
            	private int[] tests;
            	private String grade;
            	
            	//constructor
            	public Student(){
            		name = "";
            		tests = new int[NUM_TESTS];
            		grade = "";
            	}
            	
            	public Student(String studName, int[] studTests, String studGrade){
            		name = studName;
            		tests = studTests;
            		grade = studGrade;
            	}
            	
            	//Accessor
            	public String getName(){
            		return name;
            	}
            	
            	public String getGrade(){
            		return grade;
            	}
            	
            	//Mutators (Void (no return))
            	public void setGrade(String newGrade){
            		grade = newGrade;
            	}
            	
            	public void computeGrade(){
            		if(name.quals("")){
            			grade = "No grade";
            		}else if(getTestAverage() >= 65){
            			grade = "Pass";
            		}else{
            			grade = "Fail";
            		}
            	}
            	
            	public double getTestAverage(){
            		double total = 0;
            		for (int score : tests){
            			total += score;
            		}
            		return total/NUM_TESTS
            	}
            }
            
            public class UnderGrad extends Student{
            	// Constructor
            	public UnderGrad(){
            		super();
            	}
            	
            	public UnderGrad(String studName, int[] studTests, String studGrade){
            		super(studName, studTests, studGrade);
            	}
            	
            	
            	// Override computerGrade method in student superclass
            	public void computeGrade(){
            		if(getTestAverage() >= 70){
            			setGrade("Pass");
            		}else{
            			setGrade("Fail");
            		}
            	}
            }
            
            public class GardStudent extends Student{
            	private int gradID;
            	
            	// Constructor
            	public GradStudent(){
            		super();
            		gradID = 0 ;
            	}
            	
            	public GradStudent(String studName, int[] studTests, String studGrade, int gradStudID){
            		super(studName, studTests, stuGrade);
            		gradID = graStuID;
            	}
            	
            	public int getID(){
            		return gradID;
            	}
            	
            	public void computeGrade(){
            		//invokes(call) computerGrade in Student superclass
            		super.computerGrade();
            		if(getTestAverage() >= 90){
            			setGrade("Pass with distinction !")
            		}
            	} 
            
            }
            ```
            
            ![Image with removed background (4).png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/Image_with_removed_background_(4).png)
            
            orange highlight = must be the first line of the constructor body (super)
            
            yellow highlight = access indirectly (Mutator, Accessor)
            
            **Inheriting Instance Methods and Variable**
            
            ```java
            private String name;
            private int[] tests;
            private String grade;
            ```
            
            1. not inherited for sub-classes GradStudent and UnderGrad
            2. If you change these declarations to *public* or *protected,* you can access them directly or use the accessor method  
            
            **Method Overriding and the *super* keyword**
            
            1. the *public method can be overridden* in a *subclass by defining a method with the same name and return parameter type*
                
                ***computeGrade()* in GradStudent overridden *computeGrade()* in *Student Superclass***
                
            
            1. *super is* used to call or refer to superclass (parent)
                1. used to call superclass methods, and **access the *superclass* constructor**   
                2. The most common use of *the super* is to eliminate(remove) the confusion between *superclass* and *subclass* that **have methods with the same name**
            
            **Constructor and *super***
            
            1. Constructors a**re never inherited!**
            2. ***IF (NO CONSTRUCTOR IS WRITTEN FOR A SUBCLASS)*** {
                
                a default constructor with no parameters is generated
                
                }
                
            3. IF (SUPERCLASS DOES NOT HAVE A NO-ARGUMENT CONSTRUCTOR){
                
                a compiler error 
                
                }
                
            4. A subclass constructor can be implemented with a call to the *super* method
                1. the no-argument constructor in the *underGrad* class is identical to that of the *Student class*
                    
                    ```java
                    super();
                    ```
                    
                2. the *UnderGrad* class is called with parameters that match those in the constructor of the *Student* superclass 
                    
                    ```java
                    public UnderGrad(String studName, int[] studTests, String studGrade){
                    	super(studName, studTests, studGrade);
                    }
                    ```
                    
                
                5. A subclass should define its own constructors
                
    - **Declaring Subclass Objects**
        
        
        ![Image with removed background (4).png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/Image_with_removed_background_(4).png)
        
        IF(SUPERCLASS IS DECLARED IN A CLIENT PROGRAM){
        
        ✅ Refer to an object of the superclass
        
        ✅ Refer to an object of the subclass
        
        }
        
        ```java
        Student s = new Student();
        // That's working because this ***is-a*** student 
        Student g = new GradStudent();
        Student u = new UnderGrad(); 
        ```
        
        IF(Student IS NOT NECESSARY a GradStudent || an UnderGrad){
        
        ```java
        GradStudent g = new Student();
        UnderGrad u = new Student();
        ```
        
        }
        
        Consider these valid(right) declarations:
        
        ```java
        Student s = new Student("Brain Lorenzen", new int[] {90,94,99}, "none");
        Student u = new UnderGrad("Tim border", new int[] {90,90,100}, "none");
        Student g = new GradStudent("Kevin Cristella", new int[] {85,70,90}, "none", 1234);
        ```
        
        Suppose you make the method call
        
        ```java
        s.setGrade("Pass"); //These functions update just value s
        ```
        
        The appropriate (should be) method in *Student* is found and the new grade is assigned. The method call 
        
        ```java
        g.setGrade("Pass")
        ```
        
        ```java
        u.setGrade("Pass")
        ```
        
        *GradStudent* and *UnderGrad* both inherit the *setGrade* method from *Student* 
        
        The following method calls, however, won’t work (*Student* doesn’t contain *getID*)
        
        ```java
        int studentNum = s.getID();
        int underGradNum = u.getID();
        ```
        
2. **Polymorphism (many forms)**
    
    A method that has been overridden in at least one subclass is said to be *polymorphic* (An example is *computeGrade*), which is redefined for both *GradStudent* and *UnderGrad* 
    
    ***Polymorphism*** is the m*e*chanism of selecting the appropriate(good) method for a particular object in a class hierarchy
    
    ```java
    public class Dog{
    	private String name;
    	private String breed;
    	
    	public Dog(String aName, String aBreed){
    		name = aName;
    		breed = aBreed;
    	}
    }
    
    public class Poodle extends Dog{
    	private boolean needsGrooming;
    	
    	public Poodle(String aName, String aBreed, boolean grooming){
    		super(aName, aBreed);
    		needsGrooming = grooming;
    	}
    }
    ```
    
    ![Image with removed background (5).png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/Image_with_removed_background_(5).png)
    
    Suppose the *Dog* class has this method
    
    ```java
    public void eat(){
    
    }
    ```
    
    Each of the subclasses, *Poodle, Pitbull, and Dachshund* has a different, overridden *eat* method
    
    Now suppose that allDogs id an ArrayList<Dog> and Each Dog in the list will process to eat by the following lines of code
    
     
    
    ```java
    for(Dog d: allDogs){
    	d.eat()
    }
    ```
    
    Polymorphism will select the correct eating method, during run time, for each of the different dogs 
    
    <aside>
    ❗ **Warning**
    
    </aside>
    
    IF(YOU DON’T WRITE AN EXPLICIT(CLEAR) CONSTRUCTOR FOR THE SUBCLASS){
    
    Code tries to create a subclass object will get a compile-time error
    
    }
    
3. **Type Compatibility**

### 17. Standard Class

### 18. Program Design and Analysis

### 19. Recursion (A method which uses the stand (calls itself))

A recursive method is a method that **calls itself** 

```java
public void recursiveMeth(...){
	if (base case){
		<Perform some action>
	}else{
		<Perform some other action>
		recursiveMeth(...);
	}
}
```

**The general form of the Simple Recursive Method**

**has two distinct parts**

1. The base case terminates the condition that causes the method to end.
2. A non-base case whose action **moves the algorithm toward the base case and term**i**nation.**

**Warning!**

orange highlight = If you never reach the base case, you will create an infinite loop 

**Analysis of Recursive Methods**

```java
public static int fib(int n){
	if(n == 1 || n == 2){
		return 1;
	}else{
		return fib(n-1) + fib(n-2);
	}
}
```

![Image with removed background (3).png](AP%20Computer%20Science%20A%20%5BJava%20101%5D%20a9075a4c750d42f3b1f62c2559043fd8/Image_with_removed_background_(3).png)

Fib(5) = **starter**

Fib(4), Fib(3), Fib(3), Fib(2), Fib(2), (Fib 1), Fib(2), (Fib 1) = **8 recursive calls to fib!**

**Example I**

```java
public class Wordplay{
	public static void stackWords(){
		String word = ...; //read user-input
		if (word.equals(".")){
			System.out.println();
		}else{
			stackWords();
		}
		System.out.println(word);
	}
	
	public static void main(String args[]){
		System.out.println("Enter list if words, one per line.");
		System.out.println("Final word should be a period (.)");
		stackWords();
	}
}
```

stackWords(”hold”)

StackWords(”my”)

stackWords(”hand”)

StackWords(”.”)

return(” ”)

return(”.”)

return(”hand”)

return(”my”)

return(”hold”)

---

**You get**

.

hand

my

hold

### 20. Sorting and searching
