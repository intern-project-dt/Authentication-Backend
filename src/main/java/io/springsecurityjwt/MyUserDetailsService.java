package io.springsecurityjwt;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Hashtable;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
    	
		Hashtable<String,String> employees =new Hashtable<String,String>();
    	
    	employees.put("E1","1234");
    	employees.put("E2","5678");
    	employees.put("E3","8901");
    	
    	String pass=employees.get(s);
        return new User(s, pass,
                new ArrayList<>());
    }
}