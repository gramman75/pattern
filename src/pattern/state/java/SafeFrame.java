package pattern.state.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private TextField textClock= new TextField(60);
    private TextArea textScreen = new TextArea(10,60);
    private Button buttonUse = new Button("금고사용");
    private Button buttonAlarm = new Button("비상벨");
    private Button buttonPhone = new Button("일반통화");
    private Button buttonExit = new Button("종료");

    private State state = DayState.getInstance();

    public SafeFrame(String title){
        super(title);

        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);

        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);

        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);

        add(panel, BorderLayout.SOUTH);

        pack();
        show();

        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse){
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm){
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone){
            state.doPhone(this);
        } else if (e.getSource() == buttonExit){
            System.exit(0);
        }
    }

    @Override
    public void setClock(int hour) {
        textClock.setText("현재시각은 " + hour +"시");
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append(msg);
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append(msg);
    }
}
