import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class assign {

    public static double getBMR(int age, double height, double weight, String gender) {
        double result;
        if (gender.equals("남자")) {
            result = 66.47 + (13.73 * weight) + (5 * height) - (6.76 * age);
        } else if (gender.equals("여자")) {
            result = 655.1 + (9.56 * weight) + (1.85 * height) - (4.68 * age);
        } else return 0;

        return result;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("기초대사량 계산기 20201910 김민수");
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new FlowLayout());

        String[] strAry = {"남자", "여자"};
        int gender = JOptionPane.showOptionDialog(frame, "당신의 성별은??", "제목", JOptionPane.OK_OPTION, JOptionPane.QUESTION_MESSAGE, null, strAry, null);

        int age = Integer.parseInt(JOptionPane.showInputDialog(frame, "나이 입력", 0));
        double height = Double.parseDouble(JOptionPane.showInputDialog(frame, "키 입력", 0));
        double weight = Double.parseDouble(JOptionPane.showInputDialog(frame, "몸무게 입력", 0));

        double result = Math.round(getBMR(age, height, weight, strAry[gender]));

        JOptionPane.showMessageDialog(frame, "당신의 기초대사량 : " + result + "Kcal", "결과", JOptionPane.PLAIN_MESSAGE);
    }
}
