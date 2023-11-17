package cj0;

import kotlin.jvm.internal.C41536l;
import pi0.C27534a;

/* renamed from: cj0.a */
public final class C19762a implements C27534a {

    /* renamed from: a */
    private final String f54127a;

    /* renamed from: b */
    private final String f54128b;

    /* renamed from: c */
    private final String f54129c;

    /* renamed from: d */
    private final String f54130d;

    public C19762a(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "receiverPhoneNumber");
        C41536l.m120489i(str2, "amount");
        C41536l.m120489i(str3, "validityDate");
        C41536l.m120489i(str4, "store");
        this.f54127a = str;
        this.f54128b = str2;
        this.f54129c = str3;
        this.f54130d = str4;
    }

    /* renamed from: a */
    public final String mo47985a() {
        return this.f54128b;
    }

    /* renamed from: b */
    public final String mo47986b() {
        return this.f54127a;
    }

    /* renamed from: c */
    public final String mo47987c() {
        return this.f54130d;
    }

    /* renamed from: d */
    public final String mo47988d() {
        return this.f54129c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19762a)) {
            return false;
        }
        C19762a aVar = (C19762a) obj;
        return C41536l.m120484d(this.f54127a, aVar.f54127a) && C41536l.m120484d(this.f54128b, aVar.f54128b) && C41536l.m120484d(this.f54129c, aVar.f54129c) && C41536l.m120484d(this.f54130d, aVar.f54130d);
    }

    public int hashCode() {
        return (((((this.f54127a.hashCode() * 31) + this.f54128b.hashCode()) * 31) + this.f54129c.hashCode()) * 31) + this.f54130d.hashCode();
    }

    public String toString() {
        String str = this.f54127a;
        String str2 = this.f54128b;
        String str3 = this.f54129c;
        String str4 = this.f54130d;
        return "StatementDetailsItem(receiverPhoneNumber=" + str + ", amount=" + str2 + ", validityDate=" + str3 + ", store=" + str4 + ")";
    }
}
