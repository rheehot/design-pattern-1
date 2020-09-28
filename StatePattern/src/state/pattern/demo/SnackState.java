package state.pattern.demo;

public class SnackState implements state{
	private static SnackState singleton = new SnackState();
	private SnackState() {
	}
	public static state getInstance() {
		return singleton;
	}
	public void doClock(Context context, int hour) {
		if (hour != 23 || hour != 0) {
			if (hour <= 9 || hour >17) {
				context.changeState(NightState.getInstance());
			}
		}
//		if (hour != 23 && hour != 0) {
//			if (9 <= hour && hour < 17) {
//				context.changeState(NightState.getInstance());
//			} else if (hour > 9 || hour >= 17) {
//				context.changeState(DayState.getInstance());
//			}
//		}
	}
	public void doUse(Context context) {
		context.callSecurityCenter("��� : �߽Ľð��ݰ� ���! ");
		context.recordLog("�ݰ���(�߽Ľð�)");
	}
	public void doAlarm(Context context) {
		context.callSecurityCenter("���(�߽Ľð�)");
	}
	public void doPhone(Context context) {
		context.recordLog("�߽Ľð���ȭ ����");
	}
	public String toString() {
		return "[�߽Ľð�]";
	}
}
