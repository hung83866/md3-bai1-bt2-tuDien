package com.bt2.controller;

import model.Library;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.LibraryServiceIMPL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
public class libraryController {
List<Library> libraries = LibraryServiceIMPL.libraries;
    @GetMapping("/tudien")
    public ModelAndView home(@RequestParam String english) {

        ModelAndView modelAndView = new ModelAndView("home");
        boolean check= true;
        for (int i = 0; i < libraries.size(); i++) {
            if (english.equalsIgnoreCase(libraries.get(i).getEngLish())){
                modelAndView.addObject("vn",libraries.get(i).getVN());
                check = false;
            }
        }
        if (check){
            modelAndView.addObject("khongCo","KHONG CO TRONG TU DIEN");
        }
        modelAndView.addObject("english",english);
        return modelAndView;
    }
}
