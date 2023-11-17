package com.salesforce.marketingcloud.analytics.stats;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.analytics.AnalyticsManager;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.storage.C11754d;
import com.salesforce.marketingcloud.util.C11808c;

/* renamed from: com.salesforce.marketingcloud.analytics.stats.a */
public class C11390a extends C11505g {

    /* renamed from: b */
    private final C11754d f33097b;

    /* renamed from: c */
    private final C11808c f33098c;

    /* renamed from: d */
    private final C11391b f33099d;

    public C11390a(C11754d dVar, C11808c cVar, C11391b bVar) {
        super("add_device_stat", new Object[0]);
        this.f33097b = dVar;
        this.f33098c = cVar;
        this.f33099d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29760a() {
        try {
            this.f33097b.mo31514a(this.f33099d, this.f33098c);
        } catch (Exception e) {
            C11461g.m41885b(AnalyticsManager.TAG, e, "Unable to record device stat [%d].", Integer.valueOf(this.f33099d.mo29837d()));
        }
    }
}
