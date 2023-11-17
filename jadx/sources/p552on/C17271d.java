package p552on;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.pagestate.PageState;
import p341ge.bog.designsystem.components.pagestate.PageStateType;
import p341ge.bog.mobilebank.cardproducts.presentation.closecard.viewmodel.CloseCardViewModel$ViewModel;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p482jn.C16253f;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: on.d */
public final class C17271d extends C17285f {

    /* renamed from: O */
    public static final C17272a f48553O = new C17272a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C16253f f48554K;

    /* renamed from: L */
    private final C41217g f48555L;

    /* renamed from: M */
    private final C41217g f48556M = C41219i.m119470b(new C17277c(this));

    /* renamed from: N */
    private String f48557N = C32343x.m95388F("applications.history.card.close.actionsheet.title", new Object[0]);

    /* renamed from: on.d$a */
    public static final class C17272a {
        private C17272a() {
        }

        public /* synthetic */ C17272a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C17271d mo44672a(long j) {
            C17271d dVar = new C17271d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_APP_ID", Long.valueOf(j))));
            return dVar;
        }
    }

    /* renamed from: on.d$b */
    static final class C17273b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C17271d f48558d;

        /* renamed from: on.d$b$a */
        static final class C17274a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C17271d f48559d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17274a(C17271d dVar) {
                super(1);
                this.f48559d = dVar;
            }

            /* renamed from: a */
            public final void mo44674a(C41238w wVar) {
                this.f48559d.m60609u2(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo44674a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: on.d$b$b */
        static final class C17275b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C17271d f48560d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17275b(C17271d dVar) {
                super(1);
                this.f48560d = dVar;
            }

            /* renamed from: a */
            public final void mo44675a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C17271d.m60607s2(this.f48560d, false, (Throwable) null, 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo44675a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: on.d$b$c */
        static final class C17276c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C17271d f48561d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C17276c(C17271d dVar) {
                super(1);
                this.f48561d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f48561d.m60606r2(false, th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17273b(C17271d dVar) {
            super(1);
            this.f48558d = dVar;
        }

        /* renamed from: a */
        public final void mo44673a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92646h(aVar, (int[]) null, new C17274a(this.f48558d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C17275b(this.f48558d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C17276c(this.f48558d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo44673a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: on.d$c */
    static final class C17277c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C17271d f48562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17277c(C17271d dVar) {
            super(0);
            this.f48562d = dVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f48562d.getArguments();
            return Long.valueOf(arguments != null ? arguments.getLong("PARAM_APP_ID") : -1);
        }
    }

    /* renamed from: on.d$d */
    static final class C17278d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f48563a;

        C17278d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f48563a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f48563a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f48563a.invoke(obj);
        }
    }

    /* renamed from: on.d$e */
    public static final class C17279e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f48564d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17279e(Fragment fragment) {
            super(0);
            this.f48564d = fragment;
        }

        public final Fragment invoke() {
            return this.f48564d;
        }
    }

    /* renamed from: on.d$f */
    public static final class C17280f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f48565d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17280f(C43064a aVar) {
            super(0);
            this.f48565d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f48565d.invoke();
        }
    }

    /* renamed from: on.d$g */
    public static final class C17281g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f48566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17281g(C41217g gVar) {
            super(0);
            this.f48566d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f48566d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: on.d$h */
    public static final class C17282h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f48567d;

        /* renamed from: e */
        final /* synthetic */ C41217g f48568e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17282h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f48567d = aVar;
            this.f48568e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f48567d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f48568e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: on.d$i */
    public static final class C17283i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f48569d;

        /* renamed from: e */
        final /* synthetic */ C41217g f48570e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17283i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f48569d = fragment;
            this.f48570e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f48570e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f48569d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C17271d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C17280f(new C17279e(this)));
        this.f48555L = C1514j0.m5374c(this, C41520a0.m120436b(CloseCardViewModel$ViewModel.class), new C17281g(a), new C17282h((C43064a) null, a), new C17283i(this, a));
    }

    /* renamed from: j2 */
    private final void m60598j2() {
        m60603o2().f46055f.setOnCheckedStateChangeListener(new C17268a(this));
        m60603o2().f46054e.setOnClickListener(new C17269b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m60599k2(C17271d dVar, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        dVar.m60603o2().f46054e.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m60600l2(C17271d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m60605q2().mo40267jw().mo40266Ck(dVar.m60602n2());
    }

    /* renamed from: m2 */
    private final void m60601m2() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        m60605q2().mo40268kw().mo40269os().mo4819k(viewLifecycleOwner, new C17278d(new C17273b(this)));
    }

    /* renamed from: n2 */
    private final long m60602n2() {
        return ((Number) this.f48556M.getValue()).longValue();
    }

    /* renamed from: o2 */
    private final C16253f m60603o2() {
        C16253f fVar = this.f48554K;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: p2 */
    private final String m60604p2(Throwable th) {
        BankApiResponse a;
        String key;
        ApiError apiError = th instanceof ApiError ? (ApiError) th : null;
        if (apiError == null || (a = apiError.mo84685a()) == null || (key = a.getKey()) == null) {
            return null;
        }
        return C32343x.m95388F(key, new Object[0]);
    }

    /* renamed from: q2 */
    private final CloseCardViewModel$ViewModel m60605q2() {
        return (CloseCardViewModel$ViewModel) this.f48555L.getValue();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r12v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Error] */
    /* JADX WARNING: type inference failed for: r4v9, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m60606r2(boolean r20, java.lang.Throwable r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            r0.m60609u2(r2)
            jn.f r3 = r19.m60603o2()
            ge.bog.designsystem.components.checkbox.CheckboxView r3 = r3.f46055f
            java.lang.String r4 = "binding.agreeCheckBox"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            g91.C32343x.m95455i0(r3)
            jn.f r3 = r19.m60603o2()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46060k
            java.lang.String r4 = "binding.successState"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            g91.C32343x.m95447f1(r3)
            jn.f r3 = r19.m60603o2()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46060k
            if (r1 == 0) goto L_0x0035
            java.lang.String r4 = "applications.history.card.close.actionsheet.success.text"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r4 = g91.C32343x.m95388F(r4, r5)
            goto L_0x003b
        L_0x0035:
            r4 = r21
            java.lang.String r4 = r0.m60604p2(r4)
        L_0x003b:
            r3.setTitleText(r4)
            jn.f r3 = r19.m60603o2()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46060k
            if (r1 == 0) goto L_0x0054
            ge.bog.designsystem.components.pagestate.PageStateType$Success r11 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x0063
        L_0x0054:
            ge.bog.designsystem.components.pagestate.PageStateType$Error r11 = new ge.bog.designsystem.components.pagestate.PageStateType$Error
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x0063:
            r3.setPageStateType(r11)
            jn.f r3 = r19.m60603o2()
            ge.bog.designsystem.components.buttons.Button r3 = r3.f46054e
            java.lang.String r4 = "applications.history.card.close.actionsheet.success.button"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r2 = g91.C32343x.m95388F(r4, r2)
            r3.setButtonText(r2)
            jn.f r2 = r19.m60603o2()
            ge.bog.designsystem.components.buttons.Button r2 = r2.f46054e
            on.c r3 = new on.c
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p552on.C17271d.m60606r2(boolean, java.lang.Throwable):void");
    }

    /* renamed from: s2 */
    static /* synthetic */ void m60607s2(C17271d dVar, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        dVar.m60606r2(z, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public static final void m60608t2(C17271d dVar, boolean z, View view) {
        C41536l.m120489i(dVar, "this$0");
        C1533o.m5445b(dVar, "REQUEST_KEY_CANCEL_CARD_ORDER", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CANCEL_CARD_ORDER_RESULT", Boolean.valueOf(z))));
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m60609u2(boolean z) {
        m60603o2().f46054e.setLoading(z);
    }

    /* renamed from: v2 */
    private final void m60610v2() {
        AppCompatTextView appCompatTextView = m60603o2().f46059j;
        C41536l.m120488h(appCompatTextView, "binding.infoText");
        C32343x.m95455i0(appCompatTextView);
        m60603o2().f46060k.setTitleText(C32343x.m95388F("applications.history.card.close.actionsheet.text", new Object[0]));
        PageState pageState = m60603o2().f46060k;
        C41536l.m120488h(pageState, "binding.successState");
        C32343x.m95447f1(pageState);
        m60603o2().f46060k.setPageStateType(new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
        m60603o2().f46054e.setButtonText(C32343x.m95388F("applications.history.card.close.actionsheet.button", new Object[0]));
        m60603o2().f46054e.setEnabled(false);
        m60603o2().f46055f.setText(C32343x.m95388F("card.close.actionsheet.agree", new Object[0]));
        CheckboxView checkboxView = m60603o2().f46055f;
        C41536l.m120488h(checkboxView, "binding.agreeCheckBox");
        C32343x.m95447f1(checkboxView);
        m60598j2();
        m60601m2();
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f48557N;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f48554K = C16253f.m57948d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f48554K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m60610v2();
    }
}
