package r01;

import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import m41.C37223a;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData;

/* renamed from: r01.a */
public final class C38272a {

    /* renamed from: a */
    private final BigDecimal f91766a;

    /* renamed from: b */
    private final String f91767b;

    /* renamed from: c */
    private final List f91768c;

    /* renamed from: d */
    private final String f91769d;

    /* renamed from: e */
    private final CardData f91770e;

    /* renamed from: f */
    private final C37223a f91771f;

    public C38272a(BigDecimal bigDecimal, String str, List list, String str2, CardData cardData, C37223a aVar) {
        C41536l.m120489i(bigDecimal, "inputAmount");
        C41536l.m120489i(str, "selectedCcy");
        C41536l.m120489i(list, "availableAmounts");
        this.f91766a = bigDecimal;
        this.f91767b = str;
        this.f91768c = list;
        this.f91769d = str2;
        this.f91770e = cardData;
        this.f91771f = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C38272a m112516b(C38272a aVar, BigDecimal bigDecimal, String str, List list, String str2, CardData cardData, C37223a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = aVar.f91766a;
        }
        if ((i & 2) != 0) {
            str = aVar.f91767b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            list = aVar.f91768c;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            str2 = aVar.f91769d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            cardData = aVar.f91770e;
        }
        CardData cardData2 = cardData;
        if ((i & 32) != 0) {
            aVar2 = aVar.f91771f;
        }
        return aVar.mo91814a(bigDecimal, str3, list2, str4, cardData2, aVar2);
    }

    /* renamed from: a */
    public final C38272a mo91814a(BigDecimal bigDecimal, String str, List list, String str2, CardData cardData, C37223a aVar) {
        C41536l.m120489i(bigDecimal, "inputAmount");
        C41536l.m120489i(str, "selectedCcy");
        C41536l.m120489i(list, "availableAmounts");
        return new C38272a(bigDecimal, str, list, str2, cardData, aVar);
    }

    /* renamed from: c */
    public final List mo91815c() {
        return this.f91768c;
    }

    /* renamed from: d */
    public final CardData mo91816d() {
        return this.f91770e;
    }

    /* renamed from: e */
    public final String mo91817e() {
        return this.f91769d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38272a)) {
            return false;
        }
        C38272a aVar = (C38272a) obj;
        return C41536l.m120484d(this.f91766a, aVar.f91766a) && C41536l.m120484d(this.f91767b, aVar.f91767b) && C41536l.m120484d(this.f91768c, aVar.f91768c) && C41536l.m120484d(this.f91769d, aVar.f91769d) && C41536l.m120484d(this.f91770e, aVar.f91770e) && C41536l.m120484d(this.f91771f, aVar.f91771f);
    }

    /* renamed from: f */
    public final BigDecimal mo91819f() {
        return this.f91766a;
    }

    /* renamed from: g */
    public final String mo91820g() {
        return this.f91767b;
    }

    public int hashCode() {
        int hashCode = ((((this.f91766a.hashCode() * 31) + this.f91767b.hashCode()) * 31) + this.f91768c.hashCode()) * 31;
        String str = this.f91769d;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CardData cardData = this.f91770e;
        int hashCode3 = (hashCode2 + (cardData == null ? 0 : cardData.hashCode())) * 31;
        C37223a aVar = this.f91771f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f91766a;
        String str = this.f91767b;
        List list = this.f91768c;
        String str2 = this.f91769d;
        CardData cardData = this.f91770e;
        C37223a aVar = this.f91771f;
        return "UiState(inputAmount=" + bigDecimal + ", selectedCcy=" + str + ", availableAmounts=" + list + ", dailyLimit=" + str2 + ", card=" + cardData + ", error=" + aVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C38272a(java.math.BigDecimal r8, java.lang.String r9, java.util.List r10, java.lang.String r11, p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData r12, m41.C37223a r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r7 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L_0x000b
            java.math.BigDecimal r8 = java.math.BigDecimal.ZERO
            java.lang.String r15 = "ZERO"
            kotlin.jvm.internal.C41536l.m120488h(r8, r15)
        L_0x000b:
            r1 = r8
            r8 = r14 & 32
            if (r8 == 0) goto L_0x0011
            r13 = 0
        L_0x0011:
            r6 = r13
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r01.C38272a.<init>(java.math.BigDecimal, java.lang.String, java.util.List, java.lang.String, ge.bog.mobilebank.qrwithdrawal.presentation.model.CardData, m41.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
