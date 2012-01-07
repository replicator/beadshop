package com.megashop.controller;

import com.megashop.dao.CategoryDao;
import com.megashop.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class CategoryController {
    @Autowired
    private CategoryDao categoryDao;

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public ModelAndView loadCategory(@PathVariable String id, HttpServletRequest request) {
        Map<String, Object> model = new HashMap<>();
        Category category = categoryDao.findById(Long.valueOf(id));
        model.put("message", "Contents of " + id);
        model.put("items", category.getItems());
        model.put("category", category);
        return new ModelAndView("categoryView", model);
    }
}
