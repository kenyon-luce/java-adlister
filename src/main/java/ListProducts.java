import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products{
    private List<Product> products = new ArrayList<>();

    public void ListProducts(){
        insert(new Product("screwdriver", 5.00));
        insert(new Product("hammer", 10.00));
        insert(new Product("nail-gun", 100.00));
    }

    @Override
    public List<Product> all() {
        return this.products;
    }

    @Override
    public void insert(Product product) {

    }
}
