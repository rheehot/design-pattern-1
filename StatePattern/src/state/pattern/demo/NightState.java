package state.pattern.demo;

public class NightState implements state{
	private static NightState singleton = new NightState();
	private NightState() {
	}
	public static state getInstance() {
		return singleton;
	}
	public void doClock(Context context, int hour) {
		if (hour == 23 || hour == 0) {
			context.changeState(SnackState.getInstance());
		} else if (9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}
	public void doUse(Context context) {
		context.callSecurityCenter("��� : �߰��ݰ� ���! ");
	}
	public void doAlarm(Context context) {
		context.callSecurityCenter("���(�߰�)");
	}
	public void doPhone(Context context) {
		context.recordLog("�߰���ȭ ����");
	}
	public String toString() {
		return "[�߰�]";
	}
}
