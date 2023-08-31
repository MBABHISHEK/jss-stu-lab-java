# jss-stu-lab-java
java lab programs
1. a) Generate prime numbers for the given range.
b) Find all the roots of a quadratic equation.
c) Print ‘N’ Fibonacci numbers.
d) Print pyramid shape using * symbols.


2. Define a class to represent a bank ACCOUNT and include the following 
members:
I. Data Members(States):
a) Name of Depositor
b) Account number
c) Type of Account
d) Balance amount in the account
II. Member Methods(Behaviors):
a) To assign initial values 
b) To deposit an amount 
c) To withdraw an amount after checking for the balance
d) To display name & balance
III. Define EXECUTEACCOUNT class that defines main method to test 
above class.
IV. In the above class, maintain the total number of account holders 
present in the bank and also define a method to define it. Change the 
main method appropriately.
V. In main method of EXECUTEACCOUNT class, define an array to 
handle five accounts.
VI. In ACCOUNT class constructor, demonstrate the use of “this” 
keyword


3. The daily maximum temperatures recorded for 5 cities during the first 6 days 
of January month have to be tabulated. Develop an application to read the 
data and find the city and day corresponding to highest temperature and 
lowest temperature.


4. An election is contested by 5 candidates. The candidates are numbered 1 to 5 
and the voting is done by marking the candidate number on the ballot paper. 
Develop an application to read the ballots and count the votes cast for each 
candidate using an array variable count. In case, a number read is outside the 
range 1 to 5, the ballot should be considered as a 'spoilt ballot' and the 
program should also count the number of spoilt ballots.


5. Given are two one dimensional array A and B which are sorted in ascending 
order. Develop an application to merge them into a single sorted array C that 
contains every item form A and B, in ascending order.

6. Create a class of objects CUBE. Develop an application to read the side for 
three cubes and print the Volume and outer area.

7. The annual examination results of 20 students are to be tabulated as follows:
Roll No. Subject-1 Subject-2 Subject 3
Develop an application to read the data and determine the following:
a) Total marks obtained by each student.
b) The highest marks in each subject and the Roll No. of the student.
c) The student who obtained the highest total marks.

8. Write a program to read a list containing Book Title, Book Code, Cost and 
Quantity interactively for min. of 10 books and produce a five column output 
as shown below.
NAME CODE UNIT PRICE QUANTITY TOTAL PRICE
Define the suitable functions and perform the transactions.

9. Given that an EMPLOYEE class contains the following members:
Members: Employee ID, Employee Name, Department name & Basic Pay
Methods: To read each employee details, to calculate Gross Pay and to print 
the employee details. Develop an application to read data of N employees 
and compute the Gross Pay and Net Pay of each employee.
Gross Pay = Basic Pay + DA + HRA (DA = 58% of Basic Pay, HRA = 
16% of Basic Pay)
Net Pay = Gross – Income Tax
Income Tax calculated as follows:
Gross Pay - Up to 2 lakhs - Nil 
Above 2 and up to 3 lakhs - 10% of the Gross Pay
Above 3 and up to 5 lakhs - 15% of the Gross Pay and 
Above 5 lakhs 30 % of the Gross Pay, an additional charge of 2% of the tax 
will be added to total tax

10. Develop an application with an abstract Bank class consisting of below 
features:
a) Bank_Type (National/International)
b) getRoi() is an abstract method
c) deposit()
d) offerCreditCard
 Identify various (atleast 4) banks which will extend bank class with below 
conditions:
o If the bank is type of nationalized the roi is 7% else 8%. The interest is 
offered only if the term deposit is minimum of 3 years.
o If the bank is international, then it can offer platinum credit card 
otherwise not.
o Override one of the method and use the concept of dynamic method 
dispatch.

11. Student class consists the following attributes:
a) roll number
b) read Number(): to initialize roll number
c) print Number(): to display the roll number
 class Test inherits Student and will identify marks for 2 subjects for each 
student and will display the same.
 Each student can also be recognized with sports weightage using an 
interface Sports which will have attributes to assign weightage value and 
display it. Each Student is rated with total score which is the summation of 
marks in 2 subjects and sports weightage.
 Develop an application Results to extend Test and implement Sports 
which displays the student score card as below:
Roll No
Marks Obtained in Subject-1 and Subject-2
Sports weight
Total Score

12. Develop an application which consists of Stack class and include methods to 
push and pop the stack elements. Create your own defined Exception class 
and handle exceptions while stacks run with “Stack as full” and “Stack under 
flow” while calling push() and pop() methods respectively. Implement this 
using ‘throws’ and ‘throw’ keywords
