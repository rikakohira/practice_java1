class Car1 {
  int no;
  int speed;

  Car1() {
    no = 0;
  }

  Car1(int n) {
    no = n;
  }

  void run(int s) {
    speed = s;
  }

  void brake() {
    speed = 0;
  }

  void brake(int s) {
    speed -= s;
  }

  void display() {
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}
