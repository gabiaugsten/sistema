/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor.tests;

import br.g12.duque.gabriela.dao.CategoryDao;
import br.g12.duque.gabriela.models.Category;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;

/**
 *
 * @author 08110
 */
public class InsertCategoryUseCase {
    public static void main(String[] args) {
        Category cat = new Category();
        String name = JOptionPane.showInputDialog("Nome:");
        String description = JOptionPane.showInputDialog("Descrição:");
        cat.setName(name);
        cat.setDescription(description);
        
        CategoryDao cd = new CategoryDao(cat);
        boolean success = cd.insert();
        
        if(success){
            JOptionPane.showMessageDialog(null, "Registro salvo com sucesso!");
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao salvar registro!");
        }
        
    }
}
