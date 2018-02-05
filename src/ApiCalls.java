import java.util.ArrayList;


//Model class to keep record of all APIs list and their reference APIs list

public class ApiCalls {

	private String api, name;
	private ArrayList<ApiCalls> apiArray;
	
	public ApiCalls(String name,String api,ArrayList<ApiCalls> apiArray) {
		this.api=api;
		this.name=name;
		this.apiArray=apiArray;
	}
	
	public String getApi() {
		return api;
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<ApiCalls> getApiCall() {
		return apiArray;
	}
}
