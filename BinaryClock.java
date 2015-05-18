import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BinaryClock
{
	private int[] hour;
	private int[] minute;
	private int tempHr;
    private int tempMin;
	private boolean isPm;
	private Calendar cal;
	private SimpleDateFormat timeFormat;

	public BinaryClock()
	{
		hour = new int[4];
		minute = new int[6];
		cal = Calendar.getInstance();
		timeFormat = new SimpleDateFormat("h,m,a");
	}

	public void makeTime()
	{
		String time = timeFormat.format(cal.getTime());
		Scanner in = new Scanner(time);
		in.useDelimiter(",");
		tempHr = Integer.parseInt(in.next().trim());
		tempMin = Integer.parseInt(in.next().trim());
		isPm = false;
		if (in.next().trim().equals("PM"))
		{
			isPm = true;
		}
        
        setTime();
	}

	private void setTime()
	{
		hour = toBinary(tempHr, "hr");
		minute = toBinary(tempMin, "min");
	}

	private static int[] toBinary(int num, String type)
	{
		int binLength = 4;
		if (type.equals("min"))
		{
			binLength += 2;
		}

		int[] binNum = new int[binLength];
		int index = 0;
		int value = num;
		while (value > 0 && index < binLength)
		{
			if (value % 2 == 0)
			{
				value = value / 2;
				binNum[index] = 0;
			}
			else
			{
				value = value / 2;
				binNum[index] = 1;
			}

			index++;
		}

		return binNum;
	}

	public void printTime()
	{
		System.out.print("Hr: ");
		for (int i = hour.length - 1; i >= 0; i--)
		{
			System.out.print(hour[i]);
		}

		System.out.print(" Min: ");
		for (int k = minute.length - 1; k >= 0; k--)
		{
			System.out.print(minute[k]);
		}

		System.out.println();
	}
    
    public int[] getHour()
    {
        return hour;
    }
    
    public int[] getMinute()
    {
        return minute;
    }
}
