package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$unregisterForAllBehaviors$1$1 extends C41537m implements C43064a {
    final /* synthetic */ BehaviorListener $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$unregisterForAllBehaviors$1$1(BehaviorListener behaviorListener) {
        super(0);
        this.$listener = behaviorListener;
    }

    public final String invoke() {
        return "Unregistering " + this.$listener + " for all behaviors.";
    }
}
