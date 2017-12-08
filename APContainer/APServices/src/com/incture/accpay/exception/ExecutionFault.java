package com.incture.accpay.exception;

import com.incture.accpay.dto.MessageUIDto;

/**
 * <code>ExecutionException</code> is wrapper over different kinds of
 * exceptions, generally indicate a fatal error eg: resource missing, data
 * source connection failed
 * 
 * @version 2.0, 21-June-2012
 * @since CR8313
 * @author VINU
 */
public class ExecutionFault extends Exception {
	private static final long serialVersionUID = -5972920879141164722L;
	/**
	 * Java type that goes as soapenv:Fault detail element.
	 */
	private MessageUIDto faultInfo;

	public ExecutionFault() {
		// TODO Auto-generated constructor stub
	}

	public ExecutionFault(String faultMessage) {
		super(faultMessage);
//		super("Execution on Server failed, please retry later");
		faultInfo = new MessageUIDto();
		faultInfo.setMessage(faultMessage);
	}

	public ExecutionFault(String message, MessageUIDto faultInfo) {
		super(message);
		this.faultInfo = faultInfo;
	}

	public ExecutionFault(String message, MessageUIDto faultInfo,
			Throwable cause) {
		super(message, cause);
		this.faultInfo = faultInfo;
	}

	public MessageUIDto getFaultInfo() {
		return faultInfo;
	}
}