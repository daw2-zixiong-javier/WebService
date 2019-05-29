/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import ss.SoapAsyncRequest;
import com.ttdev.Prueba.*;
//import com.ttdev.ss.SimpleService_Service;
import com.ttdev.token.*;
import com.ttdev.user.*;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

import java.util.*;
import javax.ws.rs.core.Response;

/**
 *
 * @author ALE
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        		// Rest Client Preparation
		// Rest Client Preparation
		WebClient client = null;
		
		// Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("	--- Title Changer ---");
		System.out.println("	---------------------");
		System.out.println();
		boolean existPath = false;
		String toModifyTile = "";
                Prueba post = new Prueba();
		int postId;
		do {
			System.out.print("	Introduzca un ID de un contenido tipo Post que quiera modificar: ");
			postId = keyboard.nextInt();
			System.out.println();
			try {
				// Get - Drupal Post Content Type
				client = WebClient.create("http://localhost/docroot/restful");
                            client.accept("application/xml");
                            client.path("node/" + postId);
				post = client.get(Prueba.class);
				if (post.getType().equalsIgnoreCase("noticia")) {
					toModifyTile = post.getTitle();
					existPath = true;
				} else {
					System.out.println("	Introduce un ID de un contenido tipo Post.");
					System.out.println();
					existPath = false;
				}
			} catch (Exception e) {
				System.out.println("	Introduce un ID de un contenido tipo Post existente.");
				System.out.println();
				existPath = false;
			}
		} while (!existPath);
		
		// Soap Server Call - Converting title string
		
		// Async Petition
		SoapAsyncRequest soapCall = new SoapAsyncRequest(toModifyTile);
		soapCall.start();                
                
                
		// Get Token
		client.back(true);
		client.path("user/token");
		Token token = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(null, Token.class);

		// Log In
		client.back(true);
		client.path("user/login");
		client.header("x-CSRF-Token", token.getToken());
		
		Form form = new Form();
		form.set("username", "test");
		form.set("password", "test");
		
		Usuario usuario = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form, Usuario.class);

		// Prepare Put - Drupal Post Content Type
		client.back(true);
		client.path("node/"+postId);
                
                //System.out.println(post.getTitle());
		// Prepare Put - Building body
		form = new Form();
		
                try {
			soapCall.join(); // wait for async request if needed
		} catch (InterruptedException e) {}
                
		String soapResponse = soapCall.getModifiedTitle();
                
                form.set("title",soapResponse);
		// Prepare Put - Building headers
		client.header("cookie", usuario.getSessionName() + "=" + usuario.getSessid());
		client.header("X-CSRF-Token", usuario.getToken());
		
		// Put - Send petition
		String resp = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form, String.class);
                
		// Log Out
		client.back(true);
		client.path("user/logout");
		//client.post(null, String.class);
		
		System.out.println();
		System.out.println("	¡Título Cambiado!");
		System.out.println("	Original = " + toModifyTile);
		System.out.println("	Modificado = " + soapResponse);
		System.out.println();
    }
    
}
