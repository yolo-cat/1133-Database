import java.util.*;

public class FiveCities {

  public static void main(String args[]) {

    String[] cities= {"�x�_","100",
                      "�x�n","700",
                      "�x��","636",
                      "�x�F","950"};
    // �إߥi�񤻹露��������
    HashMap<String,String> thecities = new HashMap<>(6);

    for (int i=0;i<cities.length;i+=2)
      thecities.put(cities[i],cities[i+1]);

    System.out.println("HashMap �����e���G" + thecities);

    System.out.println("�N�x���[�J HashMap�I");
    thecities.put("�x��","400");
    System.out.println("HashMap �����e�ܦ��G" + thecities);

    System.out.println("�A�[�@�ӥx���I");
    thecities.put("�x��","401");     // �[�J���ƪ���
    System.out.println("HashMap �����e�ܦ��G" + thecities);
  }
}
