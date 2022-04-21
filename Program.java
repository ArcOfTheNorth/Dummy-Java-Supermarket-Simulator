import java.io.*;
import java.util.*; 
import java.awt.*;
import java.util.Scanner;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;  
import java.util.Date;

///////////////////////////////////////////////////////////////////////////////////////   
public class Program
{
   
   static Scanner keyboard = new Scanner(System.in);


   public static void main (String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);

      int choice;
     
         System.out.println ("\n");
         System.out.println ("\t\t---------");
         System.out.println ("\t\tIMAGINARY SUPERMARKET");
         System.out.println ("\t\t---------");
         System.out.println ("\t\t0. Exit Program");
         System.out.println ("\t\t1. Log In");
         System.out.println ("\t\t---------");
         System.out.println ("\n");
      
         System.out.print ("Enter your selection (MUST BE A NUMBER) -->");
         choice = keyboard.nextInt ();
         if (choice == 0)
         {
            System.out.println ("GoodBye!");
 
         }
         else if (choice == 1)
         {
            logIn ();
         }
         else {
         System.out.println ("ERROR! Please try again");
         }
   } 



///////////////////////////////////////////////////////////////////////////////////////      
   public static void loginMenu (String name)
   {
      int choice;
      while (true)
      {
         System.out.println ("\t\t----------------------------");
         System.out.println ("\t\tWELCOME BACK," + " " + name);
         System.out.println ("\t\t----------------------------");
         System.out.println ("\t\t1. Purchase an item");
         System.out.println ("\t\t2. Close application");
         System.out.println ("\t\t----------------------------");
         System.out.println ("\n");
         
         System.out.print ("Enter your selection (MUST BE A NUMBER) -->");
         choice = keyboard.nextInt ();
         
         if (choice == 1)
         {
            purchaseMthd (name);
            break;
         }
         else if (choice == 2)
         {
            break;   
         }
         else {
            System.out.println ("ERROR! Please try again");  
         }
      }        
   }
  
///////////////////////////////////////////////////////////////////////////////////////   
 
   public static void purchaseMthd (String name)
   {
      int choice;
      while (true)
         {
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\tISLES AVAILABLE");
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\t1. Meats & Delis");
            System.out.println ("\t\t2. Candies & Snacks");
            System.out.println ("\t\t3. Fruits & Vegetables");
            System.out.println ("\t\t4. Toiletries & Baby items");
            System.out.println ("\t\t5. Close Application");
            System.out.println ("\t\t----------------------------");
            System.out.println ("\n");
            
            System.out.print ("Select an aisle to purchase from (MUST BE A NUMBER) -->");
            choice = keyboard.nextInt ();
               
            if (choice == 1)
            {
               meatsNDeli (name);
               break;
            }
            else if (choice == 2)
            {
               candiesNSncks (name);
               break;
            }
            else if (choice == 3)
            {
               fruitsNVeg (name);
               break;
            }
            else if (choice == 4)
            {
               toiletNBaby (name);
               break;
            }
            else if (choice == 5)
            {
               break;
            }
            else {
               System.out.println ("ERROR! Please try again");
               break;
            }
         }    
   }
   
///////////////////////////////////////////////////////////////////////////////////////   
   public static void meatsNDeli (String name)
   {
      int choice;
      String order;
      while (true)
         {
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\tMEATS & DELI");
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\t1. Beef");
            System.out.println ("\t\t2. Pork");
            System.out.println ("\t\t3. Chicken");
            System.out.println ("\t\t4. Fish");
            System.out.println ("\t\t5. Exotic Meats");            
            System.out.println ("\t\t----------------------------");
            System.out.println ("\n");
            
            System.out.print ("Select an item to purchase (MUST BE A NUMBER) -->");
            choice = keyboard.nextInt ();
            
            if (choice == 1)
            {
               order = "Beef";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 2)
            {
               order = "Pork";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 3)
            {
               order = "Chicken";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 4)
            {
               order = "Fish";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 5)
            {
               order = "Exotic Meat";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else {
               System.out.println ("ERROR! Please try again");
            }
         }       
   
   }

///////////////////////////////////////////////////////////////////////////////////
   private static void candiesNSncks (String name)
   {
      int choice;
      String order;
      while (true)
         {
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\tCANDIES AND SNACKS");
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\t1. Lolipops");
            System.out.println ("\t\t2. Gummy Bears");
            System.out.println ("\t\t3. Chips");
            System.out.println ("\t\t4. Cookies");
            System.out.println ("\t\t5. Wafers");            
            System.out.println ("\t\t----------------------------");
            System.out.println ("\n");
            
            System.out.print ("Select an item to purchase (MUST BE A NUMBER) -->");
            choice = keyboard.nextInt ();
            
            if (choice == 1)
            {
               order = "Lolipops";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 2)
            {
               order = "Gummy Bears";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 3)
            {
               order = "Chips";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 4)
            {
               order = "Cookies";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 5)
            {
               order = "Wafers";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else {
               System.out.println ("ERROR! Please try again");
            }
         }       

   }
///////////////////////////////////////////////////////////////////////////////////////      
   public static void fruitsNVeg (String name)
   {
      int choice;
      String order;
      while (true)
         {
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\tFRUITS AND VEGETABLES");
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\t1. Apples");
            System.out.println ("\t\t2. Bananas");
            System.out.println ("\t\t3. Carrots");
            System.out.println ("\t\t4. Tomatoes");
            System.out.println ("\t\t5. Kales");            
            System.out.println ("\t\t----------------------------");
            System.out.println ("\n");
            
            System.out.print ("Select an item to purchase (MUST BE A NUMBER) -->");
            choice = keyboard.nextInt ();
            
            if (choice == 1)
            {
               order = "Apples";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 2)
            {
               order = "Bananas";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 3)
            {
               order = "Carrots";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 4)
            {
               order = "Tomatoes";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 5)
            {
               order = "Kales";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else {
               System.out.println ("ERROR! Please try again");
            }
         }       
 
   }
//////////////////////////////////////////////////////////////  
   public static void toiletNBaby (String name)
   {
      int choice;
      String order;
      while (true)
         {
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\tTOILETRIES AND BABY ITEMS");
            System.out.println ("\t\t----------------------------");
            System.out.println ("\t\t1. Toothbrushes");
            System.out.println ("\t\t2. Toothpaste");
            System.out.println ("\t\t3. Soap");
            System.out.println ("\t\t4. Diapers");
            System.out.println ("\t\t5. Baby Wipes");            
            System.out.println ("\t\t----------------------------");
            System.out.println ("\n");
            
            System.out.print ("Select an item to purchase (MUST BE A NUMBER) -->");
            choice = keyboard.nextInt ();
            
            if (choice == 1)
            {
               order = "Toothbrushes";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 2)
            {
               order = "Toothpaste";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 3)
            {
               order = "Soap";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 4)
            {
               order = "Diapers";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else if (choice == 5)
            {
               order = "Baby Wipes";
               pushOrder (order,name);
               System.out.println ("Order complete. Make sure to shop with us next time!");
               break;
            }
            else {
               System.out.println ("ERROR! Please try again");
            }
         }  
   }

//////////////////////////////////////////////////////////////////////////
   public static void logIn ()
   {
      String name;
      System.out.print ("Enter your username (Check Input.txt for all users) --> ");
      name = keyboard.nextLine();
      try {
      
      
            File file = new File("input.txt");
            FileReader fr = new FileReader (file);
            BufferedReader br = new BufferedReader (fr); 
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
                  
            String line = null;
            while((line = br.readLine()) != null) {
                if(line.contains(name)) {
                  loginMenu (name);
                }
            }
  
           }catch (IOException e) {
               System.out.println("ERROR!Try again Later");
           }
   }
///////////////////////////////////////////////////////////////////////////
   
   public static void pushOrder (String order, String name)
   {
      try{
        File file = new File ("output.txt");
        FileWriter fw = new FileWriter(file, true); 
        PrintWriter pw = new PrintWriter(fw);
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();

        pw.println(name + " ordered " + order + " at " + df.format(dateobj));
        pw.close();
     }
     
     catch(IOException e){
        System.out.println("ERROR!");
     }
         
   }
     
   
}

