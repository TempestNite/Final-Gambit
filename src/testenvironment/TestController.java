/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenvironment;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dasta
 */
public class TestController 
{
    private TestEnvironment Model = new TestEnvironment();
    private TestApp View = new TestApp();
    
    public TestController ()
    {
        
        //try
        //{
        IncrementListener biteMe = new IncrementListener();
        DecrementListener ninjaLike = new DecrementListener();
        this.View.addIncrementListener(biteMe);
        this.View.addDecrementListener(ninjaLike);
        //}
        /*catch (NullPointerException e)
        {
            System.out.println("I Finally Gotcha.");
        }*/
        
    }
    
    public void addModel(TestEnvironment m)
    {
        this.Model = m;
    }
    
    public void addView(TestApp v)
    {
        this.View = v;
    }
    
    class IncrementListener implements ActionListener
    {

        public void actionPerformed (ActionEvent e)
        {
            int delta = 0;
            
            delta = View.getAmountChange();
            
            Model.incCount(delta);
            
            View.setCount(Model.getCount());
        }


    }
    
    class DecrementListener implements ActionListener
    {
        
        public void actionPerformed (ActionEvent e)
        {
            int delta = 0;
            
            delta = View.getAmountChange();
            
            Model.decCount(delta);
            
            View.setCount(Model.getCount());
        }

    }
    
}
