/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demo.InterFace;

import com.example.demo.Modelo.Category;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author facte
 */
public interface CategoryInterface extends CrudRepository <Category, Integer>{
    
}
