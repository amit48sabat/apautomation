package AccountsPayable.CW;

public class test {
	public static void main(String[] args) {
		ThreeWay_Matching_Request_Sync_OutBindingStub stub; 
		try {
			ThreeWay_Matching_Request_Sync_Out po_Details_Request_Sync_Out = new ThreeWay_Matching_Request_Sync_OutServiceLocator()
			.getHTTP_Port();
			stub = (ThreeWay_Matching_Request_Sync_OutBindingStub)po_Details_Request_Sync_Out;
			stub.setUsername("S0017305201");
			stub.setPassword("94@Srey$");
			ThreeWay_Matching_RequestItems[] details_Request = new ThreeWay_Matching_RequestItems[4];
			//ThreeWay_Matching_ResponseITEMS response =po_Details_Request_Sync_Out.threeWay_Matching_Request_Sync_Out(details_Request)
			//System.out.println(response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
