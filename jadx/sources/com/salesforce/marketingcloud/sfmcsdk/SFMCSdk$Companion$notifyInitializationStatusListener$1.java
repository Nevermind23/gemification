package com.salesforce.marketingcloud.sfmcsdk;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;
import ue1.C43075l;

final class SFMCSdk$Companion$notifyInitializationStatusListener$1 extends C41537m implements C43064a {
    final /* synthetic */ C43075l $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$Companion$notifyInitializationStatusListener$1(C43075l lVar) {
        super(0);
        this.$listener = lVar;
    }

    public final String invoke() {
        return "Failed to delivery initialization state to listener " + this.$listener + '.';
    }
}
