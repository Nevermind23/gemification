package p341ge.bog.mobilebank.openbanking.presentation.products;

import a81.C30772sa;
import android.os.Bundle;
import android.view.View;
import ev0.C31825f;
import g91.C32343x;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rv0.C38373t;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.products.TermsAndConditionsActivity */
public final class TermsAndConditionsActivity extends C30772sa {

    /* renamed from: G */
    public static final C33463a f81678G = new C33463a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C31825f f81679F;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.products.TermsAndConditionsActivity$a */
    public static final class C33463a {
        private C33463a() {
        }

        public /* synthetic */ C33463a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F2 */
    public static final void m98259F2(TermsAndConditionsActivity termsAndConditionsActivity, View view) {
        C41536l.m120489i(termsAndConditionsActivity, "this$0");
        termsAndConditionsActivity.setResult(-1);
        termsAndConditionsActivity.finish();
        C36546y.m108282F().mo27152s("open_banking", (String) null, "accept_terms_checkbox");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C31825f d = C31825f.m94089d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f81679F = d;
        C31825f fVar = null;
        if (d == null) {
            C41536l.m120506z("_binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        C31825f fVar2 = this.f81679F;
        if (fVar2 == null) {
            C41536l.m120506z("_binding");
            fVar2 = null;
        }
        fVar2.f78498r.setText(C32343x.m95388F("open.bank.terms.new.desc.main", new Object[0]));
        C31825f fVar3 = this.f81679F;
        if (fVar3 == null) {
            C41536l.m120506z("_binding");
            fVar3 = null;
        }
        fVar3.f78486f.setText(C32343x.m95388F("open.bank.terms.new.bullet1.title", new Object[0]));
        C31825f fVar4 = this.f81679F;
        if (fVar4 == null) {
            C41536l.m120506z("_binding");
            fVar4 = null;
        }
        fVar4.f78485e.setText(C32343x.m95388F("open.bank.terms.new.bullet1.desc", new Object[0]));
        C31825f fVar5 = this.f81679F;
        if (fVar5 == null) {
            C41536l.m120506z("_binding");
            fVar5 = null;
        }
        fVar5.f78488h.setText(C32343x.m95388F("open.bank.terms.new.bullet2.title", new Object[0]));
        C31825f fVar6 = this.f81679F;
        if (fVar6 == null) {
            C41536l.m120506z("_binding");
            fVar6 = null;
        }
        fVar6.f78487g.setText(C32343x.m95388F("open.bank.terms.new.bullet2.desc", new Object[0]));
        C31825f fVar7 = this.f81679F;
        if (fVar7 == null) {
            C41536l.m120506z("_binding");
            fVar7 = null;
        }
        fVar7.f78490j.setText(C32343x.m95388F("open.bank.terms.new.bullet3.title", new Object[0]));
        C31825f fVar8 = this.f81679F;
        if (fVar8 == null) {
            C41536l.m120506z("_binding");
            fVar8 = null;
        }
        fVar8.f78489i.setText(C32343x.m95388F("open.bank.terms.new.bullet3.desc", new Object[0]));
        C31825f fVar9 = this.f81679F;
        if (fVar9 == null) {
            C41536l.m120506z("_binding");
            fVar9 = null;
        }
        fVar9.f78492l.setText(C32343x.m95388F("open.bank.terms.new.bullet4.title", new Object[0]));
        C31825f fVar10 = this.f81679F;
        if (fVar10 == null) {
            C41536l.m120506z("_binding");
            fVar10 = null;
        }
        fVar10.f78491k.setText(C32343x.m95388F("open.bank.terms.new.bullet4.desc", new Object[0]));
        C31825f fVar11 = this.f81679F;
        if (fVar11 == null) {
            C41536l.m120506z("_binding");
        } else {
            fVar = fVar11;
        }
        fVar.f78493m.getButton().setOnClickListener(new C38373t(this));
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("open.bank.terms.title", new Object[0]);
    }
}
