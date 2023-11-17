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
import ot0.C37748j;
import p163m0.C7047a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.piggybank.CasDetailsUiModel;
import qt0.C38243a;
import ue1.C43064a;
import ue1.C43075l;
import vs0.C39454m;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a */
public final class C33023a extends C33032c {

    /* renamed from: g */
    private C39454m f80901g;

    /* renamed from: h */
    private final C41217g f80902h = C1514j0.m5374c(this, C41520a0.m120436b(C37748j.class), new C33028d(this), new C33029e((C43064a) null, this), new C33030f(this));

    /* renamed from: i */
    private final C41217g f80903i = C41219i.m119470b(new C33024a(C38243a.f91731a));

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$a */
    /* synthetic */ class C33024a extends C41535k implements C43064a {
        C33024a(Object obj) {
            super(0, obj, C38243a.class, "getAdapter", "getAdapter()Landroidx/recyclerview/widget/ListAdapter;", 0);
        }

        /* renamed from: b */
        public final C1819o invoke() {
            return ((C38243a) this.receiver).mo91775c();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$b */
    static final class C33025b implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f80904a;

        C33025b(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f80904a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f80904a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f80904a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$c */
    static final class C33026c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C33023a f80905d;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$c$a */
        static final class C33027a extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C33023a f80906d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C33027a(C33023a aVar) {
                super(1);
                this.f80906d = aVar;
            }

            /* renamed from: a */
            public final void mo74902a(CasDetailsUiModel casDetailsUiModel) {
                C41536l.m120489i(casDetailsUiModel, "details");
                C38243a.f91731a.mo91776d(casDetailsUiModel, this.f80906d.m97392l1(), this.f80906d.m97391k1());
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo74902a((CasDetailsUiModel) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33026c(C33023a aVar) {
            super(1);
            this.f80905d = aVar;
        }

        /* renamed from: a */
        public final void mo74901a(C31128a aVar) {
            C41536l.m120488h(aVar, "result");
            C31132b.m92648j(aVar, (int[]) null, new C33027a(this.f80905d), 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74901a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$d */
    public static final class C33028d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80907d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33028d(Fragment fragment) {
            super(0);
            this.f80907d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f80907d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$e */
    public static final class C33029e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f80908d;

        /* renamed from: e */
        final /* synthetic */ Fragment f80909e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33029e(C43064a aVar, Fragment fragment) {
            super(0);
            this.f80908d = aVar;
            this.f80909e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f80908d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f80909e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.a$f */
    public static final class C33030f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f80910d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33030f(Fragment fragment) {
            super(0);
            this.f80910d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f80910d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public final C1819o m97391k1() {
        return (C1819o) this.f80903i.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C39454m m97392l1() {
        C39454m mVar = this.f80901g;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* renamed from: m1 */
    private final C37748j m97393m1() {
        return (C37748j) this.f80902h.getValue();
    }

    /* renamed from: n1 */
    private final void m97394n1() {
        C38243a aVar = C38243a.f91731a;
        C39454m l1 = m97392l1();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo91777e(l1, requireContext);
        m97392l1().f93823g.setAdapter(m97391k1());
        m97393m1().mo91006Bw().mo91004ze().mo4819k(getViewLifecycleOwner(), new C33025b(new C33026c(this)));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f80901g = C39454m.m114672d(layoutInflater, viewGroup, false);
        LinearLayoutCompat c = m97392l1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80901g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m97394n1();
    }
}
