package WaRFile;

import model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RawFile {
    File file = new File("product.csv");
    public void writeFile(List<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String line = "";
            for (Product product : products) {
                line += product.getData() + "\n";
            }
            bufferedWriter.write(line);
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public List<Product> readFile() {
        List<Product> products = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 0) {
                    continue;
                }
                System.out.println(Arrays.toString(data));
                Product product = new Product(Integer.parseInt(data[0]), data[1], Double.parseDouble(data[2]),Integer.parseInt(data[3]) , data[4]);
                products.add(product);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return products;

    }
}
