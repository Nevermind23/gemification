package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$registerForBehaviors$2$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ Bundle $behavior;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$registerForBehaviors$2$1$1$1(Bundle bundle) {
        super(0);
        this.$behavior = bundle;
    }

    public final String invoke() {
        return C41536l.m120497q("Delivering sticky behavior ", this.$behavior);
    }
}
