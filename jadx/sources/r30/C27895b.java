package r30;

import com.salesforce.marketingcloud.C11398b;
import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p891su.C28269e;
import r30.C27906g;

/* renamed from: r30.b */
public final class C27895b implements C27906g {

    /* renamed from: a */
    private final long f71040a;

    /* renamed from: b */
    private final String f71041b;

    /* renamed from: c */
    private final String f71042c;

    /* renamed from: d */
    private final String f71043d;

    /* renamed from: e */
    private final boolean f71044e;

    /* renamed from: f */
    private final C28269e f71045f;

    /* renamed from: g */
    private boolean f71046g;

    /* renamed from: h */
    private boolean f71047h;

    /* renamed from: i */
    private boolean f71048i;

    /* renamed from: j */
    private boolean f71049j;

    /* renamed from: k */
    private final boolean f71050k;

    /* renamed from: l */
    private final C27906g.C27907a f71051l;

    public C27895b(long j, String str, String str2, String str3, boolean z, C28269e eVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        C41536l.m120489i(str2, "contactName");
        C41536l.m120489i(eVar, "contactType");
        this.f71040a = j;
        this.f71041b = str;
        this.f71042c = str2;
        this.f71043d = str3;
        this.f71044e = z;
        this.f71045f = eVar;
        this.f71046g = z2;
        this.f71047h = z3;
        this.f71048i = z4;
        this.f71049j = z5;
        this.f71050k = z6;
        this.f71051l = C27906g.C27907a.CONTACT;
    }

    /* renamed from: c */
    public static /* synthetic */ C27895b m86151c(C27895b bVar, long j, String str, String str2, String str3, boolean z, C28269e eVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        C27895b bVar2 = bVar;
        int i2 = i;
        return bVar.mo67434b((i2 & 1) != 0 ? bVar2.f71040a : j, (i2 & 2) != 0 ? bVar2.f71041b : str, (i2 & 4) != 0 ? bVar2.f71042c : str2, (i2 & 8) != 0 ? bVar2.f71043d : str3, (i2 & 16) != 0 ? bVar2.f71044e : z, (i2 & 32) != 0 ? bVar2.f71045f : eVar, (i2 & 64) != 0 ? bVar2.f71046g : z2, (i2 & 128) != 0 ? bVar2.f71047h : z3, (i2 & C11398b.f33139r) != 0 ? bVar2.f71048i : z4, (i2 & C11398b.f33140s) != 0 ? bVar2.f71049j : z5, (i2 & C11398b.f33141t) != 0 ? bVar2.f71050k : z6);
    }

    /* renamed from: a */
    public C27906g.C27907a mo67429a() {
        return this.f71051l;
    }

    /* renamed from: b */
    public final C27895b mo67434b(long j, String str, String str2, String str3, boolean z, C28269e eVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str4 = str2;
        C41536l.m120489i(str4, "contactName");
        C28269e eVar2 = eVar;
        C41536l.m120489i(eVar2, "contactType");
        return new C27895b(j, str, str4, str3, z, eVar2, z2, z3, z4, z5, z6);
    }

    /* renamed from: d */
    public final boolean mo67435d() {
        return this.f71049j;
    }

    /* renamed from: e */
    public final String mo67436e() {
        return this.f71042c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27895b)) {
            return false;
        }
        C27895b bVar = (C27895b) obj;
        return this.f71040a == bVar.f71040a && C41536l.m120484d(this.f71041b, bVar.f71041b) && C41536l.m120484d(this.f71042c, bVar.f71042c) && C41536l.m120484d(this.f71043d, bVar.f71043d) && this.f71044e == bVar.f71044e && this.f71045f == bVar.f71045f && this.f71046g == bVar.f71046g && this.f71047h == bVar.f71047h && this.f71048i == bVar.f71048i && this.f71049j == bVar.f71049j && this.f71050k == bVar.f71050k;
    }

    /* renamed from: f */
    public final C28269e mo67438f() {
        return this.f71045f;
    }

    /* renamed from: g */
    public final long mo67439g() {
        return this.f71040a;
    }

    /* renamed from: h */
    public final String mo67440h() {
        return this.f71043d;
    }

    public int hashCode() {
        int a = C7397t.m28148a(this.f71040a) * 31;
        String str = this.f71041b;
        int i = 0;
        int hashCode = (((a + (str == null ? 0 : str.hashCode())) * 31) + this.f71042c.hashCode()) * 31;
        String str2 = this.f71043d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f71044e;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((i2 + (z ? 1 : 0)) * 31) + this.f71045f.hashCode()) * 31;
        boolean z3 = this.f71046g;
        if (z3) {
            z3 = true;
        }
        int i3 = (hashCode2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f71047h;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f71048i;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f71049j;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.f71050k;
        if (!z7) {
            z2 = z7;
        }
        return i6 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo67442i() {
        return this.f71046g;
    }

    /* renamed from: j */
    public final String mo67443j() {
        return this.f71041b;
    }

    /* renamed from: k */
    public final boolean mo67444k() {
        return this.f71044e;
    }

    /* renamed from: l */
    public final boolean mo67445l() {
        return this.f71050k;
    }

    /* renamed from: m */
    public final boolean mo67446m() {
        return this.f71048i;
    }

    /* renamed from: n */
    public final boolean mo67447n() {
        return this.f71047h;
    }

    /* renamed from: o */
    public final void mo67448o(boolean z) {
        this.f71046g = z;
    }

    public String toString() {
        long j = this.f71040a;
        String str = this.f71041b;
        String str2 = this.f71042c;
        String str3 = this.f71043d;
        boolean z = this.f71044e;
        C28269e eVar = this.f71045f;
        boolean z2 = this.f71046g;
        boolean z3 = this.f71047h;
        boolean z4 = this.f71048i;
        boolean z5 = this.f71049j;
        boolean z6 = this.f71050k;
        return "ContactItem(id=" + j + ", profilePictureUrl=" + str + ", contactName=" + str2 + ", nickName=" + str3 + ", isBogContact=" + z + ", contactType=" + eVar + ", openSwipeMenu=" + z2 + ", isTrusted=" + z3 + ", isPrimary=" + z4 + ", canTrust=" + z5 + ", isLastItem=" + z6 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C27895b(long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, boolean r22, p891su.C28269e r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r11 = r2
            goto L_0x000b
        L_0x0009:
            r11 = r24
        L_0x000b:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0011
            r15 = r2
            goto L_0x0013
        L_0x0011:
            r15 = r28
        L_0x0013:
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r12 = r25
            r13 = r26
            r14 = r27
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r30.C27895b.<init>(long, java.lang.String, java.lang.String, java.lang.String, boolean, su.e, boolean, boolean, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
