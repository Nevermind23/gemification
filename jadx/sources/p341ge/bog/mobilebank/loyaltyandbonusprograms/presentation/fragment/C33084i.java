package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.C1819o;
import b41.C31128a;
import b41.C31132b;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import mt0.C37257a;
import p163m0.C7047a;
import pt0.C37996r;
import qt0.C38243a;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39454m;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i */
public final class C33084i extends C33070f {

    /* renamed from: g */
    private final C41217g f80991g = C1514j0.m5374c(this, C41520a0.m120436b(C37996r.class), new C33089d(this), new C33090e((C43064a) null, this), new C33091f(this));

    /* renamed from: h */
    private final C41217g f80992h = C41219i.m119470b(new C33085a(C38243a.f91731a));

    /* renamed from: i */
    private C39454m f80993i;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$a */
    /* synthetic */ class C33085a extends C41535k implements C43064a {
        C33085a(Object obj) {
            super(0, obj, C38243a.class, "getAdapter", "getAdapter()Landroidx/recyclerview/widget/ListAdapter;", 0);
        }

        /* renamed from: b */
        public final C1819o invoke() {
            return ((C38243a) this.receiver).mo91775c();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$b */
    static final class C33086b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33084i f80994d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$b$a */
        static final class C33087a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33084i f80995d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33087a(C33084i iVar) {
                super(1);
                this.f80995d = iVar;
            }

            /* renamed from: a */
            public final void mo74970a(C37257a aVar) {
                C41536l.m120489i(aVar, "details");
                C38243a.f91731a.mo91776d(aVar.mo90344a(), this.f80995d.m97490l1(), this.f80995d.m97489k1());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74970a((C37257a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33086b(C33084i iVar) {
            super(1);
            this.f80994d = iVar;
        }

        /* renamed from: a */
        public final void mo74969a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33087a(this.f80994d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74969a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$c */
    static final class C33088c implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80996a;

        C33088c(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80996a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80996a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80996a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$d */
    public static final class C33089d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80997d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33089d(Fragment fragment) {
            super(0);
            this.f80997d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80997d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$e */
    public static final class C33090e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80998d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80999e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33090e(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80998d = aVar;
            this.f80999e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80998d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80999e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.i$f */
    public static final class C33091f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f81000d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33091f(Fragment fragment) {
            super(0);
            this.f81000d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f81000d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final C1819o m97489k1() {
        return (C1819o) this.f80992h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C39454m m97490l1() {
        C39454m mVar = this.f80993i;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* renamed from: m1 */
    private final C37996r m97491m1() {
        return (C37996r) this.f80991g.getValue();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80993i = C39454m.m114672d(layoutInflater, viewGroup, false);
        LinearLayoutCompat c = m97490l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80993i = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C38243a aVar = C38243a.f91731a;
        C39454m l1 = m97490l1();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo91777e(l1, requireContext);
        m97490l1().f93823g.setAdapter(m97489k1());
        m97491m1().mo91369Iw().mo91359Ur().mo4819k(getViewLifecycleOwner(), new C33088c(new C33086b(this)));
    }
}
