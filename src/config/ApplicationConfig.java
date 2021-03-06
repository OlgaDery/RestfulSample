/**
 * 
 */
package config;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.persistence.jaxb.rs.MOXyJsonProvider;

import service.FoodRestService;

/**
 * @author Olga
 *
 */
@ApplicationPath("rs")
public class ApplicationConfig extends Application 
{
	private final Set <Class<?>> classes;
	
	public ApplicationConfig () 
	{
		HashSet <Class<?>> c = new HashSet <>();
		c.add(FoodRestService.class);
		c.add(MOXyJsonProvider.class);
		classes = Collections.unmodifiableSet(c);
		
	}
	
	@Override
	public Set <Class<?>> getClasses () {
		return classes;
	}

}
