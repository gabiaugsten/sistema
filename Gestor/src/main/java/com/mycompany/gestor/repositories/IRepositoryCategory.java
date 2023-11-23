/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestor.repositories;

import br.g12.duque.gabriela.models.Category;
import java.util.ArrayList;

/**
 *
 * @author 08110
 */
public interface IRepositoryCategory {
    public boolean insert(); // Métodos abstratos // clean code
    public boolean update();
    public boolean delete(); // interface = conjunto de metodos abstratos // abstrato = metodo que nao foi implementado ainda
    public ArrayList findAll();
    public Category findById(); // parametros ==> variaveis locais
}
