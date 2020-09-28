package state.pattern.demo;

public class LunchState implements state{
	private static LunchState singleton = new LunchState();
	private LunchState() {
	}
	public static state getInstance() {
		return singleton;
	}
	public void doClock (Context context, int hour) {
		if (hour != 12) {
			context.changeState(DayState.getInstance());
		}
	}
	public void doUse(Context context) {
		context.callSecurityCenter("��� : ���ɽð��ݰ� ���! ");
	}
	public void doAlarm(Context context) {
		context.callSecurityCenter("���(���ɽð�)");
	}
	public void doPhone(Context context) {
		context.recordLog("���ɽð���ȭ ����");
	}
	public String toString() {
		return "[���ɽð�]";
	}
}
