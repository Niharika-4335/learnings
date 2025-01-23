package learn;
//class and object creation
class Car{
	String make;
	String model;
	int year;
	String color;
	public Car(String make, String model, int year, String color) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
	}
	public void displayDetails() {
		System.out.print(make + " "+ model);
		
	}
}
//encapsulation
class BankAccount{
	private String accountno;
	private double bal;
	public BankAccount(String accountno, double bal) {
		super();
		this.accountno = accountno;
		this.bal = bal;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public double getBal() {
		return bal;
	}
	public void setBal(double bal) {
		this.bal = bal;
	}
	public void deposit(double amount) {
		bal=bal+amount;
	}
	public void withdraw(double amount) {
		if(bal>1000) {
		bal=bal-amount;
		}
	}
	public void displaybankdetails() {
		System.out.print(bal);
	}
}
//inheritance
class Animal{
	String name;
	int age;
}
class Dog extends Animal{
	public void speak() {
		System.out.print("Woof!");
	}
}
class Cat extends Animal{
	public void speak() {
		System.out.print("Meow!");
	}
	
}
//abstraction
abstract class shape{
	public void area() {
		
	}
}
class circle extends shape{

	public double area(double radius){
		double a=3.14*radius*radius;
		return a;
	}
}
class rectangle extends shape{
	public int area(int length,int breadth) {
		int b=length*breadth;
		return b;
	}
}
//constructor overloading
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author){
		this.title=title;
		this.author=author;
	}
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
}
//method overloading
class calculator{
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	public double add(double a,double b) {
		return  a+b;
	}
	
}
//interface
interface playable{
	public void play();
}
class Guitar implements playable{
	public void play() {
		System.out.println("playing guitar");
	}
}
class Piano implements playable{
	public void play() {
		System.out.println("playing piano");
	}
}
//static
class Student5{
	String name;
	int age;
	static int totals=0;
	Student5(){
		totals++;
	}
}
//final
class Vehicle{
	public final void move() {
		
	}
}
class car extends Vehicle {
	//we can't extend final method 
}
//public void move() {
//		
//	}
//}
public class task2 {
	public static void main(String xyz[]) {
		Car c=new Car("hi","fortuner",2010,"black");
		c.displayDetails();
		BankAccount ba=new BankAccount("123455",4000);
		ba.deposit(4000);
		ba.withdraw(2000);
		ba.displaybankdetails();
		Cat c1=new Cat();
		c1.speak();
		circle c2=new circle();
		double area1=c2.area(1.2);
		System.out.println(area1);
		rectangle r=new rectangle();
		int area2=r.area(10,20);
		System.out.println(area2);
		Student5 s1=new Student5();
	    Student5 s2=new Student5();
	    Student5 s3=new Student5();
		System.out.println(Student5.totals);
		
	}
	

}
