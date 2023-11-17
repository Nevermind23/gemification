package eo0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p725cr.C19788a;
import xn0.C18843a;

/* renamed from: eo0.b */
public final class C12785b extends C19788a {

    /* renamed from: J */
    public static final C12786a f37903J = new C12786a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private String f37904H = C32343x.m95388F("life.style.chooser.success.header", new Object[0]);

    /* renamed from: I */
    private C18843a f37905I;

    /* renamed from: eo0.b$a */
    public static final class C12786a {
        private C12786a() {
        }

        public /* synthetic */ C12786a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: f2 */
    private final C18843a m48536f2() {
        C18843a aVar = this.f37905I;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: g2 */
    private final void m48537g2() {
        C18843a f2 = m48536f2();
        f2.f52660g.setTitleText(C32343x.m95388F("life.style.chooser.success.main.text", new Object[0]));
        f2.f52658e.setTitleText(C32343x.m95388F("life.style.chooser.success.info.text", new Object[0]));
        f2.f52659f.setButtonText(C32343x.m95388F("life.style.chooser.success.button", new Object[0]));
        f2.f52659f.setOnClickListener(new C12784a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m48538h2(C12785b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C1533o.m5445b(bVar, "OPEN_OFFERS_REQUEST_KEY", new Bundle());
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f37904H;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f37905I = C18843a.m63736d(getLayoutInflater(), viewGroup, true);
        m48537g2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f37905I = null;
    }
}
