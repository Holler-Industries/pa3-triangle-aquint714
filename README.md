# Programming Assignment 3: The Triangle Class

### Overview
In this PA you will be implementing the *Triangle* class, including
defining instance variables, writing constructors, and writing 
accessor and mutator methods. Unlike the *BankAccount* PA, I will
not be supplying you with method signatures. Your starter code will
include accessors for instance variables, **leave these in the code, they
are necessary for testing**. In addition to the
*Triangle* class, you should also submit a tester file in which
you verify that your class works correctly.

### Class details
A *Triangle* object consists of 3 pairs of doubles, so your
class should contain a total of 6 instance variables. You must name
these `x0, y0, x1, y1, x2, y2`.

You will write two constructors for the *Triangle* class. The
first constructor will take six double parameters, and assign their
values to the instance variables. The second constructor takes no
parameters, and will construct a degenerate triangle such that all
points are at the origin. Here are example calls to the constructor:

`Triangle myTriangle = new Triangle(1,4,3,7,5,6) // constructs a
triangle with points at (1,4), (3,7), and (5,6)`

`Triangle myOtherTriangle = new Triangle() // constructs a triangle
with points (0,0), (0,0), and (0,0)`

In addition to the constructors, you must also implement four methods:

1. A method called *perimeter*, which takes no parameters and 
returns the perimeter of the triangle

2. A method called *area*, which takes no parameters and returns 
the area of the triangle

3. A method called *translateX* which takes a double parameter and
translates the triangle horizontally by that parameter value.

3. A method called *translateY* which takes a double parameter and
translates the triangle vertically by that parameter value.

Make sure your methods are named EXACTLY as they appear in this file,
otherwise the tests will not pass. All number variables and parameters
should be **doubles**.

### Helpful formulas and background

Given the side lengths of a triangle, labelled a, b, and c, Heron's
formula states that

` Area = sqrt((s)(s-a)(s-b)(s-c))`

Where sqrt is the square root, and s is the semiperimeter `s = (a+b+c)/2`

One can obtain the side lengths of the triangle by the distance formula between
coordinate points.

You will want to use Heron's formula for your area calculation.

In order to accomplish this in Java you will need to make use of the
Math library. Specifically, if you write this on line 2 of your class file:

` import java.lang.Math `

Then you can use `Math.sqrt(a)` to calculate the square root of a.

### Testing
I have supplied some tests for you under test>java>com.example.project>TestTriangle
You may run these tests to help debug your program, but you still must write your
own test file and submit it as part of this project. I also reserve the right to test
your class in other ways not included in the test file.

### Submission and due date
You will submit this project following the normal process of:
1. Committing your project (along with a commit message) and
2. Pushing your commit to Github.

You may make changes, commit, and push as many times as you would like before
the deadline. This project will be due by the end of class on October 21.

### 1337 addons to your code
If you finish early, consider adding / modifying your code in the following way:

1. **Hard** : Add a method to your *Triangle* class that takes two integers *a* and *b* as parameters and returns the
side length between points *a* and *b*. For example,` myTriangle.length(0, 1)` would return the side length between points
`(x0, y0)` and `(x1, y1)`. Note that this will require `if` statements.

2. **Harder** : Add a method to your *Triangle* that takes one integers *a* as a parameter and returns the
   angle at point a in radians. For example,` myTriangle.angle(2)` would return the interior angle at point
   `(x2, y2)`. Note that this will require `if` statements, as well as `Math.asin()` and/or `Math.acos()`
   for inverse trig functions.
   
3. **Even Harder** : Add a method to your *Triangle* that takes two doubles *a* and *b* as parameters and returns `True`
if the point `(a,b)` lies inside of the triangle, and `False` otherwise. This kind of algorithm
is used in game development and 3D modelling all the time. If you're committed to working it out,
as Dr. Holler for some advice.