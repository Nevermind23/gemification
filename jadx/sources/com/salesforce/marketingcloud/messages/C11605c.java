package com.salesforce.marketingcloud.messages;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.location.LatLon;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.messages.c */
public interface C11605c {

    /* renamed from: com.salesforce.marketingcloud.messages.c$a */
    public interface C11606a {
        /* renamed from: a */
        void mo30431a(Region region);

        /* renamed from: a */
        void mo30432a(Region region, Message message);

        /* renamed from: b */
        void mo30433b(Region region);
    }

    /* renamed from: com.salesforce.marketingcloud.messages.c$b */
    public interface C11607b {
        /* renamed from: a */
        void mo30434a(MessageResponse messageResponse);
    }

    /* renamed from: a */
    void mo30427a();

    /* renamed from: a */
    void mo30428a(LatLon latLon, String str, MarketingCloudConfig marketingCloudConfig, C11607b bVar);

    /* renamed from: b */
    void mo30429b();

    /* renamed from: c */
    void mo30430c();
}
