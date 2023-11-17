package qx0;

import android.content.Context;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import cx0.C31456c;
import g91.C32343x;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ox0.C37833c;
import p163m0.C7047a;
import p341ge.bog.mobilebank.payments.presentation.categories.C33635a;
import p341ge.bog.mobilebank.payments.presentation.categories.p974dd.CategoriesDdViewModel;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import q31.C38122f;
import q31.C38125h;
import u61.C39033a;
import ue1.C43064a;

/* renamed from: qx0.a */
public final class C38259a extends C33635a {

    /* renamed from: i */
    private final C41217g f91752i;

    /* renamed from: qx0.a$a */
    public static final class C38260a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f91753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38260a(Fragment fragment) {
            super(0);
            this.f91753d = fragment;
        }

        public final Fragment invoke() {
            return this.f91753d;
        }
    }

    /* renamed from: qx0.a$b */
    public static final class C38261b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f91754d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38261b(C43064a aVar) {
            super(0);
            this.f91754d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f91754d.invoke();
        }
    }

    /* renamed from: qx0.a$c */
    public static final class C38262c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f91755d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38262c(C41217g gVar) {
            super(0);
            this.f91755d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f91755d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: qx0.a$d */
    public static final class C38263d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f91756d;

        /* renamed from: e */
        final /* synthetic */ C41217g f91757e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38263d(C43064a aVar, C41217g gVar) {
            super(0);
            this.f91756d = aVar;
            this.f91757e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f91756d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f91757e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: qx0.a$e */
    public static final class C38264e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f91758d;

        /* renamed from: e */
        final /* synthetic */ C41217g f91759e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38264e(Fragment fragment, C41217g gVar) {
            super(0);
            this.f91758d = fragment;
            this.f91759e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f91759e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f91758d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C38259a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38261b(new C38260a(this)));
        this.f91752i = C1514j0.m5374c(this, C41520a0.m120436b(CategoriesDdViewModel.class), new C38262c(a), new C38263d((C43064a) null, a), new C38264e(this, a));
    }

    /* renamed from: A1 */
    public void mo80203A1(C39033a aVar) {
        C41536l.m120489i(aVar, "template");
    }

    /* renamed from: B1 */
    public void mo80204B1() {
    }

    /* renamed from: I1 */
    public CategoriesDdViewModel mo80205v1() {
        return (CategoriesDdViewModel) this.f91752i.getValue();
    }

    public String getHeaderText() {
        return C34646b.m101752f(C37833c.f90838a.mo91150l(), (Context) null, 1, (Object) null);
    }

    /* renamed from: z1 */
    public void mo80206z1(C31456c cVar) {
        C41536l.m120489i(cVar, "node");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        String s = cVar.mo71852c().mo71836s();
        String E = C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91610j(s, E, requireContext);
    }
}
