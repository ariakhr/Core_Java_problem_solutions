import codility.domain.Employee;
import codility.domain.Product;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8StreamUtilsExamples {

    public static void main(String[] args) {

        List<Product> productList = Utils.getProducts();

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

        //Stream – A list of Employee List with id, name and salary – write code to return only the name of employees above 50K
        Employee employee = new Employee();
        List<String> employeeName = employee.getEmployees().stream()
                .filter( e -> e.getSalary() > 50000).map(Employee::getName).collect(Collectors.toList());
        System.out.println("Employees with Salary > 50000 " + employeeName);

    }
}
