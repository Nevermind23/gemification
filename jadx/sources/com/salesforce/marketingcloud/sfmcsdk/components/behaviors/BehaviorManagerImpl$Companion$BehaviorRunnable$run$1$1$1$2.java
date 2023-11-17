package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$Companion$BehaviorRunnable$run$1$1$1$2 extends C41537m implements C43064a {

    /* renamed from: $e */
    final /* synthetic */ Exception f34055$e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$Companion$BehaviorRunnable$run$1$1$1$2(Exception exc) {
        super(0);
        this.f34055$e = exc;
    }

    public final String invoke() {
        return "Exception " + this.f34055$e.getLocalizedMessage() + " occurred.";
    }
}
