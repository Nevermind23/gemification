package com.salesforce.marketingcloud.registration;

import android.os.Build;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;

/* renamed from: com.salesforce.marketingcloud.registration.f */
public final class C11730f {

    /* renamed from: a */
    private final String f34020a;

    /* renamed from: b */
    private final String f34021b;

    /* renamed from: c */
    private final String f34022c;

    /* renamed from: d */
    private final String f34023d;

    /* renamed from: e */
    private final String f34024e = "Android";

    /* renamed from: f */
    private final String f34025f;

    /* renamed from: g */
    private final String f34026g;

    public C11730f(String str, String str2, String str3) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "appId");
        C41536l.m120489i(str3, "appVersion");
        this.f34020a = str;
        this.f34021b = str2;
        this.f34022c = str3;
        C41524c0 c0Var = C41524c0.f97701a;
        String format = String.format(Locale.ENGLISH, "%s %s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
        C41536l.m120488h(format, "java.lang.String.format(locale, format, *args)");
        this.f34023d = format;
        String str4 = Build.VERSION.RELEASE;
        this.f34025f = str4 == null ? "Unknown Release" : str4;
        String sdkVersionName = MarketingCloudSdk.getSdkVersionName();
        C41536l.m120488h(sdkVersionName, "getSdkVersionName()");
        this.f34026g = sdkVersionName;
    }

    /* renamed from: a */
    public static /* synthetic */ C11730f m42794a(C11730f fVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.f34020a;
        }
        if ((i & 2) != 0) {
            str2 = fVar.f34021b;
        }
        if ((i & 4) != 0) {
            str3 = fVar.f34022c;
        }
        return fVar.mo31130a(str, str2, str3);
    }

    /* renamed from: b */
    public final String mo31132b() {
        return this.f34021b;
    }

    /* renamed from: c */
    public final String mo31133c() {
        return this.f34022c;
    }

    /* renamed from: d */
    public final String mo31134d() {
        return this.f34021b;
    }

    /* renamed from: e */
    public final String mo31135e() {
        return this.f34022c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11730f)) {
            return false;
        }
        C11730f fVar = (C11730f) obj;
        return C41536l.m120484d(this.f34020a, fVar.f34020a) && C41536l.m120484d(this.f34021b, fVar.f34021b) && C41536l.m120484d(this.f34022c, fVar.f34022c);
    }

    /* renamed from: f */
    public final String mo31137f() {
        return this.f34020a;
    }

    /* renamed from: g */
    public final String mo31138g() {
        return this.f34023d;
    }

    /* renamed from: h */
    public final String mo31139h() {
        return this.f34024e;
    }

    public int hashCode() {
        return (((this.f34020a.hashCode() * 31) + this.f34021b.hashCode()) * 31) + this.f34022c.hashCode();
    }

    /* renamed from: i */
    public final String mo31141i() {
        return this.f34025f;
    }

    /* renamed from: j */
    public final String mo31142j() {
        return this.f34026g;
    }

    public String toString() {
        return "RegistrationMeta(deviceId=" + this.f34020a + ", appId=" + this.f34021b + ", appVersion=" + this.f34022c + ')';
    }

    /* renamed from: a */
    public final C11730f mo31130a(String str, String str2, String str3) {
        C41536l.m120489i(str, "deviceId");
        C41536l.m120489i(str2, "appId");
        C41536l.m120489i(str3, "appVersion");
        return new C11730f(str, str2, str3);
    }

    /* renamed from: a */
    public final String mo31131a() {
        return this.f34020a;
    }
}
