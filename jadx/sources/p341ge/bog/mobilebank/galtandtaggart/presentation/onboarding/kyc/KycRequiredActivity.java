package p341ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import dg0.C20001a;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import ue0.C28735k0;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity */
public final class KycRequiredActivity extends C30772sa {

    /* renamed from: H */
    public static final C23611a f61595H = new C23611a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f61596F = C41219i.m119470b(new C23612b(this));

    /* renamed from: G */
    private final C41217g f61597G = new C1617p0(C41520a0.m120436b(KycRequiredViewModel$ViewModel.class), new C23619f(this), new C23618e(this), new C23620g((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$a */
    public static final class C23611a {
        private C23611a() {
        }

        public /* synthetic */ C23611a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60487a(Context context, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, KycRequiredActivity.class);
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$b */
    static final class C23612b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ KycRequiredActivity f61598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23612b(KycRequiredActivity kycRequiredActivity) {
            super(0);
            this.f61598d = kycRequiredActivity;
        }

        /* renamed from: b */
        public final C28735k0 invoke() {
            return C28735k0.m88065d(this.f61598d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$c */
    static final class C23613c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61599a;

        C23613c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61599a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61599a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61599a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$d */
    static final class C23614d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ KycRequiredActivity f61600d;

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$d$a */
        static final class C23615a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ KycRequiredActivity f61601d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23615a(KycRequiredActivity kycRequiredActivity) {
                super(1);
                this.f61601d = kycRequiredActivity;
            }

            /* renamed from: a */
            public final void mo60492a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                this.f61601d.m76343G2().f73338g.getButton().setLoading(false);
                this.f61601d.setResult(-1);
                this.f61601d.finish();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60492a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$d$b */
        static final class C23616b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ KycRequiredActivity f61602d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23616b(KycRequiredActivity kycRequiredActivity) {
                super(1);
                this.f61602d = kycRequiredActivity;
            }

            /* renamed from: a */
            public final void mo60493a(C41238w wVar) {
                this.f61602d.m76343G2().f73338g.getButton().setLoading(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo60493a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$d$c */
        static final class C23617c extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ KycRequiredActivity f61603d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C23617c(KycRequiredActivity kycRequiredActivity) {
                super(2);
                this.f61603d = kycRequiredActivity;
            }

            /* renamed from: a */
            public final void mo60494a(Throwable th, C41238w wVar) {
                C41536l.m120489i(th, "error");
                this.f61603d.mo74709H1(th);
                this.f61603d.m76343G2().f73338g.getButton().setLoading(false);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo60494a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23614d(KycRequiredActivity kycRequiredActivity) {
            super(1);
            this.f61600d = kycRequiredActivity;
        }

        /* renamed from: a */
        public final void mo60491a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92648j(aVar, (int[]) null, new C23615a(this.f61600d), 1, (Object) null);
            C31132b.m92646h(aVar, (int[]) null, new C23616b(this.f61600d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C23617c(this.f61600d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60491a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$e */
    public static final class C23618e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23618e(ComponentActivity componentActivity) {
            super(0);
            this.f61604d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61604d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$f */
    public static final class C23619f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23619f(ComponentActivity componentActivity) {
            super(0);
            this.f61605d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61605d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.onboarding.kyc.KycRequiredActivity$g */
    public static final class C23620g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61606d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61607e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23620g(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61606d = aVar;
            this.f61607e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61606d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61607e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G2 */
    public final C28735k0 m76343G2() {
        return (C28735k0) this.f61596F.getValue();
    }

    /* renamed from: H2 */
    private final KycRequiredViewModel$ViewModel m76344H2() {
        return (KycRequiredViewModel$ViewModel) this.f61597G.getValue();
    }

    /* renamed from: I2 */
    private final void m76345I2() {
        m76343G2().f73338g.getButton().setOnClickListener(new C20001a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final void m76346J2(KycRequiredActivity kycRequiredActivity, View view) {
        C41536l.m120489i(kycRequiredActivity, "this$0");
        kycRequiredActivity.m76344H2().mo60495gw().mo48377b7();
    }

    /* renamed from: K2 */
    private final void m76347K2() {
        m76344H2().mo60496hw().mo48378x4().mo4819k(this, new C23613c(new C23614d(this)));
    }

    /* renamed from: L2 */
    private final void m76348L2() {
        m76343G2().f73338g.getButton().setButtonText(C32343x.m95388F("gt.onboarding.document.resend.page.button", new Object[0]));
        m76343G2().f73336e.setTitle(C32343x.m95388F("gt.onboarding.document.resend.page.title", new Object[0]));
        m76343G2().f73336e.setText(C32343x.m95388F("gt.onboarding.document.resend.page.message", new Object[0]));
        m76343G2().f73340i.f68494e.setTitle(C32343x.m95388F("gt.onboarding.document.resend.page.header", new Object[0]));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m76343G2());
        m76348L2();
        m76345I2();
        m76347K2();
    }
}
