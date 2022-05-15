// this class will call after every important event to creat a log in a text file for every year

public class Log {
	String failedTerm(int ID, int class_code, String reason, String date) {
		//return "$ID: failed class_code by $reason on $date"
	}
	String passedTerm(int ID, int class_code, int nomre, String date){
		//return "$ID: passed class_code on $date"
	}
	String giveLoan(int ID, int quantity, String date){
		//return "$ID: give $quantity loan on $date"
	}
}
