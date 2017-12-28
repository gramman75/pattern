package pattern.mediator.java;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements Colleague, ItemListener {
    private Mediator mediator;

    public  ColleagueCheckbox(String title, CheckboxGroup group, boolean checked){
        super(title, group, checked);
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setColleagueEnabled(boolean enabled) {
        super.setEnabled(enabled);
    }


    public void itemStateChanged(ItemEvent e){
        this.mediator.colleagueChanged();
    }

}
