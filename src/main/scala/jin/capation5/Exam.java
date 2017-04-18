package jin.capation5;

/**
 * Created by jin on 2017/4/2.
 */
public class Exam {

    private int[] mark = new int[48];

    public void test(String s){
        for (char c : s.toCharArray()) {
            int index = (int)c - 65;
            mark[index]++;
        }
    }

    public void show() {
        for (int i=0;i<mark.length;i++) {
            char symbol = (char) (i + 65);
            int times = mark[i];
            if (times <= 0) {
                continue;
            }
            System.out.println(symbol + ":"+mark[i]+" ");
        }
    }

    public static void main(String[] args) {
        Exam e = new Exam();
        e.test("abcABCAAaaZMSW");
        e.show();
    }

}
