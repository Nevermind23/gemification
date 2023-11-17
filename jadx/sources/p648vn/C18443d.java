package p648vn;

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

/* renamed from: vn.d */
public final class C18443d extends C18458f {

    /* renamed from: O */
    public static final C18444a f51902O = new C18444a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C16253f f51903K;

    /* renamed from: L */
    private final C41217g f51904L;

    /* renamed from: M */
    private final C41217g f51905M = C41219i.m119470b(new C18449c(this));

    /* renamed from: N */
    private final C41217g f51906N = C41219i.m119470b(new C18450d(this));

    /* renamed from: vn.d$a */
    public static final class C18444a {
        private C18444a() {
        }

        public /* synthetic */ C18444a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18443d mo46229a(long j, String str) {
            C41536l.m120489i(str, "lastFour");
            C18443d dVar = new C18443d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_CARD_ID", Long.valueOf(j)), C41233s.m119492a("PARAM_CARD_LAST_FOUR", str)));
            return dVar;
        }
    }

    /* renamed from: vn.d$b */
    static final class C18445b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18443d f51907d;

        /* renamed from: vn.d$b$a */
        static final class C18446a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18443d f51908d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18446a(C18443d dVar) {
                super(1);
                this.f51908d = dVar;
            }

            /* renamed from: a */
            public final void mo46231a(C41238w wVar) {
                this.f51908d.m62890v2(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo46231a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: vn.d$b$b */
        static final class C18447b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18443d f51909d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18447b(C18443d dVar) {
                super(1);
                this.f51909d = dVar;
            }

            /* renamed from: a */
            public final void mo46232a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C18443d.m62888t2(this.f51909d, false, (Throwable) null, 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo46232a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: vn.d$b$c */
        static final class C18448c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18443d f51910d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18448c(C18443d dVar) {
                super(1);
                this.f51910d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f51910d.m62887s2(false, th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18445b(C18443d dVar) {
            super(1);
            this.f51907d = dVar;
        }

        /* renamed from: a */
        public final void mo46230a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92646h(aVar, (int[]) null, new C18446a(this.f51907d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C18447b(this.f51907d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C18448c(this.f51907d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo46230a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: vn.d$c */
    static final class C18449c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18443d f51911d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18449c(C18443d dVar) {
            super(0);
            this.f51911d = dVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f51911d.getArguments();
            long j = -1;
            if (arguments != null) {
                j = arguments.getLong("PARAM_CARD_ID", -1);
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: vn.d$d */
    static final class C18450d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18443d f51912d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18450d(C18443d dVar) {
            super(0);
            this.f51912d = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
            r0 = r0.getString("PARAM_CARD_LAST_FOUR");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String invoke() {
            /*
                r2 = this;
                vn.d r0 = r2.f51912d
                android.os.Bundle r0 = r0.getArguments()
                if (r0 == 0) goto L_0x0010
                java.lang.String r1 = "PARAM_CARD_LAST_FOUR"
                java.lang.String r0 = r0.getString(r1)
                if (r0 != 0) goto L_0x0012
            L_0x0010:
                java.lang.String r0 = ""
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p648vn.C18443d.C18450d.invoke():java.lang.String");
        }
    }

    /* renamed from: vn.d$e */
    static final class C18451e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f51913a;

        C18451e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f51913a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f51913a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f51913a.invoke(obj);
        }
    }

    /* renamed from: vn.d$f */
    public static final class C18452f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51914d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18452f(Fragment fragment) {
            super(0);
            this.f51914d = fragment;
        }

        public final Fragment invoke() {
            return this.f51914d;
        }
    }

    /* renamed from: vn.d$g */
    public static final class C18453g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51915d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18453g(C43064a aVar) {
            super(0);
            this.f51915d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f51915d.invoke();
        }
    }

    /* renamed from: vn.d$h */
    public static final class C18454h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f51916d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18454h(C41217g gVar) {
            super(0);
            this.f51916d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f51916d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: vn.d$i */
    public static final class C18455i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f51917d;

        /* renamed from: e */
        final /* synthetic */ C41217g f51918e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18455i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f51917d = aVar;
            this.f51918e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f51917d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f51918e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: vn.d$j */
    public static final class C18456j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f51919d;

        /* renamed from: e */
        final /* synthetic */ C41217g f51920e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18456j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f51919d = fragment;
            this.f51920e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f51920e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f51919d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C18443d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C18453g(new C18452f(this)));
        this.f51904L = C1514j0.m5374c(this, C41520a0.m120436b(CloseCardViewModel$ViewModel.class), new C18454h(a), new C18455i((C43064a) null, a), new C18456j(this, a));
    }

    /* renamed from: j2 */
    private final void m62878j2() {
        m62882n2().f46055f.setOnCheckedStateChangeListener(new C18441b(this));
        m62882n2().f46054e.setOnClickListener(new C18442c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m62879k2(C18443d dVar, CompoundButton compoundButton, boolean z, boolean z2) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
        dVar.m62882n2().f46054e.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m62880l2(C18443d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m62886r2().mo40267jw().mo40270pj(dVar.m62883o2());
    }

    /* renamed from: m2 */
    private final void m62881m2() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        m62886r2().mo40268kw().mo40269os().mo4819k(viewLifecycleOwner, new C18451e(new C18445b(this)));
    }

    /* renamed from: n2 */
    private final C16253f m62882n2() {
        C16253f fVar = this.f51903K;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: o2 */
    private final long m62883o2() {
        return ((Number) this.f51905M.getValue()).longValue();
    }

    /* renamed from: p2 */
    private final String m62884p2(Throwable th) {
        BankApiResponse a;
        String key;
        ApiError apiError = th instanceof ApiError ? (ApiError) th : null;
        if (apiError == null || (a = apiError.mo84685a()) == null || (key = a.getKey()) == null) {
            return null;
        }
        return C32343x.m95388F(key, new Object[0]);
    }

    /* renamed from: q2 */
    private final String m62885q2() {
        return (String) this.f51906N.getValue();
    }

    /* renamed from: r2 */
    private final CloseCardViewModel$ViewModel m62886r2() {
        return (CloseCardViewModel$ViewModel) this.f51904L.getValue();
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r12v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Error] */
    /* JADX WARNING: type inference failed for: r4v9, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m62887s2(boolean r20, java.lang.Throwable r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 0
            r0.m62890v2(r2)
            jn.f r3 = r19.m62882n2()
            ge.bog.designsystem.components.checkbox.CheckboxView r3 = r3.f46055f
            java.lang.String r4 = "binding.agreeCheckBox"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            r4 = 2
            r5 = 0
            g91.C32343x.m95483r1(r3, r2, r2, r4, r5)
            jn.f r3 = r19.m62882n2()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46060k
            java.lang.String r6 = "binding.successState"
            kotlin.jvm.internal.C41536l.m120488h(r3, r6)
            r6 = 1
            g91.C32343x.m95483r1(r3, r6, r2, r4, r5)
            jn.f r3 = r19.m62882n2()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46060k
            if (r1 == 0) goto L_0x003e
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r5 = r19.m62885q2()
            r4[r2] = r5
            java.lang.String r5 = "card.close.actionsheet.success.text"
            java.lang.String r4 = g91.C32343x.m95388F(r5, r4)
            goto L_0x0044
        L_0x003e:
            r4 = r21
            java.lang.String r4 = r0.m62884p2(r4)
        L_0x0044:
            r3.setTitleText(r4)
            jn.f r3 = r19.m62882n2()
            ge.bog.designsystem.components.pagestate.PageState r3 = r3.f46060k
            if (r1 == 0) goto L_0x005d
            ge.bog.designsystem.components.pagestate.PageStateType$Success r11 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 15
            r10 = 0
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            goto L_0x006c
        L_0x005d:
            ge.bog.designsystem.components.pagestate.PageStateType$Error r11 = new ge.bog.designsystem.components.pagestate.PageStateType$Error
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 15
            r18 = 0
            r12 = r11
            r12.<init>(r13, r14, r15, r16, r17, r18)
        L_0x006c:
            r3.setPageStateType(r11)
            jn.f r3 = r19.m62882n2()
            ge.bog.designsystem.components.buttons.Button r3 = r3.f46054e
            java.lang.String r4 = "card.close.actionsheet.success.button"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r2 = g91.C32343x.m95388F(r4, r2)
            r3.setButtonText(r2)
            jn.f r2 = r19.m62882n2()
            ge.bog.designsystem.components.buttons.Button r2 = r2.f46054e
            vn.a r3 = new vn.a
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p648vn.C18443d.m62887s2(boolean, java.lang.Throwable):void");
    }

    /* renamed from: t2 */
    static /* synthetic */ void m62888t2(C18443d dVar, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        dVar.m62887s2(z, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public static final void m62889u2(C18443d dVar, boolean z, View view) {
        C41536l.m120489i(dVar, "this$0");
        C1533o.m5445b(dVar, "REQUEST_KEY_CLOSE_CARD", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_CARD", Boolean.valueOf(z))));
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v2 */
    public final void m62890v2(boolean z) {
        m62882n2().f46054e.setLoading(z);
    }

    /* renamed from: w2 */
    private final void m62891w2() {
        mo26370a2(C32343x.m95388F("card.close.actionsheet.title", new Object[0]));
        AppCompatTextView appCompatTextView = m62882n2().f46059j;
        C41536l.m120488h(appCompatTextView, "binding.infoText");
        C32343x.m95483r1(appCompatTextView, false, false, 2, (Object) null);
        m62882n2().f46060k.setTitleText(C32343x.m95388F("card.close.actionsheet.text", new Object[0]));
        PageState pageState = m62882n2().f46060k;
        C41536l.m120488h(pageState, "binding.successState");
        C32343x.m95483r1(pageState, true, false, 2, (Object) null);
        m62882n2().f46060k.setPageStateType(new PageStateType.Warning((Image) null, 0, (Color) null, (Color) null, 15, (DefaultConstructorMarker) null));
        m62882n2().f46054e.setButtonText(C32343x.m95388F("card.close.actionsheet.button", new Object[0]));
        m62882n2().f46054e.setEnabled(false);
        m62882n2().f46055f.setText(C32343x.m95388F("card.close.actionsheet.agree", new Object[0]));
        CheckboxView checkboxView = m62882n2().f46055f;
        C41536l.m120488h(checkboxView, "binding.agreeCheckBox");
        C32343x.m95483r1(checkboxView, true, false, 2, (Object) null);
        m62878j2();
        m62881m2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f51903K = C16253f.m57948d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f51903K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        m62891w2();
        super.onViewCreated(view, bundle);
    }
}
