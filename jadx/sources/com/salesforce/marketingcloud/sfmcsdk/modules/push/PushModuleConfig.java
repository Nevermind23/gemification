package com.salesforce.marketingcloud.sfmcsdk.modules.push;

import com.salesforce.marketingcloud.sfmcsdk.modules.C11744a;
import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleIdentifier;
import kotlin.jvm.internal.C41536l;

public abstract class PushModuleConfig implements Config {
    private final String moduleApplicationId;
    private final ModuleIdentifier moduleIdentifier = ModuleIdentifier.PUSH;
    private final int version = 1;

    public PushModuleConfig(String str) {
        C41536l.m120489i(str, "moduleApplicationId");
        this.moduleApplicationId = str;
    }

    public /* synthetic */ int getMAX_SUPPORTED_VERSION() {
        return C11744a.m42828a(this);
    }

    public String getModuleApplicationId() {
        return this.moduleApplicationId;
    }

    public ModuleIdentifier getModuleIdentifier() {
        return this.moduleIdentifier;
    }

    public int getVersion() {
        return this.version;
    }

    public /* synthetic */ boolean isModuleCompatible() {
        return C11744a.m42829b(this);
    }
}
