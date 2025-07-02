import java.io.*;

class HanoiTowerGame {

  void go(int discs) {
    hanoiTower('A','C','B',discs);
  }

  // ��ڷh�ʺФl
  void moveDisc(char source,char target,int disc){
    System.out.println("�N" + disc + "���Фl�q�W�l " +
      source + " �h�� " + target);
  }

  // a�G�ӷ��W�l
  // c�G�ت��a
  // b�G�������W�l
  // discs�G�Фl�ƶq
  void hanoiTower(char a,char c,char b,int discs) {
    if (discs == 1) { // �����h�ʡA���j����
      moveDisc(a,c,discs);
      return;
    }

    // ���N�̤j�Фl�H�~���Фl�h��B
    hanoiTower(a,b,c,discs - 1);

    // ��̤j���Фl�h��C
    moveDisc(a,c,discs);

    // ��h��B���Фl�h��C
    hanoiTower(b,c,a,discs - 1);
  }
}

public class HanoiTower {

  public static void main(String[] argv) throws IOException{
    HanoiTowerGame game = new HanoiTowerGame();

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    System.out.print("�п�J�Фl�ƶq�G");
    int discs = java.lang.Integer.parseInt(br.readLine());

    game.go(discs);
  }
}