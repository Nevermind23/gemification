package com.salesforce.marketingcloud.sfmcsdk.modules;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class ModuleReadyHandler$execute$1 extends C41537m implements C43064a {
    final /* synthetic */ ModuleReadyListener $listener;
    final /* synthetic */ ModuleInterface $module;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ModuleReadyHandler$execute$1(ModuleInterface moduleInterface, ModuleReadyListener moduleReadyListener) {
        super(0);
        this.$module = moduleInterface;
        this.$listener = moduleReadyListener;
    }

    public final String invoke() {
        return "Error delivering module " + this.$module + " to " + this.$listener;
    }
}
