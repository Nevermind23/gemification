package e70;

import hd0.C24978b;
import kotlin.jvm.internal.C41536l;

/* renamed from: e70.a */
public final class C20182a {

    /* renamed from: a */
    private C24978b f54864a;

    /* renamed from: b */
    private final String f54865b;

    /* renamed from: c */
    private final String f54866c;

    /* renamed from: d */
    private final String f54867d;

    public C20182a(C24978b bVar, String str, String str2, String str3) {
        this.f54864a = bVar;
        this.f54865b = str;
        this.f54866c = str2;
        this.f54867d = str3;
    }

    /* renamed from: a */
    public final String mo48590a() {
        return this.f54867d;
    }

    /* renamed from: b */
    public final String mo48591b() {
        return this.f54866c;
    }

    /* renamed from: c */
    public final String mo48592c() {
        return this.f54865b;
    }

    /* renamed from: d */
    public final C24978b mo48593d() {
        return this.f54864a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20182a)) {
            return false;
        }
        C20182a aVar = (C20182a) obj;
        return this.f54864a == aVar.f54864a && C41536l.m120484d(this.f54865b, aVar.f54865b) && C41536l.m120484d(this.f54866c, aVar.f54866c) && C41536l.m120484d(this.f54867d, aVar.f54867d);
    }

    public int hashCode() {
        C24978b bVar = this.f54864a;
        int i = 0;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        String str = this.f54865b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f54866c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54867d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        C24978b bVar = this.f54864a;
        String str = this.f54865b;
        String str2 = this.f54866c;
        String str3 = this.f54867d;
        return "QrMerchantInfo(isValid=" + bVar + ", merchantNameInt=" + str + ", merchantName=" + str2 + ", deviceId=" + str3 + ")";
    }
}
