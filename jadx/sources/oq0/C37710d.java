package oq0;

import kotlin.jvm.internal.C41536l;
import p603si.C17799b;

/* renamed from: oq0.d */
public final class C37710d {

    /* renamed from: a */
    private final C17799b f90593a;

    /* renamed from: b */
    private final String f90594b;

    /* renamed from: c */
    private final boolean f90595c;

    /* renamed from: d */
    private final boolean f90596d;

    /* renamed from: e */
    private final Object f90597e;

    /* renamed from: f */
    private final boolean f90598f;

    public C37710d(C17799b bVar, String str, boolean z, boolean z2, Object obj, boolean z3) {
        C41536l.m120489i(bVar, "validator");
        C41536l.m120489i(str, "infoText");
        this.f90593a = bVar;
        this.f90594b = str;
        this.f90595c = z;
        this.f90596d = z2;
        this.f90597e = obj;
        this.f90598f = z3;
    }

    /* renamed from: b */
    public static /* synthetic */ C37710d m110846b(C37710d dVar, C17799b bVar, String str, boolean z, boolean z2, Object obj, boolean z3, int i, Object obj2) {
        if ((i & 1) != 0) {
            bVar = dVar.f90593a;
        }
        if ((i & 2) != 0) {
            str = dVar.f90594b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            z = dVar.f90595c;
        }
        boolean z4 = z;
        if ((i & 8) != 0) {
            z2 = dVar.f90596d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            obj = dVar.f90597e;
        }
        Object obj3 = obj;
        if ((i & 32) != 0) {
            z3 = dVar.f90598f;
        }
        return dVar.mo90936a(bVar, str2, z4, z5, obj3, z3);
    }

    /* renamed from: a */
    public final C37710d mo90936a(C17799b bVar, String str, boolean z, boolean z2, Object obj, boolean z3) {
        C41536l.m120489i(bVar, "validator");
        C41536l.m120489i(str, "infoText");
        return new C37710d(bVar, str, z, z2, obj, z3);
    }

    /* renamed from: c */
    public final String mo90937c() {
        return this.f90594b;
    }

    /* renamed from: d */
    public final boolean mo90938d() {
        return this.f90595c;
    }

    /* renamed from: e */
    public final C17799b mo90939e() {
        return this.f90593a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37710d)) {
            return false;
        }
        C37710d dVar = (C37710d) obj;
        return C41536l.m120484d(this.f90593a, dVar.f90593a) && C41536l.m120484d(this.f90594b, dVar.f90594b) && this.f90595c == dVar.f90595c && this.f90596d == dVar.f90596d && C41536l.m120484d(this.f90597e, dVar.f90597e) && this.f90598f == dVar.f90598f;
    }

    /* renamed from: f */
    public Object mo90941f() {
        return this.f90597e;
    }

    /* renamed from: g */
    public boolean mo90942g() {
        return this.f90598f;
    }

    /* renamed from: h */
    public boolean mo90943h() {
        return this.f90596d;
    }

    public int hashCode() {
        int hashCode = ((this.f90593a.hashCode() * 31) + this.f90594b.hashCode()) * 31;
        boolean z = this.f90595c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f90596d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        Object obj = this.f90597e;
        int hashCode2 = (i2 + (obj == null ? 0 : obj.hashCode())) * 31;
        boolean z4 = this.f90598f;
        if (!z4) {
            z2 = z4;
        }
        return hashCode2 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo90945i() {
        if (mo90941f() == null) {
            return !mo90943h();
        }
        if (!mo90943h()) {
            return true;
        }
        if (this.f90593a.mo45386g(mo90941f().toString())) {
            return true;
        }
        return false;
    }

    public String toString() {
        C17799b bVar = this.f90593a;
        String str = this.f90594b;
        boolean z = this.f90595c;
        boolean z2 = this.f90596d;
        Object obj = this.f90597e;
        boolean z3 = this.f90598f;
        return "TextInput(validator=" + bVar + ", infoText=" + str + ", validState=" + z + ", isVisible=" + z2 + ", value=" + obj + ", isEditable=" + z3 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37710d(p603si.C17799b r5, java.lang.String r6, boolean r7, boolean r8, java.lang.Object r9, boolean r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            si.b$f r5 = p603si.C17799b.C17805f.f50686d
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            java.lang.String r6 = ""
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            r0 = 1
            if (r6 == 0) goto L_0x0014
            r1 = r0
            goto L_0x0015
        L_0x0014:
            r1 = r7
        L_0x0015:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001b
            r2 = r0
            goto L_0x001c
        L_0x001b:
            r2 = r8
        L_0x001c:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            r9 = 0
        L_0x0021:
            r3 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = r10
        L_0x0028:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oq0.C37710d.<init>(si.b, java.lang.String, boolean, boolean, java.lang.Object, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
