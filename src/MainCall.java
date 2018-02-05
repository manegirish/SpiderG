import java.util.ArrayList;

public class MainCall {

	public static void main(String[] args) {
		RecurssiveCall.makeCall(createCalls());
	}

	// Create dummy APIs list
	private static ArrayList<ApiCalls> createCalls() {
		ArrayList<ApiCalls> apiArray = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ApiCalls apiCalls;
			if (i%2==0) {
				apiCalls = new ApiCalls("Main_ApiCall_00"+(i+1), "/invoice", null);
			}else {
				ArrayList<ApiCalls> subApiArray = new ArrayList<>();
				ApiCalls subApi = new ApiCalls("Sub_Api_Call_"+(i+10), "/product", null);
				subApiArray.add(subApi);
				apiCalls = new ApiCalls("Main_ApiCall_00"+(i+1), "/invoice", subApiArray);
			}
			apiArray.add(apiCalls);
		}
		return apiArray;
	}
}
