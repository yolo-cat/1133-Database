import java.io.*;

// �ŧi�ۭq���ҥ~���O
class NoGasException extends Exception {
}

// �ŧi�T�����O
class MyCar implements Serializable {
  double GasTank;     // �O���o�q
  double Efficient;   // �Ӫo�Ĳv (����/����)

  public MyCar(double g,double e) {
    GasTank =g;
    Efficient=e;
  }

  // �樫���w���{����k
  public void go(double distance) throws NoGasException {
    double GasNeed= distance/Efficient;
    GasTank -= GasNeed;
    if (GasTank<0)
      throw new NoGasException();  // �o�q�����ɩߥX�ҥ~
  }

  public double checkGas() {
    return GasTank;  // �Ǧ^�ثe�o�q
  }
}

