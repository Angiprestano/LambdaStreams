package entities;

import java.util.List;

public class Customer extends Order {
        Long id;
        String name;
        Integer tier;

    public Customer(List<Product> product, Customer customer) {
        super(product, customer);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }
}

