import java.util.ArrayList;

// Make recursive method call

public class RecurssiveCall {

	public static void makeCall(ArrayList<ApiCalls> apiArray) {
		for (ApiCalls apiCalls : apiArray) {
			if (apiCalls.getApiCall() != null) {
				System.out.println("<<<<< Making reference call >>>>>");
				makeCall(apiCalls.getApiCall());
				System.out.println("\n");
			}
			System.out.println(apiCalls.getName() + " ---> " + apiCalls.getApi());
		}
	}
}
