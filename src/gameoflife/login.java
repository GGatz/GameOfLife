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
    
    /**
     *
     * @param name user's name, a username, if you will
     * @param password user's password
     * @return
     */
    public boolean checkLogin(String name, String password)
    {
        if(name.equals(this.name) && (password.equals(this.password)))
        {
            return true;
            //call start of main function here?
        }
        else
            return false;
    }
}
