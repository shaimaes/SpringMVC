package fr.formation.inti;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.GenericWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/*WebApplicationInitializer garantit que la classe 
 * ApplicationInitializerest détectée par 
 * SpringServletContainerInitializer(qui est elle-même 
 * amorcée automatiquement) et utilisée pour initialiser 
 * tout conteneur Servlet 3.
 * */
public class WebAppInit implements WebApplicationInitializer {

	@Override
	public void onStartup(final ServletContext sc) throws ServletException {

		// Create the 'root' Spring application context
		AnnotationConfigWebApplicationContext root = new AnnotationConfigWebApplicationContext();

		// Manage the lifecycle of the root application context
		root.scan("fr.formation");
		sc.addListener(new ContextLoaderListener(root));

		// Create the dispatcher servlet's Spring application context
		ServletRegistration.Dynamic appServlet = sc.addServlet("mvc",
				new DispatcherServlet(new GenericWebApplicationContext()));
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/");
	}
}
