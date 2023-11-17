package p525mo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import o31.C37588a0;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p413eo.C12735d;
import p525mo.C16831f;
import p525mo.C16836i;
import p553oo.C17289c;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: mo.b */
public final class C16815b extends C16838j {

    /* renamed from: O */
    public static final C16816a f47096O = new C16816a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C12735d f47097K;

    /* renamed from: L */
    public C16836i.C16837a f47098L;

    /* renamed from: M */
    private final C41217g f47099M;

    /* renamed from: N */
    private final C41217g f47100N = C41219i.m119470b(new C16817b(this));

    /* renamed from: mo.b$a */
    public static final class C16816a {
        private C16816a() {
        }

        public /* synthetic */ C16816a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C16815b mo43941a(String str) {
            C41536l.m120489i(str, "emailId");
            C16815b bVar = new C16815b();
            bVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_EMAIL_ID", str)));
            return bVar;
        }
    }

    /* renamed from: mo.b$b */
    static final class C16817b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C16815b f47101d;

        /* renamed from: mo.b$b$a */
        /* synthetic */ class C16818a implements C16831f.C16833b, C41532h {

            /* renamed from: a */
            final /* synthetic */ C16834g f47102a;

            C16818a(C16834g gVar) {
                this.f47102a = gVar;
            }

            /* renamed from: a */
            public final void mo43943a(EmailUiModel emailUiModel) {
                C41536l.m120489i(emailUiModel, "p0");
                this.f47102a.mo43955Ue(emailUiModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C16831f.C16833b) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f47102a, C16834g.class, "onEmailSelect", "onEmailSelect(Lge/bog/mobilebank/categorypackages/presentation/application/firststage/model/EmailUiModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16817b(C16815b bVar) {
            super(0);
            this.f47101d = bVar;
        }

        /* renamed from: b */
        public final C16831f invoke() {
            return new C16831f(new C16818a(this.f47101d.m59289l2().mo43958dw()));
        }
    }

    /* renamed from: mo.b$c */
    /* synthetic */ class C16819c extends C41535k implements C43075l {
        C16819c(Object obj) {
            super(1, obj, C16831f.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo43946b(List list) {
            ((C16831f) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43946b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mo.b$d */
    /* synthetic */ class C16820d extends C41535k implements C43075l {
        C16820d(Object obj) {
            super(1, obj, C16815b.class, "dismissWithResult", "dismissWithResult(Lge/bog/mobilebank/categorypackages/presentation/application/firststage/model/EmailUiModel;)V", 0);
        }

        /* renamed from: b */
        public final void mo43947b(EmailUiModel emailUiModel) {
            C41536l.m120489i(emailUiModel, "p0");
            ((C16815b) this.receiver).m59286h2(emailUiModel);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo43947b((EmailUiModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: mo.b$e */
    static final class C16821e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f47103a;

        C16821e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f47103a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f47103a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f47103a.invoke(obj);
        }
    }

    /* renamed from: mo.b$f */
    public static final class C16822f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f47104d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16822f(Fragment fragment) {
            super(0);
            this.f47104d = fragment;
        }

        public final Fragment invoke() {
            return this.f47104d;
        }
    }

    /* renamed from: mo.b$g */
    public static final class C16823g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f47105d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16823g(C43064a aVar) {
            super(0);
            this.f47105d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f47105d.invoke();
        }
    }

    /* renamed from: mo.b$h */
    public static final class C16824h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f47106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16824h(C41217g gVar) {
            super(0);
            this.f47106d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f47106d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: mo.b$i */
    public static final class C16825i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f47107d;

        /* renamed from: e */
        final /* synthetic */ C41217g f47108e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16825i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f47107d = aVar;
            this.f47108e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f47107d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f47108e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: mo.b$j */
    static final class C16826j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C16815b f47109d;

        /* renamed from: mo.b$j$a */
        static final class C16827a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C16815b f47110d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C16827a(C16815b bVar) {
                super(0);
                this.f47110d = bVar;
            }

            /* renamed from: b */
            public final C16836i invoke() {
                C16836i.C16837a k2 = this.f47110d.mo43940k2();
                Bundle arguments = this.f47110d.getArguments();
                String string = arguments != null ? arguments.getString("EXTRA_EMAIL_ID") : null;
                C41536l.m120486f(string);
                return k2.mo32826a(string);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16826j(C16815b bVar) {
            super(0);
            this.f47109d = bVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C16827a(this.f47109d));
        }
    }

    public C16815b() {
        C16826j jVar = new C16826j(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C16823g(new C16822f(this)));
        this.f47099M = C1514j0.m5374c(this, C41520a0.m120436b(C16836i.class), new C16824h(a), new C16825i((C43064a) null, a), jVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final void m59286h2(EmailUiModel emailUiModel) {
        C1533o.m5445b(this, "EMAIL_SELECTOR_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("EMAIL_RESULT_KEY", emailUiModel)));
        mo4577k1();
    }

    /* renamed from: i2 */
    private final C16831f m59287i2() {
        return (C16831f) this.f47100N.getValue();
    }

    /* renamed from: j2 */
    private final C12735d m59288j2() {
        C12735d dVar = this.f47097K;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C16836i m59289l2() {
        return (C16836i) this.f47099M.getValue();
    }

    /* renamed from: m2 */
    private final void m59290m2() {
        mo26370a2(C32343x.m95388F("packages.application.I.email.list.Asheet.header", new Object[0]));
        Button button = m59288j2().f37692e;
        button.setButtonText(C32343x.m95388F("packages.application.I.email.list.Asheet.button.label", new Object[0]));
        button.setOnClickListener(new C16814a(this));
        m59288j2().f37693f.setAdapter(m59287i2());
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m59291n2(C16815b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        new C17289c().mo4576A1(bVar.getChildFragmentManager(), (String) null);
    }

    private final void observeData() {
        C16835h ew = m59289l2().mo43959ew();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        ew.mo43957q().mo4819k(viewLifecycleOwner, new C16821e(new C16819c(m59287i2())));
        C37224b.m109963b(ew.mo43956R0(), viewLifecycleOwner, new C16820d(this));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f47097K = C12735d.m48334d(layoutInflater, viewGroup, true);
    }

    /* renamed from: k2 */
    public final C16836i.C16837a mo43940k2() {
        C16836i.C16837a aVar = this.f47098L;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        this.f47097K = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        observeData();
        m59290m2();
    }
}
