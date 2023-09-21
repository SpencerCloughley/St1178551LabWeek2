package com.example.st1178551labweek2;

public class Phone {
    private String model;
    //Apple, Samsung, Google Etc.
    private String manufacturer;
    private int year;

    public Phone(String model, String manufacturer, int year){
        setModel(model);
        setManufacturer(manufacturer);
        setYear(year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        while(model.contains("  ")){
            //removes any instance of double space and prevents entering "    " as a valid name
            model=model.replace("  "," ");
        }
        if(model.length()>2) {
            String words[] = model.split(" ");
            String properModel = "";
            for (String word : words) {
                word = word.toLowerCase();
                word = word.substring(0, 1).toUpperCase() + word.substring(1);
                properModel += word + " ";
            }
            properModel = properModel.trim();
            this.model = properModel;
        }
        else throw new IllegalArgumentException(model + " is invalid, name of model must be longer than 2 characters");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        //valid Manufacturers:
        //Samsung, Apple, Google, Nokia, Huawei
        if(manufacturer.equals("Samsung") || manufacturer.equals("Apple") || manufacturer.equals("Google") || manufacturer.equals("Nokia")  || manufacturer.equals("Huawei"))
            this.manufacturer = manufacturer;
        else
            throw new IllegalArgumentException("The manufacturer must be one of; Samsung, Apple, Google, Nokia or Huawei");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>1876)
            this.year = year;
        else
            throw new IllegalArgumentException("Must be a year after 1876 when the first phone was invented");
    }

    public String toString(){return this.manufacturer + " " + this.model + " made in " + this.year;}
}
