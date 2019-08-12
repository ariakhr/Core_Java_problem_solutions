import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamUtilsExamples {

    public static void main(String[] args) {

        List<Product> productList = Arrays.asList(new Product(23, "potatoes", 100),
                new Product(14, "orange", 150), new Product(13, "lemon", 200),
                new Product(23, "bread", 75), new Product(13, "sugar", 745));

        //Stream used to convert list of Product objects to List<String> of product name
        List<String> prods = productList.stream().map(Product::getName).collect(Collectors.toList());
        System.out.println(prods);

        //Stream used to convert list of Product objects to String of product name delimited by ','
        String str = productList.stream().map(Product::getName).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(str);

        //To get common statistics - Sum, Max, Average, toString, count, Min
        IntSummaryStatistics statistics = productList.stream().collect(Collectors.summarizingInt(Product::getProductId));
        System.out.println("complete stats : " + statistics);
        System.out.println("Sum of products: " + statistics.getSum());
        System.out.println("Max of products: " + statistics.getMax());
        System.out.println("Min of products: " + statistics.getMin());
        System.out.println("Average of products: " + statistics.getAverage());
        System.out.println("Count of products: " + statistics.getCount());

        //Function to group product based on any field
        Map<Integer, List<Product>> elem = productList.stream().collect(Collectors.groupingBy(Product::getProductId));
        System.out.println("Group By ProductId: " + elem);

        //Function to partition (yes/no) product based on any field
        Map<Boolean, List<Product>> mapPartioned = productList.stream()
                .collect(Collectors.partitioningBy(element -> element.getProductId() > 15));
        System.out.println("Partition by product Id > 15 " + mapPartioned);


    }
}
