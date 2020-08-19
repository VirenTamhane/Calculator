import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
    private JPanel Panel;
    private JButton nine;
    private JButton eight;
    private JButton plus;
    private JButton six;
    private JButton five;
    private JButton substract;
    private JButton three;
    private JButton two;
    private JButton multiply;
    private JButton percentage;
    private JButton zero;
    private JButton equal;
    private JButton seven;
    private JButton four;
    private JButton one;
    private JButton divide;
    private JLabel display;
    private JButton reset;
    public int num1 = 0,num2 = 0,sum=0,flag=0;
    public char sign;

    public Calc(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(Panel);
        this.setSize(500, 600);

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 9;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 9;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 8;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 8;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 7;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 7;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 6;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 6;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 5;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 5;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 4;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 4;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 3;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 3;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 2;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 2;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 1;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 1;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(flag==0) {
                    num1 = 0;
                    display.setText(String.valueOf(num1));
                    flag=1;
                }
                if(flag==1) {
                    num2 = 0;
                    display.setText(String.valueOf(num2));
                }
            }
        });
        percentage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 'a';
            }
        });
        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 'b';
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 'c';
            }
        });
        substract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 'd';
            }
        });
        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sign = 'e';
            }
        });
        equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (sign) {
                    case 'a': {
                        sum = (num1 / num2)*100;
                        break;
                    }
                    case 'b': {
                        sum = num1 / num2;
                        break;
                    }
                    case 'c': {
                        sum = num1 + num2;
                        break;
                    }
                    case 'd': {
                        sum = num1 - num2;
                        break;
                    }
                    case 'e': {
                        sum = num1 * num2;
                        break;
                    }
                }
                display.setText(String.valueOf(sum));
            }
        });
        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = num2 = sum = flag = 0;
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Calc("CALCULATOR");
        frame.setVisible(true);
    }
}