public class Rate {
  public static void main(String args[]) {

    int money = 100_000; //�ɴڪ��B
    double rate = 1.8; //�~�Q�v %
    int lendingMonths = 12; // �ɴڴ���
    int lendingYears = 3;

//  if ($j("#rdyear").val() == 0) {
//    lendingMonths = (CheckInt($j("#loanyear").val(), 0)) * 12;
//  } else {
//    lendingMonths = CheckInt($j("#loanmonth").val(), 0);
//  }

    rate = rate / 12; // ��Q�v

    double rate_100 = rate / 100;  // �Q�v�������p��
    double buf_temp = 1;  // ����
    for (int i = 0; i < lendingMonths; i++) {  // �p��ƧQ�p�⥻�Q�M����
      buf_temp *= (1 + rate_100);
    }

    System.out.println("buf_temp=" + buf_temp);
    System.out.println("rate_100=" + rate_100);
    //System.out.println("�e������C�����٥��� " +  + "��");
    double buf_rate = (rate_100 * buf_temp) / (buf_temp - 1);
    double rtn_mon = money * buf_rate;
    rtn_mon = (rtn_mon + 0.49); //=>�e������C�����٥���
    System.out.println("�e������C�����٥��� " + rtn_mon  + "��");
  }
}
