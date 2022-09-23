public class Car {
    private String brand;
    private String model;
    private float engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    public Car(String brand, String model, float engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume > 0f) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }

        if (color == null || color.isEmpty()) {
            this.color = "белый";
        } else {
            this.color = color;
        }

        if (productionYear > 0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear = 2000;
        }

        if (productionCountry == null || productionCountry.isEmpty()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
    }

    @Override
    public String toString() {
        return "Марка " + brand + ", " +
                "модель " + model + ", " +
                "объем двигателя в литрах " + engineVolume + ", " +
                "цвет кузова " + color + ", " +
                "год производства " + productionYear + ", " +
                "страна сборки " + productionCountry;
    }

}
