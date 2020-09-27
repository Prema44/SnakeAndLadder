package snakenladder;

public class SnL {
	public static void main(String[] args)
	{
		int position =0;
		int countOfDieRoll=0;
		final int noplay=0;
		final int ladder=1;
		final int snake=2;
		do
		{
			int die = (int) Math.floor(Math.random()*6)+1;
			int option= (int) Math.floor(Math.random()*3);
			switch(option)
			{
			case ladder:
				position=position+die;
				break;
			case snake:
				position=position-die;
				break;
			case noplay:
				position=position;
				break;
				
			}
			if(position < 0)
			{
				position=0;
			}
			if(position > 100)
			{
				position=position-die;
			}
		}while(position!=100)
		
	}

}

