package AccountsPayable.CW;

public class Po_Posting_Request_Synch_OutProxy implements AccountsPayable.CW.Po_Posting_Request_Synch_Out {
  private String _endpoint = null;
  private AccountsPayable.CW.Po_Posting_Request_Synch_Out po_Posting_Request_Synch_Out = null;
  
  public Po_Posting_Request_Synch_OutProxy() {
    _initPo_Posting_Request_Synch_OutProxy();
  }
  
  public Po_Posting_Request_Synch_OutProxy(String endpoint) {
    _endpoint = endpoint;
    _initPo_Posting_Request_Synch_OutProxy();
  }
  
  private void _initPo_Posting_Request_Synch_OutProxy() {
    try {
      po_Posting_Request_Synch_Out = (new AccountsPayable.CW.Po_Posting_Request_Synch_OutServiceLocator()).getHTTP_Port();
      if (po_Posting_Request_Synch_Out != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)po_Posting_Request_Synch_Out)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)po_Posting_Request_Synch_Out)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (po_Posting_Request_Synch_Out != null)
      ((javax.xml.rpc.Stub)po_Posting_Request_Synch_Out)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public AccountsPayable.CW.Po_Posting_Request_Synch_Out getPo_Posting_Request_Synch_Out() {
    if (po_Posting_Request_Synch_Out == null)
      _initPo_Posting_Request_Synch_OutProxy();
    return po_Posting_Request_Synch_Out;
  }
  
  public AccountsPayable.CW.Po_Posting_Response po_Posting_Request_Synch_Out(AccountsPayable.CW.Po_Posting_Request po_Posting_Request) throws java.rmi.RemoteException{
    if (po_Posting_Request_Synch_Out == null)
      _initPo_Posting_Request_Synch_OutProxy();
    return po_Posting_Request_Synch_Out.po_Posting_Request_Synch_Out(po_Posting_Request);
  }
  
  
}