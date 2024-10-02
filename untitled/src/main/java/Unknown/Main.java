package Unknown;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<CarModel> readCarModelsFromCsv(String filePath) {
        List<CarModel> carModels = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int id = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                if (values.length == 4) {
                    CarModel carModel = new CarModel(id, values[0], values[1], values[2], values[3]);
                    carModels.add(carModel);
                    id++;
                }
            }
        } catch (IOException e) {

        }
        return carModels;
    }

    public static void main(String[] args) {
        String filePath = "D:\\prac\\untitled\\src\\main\\java\\Unknown\\data\\car_model.txt";
        List<CarModel> carModels = readCarModelsFromCsv(filePath);

        for (CarModel carModel : carModels) {
            //System.out.println(carModel);

            carModel[0].equals()
        }





    }

}