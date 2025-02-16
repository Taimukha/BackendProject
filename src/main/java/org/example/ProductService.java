package org.example;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
    public void printProduct() {
        System.out.println("Product Service is working!");
    }
}
