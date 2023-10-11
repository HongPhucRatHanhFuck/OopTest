package view;

import manager.ProductManager;
import model.Product;

import java.util.List;
import java.util.Scanner;

public class MenuProduct {
    Scanner inputString = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void showMenu() {

        int choice;
        do {
            System.out.println("******Menu Product******");
            System.out.println("Enter Your Option");
            System.out.println("1)Show list\n" +
                    "2)Add product\n" +
                    "3)Edit product\n" +
                    "4)Remove product\n" +
                    "5)Sort by price\n" +
                    "6)Find Product max price\n" +
                    "7)Out");

            choice = inputInt.nextInt();
            inputInt.nextLine();
            switch (choice) {
                case 1:
                    showAll();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    editProduct();
                    break;
                case 4:
                    removeProduct();
                    break;
                case 5:
                    sortProduct();
                    break;
                case 6:
                    findMax();
                    break;
                case 7:
                    break;

            }

        } while (choice != 7);
    }

    public void addProduct() {
        System.out.println("******Menu Add Product******");
        System.out.println("Enter new id product: ");
        int id = inputInt.nextInt();
        System.out.println("Enter new product: ");
        String nameProduct = inputString.nextLine();
        System.out.println("Enter price product: ");
        double price = inputInt.nextFloat();
        System.out.println("Enter quantity product:");
        int quantity = inputInt.nextInt();
        System.out.println("Enter describe: ");
        String describe = inputString.nextLine();
        Product addProduct = new Product(id,nameProduct, price, quantity, describe);
        productManager.add(addProduct);
        System.out.println("Add product complete (^.^)");
        System.out.println("--------------------------");
    }

    public void editProduct() {
        System.out.println("******Menu Edit Product******");
        System.out.println("Enter new idEdit product: ");
        int idEdit = inputInt.nextInt();
        System.out.println("Enter new product: ");
        String name = inputString.nextLine();
        System.out.println("Enter price product: ");
        double price = inputInt.nextDouble();
        System.out.println("Enter quantity product:");
        int quantity = inputInt.nextInt();
        System.out.println("Enter type product: ");
        String typeProduct = inputString.nextLine();
        Product addProduct = new Product(idEdit, name, price, quantity, typeProduct);
        productManager.edit(idEdit, addProduct);
        System.out.println("Edit product complet :~~~~~~");
        System.out.println("-----------------------------");
    }

    public void removeProduct() {
        System.out.println("Enter id product need delete:");
        int deleteById = inputInt.nextInt();
        productManager.remove(deleteById);
        System.out.println("Remove product complete");
    }

    public void showAll() {
        System.out.println("List product is:");
        List<Product> products = productManager.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }
    public void findMax(){
        System.out.println("Max price product:");
        productManager.MaxPrice();
    }
    public void sortProduct(){
        System.out.println("Sort product");
        productManager.SortProduct();
    }

}
