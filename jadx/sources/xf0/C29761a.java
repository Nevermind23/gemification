package xf0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xf0.a */
public final class C29761a {

    /* renamed from: k */
    public static final C29762a f75279k = new C29762a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private C29765d f75280a;

    /* renamed from: b */
    private final List f75281b;

    /* renamed from: c */
    private String f75282c;

    /* renamed from: d */
    private C29765d f75283d;

    /* renamed from: e */
    private final List f75284e;

    /* renamed from: f */
    private C29765d f75285f;

    /* renamed from: g */
    private final List f75286g;

    /* renamed from: h */
    private boolean f75287h;

    /* renamed from: i */
    private String f75288i;

    /* renamed from: j */
    private String f75289j;

    /* renamed from: xf0.a$a */
    public static final class C29762a {
        private C29762a() {
        }

        public /* synthetic */ C29762a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C29761a(C29765d dVar, List list, String str, C29765d dVar2, List list2, C29765d dVar3, List list3, boolean z, String str2, String str3) {
        C41536l.m120489i(list, "occupationStatusList");
        C41536l.m120489i(list2, "sectorList");
        C41536l.m120489i(list3, "positionList");
        this.f75280a = dVar;
        this.f75281b = list;
        this.f75282c = str;
        this.f75283d = dVar2;
        this.f75284e = list2;
        this.f75285f = dVar3;
        this.f75286g = list3;
        this.f75287h = z;
        this.f75288i = str2;
        this.f75289j = str3;
    }

    /* renamed from: a */
    public final boolean mo69887a() {
        return this.f75287h;
    }

    /* renamed from: b */
    public final String mo69888b() {
        return this.f75288i;
    }

    /* renamed from: c */
    public final String mo69889c() {
        return this.f75289j;
    }

    /* renamed from: d */
    public final String mo69890d() {
        return this.f75282c;
    }

    /* renamed from: e */
    public final C29765d mo69891e() {
        return this.f75280a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29761a)) {
            return false;
        }
        C29761a aVar = (C29761a) obj;
        return C41536l.m120484d(this.f75280a, aVar.f75280a) && C41536l.m120484d(this.f75281b, aVar.f75281b) && C41536l.m120484d(this.f75282c, aVar.f75282c) && C41536l.m120484d(this.f75283d, aVar.f75283d) && C41536l.m120484d(this.f75284e, aVar.f75284e) && C41536l.m120484d(this.f75285f, aVar.f75285f) && C41536l.m120484d(this.f75286g, aVar.f75286g) && this.f75287h == aVar.f75287h && C41536l.m120484d(this.f75288i, aVar.f75288i) && C41536l.m120484d(this.f75289j, aVar.f75289j);
    }

    /* renamed from: f */
    public final List mo69893f() {
        return this.f75281b;
    }

    /* renamed from: g */
    public final C29765d mo69894g() {
        return this.f75285f;
    }

    /* renamed from: h */
    public final List mo69895h() {
        return this.f75286g;
    }

    public int hashCode() {
        C29765d dVar = this.f75280a;
        int i = 0;
        int hashCode = (((dVar == null ? 0 : dVar.hashCode()) * 31) + this.f75281b.hashCode()) * 31;
        String str = this.f75282c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C29765d dVar2 = this.f75283d;
        int hashCode3 = (((hashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31) + this.f75284e.hashCode()) * 31;
        C29765d dVar3 = this.f75285f;
        int hashCode4 = (((hashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31) + this.f75286g.hashCode()) * 31;
        boolean z = this.f75287h;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        String str2 = this.f75288i;
        int hashCode5 = (i2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f75289j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    /* renamed from: i */
    public final C29765d mo69897i() {
        return this.f75283d;
    }

    /* renamed from: j */
    public final List mo69898j() {
        return this.f75284e;
    }

    /* renamed from: k */
    public final boolean mo69899k() {
        boolean z;
        if (!mo69900l()) {
            return true;
        }
        if (this.f75280a != null) {
            String str = this.f75282c;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!(z || this.f75285f == null || this.f75283d == null)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: xf0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: xf0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: xf0.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: xf0.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69900l() {
        /*
            r3 = this;
            xf0.d r0 = r3.f75280a
            if (r0 != 0) goto L_0x0022
            java.util.List r0 = r3.f75281b
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x001e
            java.lang.Object r1 = r0.next()
            r2 = r1
            xf0.d r2 = (xf0.C29765d) r2
            boolean r2 = r2.mo69923c()
            if (r2 == 0) goto L_0x000a
            goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            r0 = r1
            xf0.d r0 = (xf0.C29765d) r0
        L_0x0022:
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r0.mo69921a()
            java.lang.String r2 = "EMPLOYED"
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r2)
            if (r1 != 0) goto L_0x003c
            java.lang.String r0 = r0.mo69921a()
            java.lang.String r1 = "SELF_EMPLOYED"
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 == 0) goto L_0x003e
        L_0x003c:
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xf0.C29761a.mo69900l():boolean");
    }

    /* renamed from: m */
    public final boolean mo69901m(boolean z) {
        if (!z) {
            return true;
        }
        String str = this.f75288i;
        if (!(str == null || str.length() == 0)) {
            String str2 = this.f75289j;
            if (!(str2 == null || str2.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: n */
    public final void mo69902n(boolean z) {
        this.f75287h = z;
    }

    /* renamed from: o */
    public final void mo69903o(String str) {
        this.f75288i = str;
    }

    /* renamed from: p */
    public final void mo69904p(String str) {
        this.f75289j = str;
    }

    /* renamed from: q */
    public final void mo69905q(String str) {
        this.f75282c = str;
    }

    /* renamed from: r */
    public final void mo69906r(C29765d dVar) {
        this.f75280a = dVar;
    }

    /* renamed from: s */
    public final void mo69907s(C29765d dVar) {
        this.f75285f = dVar;
    }

    /* renamed from: t */
    public final void mo69908t(C29765d dVar) {
        this.f75283d = dVar;
    }

    public String toString() {
        C29765d dVar = this.f75280a;
        List list = this.f75281b;
        String str = this.f75282c;
        C29765d dVar2 = this.f75283d;
        List list2 = this.f75284e;
        C29765d dVar3 = this.f75285f;
        List list3 = this.f75286g;
        boolean z = this.f75287h;
        String str2 = this.f75288i;
        String str3 = this.f75289j;
        return "EmploymentInfoUIModel(occupationStatus=" + dVar + ", occupationStatusList=" + list + ", employerName=" + str + ", sector=" + dVar2 + ", sectorList=" + list2 + ", position=" + dVar3 + ", positionList=" + list3 + ", broker=" + z + ", directorOfName=" + str2 + ", directorOfSymbol=" + str3 + ")";
    }
}
