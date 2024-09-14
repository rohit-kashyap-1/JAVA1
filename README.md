print an array 

```jsx

import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) {
        String[] students = {"Rohit","Mohit","Amit","Saurabh"};
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.toString(students));
        System.out.println(students[0]);
        System.out.println(Arrays.deepToString(matrix));
    }
}

```

Using an `Object` Array
to store mutiple elements of different data type 

```jsx
public class MixedArrayExample {
    public static void main(String[] args) {
        // Create an array of Object type
        Object[] mixedArray = new Object[4];
        
        // Assign different types of values to the array
        mixedArray[0] = 10;          // Integer
        mixedArray[1] = "Hello";     // String
        mixedArray[2] = 3.14;        // Double (also an Object)
        mixedArray[3] = 'A';         // Character (also an Object)
        
        // Print the array elements
        for (Object element : mixedArray) {
            System.out.println(element);
        }
    }
}

```

Foreach Loop

```jsx
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```

declare and call a method

```jsx
public class Main {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();
  }
}

// Outputs "I just got executed!"
```

overloading of methods - same name but different number of parameters

```jsx
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}
```

Scope: 

block scope {}, with in block

method scope, within function

---

Recursion

```jsx
public class Recursion {
    static int sum(int x){
        if(x>0){
            x = x + sum(x-1);
            return x;
        }else{
            return 0;
        }
        
    }

    static int fact(int x){
        if(x>1){
            x = x * fact(x-1);
            return x;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        int sum = sum(5);
        int fact = fact(5);
        //System.out.println(sum);
        System.out.println(fact);
    }   
}

```

###
