package p381cl;

import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p563pk.C17379i;

/* renamed from: cl.l */
public final class C10496l {

    /* renamed from: a */
    private final String f29832a;

    /* renamed from: b */
    private final String f29833b;

    /* renamed from: c */
    private final String f29834c;

    /* renamed from: d */
    private final C17379i f29835d;

    /* renamed from: e */
    private final String f29836e;

    /* renamed from: f */
    private final CreditCardSmallPickerView.C13279b.C13281b f29837f;

    /* renamed from: g */
    private final boolean f29838g;

    public C10496l(String str, String str2, String str3, C17379i iVar, String str4, CreditCardSmallPickerView.C13279b.C13281b bVar) {
        boolean z;
        C41536l.m120489i(str, "annualPayment");
        C41536l.m120489i(str2, "monthlyPayment");
        C41536l.m120489i(iVar, "paymentMethod");
        C41536l.m120489i(str4, "payDay");
        this.f29832a = str;
        this.f29833b = str2;
        this.f29834c = str3;
        this.f29835d = iVar;
        this.f29836e = str4;
        this.f29837f = bVar;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        this.f29838g = z;
    }

    /* renamed from: a */
    public final String mo27208a() {
        return this.f29832a;
    }

    /* renamed from: b */
    public final String mo27209b() {
        return this.f29834c;
    }

    /* renamed from: c */
    public final String mo27210c() {
        return this.f29833b;
    }

    /* renamed from: d */
    public final String mo27211d() {
        return this.f29836e;
    }

    /* renamed from: e */
    public final C17379i mo27212e() {
        return this.f29835d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10496l)) {
            return false;
        }
        C10496l lVar = (C10496l) obj;
        return C41536l.m120484d(this.f29832a, lVar.f29832a) && C41536l.m120484d(this.f29833b, lVar.f29833b) && C41536l.m120484d(this.f29834c, lVar.f29834c) && this.f29835d == lVar.f29835d && C41536l.m120484d(this.f29836e, lVar.f29836e) && C41536l.m120484d(this.f29837f, lVar.f29837f);
    }

    /* renamed from: f */
    public final CreditCardSmallPickerView.C13279b.C13281b mo27214f() {
        return this.f29837f;
    }

    /* renamed from: g */
    public final boolean mo27215g() {
        return this.f29838g;
    }

    public int hashCode() {
        int hashCode = ((this.f29832a.hashCode() * 31) + this.f29833b.hashCode()) * 31;
        String str = this.f29834c;
        int i = 0;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f29835d.hashCode()) * 31) + this.f29836e.hashCode()) * 31;
        CreditCardSmallPickerView.C13279b.C13281b bVar = this.f29837f;
        if (bVar != null) {
            i = bVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String str = this.f29832a;
        String str2 = this.f29833b;
        String str3 = this.f29834c;
        C17379i iVar = this.f29835d;
        String str4 = this.f29836e;
        CreditCardSmallPickerView.C13279b.C13281b bVar = this.f29837f;
        return "RegisterMtplPolicyUiState(annualPayment=" + str + ", monthlyPayment=" + str2 + ", firstMonthPayment=" + str3 + ", paymentMethod=" + iVar + ", payDay=" + str4 + ", selectedCard=" + bVar + ")";
    }
}
