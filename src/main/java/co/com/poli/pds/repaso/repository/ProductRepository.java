package co.com.poli.pds.repaso.repository;

import co.com.poli.pds.repaso.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findByCategory(String numeroIdentificacion);


}
