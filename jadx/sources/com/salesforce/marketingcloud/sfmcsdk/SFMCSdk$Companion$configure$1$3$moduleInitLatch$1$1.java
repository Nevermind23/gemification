package com.salesforce.marketingcloud.sfmcsdk;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class SFMCSdk$Companion$configure$1$3$moduleInitLatch$1$1 extends C41537m implements C43064a {
    final /* synthetic */ SFMCSdkModuleConfig $config;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$Companion$configure$1$3$moduleInitLatch$1$1(SFMCSdkModuleConfig sFMCSdkModuleConfig) {
        super(0);
        this.$config = sFMCSdkModuleConfig;
    }

    public final String invoke() {
        return "Initializing " + this.$config.getConfigs$sfmcsdk_release().size() + " modules.";
    }
}
