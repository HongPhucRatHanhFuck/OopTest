package manager;

import WaRFile.RawFile;
import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager implements Imanager<Product> {
    List<Product> list = new ArrayList<>();
    private final RawFile rawFile = new RawFile();
    public ProductManager() {
        list = rawFile.readFile();
    }

    @Override
    public void add(Product product) {
        list.add(product);
        rawFile.writeFile(list);
    }

    @Override
    public Product findById(int id) {
        for (Product product : list) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    @Override
    public boolean edit(int id, Product product) {
        Product oldProduct = findById(id);
        if (oldProduct == null) {
            return false;
        }
        int index = list.indexOf(oldProduct);
        list.set(index, product);
        rawFile.writeFile(list);
        return true;
    }

    @Override
    public boolean remove(int id) {
        Product product = findById(id);
        if (product == null) {
            return false;
        }
        list.remove(product);
        rawFile.writeFile(list);
        return true;
    }

    @Override
    public ArrayList<Product> findAll() {
        return (ArrayList<Product>) list;
    }
    public void sortIncreaseProduct() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).getPrice() > list.get(j + 1).getPrice()) {
                    Product temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for (Product product : list
        ) {
            System.out.println(product);
        }
    }

    public void SortProduct() {
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size() - i; j++) {
                if (list.get(j).getPrice() < list.get(j + 1).getPrice()) {
                    Product temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        for (Product product : list
        ) {
            System.out.println(product);
        }
    }

    public void MaxPrice() {
        double maxPrice = list.get(0).getPrice();
        Product product = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > maxPrice) {
                product = list.get(i);
            }
        }
        System.out.println(product);
    }
}
