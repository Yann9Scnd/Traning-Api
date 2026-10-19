package toko;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    public record Product(int id, String name) {}

    private final Map<Integer, Product> data = Map.of(
        42, new Product(42, "Keyboard"),
        1,  new Product(1, "Mouse"),
        2,  new Product(2, "Monitor")
    );

    @GetMapping("/{id}")
    public ResponseEntity<Product> get(@PathVariable int id) {
        Product p = data.get(id);
        if (p == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(p);
    }
}
