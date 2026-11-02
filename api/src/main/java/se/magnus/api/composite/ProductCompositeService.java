package se.magnus.api.composite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductCompositeService {
    @GetMapping(value = "/product-composite/{productId}", produces = "application/json")
    ProductAggregate getProduct(@PathVariable("productId") int productId);
}
