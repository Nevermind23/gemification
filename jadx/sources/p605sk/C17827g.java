package p605sk;

import kotlin.jvm.internal.C41536l;
import p563pk.C17374d;

/* renamed from: sk.g */
public final class C17827g {

    /* renamed from: a */
    private final String f50712a;

    /* renamed from: b */
    private final String f50713b;

    /* renamed from: c */
    private final String f50714c;

    /* renamed from: d */
    private final C17374d f50715d;

    /* renamed from: e */
    private final Long f50716e;

    /* renamed from: f */
    private final boolean f50717f;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r7 != null) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17827g(java.lang.String r3, java.lang.String r4, java.lang.String r5, p563pk.C17374d r6, java.lang.Long r7) {
        /*
            r2 = this;
            java.lang.String r0 = "firstName"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.lang.String r0 = "lastName"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "idNumber"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "gender"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            r2.<init>()
            r2.f50712a = r3
            r2.f50713b = r4
            r2.f50714c = r5
            r2.f50715d = r6
            r2.f50716e = r7
            int r3 = r3.length()
            r0 = 1
            r1 = 0
            if (r3 <= 0) goto L_0x002b
            r3 = r0
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            if (r3 == 0) goto L_0x004b
            int r3 = r4.length()
            if (r3 <= 0) goto L_0x0036
            r3 = r0
            goto L_0x0037
        L_0x0036:
            r3 = r1
        L_0x0037:
            if (r3 == 0) goto L_0x004b
            int r3 = r5.length()
            if (r3 <= 0) goto L_0x0041
            r3 = r0
            goto L_0x0042
        L_0x0041:
            r3 = r1
        L_0x0042:
            if (r3 == 0) goto L_0x004b
            pk.d r3 = p563pk.C17374d.EMPTY
            if (r6 == r3) goto L_0x004b
            if (r7 == 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r0 = r1
        L_0x004c:
            r2.f50717f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p605sk.C17827g.<init>(java.lang.String, java.lang.String, java.lang.String, pk.d, java.lang.Long):void");
    }

    /* renamed from: b */
    public static /* synthetic */ C17827g m61584b(C17827g gVar, String str, String str2, String str3, C17374d dVar, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gVar.f50712a;
        }
        if ((i & 2) != 0) {
            str2 = gVar.f50713b;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = gVar.f50714c;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            dVar = gVar.f50715d;
        }
        C17374d dVar2 = dVar;
        if ((i & 16) != 0) {
            l = gVar.f50716e;
        }
        return gVar.mo45409a(str, str4, str5, dVar2, l);
    }

    /* renamed from: a */
    public final C17827g mo45409a(String str, String str2, String str3, C17374d dVar, Long l) {
        C41536l.m120489i(str, "firstName");
        C41536l.m120489i(str2, "lastName");
        C41536l.m120489i(str3, "idNumber");
        C41536l.m120489i(dVar, "gender");
        return new C17827g(str, str2, str3, dVar, l);
    }

    /* renamed from: c */
    public final boolean mo45410c() {
        return this.f50717f;
    }

    /* renamed from: d */
    public final Long mo45411d() {
        return this.f50716e;
    }

    /* renamed from: e */
    public final String mo45412e() {
        return this.f50712a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17827g)) {
            return false;
        }
        C17827g gVar = (C17827g) obj;
        return C41536l.m120484d(this.f50712a, gVar.f50712a) && C41536l.m120484d(this.f50713b, gVar.f50713b) && C41536l.m120484d(this.f50714c, gVar.f50714c) && this.f50715d == gVar.f50715d && C41536l.m120484d(this.f50716e, gVar.f50716e);
    }

    /* renamed from: f */
    public final C17374d mo45414f() {
        return this.f50715d;
    }

    /* renamed from: g */
    public final String mo45415g() {
        return this.f50714c;
    }

    /* renamed from: h */
    public final String mo45416h() {
        return this.f50713b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f50712a.hashCode() * 31) + this.f50713b.hashCode()) * 31) + this.f50714c.hashCode()) * 31) + this.f50715d.hashCode()) * 31;
        Long l = this.f50716e;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        String str = this.f50712a;
        String str2 = this.f50713b;
        String str3 = this.f50714c;
        C17374d dVar = this.f50715d;
        Long l = this.f50716e;
        return "CarOwnerInputUiState(firstName=" + str + ", lastName=" + str2 + ", idNumber=" + str3 + ", gender=" + dVar + ", dateOfBirth=" + l + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C17827g(java.lang.String r4, java.lang.String r5, java.lang.String r6, p563pk.C17374d r7, java.lang.Long r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0008
            r10 = r0
            goto L_0x0009
        L_0x0008:
            r10 = r4
        L_0x0009:
            r4 = r9 & 2
            if (r4 == 0) goto L_0x000f
            r1 = r0
            goto L_0x0010
        L_0x000f:
            r1 = r5
        L_0x0010:
            r4 = r9 & 4
            if (r4 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r0 = r6
        L_0x0016:
            r4 = r9 & 8
            if (r4 == 0) goto L_0x001c
            pk.d r7 = p563pk.C17374d.EMPTY
        L_0x001c:
            r2 = r7
            r4 = r9 & 16
            if (r4 == 0) goto L_0x0022
            r8 = 0
        L_0x0022:
            r9 = r8
            r4 = r3
            r5 = r10
            r6 = r1
            r7 = r0
            r8 = r2
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p605sk.C17827g.<init>(java.lang.String, java.lang.String, java.lang.String, pk.d, java.lang.Long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
