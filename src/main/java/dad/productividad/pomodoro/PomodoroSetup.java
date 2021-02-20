package dad.productividad.pomodoro;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class PomodoroSetup {

	private IntegerProperty minutes = new SimpleIntegerProperty();
	private IntegerProperty shortBreak = new SimpleIntegerProperty();
	private IntegerProperty longBreak = new SimpleIntegerProperty();
	private IntegerProperty pomoLength = new SimpleIntegerProperty();

	public PomodoroSetup(int minutes, int shortBreak, int longBreak, int pomoLength) {
		this.minutes.set(minutes);
		this.shortBreak.set(shortBreak);
		this.longBreak.set(longBreak);
		this.pomoLength.set(pomoLength);
	}

	public final IntegerProperty minutesProperty() {
		return this.minutes;
	}

	public final int getMinutes() {
		return this.minutesProperty().get();
	}

	public final void setMinutes(final int minutes) {
		this.minutesProperty().set(minutes);
	}

	public final IntegerProperty shortBreakProperty() {
		return this.shortBreak;
	}

	public final int getShortBreak() {
		return this.shortBreakProperty().get();
	}

	public final void setShortBreak(final int shortBreak) {
		this.shortBreakProperty().set(shortBreak);
	}

	public final IntegerProperty longBreakProperty() {
		return this.longBreak;
	}

	public final int getLongBreak() {
		return this.longBreakProperty().get();
	}

	public final void setLongBreak(final int longBreak) {
		this.longBreakProperty().set(longBreak);
	}

	public final IntegerProperty pomoLengthProperty() {
		return this.pomoLength;
	}

	public final int getPomoLength() {
		return this.pomoLengthProperty().get();
	}

	public final void setPomoLength(final int pomoLength) {
		this.pomoLengthProperty().set(pomoLength);
	}

	@Override
	public String toString() {
		return "PomodoroSetup [minutes=" + minutes + ", shortBreak=" + shortBreak + ", longBreak=" + longBreak + "]";
	}

}
