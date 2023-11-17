package pk0;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;

/* renamed from: pk0.c */
public final class C27587c {

    /* renamed from: a */
    private final PackageType f70511a;

    /* renamed from: b */
    private final String f70512b;

    public C27587c(PackageType packageType, String str) {
        this.f70511a = packageType;
        this.f70512b = str;
    }

    /* renamed from: a */
    public final String mo66943a() {
        return this.f70512b;
    }

    /* renamed from: b */
    public final PackageType mo66944b() {
        return this.f70511a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27587c)) {
            return false;
        }
        C27587c cVar = (C27587c) obj;
        return this.f70511a == cVar.f70511a && C41536l.m120484d(this.f70512b, cVar.f70512b);
    }

    public int hashCode() {
        PackageType packageType = this.f70511a;
        int i = 0;
        int hashCode = (packageType == null ? 0 : packageType.hashCode()) * 31;
        String str = this.f70512b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        PackageType packageType = this.f70511a;
        String str = this.f70512b;
        return "ProfileWrapper(packageType=" + packageType + ", packageName=" + str + ")";
    }
}
