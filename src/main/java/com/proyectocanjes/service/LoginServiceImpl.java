package com.proyectocanjes.service;
/*
@Author: Deepak Kumar
Check more tutorials at http://www.roseindia.net
*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectocanjes.dao.*;


@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
              this.loginDAO = loginDAO;
       }
      
       public boolean checkLogin(String userName, String userPassword){
              System.out.println("In Service class...Check Login");
              return loginDAO.checkLogin(userName, userPassword);
       }
}