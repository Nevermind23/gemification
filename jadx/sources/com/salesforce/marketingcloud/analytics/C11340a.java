package com.salesforce.marketingcloud.analytics;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.storage.C11749a;
import com.salesforce.marketingcloud.util.C11808c;

/* renamed from: com.salesforce.marketingcloud.analytics.a */
public class C11340a extends C11505g {

    /* renamed from: b */
    private final C11749a f32959b;

    /* renamed from: c */
    private final C11808c f32960c;

    /* renamed from: d */
    private final C11341b f32961d;

    public C11340a(C11749a aVar, C11808c cVar, C11341b bVar) {
        super("add_analytic", new Object[0]);
        this.f32959b = aVar;
        this.f32960c = cVar;
        this.f32961d = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29760a() {
        try {
            this.f32959b.mo31498a(this.f32961d, this.f32960c);
        } catch (Exception e) {
            C11461g.m41885b(AnalyticsManager.TAG, e, "Unable to record analytic [%d].", Integer.valueOf(this.f32961d.mo29761a()));
        }
    }
}
