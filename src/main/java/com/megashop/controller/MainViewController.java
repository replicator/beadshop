package com.megashop.controller;


import com.megashop.dao.CategoryDao;
import com.megashop.dao.ItemDao;
import com.megashop.dao.ItemDaoHibernate;
import com.megashop.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.*;

@Controller
public class MainViewController {
    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value = "/mainView", method = RequestMethod.GET)
    public ModelAndView getMainView() {
        HashMap<String, Object> model = new HashMap<>();
        model.put("categories", getCategories());
        return new ModelAndView("mainTemplate", model);
    }

    private List<Category> getCategories() {
        return categoryDao.findAll();
    }
}
