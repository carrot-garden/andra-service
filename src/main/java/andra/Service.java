package andra;

import javax.management.MXBean; 

@MXBean 
public interface Service {

	void initiate();

	void terminate();

}
