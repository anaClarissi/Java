class NeedForSpeed {


    private int speed;
    private int batterryDrain;
    public int meters;
    public int batterry = 100;


    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batterryDrain = batteryDrain;

    }


    public boolean batteryDrained() {

       return batterry - batterryDrain < 0;

    }

    public int distanceDriven() {

       return meters;

    }

    public void drive() {

        if (batterry > 0){

            this.meters += speed;
            this.batterry -= batterryDrain;

        } else {

            batterry = 0;

        }
        


    }

    public static NeedForSpeed nitro() {

        return new NeedForSpeed(50,4);

    }
}

class RaceTrack {


    private int distance;

    RaceTrack(int distance) {

        this.distance = distance;

    }



    public boolean canFinishRace(NeedForSpeed car) {

        while (!car.batteryDrained()){

            car.drive();

        }
        if (car.meters >= distance){

            return true;

        }
        return false;
    }
}
