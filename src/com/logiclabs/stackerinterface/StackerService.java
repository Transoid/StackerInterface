package com.logiclabs.stackerinterface;

import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class StackerService {
	
	private static StackerService service;
    private ServiceLoader<StackerInterface> loader;

    private StackerService() {
        loader = ServiceLoader.load(StackerInterface.class);
    }

    public static synchronized StackerService getInstance() {
        if (service == null) {
            service = new StackerService();
        }
        return service;
    }

    public StackerInterface getStacker(StackerConfiguration stackerConfiguration) {
        try {
            Iterator<StackerInterface> stackerInterfaces = loader.iterator();
            if (stackerInterfaces.hasNext()) {
            	StackerInterface stackerInterface = stackerInterfaces.next();
            	stackerInterface.init(stackerConfiguration);
            	return stackerInterface;
            }
        } catch (ServiceConfigurationError serviceError) {
            serviceError.printStackTrace();
        }
        return null;
    }
}
