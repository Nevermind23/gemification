package p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.model.AdditionalFunctionType;

/* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a */
public final class C14391a {

    /* renamed from: e */
    public static final C14392a f42131e = new C14392a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C14391a f42132f = new C14391a(AdditionalFunctionType.ActivateScoolApp.f42121k, false, true, false);

    /* renamed from: a */
    private final AdditionalFunctionType f42133a;

    /* renamed from: b */
    private final boolean f42134b;

    /* renamed from: c */
    private final boolean f42135c;

    /* renamed from: d */
    private final boolean f42136d;

    /* renamed from: ge.bog.mobilebank.cardproducts.presentation.carddetail.model.a$a */
    public static final class C14392a {
        private C14392a() {
        }

        public /* synthetic */ C14392a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C14391a mo40257a() {
            return C14391a.f42132f;
        }

        /* renamed from: b */
        public final C14391a mo40258b() {
            return new C14391a(AdditionalFunctionType.GooglePay.f42125k, false, false, false, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: c */
        public final C14391a mo40259c() {
            return new C14391a(AdditionalFunctionType.CardAdvantages.f42122k, false, false, false, 8, (DefaultConstructorMarker) null);
        }

        /* renamed from: d */
        public final C14391a mo40260d() {
            return new C14391a(AdditionalFunctionType.CloseCard.f42123k, false, false, false, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: e */
        public final C14391a mo40261e() {
            return new C14391a(new AdditionalFunctionType.FinancialNumber(""), false, false, false, 8, (DefaultConstructorMarker) null);
        }

        /* renamed from: f */
        public final C14391a mo40262f() {
            return new C14391a(AdditionalFunctionType.Insurance.f42126k, false, false, false, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: g */
        public final C14391a mo40263g() {
            return new C14391a(AdditionalFunctionType.PaymentsControl.f42127k, false, false, false, 12, (DefaultConstructorMarker) null);
        }

        /* renamed from: h */
        public final C14391a mo40264h() {
            return new C14391a(AdditionalFunctionType.RecoverCard.f42128k, false, false, false, 8, (DefaultConstructorMarker) null);
        }

        /* renamed from: i */
        public final C14391a mo40265i() {
            return new C14391a(AdditionalFunctionType.Security.f42130k, false, false, false, 12, (DefaultConstructorMarker) null);
        }
    }

    public C14391a(AdditionalFunctionType additionalFunctionType, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(additionalFunctionType, "type");
        this.f42133a = additionalFunctionType;
        this.f42134b = z;
        this.f42135c = z2;
        this.f42136d = z3;
    }

    /* renamed from: c */
    public static /* synthetic */ C14391a m53292c(C14391a aVar, AdditionalFunctionType additionalFunctionType, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            additionalFunctionType = aVar.f42133a;
        }
        if ((i & 2) != 0) {
            z = aVar.f42134b;
        }
        if ((i & 4) != 0) {
            z2 = aVar.f42135c;
        }
        if ((i & 8) != 0) {
            z3 = aVar.f42136d;
        }
        return aVar.mo40249b(additionalFunctionType, z, z2, z3);
    }

    /* renamed from: b */
    public final C14391a mo40249b(AdditionalFunctionType additionalFunctionType, boolean z, boolean z2, boolean z3) {
        C41536l.m120489i(additionalFunctionType, "type");
        return new C14391a(additionalFunctionType, z, z2, z3);
    }

    /* renamed from: d */
    public final boolean mo40250d() {
        return this.f42134b;
    }

    /* renamed from: e */
    public final boolean mo40251e() {
        return this.f42136d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14391a)) {
            return false;
        }
        C14391a aVar = (C14391a) obj;
        return C41536l.m120484d(this.f42133a, aVar.f42133a) && this.f42134b == aVar.f42134b && this.f42135c == aVar.f42135c && this.f42136d == aVar.f42136d;
    }

    /* renamed from: f */
    public final boolean mo40253f() {
        return this.f42135c;
    }

    /* renamed from: g */
    public final AdditionalFunctionType mo40254g() {
        return this.f42133a;
    }

    public int hashCode() {
        int hashCode = this.f42133a.hashCode() * 31;
        boolean z = this.f42134b;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.f42135c;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f42136d;
        if (!z4) {
            z2 = z4;
        }
        return i2 + (z2 ? 1 : 0);
    }

    public String toString() {
        AdditionalFunctionType additionalFunctionType = this.f42133a;
        boolean z = this.f42134b;
        boolean z2 = this.f42135c;
        boolean z3 = this.f42136d;
        return "AdditionalFunctionUIModel(type=" + additionalFunctionType + ", active=" + z + ", separatorVisible=" + z2 + ", hasTint=" + z3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14391a(AdditionalFunctionType additionalFunctionType, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(additionalFunctionType, z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? true : z3);
    }
}
