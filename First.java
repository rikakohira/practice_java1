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

    // int a = Integer.parseInt(args[0]);
    // int b = Integer.parseInt(args[1]);

    // System.out.println("a = " + a + ", b = " + b);
    // System.out.println("a + b = " + (a + b));
    // System.out.println("a - b = " + (a - b));
    // System.out.println("a * b = " + (a * b));
    // System.out.println("a / b = " + (a / b));
    // System.out.println("a % b = " + (a % b));
    // System.out.println("a >= 0�F" + (a >= 0));
    // System.out.println("(a >= 0) && (b >= 0)�F" + ((a >= 0) && (b >= 0)));

    // int price = Integer.parseInt(args[0]);
    // double rate = 0.08; // 消費税8％

    // int amount = (int) (price * (1 + rate));
    // System.out.println("税込金額は" + amount + "円です");

    // int price = Integer.parseInt(args[0]);
    // double rate = 0.1; // 消費税10%
    // int amount, discount;

    // if (price >= 5000) {
    // discount = 500;
    // } else if (price >= 3000) {
    // discount = 300;
    // } else {
    // discount = 0;
    // }

    // amount = (int) ((price - discount) * (1 + rate));
    // System.out.println("値引きは" + discount + "円です。");
    // System.out.println("税込金額は" + amount + "円です。");

    // int num = Integer.parseInt(args[0]);

    // switch (num) {
    // case 1:
    // System.out.println("こんちには");
    // break;
    // case 2:
    // System.out.println("おはようさん");
    // break;
    // default:
    // System.out.println("やっほー！");
    // }

    // int num = Integer.parseInt(args[0]);

    // while (num < 3) {
    // System.out.println("numは" + num + "です！");
    // num++;
    // }

    // for (int i = 0; i < 3; i++) {
    // System.out.println("iは" + i + "です！");
    // }

    // int[] score = new int[3];
    // score[0] = 80;
    // score[1] = 100;
    // score[2] = 75;

    // String[] name = { "菅原", "村山", "寺島" };

    // for (int i = 0; i < score.length; i++) {
    // System.out.println(name[i] + "は、" + score[0] + "点です");
    // }
    // System.out.println("合計人数は" + score.length + "人です");

    int height = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
    int area;

    area = height * width;

    System.out.println("高さ：" + height);
    System.out.println("幅：" + width);
    System.out.println("面積：" + area);
  }
}
