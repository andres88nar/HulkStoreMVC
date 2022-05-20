
package com.co.todouno.HulkStore.controler;

import com.co.todouno.HulkStore.entity.Producto;
import com.co.todouno.HulkStore.entity.Kardex;
import com.co.todouno.HulkStore.services.HulkStoreServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todouno/HulkStore")
@Slf4j
public class ControlesHulkStore {
    
    @Autowired
    private HulkStoreServices hulkStoreServices; 
    
    @GetMapping("/") 
    public String starting() {      
         return "Inicio";
    }
    
    @GetMapping("/listProducts") 
    public String listaProductos(Model model) {
        model.addAttribute("modal","Lista de productos");
        model.addAttribute("listProducts",hulkStoreServices.listaProdcutos());        
        return "listaProductos";
    }
    
    @GetMapping("/addProduct")
    public String addProduct(Producto product, Model model){
        model.addAttribute("modal","Resgitro de nuevo producto");
        model.addAttribute("Producto", product);
        return "newProduct";
    } 
    
    
    @GetMapping("/editProduct/{idproducto}")
    public String editProduct(Producto product, Model model){        
        product = hulkStoreServices.searchProductById(product);       
        model.addAttribute("modal","Edicion de producto");
        model.addAttribute("Producto", product);
        return "newProduct";
    } 
        
    @PostMapping("/saveproduct")
    public String saveCustomer(Producto product){
       hulkStoreServices.addProduct(product);
       log.info("SAVE: "+product);
       return "redirect:/todouno/HulkStore/listProducts";
    }
        
    @GetMapping("/deleteProduct/{idproducto}")
    public String deleteCustomer(Producto product){
       hulkStoreServices.deletCustomer(product);
       log.info("INFO: DELETE "+product);
       return "redirect:/todouno/HulkStore/listProducts"; 
    } 
    
    @GetMapping("/stockProduct/{idproducto}")
    public String stockCustomer(Producto product, Model model){
       product = hulkStoreServices.searchProductById(product);        
       model.addAttribute("modal","ingreso a kardex del producto");
       model.addAttribute("product",product);
       model.addAttribute("kardex",new Kardex());
       return "addStock"; 
    } 
    
    
    
    
       
}
