/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.robowizards.multiauto;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author Butters
 */
public class MultiAutoWindow extends JFrame implements KeyListener{
    
    private MultiAuto multiAuto;
    
    public MultiAutoWindow(MultiAuto multiAuto){
        setSize(200, 75);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MultiAuto : " + multiAuto.getCurrent_auto());
        addKeyListener(this);
        setVisible(true);
        this.multiAuto = multiAuto;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int number = findNumber(e);
        
        if(number == multiAuto.getCurrent_auto() || number > multiAuto.getAuto_program_largebound() || number < multiAuto.getAuto_program_smallbound()){
            return;
        }
        else{
            multiAuto.setCurrent_auto(number);
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    //Used to format the KeyEvent into one of the number keys 
    private int findNumber(KeyEvent e){
        int number = multiAuto.getCurrent_auto();
        
        if(e.getKeyCode() == KeyEvent.VK_1){
            number = 1;
            return number;
        }
        else if(e.getKeyCode() == KeyEvent.VK_2){
            number = 2;
            return number;
        }
        else if(e.getKeyCode() == KeyEvent.VK_3){
            number = 3;
            return number;
        }        
        else if(e.getKeyCode() == KeyEvent.VK_4){
            number = 4;
            return number;
        }    
        else if(e.getKeyCode() == KeyEvent.VK_5){
            number = 5;
            return number;
        }        
        else if(e.getKeyCode() == KeyEvent.VK_6){
            number = 6;
            return number;
        }        
        else if(e.getKeyCode() == KeyEvent.VK_7){
            number = 7;
            return number;
        }        
        else if(e.getKeyCode() == KeyEvent.VK_8){
            number = 8;
            return number;
        }        
        else if(e.getKeyCode() == KeyEvent.VK_9){
            number = 9;
            return number;
        }      
       return number; 
    }
    
    
    
}
