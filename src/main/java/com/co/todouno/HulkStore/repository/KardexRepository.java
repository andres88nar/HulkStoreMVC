/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.todouno.HulkStore.repository;

import com.co.todouno.HulkStore.entity.Kardex;
import org.springframework.data.repository.CrudRepository;

public interface KardexRepository extends CrudRepository<Kardex, Integer> {
    
}
