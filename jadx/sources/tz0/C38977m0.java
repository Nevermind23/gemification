package tz0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import g91.C32290b1;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41238w;
import iy0.C36638u;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.input.Input;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: tz0.m0 */
public final class C38977m0 extends C38973k0 {

    /* renamed from: i */
    public static final C38978a f93095i = new C38978a((DefaultConstructorMarker) null);

    /* renamed from: g */
    private C36638u f93096g;

    /* renamed from: h */
    private final C41217g f93097h;

    /* renamed from: tz0.m0$a */
    public static final class C38978a {
        private C38978a() {
        }

        public /* synthetic */ C38978a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38977m0 mo92673a() {
            return new C38977m0();
        }
    }

    /* renamed from: tz0.m0$b */
    static final class C38979b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38977m0 f93098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38979b(C38977m0 m0Var) {
            super(1);
            this.f93098d = m0Var;
        }

        /* renamed from: a */
        public final void mo92674a(String str) {
            Input input = this.f93098d.m113889k1().f88434f;
            C41536l.m120488h(str, "it");
            input.setInputText(str);
            C32290b1.m95115e(this.f93098d.m113889k1().f88434f.getTextInput());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92674a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tz0.m0$c */
    static final class C38980c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f93099a;

        C38980c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f93099a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f93099a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f93099a.invoke(obj);
        }
    }

    /* renamed from: tz0.m0$d */
    public static final class C38981d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f93100d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38981d(C43064a aVar) {
            super(0);
            this.f93100d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f93100d.invoke();
        }
    }

    /* renamed from: tz0.m0$e */
    public static final class C38982e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f93101d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38982e(C41217g gVar) {
            super(0);
            this.f93101d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f93101d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: tz0.m0$f */
    public static final class C38983f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f93102d;

        /* renamed from: e */
        final /* synthetic */ C41217g f93103e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38983f(C43064a aVar, C41217g gVar) {
            super(0);
            this.f93102d = aVar;
            this.f93103e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f93102d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f93103e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: tz0.m0$g */
    public static final class C38984g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f93104d;

        /* renamed from: e */
        final /* synthetic */ C41217g f93105e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38984g(Fragment fragment, C41217g gVar) {
            super(0);
            this.f93104d = fragment;
            this.f93105e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f93105e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f93104d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    /* renamed from: tz0.m0$h */
    static final class C38985h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38977m0 f93106d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38985h(C38977m0 m0Var) {
            super(0);
            this.f93106d = m0Var;
        }

        public final C1638u0 invoke() {
            Fragment requireParentFragment = this.f93106d.requireParentFragment();
            C41536l.m120488h(requireParentFragment, "requireParentFragment()");
            return requireParentFragment;
        }
    }

    public C38977m0() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38981d(new C38985h(this)));
        this.f93097h = C1514j0.m5374c(this, C41520a0.m120436b(C38923d0.class), new C38982e(a), new C38983f((C43064a) null, a), new C38984g(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final C36638u m113889k1() {
        C36638u uVar = this.f93096g;
        C41536l.m120486f(uVar);
        return uVar;
    }

    /* renamed from: l1 */
    private final C38923d0 m113890l1() {
        return (C38923d0) this.f93097h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m113891m1(C38977m0 m0Var, View view) {
        C41536l.m120489i(m0Var, "this$0");
        m0Var.m113890l1().mo92622Tw().mo92626Wo(m0Var.m113889k1().f88434f.getInputText());
    }

    private final void observeData() {
        m113890l1().mo92623Uw().mo92632ts().mo4819k(getViewLifecycleOwner(), new C38980c(new C38979b(this)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f93096g = C36638u.m108688d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m113889k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f93096g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m113889k1().f88433e.setOnClickListener(new C38975l0(this));
        observeData();
    }
}
