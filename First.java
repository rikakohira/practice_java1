class First {
  public static void main(String[] args) {
    // System.out.println("Javaを楽しもう");

    // int month;
    // month = 9;
    // int day = 21;

    // System.out.println("このチャンネルは、");
    // System.out.println(month + "月" + day + "日に公開しました！");

    // int[] score = new int[3];
    // score[0] = 90;
    // score[1] = 20;
    // score[2] = 30;

    // String[] name = { "高瀬", "田中", "磯野" };

    // System.out.println(name[0] + "さんは、" + score[0] + "点でした！");

    // int num = 10;
    // double pi = 3.14;
    // char blood = 'A';
    // boolean fun = true;
    // String msg = "こんにちは！";

    // System.out.println(num);
    // System.out.println(pi);
    // System.out.println(blood);
    // System.out.println(fun);
    // System.out.println(msg);

    // int[] score = new int[4];

    // score[0] = 90;
    // score[1] = 80;
    // score[2] = 100;
    // score[3] = 90;

    // System.out.println("一人目は" + score[0] + "点です");

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("a = " + a + ", b = " + b);
    System.out.println("a + b = " + (a + b));
    System.out.println("a - b = " + (a - b));
    System.out.println("a * b = " + (a * b));
    System.out.println("a / b = " + (a / b));
    System.out.println("a % b = " + (a % b));
    System.out.println("a >= 0�F" + (a >= 0));
    System.out.println("(a >= 0) && (b >= 0)�F" + ((a >= 0) && (b >= 0)));
  }
}
