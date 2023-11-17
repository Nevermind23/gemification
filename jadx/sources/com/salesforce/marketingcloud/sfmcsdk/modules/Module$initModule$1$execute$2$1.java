package com.salesforce.marketingcloud.sfmcsdk.modules;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Module$initModule$1$execute$2$1 extends C41537m implements C43064a {
    final /* synthetic */ Config $config;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Module$initModule$1$execute$2$1(Config config) {
        super(0);
        this.$config = config;
    }

    public final String invoke() {
        return "~~ " + this.$config.getModuleIdentifier().name() + " Module Initialization Completed ~~";
    }
}
