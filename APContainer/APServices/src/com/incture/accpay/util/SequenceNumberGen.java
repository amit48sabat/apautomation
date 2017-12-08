/*package com.incture.accpay.util;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;

import com.incture.accpay.entities.SmSeqNumber;
public class SequenceNumberGen {
	//private static final LogUtil logger = new LogUtil(SequenceNumberGen.class);
	private static SequenceNumberGen sequenceNumberGenerator;
	
	SmSeqNumber sequenceNumbersDo =null;
	private static int oldRunningNumber=0;
	private static String oldRefCode="";
	private SequenceNumberGen() {
	}

	public static synchronized SequenceNumberGen getInstance() {
		return sequenceNumberGenerator == null ? sequenceNumberGenerator = new SequenceNumberGen()
				: sequenceNumberGenerator;
	}

	public synchronized String getNextSeqNumber(String referenceCode,
			Integer noOfDigits, EntityManager entityManager) {
		
		
		sequenceNumbersDo = entityManager.find(SmSeqNumber.class, referenceCode);
		
		int runningNumber;
		if(sequenceNumbersDo!=null)
		{
			entityManager.setFlushMode(FlushModeType.COMMIT);
			entityManager.refresh(sequenceNumbersDo);
			runningNumber = updateRecord(sequenceNumbersDo, entityManager);
			if(oldRunningNumber==runningNumber && oldRefCode.equals(referenceCode)){//to avoid duplicates
				sequenceNumbersDo = entityManager.find(SmSeqNumber.class, referenceCode);
				runningNumber = updateRecord(sequenceNumbersDo, entityManager);
			}
		}
		else
		{
			runningNumber = pushRecord(referenceCode, entityManager);
		}
		oldRunningNumber=runningNumber;
		oldRefCode = referenceCode;
		return buildSeqNumber(referenceCode, noOfDigits, runningNumber);
	}

	private String buildSeqNumber(String referenceCode, Integer noOfDigits,
			int runningNumber) {
		StringBuffer sb = new StringBuffer(noOfDigits);
		sb.append(runningNumber);
		int noOfPads = noOfDigits - sb.length();
		// TODO: decide what to do if noOfPads is negative
		while (noOfPads-- > 0) {
			sb.insert(0, '0');
		}
		sb.insert(0, referenceCode);
		return sb.toString();
	}

	private int pushRecord(String referenceCode, EntityManager entityManager) {
		SmSeqNumber sequenceNumbersDo = new SmSeqNumber(
				referenceCode, 1);
		// NOTE: Hard coding to zero
		entityManager.persist(sequenceNumbersDo);
		return sequenceNumbersDo.get_runningNumber_();
	}

	private int updateRecord(SmSeqNumber sequenceNumbersDo, EntityManager entityManager) {
		int runningnumber=0;
		sequenceNumbersDo.set_runningNumber_(sequenceNumbersDo.get_runningNumber_() + 1);

        entityManager.persist(sequenceNumbersDo);
       // logger.logDebug("Current Sequence Number " + sequenceNumbersDo.get_runningNumber_());
		entityManager.flush();
		entityManager.refresh(sequenceNumbersDo);
		SmSeqNumber retDto1=entityManager.find(SmSeqNumber.class, sequenceNumbersDo.get_referenceCode_());
		if(retDto1!=null){
			runningnumber=retDto1.get_runningNumber_();
		}
		return runningnumber;
	}
}*/