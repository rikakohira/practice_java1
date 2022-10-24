class Student {
  // // メンバ変数（属性）
  // String name;
  // int engScore;
  // int mathScore;

  // // メソッド（操作）
  // void display() {
  // System.out.println(name + "さん");
  // System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  // }

  // void setScore(int eng, int math) {
  // engScore = eng;
  // mathScore = math;
  // }

  // double getAvg() {
  // double avg = (engScore + mathScore) / 2.0;
  // return avg;
  // }

  // String name;
  // int engScore;
  // int mathScore;

  // void setData(String n) {
  // name = n;
  // }

  // void setData(String n, int e, int m) {
  // name = n;
  // engScore = e;
  // mathScore = m;
  // }

  // void setScore(int e, int m) {
  // engScore = e;
  // mathScore = m;
  // }

  // void display() {
  // System.out.println(name + "さん");
  // System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  // }

  String name;
  int engScore;
  int mathScore;

  Student(String n) {
    name = n;
  }

  Student(String n, int e, int m) {
    name = n;
    engScore = e;
    mathScore = m;
  }

  void setScore(int e, int m) {
    engScore = e;
    mathScore = m;
  }

  void display() {
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
}
