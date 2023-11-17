package au0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p349ah.C9860d;
import vt0.C39464a;

/* renamed from: au0.a */
public final class C31066a extends C9860d {

    /* renamed from: C */
    public static final C31067a f77260C = new C31067a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C39464a f77261B;

    /* renamed from: au0.a$a */
    public static final class C31067a {
        private C31067a() {
        }

        public /* synthetic */ C31067a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31066a mo71270a() {
            return new C31066a();
        }
    }

    /* renamed from: d2 */
    private final C39464a m92478d2() {
        C39464a aVar = this.f77261B;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f77261B = C39464a.m114712d(layoutInflater, viewGroup, true);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m92478d2().f93858e.setText(C32343x.m95388F("text.pluspage.detailed.information.text", new Object[0]));
        m92478d2().f93858e.setTitle(C32343x.m95388F("text.pluspage.detailed.information.text.bold", new Object[0]));
        mo26370a2(C32343x.m95388F("text.pluspage.detailed.information.header", new Object[0]));
    }
}
