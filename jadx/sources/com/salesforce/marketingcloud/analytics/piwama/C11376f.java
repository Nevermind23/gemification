package com.salesforce.marketingcloud.analytics.piwama;

import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.analytics.PiCart;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.f */
public final class C11376f implements C11373c {

    /* renamed from: a */
    private final PiCart f33049a;

    /* renamed from: b */
    private final Date f33050b;

    public C11376f(PiCart piCart, Date date) {
        C41536l.m120489i(piCart, "piCart");
        C41536l.m120489i(date, "timestamp");
        this.f33049a = piCart;
        this.f33050b = date;
    }

    /* renamed from: a */
    public String mo29811a() {
        return "";
    }

    /* renamed from: b */
    public String mo29814b() {
        return "track_cart";
    }

    /* renamed from: c */
    public int mo29815c() {
        return C11341b.f32962A;
    }

    /* renamed from: d */
    public Date mo29816d() {
        return this.f33050b;
    }

    /* renamed from: e */
    public JSONObject mo29817e() {
        JSONObject jSONObject = new JSONObject();
        mo29813a(jSONObject);
        if (!this.f33049a.cartItems().isEmpty()) {
            jSONObject.put("cart", this.f33049a.m124845toJson());
        } else {
            jSONObject.put("clear_cart", true);
        }
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
