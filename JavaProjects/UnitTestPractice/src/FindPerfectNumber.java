
public class FindPerfectNumber {
	public boolean checkPerfectNumber(int number){
		int total  = 0 ;
		if(number < 0){
			return false;
		}
		for(int counter = 1; counter < number; counter++){
			if(number%counter == 0){
				total = total + counter;
			}
		}
		return total == number;

	}
}
