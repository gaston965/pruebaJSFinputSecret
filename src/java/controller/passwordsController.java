/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author cie
 */
@ManagedBean(name = "passwordsController")
@SessionScoped
public class passwordsController implements Serializable {

     private String password;
     
     public String getPassword()
     {
      return password;
     }
    public void setPassword(String password) 
    {
      this.password=password;
    }
    
}
