package com.logiclabs.stackerinterface;

import java.util.GregorianCalendar;

public interface StackerInterface extends AutoCloseable {

	void init(StackerConfiguration stackerConfiguration);
	CounterInterface getCounter(String key, int flushCount);
	void logException(Throwable throwable);
	void pushTimeValue(String key, GregorianCalendar dateTime, int value);
}
