package com.incture.accpay.pi.pogrn;

public class PO_Details_Request_Sync_OutProxy implements PO_Details_Request_Sync_Out {
  private String _endpoint = null;
  private PO_Details_Request_Sync_Out pO_Details_Request_Sync_Out = null;
  
  public PO_Details_Request_Sync_OutProxy() {
    _initPO_Details_Request_Sync_OutProxy();
  }
  
  public PO_Details_Request_Sync_OutProxy(String endpoint) {
    _endpoint = endpoint;
    _initPO_Details_Request_Sync_OutProxy();
  }
  
  private void _initPO_Details_Request_Sync_OutProxy() {
    try {
      pO_Details_Request_Sync_Out = (new PO_Details_Request_Sync_OutServiceLocator()).getHTTP_Port();
      if (pO_Details_Request_Sync_Out != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)pO_Details_Request_Sync_Out)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)pO_Details_Request_Sync_Out)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (pO_Details_Request_Sync_Out != null)
      ((javax.xml.rpc.Stub)pO_Details_Request_Sync_Out)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public PO_Details_Request_Sync_Out getPO_Details_Request_Sync_Out() {
    if (pO_Details_Request_Sync_Out == null)
      _initPO_Details_Request_Sync_OutProxy();
    return pO_Details_Request_Sync_Out;
  }
  
  public PO_Details_Response PO_Details_Request_Sync_Out(PO_Details_Request PO_Details_Request) throws java.rmi.RemoteException{
    if (pO_Details_Request_Sync_Out == null)
      _initPO_Details_Request_Sync_OutProxy();
    return pO_Details_Request_Sync_Out.PO_Details_Request_Sync_Out(PO_Details_Request);
  }
  
  
}