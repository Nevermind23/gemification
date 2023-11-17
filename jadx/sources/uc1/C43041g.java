package uc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10214s;
import ba1.C10220y;
import cf1.C40419j;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41222k;
import ic1.C41286h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import oa1.C26918b;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.Level;
import p341ge.bog.sso_client.models.PasswordRules;
import p341ge.bog.sso_client.models.Rule;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p420fh.C12902d;
import p420fh.C12910e;
import p520mj.C16716b;
import qc1.C42253o0;
import sso.queery.UpdatePasswordQuery;
import ua1.C28663n;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: uc1.g */
public final class C43041g extends Fragment implements C41185v.C41186a {

    /* renamed from: i */
    public static final C43042a f100453i = new C43042a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28663n f100454d;

    /* renamed from: e */
    private final C41217g f100455e = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43046e(this, (C41806a) null, (C43064a) null));

    /* renamed from: f */
    private PasswordRules f100456f = new PasswordRules(C41341q.m119907j(), C41341q.m119907j());

    /* renamed from: g */
    private final C41217g f100457g;

    /* renamed from: h */
    private final C41217g f100458h;

    /* renamed from: uc1.g$a */
    public static final class C43042a {
        private C43042a() {
        }

        public /* synthetic */ C43042a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43041g mo101630a() {
            return new C43041g();
        }
    }

    /* renamed from: uc1.g$b */
    public static final class C43043b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43041g f100459d;

        /* renamed from: e */
        final /* synthetic */ StrengthView f100460e;

        /* renamed from: f */
        final /* synthetic */ List f100461f;

        /* renamed from: g */
        final /* synthetic */ C43075l f100462g;

        public C43043b(C43041g gVar, StrengthView strengthView, List list, C43075l lVar) {
            this.f100459d = gVar;
            this.f100460e = strengthView;
            this.f100461f = list;
            this.f100462g = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f100459d.m123542D1(this.f100460e, this.f100461f, String.valueOf(editable));
            C43075l lVar = this.f100462g;
            if (lVar != null) {
                Boolean bool = (Boolean) lVar.invoke(Boolean.TRUE);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: uc1.g$c */
    /* synthetic */ class C43044c extends C41535k implements C43075l {
        C43044c(Object obj) {
            super(1, obj, C43041g.class, "validatePasswordInput", "validatePasswordInput(Z)Z", 0);
        }

        /* renamed from: b */
        public final Boolean mo101634b(boolean z) {
            return Boolean.valueOf(((C43041g) this.receiver).m123551M1(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo101634b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: uc1.g$d */
    static final class C43045d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43041g f100463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43045d(C43041g gVar) {
            super(0);
            this.f100463d = gVar;
        }

        public final void invoke() {
            this.f100463d.m123567x1().mo97711Cw();
        }
    }

    /* renamed from: uc1.g$e */
    public static final class C43046e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f100464d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100465e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100466f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43046e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f100464d = componentCallbacks;
            this.f100465e = aVar;
            this.f100466f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f100464d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f100465e, this.f100466f);
        }
    }

    /* renamed from: uc1.g$f */
    public static final class C43047f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100467d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43047f(Fragment fragment) {
            super(0);
            this.f100467d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f100467d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f100467d.requireActivity());
        }
    }

    /* renamed from: uc1.g$g */
    public static final class C43048g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100468d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100469e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100470f;

        /* renamed from: g */
        final /* synthetic */ C43064a f100471g;

        /* renamed from: h */
        final /* synthetic */ C43064a f100472h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43048g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f100468d = fragment;
            this.f100469e = aVar;
            this.f100470f = aVar2;
            this.f100471g = aVar3;
            this.f100472h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f100468d, this.f100469e, this.f100470f, this.f100471g, C41520a0.m120436b(C42253o0.class), this.f100472h);
        }
    }

    /* renamed from: uc1.g$h */
    public static final class C43049h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100473d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43049h(Fragment fragment) {
            super(0);
            this.f100473d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f100473d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: uc1.g$i */
    public static final class C43050i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100474d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100475e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100476f;

        /* renamed from: g */
        final /* synthetic */ C43064a f100477g;

        /* renamed from: h */
        final /* synthetic */ C43064a f100478h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43050i(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f100474d = fragment;
            this.f100475e = aVar;
            this.f100476f = aVar2;
            this.f100477g = aVar3;
            this.f100478h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f100474d, this.f100475e, this.f100476f, this.f100477g, C41520a0.m120436b(C41286h.class), this.f100478h);
        }
    }

    public C43041g() {
        C43049h hVar = new C43049h(this);
        C41222k kVar = C41222k.NONE;
        this.f100457g = C41219i.m119469a(kVar, new C43050i(this, (C41806a) null, (C43064a) null, hVar, (C43064a) null));
        this.f100458h = C41219i.m119469a(kVar, new C43048g(this, (C41806a) null, (C43064a) null, new C43047f(this), (C43064a) null));
    }

    /* renamed from: A1 */
    static /* synthetic */ boolean m123539A1(C43041g gVar, Rule rule, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return gVar.m123569z1(rule, str, z);
    }

    /* renamed from: B1 */
    private final void m123540B1(C35947l.C35949b bVar, String str) {
        ApiException apiException;
        Throwable a = bVar.mo88517a();
        String str2 = null;
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str2 = apiException.getErrorMessage();
        }
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        if (str2 == null) {
            str2 = getString(C10220y.common_text_service_error) + ' ' + str;
        }
        C12910e.m48790h(requireActivity, str2, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: C1 */
    private final void m123541C1(boolean z) {
        C28663n nVar = this.f100454d;
        if (nVar == null) {
            C41536l.m120506z("binding");
            nVar = null;
        }
        nVar.f72840e.setLoading(z);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r2 == null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* renamed from: D1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m123542D1(p341ge.bog.designsystem.components.strength.StrengthView r10, java.util.List r11, java.lang.String r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = ie1.C41343r.m119925u(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x000f:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r11.next()
            r3 = r1
            ge.bog.sso_client.models.Rule r3 = (p341ge.bog.sso_client.models.Rule) r3
            he1.m r1 = new he1.m
            ba1.d0$e r2 = r9.m123565u1()
            ba1.g0 r2 = r2.mo26716g()
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x003a
            java.lang.String r5 = r3.mo88313a()
            if (r5 != 0) goto L_0x0031
            r5 = r4
        L_0x0031:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r2 = r2.mo26763a(r5, r6)
            if (r2 != 0) goto L_0x0042
        L_0x003a:
            java.lang.String r2 = r3.mo88313a()
            if (r2 != 0) goto L_0x0042
            r8 = r4
            goto L_0x0043
        L_0x0042:
            r8 = r2
        L_0x0043:
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r9
            r4 = r12
            boolean r2 = m123539A1(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0051
            ge.bog.designsystem.components.list.e r2 = p341ge.bog.designsystem.components.list.C13368e.POSITIVE
            goto L_0x0053
        L_0x0051:
            ge.bog.designsystem.components.list.e r2 = p341ge.bog.designsystem.components.list.C13368e.INFORMATION
        L_0x0053:
            r1.<init>(r8, r2)
            r0.add(r1)
            goto L_0x000f
        L_0x005a:
            r10.setStatusList(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc1.C43041g.m123542D1(ge.bog.designsystem.components.strength.StrengthView, java.util.List, java.lang.String):void");
    }

    /* renamed from: E1 */
    private final void m123543E1() {
        C28663n nVar = this.f100454d;
        C28663n nVar2 = null;
        if (nVar == null) {
            C41536l.m120506z("binding");
            nVar = null;
        }
        nVar.f72843h.setOnInputFocusChangeListener(new C43038d(this));
        C28663n nVar3 = this.f100454d;
        if (nVar3 == null) {
            C41536l.m120506z("binding");
            nVar3 = null;
        }
        nVar3.f72842g.setOnInputFocusChangeListener(new C43039e(this));
        C28663n nVar4 = this.f100454d;
        if (nVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            nVar2 = nVar4;
        }
        nVar2.f72840e.setOnClickListener(new C43040f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F1 */
    public static final void m123544F1(C43041g gVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        C28663n nVar = null;
        if (!gVar.m123551M1(false)) {
            C28663n nVar2 = gVar.f100454d;
            if (nVar2 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar2;
            }
            nVar.f72843h.mo35920c();
        } else if (!gVar.m123550L1()) {
            C28663n nVar3 = gVar.f100454d;
            if (nVar3 == null) {
                C41536l.m120506z("binding");
                nVar3 = null;
            }
            nVar3.f72842g.mo35920c();
            C28663n nVar4 = gVar.f100454d;
            if (nVar4 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar4;
            }
            nVar.f72843h.mo35921d();
        } else {
            C28663n nVar5 = gVar.f100454d;
            if (nVar5 == null) {
                C41536l.m120506z("binding");
                nVar5 = null;
            }
            nVar5.f72843h.mo35921d();
            C28663n nVar6 = gVar.f100454d;
            if (nVar6 == null) {
                C41536l.m120506z("binding");
                nVar6 = null;
            }
            nVar6.f72842g.mo35921d();
            C28663n nVar7 = gVar.f100454d;
            if (nVar7 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar7;
            }
            gVar.m123549K1(nVar.f72843h.getInputText());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m123545G1(C43041g gVar, View view, boolean z) {
        boolean z2;
        C41536l.m120489i(gVar, "this$0");
        C28663n nVar = null;
        if (z) {
            C28663n nVar2 = gVar.f100454d;
            if (nVar2 == null) {
                C41536l.m120506z("binding");
                nVar2 = null;
            }
            nVar2.f72844i.setVisibility(0);
            C28663n nVar3 = gVar.f100454d;
            if (nVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar3;
            }
            nVar.f72843h.mo35919b();
            return;
        }
        C28663n nVar4 = gVar.f100454d;
        if (nVar4 == null) {
            C41536l.m120506z("binding");
            nVar4 = null;
        }
        if (!nVar4.f72842g.hasFocus()) {
            C28663n nVar5 = gVar.f100454d;
            if (nVar5 == null) {
                C41536l.m120506z("binding");
                nVar5 = null;
            }
            nVar5.f72844i.setVisibility(8);
        }
        C28663n nVar6 = gVar.f100454d;
        if (nVar6 == null) {
            C41536l.m120506z("binding");
            nVar6 = null;
        }
        if (nVar6.f72843h.getInputText().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C28663n nVar7 = gVar.f100454d;
            if (nVar7 == null) {
                C41536l.m120506z("binding");
                nVar7 = null;
            }
            nVar7.f72844i.getProgressType();
            if (gVar.m123551M1(false)) {
                C28663n nVar8 = gVar.f100454d;
                if (nVar8 == null) {
                    C41536l.m120506z("binding");
                } else {
                    nVar = nVar8;
                }
                nVar.f72843h.mo35921d();
                return;
            }
            C28663n nVar9 = gVar.f100454d;
            if (nVar9 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar9;
            }
            nVar.f72843h.mo35920c();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m123546H1(C43041g gVar, View view, boolean z) {
        C41536l.m120489i(gVar, "this$0");
        boolean z2 = false;
        C28663n nVar = null;
        if (z) {
            C28663n nVar2 = gVar.f100454d;
            if (nVar2 == null) {
                C41536l.m120506z("binding");
                nVar2 = null;
            }
            nVar2.f72844i.setVisibility(0);
            C28663n nVar3 = gVar.f100454d;
            if (nVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar3;
            }
            nVar.f72842g.mo35919b();
            return;
        }
        C28663n nVar4 = gVar.f100454d;
        if (nVar4 == null) {
            C41536l.m120506z("binding");
            nVar4 = null;
        }
        if (!nVar4.f72843h.hasFocus()) {
            C28663n nVar5 = gVar.f100454d;
            if (nVar5 == null) {
                C41536l.m120506z("binding");
                nVar5 = null;
            }
            nVar5.f72844i.setVisibility(8);
        }
        C28663n nVar6 = gVar.f100454d;
        if (nVar6 == null) {
            C41536l.m120506z("binding");
            nVar6 = null;
        }
        if (nVar6.f72842g.getInputText().length() > 0) {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        if (gVar.m123550L1()) {
            C28663n nVar7 = gVar.f100454d;
            if (nVar7 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar7;
            }
            nVar.f72842g.mo35921d();
            return;
        }
        C28663n nVar8 = gVar.f100454d;
        if (nVar8 == null) {
            C41536l.m120506z("binding");
        } else {
            nVar = nVar8;
        }
        nVar.f72842g.mo35920c();
    }

    /* renamed from: I1 */
    private final void m123547I1() {
        C28663n nVar = this.f100454d;
        C28663n nVar2 = null;
        if (nVar == null) {
            C41536l.m120506z("binding");
            nVar = null;
        }
        ButtonListView buttonListView = nVar.f72845j;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        m123567x1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C43035a(this));
        C28663n nVar3 = this.f100454d;
        if (nVar3 == null) {
            C41536l.m120506z("binding");
            nVar3 = null;
        }
        nVar3.f72843h.getTextInput().setInputType(129);
        C28663n nVar4 = this.f100454d;
        if (nVar4 == null) {
            C41536l.m120506z("binding");
            nVar4 = null;
        }
        nVar4.f72842g.getTextInput().setInputType(129);
        C28663n nVar5 = this.f100454d;
        if (nVar5 == null) {
            C41536l.m120506z("binding");
            nVar5 = null;
        }
        Input input = nVar5.f72843h;
        C41536l.m120488h(input, "binding.passwordInput");
        C10145d.m37092f(input);
        C28663n nVar6 = this.f100454d;
        if (nVar6 == null) {
            C41536l.m120506z("binding");
        } else {
            nVar2 = nVar6;
        }
        Input input2 = nVar2.f72842g;
        C41536l.m120488h(input2, "binding.passwordAgainInput");
        C10145d.m37092f(input2);
        m123543E1();
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m123548J1(C43041g gVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(gVar, "this$0");
        C28663n nVar = gVar.f100454d;
        if (nVar == null) {
            C41536l.m120506z("binding");
            nVar = null;
        }
        ButtonListView buttonListView = nVar.f72845j;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43045d(gVar));
    }

    /* renamed from: K1 */
    private final void m123549K1(String str) {
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            HashMap hashMap = new HashMap(C26918b.m83690b(new UpdatePasswordQuery((C7833e) null, (C7833e) null, str, processReference$sso_client_release, (C7833e) null, 19, (DefaultConstructorMarker) null)));
            hashMap.put("tmxSessionId", C10146d0.C10177h.m37232a());
            C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, "LoginServices.updatePassword", hashMap, (C41143c) null, 4, (Object) null);
            FragmentManager childFragmentManager = getChildFragmentManager();
            C41536l.m120488h(childFragmentManager, "childFragmentManager");
            e.mo4576A1(childFragmentManager, (String) null);
        }
    }

    /* renamed from: L1 */
    private final boolean m123550L1() {
        C28663n nVar = this.f100454d;
        C28663n nVar2 = null;
        if (nVar == null) {
            C41536l.m120506z("binding");
            nVar = null;
        }
        String inputText = nVar.f72842g.getInputText();
        C28663n nVar3 = this.f100454d;
        if (nVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            nVar2 = nVar3;
        }
        return C41536l.m120484d(inputText, nVar2.f72843h.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final boolean m123551M1(boolean z) {
        C28663n nVar;
        C16716b bVar;
        int i;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f100456f.mo88289b().iterator();
        while (true) {
            nVar = null;
            if (!it.hasNext()) {
                break;
            }
            Rule rule = (Rule) it.next();
            C28663n nVar2 = this.f100454d;
            if (nVar2 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar2;
            }
            if (m123569z1(rule, nVar.f72843h.getInputText(), false) && rule.mo88315d() != null) {
                arrayList.add(rule.mo88315d());
            }
        }
        String str = "";
        if (arrayList.size() > 0 && this.f100456f.mo88288a().size() - 1 >= 0) {
            String str2 = str;
            while (true) {
                int i2 = i - 1;
                List<List> b = ((Level) this.f100456f.mo88288a().get(i)).mo88264b();
                if (b != null) {
                    for (List list : b) {
                        if (list != null && arrayList.containsAll(list) && (str2 = ((Level) this.f100456f.mo88288a().get(i)).mo88263a()) == null) {
                            str2 = str;
                        }
                    }
                }
                if (str2.length() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && i2 >= 0) {
                    i = i2;
                }
            }
            str = str2;
        }
        if (z) {
            C28663n nVar3 = this.f100454d;
            if (nVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar = nVar3;
            }
            StrengthView strengthView = nVar.f72844i;
            int hashCode = str.hashCode();
            if (hashCode != -2024701067) {
                if (hashCode != 2210027) {
                    if (hashCode == 2660216 && str.equals("WEAK")) {
                        bVar = C16716b.WEAK;
                        strengthView.setProgressType(bVar);
                    }
                } else if (str.equals("HARD")) {
                    bVar = C16716b.STRONG;
                    strengthView.setProgressType(bVar);
                }
            } else if (str.equals("MEDIUM")) {
                bVar = C16716b.AVERAGE;
                strengthView.setProgressType(bVar);
            }
            bVar = C16716b.UNVERIFIED;
            strengthView.setProgressType(bVar);
        }
        if (str.length() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q1 */
    private final void m123561q1(Input input, StrengthView strengthView, List list, C43075l lVar) {
        input.getTextInput().addTextChangedListener(new C43043b(this, strengthView, list, lVar));
    }

    /* renamed from: r1 */
    private final void m123562r1() {
        m123568y1().mo89149Wk().mo4819k(getViewLifecycleOwner(), new C43036b(this));
        m123568y1().mo95752Cw().mo4819k(getViewLifecycleOwner(), new C43037c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m123563s1(C43041g gVar, C35947l lVar) {
        C41536l.m120489i(gVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            C35947l.C35951d dVar = (C35947l.C35951d) lVar;
            gVar.f100456f = (PasswordRules) dVar.mo88520a();
            C28663n nVar = gVar.f100454d;
            C28663n nVar2 = null;
            if (nVar == null) {
                C41536l.m120506z("binding");
                nVar = null;
            }
            StrengthView strengthView = nVar.f72844i;
            C41536l.m120488h(strengthView, "binding.passwordStrength");
            List b = ((PasswordRules) dVar.mo88520a()).mo88289b();
            ArrayList arrayList = new ArrayList();
            for (Object next : b) {
                if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                    arrayList.add(next);
                }
            }
            C28663n nVar3 = gVar.f100454d;
            if (nVar3 == null) {
                C41536l.m120506z("binding");
                nVar3 = null;
            }
            gVar.m123542D1(strengthView, arrayList, nVar3.f72843h.getInputText());
            C28663n nVar4 = gVar.f100454d;
            if (nVar4 == null) {
                C41536l.m120506z("binding");
                nVar4 = null;
            }
            Input input = nVar4.f72843h;
            C41536l.m120488h(input, "binding.passwordInput");
            C28663n nVar5 = gVar.f100454d;
            if (nVar5 == null) {
                C41536l.m120506z("binding");
            } else {
                nVar2 = nVar5;
            }
            StrengthView strengthView2 = nVar2.f72844i;
            C41536l.m120488h(strengthView2, "binding.passwordStrength");
            List b2 = gVar.f100456f.mo88289b();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : b2) {
                if (C41536l.m120484d(((Rule) next2).mo88317e(), Boolean.TRUE)) {
                    arrayList2.add(next2);
                }
            }
            gVar.m123561q1(input, strengthView2, arrayList2, new C43044c(gVar));
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "result");
            gVar.m123540B1((C35947l.C35949b) lVar, "1");
        } else {
            boolean z = lVar instanceof C35947l.C35950c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m123564t1(C43041g gVar, C35947l lVar) {
        C41536l.m120489i(gVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            gVar.m123541C1(false);
            C1505h requireActivity = gVar.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            String string = gVar.getString(C10220y.change_password_success_message);
            C41536l.m120488h(string, "getString(R.string.chang…password_success_message)");
            C12910e.m48797o(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            gVar.m123567x1().mo97718Iw().mo32133e().mo32127e();
        } else if (lVar instanceof C35947l.C35949b) {
            gVar.m123541C1(false);
            C41536l.m120488h(lVar, "result");
            gVar.m123540B1((C35947l.C35949b) lVar, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
        } else if (lVar instanceof C35947l.C35950c) {
            gVar.m123541C1(true);
        }
    }

    /* renamed from: u1 */
    private final C10146d0.C10172e m123565u1() {
        return (C10146d0.C10172e) this.f100455e.getValue();
    }

    /* renamed from: v1 */
    private final C41185v m123566v1() {
        Fragment k0 = getChildFragmentManager().mo4418k0("ScaVerificationDialogFragment");
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public final C42253o0 m123567x1() {
        return (C42253o0) this.f100458h.getValue();
    }

    /* renamed from: y1 */
    private final C41286h m123568y1() {
        return (C41286h) this.f100457g.getValue();
    }

    /* renamed from: z1 */
    private final boolean m123569z1(Rule rule, String str, boolean z) {
        if (rule.mo88314b() == null || rule.mo88319f() == null) {
            return true;
        }
        if ((!z || C41536l.m120484d(rule.mo88317e(), Boolean.TRUE)) && C41536l.m120484d(rule.mo88319f(), Boolean.valueOf(new C40419j(rule.mo88314b()).mo94489f(str)))) {
            return false;
        }
        return true;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v v1 = m123566v1();
        if (v1 != null) {
            v1.mo4577k1();
        }
        C41286h y1 = m123568y1();
        C28663n nVar = this.f100454d;
        if (nVar == null) {
            C41536l.m120506z("binding");
            nVar = null;
        }
        y1.mo95759Jw(str, str2, nVar.f72843h.getInputText(), str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28663n d = C28663n.m87764d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f100454d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m123547I1();
        m123568y1().mo95756Gw(TMXFlags.TMX_FLAG_UPDATE_PSWD_KEY);
        m123568y1().mo95768xw();
        m123562r1();
    }
}
