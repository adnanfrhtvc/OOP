package org.example.Exercises;

import java.util.ArrayList;
import java.util.List;

record Product(int id, String name, double price){}
interface DetailsProvider<T>{
    public void displayDetails(T item);
}
class ProductManagementSystem implements DetailsProvider<Product>{
    public void filterProductsByPriceRange(List<Product> list, double minPrice, double maxPrice){
        List<Product> filteredList = new ArrayList<>();
        for(Product product : list){
            if(product.price()<maxPrice && product.price()>minPrice){
                filteredList.add(product);
            }
        }
        System.out.println(filteredList);
    }
    public void calculateTotalPrice(List<Product> list){
        double sum = 0;
        for(Product product : list){
            sum += product.price();
        }
        System.out.println(sum);
    }
    @Override
    public void displayDetails(Product item){
        System.out.println(item.id()+ " " + item.name() + " "+ item.price());
    }
}
class Mainnn {

    public static void main(String[] args) {
        ProductManagementSystem productManagementSystem = new ProductManagementSystem();

        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "ProductA", 50.0));
        products.add(new Product(2, "ProductB", 75.0));
        products.add(new Product(3, "ProductC", 100.0));

        System.out.println();
        productManagementSystem.filterProductsByPriceRange(products, 60.0, 90.0);
        System.out.println();





        for (Product product : products) {
            productManagementSystem.displayDetails(product);
        }
        System.out.println();


        productManagementSystem.calculateTotalPrice(products);
    }

}