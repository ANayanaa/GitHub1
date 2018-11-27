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

			ArrayList <Integer> list3 = new ArrayList<>();
			for(int i = 50; i<=100; i++)
			list3.add(i);
			ArrayList <Integer> list4 = new ArrayList<>();
				printList(list3);
		}

		public static  ArrayList<Integer> combineList (ArrayList<Integer>list1, ArrayList<Integer>list2){
			for(int i = 0; i<list1.size(); i++)
				list2.add(list1.get(i));
				return list2;
			}
			public static void printList(ArrayList<Integer>list3){
				for (int i = 0; i<list3.size(); i++)
					System.out.print(list3.get(i)+", ");


			}
		}


