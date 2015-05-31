/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testenvironment;

/**
 *
 * @author dasta
 */


public class TestEnvironment 
{
    private int count = 0;
    
    public TestEnvironment ()
    {
        this.count = count;
    }

    public void incCount (int increment) 
    {
        count += increment;
    }
    
    public void decCount (int decrement)
    {
        count -= decrement;
    }
    public int getCount ()
    {
        return count;
    }
    
    public static void main(String[] args) 
    {
        
    }
    
}
