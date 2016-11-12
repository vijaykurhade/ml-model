package test;

public class TowerOfHanoi {

	void move(int noOfDiscs, char from, char to, char inter)
	{
		//System.out.println("Moving Disc " + noOfDiscs + " from " + from + " to " + to + " inter " + inter);

		if(noOfDiscs==1)
		{
			System.out.println("Moving Disc " + noOfDiscs + " from " + from + " to " + to);
		}
		else
		{
			move(noOfDiscs-1, from, inter, to);
			System.out.println("Moving Disc " + noOfDiscs + " from " + from + " to " + to);
			move(noOfDiscs-1,inter,to,from);
		}
		
	}
	
	public static void main(String[] args)
	{
		
		TowerOfHanoi tOH = new TowerOfHanoi();
		System.out.println("START");
		tOH.move(10, 'A', 'C', 'B');
		System.out.println("END");
	}
	
}
