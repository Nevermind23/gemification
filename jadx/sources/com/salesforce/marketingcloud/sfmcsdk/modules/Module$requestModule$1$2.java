package com.salesforce.marketingcloud.sfmcsdk.modules;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Module$requestModule$1$2 extends C41537m implements C43064a {
    final /* synthetic */ ModuleReadyHandler $handler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Module$requestModule$1$2(ModuleReadyHandler moduleReadyHandler) {
        super(0);
        this.$handler = moduleReadyHandler;
    }

    public final String invoke() {
        return "Failure during requestPush() delivery for " + this.$handler + '.';
    }
}
