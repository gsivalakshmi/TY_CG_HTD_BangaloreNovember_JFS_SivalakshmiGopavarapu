

	class car1 extends Vehicla{
		int cost=30000;
		
		void car1Details() {
			int cost=45000;
			System.out.println("local cost of car is:"+ cost);
			System.out.println("global cost of car is:" + cost);
			System.out.println("parent cost of car is:"+ cost);
		}
		
	}

