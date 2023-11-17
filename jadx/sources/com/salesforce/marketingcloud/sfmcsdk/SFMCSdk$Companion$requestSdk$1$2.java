package com.salesforce.marketingcloud.sfmcsdk;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class SFMCSdk$Companion$requestSdk$1$2 extends C41537m implements C43064a {
    final /* synthetic */ WhenReadyHandler $handler;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$Companion$requestSdk$1$2(WhenReadyHandler whenReadyHandler) {
        super(0);
        this.$handler = whenReadyHandler;
    }

    public final String invoke() {
        return "Failure during requestSdk() delivery for " + this.$handler + '.';
    }
}
