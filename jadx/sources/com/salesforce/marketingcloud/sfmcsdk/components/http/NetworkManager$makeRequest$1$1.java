package com.salesforce.marketingcloud.sfmcsdk.components.http;

import java.net.HttpURLConnection;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41550z;
import ue1.C43064a;

final class NetworkManager$makeRequest$1$1 extends C41537m implements C43064a {
    final /* synthetic */ C41550z $connection;
    final /* synthetic */ Request $request;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkManager$makeRequest$1$1(Request request, C41550z zVar) {
        super(0);
        this.$request = request;
        this.$connection = zVar;
    }

    public final String invoke() {
        return this.$request.getName() + ' ' + ((HttpURLConnection) this.$connection.f97717d).getRequestMethod() + " initiated\nwith request properties " + ((HttpURLConnection) this.$connection.f97717d).getRequestProperties() + "\nand body " + this.$request.getRequestBody();
    }
}
