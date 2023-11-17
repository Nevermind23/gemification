package com.salesforce.marketingcloud.sfmcsdk.components.http;

import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

final class NetworkManager$isBlockedByRetryAfter$1$1 extends C41537m implements C43064a {
    final /* synthetic */ String $requestName;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkManager$isBlockedByRetryAfter$1$1(String str) {
        super(0);
        this.$requestName = str;
    }

    public final String invoke() {
        return "Route " + this.$requestName + " _blocked_ by Retry-After.";
    }
}
