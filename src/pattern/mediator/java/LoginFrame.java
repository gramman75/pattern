package pattern.mediator.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener, Mediator {
    private ColleagueCheckbox checkGuest;
    private ColleagueCheckbox checkLogin;
    private ColleagueTextField textUser;
    private ColleagueTextField textPass;
    private ColleagueButton buttonOk;
    private ColleagueButton buttonCancel;

    public LoginFrame(String title){
        super(title);
        setBackground(Color.lightGray);
        setLayout(new GridLayout(4,2));
        createColleague();

        this.add(checkGuest);
        this.add(checkLogin);
        this.add(new Label("User Name:"));
        this.add(textUser);
        this.add(new Label("Password"));
        this.add(textPass);
        this.add(buttonOk);
        this.add(buttonCancel);

        this.pack();
        this.show();
    }

    @Override
    public void createColleague() {
        CheckboxGroup g = new CheckboxGroup();
        checkGuest = new ColleagueCheckbox("Guest", g, true);
        checkLogin = new ColleagueCheckbox("Login",g,false);
        textUser = new ColleagueTextField("", 10);
        textPass = new ColleagueTextField("" , 10);
        buttonOk = new ColleagueButton("Ok");
        buttonCancel = new ColleagueButton("Cancel");

        checkGuest.setMediator(this);
        checkLogin.setMediator(this);
        textUser.setMediator(this);
        textPass.setMediator(this);
        buttonOk.setMediator(this);
        buttonCancel.setMediator(this);

        checkGuest.addItemListener(checkGuest);
        checkLogin.addItemListener(checkLogin);
        textUser.addTextListener(textUser);
        textPass.addTextListener(textPass);
        buttonOk.addActionListener(this);
        buttonCancel.addActionListener(this);
    }

    @Override
    public void colleagueChanged() {
        if (checkGuest.getState()){
            textUser.setColleagueEnabled(false);
            textPass.setColleagueEnabled(false);
            buttonOk.setColleagueEnabled(true);
        }else {
            textUser.setColleagueEnabled(true);
            if (textUser.getText().length() > 0) {
                textPass.setColleagueEnabled(true);
                if (textPass.getText().length() > 0){
                    buttonOk.setColleagueEnabled(true);
                }
            } else  {
                textPass.setColleagueEnabled(false);
                buttonOk.setColleagueEnabled(false);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }
}
