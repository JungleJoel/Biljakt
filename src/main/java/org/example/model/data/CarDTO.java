package org.example.model.data;

public class CarDTO {

    String url;
    String model;
    String info;
    String fuelType;
    String transmissionType;
    int price;
    int madeYear;
    int mileage;



    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

    public String getFuelType() {
        return fuelType;
    }
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public int getMadeYear() {
        return madeYear;
    }
    public void setMadeYear(int madeYear) {
        this.madeYear = madeYear;
    }

    public int getMileage() {
        return mileage;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String toString() {
        return "{\n\"url\": \"" + url + "\",\n"
                + "\"model\": \"" + model + "\",\n"
                + "\"info\": \"" + info + "\",\n"
                + "\"fuelType\": \"" + fuelType + "\",\n"
                + "\"transmissionType\": \"" + transmissionType + "\",\n"
                + "\"mileage\": " + mileage + ",\n"
                + "\"madeYear\": " + madeYear + ",\n"
                + "\"price\": " + price + "\n }";
    }
}
