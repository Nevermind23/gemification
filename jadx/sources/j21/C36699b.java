package j21;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import b31.C31113b;
import b41.C31128a;
import b41.C31132b;
import g91.C32286a1;
import g91.C32343x;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import i21.C36343a;
import j21.C36718d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k21.C36865b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l21.C37065a;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.ChangeDailyLimitsParams;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.SchoolCardLimitChooserData;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x11.C39770c;

/* renamed from: j21.b */
public final class C36699b extends C36724i implements C41185v.C41186a {

    /* renamed from: P */
    public static final C36700a f88582P = new C36700a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C36717c f88583K;

    /* renamed from: L */
    private C31113b f88584L;

    /* renamed from: M */
    private final C41217g f88585M = C41219i.m119470b(new C36709g(this));

    /* renamed from: N */
    private final C41217g f88586N;

    /* renamed from: O */
    private final C41217g f88587O;

    /* renamed from: j21.b$a */
    public static final class C36700a {
        private C36700a() {
        }

        public /* synthetic */ C36700a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C36699b m108859b(C36700a aVar, List list, String str, boolean z, Long l, String str2, String str3, int i, Object obj) {
            String str4;
            boolean z2;
            Long l2;
            String str5;
            String str6 = null;
            if ((i & 2) != 0) {
                str4 = null;
            } else {
                str4 = str;
            }
            if ((i & 4) != 0) {
                z2 = false;
            } else {
                z2 = z;
            }
            if ((i & 8) != 0) {
                l2 = null;
            } else {
                l2 = l;
            }
            if ((i & 16) != 0) {
                str5 = C32343x.m95388F("text.card.applications.choose.daily.limit.type", new Object[0]);
            } else {
                str5 = str2;
            }
            if ((i & 32) == 0) {
                str6 = str3;
            }
            return aVar.mo89516a(list, str4, z2, l2, str5, str6);
        }

        /* renamed from: a */
        public final C36699b mo89516a(List list, String str, boolean z, Long l, String str2, String str3) {
            C41536l.m120489i(list, "limits");
            C41536l.m120489i(str2, "actionSheetTitle");
            C36699b bVar = new C36699b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", new SchoolCardLimitChooserData(list, str, z, str2, l))));
            return bVar;
        }
    }

    /* renamed from: j21.b$b */
    static final class C36701b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36699b f88588d;

        /* renamed from: j21.b$b$a */
        /* synthetic */ class C36702a implements C36343a, C41532h {

            /* renamed from: a */
            final /* synthetic */ C36699b f88589a;

            C36702a(C36699b bVar) {
                this.f88589a = bVar;
            }

            /* renamed from: a */
            public final void mo89057a(CardDailyLimitUiModel cardDailyLimitUiModel) {
                C41536l.m120489i(cardDailyLimitUiModel, "p0");
                this.f88589a.m108849q2(cardDailyLimitUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C36343a) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f88589a, C36699b.class, "onLimitClicked", "onLimitClicked(Lge/bog/mobilebank/shared/cards/presentation/scoolcardlimitchooser/model/CardDailyLimitUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36701b(C36699b bVar) {
            super(0);
            this.f88588d = bVar;
        }

        /* renamed from: b */
        public final C36865b invoke() {
            return new C36865b(new C36702a(this.f88588d));
        }
    }

    /* renamed from: j21.b$c */
    /* synthetic */ class C36703c extends C41535k implements C43075l {
        C36703c(Object obj) {
            super(1, obj, C36699b.class, "openSca", "openSca(Lge/bog/mobilebank/shared/cards/presentation/scoolcardlimitchooser/model/ChangeDailyLimitsParams;)V", 0);
        }

        /* renamed from: b */
        public final void mo89520b(ChangeDailyLimitsParams changeDailyLimitsParams) {
            C41536l.m120489i(changeDailyLimitsParams, "p0");
            ((C36699b) this.receiver).m108850r2(changeDailyLimitsParams);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89520b((ChangeDailyLimitsParams) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: j21.b$d */
    static final class C36704d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36699b f88590d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36704d(C36699b bVar) {
            super(1);
            this.f88590d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f88590d.m108846m2().f77321f;
            C41536l.m120488h(bool, "it");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: j21.b$e */
    static final class C36705e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36699b f88591d;

        /* renamed from: j21.b$e$a */
        static final class C36706a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C36699b f88592d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36706a(C36699b bVar) {
                super(1);
                this.f88592d = bVar;
            }

            /* renamed from: a */
            public final void mo89523a(C41238w wVar) {
                C41536l.m120489i(wVar, "it");
                C1533o.m5445b(this.f88592d, "REQUEST_POSITIVE_FEEDBACK_KEY", C0908e.m3336b(C41233s.m119492a("RESULT_POSITIVE_FEEDBACK_KEY", Boolean.TRUE)));
                this.f88592d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo89523a((C41238w) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: j21.b$e$b */
        static final class C36707b extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C36699b f88593d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36707b(C36699b bVar) {
                super(2);
                this.f88593d = bVar;
            }

            /* renamed from: a */
            public final void mo89524a(Throwable th, C41238w wVar) {
                C41536l.m120489i(th, "<anonymous parameter 0>");
                C1533o.m5445b(this.f88593d, "REQUEST_POSITIVE_FEEDBACK_KEY", C0908e.m3336b(C41233s.m119492a("RESULT_POSITIVE_FEEDBACK_KEY", Boolean.FALSE)));
                this.f88593d.mo4577k1();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                mo89524a((Throwable) obj, (C41238w) obj2);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36705e(C36699b bVar) {
            super(1);
            this.f88591d = bVar;
        }

        /* renamed from: a */
        public final void mo89522a(C31128a aVar) {
            C41536l.m120488h(aVar, "response");
            C31132b.m92648j(aVar, (int[]) null, new C36706a(this.f88591d), 1, (Object) null);
            C31132b.m92644f(aVar, (int[]) null, new C36707b(this.f88591d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89522a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: j21.b$f */
    static final class C36708f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36699b f88594d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36708f(C36699b bVar) {
            super(1);
            this.f88594d = bVar;
        }

        /* renamed from: a */
        public final void mo89525a(List list) {
            String f = this.f88594d.m108847n2().mo84251f();
            C36865b f2 = this.f88594d.m108845l2();
            C41536l.m120488h(list, "it");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CardDailyLimitUiModel cardDailyLimitUiModel = (CardDailyLimitUiModel) it.next();
                arrayList.add(new C37065a(cardDailyLimitUiModel, C41536l.m120484d(cardDailyLimitUiModel.mo84222a(), f)));
            }
            f2.mo6029i(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo89525a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: j21.b$g */
    static final class C36709g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36699b f88595d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36709g(C36699b bVar) {
            super(0);
            this.f88595d = bVar;
        }

        /* renamed from: b */
        public final SchoolCardLimitChooserData invoke() {
            Bundle arguments = this.f88595d.getArguments();
            SchoolCardLimitChooserData schoolCardLimitChooserData = arguments != null ? (SchoolCardLimitChooserData) arguments.getParcelable("ARG_DATA") : null;
            return schoolCardLimitChooserData == null ? new SchoolCardLimitChooserData(C41341q.m119907j(), (String) null, false, (String) null, (Long) null, 30, (DefaultConstructorMarker) null) : schoolCardLimitChooserData;
        }
    }

    /* renamed from: j21.b$h */
    static final class C36710h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f88596a;

        C36710h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f88596a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f88596a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f88596a.invoke(obj);
        }
    }

    /* renamed from: j21.b$i */
    public static final class C36711i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f88597d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36711i(Fragment fragment) {
            super(0);
            this.f88597d = fragment;
        }

        public final Fragment invoke() {
            return this.f88597d;
        }
    }

    /* renamed from: j21.b$j */
    public static final class C36712j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f88598d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36712j(C43064a aVar) {
            super(0);
            this.f88598d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f88598d.invoke();
        }
    }

    /* renamed from: j21.b$k */
    public static final class C36713k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f88599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36713k(C41217g gVar) {
            super(0);
            this.f88599d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f88599d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: j21.b$l */
    public static final class C36714l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f88600d;

        /* renamed from: e */
        final /* synthetic */ C41217g f88601e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36714l(C43064a aVar, C41217g gVar) {
            super(0);
            this.f88600d = aVar;
            this.f88601e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f88600d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f88601e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: j21.b$m */
    static final class C36715m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C36699b f88602d;

        /* renamed from: j21.b$m$a */
        static final class C36716a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C36699b f88603d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C36716a(C36699b bVar) {
                super(0);
                this.f88603d = bVar;
            }

            /* renamed from: b */
            public final C36721f invoke() {
                long j;
                C36717c o2 = this.f88603d.mo89515o2();
                Long b = this.f88603d.m108847n2().mo84246b();
                if (b != null) {
                    j = b.longValue();
                } else {
                    j = 0;
                }
                return o2.mo32806a(j, this.f88603d.m108847n2().mo84247d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36715m(C36699b bVar) {
            super(0);
            this.f88602d = bVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C36716a(this.f88602d));
        }
    }

    public C36699b() {
        C36715m mVar = new C36715m(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C36712j(new C36711i(this)));
        this.f88586N = C1514j0.m5374c(this, C41520a0.m120436b(C36721f.class), new C36713k(a), new C36714l((C43064a) null, a), mVar);
        this.f88587O = C41219i.m119470b(new C36701b(this));
    }

    /* renamed from: W1 */
    private final void m108837W1() {
        m108846m2().f77321f.setOnClickListener(new C36698a(this));
    }

    /* renamed from: k2 */
    private final void m108844k2() {
        C36720e fw = m108848p2().mo89537fw();
        C37224b.m109963b(fw.mo89531N9(), this, new C36703c(this));
        fw.mo89532Nv().mo4819k(this, new C36710h(new C36704d(this)));
        fw.mo89534i4().mo4819k(this, new C36710h(new C36705e(this)));
        fw.mo89533Ys().mo4819k(this, new C36710h(new C36708f(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C36865b m108845l2() {
        return (C36865b) this.f88587O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final C31113b m108846m2() {
        C31113b bVar = this.f88584L;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final SchoolCardLimitChooserData m108847n2() {
        return (SchoolCardLimitChooserData) this.f88585M.getValue();
    }

    /* renamed from: p2 */
    private final C36721f m108848p2() {
        return (C36721f) this.f88586N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m108849q2(CardDailyLimitUiModel cardDailyLimitUiModel) {
        C36865b l2 = m108845l2();
        List<CardDailyLimitUiModel> d = m108847n2().mo84247d();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
        for (CardDailyLimitUiModel cardDailyLimitUiModel2 : d) {
            arrayList.add(new C37065a(cardDailyLimitUiModel2, C41536l.m120484d(cardDailyLimitUiModel2.mo84222a(), cardDailyLimitUiModel.mo84222a())));
        }
        l2.mo6029i(arrayList);
        C1533o.m5445b(this, "REQUEST_KEY_CARD_LIMIT", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CHOSEN_CARD_LIMIT", cardDailyLimitUiModel)));
        if (!m108847n2().mo84249e()) {
            mo4577k1();
        }
        m108848p2().mo89538hw(cardDailyLimitUiModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m108850r2(ChangeDailyLimitsParams changeDailyLimitsParams) {
        C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, changeDailyLimitsParams.getServiceId(), m108848p2().mo89536ew(changeDailyLimitsParams), (C41143c) null, 4, (Object) null);
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        e.mo4576A1(childFragmentManager, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m108851s2(C36699b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C36718d.C36719a.m108872a(bVar.m108848p2().mo89535dw(), bVar.m108847n2().mo84246b(), bVar.m108847n2().mo84251f(), (String) null, (String) null, (String) null, 28, (Object) null);
    }

    /* renamed from: t2 */
    private final void m108852t2() {
        m108846m2().f77321f.setButtonText(C32343x.m95388F("cards.details.change.daily.limit.actionsheet.button", new Object[0]));
        m108846m2().f77320e.setAdapter(m108845l2());
        RecyclerView recyclerView = m108846m2().f77320e;
        recyclerView.mo5351j(new C13364a(C0767a.m2895e(requireContext(), C39770c.f94465a), true, true));
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
    }

    /* renamed from: u2 */
    private final void m108853u2() {
        if (m108847n2().mo84249e()) {
            Button button = m108846m2().f77321f;
            C41536l.m120488h(button, "binding.nextButton");
            C32343x.m95447f1(button);
            return;
        }
        Button button2 = m108846m2().f77321f;
        C41536l.m120488h(button2, "binding.nextButton");
        C32343x.m95455i0(button2);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        C41185v g0 = C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
        if (g0 != null) {
            g0.mo4577k1();
        }
        m108848p2().mo89535dw().mo89530Wd(m108847n2().mo84246b(), m108847n2().mo84251f(), str, str2, str3);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48792j(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m108846m2().f77321f.setLoading(z);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f88584L = C31113b.m92571d(layoutInflater, viewGroup, true);
    }

    /* renamed from: o2 */
    public final C36717c mo89515o2() {
        C36717c cVar = this.f88583K;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f88584L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F(m108847n2().mo84245a(), new Object[0]));
        m108852t2();
        m108844k2();
        m108853u2();
        m108837W1();
    }
}
