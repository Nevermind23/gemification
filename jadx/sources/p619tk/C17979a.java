package p619tk;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

/* renamed from: tk.a */
public final class C17979a {

    /* renamed from: a */
    private final long f51193a;

    /* renamed from: b */
    private final String f51194b;

    /* renamed from: c */
    private final String f51195c;

    /* renamed from: d */
    private final boolean f51196d;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        if ((r5.length() > 0) != false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C17979a(long r2, java.lang.String r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.String r0 = "phoneNumber"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "email"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            r1.<init>()
            r1.f51193a = r2
            r1.f51194b = r4
            r1.f51195c = r5
            int r2 = r4.length()
            r3 = 1
            r4 = 0
            if (r2 <= 0) goto L_0x001d
            r2 = r3
            goto L_0x001e
        L_0x001d:
            r2 = r4
        L_0x001e:
            if (r2 == 0) goto L_0x002c
            int r2 = r5.length()
            if (r2 <= 0) goto L_0x0028
            r2 = r3
            goto L_0x0029
        L_0x0028:
            r2 = r4
        L_0x0029:
            if (r2 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r3 = r4
        L_0x002d:
            r1.f51196d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p619tk.C17979a.<init>(long, java.lang.String, java.lang.String):void");
    }

    /* renamed from: b */
    public static /* synthetic */ C17979a m61945b(C17979a aVar, long j, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = aVar.f51193a;
        }
        if ((i & 2) != 0) {
            str = aVar.f51194b;
        }
        if ((i & 4) != 0) {
            str2 = aVar.f51195c;
        }
        return aVar.mo45662a(j, str, str2);
    }

    /* renamed from: a */
    public final C17979a mo45662a(long j, String str, String str2) {
        C41536l.m120489i(str, "phoneNumber");
        C41536l.m120489i(str2, "email");
        return new C17979a(j, str, str2);
    }

    /* renamed from: c */
    public final long mo45663c() {
        return this.f51193a;
    }

    /* renamed from: d */
    public final String mo45664d() {
        return this.f51195c;
    }

    /* renamed from: e */
    public final String mo45665e() {
        return this.f51194b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17979a)) {
            return false;
        }
        C17979a aVar = (C17979a) obj;
        return this.f51193a == aVar.f51193a && C41536l.m120484d(this.f51194b, aVar.f51194b) && C41536l.m120484d(this.f51195c, aVar.f51195c);
    }

    /* renamed from: f */
    public final boolean mo45667f() {
        return this.f51196d;
    }

    public int hashCode() {
        return (((C7397t.m28148a(this.f51193a) * 31) + this.f51194b.hashCode()) * 31) + this.f51195c.hashCode();
    }

    public String toString() {
        long j = this.f51193a;
        String str = this.f51194b;
        String str2 = this.f51195c;
        return "ActivationDateInputUiState(activationDate=" + j + ", phoneNumber=" + str + ", email=" + str2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17979a(long j, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }
}
