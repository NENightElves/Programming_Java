import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

public class Average_gui
{
    static  int count=0;
    static  int count_l=0;

    public static void main(String args[])
    {
        int i;

        JFrame JF = new JFrame("Average");
        JPanel JP = new JPanel();
        JPanel JP2=new JPanel();
        JLabel[] label = new JLabel[3];
        JLabel[] label_res = new JLabel[3];
        JLabel[] label_=new JLabel[8];
        JTextField[] textbox =new JTextField[1000];
        JTextField[] textbox_s=new JTextField[1000];
        label[0]=new JLabel("求和");
        label[1]=new JLabel("平均数");
        label[2]=new JLabel("方差");
        for(i=0;i<=2;i++) label_res[i]=new JLabel();
        for(i=0;i<=7;i++) label_[i]=new JLabel();
        for(i=0;i<=999;i++)
        {
            textbox[i]=new JTextField(15);
            textbox[i].addCaretListener(new CaretListener()
            {
                @Override
                public void caretUpdate(CaretEvent e)
                {
                    int i;
                    int n=0;
                    n=0;
                    JTextField et=new JTextField();
                    for (i=0;i<=999;i++) if (e.getSource()==textbox[i]) {et=textbox[i];n=i;break;}
                    if (et.getText()=="")
                    {
                        for(i=n;i<=count;i++)
                        {
                            textbox[i].setText(textbox[i+1].getText());
                            textbox_s[i].setText(textbox[i+1].getText());
                        }
                        JP2.remove(textbox[n]);
                        JP2.remove(textbox_s[n]);
                        count--;
                        count_l++;
                        JP2.add(label_[count_l]);
                        count_l++;
                        JP2.add(label_[count_l]);
                    }
                }
            });
            textbox_s[i]=new JTextField("1",15);
            textbox[i].setVisible(false);
        }

        JF.setLayout(new GridLayout(2,1));
        JF.setSize(300, 400);
        JF.setVisible(true);
        JF.add(JP);
//        JF.add(new Button());
        JF.add(JP2);

        JP.setLayout(new GridLayout(3, 2));
        JP.add(label[1]);
        for (i = 0; i <= 2; i++)
        {
            JP.add(label[i]);
            JP.add(label_res[i]);
        }

        JP2.setLayout(new GridLayout(6,2));
        JP2.setLocation(0,200);
        textbox[count].setVisible(true);
        JP2.add(textbox[count]);
        JP2.add(textbox_s[count]);
        count++;
        textbox[count].setVisible(true);
        JP2.add(textbox[count]);
        JP2.add(textbox_s[count]);
        for(i=0;i<=7;i++) JP2.add(label_[i]);
        count++;
        count_l=7;
    }


}
