import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetExamples {

    public static void main(String args[]) {
        List<Product> productList = Utils.getProducts();
        Set<Product> products = new HashSet<>();

        products.addAll(productList);
        //Duplicates are available since we haven't utilized equals and hashMap for Product
        System.out.println("Products count : " + products.size() + " Product List: " + products);

        List<ProductNew> newProductList = Utils.getNewProducts();
        Set<ProductNew> newProducts = new HashSet<>();
        newProducts.addAll(newProductList);
        //Duplicates are removed for new Products - Hashcode and Equals contract for ProductId and Name
        System.out.println("New Products count : " + newProducts.size() + " New Product List: " + newProducts);

    }
}
