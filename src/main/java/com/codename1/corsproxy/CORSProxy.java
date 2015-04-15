/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codename1.corsproxy;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.http.HttpResponse;

/**
 *
 * @author shannah
 */
public class CORSProxy extends org.mitre.dsmiley.httpproxy.URITemplateProxyServlet{

    
    @Override
    protected void copyResponseHeaders(HttpResponse proxyResponse, HttpServletRequest servletRequest, HttpServletResponse servletResponse) {
        super.copyResponseHeaders(proxyResponse, servletRequest, servletResponse); //To change body of generated methods, choose Tools | Templates.
        
        servletResponse.setHeader("Access-Control-Allow-Origin", "*");
    }
    
    
    
}
