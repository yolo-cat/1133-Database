public class UsingOtherClasses {
  public static void main(String[] argv) {
    // �ϥΪ����O���s��b�P�@��Ƨ����䥦�ɮפ�
    Rectangle re = new Rectangle(1,3,5,7);
    Circle    ci = new Circle(3,6,9);
    Cylinder  cr = new Cylinder(2,4,6,8);

    System.out.println(re.toString());
    System.out.println(ci.toString());
    System.out.println(cr.toString());
  }
}
