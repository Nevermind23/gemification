package v71;

import j71.C36756i;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;

/* renamed from: v71.a */
public final class C39243a {

    /* renamed from: a */
    private final long f93430a;

    /* renamed from: b */
    private final long f93431b;

    /* renamed from: c */
    private final List f93432c;

    /* renamed from: d */
    private final String f93433d;

    /* renamed from: e */
    private final String f93434e;

    /* renamed from: f */
    private final String f93435f;

    /* renamed from: g */
    private final C36756i f93436g;

    /* renamed from: h */
    private final boolean f93437h;

    /* renamed from: i */
    private final boolean f93438i;

    /* renamed from: j */
    private final String f93439j;

    /* renamed from: k */
    private final String f93440k;

    /* renamed from: l */
    private final String f93441l;

    /* renamed from: m */
    private final boolean f93442m;

    /* renamed from: n */
    private final boolean f93443n;

    public C39243a(long j, long j2, List list, String str, String str2, String str3, C36756i iVar, boolean z, boolean z2, String str4, String str5, String str6) {
        boolean z3;
        C41536l.m120489i(list, "passTypes");
        C41536l.m120489i(str, "deviceType");
        C41536l.m120489i(str2, "deviceId");
        C41536l.m120489i(str3, "deviceName");
        C41536l.m120489i(iVar, "deviceStatus");
        C41536l.m120489i(str4, "cardImage");
        C41536l.m120489i(str5, "deviceStatusDescription");
        C41536l.m120489i(str6, "lastFour");
        this.f93430a = j;
        this.f93431b = j2;
        this.f93432c = list;
        this.f93433d = str;
        this.f93434e = str2;
        this.f93435f = str3;
        this.f93436g = iVar;
        this.f93437h = z;
        this.f93438i = z2;
        this.f93439j = str4;
        this.f93440k = str5;
        this.f93441l = str6;
        C36756i iVar2 = C36756i.A;
        boolean z4 = true;
        if (iVar == iVar2) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f93442m = z3;
        if (!(iVar == C36756i.P || iVar == iVar2)) {
            z4 = false;
        }
        this.f93443n = z4;
    }

    /* renamed from: a */
    public final boolean mo92865a() {
        return this.f93437h;
    }

    /* renamed from: b */
    public final long mo92866b() {
        return this.f93430a;
    }

    /* renamed from: c */
    public final String mo92867c() {
        return this.f93439j;
    }

    /* renamed from: d */
    public final String mo92868d() {
        return this.f93434e;
    }

    /* renamed from: e */
    public final String mo92869e() {
        return this.f93435f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39243a)) {
            return false;
        }
        C39243a aVar = (C39243a) obj;
        return this.f93430a == aVar.f93430a && this.f93431b == aVar.f93431b && C41536l.m120484d(this.f93432c, aVar.f93432c) && C41536l.m120484d(this.f93433d, aVar.f93433d) && C41536l.m120484d(this.f93434e, aVar.f93434e) && C41536l.m120484d(this.f93435f, aVar.f93435f) && this.f93436g == aVar.f93436g && this.f93437h == aVar.f93437h && this.f93438i == aVar.f93438i && C41536l.m120484d(this.f93439j, aVar.f93439j) && C41536l.m120484d(this.f93440k, aVar.f93440k) && C41536l.m120484d(this.f93441l, aVar.f93441l);
    }

    /* renamed from: f */
    public final C36756i mo92871f() {
        return this.f93436g;
    }

    /* renamed from: g */
    public final String mo92872g() {
        return this.f93440k;
    }

    /* renamed from: h */
    public final String mo92873h() {
        return this.f93433d;
    }

    public int hashCode() {
        int a = ((((((((((((C7397t.m28148a(this.f93430a) * 31) + C7397t.m28148a(this.f93431b)) * 31) + this.f93432c.hashCode()) * 31) + this.f93433d.hashCode()) * 31) + this.f93434e.hashCode()) * 31) + this.f93435f.hashCode()) * 31) + this.f93436g.hashCode()) * 31;
        boolean z = this.f93437h;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f93438i;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i + (z2 ? 1 : 0)) * 31) + this.f93439j.hashCode()) * 31) + this.f93440k.hashCode()) * 31) + this.f93441l.hashCode();
    }

    /* renamed from: i */
    public final long mo92875i() {
        return this.f93431b;
    }

    /* renamed from: j */
    public final String mo92876j() {
        return this.f93441l;
    }

    /* renamed from: k */
    public final List mo92877k() {
        return this.f93432c;
    }

    /* renamed from: l */
    public final boolean mo92878l() {
        return this.f93442m;
    }

    /* renamed from: m */
    public final boolean mo92879m() {
        return this.f93443n;
    }

    /* renamed from: n */
    public final boolean mo92880n() {
        return this.f93438i;
    }

    public String toString() {
        long j = this.f93430a;
        long j2 = this.f93431b;
        List list = this.f93432c;
        String str = this.f93433d;
        String str2 = this.f93434e;
        String str3 = this.f93435f;
        C36756i iVar = this.f93436g;
        boolean z = this.f93437h;
        boolean z2 = this.f93438i;
        String str4 = this.f93439j;
        String str5 = this.f93440k;
        String str6 = this.f93441l;
        return "ActivePassUiItem(cardId=" + j + ", expDate=" + j2 + ", passTypes=" + list + ", deviceType=" + str + ", deviceId=" + str2 + ", deviceName=" + str3 + ", deviceStatus=" + iVar + ", canMigrate=" + z + ", isPhysicalCard=" + z2 + ", cardImage=" + str4 + ", deviceStatusDescription=" + str5 + ", lastFour=" + str6 + ")";
    }
}
