package com.megashop.controller;

import com.megashop.dao.ItemDao;
import com.megashop.dao.ItemOrderDao;
import com.megashop.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ItemController {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ItemOrderDao itemOrderDao;
    @Autowired
    private Card card;

    @RequestMapping(value = "/itemDetails/{id}", method = RequestMethod.GET)
    public ModelAndView loadItem(@PathVariable String id) {
        Map<String, Object> model = new HashMap<>();
        Item item = itemDao.findById(Long.valueOf(id));
        model.put("item", item);
        return new ModelAndView("itemView", model);
    }

    @RequestMapping(value = "/buyItem/{id}", method = RequestMethod.GET)
    public ModelAndView buyItem(@PathVariable String id, HttpServletRequest request) {
        Map<String, Object> model = new HashMap<>();
        Item item = itemDao.findById(Long.valueOf(id));
        model.put("item", item);
        return new ModelAndView("contactDetails", model);
    }

    @RequestMapping(value = "/submitOrder/{id}", method = RequestMethod.POST)
    public @ResponseBody String submitOrder(@PathVariable String id, @RequestParam(value = "name") String name, @RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email) {
        Item item = itemDao.findById(Long.valueOf(id));
        UserContact userContact = new UserContact(name, phone, email);
        ItemOrder itemOrder = new ItemOrder(item, userContact);
        itemOrderDao.save(itemOrder);
        return null;
    }
}
