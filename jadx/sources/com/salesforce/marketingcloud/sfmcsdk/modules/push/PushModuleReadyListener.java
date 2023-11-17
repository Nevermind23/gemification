package com.salesforce.marketingcloud.sfmcsdk.modules.push;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;

public interface PushModuleReadyListener extends ModuleReadyListener {
    void ready(ModuleInterface moduleInterface);

    void ready(PushModuleInterface pushModuleInterface);
}
