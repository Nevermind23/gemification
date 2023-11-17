package pc1;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import ba1.C10145d;
import ba1.C10146d0;
import ba1.C10195g0;
import cf1.C40419j;
import he1.C41217g;
import he1.C41222k;
import he1.C41223l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.strength.StrengthView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.Level;
import p341ge.bog.sso_client.models.PasswordRules;
import p341ge.bog.sso_client.models.Rule;
import p341ge.bog.sso_client.models.UserNameRules;
import p520mj.C16716b;
import ua1.C28676r0;
import ue1.C43064a;
import ue1.C43075l;
import wg1.C43241a;

/* renamed from: pc1.p */
public final class C42137p extends Fragment {

    /* renamed from: k */
    public static final C42138a f99091k = new C42138a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28676r0 f99092d;

    /* renamed from: e */
    private final C41217g f99093e;

    /* renamed from: f */
    private final C41217g f99094f;

    /* renamed from: g */
    private UserNameRules f99095g = new UserNameRules(C41341q.m119907j());

    /* renamed from: h */
    private PasswordRules f99096h = new PasswordRules(C41341q.m119907j(), C41341q.m119907j());

    /* renamed from: i */
    private Boolean f99097i;

    /* renamed from: j */
    private final C41217g f99098j = C41219i.m119470b(new C42140c(this));

    /* renamed from: pc1.p$a */
    public static final class C42138a {
        private C42138a() {
        }

        public /* synthetic */ C42138a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C42137p m122392b(C42138a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return aVar.mo97634a(z);
        }

        /* renamed from: a */
        public final C42137p mo97634a(boolean z) {
            C42137p pVar = new C42137p();
            Bundle bundle = new Bundle();
            bundle.putBoolean("FROM_RECOVERY_PASSWORD", z);
            pVar.setArguments(bundle);
            return pVar;
        }
    }

    /* renamed from: pc1.p$b */
    public static final class C42139b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C42137p f99099d;

        /* renamed from: e */
        final /* synthetic */ StrengthView f99100e;

        /* renamed from: f */
        final /* synthetic */ List f99101f;

        /* renamed from: g */
        final /* synthetic */ C43075l f99102g;

        C42139b(C42137p pVar, StrengthView strengthView, List list, C43075l lVar) {
            this.f99099d = pVar;
            this.f99100e = strengthView;
            this.f99101f = list;
            this.f99102g = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f99099d.m122363F1(this.f99100e, this.f99101f, String.valueOf(editable));
            C43075l lVar = this.f99102g;
            if (lVar != null) {
                Boolean bool = (Boolean) lVar.invoke(Boolean.TRUE);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: pc1.p$c */
    static final class C42140c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42137p f99103d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42140c(C42137p pVar) {
            super(0);
            this.f99103d = pVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f99103d.getArguments();
            boolean z = false;
            if (arguments != null) {
                z = arguments.getBoolean("FROM_RECOVERY_PASSWORD", false);
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: pc1.p$d */
    /* synthetic */ class C42141d extends C41535k implements C43075l {
        C42141d(Object obj) {
            super(1, obj, C42137p.class, "validatePasswordInput", "validatePasswordInput(Z)Z", 0);
        }

        /* renamed from: b */
        public final Boolean mo97639b(boolean z) {
            return Boolean.valueOf(((C42137p) this.receiver).m122373P1(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return mo97639b(((Boolean) obj).booleanValue());
        }
    }

    /* renamed from: pc1.p$e */
    public static final class C42142e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f99104d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99105e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99106f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42142e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f99104d = componentCallbacks;
            this.f99105e = aVar;
            this.f99106f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f99104d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C42117a.class), this.f99105e, this.f99106f);
        }
    }

    /* renamed from: pc1.p$f */
    public static final class C42143f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f99107d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99108e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99109f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42143f(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f99107d = componentCallbacks;
            this.f99108e = aVar;
            this.f99109f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f99107d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f99108e, this.f99109f);
        }
    }

    public C42137p() {
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f99093e = C41219i.m119469a(kVar, new C42142e(this, (C41806a) null, (C43064a) null));
        this.f99094f = C41219i.m119469a(kVar, new C42143f(this, (C41806a) null, (C43064a) null));
    }

    /* renamed from: A1 */
    static /* synthetic */ boolean m122358A1(C42137p pVar, Rule rule, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return pVar.m122391z1(rule, str, z);
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m122359B1(C42137p pVar, C35947l lVar) {
        C41536l.m120489i(pVar, "this$0");
        C28676r0 r0Var = null;
        if (lVar instanceof C35947l.C35951d) {
            C35947l.C35951d dVar = (C35947l.C35951d) lVar;
            pVar.f99095g = (UserNameRules) dVar.mo88520a();
            C28676r0 r0Var2 = pVar.f99092d;
            if (r0Var2 == null) {
                C41536l.m120506z("binding");
                r0Var2 = null;
            }
            StrengthView strengthView = r0Var2.f72912l;
            C41536l.m120488h(strengthView, "binding.userNameStrength");
            List a = ((UserNameRules) dVar.mo88520a()).mo88432a();
            ArrayList arrayList = new ArrayList();
            for (Object next : a) {
                if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                    arrayList.add(next);
                }
            }
            C28676r0 r0Var3 = pVar.f99092d;
            if (r0Var3 == null) {
                C41536l.m120506z("binding");
                r0Var3 = null;
            }
            pVar.m122363F1(strengthView, arrayList, r0Var3.f72911k.getInputText());
            C28676r0 r0Var4 = pVar.f99092d;
            if (r0Var4 == null) {
                C41536l.m120506z("binding");
                r0Var4 = null;
            }
            Input input = r0Var4.f72911k;
            C41536l.m120488h(input, "binding.userNameInput");
            C28676r0 r0Var5 = pVar.f99092d;
            if (r0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var = r0Var5;
            }
            StrengthView strengthView2 = r0Var.f72912l;
            C41536l.m120488h(strengthView2, "binding.userNameStrength");
            List a2 = pVar.f99095g.mo88432a();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : a2) {
                if (C41536l.m120484d(((Rule) next2).mo88317e(), Boolean.TRUE)) {
                    arrayList2.add(next2);
                }
            }
            m122387u1(pVar, input, strengthView2, arrayList2, (C43075l) null, 8, (Object) null);
        } else if (lVar instanceof C35947l.C35949b) {
            throw new C41223l((String) null, 1, (DefaultConstructorMarker) null);
        } else if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            throw new C41223l((String) null, 1, (DefaultConstructorMarker) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m122360C1(C42137p pVar, C35947l lVar) {
        C41536l.m120489i(pVar, "this$0");
        C28676r0 r0Var = null;
        if (lVar instanceof C35947l.C35951d) {
            C35947l.C35951d dVar = (C35947l.C35951d) lVar;
            pVar.f99096h = (PasswordRules) dVar.mo88520a();
            C28676r0 r0Var2 = pVar.f99092d;
            if (r0Var2 == null) {
                C41536l.m120506z("binding");
                r0Var2 = null;
            }
            StrengthView strengthView = r0Var2.f72910j;
            C41536l.m120488h(strengthView, "binding.passwordStrength");
            List b = ((PasswordRules) dVar.mo88520a()).mo88289b();
            ArrayList arrayList = new ArrayList();
            for (Object next : b) {
                if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                    arrayList.add(next);
                }
            }
            C28676r0 r0Var3 = pVar.f99092d;
            if (r0Var3 == null) {
                C41536l.m120506z("binding");
                r0Var3 = null;
            }
            pVar.m122363F1(strengthView, arrayList, r0Var3.f72909i.getInputText());
            C28676r0 r0Var4 = pVar.f99092d;
            if (r0Var4 == null) {
                C41536l.m120506z("binding");
                r0Var4 = null;
            }
            Input input = r0Var4.f72909i;
            C41536l.m120488h(input, "binding.passwordInput");
            C28676r0 r0Var5 = pVar.f99092d;
            if (r0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var = r0Var5;
            }
            StrengthView strengthView2 = r0Var.f72910j;
            C41536l.m120488h(strengthView2, "binding.passwordStrength");
            List b2 = pVar.f99096h.mo88289b();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : b2) {
                if (C41536l.m120484d(((Rule) next2).mo88317e(), Boolean.TRUE)) {
                    arrayList2.add(next2);
                }
            }
            pVar.m122386t1(input, strengthView2, arrayList2, new C42141d(pVar));
        } else if (lVar instanceof C35947l.C35949b) {
            throw new C41223l((String) null, 1, (DefaultConstructorMarker) null);
        } else if (C41536l.m120484d(lVar, C35947l.C35950c.f86976a)) {
            throw new C41223l((String) null, 1, (DefaultConstructorMarker) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m122361D1(C42137p pVar, String str) {
        C41536l.m120489i(pVar, "this$0");
        C28676r0 r0Var = pVar.f99092d;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        Input input = r0Var.f72911k;
        C41536l.m120488h(str, "result");
        input.setInputText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m122362E1(C42137p pVar, C35947l lVar) {
        C41536l.m120489i(pVar, "this$0");
        C28676r0 r0Var = pVar.f99092d;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        r0Var.f72905e.setLoading(lVar instanceof C35947l.C35950c);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* renamed from: F1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m122363F1(p341ge.bog.designsystem.components.strength.StrengthView r10, java.util.List r11, java.lang.String r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = ie1.C41343r.m119925u(r11, r1)
            r0.<init>(r1)
            java.util.Iterator r11 = r11.iterator()
        L_0x000f:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0055
            java.lang.Object r1 = r11.next()
            r3 = r1
            ge.bog.sso_client.models.Rule r3 = (p341ge.bog.sso_client.models.Rule) r3
            he1.m r1 = new he1.m
            ba1.d0$e r2 = r9.m122388v1()
            ba1.g0 r2 = r2.mo26716g()
            java.lang.String r4 = ""
            if (r2 == 0) goto L_0x003d
            java.lang.String r5 = r3.mo88313a()
            if (r5 != 0) goto L_0x0031
            r5 = r4
        L_0x0031:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r2 = r2.mo26763a(r5, r6)
            if (r2 != 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r8 = r2
            goto L_0x003e
        L_0x003d:
            r8 = r4
        L_0x003e:
            r5 = 0
            r6 = 4
            r7 = 0
            r2 = r9
            r4 = r12
            boolean r2 = m122358A1(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x004c
            ge.bog.designsystem.components.list.e r2 = p341ge.bog.designsystem.components.list.C13368e.POSITIVE
            goto L_0x004e
        L_0x004c:
            ge.bog.designsystem.components.list.e r2 = p341ge.bog.designsystem.components.list.C13368e.INFORMATION
        L_0x004e:
            r1.<init>(r8, r2)
            r0.add(r1)
            goto L_0x000f
        L_0x0055:
            r10.setStatusList(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc1.C42137p.m122363F1(ge.bog.designsystem.components.strength.StrengthView, java.util.List, java.lang.String):void");
    }

    /* renamed from: G1 */
    private final void m122364G1() {
        String str;
        String a;
        C28676r0 r0Var = this.f99092d;
        C28676r0 r0Var2 = null;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        PageDescriptionView pageDescriptionView = r0Var.f72906f;
        pageDescriptionView.setText(C10145d.m37089c("user.credentials.description", m122388v1()));
        pageDescriptionView.setTitle(C10145d.m37089c("user.credentials.title", m122388v1()));
        C28676r0 r0Var3 = this.f99092d;
        if (r0Var3 == null) {
            C41536l.m120506z("binding");
            r0Var3 = null;
        }
        r0Var3.f72905e.setButtonText(C10145d.m37089c("user.credentials.button.save", m122388v1()));
        C28676r0 r0Var4 = this.f99092d;
        if (r0Var4 == null) {
            C41536l.m120506z("binding");
            r0Var4 = null;
        }
        r0Var4.f72909i.getTextInput().setInputType(129);
        C28676r0 r0Var5 = this.f99092d;
        if (r0Var5 == null) {
            C41536l.m120506z("binding");
            r0Var5 = null;
        }
        r0Var5.f72908h.getTextInput().setInputType(129);
        C28676r0 r0Var6 = this.f99092d;
        if (r0Var6 == null) {
            C41536l.m120506z("binding");
            r0Var6 = null;
        }
        Input input = r0Var6.f72909i;
        C41536l.m120488h(input, "binding.passwordInput");
        C10145d.m37092f(input);
        C28676r0 r0Var7 = this.f99092d;
        if (r0Var7 == null) {
            C41536l.m120506z("binding");
            r0Var7 = null;
        }
        Input input2 = r0Var7.f72908h;
        C41536l.m120488h(input2, "binding.passwordAgainInput");
        C10145d.m37092f(input2);
        C28676r0 r0Var8 = this.f99092d;
        if (r0Var8 == null) {
            C41536l.m120506z("binding");
            r0Var8 = null;
        }
        StrengthView strengthView = r0Var8.f72912l;
        C10195g0 g = m122388v1().mo26716g();
        String str2 = "";
        if (g == null || (str = g.mo26763a("text.username.politics.header", new Object[0])) == null) {
            str = str2;
        }
        strengthView.setTitle(str);
        C28676r0 r0Var9 = this.f99092d;
        if (r0Var9 == null) {
            C41536l.m120506z("binding");
            r0Var9 = null;
        }
        StrengthView strengthView2 = r0Var9.f72910j;
        C10195g0 g2 = m122388v1().mo26716g();
        if (!(g2 == null || (a = g2.mo26763a("text.password.politics.header", new Object[0])) == null)) {
            str2 = a;
        }
        strengthView2.setInfoText(str2);
        C28676r0 r0Var10 = this.f99092d;
        if (r0Var10 == null) {
            C41536l.m120506z("binding");
            r0Var10 = null;
        }
        r0Var10.f72911k.setOnInputFocusChangeListener(new C42131j(this));
        C28676r0 r0Var11 = this.f99092d;
        if (r0Var11 == null) {
            C41536l.m120506z("binding");
            r0Var11 = null;
        }
        r0Var11.f72909i.setOnInputFocusChangeListener(new C42132k(this));
        C28676r0 r0Var12 = this.f99092d;
        if (r0Var12 == null) {
            C41536l.m120506z("binding");
            r0Var12 = null;
        }
        r0Var12.f72908h.setOnInputFocusChangeListener(new C42133l(this));
        C28676r0 r0Var13 = this.f99092d;
        if (r0Var13 == null) {
            C41536l.m120506z("binding");
        } else {
            r0Var2 = r0Var13;
        }
        r0Var2.f72905e.setOnClickListener(new C42134m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: H1 */
    public static final void m122365H1(C42137p pVar, View view, boolean z) {
        Boolean bool;
        C41536l.m120489i(pVar, "this$0");
        boolean z2 = false;
        C28676r0 r0Var = null;
        if (z) {
            C28676r0 r0Var2 = pVar.f99092d;
            if (r0Var2 == null) {
                C41536l.m120506z("binding");
                r0Var2 = null;
            }
            r0Var2.f72912l.setVisibility(0);
            C28676r0 r0Var3 = pVar.f99092d;
            if (r0Var3 == null) {
                C41536l.m120506z("binding");
                r0Var3 = null;
            }
            r0Var3.f72911k.mo35919b();
            pVar.f99097i = null;
        } else {
            C28676r0 r0Var4 = pVar.f99092d;
            if (r0Var4 == null) {
                C41536l.m120506z("binding");
                r0Var4 = null;
            }
            r0Var4.f72912l.setVisibility(8);
            C28676r0 r0Var5 = pVar.f99092d;
            if (r0Var5 == null) {
                C41536l.m120506z("binding");
                r0Var5 = null;
            }
            if (r0Var5.f72911k.getInputText().length() > 0) {
                z2 = true;
            }
            if (z2) {
                List a = pVar.f99095g.mo88432a();
                C28676r0 r0Var6 = pVar.f99092d;
                if (r0Var6 == null) {
                    C41536l.m120506z("binding");
                    r0Var6 = null;
                }
                if (pVar.m122371N1(a, r0Var6.f72911k.getInputText(), pVar.f99095g.mo88432a().size())) {
                    C28676r0 r0Var7 = pVar.f99092d;
                    if (r0Var7 == null) {
                        C41536l.m120506z("binding");
                        r0Var7 = null;
                    }
                    r0Var7.f72911k.mo35921d();
                    bool = Boolean.TRUE;
                } else {
                    C28676r0 r0Var8 = pVar.f99092d;
                    if (r0Var8 == null) {
                        C41536l.m120506z("binding");
                        r0Var8 = null;
                    }
                    r0Var8.f72911k.mo35920c();
                    bool = Boolean.FALSE;
                }
                pVar.f99097i = bool;
            }
        }
        C28676r0 r0Var9 = pVar.f99092d;
        if (r0Var9 == null) {
            C41536l.m120506z("binding");
            r0Var9 = null;
        }
        StrengthView strengthView = r0Var9.f72912l;
        C41536l.m120488h(strengthView, "binding.userNameStrength");
        List a2 = pVar.f99095g.mo88432a();
        ArrayList arrayList = new ArrayList();
        for (Object next : a2) {
            if (C41536l.m120484d(((Rule) next).mo88317e(), Boolean.TRUE)) {
                arrayList.add(next);
            }
        }
        C28676r0 r0Var10 = pVar.f99092d;
        if (r0Var10 == null) {
            C41536l.m120506z("binding");
        } else {
            r0Var = r0Var10;
        }
        pVar.m122363F1(strengthView, arrayList, r0Var.f72911k.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public static final void m122366I1(C42137p pVar, View view, boolean z) {
        boolean z2;
        C41536l.m120489i(pVar, "this$0");
        if (z) {
            C28676r0 r0Var = pVar.f99092d;
            if (r0Var == null) {
                C41536l.m120506z("binding");
                r0Var = null;
            }
            r0Var.f72910j.setVisibility(0);
            C28676r0 r0Var2 = pVar.f99092d;
            if (r0Var2 == null) {
                C41536l.m120506z("binding");
                r0Var2 = null;
            }
            r0Var2.f72909i.mo35919b();
            if (!C41536l.m120484d(pVar.f99097i, Boolean.FALSE)) {
                C28676r0 r0Var3 = pVar.f99092d;
                if (r0Var3 == null) {
                    C41536l.m120506z("binding");
                    r0Var3 = null;
                }
                r0Var3.f72907g.post(new C42135n(pVar));
            }
        } else {
            C28676r0 r0Var4 = pVar.f99092d;
            if (r0Var4 == null) {
                C41536l.m120506z("binding");
                r0Var4 = null;
            }
            if (!r0Var4.f72908h.hasFocus()) {
                C28676r0 r0Var5 = pVar.f99092d;
                if (r0Var5 == null) {
                    C41536l.m120506z("binding");
                    r0Var5 = null;
                }
                r0Var5.f72910j.setVisibility(8);
            }
            C28676r0 r0Var6 = pVar.f99092d;
            if (r0Var6 == null) {
                C41536l.m120506z("binding");
                r0Var6 = null;
            }
            if (r0Var6.f72909i.getInputText().length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                C28676r0 r0Var7 = pVar.f99092d;
                if (r0Var7 == null) {
                    C41536l.m120506z("binding");
                    r0Var7 = null;
                }
                r0Var7.f72910j.getProgressType();
                if (pVar.m122373P1(false)) {
                    C28676r0 r0Var8 = pVar.f99092d;
                    if (r0Var8 == null) {
                        C41536l.m120506z("binding");
                        r0Var8 = null;
                    }
                    r0Var8.f72909i.mo35921d();
                } else {
                    C28676r0 r0Var9 = pVar.f99092d;
                    if (r0Var9 == null) {
                        C41536l.m120506z("binding");
                        r0Var9 = null;
                    }
                    r0Var9.f72909i.mo35920c();
                }
            }
        }
        pVar.f99097i = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public static final void m122367J1(C42137p pVar) {
        C41536l.m120489i(pVar, "this$0");
        C28676r0 r0Var = pVar.f99092d;
        C28676r0 r0Var2 = null;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        NestedScrollView nestedScrollView = r0Var.f72907g;
        C28676r0 r0Var3 = pVar.f99092d;
        if (r0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            r0Var2 = r0Var3;
        }
        nestedScrollView.smoothScrollTo(0, r0Var2.f72911k.getBottom());
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m122368K1(C42137p pVar, View view, boolean z) {
        C41536l.m120489i(pVar, "this$0");
        boolean z2 = false;
        if (z) {
            C28676r0 r0Var = pVar.f99092d;
            if (r0Var == null) {
                C41536l.m120506z("binding");
                r0Var = null;
            }
            r0Var.f72910j.setVisibility(0);
            C28676r0 r0Var2 = pVar.f99092d;
            if (r0Var2 == null) {
                C41536l.m120506z("binding");
                r0Var2 = null;
            }
            r0Var2.f72908h.mo35919b();
            if (!C41536l.m120484d(pVar.f99097i, Boolean.FALSE)) {
                C28676r0 r0Var3 = pVar.f99092d;
                if (r0Var3 == null) {
                    C41536l.m120506z("binding");
                    r0Var3 = null;
                }
                r0Var3.f72907g.post(new C42136o(pVar));
            }
        } else {
            C28676r0 r0Var4 = pVar.f99092d;
            if (r0Var4 == null) {
                C41536l.m120506z("binding");
                r0Var4 = null;
            }
            if (!r0Var4.f72909i.hasFocus()) {
                C28676r0 r0Var5 = pVar.f99092d;
                if (r0Var5 == null) {
                    C41536l.m120506z("binding");
                    r0Var5 = null;
                }
                r0Var5.f72910j.setVisibility(8);
            }
            C28676r0 r0Var6 = pVar.f99092d;
            if (r0Var6 == null) {
                C41536l.m120506z("binding");
                r0Var6 = null;
            }
            if (r0Var6.f72908h.getInputText().length() > 0) {
                z2 = true;
            }
            if (z2) {
                if (pVar.m122372O1()) {
                    C28676r0 r0Var7 = pVar.f99092d;
                    if (r0Var7 == null) {
                        C41536l.m120506z("binding");
                        r0Var7 = null;
                    }
                    r0Var7.f72908h.mo35921d();
                } else {
                    C28676r0 r0Var8 = pVar.f99092d;
                    if (r0Var8 == null) {
                        C41536l.m120506z("binding");
                        r0Var8 = null;
                    }
                    r0Var8.f72908h.mo35920c();
                }
            }
        }
        pVar.f99097i = null;
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public static final void m122369L1(C42137p pVar) {
        C41536l.m120489i(pVar, "this$0");
        C28676r0 r0Var = pVar.f99092d;
        C28676r0 r0Var2 = null;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        NestedScrollView nestedScrollView = r0Var.f72907g;
        C28676r0 r0Var3 = pVar.f99092d;
        if (r0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            r0Var2 = r0Var3;
        }
        nestedScrollView.smoothScrollTo(0, r0Var2.f72911k.getBottom());
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public static final void m122370M1(C42137p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        List a = pVar.f99095g.mo88432a();
        C28676r0 r0Var = pVar.f99092d;
        C28676r0 r0Var2 = null;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        if (!pVar.m122371N1(a, r0Var.f72911k.getInputText(), pVar.f99095g.mo88432a().size())) {
            C28676r0 r0Var3 = pVar.f99092d;
            if (r0Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var2 = r0Var3;
            }
            r0Var2.f72911k.mo35920c();
        } else if (!pVar.m122373P1(false)) {
            C28676r0 r0Var4 = pVar.f99092d;
            if (r0Var4 == null) {
                C41536l.m120506z("binding");
                r0Var4 = null;
            }
            r0Var4.f72909i.mo35920c();
            C28676r0 r0Var5 = pVar.f99092d;
            if (r0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var2 = r0Var5;
            }
            r0Var2.f72911k.mo35921d();
        } else if (!pVar.m122372O1()) {
            C28676r0 r0Var6 = pVar.f99092d;
            if (r0Var6 == null) {
                C41536l.m120506z("binding");
                r0Var6 = null;
            }
            r0Var6.f72908h.mo35920c();
            C28676r0 r0Var7 = pVar.f99092d;
            if (r0Var7 == null) {
                C41536l.m120506z("binding");
                r0Var7 = null;
            }
            r0Var7.f72909i.mo35921d();
            C28676r0 r0Var8 = pVar.f99092d;
            if (r0Var8 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var2 = r0Var8;
            }
            r0Var2.f72911k.mo35921d();
        } else {
            C28676r0 r0Var9 = pVar.f99092d;
            if (r0Var9 == null) {
                C41536l.m120506z("binding");
                r0Var9 = null;
            }
            r0Var9.f72911k.mo35921d();
            C28676r0 r0Var10 = pVar.f99092d;
            if (r0Var10 == null) {
                C41536l.m120506z("binding");
                r0Var10 = null;
            }
            r0Var10.f72909i.mo35921d();
            C28676r0 r0Var11 = pVar.f99092d;
            if (r0Var11 == null) {
                C41536l.m120506z("binding");
                r0Var11 = null;
            }
            r0Var11.f72908h.mo35921d();
            C42117a x1 = pVar.m122389x1();
            C28676r0 r0Var12 = pVar.f99092d;
            if (r0Var12 == null) {
                C41536l.m120506z("binding");
                r0Var12 = null;
            }
            String inputText = r0Var12.f72911k.getInputText();
            C28676r0 r0Var13 = pVar.f99092d;
            if (r0Var13 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var2 = r0Var13;
            }
            x1.mo89156ao(inputText, r0Var2.f72909i.getInputText());
        }
    }

    /* renamed from: N1 */
    private final boolean m122371N1(List list, String str, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rule rule = (Rule) it.next();
            if (C41536l.m120484d(rule.mo88317e(), Boolean.TRUE) && m122358A1(this, rule, str, false, 4, (Object) null)) {
                i--;
            }
        }
        if (i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: O1 */
    private final boolean m122372O1() {
        C28676r0 r0Var = this.f99092d;
        C28676r0 r0Var2 = null;
        if (r0Var == null) {
            C41536l.m120506z("binding");
            r0Var = null;
        }
        String inputText = r0Var.f72908h.getInputText();
        C28676r0 r0Var3 = this.f99092d;
        if (r0Var3 == null) {
            C41536l.m120506z("binding");
        } else {
            r0Var2 = r0Var3;
        }
        return C41536l.m120484d(inputText, r0Var2.f72909i.getInputText());
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public final boolean m122373P1(boolean z) {
        C28676r0 r0Var;
        C16716b bVar;
        int i;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f99096h.mo88289b().iterator();
        while (true) {
            r0Var = null;
            if (!it.hasNext()) {
                break;
            }
            Rule rule = (Rule) it.next();
            C28676r0 r0Var2 = this.f99092d;
            if (r0Var2 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var = r0Var2;
            }
            if (m122391z1(rule, r0Var.f72909i.getInputText(), false) && rule.mo88315d() != null) {
                arrayList.add(rule.mo88315d());
            }
        }
        String str = "";
        if (arrayList.size() > 0 && this.f99096h.mo88288a().size() - 1 >= 0) {
            String str2 = str;
            while (true) {
                int i2 = i - 1;
                List<List> b = ((Level) this.f99096h.mo88288a().get(i)).mo88264b();
                if (b != null) {
                    for (List list : b) {
                        if (list != null && arrayList.containsAll(list) && (str2 = ((Level) this.f99096h.mo88288a().get(i)).mo88263a()) == null) {
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
            C28676r0 r0Var3 = this.f99092d;
            if (r0Var3 == null) {
                C41536l.m120506z("binding");
            } else {
                r0Var = r0Var3;
            }
            StrengthView strengthView = r0Var.f72910j;
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

    private final void observeData() {
        m122389x1().mo89179ni().mo4819k(getViewLifecycleOwner(), new C42127f(this));
        m122389x1().mo89154Zc().mo4819k(getViewLifecycleOwner(), new C42128g(this));
        m122389x1().mo89149Wk().mo4819k(getViewLifecycleOwner(), new C42129h(this));
        m122389x1().mo89145S5().mo4819k(getViewLifecycleOwner(), new C42130i(this));
    }

    /* renamed from: t1 */
    private final void m122386t1(Input input, StrengthView strengthView, List list, C43075l lVar) {
        input.getTextInput().addTextChangedListener(new C42139b(this, strengthView, list, lVar));
    }

    /* renamed from: u1 */
    static /* synthetic */ void m122387u1(C42137p pVar, Input input, StrengthView strengthView, List list, C43075l lVar, int i, Object obj) {
        if ((i & 8) != 0) {
            lVar = null;
        }
        pVar.m122386t1(input, strengthView, list, lVar);
    }

    /* renamed from: v1 */
    private final C10146d0.C10172e m122388v1() {
        return (C10146d0.C10172e) this.f99094f.getValue();
    }

    /* renamed from: x1 */
    private final C42117a m122389x1() {
        return (C42117a) this.f99093e.getValue();
    }

    /* renamed from: y1 */
    private final boolean m122390y1() {
        return ((Boolean) this.f99098j.getValue()).booleanValue();
    }

    /* renamed from: z1 */
    private final boolean m122391z1(Rule rule, String str, boolean z) {
        if (rule.mo88314b() == null || rule.mo88319f() == null) {
            return true;
        }
        if ((!z || C41536l.m120484d(rule.mo88317e(), Boolean.TRUE)) && C41536l.m120484d(rule.mo88319f(), Boolean.valueOf(new C40419j(rule.mo88314b()).mo94489f(str)))) {
            return false;
        }
        return true;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28676r0 d = C28676r0.m87819d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f99092d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        return d.mo3946b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m122364G1();
        observeData();
        if (!m122390y1()) {
            m122389x1().mo89155Zu();
        }
    }
}
