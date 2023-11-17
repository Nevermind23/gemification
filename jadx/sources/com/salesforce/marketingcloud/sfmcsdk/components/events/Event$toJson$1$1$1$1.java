package com.salesforce.marketingcloud.sfmcsdk.components.events;

import java.util.Map;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Event$toJson$1$1$1$1 extends C41537m implements C43064a {
    final /* synthetic */ Map.Entry<String, Object> $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Event$toJson$1$1$1$1(Map.Entry<String, ? extends Object> entry) {
        super(0);
        this.$it = entry;
    }

    public final String invoke() {
        return "Could not convert attribute (" + this.$it + ") to JSON.";
    }
}
