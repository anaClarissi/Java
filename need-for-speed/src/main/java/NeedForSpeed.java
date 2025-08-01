class NeedForSpeed {
    private int velocidade;
    private int porcentagem;
    NeedForSpeed(int speed, int batteryDrain) {
        velocidade = speed;
        porcentagem = batteryDrain;



    }

    public boolean batteryDrained() {
        throw new UnsupportedOperationException("Please implement the NeedForSpeed.batteryDrained() method");
    }

    public int distanceDriven() {
        throw new UnsupportedOperationException("Please implement the NeedForSpeed.distanceDriven() method");
    }

    public void drive() {
        throw new UnsupportedOperationException("Please implement the NeedForSpeed.drive() method");
    }

    public static NeedForSpeed nitro() {
        throw new UnsupportedOperationException("Please implement the (static) NeedForSpeed.nitro() method");
    }
}

class RaceTrack {
    RaceTrack(int distance) {
        throw new UnsupportedOperationException("Please implement the RaceTrack constructor");
    }

    public boolean canFinishRace(NeedForSpeed car) {
        throw new UnsupportedOperationException("Please implement the RaceTrack.canFinishRace() method");
    }
}
