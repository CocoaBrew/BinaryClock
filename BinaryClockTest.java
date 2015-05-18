public class BinaryClockTest
{
	public static void main(String[] args)
	{
		long start = System.nanoTime();

		BinaryClock bClock = new BinaryClock();
		bClock.makeTime();
		bClock.printTime();

		long stop = System.nanoTime();
		System.out.println(stop - start);
	}

}
