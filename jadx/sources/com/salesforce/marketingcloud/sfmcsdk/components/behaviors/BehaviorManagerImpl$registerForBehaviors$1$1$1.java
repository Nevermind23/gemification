package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$registerForBehaviors$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ BehaviorType $behavior;
    final /* synthetic */ BehaviorListener $listener;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$registerForBehaviors$1$1$1(BehaviorListener behaviorListener, BehaviorType behaviorType) {
        super(0);
        this.$listener = behaviorListener;
        this.$behavior = behaviorType;
    }

    public final String invoke() {
        return "Listener " + this.$listener + " registering for " + this.$behavior;
    }
}
