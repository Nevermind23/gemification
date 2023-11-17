package com.salesforce.marketingcloud.sfmcsdk;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class SFMCSdk$Companion$configure$1$3$3$1 extends C41537m implements C43064a {
    final /* synthetic */ boolean $this_run;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SFMCSdk$Companion$configure$1$3$3$1(boolean z) {
        super(0);
        this.$this_run = z;
    }

    public final String invoke() {
        return C41536l.m120497q("Module init latch time exceeded: ", Boolean.valueOf(!this.$this_run));
    }
}
