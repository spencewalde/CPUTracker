
import java.lang.management.ManagementFactory;
import java.util.Random;

import java.lang.management.ManagementFactory;
import javax.management.Attribute;
import javax.management.AttributeList;
import javax.management.MBeanServer;
import javax.management.ObjectName;


//import java.util.Random;

public class Main {
	public static double getProcessCpuLoad() throws Exception {

		MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
		ObjectName name = ObjectName.getInstance("java.lang:type=OperatingSystem");
		AttributeList list = mbs.getAttributes(name, new String[] { "ProcessCpuLoad" });

		if (list.isEmpty())
			return Double.NaN;

		Attribute att = (Attribute) list.get(0);
		Double value = (Double) att.getValue();

		// usually takes a couple of seconds before we get real values
		if (value == -1.0)
			return Double.NaN;
		// returns a percentage value with 1 decimal point precision
		return ((int) (value * 1000) / 10.0);
	}

	public static void main(String[] args) throws Exception {

		int TransactionArray[] = new int[1000000];
		Random rand = new Random();
		int random = rand.nextInt(1000000);
		boolean flag = true;
		int count = 0;
		double avecpuusage = 0;
		double getload = 0;
		long finish;
		long start;
		long timeElapsed;

		// set the array full of numbers
		for (int i = 0; i < TransactionArray.length; i++) {
			TransactionArray[i] = i;
		}

//MARK ->	
		// loop for average 5 times
		///////////// sleep 1 second /////////////
		for (int j = 0; j < 5; j++) {
			// start timer
			
			System.out.print(1000 + ",");
			start = System.currentTimeMillis();
			System.out.print(start + ",");

			// Test period
			for (int i = 0; i < 100000; i++) {

				if (i % 1000 == 0) {
					getload = getProcessCpuLoad();
					avecpuusage += getload;
					Thread.sleep(1000);
				}

				count = 0;
				flag = true;
				// transaction search
				while (flag) {
					if (TransactionArray[count] == random) {
						flag = false;
						random = rand.nextInt(1000000);
					}
					count++;
				}
			}

			finish = System.currentTimeMillis();
			timeElapsed = finish - start;
			System.out.print(finish + ",");
			System.out.print(timeElapsed + ",");
			System.out.print(100000.0 / timeElapsed + ",");

			avecpuusage = avecpuusage / 100.0;
			System.out.print(avecpuusage + "\n");

			// reset values
			flag = true;
			count = 0;
			avecpuusage = 0;
			random = rand.nextInt(1000000);
		}
//MARK ->
		/////////// sleep .5 seconds ////////////
		for (int j = 0; j < 5; j++) {
			// start timer
			
			System.out.print(1000 + ",");
			start = System.currentTimeMillis();
			System.out.print(start + ",");

			// Test period
			for (int i = 0; i < 100000; i++) {

				if (i % 1000 == 0) {
					getload = getProcessCpuLoad();
					avecpuusage += getload;
					Thread.sleep(500);
				}

				count = 0;
				flag = true;
				// transaction search
				while (flag) {
					if (TransactionArray[count] == random) {
						flag = false;
						random = rand.nextInt(1000000);
					}
					count++;
				}
			}

			finish = System.currentTimeMillis();
			timeElapsed = finish - start;
			System.out.print(finish + ",");
			System.out.print(timeElapsed + ",");
			System.out.print(100000.0 / timeElapsed + ",");

			avecpuusage = avecpuusage / 100.0;
			System.out.print(avecpuusage + "\n");

			// reset values
			flag = true;
			count = 0;
			avecpuusage = 0;
			random = rand.nextInt(1000000);
		}
//MARK ->
		///////////// sleep time .25 seconds
		for (int j = 0; j < 5; j++) {
			// start timer
			
			System.out.print(1000 + ",");
			start = System.currentTimeMillis();
			System.out.print(start + ",");

			// Test period
			for (int i = 0; i < 100000; i++) {

				if (i % 1000 == 0) {
					getload = getProcessCpuLoad();
					avecpuusage += getload;
					Thread.sleep(250);
				}

				count = 0;
				flag = true;
				// transaction search
				while (flag) {
					if (TransactionArray[count] == random) {
						flag = false;
						random = rand.nextInt(1000000);
					}
					count++;
				}
			}

			finish = System.currentTimeMillis();
			timeElapsed = finish - start;
			System.out.print(finish + ",");
			System.out.print(timeElapsed + ",");
			System.out.print(100000.0 / timeElapsed + ",");

			avecpuusage = avecpuusage / 100.0;
			System.out.print(avecpuusage + "\n");

			// reset values
			flag = true;
			count = 0;
			avecpuusage = 0;
			random = rand.nextInt(1000000);
		}
//MARK ->
		//////////// sleep time for .125 seconds ////////////
		for (int j = 0; j < 5; j++) {
			// start timer
			
			System.out.print(1000 + ",");
			start = System.currentTimeMillis();
			System.out.print(start + ",");

			// Test period
			for (int i = 0; i < 100000; i++) {

				if (i % 1000 == 0) {
					getload = getProcessCpuLoad();
					avecpuusage += getload;
					Thread.sleep(125);
				}

				count = 0;
				flag = true;
				// transaction search
				while (flag) {
					if (TransactionArray[count] == random) {
						flag = false;
						random = rand.nextInt(1000000);
					}
					count++;
				}
			}

			finish = System.currentTimeMillis();
			timeElapsed = finish - start;
			System.out.print(finish + ",");
			System.out.print(timeElapsed + ",");
			System.out.print(100000.0 / timeElapsed + ",");

			avecpuusage = avecpuusage / 100.0;
			System.out.print(avecpuusage + "\n");

			// reset values
			flag = true;
			count = 0;
			avecpuusage = 0;
			random = rand.nextInt(1000000);
		}
//MARK->
		//////////// no sleep time //////////
		for (int j = 0; j < 5; j++) {
			// start timer
			
			System.out.print(1000 + ",");
			start = System.currentTimeMillis();
			System.out.print(start + ",");

			// Test period
			for (int i = 0; i < 100000; i++) {

				if (i % 1000 == 0) {
					getload = getProcessCpuLoad();
					avecpuusage += getload;
					
				}

				count = 0;
				flag = true;
				// transaction search
				while (flag) {
					if (TransactionArray[count] == random) {
						flag = false;
						random = rand.nextInt(1000000);
					}
					count++;
				}
			}

			finish = System.currentTimeMillis();
			timeElapsed = finish - start;
			System.out.print(finish + ",");
			System.out.print(timeElapsed + ",");
			System.out.print(100000.0 / timeElapsed + ",");

			avecpuusage = avecpuusage / 100.0;
			System.out.print(avecpuusage + "\n");

			// reset values
			flag = true;
			count = 0;
			avecpuusage = 0;
			random = rand.nextInt(1000000);
		}
	}

}
