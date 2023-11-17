package lc1;

import android.content.ComponentCallbacks;
import android.content.Intent;
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
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.sso_client.models.C35962r;
import p341ge.bog.sso_client.models.Session;
import p341ge.bog.sso_client.setup_parameters.SetupParametersActivity;
import p349ah.C9860d;
import ua1.C28695z;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;

/* renamed from: lc1.c */
public final class C41649c extends C9860d {

    /* renamed from: D */
    public static final C41650a f97893D = new C41650a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28695z f97894B;

    /* renamed from: C */
    private final C41217g f97895C = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41653d(this, (C41806a) null, (C43064a) null));

    /* renamed from: lc1.c$a */
    public static final class C41650a {
        private C41650a() {
        }

        public /* synthetic */ C41650a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41649c mo96460a() {
            return new C41649c();
        }
    }

    /* renamed from: lc1.c$b */
    static final class C41651b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41651b f97896d = new C41651b();

        C41651b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo96461a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setOfferSecuritySettingsSetup(Boolean.FALSE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96461a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lc1.c$c */
    static final class C41652c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C41652c f97897d = new C41652c();

        C41652c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo96462a(Session session) {
            C41536l.m120489i(session, "$this$edit");
            session.setAlwaysSkipSecurityOffer$sso_client_release(Boolean.TRUE);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96462a((Session) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: lc1.c$d */
    public static final class C41653d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97898d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97899e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97900f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41653d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97898d = componentCallbacks;
            this.f97899e = aVar;
            this.f97900f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97898d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f97899e, this.f97900f);
        }
    }

    /* renamed from: f2 */
    private final C28695z m120848f2() {
        C28695z zVar = this.f97894B;
        C41536l.m120486f(zVar);
        return zVar;
    }

    /* renamed from: g2 */
    private final C10146d0.C10172e m120849g2() {
        return (C10146d0.C10172e) this.f97895C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m120850h2(C41649c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C35962r.m107005c(C10146d0.C10159c.m37143b(), C41652c.f97897d);
        cVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m120851i2(C41649c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.startActivity(new Intent(cVar.getContext(), SetupParametersActivity.class));
        cVar.mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f97894B = C28695z.m87901d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10220y.setup_security_parameters_title));
        mo4586v1(false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97894B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120848f2().f73066h.setDrawableTint(C10212q.f28272f);
        PageDescriptionView pageDescriptionView = m120848f2().f73066h;
        C10195g0 g = m120849g2().mo26716g();
        if (g == null || (str = g.mo26763a("text.simple.auth.suggestion", new Object[0])) == null) {
            str = getString(C10220y.setup_security_parameters_offer_page_description_text);
        }
        pageDescriptionView.setText(str);
        C35962r.m107005c(C10146d0.C10159c.m37143b(), C41651b.f97896d);
        m120848f2().f73065g.setOnClickListener(new C41647a(this));
        m120848f2().f73063e.setOnClickListener(new C41648b(this));
    }
}
