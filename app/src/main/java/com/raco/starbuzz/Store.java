package com.raco.starbuzz;

public class Store {
    private String name;
    private String description;
    private int imageResourceId;

    //stores is an array of Stores
    public static final Store[] stores = {
            new Store("Caguas Store", "Located in Caguas", R.drawable.d_caguas_store),
            new Store("Cayey Store", "Located in Cayey Shopping Mall", R.drawable.d_cayey_store),
            new Store("Walmart San Juan", "Located at Walmart Super Center, San Juan", R.drawable.d_walmart_store)
    };

    //Each Store has a name, description, and an image resource
    private Store(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}
