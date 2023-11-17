package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import p182n6.C7258g;
import p182n6.C7264i;
import p182n6.C7268k;
import p260t6.C8415q;

/* renamed from: com.google.firebase.k */
public final class C5293k {

    /* renamed from: a */
    private final String f16930a;

    /* renamed from: b */
    private final String f16931b;

    /* renamed from: c */
    private final String f16932c;

    /* renamed from: d */
    private final String f16933d;

    /* renamed from: e */
    private final String f16934e;

    /* renamed from: f */
    private final String f16935f;

    /* renamed from: g */
    private final String f16936g;

    private C5293k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C7264i.m27906o(!C8415q.m31576a(str), "ApplicationId must be set.");
        this.f16931b = str;
        this.f16930a = str2;
        this.f16932c = str3;
        this.f16933d = str4;
        this.f16934e = str5;
        this.f16935f = str6;
        this.f16936g = str7;
    }

    /* renamed from: a */
    public static C5293k m20902a(Context context) {
        C7268k kVar = new C7268k(context);
        String a = kVar.mo21640a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new C5293k(a, kVar.mo21640a("google_api_key"), kVar.mo21640a("firebase_database_url"), kVar.mo21640a("ga_trackingId"), kVar.mo21640a("gcm_defaultSenderId"), kVar.mo21640a("google_storage_bucket"), kVar.mo21640a("project_id"));
    }

    /* renamed from: b */
    public String mo17516b() {
        return this.f16930a;
    }

    /* renamed from: c */
    public String mo17517c() {
        return this.f16931b;
    }

    /* renamed from: d */
    public String mo17518d() {
        return this.f16934e;
    }

    /* renamed from: e */
    public String mo17519e() {
        return this.f16936g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5293k)) {
            return false;
        }
        C5293k kVar = (C5293k) obj;
        if (!C7258g.m27880a(this.f16931b, kVar.f16931b) || !C7258g.m27880a(this.f16930a, kVar.f16930a) || !C7258g.m27880a(this.f16932c, kVar.f16932c) || !C7258g.m27880a(this.f16933d, kVar.f16933d) || !C7258g.m27880a(this.f16934e, kVar.f16934e) || !C7258g.m27880a(this.f16935f, kVar.f16935f) || !C7258g.m27880a(this.f16936g, kVar.f16936g)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C7258g.m27881b(this.f16931b, this.f16930a, this.f16932c, this.f16933d, this.f16934e, this.f16935f, this.f16936g);
    }

    public String toString() {
        return C7258g.m27882c(this).mo21632a("applicationId", this.f16931b).mo21632a("apiKey", this.f16930a).mo21632a("databaseUrl", this.f16932c).mo21632a("gcmSenderId", this.f16934e).mo21632a("storageBucket", this.f16935f).mo21632a("projectId", this.f16936g).toString();
    }
}
