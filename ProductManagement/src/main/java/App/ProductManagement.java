package App;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bluez
 */
public class ProductManagement {
    private ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void addProduct(Product product)
    {
        products.add(product);
    }
    public void modifyProduct()
    {
        
    }
    public void deleteProduct()
    {
        System.out.print("Input id product : ");
        sc.nextLine();
        String Id = sc.nextLine();
        for (Product id : products) {
            if (id.getProductId().equals(Id)) {
                products.remove(id);
                System.out.println("Delete susscessSuccessfully deleted product with id " + Id);
                break;
            }
        }
        System.out.println("There is no ID in the Products list !!!");
    }
    
    public void searchProduct()
    {
        
    }
    //them cac pham vao cuc bo
    public void saveOnLocalStoge()
    {
        
    }
}
