import java.util.ArrayList;
public class arrayList{
	public static void main (String[]args){

		ArrayList <Integer> list1 = new ArrayList<>();
		for(int i = 1; i<=10; i++)
			list1.add(i);

		ArrayList <Integer> list2 = new ArrayList<>();
		for(int i = 10; i>=0; i--)
			list2.add(i);

		System.out.println(combineList(list1,list2));
		}

		public static  ArrayList<Integer> combineList (ArrayList<Integer>list1, ArrayList<Integer>list2){
			for(int i = 0; i<list1.size(); i++)
				list2.add(list1.get(i));
				return list2;
			}
		}


