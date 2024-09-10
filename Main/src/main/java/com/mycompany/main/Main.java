/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;


import models.Peao;
import models.Cavalo;
import models.Bispo;
import models.Torre;
     
/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args){
    
    Peao peao = new Peao();
    peao.mover();
    
    Cavalo cavalo = new Cavalo();
    cavalo.mover();
    
    Bispo bispo = new Bispo();
    bispo.mover();
    
    Torre torre = new Torre();
    torre.mover();
    
}
}   