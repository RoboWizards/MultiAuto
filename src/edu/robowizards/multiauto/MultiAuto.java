/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.robowizards.multiauto;

/**
 *
 * @author Butters
 */
public class MultiAuto {
    
    private int current_auto = 1;
    private int auto_program_largebound = 9;
    private int auto_program_smallbound = 0;
    
    private MultiAutoWindow window;
    private static MultiAuto instance;
    
    /**
     * Used to create the window  
     * Should be run at start
     */
    public void start(){
        window = new MultiAutoWindow(this);
    }

   /**
     * Retrieve the large bound of the MultiAuto selector
     * @return Large bound
     */ 
    public int getAuto_program_largebound() {
        return auto_program_largebound;
    }

   /**
     * Retrieve the large bound of the MultiAuto selector
     * @return Large bound 
     */ 
    public int getAuto_program_smallbound() {
        return auto_program_smallbound;
    }

   /**
     * Get the current auto program selected
     * @return Current program selected
     */ 
    public int getCurrent_auto() {
        return current_auto;
    }

   /**
     * Set the current auto program
     * @param current_auto program to set
     */ 
    public void setCurrent_auto(int current_auto) {
        this.current_auto = current_auto;
        window.setTitle("MultiAuto : " + getCurrent_auto());
    }
    
   /**
     * Set the large bound of the available programs. This is the highest value
     * a user can select. This can be used to prevent invalid choices from
     * occurring
     * @param auto_program_largebound to set
     */ 
    public void setAuto_program_largebound(int auto_program_largebound) {
        if(!(auto_program_largebound > 9)){
            this.auto_program_largebound = auto_program_largebound;
        }        
    }

   /**
     * Set the large bound of the available programs. This is the smallest value
     * a user can select. This can be used to prevent invalid choices from
     * occurring. 
     * @param auto_program_smallbound 
     */ 
    public void setAuto_program_smallbound(int auto_program_smallbound) {
        if(!(auto_program_smallbound > 0)){
            this.auto_program_smallbound = auto_program_smallbound;
        }
    }

   /**
     * Grab the singleton instance of the MultiAuto library
     * @return Singleton of MultiAuto
     */ 
    public static MultiAuto getInstance() {
        if(instance == null)
            instance = new MultiAuto();
        return instance;
    }
    
    
    
}
