package andra;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

public class Main {

	public static void main(final String[] args) throws Exception {

		final MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();

		final ObjectName name = ObjectName.getInstance(Service.class.getName(),
				"key", "value");

		final ServiceImpl main = new ServiceImpl();

		mbs.registerMBean(main, name);

		System.out.println("Waiting forever...");

		Thread.sleep(Long.MAX_VALUE);

	}

}
