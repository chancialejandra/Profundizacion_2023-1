package co.com.poli.pds.repaso.service.interfaces;

import co.com.poli.pds.repaso.entity.Product;
import co.com.poli.pds.repaso.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService implements IProduct{

    private ProductRepository productRepository;

    @Override
    public Product save(Product product){
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll (){
        return productRepository.findAll();
    }

    @Override
    public void delete(Long id){
         productRepository.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Long id){
        return productRepository.findById(id);
    }

}
