public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    private void setFlying(boolean isFliying)
    {
        this.flying = isFliying;
    }


    private void setAltitude(int altitude)
    {
        this.altitude += altitude;
    }



    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if(this.isFlying())
        {
            System.out.println(this.getName() + " already took off in the sky");
        } else {
            System.out.println(this.getName() +" takes off in the sky.");
            this.setFlying(true);
        }
    }

    @Override
    public void ascend(int altitude) {
        if (this.isFlying()) {
            this.setAltitude(altitude);
            System.out.println(this.getName() + " flies upward, altitude : " + this.getAltitude());
        } else {
            System.out.println("The bird doesn't fly !");
        }
    }


    @Override
    public void glide() {
        if (this.isFlying()){
            System.out.println("It glides into the air.");
        } else {
            System.out.println("It glides over the floor");
        }

    }

    @Override
    public void descend(int altitude) {
        if (this.isFlying()) {
            this.setAltitude( - altitude);
            System.out.println(this.getName() + " flies downward, altitude : " + this.getAltitude());
        } else {
            System.out.println("The bird doesn't fly !");
        }

    }

    @Override
    public void land() {
        if (this.isFlying()) {
            if(this.getAltitude()>1) {
                System.out.println(this.getName()+" is too high, it can't lands.");
            }
            if (this.getAltitude() == 1) {
                this.setAltitude(0);
                this.setFlying(false);
                System.out.println( this.getName() + " lands on the ground");
            }
        }
        else {
            System.out.println(this.getName() + "is not flying.");
        }
    }

}