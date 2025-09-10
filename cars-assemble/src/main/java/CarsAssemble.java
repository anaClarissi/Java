public class CarsAssemble {

    public double productionRatePerHour(int speed) {

        double successRate;
        double productionRate;

        if (speed == 0) {

            return 0;

        } else if (speed <= 4) {

            successRate = 1;

        } else if (speed <= 8) {

            successRate = 0.9;

        } else if (speed == 9) {

            successRate = 0.8;

        } else {

            successRate = 0.77;

        }

        productionRate = 221 * speed * successRate;


        return productionRate;

    }

    public int workingItemsPerMinute(int speed) {

        return (int) productionRatePerHour(speed) / 60;

    }
}
