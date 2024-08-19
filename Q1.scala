object Q1 {
	
	def main(args : Array[String] ): Unit = {
		
		val interest:Double => Double = deposit => {
		 val rates = List(
			
			(d:Double) => if (d <= 20000)0.02*d else 0.0,
			(d:Double) => if (d > 20000 && d <= 200000) 0.04 *d else 0.0,
			(d:Double) => if (d > 200000 && d <= 2000000)0.035*d else 0.0,
			(d: Double) => if (d > 2000000) 0.065 * d else 0.0
      )
	  rates.map(_(deposit)).sum 
	  }
	  
		println(f"Interest on Rs. 15000: ${interest(15000)}%.2f")
		println(f"Interest on Rs. 150000: ${interest(150000)}%.2f")
		println(f"Interest on Rs. 1500000: ${interest(1500000)}%.2f")
		println(f"Interest on Rs. 2500000: ${interest(2500000)}%.2f")
		}
	}
			