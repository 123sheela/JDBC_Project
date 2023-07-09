package Controller;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import dao.LoginDAO;
import dao.ProductDAO;
import Model.Login;
import Model.Product;
public class Main {
      public static void main(String[] args)throws NumberFormatException,IOException,ClassNotFoundException,SQLException {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int choice,option,opt;
            Login login=new Login();
            LoginDAO logindao=new LoginDAO();
            Product product=new Product();
            ProductDAO productdao=new ProductDAO();  
             do
                {
                 System.out.println("________________________________________________________________");
                 System.out.println("1.Admin\n2.Agent\n3.Exit");
                 System.out.println("________________________________________________________________");
                 choice=Integer.parseInt(br.readLine());
                  switch(choice)
                        {
                  case 1:
             System.out.println("________________________________________________________________");
             System.out.println("Enter the username:");
             String username=br.readLine();
              System.out.println("Enter the password");
             String password=br.readLine();
             login.setUsername(username);
             login.setPassword(password);
             if(logindao.validate(login))
              {
              System.out.println("Login Successfull");
              do
                {
               System.out.println("________________________________________________________________");
               System.out.println("1.Add Product\n2.Display\n3.Logout");
               opt=Integer.parseInt(br.readLine());
               switch(opt)
                 {
            case 1:
                 System.out.println("Enter the product Id");
                 int productid=Integer.parseInt(br.readLine());
                 System.out.println("Enter the product Name:");
                 String productname=br.readLine();
                 System.out.println("Enter the minsell Quantity:");
                 int minsellQuantity=Integer.parseInt(br.readLine());
                  System.out.println("Enter the price:");
                  int price=Integer.parseInt(br.readLine());
                  System.out.println("Enter the Quantity");
                   int quantity=Integer.parseInt(br.readLine());
                   product.setMinSellQuantity(minsellQuantity);
                   product.setPrice(price);
                   product.setProductId(productid);
                    product.setProductName(productname);
                    product.setQuantity(quantity);
                    productdao.addProduct(product);
                     break;                                         
             case 2:
                     productdao.display();
                     break;
                 }
                 }while(opt!=3);
                }
              else
                    {
                 System.out.println("________________________________________________________________");
                 System.out.println("Check your Username & Password");
               }
            break;
        case 2:
                System.out.println("________________________________________________________________");
          System.out.println("Enter the user name:");
           String name=br.readLine();
          System.out.println("Enter the password:");
          String pass=br.readLine();
                  login.setUsername(name);
                  login.setPassword(pass);
              if(logindao.validate(login))
                    {
                            System.out.println("Login Successfull");
                do
                   {
                         System.out.println("________________________________________________________________");
                System.out.println("1.Display\n2.Logout");
                      option=Integer.parseInt(br.readLine());
    switch(option)
            {
     case 1:
      productdao.display();
         break;                                                                                           
             case 2:
                break;
                     }
             }while(option!=2);
           }
      break;
       }
     }while(choice!=3);
    }
}
