/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import com.ttdev.Prueba.Prueba;
import com.ttdev.token.Token;
import com.ttdev.user.Usuario;
import java.util.Scanner;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.jaxrs.ext.form.Form;

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
		WebClient client = null;
		
		// Keyboard Input
		Scanner keyboard = new Scanner(System.in);
		System.out.println("	--- DELETE Post ---");
		System.out.println("	-------------------");
		System.out.println();
		boolean existPath = false;
		int postId;
		Prueba post = new Prueba();
		do {
			System.out.print("	Introduzca un ID de un contenido tipo Post: ");
			postId = keyboard.nextInt();
			System.out.println();
			try {
				// Get - Drupal Post Content Type
			client = WebClient.create("http://localhost/docroot/restful");
		    	client.accept("application/xml");
		    	client.path("node/" + postId);
				post = client.get(Prueba.class);
                                System.out.println(post.getType());
				if (post.getType().equalsIgnoreCase("noticia")) {
					existPath = true;
					System.out.println("	¿Está seguro que desea eliminar '" + post.getTitle() + "'? (1/0)");
					int confirm =keyboard.nextInt();
					if(confirm == 0) {
						return;
					}
				} else {
					System.out.println("	Introduce un ID de un contenido tipo Post:");
					System.out.println();
					existPath = false;
				}
			} catch (javax.ws.rs.NotFoundException e) {
				System.out.println("	Introduce un ID de un contenido tipo Post existente.");
				System.out.println();
				existPath = false;
			}
		} while (!existPath);
            

		// Get Token
		client.back(true);
		client.path("user/token");
		Token token = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(null, Token.class);
                //System.out.println(token);

		// Log In
		client.back(true);
		client.path("user/login");
		client.header("X-CSRF-Token", token.getToken());
		Form form = new Form();
		form.set("username", "test");
		form.set("password", "test");
                
		// System.out.println(form);
		Usuario usuario = client.type(MediaType.APPLICATION_FORM_URLENCODED).post(form, Usuario.class);
                
                form = new Form();
                form.set("title","titulo de prueba");
		// Prepare Put - Drupal Post Content Type
		client.back(true);
		client.path("node/"+postId);
		
                
		// Prepare Put - Building headers
		client.header("cookie", usuario.getUser().getName() + "=" + usuario.getToken());
		client.replaceHeader("X-CSRF-Token", usuario.getToken());
		
		// Put - Send petition
		String resp = client.type(MediaType.APPLICATION_FORM_URLENCODED).put(form,String.class);
                //String title = post.getTitle();
                
              
                //System.out.println();
		//System.out.println("	Código de respuesta = " + resp.getStatus());
		//System.out.println();


		// Log Out
		client.back(true);
		client.path("user/logout");
//		client.post(null, String.class);
		
		System.out.println();
		//System.out.println("	Código de respuesta = " + resp.getStatus());
		System.out.println();

    }
    
}
