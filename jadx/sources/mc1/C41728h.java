package mc1;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10212q;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p349ah.C9860d;
import ua1.C28688v0;
import ue1.C43064a;
import wg1.C43241a;

/* renamed from: mc1.h */
public final class C41728h extends C9860d {

    /* renamed from: E */
    public static final C41730b f98009E = new C41730b((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28688v0 f98010B;

    /* renamed from: C */
    private C41729a f98011C;

    /* renamed from: D */
    private final C41217g f98012D = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41731c(this, (C41806a) null, (C43064a) null));

    /* renamed from: mc1.h$a */
    public interface C41729a {
        /* renamed from: v */
        void mo95744v();
    }

    /* renamed from: mc1.h$b */
    public static final class C41730b {
        private C41730b() {
        }

        public /* synthetic */ C41730b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41728h mo96524a() {
            return new C41728h();
        }
    }

    /* renamed from: mc1.h$c */
    public static final class C41731c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f98013d;

        /* renamed from: e */
        final /* synthetic */ C41806a f98014e;

        /* renamed from: f */
        final /* synthetic */ C43064a f98015f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41731c(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f98013d = componentCallbacks;
            this.f98014e = aVar;
            this.f98015f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f98013d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f98014e, this.f98015f);
        }
    }

    /* renamed from: e2 */
    private final C28688v0 m120999e2() {
        C28688v0 v0Var = this.f98010B;
        C41536l.m120486f(v0Var);
        return v0Var;
    }

    /* renamed from: f2 */
    private final C10146d0.C10172e m121000f2() {
        return (C10146d0.C10172e) this.f98012D.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m121001g2(C41728h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41729a aVar = hVar.f98011C;
        if (aVar != null) {
            aVar.mo95744v();
        }
        hVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f98010B = C28688v0.m87870d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10220y.setup_security_parameters_trusted_device_page_title));
    }

    /* renamed from: h2 */
    public final void mo96523h2(C41729a aVar) {
        this.f98011C = aVar;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f98010B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120999e2().f73018g.setDrawableTint(C10212q.f28272f);
        m120999e2().f73016e.setOnClickListener(new C41727g(this));
        PageDescriptionView pageDescriptionView = m120999e2().f73018g;
        C10195g0 g = m121000f2().mo26716g();
        if (g == null || (str = g.mo26763a("text.trust.device.suggestion", new Object[0])) == null) {
            str = getString(C10220y.setup_security_parameters_trusted_device_page_title);
        }
        pageDescriptionView.setText(str);
        PageDescriptionView pageDescriptionView2 = m120999e2().f73018g;
        C10195g0 g2 = m121000f2().mo26716g();
        if (g2 == null || (str2 = g2.mo26763a("text.trust.device.suggestion.header", new Object[0])) == null) {
            str2 = getString(C10220y.setup_security_parameters_trusted_device_page_description_text);
        }
        pageDescriptionView2.setTitle(str2);
    }
}
