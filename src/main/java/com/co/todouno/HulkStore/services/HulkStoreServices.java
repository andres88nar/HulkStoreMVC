
package com.co.todouno.HulkStore.services;

import com.co.todouno.HulkStore.entity.Producto;
import java.util.List;


public interface HulkStoreServices {

    public List<Producto> listaProdcutos();

    public Producto searchProductById(Producto product);

    public void addProduct(Producto product);

    public void deletCustomer(Producto product);
    
}
