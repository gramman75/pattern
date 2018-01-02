package pattern.state.java;

public class NightState implements State{
    private static NightState singleton = new NightState();

    private NightState(){

    }

    public static NightState getInstance(){
        return singleton;
    }

    @Override
    public void doClock(Context context, int hour) {
        if (9<= hour && hour < 17)
            context.changeState(DayState.getInstance());
    }

    @Override
    public void doAlarm(Context context) {
        context.callSecurityCenter("비상벨(야간)");
    }

    @Override
    public void doUse(Context context) {
        context.recordLog("비상: 야간금고사용");
    }

    @Override
    public void doPhone(Context context) {
        context.callSecurityCenter("야간통화 녹음");
    }

    @Override
    public String toString() {
        return "[야간]";
    }
}
