package com.registration.app;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.registration.person.Person;
import com.registration.person.Customer;


class App{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
Person person = new Person();
Customer customer0 = new Customer();
Customer customer1 = new Customer();
Customer customer2 = new Customer();

//for(int a = 0; a < 3; a++){

//Storing multiple objects in an Array
ArrayList <Customer> customers = new ArrayList <>();
customers.add(customer0);
customers.add(customer1);
customers.add(customer2);

//String name = scanner.nextLine();

System.out.println(customers.get(0));


/*
System.out.println("Pick Oprion: 1.Capture Name or 2.Print Names ");
int name = scanner.nextInt();

if(name==1){

System.out.println("Enter Login Username: \n ");
String username5 = scanner.nextLine();
String username = scanner.nextLine();

if(username.equals("customer0")){

System.out.println("Enter First Name: ");
customer0.firstName = scanner.nextLine();
System.out.println("Your name is:" + customer0.firstName);
break;
}else if(username.equals("customer1")){
System.out.println("Enter First Name: ");
customer1.firstName = scanner.nextLine();
System.out.println("Your name is:" + customer1.firstName);
break;
}else if(username.equals("customer2")){
System.out.println("Enter First Name: ");
customer2.firstName = scanner.nextLine();
System.out.println("Your name is:" + customer2.firstName);
break;
}else{
System.out.println("Sorry Invalid Username");
}

}else if(name==2){
String username = scanner.nextLine();

if(username.equals("customer0")){

System.out.println("Your name is:" + customer0.firstName);
break;
}else if(username.equals("customer1")){

System.out.println("Your name is:" + customer1.firstName);
break;
}else if(username.equals("customer2")){

System.out.println("Your name is:" + customer2.firstName);
break;
}
break;
}
*/
//}

}

}
