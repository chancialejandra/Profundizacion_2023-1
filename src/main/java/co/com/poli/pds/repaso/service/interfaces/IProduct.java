package co.com.poli.pds.repaso.service.interfaces;

import co.com.poli.pds.repaso.entity.Product;

import java.util.List;
import java.util.Optional;

public interface IProduct {

    public Product save(Product product);

    public List<Product> findAll ();

    public void delete(Long id);

    public Optional<Product> findById(Long id);


}
