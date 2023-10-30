package com.harderue.s.company.m1_poduct_list;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
        private int id;
        private String name;
        private String description;
        private int imageResource; // R.drawable.xxx

        protected Product(Parcel in) {
            id = in.readInt();
            name = in.readString();
            description = in.readString();
            imageResource = in.readInt();
        }

        public Product(int id, String name, String description, int imageResource) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.imageResource = imageResource;
        }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(description);
        dest.writeInt(imageResource);
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
