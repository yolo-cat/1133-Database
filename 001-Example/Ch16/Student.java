import java.io.*;

public class Student implements Serializable {

  public Student (String s, short e, short m, short j) {
    name = s;
    EScore = e;
    MScore = m;
    JScore = j;
  }

  public Student () { }

  // �Ǧ^�m�W�M�U�����Z��ƪ���k
  public String getN () { return name; }
  public short getE ()  { return EScore; }
  public short getM ()  { return MScore; }
  public short getJ ()  { return JScore; }

  // �p��öǦ^�T�쥭�����O����k
  public double getAvg () {
    return (EScore + MScore + JScore) / 3.0;
  }

  private String name;    // �m�W
  private short EScore;   // �^�妨�Z
  private short MScore;   // �ƾǦ��Z
  private short JScore;   // Java ���Z
}
