public class Auto {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;
    int id;
    static int counter = 1;


    public Auto(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand == null || brand.equals(" ")) {
            this.brand = "default";
        } else {this.brand = brand; }

        if (model == null || model.equals(" ")) {
        this.model = "default";
        } else {this.model = model; }

        if (engineVolume <= 0 || Double.compare(engineVolume,0)==0) {
        this.engineVolume = 1.5;
        } else {this.engineVolume = engineVolume; }

        if (color == null || color.equals(" ")) {
        this.color = color;
        } else {this.color = color; }

        if (year <= 0) {
        this.year = 2000;
        } else {this.year = year; }

        this.country = country;
        this.id = counter++;
    }

    @Override
    public String toString() {
        return "Мачина "+id+
                "[Брэнд: " + brand +
                ", модель: " + model +
                ", год выпуска: " + year +
                ", обьем двигателя: " + engineVolume + "л."+
                ", цвет: " + color +
                ", страна производитель: " + country +
                ']';
    }
}
