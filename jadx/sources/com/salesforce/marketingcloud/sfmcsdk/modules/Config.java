package com.salesforce.marketingcloud.sfmcsdk.modules;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdkComponents;

public interface Config {
    int getMAX_SUPPORTED_VERSION();

    String getModuleApplicationId();

    ModuleIdentifier getModuleIdentifier();

    int getVersion();

    void init(Context context, SFMCSdkComponents sFMCSdkComponents, ModuleReadyListener moduleReadyListener);

    boolean isModuleCompatible();
}
