package dev.lleviathn.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService
{
    @Autowired
    private ProductRepository productRepository;

    public List<Product> allProducts() { return productRepository.findAll(); }

    public Optional<Product> findProductBySku(int sku) { return productRepository.findProductBySku(sku); }
}
