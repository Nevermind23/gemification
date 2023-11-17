package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.analytics.PiOrder;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.g */
public final class C11377g implements C11373c {

    /* renamed from: a */
    private final PiOrder f33051a;

    /* renamed from: b */
    private final Date f33052b;

    public C11377g(PiOrder piOrder, Date date) {
        C41536l.m120489i(piOrder, "piOrder");
        C41536l.m120489i(date, "timestamp");
        this.f33051a = piOrder;
        this.f33052b = date;
    }

    /* renamed from: a */
    public String mo29811a() {
        return "";
    }

    /* renamed from: b */
    public String mo29814b() {
        return "track_conversion";
    }

    /* renamed from: c */
    public int mo29815c() {
        return C11341b.f32982z;
    }

    /* renamed from: d */
    public Date mo29816d() {
        return this.f33052b;
    }

    /* renamed from: e */
    public JSONObject mo29817e() {
        JSONObject jSONObject = new JSONObject();
        mo29813a(jSONObject);
        PiOrder piOrder = this.f33051a;
        jSONObject.put("shipping", piOrder.shipping());
        jSONObject.put("order_number", piOrder.orderNumber());
        jSONObject.put("discount", piOrder.discount());
        jSONObject.put("cart", piOrder.cart().m124845toJson());
        return jSONObject;
    }

    /* renamed from: a */
    public /* synthetic */ String mo29812a(String str, String str2, boolean z) {
        return C11389m.m41651a(this, str, str2, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo29813a(JSONObject jSONObject) {
        C11389m.m41652b(this, jSONObject);
    }
}
