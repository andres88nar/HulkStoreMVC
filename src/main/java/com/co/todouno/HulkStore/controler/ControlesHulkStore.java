/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.todouno.HulkStore.controler;

import com.co.todouno.HulkStore.services.HulkStoreServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
        
        System.out.println(hulkStoreServices.listaProdcutos());
        return "listaProductos";
    }
}
