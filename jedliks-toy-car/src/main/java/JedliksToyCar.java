public class JedliksToyCar {
    int distancia = 0;
    int bateria = 100;

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distancia);
    }

    public String batteryDisplay() {
        if (bateria == 0){
            return "Battery empty";

        } else {
            return "Battery at "+ bateria + "%";
        }

    }

    public void drive() {
        if (bateria >= 1){
            distancia += 20;
            bateria -= 1;
        } else {
            bateria = bateria;
            distancia = distancia;
            batteryDisplay();

        }



    }
}
