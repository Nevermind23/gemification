package j71;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: j71.c */
public final class C36750c {

    /* renamed from: a */
    private final long f88667a;

    /* renamed from: b */
    private final long f88668b;

    /* renamed from: c */
    private final String f88669c;

    /* renamed from: d */
    private final String f88670d;

    /* renamed from: e */
    private final String f88671e;

    /* renamed from: f */
    private final String f88672f;

    /* renamed from: g */
    private final C36756i f88673g;

    /* renamed from: h */
    private final C36756i f88674h;

    /* renamed from: i */
    private final boolean f88675i;

    /* renamed from: j */
    private final String f88676j;

    /* renamed from: k */
    private final C36751d f88677k;

    /* renamed from: l */
    private final C36751d f88678l;

    /* renamed from: m */
    private final List f88679m;

    public C36750c(long j, long j2, String str, String str2, String str3, String str4, C36756i iVar, C36756i iVar2, boolean z, String str5, C36751d dVar, C36751d dVar2, List list) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        C36756i iVar3 = iVar;
        C36756i iVar4 = iVar2;
        C36751d dVar3 = dVar;
        C36751d dVar4 = dVar2;
        List list2 = list;
        C41536l.m120489i(str6, "lastFour");
        C41536l.m120489i(str7, "deviceType");
        C41536l.m120489i(str8, "deviceId");
        C41536l.m120489i(str9, "deviceName");
        C41536l.m120489i(iVar3, "status");
        C41536l.m120489i(iVar4, "deviceStatus");
        C41536l.m120489i(dVar3, "cardLargeBackground");
        C41536l.m120489i(dVar4, "cardSmallBackground");
        C41536l.m120489i(list2, "activePass");
        this.f88667a = j;
        this.f88668b = j2;
        this.f88669c = str6;
        this.f88670d = str7;
        this.f88671e = str8;
        this.f88672f = str9;
        this.f88673g = iVar3;
        this.f88674h = iVar4;
        this.f88675i = z;
        this.f88676j = str5;
        this.f88677k = dVar3;
        this.f88678l = dVar4;
        this.f88679m = list2;
    }

    /* renamed from: a */
    public final List mo89590a() {
        return this.f88679m;
    }

    /* renamed from: b */
    public final long mo89591b() {
        return this.f88667a;
    }

    /* renamed from: c */
    public final C36751d mo89592c() {
        return this.f88678l;
    }

    /* renamed from: d */
    public final String mo89593d() {
        return this.f88671e;
    }

    /* renamed from: e */
    public final String mo89594e() {
        return this.f88672f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36750c)) {
            return false;
        }
        C36750c cVar = (C36750c) obj;
        return this.f88667a == cVar.f88667a && this.f88668b == cVar.f88668b && C41536l.m120484d(this.f88669c, cVar.f88669c) && C41536l.m120484d(this.f88670d, cVar.f88670d) && C41536l.m120484d(this.f88671e, cVar.f88671e) && C41536l.m120484d(this.f88672f, cVar.f88672f) && this.f88673g == cVar.f88673g && this.f88674h == cVar.f88674h && this.f88675i == cVar.f88675i && C41536l.m120484d(this.f88676j, cVar.f88676j) && C41536l.m120484d(this.f88677k, cVar.f88677k) && C41536l.m120484d(this.f88678l, cVar.f88678l) && C41536l.m120484d(this.f88679m, cVar.f88679m);
    }

    /* renamed from: f */
    public final C36756i mo89596f() {
        return this.f88674h;
    }

    /* renamed from: g */
    public final String mo89597g() {
        return this.f88670d;
    }

    /* renamed from: h */
    public final long mo89598h() {
        return this.f88668b;
    }

    public int hashCode() {
        int a = ((((((((((((((C7397t.m28148a(this.f88667a) * 31) + C7397t.m28148a(this.f88668b)) * 31) + this.f88669c.hashCode()) * 31) + this.f88670d.hashCode()) * 31) + this.f88671e.hashCode()) * 31) + this.f88672f.hashCode()) * 31) + this.f88673g.hashCode()) * 31) + this.f88674h.hashCode()) * 31;
        boolean z = this.f88675i;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        String str = this.f88676j;
        return ((((((i + (str == null ? 0 : str.hashCode())) * 31) + this.f88677k.hashCode()) * 31) + this.f88678l.hashCode()) * 31) + this.f88679m.hashCode();
    }

    /* renamed from: i */
    public final String mo89600i() {
        return this.f88669c;
    }

    /* renamed from: j */
    public final C36756i mo89601j() {
        return this.f88673g;
    }

    /* renamed from: k */
    public final boolean mo89602k() {
        return this.f88675i;
    }

    public String toString() {
        long j = this.f88667a;
        long j2 = this.f88668b;
        String str = this.f88669c;
        String str2 = this.f88670d;
        String str3 = this.f88671e;
        String str4 = this.f88672f;
        C36756i iVar = this.f88673g;
        C36756i iVar2 = this.f88674h;
        boolean z = this.f88675i;
        String str5 = this.f88676j;
        C36751d dVar = this.f88677k;
        C36751d dVar2 = this.f88678l;
        List list = this.f88679m;
        return "ActivePassDevice(cardId=" + j + ", expDate=" + j2 + ", lastFour=" + str + ", deviceType=" + str2 + ", deviceId=" + str3 + ", deviceName=" + str4 + ", status=" + iVar + ", deviceStatus=" + iVar2 + ", isPhysicalCard=" + z + ", deviceStatusDescription=" + str5 + ", cardLargeBackground=" + dVar + ", cardSmallBackground=" + dVar2 + ", activePass=" + list + ")";
    }
}
