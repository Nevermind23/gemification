package yc1;

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
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import cf1.C40419j;
import he1.C41217g;
import he1.C41222k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.strength.StrengthView;
import p341ge.bog.mobilebank.eventbus.events.AgreementTemplateEventKt;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.Rule;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p341ge.bog.sso_client.models.UserNameRules;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p420fh.C12902d;
import p420fh.C12910e;
import qc1.C42253o0;
import ua1.C28694y0;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: yc1.i */
public final class C43348i extends Fragment {

    /* renamed from: j */
    public static final C43349a f101175j = new C43349a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28694y0 f101176d;

    /* renamed from: e */
    private List f101177e = C41341q.m119907j();

    /* renamed from: f */
    private final C41217g f101178f = C41219i.m119469a(C41222k.NONE, new C43354f(this, (C41806a) null, (C43064a) null, new C43353e(this), (C43064a) null));

    /* renamed from: g */
    private final C41217g f101179g = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43352d(this, (C41806a) null, (C43064a) null));

    /* renamed from: h */
    private Boolean f101180h;

    /* renamed from: i */
    private String f101181i;

    /* renamed from: yc1.i$a */
    public static final class C43349a {
        private C43349a() {
        }

        public /* synthetic */ C43349a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43348i mo102023a() {
            return new C43348i();
        }
    }

    /* renamed from: yc1.i$b */
    public static final class C43350b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C43348i f101182d;

        /* renamed from: e */
        final /* synthetic */ StrengthView f101183e;

        /* renamed from: f */
        final /* synthetic */ List f101184f;

        /* renamed from: g */
        final /* synthetic */ C43075l f101185g;

        C43350b(C43348i iVar, StrengthView strengthView, List list, C43075l lVar) {
            this.f101182d = iVar;
            this.f101183e = strengthView;
            this.f101184f = list;
            this.f101185g = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f101182d.m124361B1(this.f101183e, this.f101184f, String.valueOf(editable));
            C43075l lVar = this.f101185g;
            if (lVar != null) {
                Boolean bool = (Boolean) lVar.invoke(Boolean.TRUE);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: yc1.i$c */
    static final class C43351c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43348i f101186d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43351c(C43348i iVar) {
            super(0);
            this.f101186d = iVar;
        }

        public final void invoke() {
            this.f101186d.m124381v1().mo97711Cw();
        }
    }

    /* renamed from: yc1.i$d */
    public static final class C43352d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f101187d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101188e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101189f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43352d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f101187d = componentCallbacks;
            this.f101188e = aVar;
            this.f101189f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f101187d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f101188e, this.f101189f);
        }
    }

    /* renamed from: yc1.i$e */
    public static final class C43353e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101190d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43353e(Fragment fragment) {
            super(0);
            this.f101190d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f101190d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f101190d.requireActivity());
        }
    }

    /* renamed from: yc1.i$f */
    public static final class C43354f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101191d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101192e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101193f;

        /* renamed from: g */
        final /* synthetic */ C43064a f101194g;

        /* renamed from: h */
        final /* synthetic */ C43064a f101195h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43354f(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f101191d = fragment;
            this.f101192e = aVar;
            this.f101193f = aVar2;
            this.f101194g = aVar3;
            this.f101195h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f101191d, this.f101192e, this.f101193f, this.f101194g, C41520a0.m120436b(C42253o0.class), this.f101195h);
        }
    }

    /* renamed from: A1 */
    private final void m124360A1(boolean z) {
        C28694y0 y0Var = this.f101176d;
        if (y0Var == null) {
            C41536l.m120506z("binding");
            y0Var = null;
        }
        y0Var.f73057e.setLoading(z);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        if (r2 == null) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m124361B1(p341ge.bog.designsystem.components.strength.StrengthView r10, java.util.List r11, java.lang.String r12) {
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
            ba1.d0$e r2 = r9.m124380u1()
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
            boolean r2 = m124383y1(r2, r3, r4, r5, r6, r7)
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
        throw new UnsupportedOperationException("Method not decompiled: yc1.C43348i.m124361B1(ge.bog.designsystem.components.strength.StrengthView, java.util.List, java.lang.String):void");
    }

    /* renamed from: C1 */
    private final void m124362C1() {
        C28694y0 y0Var = this.f101176d;
        C28694y0 y0Var2 = null;
        if (y0Var == null) {
            C41536l.m120506z("binding");
            y0Var = null;
        }
        y0Var.f73060h.setOnInputFocusChangeListener(new C43346g(this));
        C28694y0 y0Var3 = this.f101176d;
        if (y0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            y0Var2 = y0Var3;
        }
        y0Var2.f73057e.setOnClickListener(new C43347h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m124363D1(C43348i iVar, View view, boolean z) {
        Boolean bool;
        C41536l.m120489i(iVar, "this$0");
        boolean z2 = false;
        C28694y0 y0Var = null;
        if (z) {
            C28694y0 y0Var2 = iVar.f101176d;
            if (y0Var2 == null) {
                C41536l.m120506z("binding");
                y0Var2 = null;
            }
            y0Var2.f73061i.setVisibility(0);
            C28694y0 y0Var3 = iVar.f101176d;
            if (y0Var3 == null) {
                C41536l.m120506z("binding");
                y0Var3 = null;
            }
            y0Var3.f73060h.mo35919b();
            iVar.f101180h = null;
        } else {
            C28694y0 y0Var4 = iVar.f101176d;
            if (y0Var4 == null) {
                C41536l.m120506z("binding");
                y0Var4 = null;
            }
            y0Var4.f73061i.setVisibility(8);
            C28694y0 y0Var5 = iVar.f101176d;
            if (y0Var5 == null) {
                C41536l.m120506z("binding");
                y0Var5 = null;
            }
            if (y0Var5.f73060h.getInputText().length() > 0) {
                z2 = true;
            }
            if (z2) {
                List list = iVar.f101177e;
                C28694y0 y0Var6 = iVar.f101176d;
                if (y0Var6 == null) {
                    C41536l.m120506z("binding");
                    y0Var6 = null;
                }
                if (iVar.m124366G1(list, y0Var6.f73060h.getInputText(), iVar.f101177e.size())) {
                    C28694y0 y0Var7 = iVar.f101176d;
                    if (y0Var7 == null) {
                        C41536l.m120506z("binding");
                        y0Var7 = null;
                    }
                    y0Var7.f73060h.mo35921d();
                    bool = Boolean.TRUE;
                } else {
                    C28694y0 y0Var8 = iVar.f101176d;
                    if (y0Var8 == null) {
                        C41536l.m120506z("binding");
                        y0Var8 = null;
                    }
                    y0Var8.f73060h.mo35920c();
                    bool = Boolean.FALSE;
                }
                iVar.f101180h = bool;
            }
        }
        C28694y0 y0Var9 = iVar.f101176d;
        if (y0Var9 == null) {
            C41536l.m120506z("binding");
            y0Var9 = null;
        }
        StrengthView strengthView = y0Var9.f73061i;
        C41536l.m120488h(strengthView, "binding.usernameStrength");
        List list2 = iVar.f101177e;
        ArrayList arrayList = new ArrayList();
        for (Object next : list2) {
            if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                arrayList.add(next);
            }
        }
        C28694y0 y0Var10 = iVar.f101176d;
        if (y0Var10 == null) {
            C41536l.m120506z("binding");
        } else {
            y0Var = y0Var10;
        }
        iVar.m124361B1(strengthView, arrayList, y0Var.f73060h.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m124364E1(C43348i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        List list = iVar.f101177e;
        C28694y0 y0Var = iVar.f101176d;
        C28694y0 y0Var2 = null;
        if (y0Var == null) {
            C41536l.m120506z("binding");
            y0Var = null;
        }
        if (!iVar.m124366G1(list, y0Var.f73060h.getInputText(), iVar.f101177e.size())) {
            C28694y0 y0Var3 = iVar.f101176d;
            if (y0Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                y0Var2 = y0Var3;
            }
            y0Var2.f73060h.mo35920c();
            return;
        }
        C28694y0 y0Var4 = iVar.f101176d;
        if (y0Var4 == null) {
            C41536l.m120506z("binding");
            y0Var4 = null;
        }
        y0Var4.f73060h.mo35921d();
        C28694y0 y0Var5 = iVar.f101176d;
        if (y0Var5 == null) {
            C41536l.m120506z("binding");
            y0Var5 = null;
        }
        iVar.f101181i = y0Var5.f73060h.getInputText();
        C42253o0 v1 = iVar.m124381v1();
        C28694y0 y0Var6 = iVar.f101176d;
        if (y0Var6 == null) {
            C41536l.m120506z("binding");
        } else {
            y0Var2 = y0Var6;
        }
        v1.mo97739mx(y0Var2.f73060h.getInputText());
    }

    /* renamed from: F1 */
    private final void m124365F1() {
        String a;
        C28694y0 y0Var = this.f101176d;
        C28694y0 y0Var2 = null;
        if (y0Var == null) {
            C41536l.m120506z("binding");
            y0Var = null;
        }
        ButtonListView buttonListView = y0Var.f73059g;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        C28694y0 y0Var3 = this.f101176d;
        if (y0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            y0Var2 = y0Var3;
        }
        StrengthView strengthView = y0Var2.f73061i;
        C10195g0 g = m124380u1().mo26716g();
        String str = "text.username.politics.header";
        if (!(g == null || (a = g.mo26763a(str, new Object[0])) == null)) {
            str = a;
        }
        strengthView.setTitle(str);
    }

    /* renamed from: G1 */
    private final boolean m124366G1(List list, String str, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rule rule = (Rule) it.next();
            if (C41536l.m120484d(rule.mo88317e(), Boolean.TRUE) && m124383y1(this, rule, str, false, 4, (Object) null)) {
                i--;
            }
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: o1 */
    private final void m124374o1(Input input, StrengthView strengthView, List list, C43075l lVar) {
        input.getTextInput().addTextChangedListener(new C43350b(this, strengthView, list, lVar));
    }

    /* renamed from: p1 */
    static /* synthetic */ void m124375p1(C43348i iVar, Input input, StrengthView strengthView, List list, C43075l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = null;
        }
        iVar.m124374o1(input, strengthView, list, lVar);
    }

    /* renamed from: q1 */
    private final void m124376q1() {
        m124381v1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C43343d(this));
        m124381v1().mo97732Zc().mo4819k(getViewLifecycleOwner(), new C43344e(this));
        m124381v1().mo97724Qw().mo4819k(getViewLifecycleOwner(), new C43345f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m124377r1(C43348i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            iVar.m124360A1(false);
            iVar.f101177e = ((UserNameRules) ((C35947l.C35951d) lVar).mo88520a()).mo88432a();
            C28694y0 y0Var = iVar.f101176d;
            C28694y0 y0Var2 = null;
            if (y0Var == null) {
                C41536l.m120506z("binding");
                y0Var = null;
            }
            StrengthView strengthView = y0Var.f73061i;
            C41536l.m120488h(strengthView, "binding.usernameStrength");
            List list = iVar.f101177e;
            ArrayList arrayList = new ArrayList();
            for (Object next : list) {
                if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                    arrayList.add(next);
                }
            }
            C28694y0 y0Var3 = iVar.f101176d;
            if (y0Var3 == null) {
                C41536l.m120506z("binding");
                y0Var3 = null;
            }
            iVar.m124361B1(strengthView, arrayList, y0Var3.f73060h.getInputText());
            C28694y0 y0Var4 = iVar.f101176d;
            if (y0Var4 == null) {
                C41536l.m120506z("binding");
                y0Var4 = null;
            }
            Input input = y0Var4.f73060h;
            C41536l.m120488h(input, "binding.usernameInput");
            C28694y0 y0Var5 = iVar.f101176d;
            if (y0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                y0Var2 = y0Var5;
            }
            StrengthView strengthView2 = y0Var2.f73061i;
            C41536l.m120488h(strengthView2, "binding.usernameStrength");
            List list2 = iVar.f101177e;
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : list2) {
                if (C41536l.m120484d(((Rule) next2).mo88317e(), Boolean.TRUE)) {
                    arrayList2.add(next2);
                }
            }
            m124375p1(iVar, input, strengthView2, arrayList2, (C43075l) null, 8, (Object) null);
        } else if (lVar instanceof C35947l.C35949b) {
            iVar.m124360A1(false);
            C41536l.m120488h(lVar, "result");
            iVar.m124384z1((C35947l.C35949b) lVar, "1");
        } else if (lVar instanceof C35947l.C35950c) {
            iVar.m124360A1(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m124378s1(C43348i iVar, C35947l lVar) {
        C41536l.m120489i(iVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            iVar.m124360A1(false);
            String str = iVar.f101181i;
            if (str != null) {
                iVar.m124381v1().mo97747xx(str, true);
            }
            C1505h requireActivity = iVar.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            String string = iVar.getString(C10220y.change_username_success_message);
            C41536l.m120488h(string, "getString(R.string.chang…username_success_message)");
            C12910e.m48797o(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            iVar.m124381v1().mo97718Iw().mo32136h().mo32127e();
        } else if (lVar instanceof C35947l.C35949b) {
            iVar.m124360A1(false);
            C41536l.m120488h(lVar, "result");
            iVar.m124384z1((C35947l.C35949b) lVar, AgreementTemplateEventKt.CONTRACT_TYPE_CREFIT_INFO_CHECK_PERMISSION_OFFERS_ID);
        } else if (lVar instanceof C35947l.C35950c) {
            iVar.m124360A1(true);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m124379t1(C43348i iVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(iVar, "this$0");
        C28694y0 y0Var = iVar.f101176d;
        if (y0Var == null) {
            C41536l.m120506z("binding");
            y0Var = null;
        }
        ButtonListView buttonListView = y0Var.f73059g;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43351c(iVar));
    }

    /* renamed from: u1 */
    private final C10146d0.C10172e m124380u1() {
        return (C10146d0.C10172e) this.f101179g.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public final C42253o0 m124381v1() {
        return (C42253o0) this.f101178f.getValue();
    }

    /* renamed from: x1 */
    private final boolean m124382x1(Rule rule, String str, boolean z) {
        if (rule.mo88314b() == null || rule.mo88319f() == null) {
            return true;
        }
        if ((!z || C41536l.m120484d(rule.mo88317e(), Boolean.TRUE)) && C41536l.m120484d(rule.mo88319f(), Boolean.valueOf(new C40419j(rule.mo88314b()).mo94489f(str)))) {
            return false;
        }
        return true;
    }

    /* renamed from: y1 */
    static /* synthetic */ boolean m124383y1(C43348i iVar, Rule rule, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return iVar.m124382x1(rule, str, z);
    }

    /* renamed from: z1 */
    private final void m124384z1(C35947l.C35949b bVar, String str) {
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

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28694y0 d = C28694y0.m87896d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f101176d = d;
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
        m124381v1().mo97710Bx(TMXFlags.TMX_FLAG_CHANGE_USER_NAME_KEY);
        String processReference$sso_client_release = C10146d0.C10159c.m37143b().getProcessReference$sso_client_release();
        if (processReference$sso_client_release != null) {
            m124381v1().mo97729Ww(processReference$sso_client_release);
        }
        m124365F1();
        m124362C1();
        m124376q1();
    }
}
