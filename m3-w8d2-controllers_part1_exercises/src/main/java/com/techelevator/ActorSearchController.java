package com.techelevator;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;
import com.techelevator.dao.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	/* What request mapping do we want here, this loads the first view */
	
	@RequestMapping("/search")
	public String showSearchActorForm() {
		return "actorList";			// <--- I'm calling .jsp
	}
	
	// now go to JSP

	/* What about here? */
	@RequestMapping("/searchActor")
	public String searchActors(HttpServletRequest request) {
		/* Call the model and pass values to the jsp */
		String actorLastName= request.getParameter("lastName");	// <-- getting the parameter
		List<Actor> actorsList= actorDao.getMatchingActors(actorLastName);   //<---calling the dao (doing the work)
		request.setAttribute("actors", actorsList);		//<----setting the parameter 
		return "actorList";		// <--- calls .jsp
	}
}
