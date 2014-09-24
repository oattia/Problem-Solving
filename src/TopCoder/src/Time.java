public class Time {

	public static String whatTime(int seconds) {

		int hours = seconds / 3600;

		seconds -= hours * 3600;

		int min = seconds / 60;

		seconds -= min * 60;

		String time = "" + hours + ":" + min + ":" + seconds;
		return time;
	}

}
