package com.salesforce.marketingcloud.sfmcsdk.modules;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Module$initModule$1$execute$2$2$1$1 extends C41537m implements C43064a {
    final /* synthetic */ ModuleReadyHandler $handler;
    final /* synthetic */ ModuleInterface $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Module$initModule$1$execute$2$2$1$1(ModuleInterface moduleInterface, ModuleReadyHandler moduleReadyHandler) {
        super(0);
        this.$it = moduleInterface;
        this.$handler = moduleReadyHandler;
    }

    public final String invoke() {
        return "Failure during module " + this.$it + " delivery for " + this.$handler + '.';
    }
}
