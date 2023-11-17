package com.salesforce.marketingcloud.sfmcsdk.components.identity;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class Identity$validatedEventAttributeKey$3 extends C41537m implements C43064a {
    final /* synthetic */ String $key;
    final /* synthetic */ String $trimmedKey;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Identity$validatedEventAttributeKey$3(String str, String str2) {
        super(0);
        this.$key = str;
        this.$trimmedKey = str2;
    }

    public final String invoke() {
        return "The key '" + this.$key + "' was trimmed to '" + this.$trimmedKey + '\'';
    }
}
