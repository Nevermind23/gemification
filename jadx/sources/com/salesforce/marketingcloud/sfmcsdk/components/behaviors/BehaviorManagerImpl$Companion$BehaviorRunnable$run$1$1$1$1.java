package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManagerImpl;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$Companion$BehaviorRunnable$run$1$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ BehaviorListener $it;
    final /* synthetic */ BehaviorManagerImpl.Companion.BehaviorRunnable this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$Companion$BehaviorRunnable$run$1$1$1$1(BehaviorManagerImpl.Companion.BehaviorRunnable behaviorRunnable, BehaviorListener behaviorListener) {
        super(0);
        this.this$0 = behaviorRunnable;
        this.$it = behaviorListener;
    }

    public final String invoke() {
        return "Delivering behavior " + this.this$0.behaviorType + " to " + this.$it + '.';
    }
}
