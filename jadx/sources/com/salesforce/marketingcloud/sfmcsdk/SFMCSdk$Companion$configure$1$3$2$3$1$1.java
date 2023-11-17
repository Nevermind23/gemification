package com.salesforce.marketingcloud.sfmcsdk;

import com.salesforce.marketingcloud.sfmcsdk.modules.Config;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class SFMCSdk$Companion$configure$1$3$2$3$1$1 extends C41537m implements C43064a {
    final /* synthetic */ Config $config;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$Companion$configure$1$3$2$3$1$1(Config config) {
        super(0);
        this.$config = config;
    }

    public final String invoke() {
        return "Module (" + this.$config.getModuleIdentifier() + ") has completed initialization.";
    }
}
