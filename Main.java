package com.example;
import java.util.Scanner;
import java.util.ArrayList;

class User{
   private String name;
   private String password;
   private String code;
   User(String name,String password,String code){
     this.name = name;
     this.password = password;
     this.code = code; 
   }
  void showuser(){
    System.out.println("name:" + name);
  }
}


public class Main {
    public static void main(String[] args) {
       
       ArrayList<User> users = new ArrayList<>();
      
       Scanner input = new Scanner(System.in);
        
       System.out.println("your name?");
       String yourname = input.nextLine();
       
       if(yourname.isBlank()){
          System.out.println("error");
          return;
       }
        
       System.out.println("your password?");
       String yourpassword = input.nextLine();
       
       if(yourpassword.isBlank()){
          System.out.println("error");
          return;
       }
        
       System.out.println("your code?");
       String yourcode = input.nextLine(); 
       
       if(yourcode.isBlank()){
          System.out.println("erro");
          return;
       }
      
      User myuser = new User(yourname,yourpassword,yourcode);
      User user1 = new User("João", "123", "001");
      User user2 = new User("Maria", "456", "002");
      User user3 = new User("Carlos", "789", "003");

      users.add(user1);
      users.add(user2);
      users.add(user3);
      
      users.add(myuser);
      myuser.showuser();
      
      for(User user: users){
        user.showuser();
      }
      
    }
}