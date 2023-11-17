package uc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import java.io.Serializable;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p341ge.bog.sso_client.network.ApiException;
import p420fh.C12902d;
import p420fh.C12910e;
import qc1.C42253o0;
import ua1.C28693y;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: uc1.l */
public final class C43055l extends Fragment {

    /* renamed from: h */
    public static final C43056a f100483h = new C43056a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28693y f100484d;

    /* renamed from: e */
    private final C41217g f100485e = C41219i.m119469a(C41222k.NONE, new C43061f(this, (C41806a) null, (C43064a) null, new C43060e(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f100486f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43059d(this, (C41806a) null, (C43064a) null));

    /* renamed from: g */
    private C43057b f100487g;

    /* renamed from: uc1.l$a */
    public static final class C43056a {
        private C43056a() {
        }

        public /* synthetic */ C43056a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43055l mo101641a(C43057b bVar) {
            C41536l.m120489i(bVar, "offerType");
            C43055l lVar = new C43055l();
            Bundle bundle = new Bundle();
            bundle.putSerializable("OFFER_CHANGE_PASSWORD_TYPE", bVar);
            lVar.setArguments(bundle);
            return lVar;
        }
    }

    /* renamed from: uc1.l$b */
    public enum C43057b {
        MANDATORY,
        OPTIONAL
    }

    /* renamed from: uc1.l$c */
    static final class C43058c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43055l f100491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43058c(C43055l lVar) {
            super(0);
            this.f100491d = lVar;
        }

        public final void invoke() {
            this.f100491d.m123585n1().mo97711Cw();
        }
    }

    /* renamed from: uc1.l$d */
    public static final class C43059d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f100492d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100493e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100494f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43059d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f100492d = componentCallbacks;
            this.f100493e = aVar;
            this.f100494f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f100492d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f100493e, this.f100494f);
        }
    }

    /* renamed from: uc1.l$e */
    public static final class C43060e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100495d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43060e(Fragment fragment) {
            super(0);
            this.f100495d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f100495d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f100495d.requireActivity());
        }
    }

    /* renamed from: uc1.l$f */
    public static final class C43061f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100496d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100497e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100498f;

        /* renamed from: g */
        final /* synthetic */ C43064a f100499g;

        /* renamed from: h */
        final /* synthetic */ C43064a f100500h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43061f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f100496d = fragment;
            this.f100497e = aVar;
            this.f100498f = aVar2;
            this.f100499g = aVar3;
            this.f100500h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f100496d, this.f100497e, this.f100498f, this.f100499g, C41520a0.m120436b(C42253o0.class), this.f100500h);
        }
    }

    /* renamed from: m1 */
    private final C10146d0.C10172e m123584m1() {
        return (C10146d0.C10172e) this.f100486f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final C42253o0 m123585n1() {
        return (C42253o0) this.f100485e.getValue();
    }

    /* renamed from: o1 */
    private final void m123586o1(C35947l.C35949b bVar) {
        ApiException apiException;
        Throwable a = bVar.mo88517a();
        String str = null;
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str = apiException.getErrorMessage();
        }
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        if (str == null) {
            str = getString(C10220y.common_text_service_error);
            C41536l.m120488h(str, "getString(R.string.common_text_service_error)");
        }
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public static final void m123587p1(C43055l lVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(lVar, "this$0");
        C28693y yVar = lVar.f100484d;
        if (yVar == null) {
            C41536l.m120506z("binding");
            yVar = null;
        }
        ButtonListView buttonListView = yVar.f73055h;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43058c(lVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m123588q1(C43055l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m123585n1().mo97709Bw();
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m123589r1(C43055l lVar, View view) {
        C41536l.m120489i(lVar, "this$0");
        lVar.m123585n1().mo97737kx();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m123590s1(C43055l lVar, C35947l lVar2) {
        C41536l.m120489i(lVar, "this$0");
        if (lVar2 instanceof C35947l.C35951d) {
            lVar.m123591t1(false);
            lVar.m123585n1().mo97718Iw().mo32133e().mo32127e();
        } else if (lVar2 instanceof C35947l.C35949b) {
            lVar.m123591t1(false);
            C41536l.m120488h(lVar2, "result");
            lVar.m123586o1((C35947l.C35949b) lVar2);
        } else if (lVar2 instanceof C35947l.C35950c) {
            lVar.m123591t1(true);
        }
    }

    /* renamed from: t1 */
    private final void m123591t1(boolean z) {
        C28693y yVar = this.f100484d;
        if (yVar == null) {
            C41536l.m120506z("binding");
            yVar = null;
        }
        yVar.f73052e.setLoading(z);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28693y d = C28693y.m87891d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f100484d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        String a;
        String a2;
        C41536l.m120489i(view, "view");
        Bundle arguments = getArguments();
        C28693y yVar = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("OFFER_CHANGE_PASSWORD_TYPE");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            C43057b bVar = (C43057b) serializable;
            this.f100487g = bVar;
            if (bVar == C43057b.MANDATORY) {
                C28693y yVar2 = this.f100484d;
                if (yVar2 == null) {
                    C41536l.m120506z("binding");
                    yVar2 = null;
                }
                PageDescriptionView pageDescriptionView = yVar2.f73054g;
                C10195g0 g = m123584m1().mo26716g();
                String str = "text.sso.loginServices.password_change_requirements";
                if (!(g == null || (a2 = g.mo26763a(str, new Object[0])) == null)) {
                    str = a2;
                }
                pageDescriptionView.setText(str);
                C28693y yVar3 = this.f100484d;
                if (yVar3 == null) {
                    C41536l.m120506z("binding");
                    yVar3 = null;
                }
                yVar3.f73052e.setVisibility(8);
            } else {
                C43057b bVar2 = this.f100487g;
                if (bVar2 == null) {
                    C41536l.m120506z("offerType");
                    bVar2 = null;
                }
                if (bVar2 == C43057b.OPTIONAL) {
                    C28693y yVar4 = this.f100484d;
                    if (yVar4 == null) {
                        C41536l.m120506z("binding");
                        yVar4 = null;
                    }
                    PageDescriptionView pageDescriptionView2 = yVar4.f73054g;
                    C10195g0 g2 = m123584m1().mo26716g();
                    String str2 = "text.sso.loginServices.password_change_required";
                    if (!(g2 == null || (a = g2.mo26763a(str2, new Object[0])) == null)) {
                        str2 = a;
                    }
                    pageDescriptionView2.setText(str2);
                    C28693y yVar5 = this.f100484d;
                    if (yVar5 == null) {
                        C41536l.m120506z("binding");
                        yVar5 = null;
                    }
                    yVar5.f73052e.setVisibility(0);
                }
            }
            C28693y yVar6 = this.f100484d;
            if (yVar6 == null) {
                C41536l.m120506z("binding");
                yVar6 = null;
            }
            ButtonListView buttonListView = yVar6.f73055h;
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
            m123585n1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C43051h(this));
            C28693y yVar7 = this.f100484d;
            if (yVar7 == null) {
                C41536l.m120506z("binding");
                yVar7 = null;
            }
            yVar7.f73053f.setOnClickListener(new C43052i(this));
            C28693y yVar8 = this.f100484d;
            if (yVar8 == null) {
                C41536l.m120506z("binding");
            } else {
                yVar = yVar8;
            }
            yVar.f73052e.setOnClickListener(new C43053j(this));
            m123585n1().mo97728Uw().mo4819k(getViewLifecycleOwner(), new C43054k(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type ge.bog.sso_client.signin.steps.changepassword.OfferChangePasswordSignInFragment.OfferChangePasswordType");
    }
}
