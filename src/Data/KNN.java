package Data;

import java.awt.Color;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

import UserInterface.UI;

public class KNN {
	//private PriorityQueue<E>
	private ArrayList<Integer> shuffle;
	public ArrayList<Data> out;
	private ArrayList<Integer>  getshuffle()
	{
		out = new ArrayList<Data>();
		shuffle = new ArrayList<Integer>();
		for(int i = 0;i<50 ;i++)
		{
			shuffle.add(i);
		}
		Collections.shuffle(shuffle);
		return shuffle;
	}
	public String knn(ArrayList<Data> plain, Data test, int k) {
		getshuffle();
		SortByDistance sort = new SortByDistance();
		ArrayList<Data> pq = new ArrayList<Data>();
//		List<Integer> randNum = getRandKNum(k, datas.size());
		for (int i = 0; i < k; i++) {
			int index = shuffle.get(i);
			Data now = plain.get(index);
			pq.add(now);
		}
		Collections.sort(pq, comparator);
		for (int i = 0; i < plain.size(); i++) {
			Data ergodic = plain.get(i);
			//System.out.println(ergodic.getDistance());
			Data top = pq.get(k-1);
			if (top.getDistance() >= ergodic.getDistance()&&!pq.contains(ergodic)) {
				pq.remove(top);
				pq.add(ergodic);
			}
			Collections.sort(pq, comparator);
		}
		return getMostClass(pq);
	}
	
	private String getMostClass(ArrayList<Data> pq) {
		int blue=0,red=0;
		for (int i =0;i < pq.size();i++) {
			Data tem = pq.get(i);
			out.add(tem);
			if(tem.getColor().equals(Color.blue))
			{
				blue++;
			}
			else
			{
				red++;
			}
		}
		if(blue>=red)
		{
			return "蓝色"+blue+"个,红色："+red+"个，此点为蓝色";
		}
		else
		{
			return "蓝色"+blue+"个,红色："+red+"个，此点为红色";
		}
		
	}
	private Comparator<Data> comparator = new Comparator<Data>() {

		@Override
		public int compare(Data o1, Data o2) {
			if(o1.getDistance()>=o2.getDistance())
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
	};

}
