package xz0;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32286a1;
import g91.C32343x;
import g91.C32359z0;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hy0.C36273g;
import hy0.C36275i;
import iy0.C36623p;
import iy0.C36631r1;
import java.util.Locale;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toolbar.ToolbarView;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.ManagerInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.OverdueProductInfoUiModel;
import p420fh.C12902d;
import p420fh.C12910e;
import ue1.C43064a;
import ue1.C43075l;
import xz0.C39985k;

/* renamed from: xz0.f */
public final class C39968f extends C39963a {

    /* renamed from: B */
    public static final C39969a f94958B = new C39969a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private C36623p f94959A;

    /* renamed from: y */
    public C39985k.C39987b f94960y;

    /* renamed from: z */
    private final C41217g f94961z;

    /* renamed from: xz0.f$a */
    public static final class C39969a {
        private C39969a() {
        }

        public /* synthetic */ C39969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39968f mo93806a(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
            C41536l.m120489i(liabilityOverdueInfoUiModel, "data");
            C39968f fVar = new C39968f();
            fVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_DATA", liabilityOverdueInfoUiModel)));
            return fVar;
        }
    }

    /* renamed from: xz0.f$b */
    /* synthetic */ class C39970b extends C41535k implements C43075l {
        C39970b(Object obj) {
            super(1, obj, C39968f.class, "onLiabilityInfo", "onLiabilityInfo(Lge/bog/mobilebank/cleanarch/presentation/liabilityoverdue/liabilityinfo/LiabilityOverdueInfoUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo93807b(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
            C41536l.m120489i(liabilityOverdueInfoUiModel, "p0");
            ((C39968f) this.receiver).m115878N1(liabilityOverdueInfoUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93807b((LiabilityOverdueInfoUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xz0.f$c */
    /* synthetic */ class C39971c extends C41535k implements C43075l {
        C39971c(Object obj) {
            super(1, obj, C39968f.class, "performCall", "performCall(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo93808b(String str) {
            C41536l.m120489i(str, "p0");
            ((C39968f) this.receiver).m115879O1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93808b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xz0.f$d */
    /* synthetic */ class C39972d extends C41535k implements C43075l {
        C39972d(Object obj) {
            super(1, obj, C39968f.class, "copyNumber", "copyNumber(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo93809b(String str) {
            C41536l.m120489i(str, "p0");
            ((C39968f) this.receiver).m115875J1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93809b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xz0.f$e */
    static final class C39973e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39968f f94962d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39973e(C39968f fVar) {
            super(1);
            this.f94962d = fVar;
        }

        /* renamed from: a */
        public final void mo93810a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f94962d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93810a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xz0.f$f */
    static final class C39974f implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f94963a;

        C39974f(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f94963a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f94963a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f94963a.invoke(obj);
        }
    }

    /* renamed from: xz0.f$g */
    public static final class C39975g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f94964d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39975g(Fragment fragment) {
            super(0);
            this.f94964d = fragment;
        }

        public final Fragment invoke() {
            return this.f94964d;
        }
    }

    /* renamed from: xz0.f$h */
    public static final class C39976h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f94965d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39976h(C43064a aVar) {
            super(0);
            this.f94965d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f94965d.invoke();
        }
    }

    /* renamed from: xz0.f$i */
    public static final class C39977i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f94966d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39977i(C41217g gVar) {
            super(0);
            this.f94966d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f94966d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: xz0.f$j */
    public static final class C39978j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f94967d;

        /* renamed from: e */
        final /* synthetic */ C41217g f94968e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39978j(C43064a aVar, C41217g gVar) {
            super(0);
            this.f94967d = aVar;
            this.f94968e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f94967d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f94968e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: xz0.f$k */
    static final class C39979k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39968f f94969d;

        /* renamed from: xz0.f$k$a */
        static final class C39980a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C39968f f94970d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39980a(C39968f fVar) {
                super(0);
                this.f94970d = fVar;
            }

            /* renamed from: b */
            public final C39985k invoke() {
                C39985k.C39987b L1 = this.f94970d.mo93805L1();
                Parcelable parcelable = this.f94970d.requireArguments().getParcelable("EXTRA_DATA");
                C41536l.m120486f(parcelable);
                return L1.mo32800a((LiabilityOverdueInfoUiModel) parcelable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39979k(C39968f fVar) {
            super(0);
            this.f94969d = fVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C39980a(this.f94969d));
        }
    }

    public C39968f() {
        C39979k kVar = new C39979k(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C39976h(new C39975g(this)));
        this.f94961z = C1514j0.m5374c(this, C41520a0.m120436b(C39985k.class), new C39977i(a), new C39978j((C43064a) null, a), kVar);
    }

    /* renamed from: I1 */
    private final void m115874I1() {
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C39984j ew = m115877M1().mo93823ew();
        ew.mo93821j4().mo4819k(viewLifecycleOwner, new C39974f(new C39970b(this)));
        C37224b.m109963b(ew.mo93818Ii(), viewLifecycleOwner, new C39971c(this));
        C37224b.m109963b(ew.mo93819Ks(), viewLifecycleOwner, new C39972d(this));
        C37224b.m109963b(ew.mo93820gg(), viewLifecycleOwner, new C39973e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: J1 */
    public final void m115875J1(String str) {
        C32359z0.m95596x(str);
        C12910e.m48788f(this, "home.collection.pop.up.number.label.copy", (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: K1 */
    private final C36623p m115876K1() {
        C36623p pVar = this.f94959A;
        C41536l.m120486f(pVar);
        return pVar;
    }

    /* renamed from: M1 */
    private final C39985k m115877M1() {
        return (C39985k) this.f94961z.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N1 */
    public final void m115878N1(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        ManagerInfoUiModel a = liabilityOverdueInfoUiModel.mo54309a();
        if (a != null) {
            str = a.mo54321b();
        } else {
            str = null;
        }
        if (str != null) {
            LayerView layerView = m115876K1().f88362h;
            C41536l.m120488h(layerView, "binding.contactUsLayout");
            C32343x.m95447f1(layerView);
            m115876K1().f88368n.setText(a.mo54321b());
            if (a.mo54320a() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                TextView textView = m115876K1().f88366l;
                C41536l.m120488h(textView, "binding.name");
                C32343x.m95447f1(textView);
                m115876K1().f88366l.setText(a.mo54320a());
            }
            EmptyWidget emptyWidget = m115876K1().f88361g;
            if (z2) {
                str2 = C32343x.m95388F("home.collection.pop.up.contact.manager.header", new Object[0]);
            } else {
                str2 = C32343x.m95388F("home.collection.pop.up.call.back.header", new Object[0]);
            }
            emptyWidget.setTitle(str2);
            if (z2) {
                str3 = C32343x.m95388F("home.collection.pop.up.contact.manager.text", new Object[0]);
            } else {
                str3 = C32343x.m95388F("home.collection.pop.up.call.back.text", new Object[0]);
            }
            emptyWidget.setText(str3);
        }
        for (OverdueProductInfoUiModel overdueProductInfoUiModel : liabilityOverdueInfoUiModel.mo54310b()) {
            C36631r1 d = C36631r1.m108660d(getLayoutInflater(), m115876K1().f88365k, true);
            TextView textView2 = d.f88412h;
            String c = overdueProductInfoUiModel.mo54333d().mo64435c();
            String a2 = overdueProductInfoUiModel.mo54331a();
            Locale locale = Locale.getDefault();
            C41536l.m120488h(locale, "getDefault()");
            String lowerCase = a2.toLowerCase(locale);
            C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            textView2.setText(C32343x.m95388F(c + lowerCase, new Object[0]));
            d.f88409e.setText(C32343x.m95410Q(overdueProductInfoUiModel.mo54332b(), overdueProductInfoUiModel.mo54331a(), false, 2, (Object) null));
            d.f88411g.setImageDrawable(C32343x.m95424X(overdueProductInfoUiModel.mo54333d().mo64434b(), requireContext()));
            View view = d.f88410f;
            C41536l.m120488h(view, "divider");
            if (liabilityOverdueInfoUiModel.mo54310b().indexOf(overdueProductInfoUiModel) != liabilityOverdueInfoUiModel.mo54310b().size() - 1) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(view, z, false, 2, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public final void m115879O1(String str) {
        try {
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + str));
            startActivity(intent);
        } catch (Exception unused) {
        }
    }

    /* renamed from: P1 */
    private final void m115880P1() {
        ToolbarView toolbarView = m115876K1().f88370p.f68494e;
        toolbarView.setTitle(C32343x.m95388F("home.collection.pop.up.main.header", new Object[0]));
        toolbarView.setNavigationEnabled(false);
        toolbarView.mo1887x(C36273g.menu_toolbar_liability_overdue_popup);
        toolbarView.setOnMenuItemClickListener(new C39964b(this));
        PageDescriptionView pageDescriptionView = m115876K1().f88367m;
        pageDescriptionView.setTitle(C32343x.m95388F("home.collection.pop.up.exp.header", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("home.collection.pop.up.exp.text", new Object[0]));
        Button button = m115876K1().f88360f;
        button.setButtonText(C32343x.m95388F("home.collection.pop.up.button.label.close", new Object[0]));
        button.setOnClickListener(new C39965c(this));
        m115876K1().f88359e.setOnClickListener(new C39966d(this));
        m115876K1().f88369o.setOnClickListener(new C39967e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m115881Q1(C39968f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m115877M1().mo93822dw().mo93814M5();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final boolean m115882R1(C39968f fVar, MenuItem menuItem) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m115877M1().mo93822dw().mo93817u7(false);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m115883S1(C39968f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m115877M1().mo93822dw().mo93817u7(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public static final void m115884T1(C39968f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m115877M1().mo93822dw().mo93816rj();
    }

    /* renamed from: L1 */
    public final C39985k.C39987b mo93805L1() {
        C39985k.C39987b bVar = this.f94960y;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: k1 */
    public void mo4577k1() {
        super.mo4577k1();
        m115877M1().mo93822dw().onDismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo4588y1(0, C36275i.FullScreenDialog);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f94959A = C36623p.m108627d(LayoutInflater.from(requireContext()));
        ConstraintLayout c = m115876K1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f94959A = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m115874I1();
        m115880P1();
    }
}
