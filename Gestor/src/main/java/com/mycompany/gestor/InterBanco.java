/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.gestor;

/**
 *
 * @author 08110
 */
public interface InterBanco {
    public boolean insert(); // Métodos abstratos // clean code
    public boolean update();
    public boolean delete(); // interface = conjunto de metodos abstratos // abstrato = metodo que nao foi implementado ainda
    public boolean findAll();
    public boolean findById(int id); // parametros ==> variaveis locais
}
