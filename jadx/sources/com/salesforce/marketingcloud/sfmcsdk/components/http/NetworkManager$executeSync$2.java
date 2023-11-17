package com.salesforce.marketingcloud.sfmcsdk.components.http;

import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41550z;
import ue1.C43064a;

final class NetworkManager$executeSync$2 extends C41537m implements C43064a {
    final /* synthetic */ C41550z $request;
    final /* synthetic */ C41550z $response;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkManager$executeSync$2(C41550z zVar, C41550z zVar2) {
        super(0);
        this.$request = zVar;
        this.$response = zVar2;
    }

    public final String invoke() {
        return ((Request) this.$request.f97717d).getName() + " request to " + ((Request) this.$request.f97717d).getUrl() + " took " + ((Response) this.$response.f97717d).timeToExecute() + "ms and resulted in a " + ((Response) this.$response.f97717d).getCode() + " - " + ((Response) this.$response.f97717d).getMessage() + " response.";
    }
}
