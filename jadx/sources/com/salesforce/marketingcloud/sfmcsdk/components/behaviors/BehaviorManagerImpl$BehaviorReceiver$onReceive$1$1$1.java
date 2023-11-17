package com.salesforce.marketingcloud.sfmcsdk.components.behaviors;

import android.content.Intent;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class BehaviorManagerImpl$BehaviorReceiver$onReceive$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ BehaviorType $behavior;
    final /* synthetic */ Intent $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BehaviorManagerImpl$BehaviorReceiver$onReceive$1$1$1(BehaviorType behaviorType, Intent intent) {
        super(0);
        this.$behavior = behaviorType;
        this.$it = intent;
    }

    public final String invoke() {
        return this.$behavior + " received with " + this.$it.getExtras() + " extras.";
    }
}
