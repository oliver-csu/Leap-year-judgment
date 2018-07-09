import java.util.Calendar;

public class LeapYearJudgment {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		//将日历日期设置为3月1号
		c.set(2000,2,1);
		//调用add方法，向前偏移一天
		c.add(Calendar.DAY_OF_MONTH, -1);
		//调用get方法获取天数
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
	}

}
