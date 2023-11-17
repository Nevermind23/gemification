package os0;

import com.salesforce.marketingcloud.C11398b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import z11.C40140b;

/* renamed from: os0.b */
public final class C37725b {

    /* renamed from: a */
    private final C37727c f90619a;

    /* renamed from: b */
    private final StringSource f90620b;

    /* renamed from: c */
    private final String f90621c;

    /* renamed from: d */
    private final boolean f90622d;

    /* renamed from: e */
    private final boolean f90623e;

    /* renamed from: f */
    private final boolean f90624f;

    /* renamed from: g */
    private final BigDecimal f90625g;

    /* renamed from: h */
    private final String f90626h;

    /* renamed from: i */
    private final C40140b f90627i;

    /* renamed from: j */
    private final List f90628j;

    /* renamed from: k */
    private final List f90629k;

    /* renamed from: l */
    private final OfferedPlanTypesUiModel f90630l;

    /* renamed from: m */
    private final boolean f90631m;

    /* renamed from: os0.b$a */
    public /* synthetic */ class C37726a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f90632a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                os0.c[] r0 = os0.C37727c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                os0.c r1 = os0.C37727c.PART     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                os0.c r1 = os0.C37727c.FULL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                os0.c r1 = os0.C37727c.ONLY_FULL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f90632a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: os0.C37725b.C37726a.<clinit>():void");
        }
    }

    public C37725b(C37727c cVar, StringSource stringSource, String str, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, String str2, C40140b bVar, List list, List list2, OfferedPlanTypesUiModel offeredPlanTypesUiModel, boolean z4) {
        C41536l.m120489i(cVar, "type");
        C41536l.m120489i(stringSource, "title");
        C41536l.m120489i(list, "details");
        C41536l.m120489i(list2, "offeredPlanTypes");
        this.f90619a = cVar;
        this.f90620b = stringSource;
        this.f90621c = str;
        this.f90622d = z;
        this.f90623e = z2;
        this.f90624f = z3;
        this.f90625g = bigDecimal;
        this.f90626h = str2;
        this.f90627i = bVar;
        this.f90628j = list;
        this.f90629k = list2;
        this.f90630l = offeredPlanTypesUiModel;
        this.f90631m = z4;
    }

    /* renamed from: b */
    public static /* synthetic */ C37725b m110886b(C37725b bVar, C37727c cVar, StringSource stringSource, String str, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, String str2, C40140b bVar2, List list, List list2, OfferedPlanTypesUiModel offeredPlanTypesUiModel, boolean z4, int i, Object obj) {
        C37725b bVar3 = bVar;
        int i2 = i;
        return bVar.mo90968a((i2 & 1) != 0 ? bVar3.f90619a : cVar, (i2 & 2) != 0 ? bVar3.f90620b : stringSource, (i2 & 4) != 0 ? bVar3.f90621c : str, (i2 & 8) != 0 ? bVar3.f90622d : z, (i2 & 16) != 0 ? bVar3.f90623e : z2, (i2 & 32) != 0 ? bVar3.f90624f : z3, (i2 & 64) != 0 ? bVar3.f90625g : bigDecimal, (i2 & 128) != 0 ? bVar3.f90626h : str2, (i2 & C11398b.f33139r) != 0 ? bVar3.f90627i : bVar2, (i2 & C11398b.f33140s) != 0 ? bVar3.f90628j : list, (i2 & C11398b.f33141t) != 0 ? bVar3.f90629k : list2, (i2 & C11398b.f33142u) != 0 ? bVar3.f90630l : offeredPlanTypesUiModel, (i2 & C11398b.f33143v) != 0 ? bVar3.f90631m : z4);
    }

    /* renamed from: a */
    public final C37725b mo90968a(C37727c cVar, StringSource stringSource, String str, boolean z, boolean z2, boolean z3, BigDecimal bigDecimal, String str2, C40140b bVar, List list, List list2, OfferedPlanTypesUiModel offeredPlanTypesUiModel, boolean z4) {
        C37727c cVar2 = cVar;
        C41536l.m120489i(cVar2, "type");
        StringSource stringSource2 = stringSource;
        C41536l.m120489i(stringSource2, "title");
        List list3 = list;
        C41536l.m120489i(list3, "details");
        List list4 = list2;
        C41536l.m120489i(list4, "offeredPlanTypes");
        return new C37725b(cVar2, stringSource2, str, z, z2, z3, bigDecimal, str2, bVar, list3, list4, offeredPlanTypesUiModel, z4);
    }

    /* renamed from: c */
    public final boolean mo90969c() {
        return this.f90631m;
    }

    /* renamed from: d */
    public final List mo90970d() {
        return this.f90628j;
    }

    /* renamed from: e */
    public final List mo90971e() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (this.f90619a == C37727c.PART) {
            String str = this.f90621c;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(C37724a.AMOUNT);
            }
        }
        if ((!this.f90629k.isEmpty()) && this.f90630l == null) {
            arrayList.add(C37724a.PLAN_TYPE);
        }
        if (!this.f90622d) {
            arrayList.add(C37724a.TERMS);
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37725b)) {
            return false;
        }
        C37725b bVar = (C37725b) obj;
        return this.f90619a == bVar.f90619a && C41536l.m120484d(this.f90620b, bVar.f90620b) && C41536l.m120484d(this.f90621c, bVar.f90621c) && this.f90622d == bVar.f90622d && this.f90623e == bVar.f90623e && this.f90624f == bVar.f90624f && C41536l.m120484d(this.f90625g, bVar.f90625g) && C41536l.m120484d(this.f90626h, bVar.f90626h) && C41536l.m120484d(this.f90627i, bVar.f90627i) && C41536l.m120484d(this.f90628j, bVar.f90628j) && C41536l.m120484d(this.f90629k, bVar.f90629k) && C41536l.m120484d(this.f90630l, bVar.f90630l) && this.f90631m == bVar.f90631m;
    }

    /* renamed from: f */
    public final List mo90973f() {
        return this.f90629k;
    }

    /* renamed from: g */
    public final String mo90974g() {
        return this.f90621c;
    }

    /* renamed from: h */
    public final boolean mo90975h() {
        return this.f90624f;
    }

    public int hashCode() {
        int hashCode = ((this.f90619a.hashCode() * 31) + this.f90620b.hashCode()) * 31;
        String str = this.f90621c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z = this.f90622d;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.f90623e;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f90624f;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        BigDecimal bigDecimal = this.f90625g;
        int hashCode3 = (i4 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        String str2 = this.f90626h;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C40140b bVar = this.f90627i;
        int hashCode5 = (((((hashCode4 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f90628j.hashCode()) * 31) + this.f90629k.hashCode()) * 31;
        OfferedPlanTypesUiModel offeredPlanTypesUiModel = this.f90630l;
        if (offeredPlanTypesUiModel != null) {
            i = offeredPlanTypesUiModel.hashCode();
        }
        int i5 = (hashCode5 + i) * 31;
        boolean z5 = this.f90631m;
        if (!z5) {
            z2 = z5;
        }
        return i5 + (z2 ? 1 : 0);
    }

    /* renamed from: i */
    public final boolean mo90977i() {
        return this.f90623e;
    }

    /* renamed from: j */
    public final String mo90978j() {
        int i = C37726a.f90632a[this.f90619a.ordinal()];
        if (i == 1) {
            return "N";
        }
        if (i == 2 || i == 3) {
            return "Y";
        }
        return null;
    }

    /* renamed from: k */
    public final C40140b mo90979k() {
        return this.f90627i;
    }

    /* renamed from: l */
    public final OfferedPlanTypesUiModel mo90980l() {
        return this.f90630l;
    }

    /* renamed from: m */
    public final BigDecimal mo90981m() {
        return this.f90625g;
    }

    /* renamed from: n */
    public final String mo90982n() {
        return this.f90626h;
    }

    /* renamed from: o */
    public final StringSource mo90983o() {
        return this.f90620b;
    }

    /* renamed from: p */
    public final C37727c mo90984p() {
        return this.f90619a;
    }

    /* renamed from: q */
    public final boolean mo90985q() {
        boolean z;
        if (this.f90619a == C37727c.NONE) {
            return false;
        }
        if (!this.f90629k.isEmpty() && this.f90630l == null) {
            return false;
        }
        if (this.f90619a == C37727c.PART) {
            String str = this.f90621c;
            if (str == null || str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        if (this.f90622d) {
            return true;
        }
        return false;
    }

    public String toString() {
        C37727c cVar = this.f90619a;
        StringSource stringSource = this.f90620b;
        String str = this.f90621c;
        boolean z = this.f90622d;
        boolean z2 = this.f90623e;
        boolean z3 = this.f90624f;
        BigDecimal bigDecimal = this.f90625g;
        String str2 = this.f90626h;
        C40140b bVar = this.f90627i;
        List list = this.f90628j;
        List list2 = this.f90629k;
        OfferedPlanTypesUiModel offeredPlanTypesUiModel = this.f90630l;
        boolean z4 = this.f90631m;
        return "PrepaymentModel(type=" + cVar + ", title=" + stringSource + ", partAmount=" + str + ", termsChecked=" + z + ", paymentLoading=" + z2 + ", partDetailsLoading=" + z3 + ", sumAmount=" + bigDecimal + ", sumAmountCurr=" + str2 + ", selectedAccount=" + bVar + ", details=" + list + ", offeredPlanTypes=" + list2 + ", selectedPlanType=" + offeredPlanTypesUiModel + ", canScrollUp=" + z4 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C37725b(os0.C37727c r15, p341ge.bog.mobilebank.shared.helper.StringSource r16, java.lang.String r17, boolean r18, boolean r19, boolean r20, java.math.BigDecimal r21, java.lang.String r22, z11.C40140b r23, java.util.List r24, java.util.List r25, p341ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel r26, boolean r27, int r28, kotlin.jvm.internal.DefaultConstructorMarker r29) {
        /*
            r14 = this;
            r0 = r28
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000e
            ge.bog.mobilebank.shared.helper.StringSource$Raw r1 = new ge.bog.mobilebank.shared.helper.StringSource$Raw
            java.lang.String r2 = ""
            r1.<init>(r2)
            goto L_0x0010
        L_0x000e:
            r1 = r16
        L_0x0010:
            r2 = r0 & 4
            r3 = 0
            if (r2 == 0) goto L_0x0017
            r2 = r3
            goto L_0x0019
        L_0x0017:
            r2 = r17
        L_0x0019:
            r4 = r0 & 8
            r5 = 0
            if (r4 == 0) goto L_0x0020
            r4 = r5
            goto L_0x0022
        L_0x0020:
            r4 = r18
        L_0x0022:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0028
            r6 = r5
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0030
            r7 = r5
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0038
            r8 = r3
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r3
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r3
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0053
            java.util.List r11 = ie1.C41341q.m119907j()
            goto L_0x0055
        L_0x0053:
            r11 = r24
        L_0x0055:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            java.util.List r12 = ie1.C41341q.m119907j()
            goto L_0x0060
        L_0x005e:
            r12 = r25
        L_0x0060:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0065
            goto L_0x0067
        L_0x0065:
            r3 = r26
        L_0x0067:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r5 = r27
        L_0x006e:
            r16 = r14
            r17 = r15
            r18 = r1
            r19 = r2
            r20 = r4
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r12
            r28 = r3
            r29 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: os0.C37725b.<init>(os0.c, ge.bog.mobilebank.shared.helper.StringSource, java.lang.String, boolean, boolean, boolean, java.math.BigDecimal, java.lang.String, z11.b, java.util.List, java.util.List, ge.bog.mobilebank.loans.presentation.model.OfferedPlanTypesUiModel, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
