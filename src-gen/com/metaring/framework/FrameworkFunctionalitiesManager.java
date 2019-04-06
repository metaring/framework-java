package com.metaring.framework;

import com.metaring.framework.functionality.FunctionalityInfo;
import com.metaring.framework.functionality.FunctionalitiesManager;
import com.metaring.framework.functionality.GeneratedFunctionalitiesManager;
import com.metaring.framework.functionality.Functionality;
import java.util.concurrent.CompletableFuture;

public class FrameworkFunctionalitiesManager extends FunctionalitiesManager implements GeneratedFunctionalitiesManager {

    public static final FunctionalityInfo REINIT = FunctionalityInfo.create("com.metaring.framework.reinit", true, false, false, null, null);

    public static final CompletableFuture<Void> reinit() {
        return call(REINIT, ReinitFunctionality.class, getCallingFunctionality(), null, null);
    }

    public static final CompletableFuture<Void> reinit(Functionality functionality) {
        return call(REINIT, ReinitFunctionality.class, functionality, null, null);
    }

}
