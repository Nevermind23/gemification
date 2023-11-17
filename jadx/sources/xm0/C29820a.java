package xm0;

import kotlin.jvm.internal.C41536l;
import sm0.C28250b;

/* renamed from: xm0.a */
public final class C29820a {

    /* renamed from: a */
    private final String f75501a;

    /* renamed from: b */
    private final String f75502b;

    /* renamed from: c */
    private final C28250b f75503c;

    public C29820a(String str, String str2, C28250b bVar) {
        C41536l.m120489i(str, "phone");
        C41536l.m120489i(str2, "otp");
        C41536l.m120489i(bVar, "request");
        this.f75501a = str;
        this.f75502b = str2;
        this.f75503c = bVar;
    }

    /* renamed from: a */
    public final String mo70075a() {
        return this.f75502b;
    }

    /* renamed from: b */
    public final String mo70076b() {
        return this.f75501a;
    }

    /* renamed from: c */
    public final C28250b mo70077c() {
        return this.f75503c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29820a)) {
            return false;
        }
        C29820a aVar = (C29820a) obj;
        return C41536l.m120484d(this.f75501a, aVar.f75501a) && C41536l.m120484d(this.f75502b, aVar.f75502b) && C41536l.m120484d(this.f75503c, aVar.f75503c);
    }

    public int hashCode() {
        return (((this.f75501a.hashCode() * 31) + this.f75502b.hashCode()) * 31) + this.f75503c.hashCode();
    }

    public String toString() {
        String str = this.f75501a;
        String str2 = this.f75502b;
        C28250b bVar = this.f75503c;
        return "ChildOtpInput(phone=" + str + ", otp=" + str2 + ", request=" + bVar + ")";
    }
}
