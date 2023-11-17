package rx0;

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
import p341ge.bog.mobilebank.payment.activities.TemplateFormActivity;
import p341ge.bog.mobilebank.payment.model.C33624a;
import p341ge.bog.mobilebank.payments.presentation.categories.C33635a;
import p341ge.bog.mobilebank.payments.presentation.categories.payments.CategoriesPaymentsViewModel;
import p341ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import q31.C38122f;
import q31.C38125h;
import u61.C39033a;
import ue1.C43064a;

/* renamed from: rx0.a */
public final class C38381a extends C33635a {

    /* renamed from: i */
    private final C41217g f91971i;

    /* renamed from: rx0.a$a */
    public static final class C38382a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f91972d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38382a(Fragment fragment) {
            super(0);
            this.f91972d = fragment;
        }

        public final Fragment invoke() {
            return this.f91972d;
        }
    }

    /* renamed from: rx0.a$b */
    public static final class C38383b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f91973d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38383b(C43064a aVar) {
            super(0);
            this.f91973d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f91973d.invoke();
        }
    }

    /* renamed from: rx0.a$c */
    public static final class C38384c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f91974d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38384c(C41217g gVar) {
            super(0);
            this.f91974d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f91974d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: rx0.a$d */
    public static final class C38385d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f91975d;

        /* renamed from: e */
        final /* synthetic */ C41217g f91976e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38385d(C43064a aVar, C41217g gVar) {
            super(0);
            this.f91975d = aVar;
            this.f91976e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f91975d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f91976e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: rx0.a$e */
    public static final class C38386e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f91977d;

        /* renamed from: e */
        final /* synthetic */ C41217g f91978e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38386e(Fragment fragment, C41217g gVar) {
            super(0);
            this.f91977d = fragment;
            this.f91978e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f91978e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f91977d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C38381a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38383b(new C38382a(this)));
        this.f91971i = C1514j0.m5374c(this, C41520a0.m120436b(CategoriesPaymentsViewModel.class), new C38384c(a), new C38385d((C43064a) null, a), new C38386e(this, a));
    }

    /* renamed from: A1 */
    public void mo80203A1(C39033a aVar) {
        C41536l.m120489i(aVar, "template");
        C33624a.m98713a(getActivity()).mo79806f(TemplateFormActivity.class).mo79821u(aVar.mo92699c()).mo79825y();
    }

    /* renamed from: B1 */
    public void mo80204B1() {
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f.C38123a.m112203D(c, requireContext, (String) null, 2, (Object) null);
    }

    /* renamed from: I1 */
    public CategoriesPaymentsViewModel mo80205v1() {
        return (CategoriesPaymentsViewModel) this.f91971i.getValue();
    }

    public String getHeaderText() {
        return C34646b.m101752f(C37833c.f90838a.mo91132R(), (Context) null, 1, (Object) null);
    }

    /* renamed from: z1 */
    public void mo80206z1(C31456c cVar) {
        C41536l.m120489i(cVar, "node");
        PaymentFormActivity.C33706a aVar = PaymentFormActivity.f82132c0;
        String s = cVar.mo71852c().mo71836s();
        String E = C32343x.m95386E(cVar.mo71852c().mo71837t(), true, new Object[0]);
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo80357a(s, E, requireContext);
    }
}
