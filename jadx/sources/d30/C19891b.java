package d30;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.account.AccountLov;

/* renamed from: d30.b */
public final class C19891b {

    /* renamed from: a */
    private final BigDecimal f54389a;

    /* renamed from: b */
    private final AccountLov f54390b;

    /* renamed from: c */
    private final String f54391c;

    /* renamed from: d */
    private final BigDecimal f54392d;

    /* renamed from: e */
    private final int f54393e;

    public C19891b(BigDecimal bigDecimal, AccountLov accountLov, String str, BigDecimal bigDecimal2, int i) {
        C41536l.m120489i(bigDecimal, "requestedAmount");
        C41536l.m120489i(str, "comment");
        C41536l.m120489i(bigDecimal2, "totalRequestedAmount");
        this.f54389a = bigDecimal;
        this.f54390b = accountLov;
        this.f54391c = str;
        this.f54392d = bigDecimal2;
        this.f54393e = i;
    }

    /* renamed from: b */
    public static /* synthetic */ C19891b m65743b(C19891b bVar, BigDecimal bigDecimal, AccountLov accountLov, String str, BigDecimal bigDecimal2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            bigDecimal = bVar.f54389a;
        }
        if ((i2 & 2) != 0) {
            accountLov = bVar.f54390b;
        }
        AccountLov accountLov2 = accountLov;
        if ((i2 & 4) != 0) {
            str = bVar.f54391c;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            bigDecimal2 = bVar.f54392d;
        }
        BigDecimal bigDecimal3 = bigDecimal2;
        if ((i2 & 16) != 0) {
            i = bVar.f54393e;
        }
        return bVar.mo48233a(bigDecimal, accountLov2, str2, bigDecimal3, i);
    }

    /* renamed from: a */
    public final C19891b mo48233a(BigDecimal bigDecimal, AccountLov accountLov, String str, BigDecimal bigDecimal2, int i) {
        C41536l.m120489i(bigDecimal, "requestedAmount");
        C41536l.m120489i(str, "comment");
        C41536l.m120489i(bigDecimal2, "totalRequestedAmount");
        return new C19891b(bigDecimal, accountLov, str, bigDecimal2, i);
    }

    /* renamed from: c */
    public final int mo48234c() {
        return this.f54393e;
    }

    /* renamed from: d */
    public final String mo48235d() {
        return this.f54391c;
    }

    /* renamed from: e */
    public final AccountLov mo48236e() {
        return this.f54390b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19891b)) {
            return false;
        }
        C19891b bVar = (C19891b) obj;
        return C41536l.m120484d(this.f54389a, bVar.f54389a) && C41536l.m120484d(this.f54390b, bVar.f54390b) && C41536l.m120484d(this.f54391c, bVar.f54391c) && C41536l.m120484d(this.f54392d, bVar.f54392d) && this.f54393e == bVar.f54393e;
    }

    /* renamed from: f */
    public final BigDecimal mo48238f() {
        return this.f54389a;
    }

    /* renamed from: g */
    public final BigDecimal mo48239g() {
        return this.f54392d;
    }

    public int hashCode() {
        int hashCode = this.f54389a.hashCode() * 31;
        AccountLov accountLov = this.f54390b;
        return ((((((hashCode + (accountLov == null ? 0 : accountLov.hashCode())) * 31) + this.f54391c.hashCode()) * 31) + this.f54392d.hashCode()) * 31) + this.f54393e;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f54389a;
        AccountLov accountLov = this.f54390b;
        String str = this.f54391c;
        BigDecimal bigDecimal2 = this.f54392d;
        int i = this.f54393e;
        return "MoneyRequestDetails(requestedAmount=" + bigDecimal + ", receiverAccount=" + accountLov + ", comment=" + str + ", totalRequestedAmount=" + bigDecimal2 + ", addresseeCount=" + i + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C19891b(java.math.BigDecimal r4, p341ge.bog.mobilebank.model.account.AccountLov r5, java.lang.String r6, java.math.BigDecimal r7, int r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L_0x000b
            java.math.BigDecimal r4 = new java.math.BigDecimal
            r4.<init>(r0)
        L_0x000b:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x0010
            r5 = 0
        L_0x0010:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            java.lang.String r6 = ""
        L_0x0017:
            r2 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0021
            java.math.BigDecimal r7 = new java.math.BigDecimal
            r7.<init>(r0)
        L_0x0021:
            r0 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0027
            r8 = 0
        L_0x0027:
            r1 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r2
            r9 = r0
            r10 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d30.C19891b.<init>(java.math.BigDecimal, ge.bog.mobilebank.model.account.AccountLov, java.lang.String, java.math.BigDecimal, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
