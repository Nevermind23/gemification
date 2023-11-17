package s51;

import android.content.DialogInterface;
import android.os.Bundle;
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
import g91.C32286a1;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import hy0.C36274h;
import iy0.C36578a;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import q51.C38130a;
import s51.C38444h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: s51.a */
public final class C38427a extends C38452k {

    /* renamed from: P */
    public static final C38428a f92073P = new C38428a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C38444h.C38447c f92074K;

    /* renamed from: L */
    private final C41217g f92075L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C38449j f92076M = new C38449j(new C38429b(this));
    /* access modifiers changed from: private */

    /* renamed from: N */
    public boolean f92077N;

    /* renamed from: O */
    private C36578a f92078O;

    /* renamed from: s51.a$a */
    public static final class C38428a {
        private C38428a() {
        }

        public /* synthetic */ C38428a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38427a mo91995a(long j, boolean z) {
            C38427a aVar = new C38427a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("SELECTED_ACC_KEY_ARG", Long.valueOf(j)), C41233s.m119492a("SELECTED_ACC_IS_CREDIT", Boolean.valueOf(z))));
            return aVar;
        }
    }

    /* renamed from: s51.a$b */
    static final class C38429b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38427a f92079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38429b(C38427a aVar) {
            super(1);
            this.f92079d = aVar;
        }

        /* renamed from: a */
        public final void mo91996a(C38130a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f92079d.f92077N = true;
            C38427a aVar2 = this.f92079d;
            Bundle bundle = new Bundle();
            bundle.putLong("SELECTED_ACC_KEY_ARG", aVar.mo91650a());
            C41238w wVar = C41238w.f97225a;
            C1533o.m5445b(aVar2, "SELECTOR_RESULT_ARG", bundle);
            this.f92079d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91996a((C38130a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: s51.a$c */
    static final class C38430c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38427a f92080d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38430c(C38427a aVar) {
            super(1);
            this.f92080d = aVar;
        }

        /* renamed from: a */
        public final void mo91997a(List list) {
            this.f92080d.f92076M.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91997a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: s51.a$d */
    static final class C38431d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f92081a;

        C38431d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f92081a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f92081a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f92081a.invoke(obj);
        }
    }

    /* renamed from: s51.a$e */
    public static final class C38432e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38432e(Fragment fragment) {
            super(0);
            this.f92082d = fragment;
        }

        public final Fragment invoke() {
            return this.f92082d;
        }
    }

    /* renamed from: s51.a$f */
    public static final class C38433f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f92083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38433f(C43064a aVar) {
            super(0);
            this.f92083d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f92083d.invoke();
        }
    }

    /* renamed from: s51.a$g */
    public static final class C38434g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f92084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38434g(C41217g gVar) {
            super(0);
            this.f92084d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f92084d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: s51.a$h */
    public static final class C38435h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f92085d;

        /* renamed from: e */
        final /* synthetic */ C41217g f92086e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38435h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f92085d = aVar;
            this.f92086e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f92085d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f92086e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: s51.a$i */
    static final class C38436i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38427a f92087d;

        /* renamed from: s51.a$i$a */
        static final class C38437a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C38427a f92088d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38437a(C38427a aVar) {
                super(0);
                this.f92088d = aVar;
            }

            /* renamed from: b */
            public final C38444h invoke() {
                return this.f92088d.mo91994m2().mo32809a(this.f92088d.m112857k2(), this.f92088d.m112859n2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38436i(C38427a aVar) {
            super(0);
            this.f92087d = aVar;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C38437a(this.f92087d));
        }
    }

    public C38427a() {
        C38436i iVar = new C38436i(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38433f(new C38432e(this)));
        this.f92075L = C1514j0.m5374c(this, C41520a0.m120436b(C38444h.class), new C38434g(a), new C38435h((C43064a) null, a), iVar);
    }

    /* renamed from: i2 */
    private final void m112855i2() {
        m112858l2().mo92002gw().mo92001Gt().mo4819k(getViewLifecycleOwner(), new C38431d(new C38430c(this)));
    }

    /* renamed from: j2 */
    private final C36578a m112856j2() {
        C36578a aVar = this.f92078O;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final long m112857k2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getLong("SELECTED_ACC_KEY_ARG", -1);
        }
        return -1;
    }

    /* renamed from: l2 */
    private final C38444h m112858l2() {
        return (C38444h) this.f92075L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public final boolean m112859n2() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("SELECTED_ACC_IS_CREDIT");
        }
        return false;
    }

    /* renamed from: o2 */
    private final void m112860o2() {
        mo26370a2(getString(C36274h.statements_select_account));
        m112856j2().f88138e.setAdapter(this.f92076M);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f92078O = C36578a.m108438d(layoutInflater, viewGroup, true);
    }

    /* renamed from: m2 */
    public final C38444h.C38447c mo91994m2() {
        C38444h.C38447c cVar = this.f92074K;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("viewModelAssistedFactory");
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f92078O = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        if (!this.f92077N && m112857k2() == -1) {
            Bundle bundle = new Bundle();
            bundle.putLong("SELECTED_ACC_KEY_ARG", -1);
            C41238w wVar = C41238w.f97225a;
            C1533o.m5445b(this, "SELECTOR_RESULT_ARG", bundle);
        }
        super.onDismiss(dialogInterface);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m112860o2();
        m112855i2();
    }
}
