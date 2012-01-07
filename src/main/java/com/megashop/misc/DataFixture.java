package com.megashop.misc;

import com.megashop.dao.CategoryDao;
import com.megashop.domain.Category;
import com.megashop.domain.Comment;
import com.megashop.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

public class DataFixture {
    @Autowired
    private CategoryDao categoryDao;
    private Boolean enabled;
    private Random random = new Random();
    private String[] images = {
            "/img/categories/vyshivki.jpg", "/img/categories/pechwork.jpg",
            "/img/categories/svadebny_textil.jpg", "/img/categories/svadebny_textil2.jpg",
            "/img/categories/tilda_textil.jpg", "/img/categories/tilda_textil2.jpg"
    };

    public void createData() {
        if (!enabled) return;
        createAndSaveCategory("One", images[0]);
        createAndSaveCategory("Two", images[1]);
        createAndSaveCategory("Three", images[2]);
        createAndSaveCategory("Four", images[3]);
        createAndSaveCategory("Five", images[4]);
        createAndSaveCategory("Six", images[5]);
    }

    private void createAndSaveCategory(String name, String imageLocation) {
        Category category = new Category();
        category.setName(name);
        category.setImageLocation(imageLocation);
        addItems(name, category);
        categoryDao.save(category);
    }

    private void addItems(String name, Category category) {
        for (int i = 0; i < 7; i++) {
            Item item = new Item();
            item.setCategory(category);
            item.setName("Item " + i);
            item.setDescription(String.format("Item %d from category %s is the best item to buy!", i, name));
            item.setPrice(random.nextInt(100));
            item.setLogo(images[i % images.length]);
            addComments(item);
        }
    }

    private void addComments(Item item) {
        for (int j = 0; j < 5; j++) {
            Comment comment = new Comment();
            comment.setText("I have bought item " + item.getName() + " " + j + " month ago and very happy with that!");
            comment.setItem(item);
        }
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
