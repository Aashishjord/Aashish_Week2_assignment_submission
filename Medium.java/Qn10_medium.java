class Model {
    String modelName;    //This Question was done as instructed by the teacher using array
    double version;
    int year;
    String bodyType;

    public Model(String modelName, double version, int year, String bodyType) {
        this.modelName = modelName;
        this.version = version;
        this.year = year;
        this.bodyType = bodyType;
    }

    public void displayModelInfo() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Version: " + version);
        System.out.println("Year: " + year);
        System.out.println("Body Type: " + bodyType);
    }
}

public class Qn10_medium {
    String brand;
    Model model;
    double price;

    public Qn10_medium(String brand, Model model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("\n-----------------");
        System.out.println("Brand: " + brand);
        model.displayModelInfo();
        System.out.println("Price: " + price);
        System.out.println("-----------------\n");
    }

    public static void main(String[] args) {
        Model c1Model = new Model("Civic", 1.1, 2016, "Sedan");
        Qn10_medium c1 = new Qn10_medium("Honda", c1Model, 50000);

        Model c2Model = new Model("Prado", 3.1, 2022, "SUV");
        Qn10_medium c2 = new Qn10_medium("Land Cruiser", c2Model, 600000);

        Model c3Model = new Model("Veyron", 1.1, 2016, "Sports");
        Qn10_medium c3 = new Qn10_medium("Bugatti", c3Model, 500000);

        Model c4Model = new Model("Sportage", 3.4, 2018, "Normal");
        Qn10_medium c4 = new Qn10_medium("KIA", c4Model, 874439);

        Qn10_medium[] carArr = new Qn10_medium[4]; 
        carArr[0] = c1;
        carArr[1] = c2;
        carArr[2] = c3;
        carArr[3] = c4;

        for (int i = 0; i < carArr.length; i++) {
            if (carArr[i].price > 200000) {
                carArr[i].displayCarInfo();
            }
        }
    }
}
