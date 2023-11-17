package p689yn;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import b41.C31132b;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.mobilebank.cardproducts.data.entity.PinResetParams;
import p341ge.bog.mobilebank.cardproducts.presentation.pinreset.viewmodel.PinResetViewModel$ViewModel;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p420fh.C12902d;
import p420fh.C12910e;
import p482jn.C16253f;
import p703zn.C19080a;
import p703zn.C19082b;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: yn.d */
public final class C18961d extends C18958a implements C41185v.C41186a {

    /* renamed from: O */
    public static final C18962a f52968O = new C18962a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C16253f f52969K;

    /* renamed from: L */
    private final C41217g f52970L = C41219i.m119470b(new C18968d(this));

    /* renamed from: M */
    private final C41217g f52971M = C41219i.m119470b(new C18969e(this));

    /* renamed from: N */
    private final C41217g f52972N;

    /* renamed from: yn.d$a */
    public static final class C18962a {
        private C18962a() {
        }

        public /* synthetic */ C18962a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C18961d m64080b(C18962a aVar, long j, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.mo47016a(j, z);
        }

        /* renamed from: a */
        public final C18961d mo47016a(long j, boolean z) {
            C18961d dVar = new C18961d();
            dVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_CARD_ID", Long.valueOf(j)), C41233s.m119492a("PARAM_CREDIT_CARD", Boolean.valueOf(z))));
            return dVar;
        }
    }

    /* renamed from: yn.d$b */
    static final class C18963b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18961d f52973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18963b(C18961d dVar) {
            super(1);
            this.f52973d = dVar;
        }

        /* renamed from: a */
        public final void mo47017a(C37223a aVar) {
            PinResetParams pinResetParams = (PinResetParams) aVar.mo90296a();
            if (pinResetParams != null) {
                this.f52973d.m64074t2(pinResetParams);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47017a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yn.d$c */
    static final class C18964c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C18961d f52974d;

        /* renamed from: yn.d$c$a */
        static final class C18965a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18961d f52975d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18965a(C18961d dVar) {
                super(1);
                this.f52975d = dVar;
            }

            /* renamed from: a */
            public final void mo47019a(C41238w wVar) {
                this.f52975d.m64075u2(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo47019a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: yn.d$c$b */
        static final class C18966b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18961d f52976d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18966b(C18961d dVar) {
                super(1);
                this.f52976d = dVar;
            }

            /* renamed from: a */
            public final void mo47020a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C18961d.m64071q2(this.f52976d, false, (Throwable) null, 3, (Object) null);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo47020a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: yn.d$c$c */
        static final class C18967c extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C18961d f52977d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C18967c(C18961d dVar) {
                super(1);
                this.f52977d = dVar;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C41238w.f97225a;
            }

            public final void invoke(Throwable th) {
                C41536l.m120489i(th, "it");
                this.f52977d.m64070p2(false, th);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18964c(C18961d dVar) {
            super(1);
            this.f52974d = dVar;
        }

        /* renamed from: a */
        public final void mo47018a(C31128a aVar) {
            C41536l.m120488h(aVar, "it");
            C31132b.m92646h(aVar, (int[]) null, new C18965a(this.f52974d), 1, (Object) null);
            C31132b.m92648j(aVar, (int[]) null, new C18966b(this.f52974d), 1, (Object) null);
            C31132b.m92643e(aVar, (int[]) null, new C18967c(this.f52974d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo47018a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yn.d$d */
    static final class C18968d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18961d f52978d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18968d(C18961d dVar) {
            super(0);
            this.f52978d = dVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f52978d.getArguments();
            long j = -1;
            if (arguments != null) {
                j = arguments.getLong("PARAM_CARD_ID", -1);
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: yn.d$e */
    static final class C18969e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C18961d f52979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18969e(C18961d dVar) {
            super(0);
            this.f52979d = dVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f52979d.getArguments();
            return Boolean.valueOf(arguments != null ? arguments.getBoolean("PARAM_CREDIT_CARD") : false);
        }
    }

    /* renamed from: yn.d$f */
    static final class C18970f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f52980a;

        C18970f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f52980a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f52980a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f52980a.invoke(obj);
        }
    }

    /* renamed from: yn.d$g */
    public static final class C18971g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f52981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18971g(Fragment fragment) {
            super(0);
            this.f52981d = fragment;
        }

        public final Fragment invoke() {
            return this.f52981d;
        }
    }

    /* renamed from: yn.d$h */
    public static final class C18972h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f52982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18972h(C43064a aVar) {
            super(0);
            this.f52982d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f52982d.invoke();
        }
    }

    /* renamed from: yn.d$i */
    public static final class C18973i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f52983d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18973i(C41217g gVar) {
            super(0);
            this.f52983d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f52983d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: yn.d$j */
    public static final class C18974j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f52984d;

        /* renamed from: e */
        final /* synthetic */ C41217g f52985e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18974j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f52984d = aVar;
            this.f52985e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f52984d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f52985e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: yn.d$k */
    public static final class C18975k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f52986d;

        /* renamed from: e */
        final /* synthetic */ C41217g f52987e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18975k(Fragment fragment, C41217g gVar) {
            super(0);
            this.f52986d = fragment;
            this.f52987e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f52987e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f52986d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C18961d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C18972h(new C18971g(this)));
        this.f52972N = C1514j0.m5374c(this, C41520a0.m120436b(PinResetViewModel$ViewModel.class), new C18973i(a), new C18974j((C43064a) null, a), new C18975k(this, a));
    }

    /* renamed from: j2 */
    private final void m64064j2() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C19082b iw = m64069o2().mo40281iw();
        iw.mo40282no().mo4819k(viewLifecycleOwner, new C18970f(new C18963b(this)));
        iw.mo40283yr().mo4819k(viewLifecycleOwner, new C18970f(new C18964c(this)));
    }

    /* renamed from: k2 */
    private final C16253f m64065k2() {
        C16253f fVar = this.f52969K;
        C41536l.m120486f(fVar);
        return fVar;
    }

    /* renamed from: l2 */
    private final long m64066l2() {
        return ((Number) this.f52970L.getValue()).longValue();
    }

    /* renamed from: m2 */
    private final boolean m64067m2() {
        return ((Boolean) this.f52971M.getValue()).booleanValue();
    }

    /* renamed from: n2 */
    private final String m64068n2(Throwable th) {
        BankApiResponse a;
        String key;
        ApiError apiError = th instanceof ApiError ? (ApiError) th : null;
        if (apiError == null || (a = apiError.mo84685a()) == null || (key = a.getKey()) == null) {
            return null;
        }
        return C32343x.m95388F(key, new Object[0]);
    }

    /* renamed from: o2 */
    private final PinResetViewModel$ViewModel m64069o2() {
        return (PinResetViewModel$ViewModel) this.f52972N.getValue();
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r11v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Error] */
    /* JADX WARNING: type inference failed for: r3v9, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m64070p2(boolean r19, java.lang.Throwable r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = 0
            r0.m64075u2(r1)
            jn.f r2 = r18.m64065k2()
            androidx.appcompat.widget.AppCompatTextView r2 = r2.f46059j
            java.lang.String r3 = "binding.infoText"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            r3 = 2
            r4 = 0
            g91.C32343x.m95483r1(r2, r1, r1, r3, r4)
            jn.f r2 = r18.m64065k2()
            ge.bog.designsystem.components.pagestate.PageState r2 = r2.f46060k
            java.lang.String r5 = "binding.successState"
            kotlin.jvm.internal.C41536l.m120488h(r2, r5)
            r5 = 1
            g91.C32343x.m95483r1(r2, r5, r1, r3, r4)
            jn.f r2 = r18.m64065k2()
            ge.bog.designsystem.components.pagestate.PageState r2 = r2.f46060k
            if (r19 == 0) goto L_0x0036
            java.lang.String r3 = "text.cards.change.pin.success.message"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r3 = g91.C32343x.m95388F(r3, r4)
            goto L_0x003c
        L_0x0036:
            r3 = r20
            java.lang.String r3 = r0.m64068n2(r3)
        L_0x003c:
            r2.setTitleText(r3)
            jn.f r2 = r18.m64065k2()
            ge.bog.designsystem.components.pagestate.PageState r2 = r2.f46060k
            if (r19 == 0) goto L_0x0055
            ge.bog.designsystem.components.pagestate.PageStateType$Success r10 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 15
            r9 = 0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L_0x0063
        L_0x0055:
            ge.bog.designsystem.components.pagestate.PageStateType$Error r10 = new ge.bog.designsystem.components.pagestate.PageStateType$Error
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 15
            r17 = 0
            r11 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L_0x0063:
            r2.setPageStateType(r10)
            jn.f r2 = r18.m64065k2()
            ge.bog.designsystem.components.buttons.Button r2 = r2.f46054e
            java.lang.String r3 = "text.cards.change.pin.button.okay"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r1 = g91.C32343x.m95388F(r3, r1)
            r2.setButtonText(r1)
            jn.f r1 = r18.m64065k2()
            ge.bog.designsystem.components.buttons.Button r1 = r1.f46054e
            yn.c r2 = new yn.c
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p689yn.C18961d.m64070p2(boolean, java.lang.Throwable):void");
    }

    /* renamed from: q2 */
    static /* synthetic */ void m64071q2(C18961d dVar, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        dVar.m64070p2(z, th);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m64072r2(C18961d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m64073s2(C18961d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        if (dVar.m64067m2()) {
            C36546y.m108282F().mo27152s("credit_cards_page", "", "credit_cards_change_pin_button");
        }
        C19080a.C19081a.m64431a(dVar.m64069o2().mo40279gw(), dVar.m64066l2(), (String) null, (String) null, (String) null, 14, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: t2 */
    public final void m64074t2(PinResetParams pinResetParams) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, pinResetParams.getOtpServiceId(), m64069o2().mo40280hw(pinResetParams), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u2 */
    public final void m64075u2(boolean z) {
        m64065k2().f46054e.setLoading(z);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m64069o2().mo40279gw().mo40278Wt(m64066l2(), str, str2, str3);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48792j(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m64075u2(z);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f52969K = C16253f.m57948d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f52969K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("text.cards.change.pin.header", new Object[0]));
        m64065k2().f46059j.setText(C32343x.m95388F("text.cards.change.pin.message", new Object[0]));
        m64065k2().f46054e.setButtonText(C32343x.m95388F("text.cards.change.pin.button.new.pin", new Object[0]));
        m64065k2().f46054e.setOnClickListener(new C18959b(this));
        m64064j2();
        super.onViewCreated(view, bundle);
    }
}
