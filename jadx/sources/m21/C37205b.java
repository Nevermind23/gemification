package m21;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b31.C31114c;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import n21.C37346c;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.search.SearchView;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserConfig;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserItem;
import p349ah.C9860d;
import p601sg.C17785j;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: m21.b */
public final class C37205b<T extends Parcelable> extends C9860d {

    /* renamed from: E */
    public static final C37206a f89617E = new C37206a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private final C41217g f89618B;

    /* renamed from: C */
    private C31114c f89619C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C37346c f89620D;

    /* renamed from: m21.b$a */
    public static final class C37206a {
        private C37206a() {
        }

        public /* synthetic */ C37206a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C37205b mo90271a(ChooserConfig chooserConfig) {
            C41536l.m120489i(chooserConfig, "config");
            C37205b bVar = new C37205b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("PARAM_CONFIG", chooserConfig)));
            return bVar;
        }
    }

    /* renamed from: m21.b$b */
    static final class C37207b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37205b f89621d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37207b(C37205b bVar) {
            super(1);
            this.f89621d = bVar;
        }

        /* renamed from: a */
        public final void mo90272a(String str) {
            C41536l.m120489i(str, "changed");
            this.f89621d.m109920q2().mo90292lw().mo90280Nd(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90272a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: m21.b$c */
    static final class C37208c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37205b f89622d;

        /* renamed from: m21.b$c$a */
        /* synthetic */ class C37209a extends C41535k implements C43075l {
            C37209a(Object obj) {
                super(1, obj, C37205b.class, "onItemClicked", "onItemClicked(Lge/bog/mobilebank/shared/chooser/presentation/model/ChooserItem;)V", 0);
            }

            /* renamed from: b */
            public final void mo90274b(ChooserItem chooserItem) {
                C41536l.m120489i(chooserItem, "p0");
                ((C37205b) this.receiver).m109921r2(chooserItem);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo90274b((ChooserItem) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37208c(C37205b bVar) {
            super(1);
            this.f89622d = bVar;
        }

        /* renamed from: a */
        public final void mo90273a(ChooserConfig chooserConfig) {
            this.f89622d.f89620D = new C37346c(chooserConfig.mo84271k(), new C37209a(this.f89622d));
            C37205b bVar = this.f89622d;
            C41536l.m120488h(chooserConfig, "config");
            bVar.m109922s2(chooserConfig);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90273a((ChooserConfig) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: m21.b$d */
    static final class C37210d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37205b f89623d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37210d(C37205b bVar) {
            super(1);
            this.f89623d = bVar;
        }

        /* renamed from: a */
        public final void mo90275a(List list) {
            C37346c f2 = this.f89623d.f89620D;
            if (f2 != null) {
                f2.mo6029i(list);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90275a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: m21.b$e */
    static final class C37211e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37205b f89624d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37211e(C37205b bVar) {
            super(1);
            this.f89624d = bVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            Button button = this.f89624d.m109919p2().f77323e;
            C41536l.m120488h(bool, "enabled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: m21.b$f */
    static final class C37212f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C37205b f89625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37212f(C37205b bVar) {
            super(1);
            this.f89625d = bVar;
        }

        /* renamed from: a */
        public final void mo90277a(C37223a aVar) {
            C41224m mVar;
            if (aVar != null && (mVar = (C41224m) aVar.mo90296a()) != null) {
                this.f89625d.m109918o2((String) mVar.mo95678e(), (List) mVar.mo95680f());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo90277a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: m21.b$g */
    static final class C37213g implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f89626a;

        C37213g(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f89626a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f89626a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f89626a.invoke(obj);
        }
    }

    /* renamed from: m21.b$h */
    public static final class C37214h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89627d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37214h(Fragment fragment) {
            super(0);
            this.f89627d = fragment;
        }

        public final Fragment invoke() {
            return this.f89627d;
        }
    }

    /* renamed from: m21.b$i */
    public static final class C37215i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f89628d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37215i(C43064a aVar) {
            super(0);
            this.f89628d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f89628d.invoke();
        }
    }

    /* renamed from: m21.b$j */
    public static final class C37216j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f89629d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37216j(C41217g gVar) {
            super(0);
            this.f89629d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f89629d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: m21.b$k */
    public static final class C37217k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f89630d;

        /* renamed from: e */
        final /* synthetic */ C41217g f89631e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37217k(C43064a aVar, C41217g gVar) {
            super(0);
            this.f89630d = aVar;
            this.f89631e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f89630d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f89631e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: m21.b$l */
    public static final class C37218l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f89632d;

        /* renamed from: e */
        final /* synthetic */ C41217g f89633e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37218l(Fragment fragment, C41217g gVar) {
            super(0);
            this.f89632d = fragment;
            this.f89633e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f89633e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f89632d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C37205b() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C37215i(new C37214h(this)));
        this.f89618B = C1514j0.m5374c(this, C41520a0.m120436b(C37221e.class), new C37216j(a), new C37217k((C43064a) null, a), new C37218l(this, a));
    }

    /* renamed from: l2 */
    private final void m109915l2() {
        m109919p2().f77323e.setOnClickListener(new C37204a(this));
        m109919p2().f77326h.setOnTextChangeListener(new C37207b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m109916m2(C37205b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m109920q2().mo90292lw().mo90281S0();
    }

    /* renamed from: n2 */
    private final void m109917n2() {
        m109920q2().mo90293mw().mo90284Co().mo4819k(getViewLifecycleOwner(), new C37213g(new C37208c(this)));
        m109920q2().mo90293mw().mo90285P4().mo4819k(getViewLifecycleOwner(), new C37213g(new C37210d(this)));
        m109920q2().mo90293mw().mo90286W4().mo4819k(getViewLifecycleOwner(), new C37213g(new C37211e(this)));
        m109920q2().mo90293mw().mo90287eh().mo4819k(getViewLifecycleOwner(), new C37213g(new C37212f(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m109918o2(String str, List list) {
        C1533o.m5445b(this, str, C0908e.m3336b(C41233s.m119492a("CHOOSER_RESULT_KEY", new ArrayList(list))));
        mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public final C31114c m109919p2() {
        C31114c cVar = this.f89619C;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final C37221e m109920q2() {
        return (C37221e) this.f89618B.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m109921r2(ChooserItem chooserItem) {
        m109920q2().mo90292lw().mo90282Ud(chooserItem);
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public final void m109922s2(ChooserConfig chooserConfig) {
        mo26370a2(chooserConfig.mo84270j());
        Button button = m109919p2().f77323e;
        String a = chooserConfig.mo84259a();
        if (a == null) {
            a = getString(C17785j.confirm);
        }
        button.setButtonText(a);
        Button button2 = m109919p2().f77323e;
        C41536l.m120488h(button2, "binding.confirmButton");
        C32343x.m95483r1(button2, chooserConfig.mo84261d(), false, 2, (Object) null);
        SearchView searchView = m109919p2().f77326h;
        C41536l.m120488h(searchView, "binding.searchView");
        C32343x.m95483r1(searchView, chooserConfig.mo84272l(), false, 2, (Object) null);
        m109919p2().f77325g.setMinimumHeight(chooserConfig.mo84265f());
        if (chooserConfig.mo84263e() != null) {
            m109919p2().f77324f.setVisibility(0);
            m109919p2().f77324f.setTitleText(chooserConfig.mo84263e());
        }
        m109919p2().f77325g.setAdapter(this.f89620D);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ChooserConfig chooserConfig;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        C41536l.m120489i(layoutInflater2, "inflater");
        C41536l.m120489i(viewGroup2, "container");
        this.f89619C = C31114c.m92575d(layoutInflater2, viewGroup2, true);
        Bundle arguments = getArguments();
        if (arguments != null) {
            chooserConfig = (ChooserConfig) arguments.getParcelable("PARAM_CONFIG");
        } else {
            chooserConfig = null;
        }
        C37219c lw = m109920q2().mo90292lw();
        if (chooserConfig == null) {
            chooserConfig = new ChooserConfig((String) null, false, (String) null, 0, false, false, 0, (Integer) null, (String) null, (String) null, (C43075l) null, (List) null, C11051p3.f31758b, (DefaultConstructorMarker) null);
        }
        lw.mo90283f4(chooserConfig);
        m109917n2();
        m109915l2();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f89619C = null;
    }
}
