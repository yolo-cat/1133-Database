import java.lang.Runnable;

public class Lambda {

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("�쥻�� Runnable �{��");
            }
        }).start();

        new Thread( () ->
                System.out.println("�Q�� Lambda ��k��g !!") ).start();
    }
}