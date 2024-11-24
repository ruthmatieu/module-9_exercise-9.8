public class Main {

    public static class Fan {
        public static int SLOW = 1;
        public static int MEDIUM = 2;
        public static int FAST = 3;

        private int speed = SLOW;
        private boolean on = false;
        private double radius = 5;
        private String color = "blue";

        // methods for speed
        public int getSpeed() {
            return speed;
        }
        public void setSpeed(int speed) {
            this.speed = speed;
        }

        // methods for on
        public boolean isOn() {
            return on;
        }
        public void setOn(boolean on) {
            this.on = on;
        }

        // methods for radius
        public double getRadius() {
            return radius;
        }
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // methods for color
        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            if (on) {
                return "Fan speed: " + speed + ", Color: " + color + ", Radius: " + radius;
            } else {
                return "Fan color: " + color + ", Radius: " + radius + ", fan is off";
            }
        }
    }

    // Test method
    public static void main(String[] args) {
        
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // values for first fan
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        // values for second fan
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1.toString());
        System.out.println("Fan 2: " + fan2.toString());
    }
}