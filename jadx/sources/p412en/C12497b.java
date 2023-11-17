package p412en;

import com.salesforce.marketingcloud.C11398b;
import he1.C41232r;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel;
import p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p537nm.C17081e0;
import p537nm.C17085g0;
import p537nm.C17107x;
import p537nm.C17108y;

/* renamed from: en.b */
public final class C12497b {

    /* renamed from: a */
    private final String f37233a;

    /* renamed from: b */
    private final String f37234b;

    /* renamed from: c */
    private final String f37235c;

    /* renamed from: d */
    private final C17108y f37236d;

    /* renamed from: e */
    private final boolean f37237e;

    /* renamed from: f */
    private final C17107x f37238f;

    /* renamed from: g */
    private final String f37239g;

    /* renamed from: h */
    private final CardAccountSelectorUiModel f37240h;

    /* renamed from: i */
    private final DebitCardCommissionUiModel f37241i;

    public C12497b(String str, String str2, String str3, C17108y yVar, boolean z, C17107x xVar, String str4, CardAccountSelectorUiModel cardAccountSelectorUiModel, DebitCardCommissionUiModel debitCardCommissionUiModel) {
        this.f37233a = str;
        this.f37234b = str2;
        this.f37235c = str3;
        this.f37236d = yVar;
        this.f37237e = z;
        this.f37238f = xVar;
        this.f37239g = str4;
        this.f37240h = cardAccountSelectorUiModel;
        this.f37241i = debitCardCommissionUiModel;
    }

    /* renamed from: b */
    public static /* synthetic */ C12497b m47532b(C12497b bVar, String str, String str2, String str3, C17108y yVar, boolean z, C17107x xVar, String str4, CardAccountSelectorUiModel cardAccountSelectorUiModel, DebitCardCommissionUiModel debitCardCommissionUiModel, int i, Object obj) {
        C12497b bVar2 = bVar;
        int i2 = i;
        return bVar.mo33103a((i2 & 1) != 0 ? bVar2.f37233a : str, (i2 & 2) != 0 ? bVar2.f37234b : str2, (i2 & 4) != 0 ? bVar2.f37235c : str3, (i2 & 8) != 0 ? bVar2.f37236d : yVar, (i2 & 16) != 0 ? bVar2.f37237e : z, (i2 & 32) != 0 ? bVar2.f37238f : xVar, (i2 & 64) != 0 ? bVar2.f37239g : str4, (i2 & 128) != 0 ? bVar2.f37240h : cardAccountSelectorUiModel, (i2 & C11398b.f33139r) != 0 ? bVar2.f37241i : debitCardCommissionUiModel);
    }

    /* renamed from: a */
    public final C12497b mo33103a(String str, String str2, String str3, C17108y yVar, boolean z, C17107x xVar, String str4, CardAccountSelectorUiModel cardAccountSelectorUiModel, DebitCardCommissionUiModel debitCardCommissionUiModel) {
        return new C12497b(str, str2, str3, yVar, z, xVar, str4, cardAccountSelectorUiModel, debitCardCommissionUiModel);
    }

    /* renamed from: c */
    public final C41232r mo33104c() {
        String str;
        String valueOf = String.valueOf(this.f37233a);
        String valueOf2 = String.valueOf(this.f37234b);
        String str2 = this.f37235c;
        String str3 = null;
        if (str2 != null) {
            str = str2.substring(0, 3);
            C41536l.m120488h(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = null;
        }
        String str4 = this.f37235c;
        if (str4 != null) {
            str3 = str4.substring(3);
            C41536l.m120488h(str3, "this as java.lang.String).substring(startIndex)");
        }
        return new C41232r(valueOf, valueOf2, str + BankApiResponse.INVALID_SESSION_CODE_OTHER + str3);
    }

    /* renamed from: d */
    public final DebitCardCommissionUiModel mo33105d() {
        return this.f37241i;
    }

    /* renamed from: e */
    public final boolean mo33106e() {
        return this.f37237e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12497b)) {
            return false;
        }
        C12497b bVar = (C12497b) obj;
        return C41536l.m120484d(this.f37233a, bVar.f37233a) && C41536l.m120484d(this.f37234b, bVar.f37234b) && C41536l.m120484d(this.f37235c, bVar.f37235c) && C41536l.m120484d(this.f37236d, bVar.f37236d) && this.f37237e == bVar.f37237e && C41536l.m120484d(this.f37238f, bVar.f37238f) && C41536l.m120484d(this.f37239g, bVar.f37239g) && C41536l.m120484d(this.f37240h, bVar.f37240h) && C41536l.m120484d(this.f37241i, bVar.f37241i);
    }

    /* renamed from: f */
    public final CardAccountSelectorUiModel mo33108f() {
        return this.f37240h;
    }

    /* renamed from: g */
    public final String mo33109g() {
        return this.f37239g;
    }

    /* renamed from: h */
    public final C17107x mo33110h() {
        return this.f37238f;
    }

    public int hashCode() {
        String str = this.f37233a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f37234b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f37235c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C17108y yVar = this.f37236d;
        int hashCode4 = (hashCode3 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        boolean z = this.f37237e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode4 + (z ? 1 : 0)) * 31;
        C17107x xVar = this.f37238f;
        int hashCode5 = (i2 + (xVar == null ? 0 : xVar.hashCode())) * 31;
        String str4 = this.f37239g;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        CardAccountSelectorUiModel cardAccountSelectorUiModel = this.f37240h;
        int hashCode7 = (hashCode6 + (cardAccountSelectorUiModel == null ? 0 : cardAccountSelectorUiModel.hashCode())) * 31;
        DebitCardCommissionUiModel debitCardCommissionUiModel = this.f37241i;
        if (debitCardCommissionUiModel != null) {
            i = debitCardCommissionUiModel.hashCode();
        }
        return hashCode7 + i;
    }

    /* renamed from: i */
    public final C17108y mo33112i() {
        return this.f37236d;
    }

    /* renamed from: j */
    public final boolean mo33113j() {
        C17081e0 e0Var;
        boolean z;
        C17108y yVar = this.f37236d;
        if (yVar == null || this.f37241i == null) {
            return false;
        }
        if (yVar.mo44517b() == C17085g0.EXISTING_ACCOUNT && this.f37240h == null) {
            return false;
        }
        C17107x xVar = this.f37238f;
        if (xVar != null) {
            e0Var = xVar.mo44509a();
        } else {
            e0Var = null;
        }
        if (e0Var == C17081e0.SMS) {
            String str = this.f37239g;
            if (str == null || C40439w.m117118v(str)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str = this.f37233a;
        String str2 = this.f37234b;
        String str3 = this.f37235c;
        C17108y yVar = this.f37236d;
        boolean z = this.f37237e;
        C17107x xVar = this.f37238f;
        String str4 = this.f37239g;
        CardAccountSelectorUiModel cardAccountSelectorUiModel = this.f37240h;
        DebitCardCommissionUiModel debitCardCommissionUiModel = this.f37241i;
        return "InstantCardActivationInput(pan=" + str + ", cvv=" + str2 + ", expDate=" + str3 + ", regType=" + yVar + ", hasRegTypeOptions=" + z + ", pinDeliveryType=" + xVar + ", pinDeliveryPhone=" + str4 + ", mainAcc=" + cardAccountSelectorUiModel + ", fee=" + debitCardCommissionUiModel + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C12497b(java.lang.String r11, java.lang.String r12, java.lang.String r13, p537nm.C17108y r14, boolean r15, p537nm.C17107x r16, java.lang.String r17, p341ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel r18, p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r10 = this;
            r0 = r20
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r11
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r12
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r13
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x001f
        L_0x001e:
            r5 = r14
        L_0x001f:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0025
            r6 = 0
            goto L_0x0026
        L_0x0025:
            r6 = r15
        L_0x0026:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r16
        L_0x002e:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r17
        L_0x0036:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003c
            r9 = r2
            goto L_0x003e
        L_0x003c:
            r9 = r18
        L_0x003e:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r2 = r19
        L_0x0045:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r7
            r18 = r8
            r19 = r9
            r20 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p412en.C12497b.<init>(java.lang.String, java.lang.String, java.lang.String, nm.y, boolean, nm.x, java.lang.String, ge.bog.mobilebank.shared.cardaccountselector.presentation.model.CardAccountSelectorUiModel, ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCommissionUiModel, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
