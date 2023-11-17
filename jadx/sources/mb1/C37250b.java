package mb1;

import kotlin.jvm.internal.C41536l;
import p656wi.C18596a;

/* renamed from: mb1.b */
public final class C37250b {

    /* renamed from: a */
    private final C18596a f89676a;

    /* renamed from: b */
    private final C18596a f89677b;

    /* renamed from: c */
    private final C18596a f89678c;

    /* renamed from: d */
    private final C37249a f89679d;

    /* renamed from: e */
    private final String f89680e;

    public C37250b(C18596a aVar, C18596a aVar2, C18596a aVar3, C37249a aVar4, String str) {
        C41536l.m120489i(aVar, "faceScanState");
        C41536l.m120489i(aVar2, "documentScanState");
        C41536l.m120489i(aVar3, "dataProcessingState");
        C41536l.m120489i(aVar4, "nextStep");
        this.f89676a = aVar;
        this.f89677b = aVar2;
        this.f89678c = aVar3;
        this.f89679d = aVar4;
        this.f89680e = str;
    }

    /* renamed from: b */
    public static /* synthetic */ C37250b m109986b(C37250b bVar, C18596a aVar, C18596a aVar2, C18596a aVar3, C37249a aVar4, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = bVar.f89676a;
        }
        if ((i & 2) != 0) {
            aVar2 = bVar.f89677b;
        }
        C18596a aVar5 = aVar2;
        if ((i & 4) != 0) {
            aVar3 = bVar.f89678c;
        }
        C18596a aVar6 = aVar3;
        if ((i & 8) != 0) {
            aVar4 = bVar.f89679d;
        }
        C37249a aVar7 = aVar4;
        if ((i & 16) != 0) {
            str = bVar.f89680e;
        }
        return bVar.mo90322a(aVar, aVar5, aVar6, aVar7, str);
    }

    /* renamed from: a */
    public final C37250b mo90322a(C18596a aVar, C18596a aVar2, C18596a aVar3, C37249a aVar4, String str) {
        C41536l.m120489i(aVar, "faceScanState");
        C41536l.m120489i(aVar2, "documentScanState");
        C41536l.m120489i(aVar3, "dataProcessingState");
        C41536l.m120489i(aVar4, "nextStep");
        return new C37250b(aVar, aVar2, aVar3, aVar4, str);
    }

    /* renamed from: c */
    public final C18596a mo90323c() {
        return this.f89678c;
    }

    /* renamed from: d */
    public final C18596a mo90324d() {
        return this.f89677b;
    }

    /* renamed from: e */
    public final String mo90325e() {
        return this.f89680e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37250b)) {
            return false;
        }
        C37250b bVar = (C37250b) obj;
        return this.f89676a == bVar.f89676a && this.f89677b == bVar.f89677b && this.f89678c == bVar.f89678c && this.f89679d == bVar.f89679d && C41536l.m120484d(this.f89680e, bVar.f89680e);
    }

    /* renamed from: f */
    public final C18596a mo90327f() {
        return this.f89676a;
    }

    /* renamed from: g */
    public final C37249a mo90328g() {
        return this.f89679d;
    }

    public int hashCode() {
        int hashCode = ((((((this.f89676a.hashCode() * 31) + this.f89677b.hashCode()) * 31) + this.f89678c.hashCode()) * 31) + this.f89679d.hashCode()) * 31;
        String str = this.f89680e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IdentificationProgressState(faceScanState=" + this.f89676a + ", documentScanState=" + this.f89677b + ", dataProcessingState=" + this.f89678c + ", nextStep=" + this.f89679d + ", errorText=" + this.f89680e + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37250b(p656wi.C18596a r4, p656wi.C18596a r5, p656wi.C18596a r6, mb1.C37249a r7, java.lang.String r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            wi.a r4 = p656wi.C18596a.CLEAR
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            wi.a r5 = p656wi.C18596a.CLEAR
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            wi.a r6 = p656wi.C18596a.CLEAR
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            mb1.a r7 = mb1.C37249a.RETRY
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0020
            r8 = 0
        L_0x0020:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mb1.C37250b.<init>(wi.a, wi.a, wi.a, mb1.a, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
