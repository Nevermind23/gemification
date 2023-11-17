package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Identity$validatedEventAttributeKey$2 extends C41537m implements C43064a {
    final /* synthetic */ String $key;
    final /* synthetic */ String $reservedAttributeKeys;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Identity$validatedEventAttributeKey$2(String str, String str2) {
        super(0);
        this.$key = str;
        this.$reservedAttributeKeys = str2;
    }

    public final String invoke() {
        return "Key '" + this.$key + "' is reserved. The key value pair was dropped. Other reserved keys: " + this.$reservedAttributeKeys;
    }
}
