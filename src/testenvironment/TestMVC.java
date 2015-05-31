/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenvironment;

import javax.swing.SwingUtilities;
import testenvironment.TestApp;
import testenvironment.TestController;
import testenvironment.TestEnvironment;
/**
 *
 * @author dasta
 */
public class TestMVC 
{
    public static void main(String[] args)
    {
        
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {                                           
                TestApp showMeTheMoney = new TestApp();
        
                TestEnvironment modelForMe = new TestEnvironment();
        
                TestController Courier = new TestController();
                Courier.addModel(modelForMe);
                Courier.addView(showMeTheMoney);
            }
        });  
        /**
         * TestApp showMeTheMoney = new TestApp();
        
        TestEnvironment modelForMe = new TestEnvironment();
        
        TestController Courier = new TestController();
        Courier.addModel(modelForMe);
        Courier.addView(showMeTheMoney);
        
        showMeTheMoney.setVisible(true);
         */
    }
}
