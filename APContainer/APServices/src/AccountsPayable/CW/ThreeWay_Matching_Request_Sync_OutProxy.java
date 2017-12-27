package AccountsPayable.CW;

public class ThreeWay_Matching_Request_Sync_OutProxy implements AccountsPayable.CW.ThreeWay_Matching_Request_Sync_Out {
  private String _endpoint = null;
  private AccountsPayable.CW.ThreeWay_Matching_Request_Sync_Out threeWay_Matching_Request_Sync_Out = null;
  
  public ThreeWay_Matching_Request_Sync_OutProxy() {
    _initThreeWay_Matching_Request_Sync_OutProxy();
  }
  
  public ThreeWay_Matching_Request_Sync_OutProxy(String endpoint) {
    _endpoint = endpoint;
    _initThreeWay_Matching_Request_Sync_OutProxy();
  }
  
  private void _initThreeWay_Matching_Request_Sync_OutProxy() {
    try {
      threeWay_Matching_Request_Sync_Out = (new AccountsPayable.CW.ThreeWay_Matching_Request_Sync_OutServiceLocator()).getHTTP_Port();
      if (threeWay_Matching_Request_Sync_Out != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)threeWay_Matching_Request_Sync_Out)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)threeWay_Matching_Request_Sync_Out)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (threeWay_Matching_Request_Sync_Out != null)
      ((javax.xml.rpc.Stub)threeWay_Matching_Request_Sync_Out)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AccountsPayable.CW.ThreeWay_Matching_Request_Sync_Out getThreeWay_Matching_Request_Sync_Out() {
    if (threeWay_Matching_Request_Sync_Out == null)
      _initThreeWay_Matching_Request_Sync_OutProxy();
    return threeWay_Matching_Request_Sync_Out;
  }
  
  public AccountsPayable.CW.ThreeWay_Matching_ResponseITEMS[] threeWay_Matching_Request_Sync_Out(AccountsPayable.CW.ThreeWay_Matching_RequestItems[] threeWay_Matching_Request) throws java.rmi.RemoteException{
    if (threeWay_Matching_Request_Sync_Out == null)
      _initThreeWay_Matching_Request_Sync_OutProxy();
    return threeWay_Matching_Request_Sync_Out.threeWay_Matching_Request_Sync_Out(threeWay_Matching_Request);
  }
  
  
}