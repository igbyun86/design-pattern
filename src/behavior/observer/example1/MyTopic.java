package behavior.observer.example1;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;
	private final Object MUTEX = new Object();
	
	public MyTopic() {
		this.observers = new ArrayList<Observer>();
	}
	
	@Override
	public void register(Observer obj) {
		if (obj == null) {
			throw new NullPointerException("Null Observer");
		}

		// ����ȭ
		synchronized (MUTEX) {
			if (!observers.contains(obj)) {
				this.observers.add(obj);
			}
		}
	}

	@Override
	public void unregister(Observer obj) {
		// ����ȭ
		synchronized (MUTEX) {
			this.observers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		// List�� ����ȭ�� �ȵǱ� ������ ����ȭ�Ͽ� ����� List ����
		List<Observer> observersLocal = null;
		
		synchronized (MUTEX) {
			if (!changed) {
				return;
			}
			
			observersLocal = this.observers;
			for (Observer observer : observersLocal) {
				observer.update();
			}
		}
	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	//method to post message to the topic
	public void postMessage(String msg) {
		System.out.println("Message Posted to Topic : " + msg);
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}

}
