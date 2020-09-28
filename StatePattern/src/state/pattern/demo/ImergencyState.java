package state.pattern.demo;

public class ImergencyState implements state{
	private static ImergencyState singleton = new ImergencyState();
	private ImergencyState() {
	}
	public static state getInstance() {
		return singleton;
	}
	public void doClock (Context context, int hour) {
		
	}
	public void doUse(Context context) {
		context.callSecurityCenter("��� : ���� �ݰ� ���! ");
	}
	public void doAlarm(Context context) {
		context.callSecurityCenter("���(����)");
	}
	public void doPhone(Context context) {
		context.callSecurityCenter("�Ϲ���ȭ(����)");
	}
	public String toString() {
		return "[����]";
	}
}
