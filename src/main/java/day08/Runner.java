package day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {

            /*  Soru: "Bir Employee sınıfı tanımlayın. Her çalışanın bir adı, maaşı ve departmanı olsun.
       Aşağıdaki işlemleri gerçekleştiren bir Java metodu yazın:

        Çalışanları departmanlarına göre gruplayın.
        Her departman için çalışanların ortalama maaşını hesaplayın.
        Sonuçları lambda ifadeleri ve akış (stream) API'si kullanarak döndürün.

       */

        List<Employee> employees = Arrays.asList(
                new Employee("John", 5000, "HR"),
                new Employee("Jane", 7000, "HR"),
                new Employee("Alice", 8000, "IT"),
                new Employee("Bob", 6000, "IT"),
                new Employee("Charlie", 5500, "Sales"),
                new Employee("David", 4500, "Sales")
        );
       //Employee employee1 = new Employee("Ali", 5500, "IT");
       //employees.add(employee1);
       //employees.add(new Employee("Veli", 4000, "Sales"));

        Map<String, Double> sonuç = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                Collectors.averagingDouble(Employee::getSalary)));

        sonuç.forEach((t, u) -> System.out.println(t + "  :  " + u));

    }
}
