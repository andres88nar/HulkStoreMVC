
package com.co.todouno.HulkStore.services;

import com.co.todouno.HulkStore.entity.Producto;
import com.co.todouno.HulkStore.repository.KardexRepository;
import com.co.todouno.HulkStore.repository.ProductoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HulkStoreServicesImp implements HulkStoreServices{
        
    @Autowired
    private KardexRepository kardexRepository;
    
    @Autowired 
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> listaProdcutos() {
        return (List<Producto>) productoRepository.findAll();
    }

    @Override
    public Producto searchProductById(Producto product) {
        return productoRepository.findById(product.getIdproducto()).orElse(null);
    }

    @Override
    public void addProduct(Producto product) {
        productoRepository.save(product);
    }

    @Override
    public void deletCustomer(Producto product) {
        productoRepository.delete(product);
    }
    
    
    
    
    
    
}
