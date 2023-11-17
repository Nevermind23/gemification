package p341ge.bog.mobilebank.cleanarch.identityverification.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import g91.C32289b0;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import p163m0.C7047a;
import p192o3.C7423a;
import p341ge.bog.designsystem.components.accordion.IconAccordionView;
import p341ge.bog.mobilebank.cleanarch.identityverification.presentation.viewmodel.IdentityVerificationViewModel;
import p341ge.bog.mobilebank.cleanarch.lookup.presenttation.model.LookupUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p366bk.C10322k;
import p366bk.C10324m;
import p884rx.C28112a;
import p90.C27324i0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity */
public final class IdentityVerificationActivity extends C30772sa implements C41185v.C41186a {

    /* renamed from: N */
    public static final C21050a f56552N = new C21050a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f56553F = new C1617p0(C41520a0.m120436b(IdentityVerificationViewModel.class), new C21071v(this), new C21070u(this), new C21072w((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C27324i0 f56554G;

    /* renamed from: H */
    private final C41217g f56555H = C41219i.m119470b(new C21067r(this));

    /* renamed from: I */
    private final C41217g f56556I = C41219i.m119470b(new C21065p(this));

    /* renamed from: J */
    private final C41217g f56557J = C41219i.m119470b(new C21064o(this));

    /* renamed from: K */
    private final C41217g f56558K = C41219i.m119470b(new C21066q(this));

    /* renamed from: L */
    private final C41217g f56559L = C41219i.m119470b(new C21051b(this));

    /* renamed from: M */
    private final C41217g f56560M = C41219i.m119470b(new C21069t(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$a */
    public static final class C21050a {
        private C21050a() {
        }

        public /* synthetic */ C21050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo52251a(Context context, String str, String str2, String str3, String str4, boolean z) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(str, "operationRef");
            C41536l.m120489i(str4, "qrType");
            Intent intent = new Intent(context, IdentityVerificationActivity.class);
            intent.putExtra("EXTRA_OPERATION_REF", str);
            intent.putExtra("EXTRA_REDIRECT_URL", str2);
            intent.putExtra("EXTRA_OPERATION_TYPE", str3);
            intent.putExtra("EXTRA_QR_TYPE", str4);
            intent.putExtra("EXTRA_INITIATED_WHILE_AUTHORIZED", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$b */
    static final class C21051b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56561d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21051b(IdentityVerificationActivity identityVerificationActivity) {
            super(0);
            this.f56561d = identityVerificationActivity;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f56561d.getIntent().getBooleanExtra("EXTRA_INITIATED_WHILE_AUTHORIZED", true));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$c */
    static final class C21052c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C21052c f56562d = new C21052c();

        C21052c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo52253a(boolean z) {
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52253a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$d */
    static final class C21053d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56563d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21053d(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56563d = identityVerificationActivity;
        }

        /* renamed from: a */
        public final void mo52254a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "state");
            if (aVar.mo53708h()) {
                C41185v L2 = this.f56563d.m68151W2();
                if (L2 != null) {
                    L2.mo95634K2(C32343x.m95388F(aVar.mo53705e(), new Object[0]));
                    return;
                }
                return;
            }
            C41185v L22 = this.f56563d.m68151W2();
            if (L22 != null) {
                L22.mo4577k1();
            }
            this.f56563d.mo74709H1(aVar.mo53706f());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52254a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$e */
    static final class C21054e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21054e(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56564d = identityVerificationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C41185v L2;
            C41536l.m120488h(bool, "authenticated");
            if (bool.booleanValue() && (L2 = this.f56564d.m68151W2()) != null) {
                L2.mo4577k1();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$f */
    static final class C21055f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21055f(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56565d = identityVerificationActivity;
        }

        /* renamed from: a */
        public final void mo52256a(C37223a aVar) {
            String str;
            if (aVar != null && (str = (String) aVar.mo90296a()) != null) {
                IdentityVerificationActivity identityVerificationActivity = this.f56565d;
                C27324i0 I2 = identityVerificationActivity.f56554G;
                C27324i0 i0Var = null;
                if (I2 == null) {
                    C41536l.m120506z("binding");
                    I2 = null;
                }
                I2.f68925l.setVisibility(0);
                C27324i0 I22 = identityVerificationActivity.f56554G;
                if (I22 == null) {
                    C41536l.m120506z("binding");
                    I22 = null;
                }
                I22.f68927n.setVisibility(0);
                C27324i0 I23 = identityVerificationActivity.f56554G;
                if (I23 == null) {
                    C41536l.m120506z("binding");
                    I23 = null;
                }
                I23.f68926m.setVisibility(0);
                C27324i0 I24 = identityVerificationActivity.f56554G;
                if (I24 == null) {
                    C41536l.m120506z("binding");
                    I24 = null;
                }
                I24.f68927n.setText(C32343x.m95388F("online.inst.authorization.page.details.store", new Object[0]));
                C2394j jVar = (C2394j) ((C2394j) C2379b.m9213w(identityVerificationActivity).mo7757y(C32289b0.m95091c(str)).mo7242o0(true)).mo7228g(C7423a.f21687b);
                C27324i0 I25 = identityVerificationActivity.f56554G;
                if (I25 == null) {
                    C41536l.m120506z("binding");
                } else {
                    i0Var = I25;
                }
                jVar.mo7718L0(i0Var.f68926m);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52256a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$g */
    /* synthetic */ class C21056g extends C41535k implements C43075l {
        C21056g(Object obj) {
            super(1, obj, IdentityVerificationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo52257b(boolean z) {
            ((IdentityVerificationActivity) this.receiver).m68157c3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52257b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$h */
    /* synthetic */ class C21057h extends C41535k implements C43075l {
        C21057h(Object obj) {
            super(1, obj, IdentityVerificationActivity.class, "onProcessDataResponse", "onProcessDataResponse(Lkotlin/Pair;)V", 0);
        }

        /* renamed from: b */
        public final void mo52258b(C41224m mVar) {
            C41536l.m120489i(mVar, "p0");
            ((IdentityVerificationActivity) this.receiver).m68158d3(mVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52258b((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$i */
    static final class C21058i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21058i(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56566d = identityVerificationActivity;
        }

        /* renamed from: a */
        public final void mo52259a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f56566d.mo52674G1(aVar);
            C27324i0 I2 = this.f56566d.f56554G;
            if (I2 == null) {
                C41536l.m120506z("binding");
                I2 = null;
            }
            I2.f68930q.setVisibility(0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52259a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$j */
    /* synthetic */ class C21059j extends C41535k implements C43075l {
        C21059j(Object obj) {
            super(1, obj, IdentityVerificationActivity.class, "onLoading", "onLoading(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo52260b(boolean z) {
            ((IdentityVerificationActivity) this.receiver).m68157c3(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52260b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$k */
    /* synthetic */ class C21060k extends C41535k implements C43075l {
        C21060k(Object obj) {
            super(1, obj, IdentityVerificationActivity.class, "handleError", "handleError(Lge/bog/mobilebank/cleanarch/presentation/common/Resource$Error;)V", 0);
        }

        /* renamed from: b */
        public final void mo52261b(C21503d.C21504a aVar) {
            ((IdentityVerificationActivity) this.receiver).mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52261b((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$l */
    static final class C21061l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56567d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21061l(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56567d = identityVerificationActivity;
        }

        /* renamed from: a */
        public final void mo52262a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f56567d.m68160f3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52262a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$m */
    static final class C21062m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21062m(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56568d = identityVerificationActivity;
        }

        /* renamed from: a */
        public final void mo52263a(HashMap hashMap) {
            C41536l.m120489i(hashMap, "lookupMap");
            IdentityVerificationFinishedActivity.f56580J.mo52278a(this.f56568d, hashMap);
            this.f56568d.finish();
            this.f56568d.overridePendingTransition(0, 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52263a((HashMap) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$n */
    static final class C21063n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56569d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21063n(IdentityVerificationActivity identityVerificationActivity) {
            super(1);
            this.f56569d = identityVerificationActivity;
        }

        /* renamed from: a */
        public final void mo52264a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C41185v c = C41185v.f97155C.mo95638c("IDENTITY_VERIFY_LOGIN_REDIRECT_PROCESS", this.f56569d.m68152X2().mo52312zw(IdentityVerificationViewModel.m68232uw(this.f56569d.m68152X2(), (String) null, (String) null, (String) null, 7, (Object) null)), this.f56569d.m68150V2());
            FragmentManager supportFragmentManager = this.f56569d.getSupportFragmentManager();
            C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
            c.mo4576A1(supportFragmentManager, (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo52264a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$o */
    static final class C21064o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56570d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21064o(IdentityVerificationActivity identityVerificationActivity) {
            super(0);
            this.f56570d = identityVerificationActivity;
        }

        public final String invoke() {
            String stringExtra = this.f56570d.getIntent().getStringExtra("EXTRA_OPERATION_REF");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$p */
    static final class C21065p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56571d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21065p(IdentityVerificationActivity identityVerificationActivity) {
            super(0);
            this.f56571d = identityVerificationActivity;
        }

        public final String invoke() {
            return this.f56571d.getIntent().getStringExtra("EXTRA_OPERATION_TYPE");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$q */
    static final class C21066q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56572d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21066q(IdentityVerificationActivity identityVerificationActivity) {
            super(0);
            this.f56572d = identityVerificationActivity;
        }

        public final String invoke() {
            String stringExtra = this.f56572d.getIntent().getStringExtra("EXTRA_QR_TYPE");
            return stringExtra == null ? "" : stringExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$r */
    static final class C21067r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21067r(IdentityVerificationActivity identityVerificationActivity) {
            super(0);
            this.f56573d = identityVerificationActivity;
        }

        public final String invoke() {
            return this.f56573d.getIntent().getStringExtra("EXTRA_REDIRECT_URL");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$s */
    static final class C21068s implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f56574a;

        C21068s(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f56574a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f56574a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f56574a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$t */
    static final class C21069t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ IdentityVerificationActivity f56575d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21069t(IdentityVerificationActivity identityVerificationActivity) {
            super(0);
            this.f56575d = identityVerificationActivity;
        }

        /* renamed from: b */
        public final C41143c invoke() {
            if (C41536l.m120484d(this.f56575d.m68147S2(), "RIBWEB_LOGIN")) {
                return C41143c.STRICT_AUTH;
            }
            return C41143c.DEFAULT;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$u */
    public static final class C21070u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21070u(ComponentActivity componentActivity) {
            super(0);
            this.f56576d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56576d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$v */
    public static final class C21071v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21071v(ComponentActivity componentActivity) {
            super(0);
            this.f56577d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56577d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.identityverification.presentation.IdentityVerificationActivity$w */
    public static final class C21072w extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56578d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56579e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21072w(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56578d = aVar;
            this.f56579e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56578d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56579e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: Q2 */
    private final boolean m68145Q2() {
        return ((Boolean) this.f56559L.getValue()).booleanValue();
    }

    /* renamed from: R2 */
    private final String m68146R2() {
        return (String) this.f56557J.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final String m68147S2() {
        return (String) this.f56556I.getValue();
    }

    /* renamed from: T2 */
    private final String m68148T2() {
        return (String) this.f56558K.getValue();
    }

    /* renamed from: U2 */
    private final String m68149U2() {
        return (String) this.f56555H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final C41143c m68150V2() {
        return (C41143c) this.f56560M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final C41185v m68151W2() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final IdentityVerificationViewModel m68152X2() {
        return (IdentityVerificationViewModel) this.f56553F.getValue();
    }

    /* renamed from: Y2 */
    private final void m68153Y2() {
        m68152X2().mo52311yw().mo4819k(this, new C21068s(new C21055f(this)));
        C21484c.m69411c(m68152X2().mo52301Gw(), this, new C21057h(this), new C21056g(this), new C21058i(this));
        C21484c.m69411c(m68152X2().mo52309ww(), this, new C21061l(this), new C21059j(this), new C21060k(this));
        C37224b.m109963b(m68152X2().mo52310xw(), this, new C21062m(this));
        C21484c.m69411c(m68152X2().mo52303I2(), this, new C21063n(this), C21052c.f56562d, new C21053d(this));
        m68152X2().mo52308vw().mo4819k(this, new C21068s(new C21054e(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m68154Z2(IdentityVerificationActivity identityVerificationActivity, View view) {
        C41536l.m120489i(identityVerificationActivity, "this$0");
        identityVerificationActivity.m68152X2().mo52304Jw();
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m68155a3(IdentityVerificationActivity identityVerificationActivity, View view) {
        C41536l.m120489i(identityVerificationActivity, "this$0");
        identityVerificationActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m68156b3(IdentityVerificationActivity identityVerificationActivity, View view) {
        C41536l.m120489i(identityVerificationActivity, "this$0");
        C27324i0 i0Var = identityVerificationActivity.f56554G;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        i0Var.f68930q.setVisibility(8);
        IdentityVerificationViewModel X2 = identityVerificationActivity.m68152X2();
        String R2 = identityVerificationActivity.m68146R2();
        String S2 = identityVerificationActivity.m68147S2();
        if (S2 == null) {
            S2 = "";
        }
        X2.mo52300Aw(R2, S2);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public final void m68157c3(boolean z) {
        C27324i0 i0Var = this.f56554G;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        i0Var.f68928o.setVisibility(z ? 0 : 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final void m68158d3(C41224m mVar) {
        List list = (List) mVar.mo95675a();
        Map map = (Map) mVar.mo95676b();
        if (!list.isEmpty()) {
            C27324i0 i0Var = this.f56554G;
            if (i0Var == null) {
                C41536l.m120506z("binding");
                i0Var = null;
            }
            IconAccordionView iconAccordionView = i0Var.f68923j;
            iconAccordionView.setVisibility(0);
            iconAccordionView.setExpanded(true);
            iconAccordionView.setOnCreateViewListener(new C21078d(list, iconAccordionView));
            iconAccordionView.mo34631i(list.size() + 1);
        }
        m68162h3(map);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public static final View m68159e3(List list, IconAccordionView iconAccordionView, int i) {
        C41536l.m120489i(list, "$verificationData");
        C41536l.m120489i(iconAccordionView, "$this_apply");
        if (i == list.size()) {
            View view = new View(iconAccordionView.getContext());
            C32343x.m95441d1(view, C32343x.m95394I(15));
            return view;
        }
        C41224m mVar = (C41224m) list.get(i);
        C28112a aVar = new C28112a();
        Context context = iconAccordionView.getContext();
        C41536l.m120488h(context, "context");
        return aVar.mo67647b(context, (String) mVar.mo95675a(), (String) mVar.mo95676b());
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m68160f3() {
        m68161g3();
    }

    /* renamed from: g3 */
    private final void m68161g3() {
        boolean z;
        String U2 = m68149U2();
        if (U2 == null || C40439w.m117118v(U2)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(m68149U2()));
                startActivity(intent);
                finish();
            } catch (Exception unused) {
            }
        } else {
            m68152X2().mo52306k0();
        }
    }

    /* renamed from: h3 */
    private final void m68162h3(Map map) {
        C27324i0 i0Var = this.f56554G;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        LookupUiModel lookupUiModel = (LookupUiModel) map.get("ACCEPT_AUTHORIZATION_LABEL");
        if (lookupUiModel != null) {
            i0Var.f68918e.setButtonText(C32343x.m95388F(lookupUiModel.mo52391a(), new Object[0]));
        }
        LookupUiModel lookupUiModel2 = (LookupUiModel) map.get("CANCEL_AUTHORIZATION_BUTTON");
        if (lookupUiModel2 != null) {
            i0Var.f68920g.setButtonText(C32343x.m95388F(lookupUiModel2.mo52391a(), new Object[0]));
        }
        LookupUiModel lookupUiModel3 = (LookupUiModel) map.get("PAGE_HEADER_TEXT");
        if (lookupUiModel3 != null) {
            i0Var.f68939z.setText(C32343x.m95388F(lookupUiModel3.mo52391a(), new Object[0]));
        }
        LookupUiModel lookupUiModel4 = (LookupUiModel) map.get("AUTHORIZE_USER");
        if (lookupUiModel4 != null) {
            i0Var.f68912A.setText(C32343x.m95388F(lookupUiModel4.mo52391a(), new Object[0]));
        }
        i0Var.f68923j.setTitle(C32343x.m95388F("online.inst.authorization.page.details.label", new Object[0]));
    }

    /* renamed from: i3 */
    public static final void m68163i3(Context context, String str, String str2, String str3, String str4, boolean z) {
        f56552N.mo52251a(context, str, str2, str3, str4, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_identity_verification;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m68152X2().mo52305Ph(new C21503d.C21506c(C41238w.f97225a), str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27324i0 a = C27324i0.m84603a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f56554G = a;
        m68153Y2();
        m68152X2().mo52302Hw(m68146R2(), m68148T2(), m68145Q2());
        IdentityVerificationViewModel X2 = m68152X2();
        String R2 = m68146R2();
        String S2 = m68147S2();
        if (S2 == null) {
            S2 = "";
        }
        X2.mo52300Aw(R2, S2);
        C27324i0 i0Var = this.f56554G;
        C27324i0 i0Var2 = null;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        i0Var.f68918e.setOnClickListener(new C21075a(this));
        C27324i0 i0Var3 = this.f56554G;
        if (i0Var3 == null) {
            C41536l.m120506z("binding");
            i0Var3 = null;
        }
        i0Var3.f68920g.setOnClickListener(new C21076b(this));
        C27324i0 i0Var4 = this.f56554G;
        if (i0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            i0Var2 = i0Var4;
        }
        i0Var2.f68929p.mo3946b().setOnClickListener(new C21077c(this));
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        IdentityVerificationViewModel.m68211Kw(m68152X2(), new C21503d.C21504a(new Exception(str), (Object) null, 2, (DefaultConstructorMarker) null), (String) null, (String) null, (String) null, 14, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            IdentityVerificationViewModel.m68211Kw(m68152X2(), new C21503d.C21505b((Object) null, 1, (DefaultConstructorMarker) null), (String) null, (String) null, (String) null, 14, (Object) null);
        }
    }
}
