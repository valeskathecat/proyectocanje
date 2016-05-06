package com.proyectocanjes.dao;
import com.proyectocanjes.model.*;

public interface LoginDAO{    
       public boolean checkLogin(String userName, String userPassword);
}