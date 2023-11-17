package kk0;

import ek0.C20262b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.creditcard.CreditCardView;

/* renamed from: kk0.a */
public final class C25741a {

    /* renamed from: a */
    private final String f65509a;

    /* renamed from: b */
    private final String f65510b;

    /* renamed from: c */
    private final String f65511c;

    /* renamed from: d */
    private final CreditCardView.C13270b f65512d;

    /* renamed from: e */
    private final String f65513e;

    /* renamed from: f */
    private final C20262b f65514f;

    public C25741a(String str, String str2, String str3, CreditCardView.C13270b bVar, String str4, C20262b bVar2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "cardId");
        C41536l.m120489i(str3, "subProductCode");
        C41536l.m120489i(bVar, "creditCard");
        C41536l.m120489i(str4, "cardClassCode");
        this.f65509a = str;
        this.f65510b = str2;
        this.f65511c = str3;
        this.f65512d = bVar;
        this.f65513e = str4;
        this.f65514f = bVar2;
    }

    /* renamed from: b */
    public static /* synthetic */ C25741a m80989b(C25741a aVar, String str, String str2, String str3, CreditCardView.C13270b bVar, String str4, C20262b bVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f65509a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f65510b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = aVar.f65511c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bVar = aVar.f65512d;
        }
        CreditCardView.C13270b bVar3 = bVar;
        if ((i & 16) != 0) {
            str4 = aVar.f65513e;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            bVar2 = aVar.f65514f;
        }
        return aVar.mo64325a(str, str5, str6, bVar3, str7, bVar2);
    }

    /* renamed from: a */
    public final C25741a mo64325a(String str, String str2, String str3, CreditCardView.C13270b bVar, String str4, C20262b bVar2) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "cardId");
        C41536l.m120489i(str3, "subProductCode");
        C41536l.m120489i(bVar, "creditCard");
        C41536l.m120489i(str4, "cardClassCode");
        return new C25741a(str, str2, str3, bVar, str4, bVar2);
    }

    /* renamed from: c */
    public final String mo64326c() {
        return this.f65513e;
    }

    /* renamed from: d */
    public final String mo64327d() {
        return this.f65510b;
    }

    /* renamed from: e */
    public final CreditCardView.C13270b mo64328e() {
        return this.f65512d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25741a)) {
            return false;
        }
        C25741a aVar = (C25741a) obj;
        return C41536l.m120484d(this.f65509a, aVar.f65509a) && C41536l.m120484d(this.f65510b, aVar.f65510b) && C41536l.m120484d(this.f65511c, aVar.f65511c) && C41536l.m120484d(this.f65512d, aVar.f65512d) && C41536l.m120484d(this.f65513e, aVar.f65513e) && C41536l.m120484d(this.f65514f, aVar.f65514f);
    }

    /* renamed from: f */
    public final C20262b mo64330f() {
        return this.f65514f;
    }

    /* renamed from: g */
    public final String mo64331g() {
        return this.f65511c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f65509a.hashCode() * 31) + this.f65510b.hashCode()) * 31) + this.f65511c.hashCode()) * 31) + this.f65512d.hashCode()) * 31) + this.f65513e.hashCode()) * 31;
        C20262b bVar = this.f65514f;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public String toString() {
        String str = this.f65509a;
        String str2 = this.f65510b;
        String str3 = this.f65511c;
        CreditCardView.C13270b bVar = this.f65512d;
        String str4 = this.f65513e;
        C20262b bVar2 = this.f65514f;
        return "GooglePayCardModel(id=" + str + ", cardId=" + str2 + ", subProductCode=" + str3 + ", creditCard=" + bVar + ", cardClassCode=" + str4 + ", resumeTokenizeData=" + bVar2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25741a(String str, String str2, String str3, CreditCardView.C13270b bVar, String str4, C20262b bVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, bVar, str4, (i & 32) != 0 ? null : bVar2);
    }
}
