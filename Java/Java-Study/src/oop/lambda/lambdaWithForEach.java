package oop.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class lambdaWithForEach {

    public static void main(String[] args) {

        List<String> pcList = Arrays.asList("CPU", "RAM", "GPU", "FAN");
        pcList.forEach(components -> System.out.println("PC Component: " + components));


        Map<String, Double> map = new HashMap<>();
        map.put("CPU AMD Ryzen 5560", 768.34);
        map.put("RAM ASGARD 2x16GB DDR4", 693.87);
        map.put("GPU RTX 1660 Super", 1847.93);
        map.forEach((product, value) -> System.out.println("Product: " + product + " | Price: " + value));

    }

}
