package dev.lleviathn.shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController
{
    @Autowired
    private ProductService productService;

    // Gets all products
    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts()
    {
        return new ResponseEntity<List<Product>>(productService.allProducts(), HttpStatus.OK);
    }

    // Gets product based on SKU
    @GetMapping("/{sku}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable int sku)
    {
        return new ResponseEntity<Optional<Product>>(productService.findProductBySku(sku), HttpStatus.OK);
    }
}
