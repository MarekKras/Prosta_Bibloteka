/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.liblary;
import java.util.Scanner;
/**
 *
 * @author Marek
 */
public class SimpleLiblary {

   
    public static void main(String[] args) {
       String[] books = new String[20];
       String[] authors = new String [20];
        
        
       Scanner input = new Scanner(System.in);
       
       boolean running = true;
       
       while(running) {
           printUsage();
           String command = input.next();
           switch (command) {
               case "quit":
                   running = false;
                   break;
              
               case "add":
              
                   addBook(books,authors,input);
               break;
               case"print":
                   printBook(books,authors,input);
                   break;
               case " print_all":
                   print_all(books, authors);
                   break;
               case "remove":
                       remove(books, authors,input);
                       break;
                       case "remove_all":
                       remove_all(books, authors);
                       break;
                       case "findByAuthor":
                           findByAuthor(books, authors,input);
                           break;
                       case "count":
                               count(books);
                               break;
                       case "findLongestTitle":
                           findLongestTitle(books);
                           break;
           }
           
       }
               
    }
   
        
    
     public static void addBook(String[] books, String[] authors, Scanner scanner) {
         System.out.println("Index:");
         int index = scanner.nextInt();
         scanner.skip("\n");
         System.out.println("title");
         books[index] = scanner.nextLine();
         System.out.println("author");
         authors[index] = scanner.nextLine();
     }
     public static void printBook(String[] books, String[] authors, Scanner scanner) {
         System.out.println("Index:");
         int index = scanner.nextInt();
         System.out.println(books[index]);
         System.out.println(authors[index]);
       
     }
     
       public static void print_all(String[] books, String[] authors) {
           for (int i =0; i<books.length; i++) { 
         System.out.println(authors[i]+ " " + books[i]);
         
       
       }
       }
            public static void remove_all(String[] books, String[] authors) {
           for (int i =0; i< books.length; i++) { 
         books[i] = null;
         authors[i] = null;
       }
            }
       
         public static void remove(String[] books, String[] authors, Scanner scanner) {
         System.out.println("Index:");
         int index = scanner.nextInt();
         System.out.println(authors[index]);
         books[index] = null;
         authors[index] = null;
         }

         
         
         
 public static void printUsage() {
        System.out.println("quit");
        System.out.println("add");
        System.out.println("print");
        System.out.println("print_all");
          System.out.println("remove");
           System.out.println("remove_all");
                      System.out.println("findByAuthor");
                      System.out.println("count");
                      System.out.println("findLongestTitle");
      
      
}

    private static void findByAuthor(String[] books, String[] authors, Scanner input) {
        System.out.println("author:");
        input.skip("\n");
        String author = input.nextLine();
        for ( int i =0; i< authors.length; i++) {
            if(author.equals(authors[i])) {
                System.out.println(books[i]);
            }
        }
    }
    private static void count(String[] books) {
        int count = 0;
        for (String book : books) {
            if (book !=null) { 
                count ++;
                
            }
        }
    }
    private static void findLongestTitle(String[] books) {
        int index = -1;
        int size = 0;
        for ( int i =0; i< books.length; i++) {
            if (books[i] !=null && books[i].length() > size) {
                index = i;
                size = books[i].length();
            }
        }
    }
}


