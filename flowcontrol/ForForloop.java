package com.demo.flowcontrol;

public class ForForloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k =0;
		int j = 1;
		for ( k = 0 ;  k<= 10 ; ++k) 
		{
			for ( j = 1 ;  j<= 10; ++j) {
				for(int i = 1; i<=10;++i )
				{
					for(int g = 1; g<=10;++g )

					{
						System.out.println("loop4" +g );
					}




					System.out.println("loop3" +i );
				}


				System.out.println("loop2" +j );
			}


			System.out.println("loop1" +k );
		}
	}

}
