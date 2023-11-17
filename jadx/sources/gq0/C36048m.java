package gq0;

import androidx.lifecycle.C1644x;
import hd1.C41204a;
import hq0.C36178a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.recommender.model.RecommenderData;

/* renamed from: gq0.m */
public final class C36048m extends C21481a implements C36046k, C36047l {

    /* renamed from: d */
    private RecommenderData f87166d;

    /* renamed from: e */
    private final C36046k f87167e = this;

    /* renamed from: f */
    private final C36047l f87168f = this;

    /* renamed from: g */
    private final C1644x f87169g = new C1644x();

    /* renamed from: h */
    private final C1644x f87170h = new C1644x();

    /* renamed from: i */
    private final C1644x f87171i = new C1644x();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C36048m(RecommenderData recommenderData) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(recommenderData, "data");
        this.f87166d = recommenderData;
    }

    /* renamed from: Fd */
    public void mo88759Fd() {
        C37224b.m109962a(mo88764q7());
    }

    /* renamed from: d */
    public void mo88760d(String str) {
        boolean z;
        C41536l.m120489i(str, "amountText");
        boolean z2 = true;
        boolean z3 = false;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                double parseDouble = Double.parseDouble(str);
                if (parseDouble < this.f87166d.mo73236d() || parseDouble > this.f87166d.mo73235b()) {
                    z2 = false;
                }
                z3 = z2;
            } catch (Throwable unused) {
            }
            mo88765vo().mo4826r(new C36178a(str, z3));
        }
    }

    /* renamed from: dw */
    public C1644x mo88765vo() {
        return this.f87169g;
    }

    /* renamed from: ew */
    public C1644x mo88763Uc() {
        return this.f87170h;
    }

    /* renamed from: fw */
    public final C36046k mo88768fw() {
        return this.f87167e;
    }

    /* renamed from: gw */
    public final C36047l mo88769gw() {
        return this.f87168f;
    }

    /* renamed from: hw */
    public C1644x mo88764q7() {
        return this.f87171i;
    }

    /* renamed from: p6 */
    public void mo88761p6() {
        mo88765vo().mo4826r(new C36178a(String.valueOf((int) this.f87166d.mo73235b()), false, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: s2 */
    public void mo88762s2() {
        String str;
        C1644x ew = mo88763Uc();
        C36178a aVar = (C36178a) mo88765vo().mo4814f();
        if (aVar == null || (str = aVar.mo88932a()) == null) {
            str = "";
        }
        C37224b.m109965d(ew, str);
    }
}
