package jp.ac.uryukyu.ie.e185720;

public class Repo4 {
    public static void main(String[] args) {
        try {
            String str = null;
            int moji = str.length();
            System.out.print(moji);
        }catch (NullPointerException n) {
            System.out.println("例外が発生しました。");
            System.out.println(n.getMessage());
        }
    }
}
