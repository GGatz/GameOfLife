/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameoflife;

/**
 *
 * @author gatsby
 */
public class login {

    String name, password;
    
    
    public boolean checkLogin(String name, String password)
    {
        if((name == this.name) && (password == this.password))
        {
            return true;
        }
        return false;
    }
}
