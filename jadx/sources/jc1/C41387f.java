package jc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1613n0;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10220y;
import cf1.C40419j;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41217g;
import he1.C41222k;
import ic1.C41286h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import oa1.C26918b;
import p217q2.C7833e;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.Level;
import p341ge.bog.sso_client.models.PasswordRules;
import p341ge.bog.sso_client.models.Rule;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p349ah.C9860d;
import p420fh.C12902d;
import p420fh.C12910e;
import p520mj.C16716b;
import sso.queery.UpdatePasswordQuery;
import ua1.C28660m;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: jc1.f */
public final class C41387f extends C9860d implements C41185v.C41186a {

    /* renamed from: F */
    public static final C41388a f97440F = new C41388a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C28660m f97441B;

    /* renamed from: C */
    private final C41217g f97442C = C41219i.m119469a(C41222k.SYNCHRONIZED, new C41391d(this, (C41806a) null, (C43064a) null));

    /* renamed from: D */
    private PasswordRules f97443D = new PasswordRules(C41341q.m119907j(), C41341q.m119907j());

    /* renamed from: E */
    private final C41217g f97444E = C41219i.m119469a(C41222k.NONE, new C41393f(this, (C41806a) null, (C43064a) null, new C41392e(this), (C43064a) null));

    /* renamed from: jc1.f$a */
    public static final class C41388a {
        private C41388a() {
        }

        public /* synthetic */ C41388a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41387f mo96035a() {
            return new C41387f();
        }
    }

    /* renamed from: jc1.f$b */
    public static final class C41389b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C41387f f97445d;

        /* renamed from: e */
        final /* synthetic */ StrengthView f97446e;

        /* renamed from: f */
        final /* synthetic */ List f97447f;

        /* renamed from: g */
        final /* synthetic */ C43075l f97448g;

        public C41389b(C41387f fVar, StrengthView strengthView, List list, C43075l lVar) {
            this.f97445d = fVar;
            this.f97446e = strengthView;
            this.f97447f = list;
            this.f97448g = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f97445d.m120105w2(this.f97446e, this.f97447f, String.valueOf(editable));
            C43075l lVar = this.f97448g;
            if (lVar != null) {
                Boolean bool = (Boolean) lVar.invoke(Boolean.TRUE);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: jc1.f$c */
    /* synthetic */ class C41390c extends C41535k implements C43075l {
        C41390c(Object obj) {
            super(1, obj, C41387f.class, "validatePasswordInput", "validatePasswordInput(Z)Z", 0);
        }

        /* renamed from: b */
        public final Boolean mo96039b(boolean z) {
            return Boolean.valueOf(((C41387f) this.receiver).m120085E2(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo96039b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: jc1.f$d */
    public static final class C41391d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f97449d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97450e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97451f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41391d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f97449d = componentCallbacks;
            this.f97450e = aVar;
            this.f97451f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f97449d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f97450e, this.f97451f);
        }
    }

    /* renamed from: jc1.f$e */
    public static final class C41392e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97452d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41392e(Fragment fragment) {
            super(0);
            this.f97452d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f97452d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: jc1.f$f */
    public static final class C41393f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97453d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97454e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97455f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97456g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97457h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41393f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97453d = fragment;
            this.f97454e = aVar;
            this.f97455f = aVar2;
            this.f97456g = aVar3;
            this.f97457h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97453d, this.f97454e, this.f97455f, this.f97456g, C41520a0.m120436b(C41286h.class), this.f97457h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public static final void m120081A2(C41387f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        if (!fVar.m120085E2(false)) {
            fVar.m120097o2().f72820h.mo35920c();
        } else if (!fVar.m120084D2()) {
            fVar.m120097o2().f72819g.mo35920c();
            fVar.m120097o2().f72820h.mo35921d();
        } else {
            fVar.m120097o2().f72820h.mo35921d();
            fVar.m120097o2().f72819g.mo35921d();
            fVar.m120083C2(fVar.m120097o2().f72820h.getInputText());
        }
    }

    /* renamed from: B2 */
    private final void m120082B2() {
        String a;
        StrengthView strengthView = m120097o2().f72821i;
        C10195g0 g = m120098p2().mo26716g();
        String str = "text.password.politics.header";
        if (!(g == null || (a = g.mo26763a(str, new Object[0])) == null)) {
            str = a;
        }
        strengthView.setInfoText(str);
        m120097o2().f72820h.getTextInput().setInputType(129);
        m120097o2().f72819g.getTextInput().setInputType(129);
        Input input = m120097o2().f72820h;
        C41536l.m120488h(input, "binding.passwordInput");
        C10145d.m37092f(input);
        Input input2 = m120097o2().f72819g;
        C41536l.m120488h(input2, "binding.passwordAgainInput");
        C10145d.m37092f(input2);
        m120106x2();
    }

    /* renamed from: C2 */
    private final void m120083C2(String str) {
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

    /* renamed from: D2 */
    private final boolean m120084D2() {
        return C41536l.m120484d(m120097o2().f72819g.getInputText(), m120097o2().f72820h.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public final boolean m120085E2(boolean z) {
        C16716b bVar;
        int i;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (Rule rule : this.f97443D.mo88289b()) {
            if (m120101s2(rule, m120097o2().f72820h.getInputText(), false) && rule.mo88315d() != null) {
                arrayList.add(rule.mo88315d());
            }
        }
        String str = "";
        if (arrayList.size() > 0 && this.f97443D.mo88288a().size() - 1 >= 0) {
            String str2 = str;
            while (true) {
                int i2 = i - 1;
                List<List> b = ((Level) this.f97443D.mo88288a().get(i)).mo88264b();
                if (b != null) {
                    for (List list : b) {
                        if (list != null && arrayList.containsAll(list) && (str2 = ((Level) this.f97443D.mo88288a().get(i)).mo88263a()) == null) {
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
            StrengthView strengthView = m120097o2().f72821i;
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

    /* renamed from: k2 */
    private final void m120093k2(Input input, StrengthView strengthView, List list, C43075l lVar) {
        input.getTextInput().addTextChangedListener(new C41389b(this, strengthView, list, lVar));
    }

    /* renamed from: l2 */
    private final void m120094l2() {
        m120100r2().mo89149Wk().mo4819k(getViewLifecycleOwner(), new C41382a(this));
        m120100r2().mo95752Cw().mo4819k(getViewLifecycleOwner(), new C41383b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m120095m2(C41387f fVar, C35947l lVar) {
        C41536l.m120489i(fVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            C35947l.C35951d dVar = (C35947l.C35951d) lVar;
            fVar.f97443D = (PasswordRules) dVar.mo88520a();
            StrengthView strengthView = fVar.m120097o2().f72821i;
            C41536l.m120488h(strengthView, "binding.passwordStrength");
            List b = ((PasswordRules) dVar.mo88520a()).mo88289b();
            ArrayList arrayList = new ArrayList();
            for (Object next : b) {
                if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                    arrayList.add(next);
                }
            }
            fVar.m120105w2(strengthView, arrayList, fVar.m120097o2().f72820h.getInputText());
            Input input = fVar.m120097o2().f72820h;
            C41536l.m120488h(input, "binding.passwordInput");
            StrengthView strengthView2 = fVar.m120097o2().f72821i;
            C41536l.m120488h(strengthView2, "binding.passwordStrength");
            List b2 = fVar.f97443D.mo88289b();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : b2) {
                if (C41536l.m120484d(((Rule) next2).mo88317e(), Boolean.TRUE)) {
                    arrayList2.add(next2);
                }
            }
            fVar.m120093k2(input, strengthView2, arrayList2, new C41390c(fVar));
        } else if (lVar instanceof C35947l.C35949b) {
            C41536l.m120488h(lVar, "result");
            fVar.m120103u2((C35947l.C35949b) lVar, "1");
        } else {
            boolean z = lVar instanceof C35947l.C35950c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m120096n2(C41387f fVar, C35947l lVar) {
        C41536l.m120489i(fVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            fVar.m120104v2(false);
            C1505h requireActivity = fVar.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            String string = fVar.getString(C10220y.change_password_success_message);
            C41536l.m120488h(string, "getString(R.string.chang…password_success_message)");
            C12910e.m48797o(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            fVar.mo4577k1();
        } else if (lVar instanceof C35947l.C35949b) {
            fVar.m120104v2(false);
            C41536l.m120488h(lVar, "result");
            fVar.m120103u2((C35947l.C35949b) lVar, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
        } else if (lVar instanceof C35947l.C35950c) {
            fVar.m120104v2(true);
        }
    }

    /* renamed from: o2 */
    private final C28660m m120097o2() {
        C28660m mVar = this.f97441B;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* renamed from: p2 */
    private final C10146d0.C10172e m120098p2() {
        return (C10146d0.C10172e) this.f97442C.getValue();
    }

    /* renamed from: q2 */
    private final C41185v m120099q2() {
        Fragment k0 = getChildFragmentManager().mo4418k0("ScaVerificationDialogFragment");
        if (k0 instanceof C41185v) {
            return (C41185v) k0;
        }
        return null;
    }

    /* renamed from: r2 */
    private final C41286h m120100r2() {
        return (C41286h) this.f97444E.getValue();
    }

    /* renamed from: s2 */
    private final boolean m120101s2(Rule rule, String str, boolean z) {
        if (rule.mo88314b() == null || rule.mo88319f() == null) {
            return true;
        }
        if ((!z || C41536l.m120484d(rule.mo88317e(), Boolean.TRUE)) && C41536l.m120484d(rule.mo88319f(), Boolean.valueOf(new C40419j(rule.mo88314b()).mo94489f(str)))) {
            return false;
        }
        return true;
    }

    /* renamed from: t2 */
    static /* synthetic */ boolean m120102t2(C41387f fVar, Rule rule, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return fVar.m120101s2(rule, str, z);
    }

    /* renamed from: u2 */
    private final void m120103u2(C35947l.C35949b bVar, String str) {
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

    /* renamed from: v2 */
    private final void m120104v2(boolean z) {
        m120097o2().f72817e.setLoading(z);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r2 == null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* renamed from: w2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m120105w2(p341ge.bog.designsystem.components.strength.StrengthView r10, java.util.List r11, java.lang.String r12) {
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
            ba1.d0$e r2 = r9.m120098p2()
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
            boolean r2 = m120102t2(r2, r3, r4, r5, r6, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: jc1.C41387f.m120105w2(ge.bog.designsystem.components.strength.StrengthView, java.util.List, java.lang.String):void");
    }

    /* renamed from: x2 */
    private final void m120106x2() {
        m120097o2().f72820h.setOnInputFocusChangeListener(new C41384c(this));
        m120097o2().f72819g.setOnInputFocusChangeListener(new C41385d(this));
        m120097o2().f72817e.setOnClickListener(new C41386e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public static final void m120107y2(C41387f fVar, View view, boolean z) {
        boolean z2;
        C41536l.m120489i(fVar, "this$0");
        if (z) {
            fVar.m120097o2().f72821i.setVisibility(0);
            fVar.m120097o2().f72820h.mo35919b();
            return;
        }
        if (!fVar.m120097o2().f72819g.hasFocus()) {
            fVar.m120097o2().f72821i.setVisibility(8);
        }
        if (fVar.m120097o2().f72820h.getInputText().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            fVar.m120097o2().f72821i.getProgressType();
            if (fVar.m120085E2(false)) {
                fVar.m120097o2().f72820h.mo35921d();
            } else {
                fVar.m120097o2().f72820h.mo35920c();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public static final void m120108z2(C41387f fVar, View view, boolean z) {
        C41536l.m120489i(fVar, "this$0");
        boolean z2 = false;
        if (z) {
            fVar.m120097o2().f72821i.setVisibility(0);
            fVar.m120097o2().f72819g.mo35919b();
            return;
        }
        if (!fVar.m120097o2().f72820h.hasFocus()) {
            fVar.m120097o2().f72821i.setVisibility(8);
        }
        if (fVar.m120097o2().f72819g.getInputText().length() > 0) {
            z2 = true;
        }
        if (!z2) {
            return;
        }
        if (fVar.m120084D2()) {
            fVar.m120097o2().f72819g.mo35921d();
        } else {
            fVar.m120097o2().f72819g.mo35920c();
        }
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        C41185v q2 = m120099q2();
        if (q2 != null) {
            q2.mo4577k1();
        }
        m120100r2().mo95759Jw(str, str2, m120097o2().f72820h.getInputText(), str3);
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

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f97441B = C28660m.m87751d(layoutInflater, viewGroup, true);
        mo26370a2(getString(C10220y.change_password_dialog_title));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97441B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120082B2();
        m120100r2().mo95756Gw(TMXFlags.TMX_FLAG_UPDATE_PSWD_KEY);
        m120100r2().mo95768xw();
        m120094l2();
    }
}
