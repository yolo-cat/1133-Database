public class WrapperTest {

  public static void main(String args[]) {

    System.out.println("�ƭȫ��򥻸�����O�ܽd");

    Integer myint = Integer.valueOf(123456789);  // �إ� Integer ����
    Double mydbl = Double.valueOf(5.376543e200); // �إ� Double ����

    System.out.println("\n�H�U�O�� Integer ����ƭȪ����G�G");
    showall(myint);

    System.out.println("\n�H�U�O�� Double ����ƭȪ����G�G");
    showall(mydbl);
  }

  public static void showall(Number o) {  // ����k�M�Ψ����
                                          // �I�s�U���Ȥ�k�����G
    System.out.println("�I�s byteValue()  �G" + o.byteValue()  );
    System.out.println("�I�s doubleValue()�G" + o.doubleValue());
    System.out.println("�I�s floatValue() �G" + o.floatValue() );
    System.out.println("�I�s intValue()   �G" + o.intValue()   );
    System.out.println("�I�s longValue()  �G" + o.longValue()  );
    System.out.println("�I�s shortValue() �G" + o.shortValue() );
  }
}
