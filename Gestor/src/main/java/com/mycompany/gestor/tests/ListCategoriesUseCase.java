/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestor.tests;

import br.g12.duque.gabriela.dao.CategoryDao;
import br.g12.duque.gabriela.models.Category;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 08110
 */
public class ListCategoriesUseCase {
    public static void main(String[] args) {
        //1. Criar um array list 
        ArrayList<Category> list = null;
        //2. Criar um objeto dao para buscar os dados
        Category cat = new Category(); 
        CategoryDao dao = new CategoryDao(cat);
        list = dao.findAall();        
        // System.out.println(list);
        String message = "";
        for(Category c:list) {
            message = message + c.getName()+ "\n";
        }
         JOptionPane.showMessageDialog(null, message);
    }
    
}
