package Data;

import java.util.Comparator;

public class SortByDistance implements Comparator<Data> {

	@Override
	public int compare(Data o1, Data o2) {
		// TODO Auto-generated method stub
		if(o1.getDistance()>o2.getDistance())
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

}
