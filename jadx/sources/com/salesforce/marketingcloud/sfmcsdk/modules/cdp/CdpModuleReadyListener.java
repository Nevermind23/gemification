package com.salesforce.marketingcloud.sfmcsdk.modules.cdp;

import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener;

public interface CdpModuleReadyListener extends ModuleReadyListener {
    void ready(ModuleInterface moduleInterface);

    void ready(CdpModuleInterface cdpModuleInterface);
}
