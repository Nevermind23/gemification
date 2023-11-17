package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class SFMCSdk$Companion$configure$1$3$2$1 extends C41537m implements C43064a {
    final /* synthetic */ Config $config;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$Companion$configure$1$3$2$1(Config config) {
        super(0);
        this.$config = config;
    }

    public final String invoke() {
        return "Module (" + this.$config.getModuleIdentifier() + ") init started. Current Version: " + this.$config.getVersion() + " && Max Supported Version: " + this.$config.getMAX_SUPPORTED_VERSION();
    }
}
