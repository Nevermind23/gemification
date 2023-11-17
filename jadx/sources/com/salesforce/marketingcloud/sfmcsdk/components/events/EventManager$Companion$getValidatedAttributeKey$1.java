package com.salesforce.marketingcloud.sfmcsdk.components.events;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class EventManager$Companion$getValidatedAttributeKey$1 extends C41537m implements C43064a {
    final /* synthetic */ String $input;
    final /* synthetic */ String $prefix;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EventManager$Companion$getValidatedAttributeKey$1(String str, String str2) {
        super(0);
        this.$prefix = str;
        this.$input = str2;
    }

    public final String invoke() {
        return this.$prefix + " '" + this.$input + "' contains a \".\" and will be dropped.";
    }
}
