package pe.chambitape.web;

import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

/**
 * 
 * @author chambitape
 *
 */
@RestController
@RequestMapping(value = "/welcome")
public class WelcomeResources {
	
	private static final Logger LOGGER = Logger.getLogger(WelcomeResources.class);


	/**
	 * 
	 * @return {@link String}
	 */
	@RequestMapping(value = "/mensaje", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String getDemoText() throws UnsupportedEncodingException {
		LOGGER.debug("Obtener Mensaje.");


		return "Welcome";
	}
}
