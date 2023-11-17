package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.os.Bundle;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$onBehavior$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ BehaviorType $behaviorType;
    final /* synthetic */ Bundle $extras;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$onBehavior$1$1$1(BehaviorType behaviorType, Bundle bundle) {
        super(0);
        this.$behaviorType = behaviorType;
        this.$extras = bundle;
    }

    public final String invoke() {
        return "BehaviorRunnable failed for " + this.$behaviorType + " with " + this.$extras;
    }
}
