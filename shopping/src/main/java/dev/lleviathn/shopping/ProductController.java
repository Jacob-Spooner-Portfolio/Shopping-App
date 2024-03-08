package dev.lleviathn.shopping;

import org.bson.types.ObjectId;
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

    // Gets all movies
    @GetMapping
    public ResponseEntity<List<Product>> allProducts()
    {
        return new ResponseEntity<List<Product>>(productService.allProducts(), HttpStatus.OK);
    }

    @GetMapping("/{sku}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable int sku)
    {
        return new ResponseEntity<Optional<Product>>(productService.findProductBySku(sku), HttpStatus.OK);
    }
}
