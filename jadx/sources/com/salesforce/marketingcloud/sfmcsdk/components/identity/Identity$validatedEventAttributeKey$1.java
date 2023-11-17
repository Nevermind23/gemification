package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Identity$validatedEventAttributeKey$1 extends C41537m implements C43064a {
    final /* synthetic */ String $key;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Identity$validatedEventAttributeKey$1(String str) {
        super(0);
        this.$key = str;
    }

    public final String invoke() {
        return "Key '" + this.$key + "' is invalid. Key cannot be empty. The key value pair was dropped.";
    }
}
