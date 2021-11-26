
class Car {

    int yearModel;
    String make;
    int speed;
    void accelerate() {
        this.speed = speed;
        speed += 5;
    }
    void brake(){
        this.speed = speed;
        if(speed >= 5) {
        speed -= 5;
    }
        else {
            speed = 0;
        }
    }
}