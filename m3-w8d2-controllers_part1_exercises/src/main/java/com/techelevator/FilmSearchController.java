package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Customer;
import com.techelevator.dao.model.Film;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FilmSearchController {

    @Autowired
    private FilmDao filmDao;

    @RequestMapping("/searchFilms")
    public String showFilmSearchForm() {
        return "filmList";
    }

    @RequestMapping("/requestFilms")
    public String searchFilms(HttpServletRequest request) {
    	String orderBy= request.getParameter("genre");
    	String maxFilmLength= request.getParameter("maxLength");
    		int foo = Integer.parseInt("maxFilmLength");
    	String minFilmLength= request.getParameter("minLength");
    		int foo2 = Integer.parseInt("minFilmLength");
    List<Film> filmList= filmDao.getFilmsBetween(orderBy, maxFilmLength, minFilmLength);
    request.setAttribute("film", filmList);
        	return "filmList";
        }
    }