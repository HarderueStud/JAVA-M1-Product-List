package com.harderue.s.company.m1_poduct_list;
public class Product {
        private int id;
        private String name;
        private String description;
        private int imageResource; // R.drawable.xxx

        public Product(int id, String name, String description, int imageResource) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.imageResource = imageResource;
        }


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getImageResource() {
        return imageResource;
    }

    public int getId() {
        return id;
    }
}
