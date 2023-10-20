/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import view.Menu;


/**
 *
 * @author huynh
 */
public class Data_Fomat extends Menu<String>{
    
    static String[] mc = {"Input Phone", "Input Email", "Input Date","Exit"};
    private Library library;

    public Data_Fomat() {
        super("=====Validate Program=====", mc);
        library = new Library();
        
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                System.out.println("--------Add Phone------");
                library.checkInputPhone();
                break;
            case 2:
                System.out.println("-------Add Email-----");
                library.checkInputEmail();
                break;
            case 3:
                System.out.println("--------Add Date------");
                library.checkInputDate();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Your choice invalid! Pls input another choice");
        }
    }
}
