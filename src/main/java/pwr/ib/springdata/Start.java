package pwr.ib.springdata;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {

    private ProductRepo productRepo;

    @Autowired
    public Start(ProductRepo productRepo){
        this.productRepo = productRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
        Product product = new Product("Telefon", (float) 999.99,true);
        Product product2 = new Product("Jojo", (float) 99.99,false);
        productRepo.save(product);
        productRepo.save(product2);
    }
}
