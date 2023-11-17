package p620tl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p536nl.C17050c;
import p725cr.C19788a;

/* renamed from: tl.c */
public final class C17988c extends C19788a {

    /* renamed from: I */
    public static final C17989a f51202I = new C17989a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C17050c f51203H;

    /* renamed from: tl.c$a */
    public static final class C17989a {
        private C17989a() {
        }

        public /* synthetic */ C17989a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17988c mo45674a() {
            return new C17988c();
        }
    }

    /* renamed from: g2 */
    private final C17050c m61957g2() {
        C17050c cVar = this.f51203H;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m61958h2(C17988c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C1533o.m5445b(cVar, "REQUEST_KEY_PDF_TYPE", C0908e.m3336b(C41233s.m119492a("REQUEST_KEY_PDF_SCHEDULE", Boolean.TRUE)));
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m61959i2(C17988c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C1533o.m5445b(cVar, "REQUEST_KEY_PDF_TYPE", C0908e.m3336b(C41233s.m119492a("REQUEST_KEY_PDF_HISTORY", Boolean.TRUE)));
        cVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f51203H = C17050c.m59901d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("text.bnpl.product.details.print.documents", new Object[0]));
        m61957g2().f47565i.setText(C32343x.m95388F("text.bnpl.product.details.print.scheule", new Object[0]));
        m61957g2().f47562f.setText(C32343x.m95388F("text.bnpl.product.details.print.repayments", new Object[0]));
        m61957g2().f47564h.setOnClickListener(new C17986a(this));
        m61957g2().f47563g.setOnClickListener(new C17987b(this));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f51203H = null;
    }
}
