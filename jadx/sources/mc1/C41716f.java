package mc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41547w;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc1.C41665k;
import nh1.C41806a;
import p341ge.bog.designsystem.components.passcode.PasscodeView;
import p341ge.bog.sso_client.models.C35947l;
import p349ah.C9860d;
import ua1.C28678s;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: mc1.f */
public final class C41716f extends C9860d {

    /* renamed from: G */
    public static final C41718b f97987G = new C41718b((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28678s f97988B;

    /* renamed from: C */
    private final C41217g f97989C = C41219i.m119469a(C41222k.NONE, new C41726i(this, (C41806a) null, (C43064a) null, new C41725h(this), (C43064a) null));

    /* renamed from: D */
    private final C41217g f97990D = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41724g(this, (C41806a) null, (C43064a) null));

    /* renamed from: E */
    private boolean f97991E;

    /* renamed from: F */
    private C41717a f97992F;

    /* renamed from: mc1.f$a */
    public interface C41717a {
        /* renamed from: s0 */
        void mo95743s0(boolean z, String str);
    }

    /* renamed from: mc1.f$b */
    public static final class C41718b {
        private C41718b() {
        }

        public /* synthetic */ C41718b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41716f mo96516a() {
            return new C41716f();
        }
    }

    /* renamed from: mc1.f$c */
    static final class C41719c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41716f f97993d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41719c(C41716f fVar) {
            super(0);
            this.f97993d = fVar;
        }

        public final void invoke() {
            this.f97993d.m120985h2().f72919f.mo36450j();
            this.f97993d.m120988k2().mo96476sw(C40445z.m117190U0(this.f97993d.m120988k2().mo96471mw(), 1));
        }
    }

    /* renamed from: mc1.f$d */
    static final class C41720d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41716f f97994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41720d(C41716f fVar) {
            super(1);
            this.f97994d = fVar;
        }

        /* renamed from: a */
        public final void mo96517a(String str) {
            C41536l.m120489i(str, "it");
            this.f97994d.m120985h2().f72919f.mo36448h();
            C41665k g2 = this.f97994d.m120988k2();
            g2.mo96476sw(g2.mo96471mw() + str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96517a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mc1.f$e */
    static final class C41721e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41716f f97995d;

        /* renamed from: e */
        final /* synthetic */ C41547w f97996e;

        /* renamed from: mc1.f$e$a */
        public /* synthetic */ class C41722a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f97997a;

            static {
                int[] iArr = new int[PasscodeView.C13440b.values().length];
                iArr[PasscodeView.C13440b.NORMAL.ordinal()] = 1;
                f97997a = iArr;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41721e(C41716f fVar, C41547w wVar) {
            super(1);
            this.f97995d = fVar;
            this.f97996e = wVar;
        }

        /* renamed from: a */
        public final void mo96518a(PasscodeView.C13440b bVar) {
            C41536l.m120489i(bVar, "it");
            if (C41722a.f97997a[bVar.ordinal()] == 1) {
                this.f97995d.m120985h2().f72919f.setTitle(this.f97995d.m120987j2(this.f97996e.f97714d));
                this.f97995d.m120985h2().f72918e.setEnabled(true);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo96518a((PasscodeView.C13440b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mc1.f$f */
    public static final class C41723f implements Runnable {

        /* renamed from: d */
        final /* synthetic */ C41716f f97998d;

        public C41723f(C41716f fVar) {
            this.f97998d = fVar;
        }

        public final void run() {
            this.f97998d.mo26371b();
        }
    }

    /* renamed from: mc1.f$g */
    public static final class C41724g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97999d;

        /* renamed from: e */
        final /* synthetic */ C41806a f98000e;

        /* renamed from: f */
        final /* synthetic */ C43064a f98001f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41724g(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97999d = componentCallbacks;
            this.f98000e = aVar;
            this.f98001f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97999d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f98000e, this.f98001f);
        }
    }

    /* renamed from: mc1.f$h */
    public static final class C41725h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f98002d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41725h(Fragment fragment) {
            super(0);
            this.f98002d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f98002d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: mc1.f$i */
    public static final class C41726i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f98003d;

        /* renamed from: e */
        final /* synthetic */ C41806a f98004e;

        /* renamed from: f */
        final /* synthetic */ C43064a f98005f;

        /* renamed from: g */
        final /* synthetic */ C43064a f98006g;

        /* renamed from: h */
        final /* synthetic */ C43064a f98007h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41726i(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f98003d = fragment;
            this.f98004e = aVar;
            this.f98005f = aVar2;
            this.f98006g = aVar3;
            this.f98007h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f98003d, this.f98004e, this.f98005f, this.f98006g, C41520a0.m120436b(C41665k.class), this.f98007h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C28678s m120985h2() {
        C28678s sVar = this.f97988B;
        C41536l.m120486f(sVar);
        return sVar;
    }

    /* renamed from: i2 */
    private final C10146d0.C10172e m120986i2() {
        return (C10146d0.C10172e) this.f97990D.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final String m120987j2(boolean z) {
        String a;
        String a2;
        if (!z) {
            C10195g0 g = m120986i2().mo26716g();
            if (g != null && (a2 = g.mo26763a("text.passcode.suggestion.header", new Object[0])) != null) {
                return a2;
            }
            String string = getString(C10220y.sso_add_pass_code);
            C41536l.m120488h(string, "getString(R.string.sso_add_pass_code)");
            return string;
        }
        C10195g0 g2 = m120986i2().mo26716g();
        if (g2 != null && (a = g2.mo26763a("text.passcode.retype.suggestion.header", new Object[0])) != null) {
            return a;
        }
        String string2 = getString(C10220y.sso_pass_code_again);
        C41536l.m120488h(string2, "getString(R.string.sso_pass_code_again)");
        return string2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final C41665k m120988k2() {
        return (C41665k) this.f97989C.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m120989l2(C41716f fVar, C41547w wVar, C35947l lVar) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(wVar, "$retryPasscode");
        if (lVar instanceof C35947l.C35949b) {
            fVar.m120985h2().f72919f.mo36451k();
        } else if (lVar instanceof C35947l.C35951d) {
            fVar.m120985h2().f72919f.mo36453m();
            fVar.f97991E = true;
            new Handler().postDelayed(new C41723f(fVar), 1000);
        } else if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            fVar.m120985h2().f72919f.mo36452l();
            fVar.m120985h2().f72918e.setEnabled(false);
            boolean z = !wVar.f97714d;
            wVar.f97714d = z;
            if (z) {
                fVar.m120985h2().f72919f.mo36449i();
                fVar.m120985h2().f72918e.setEnabled(true);
            }
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f97988B = C28678s.m87828d(layoutInflater, viewGroup, true);
        mo26370a2(getResources().getString(C10220y.setup_security_parameters_passcode));
    }

    /* renamed from: m2 */
    public final void mo96515m2(C41717a aVar) {
        this.f97992F = aVar;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97988B = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C41717a aVar = this.f97992F;
        if (aVar != null) {
            aVar.mo95743s0(this.f97991E, m120988k2().mo96471mw());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120985h2().f72918e.setBackSpaceClickedListener(new C41719c(this));
        m120985h2().f72918e.setNumbersClickedListener(new C41720d(this));
        m120985h2().f72919f.setTitle(m120987j2(false));
        C41547w wVar = new C41547w();
        m120988k2().mo96473ow().mo4819k(this, new C41715e(this, wVar));
        m120985h2().f72919f.setStateChangedListener(new C41721e(this, wVar));
    }
}
