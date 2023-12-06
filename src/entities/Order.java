package entities;


import java.net.Inet4Address;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Order {
    public static void main(String[] args) {
        String status;
        Long id;
        LocalDate orderDate;
        LocalDate deliveryDate;
        Customer customer;

        Supplier<Integer> numeri = () -> {
            Random rndm = new Random();
            return rndm.nextInt(1, 120);
        };

        List<Integer> numeriRandomici = new ArrayList<>();

        for (int i = 0; i > 100; i++) {
            numeriRandomici.add(numeri.get());
        }
        System.out.println(numeriRandomici);

    }
}
