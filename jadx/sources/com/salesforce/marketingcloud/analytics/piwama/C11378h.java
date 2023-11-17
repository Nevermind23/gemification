package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import com.salesforce.marketingcloud.analytics.C11341b;
import com.salesforce.marketingcloud.internal.C11516m;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import java.util.Date;
import kotlin.jvm.internal.C41536l;
import org.json.JSONObject;

/* renamed from: com.salesforce.marketingcloud.analytics.piwama.h */
public final class C11378h implements C11373c {

    /* renamed from: a */
    private final Date f33053a;

    /* renamed from: b */
    private final String f33054b;

    /* renamed from: c */
    private final String f33055c;

    /* renamed from: d */
    private final String f33056d;

    /* renamed from: e */
    private final String f33057e;

    public C11378h(String str, String str2, String str3, String str4, Date date) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(date, "timestamp");
        this.f33053a = date;
        this.f33054b = mo29812a(str, C11769i.C11770a.f34149l, true);
        String str5 = null;
        this.f33055c = str2 == null ? null : mo29812a(str2, "title", false);
        this.f33056d = str3 == null ? null : mo29812a(str3, "item", false);
        this.f33057e = str4 != null ? mo29812a(str4, "search", false) : str5;
    }

    /* renamed from: a */
    public String mo29811a() {
        return "";
    }

    /* renamed from: b */
    public String mo29814b() {
        return "track_view";
    }

    /* renamed from: c */
    public int mo29815c() {
        return C11341b.f32963B;
    }

    /* renamed from: d */
    public Date mo29816d() {
        return this.f33053a;
    }

    /* renamed from: e */
    public JSONObject mo29817e() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("api_endpoint", mo29814b());
        jSONObject.put("timestamp", C11516m.m42082a(mo29816d()));
        jSONObject.put(C11769i.C11770a.f34149l, mo29821i());
        if (!TextUtils.isEmpty(mo29820h())) {
            jSONObject.put("title", mo29820h());
        }
        if (!TextUtils.isEmpty(mo29818f())) {
            jSONObject.put("item", mo29818f());
        }
        if (!TextUtils.isEmpty(mo29819g())) {
            jSONObject.put("search", mo29819g());
        }
        return jSONObject;
    }

    /* renamed from: f */
    public final String mo29818f() {
        return this.f33056d;
    }

    /* renamed from: g */
    public final String mo29819g() {
        return this.f33057e;
    }

    /* renamed from: h */
    public final String mo29820h() {
        return this.f33055c;
    }

    /* renamed from: i */
    public final String mo29821i() {
        return this.f33054b;
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
