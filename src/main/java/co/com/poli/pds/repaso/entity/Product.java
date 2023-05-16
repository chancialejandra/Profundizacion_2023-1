package co.com.poli.pds.repaso.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import co.com.poli.pds.repaso.entity.Category;

import java.util.List;
import java.util.Objects;

@Setter
@Getter
@Entity
@Table (name = "Product")
public class Product {

    @Id
    @Column(name = "id_producto")
    private Long idProducto;

    private String name;

    private double price;

    private int stock;

    @ManyToOne(fetch= FetchType.EAGER,cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "id_categoria")
    private Category category;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return idProducto.equals(product.idProducto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProducto);
    }
}
