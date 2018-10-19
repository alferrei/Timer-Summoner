package classes;

import java.util.Timer;
import java.util.TimerTask;

public class Countdown {

	static int interval;
	static Timer timer;
	int secs;

	public int getSecs() {
		return secs;
	}

	public void setSecs(int secs) {
		this.secs = secs;
	}

	public void CountdownToZero(String name, int secs) {
		int delay = 1000;
		int period = 1000;
		timer = new Timer();
		interval = secs;
		System.out.println(name + " " + secs);
		timer.scheduleAtFixedRate(new TimerTask() {

			public void run() {
				System.out.println(name + " " + setInterval());

			}
		}, delay, period);
	}

	private static final int setInterval() {
		if (interval == 1)
			timer.cancel();
		return --interval;
	}
}
