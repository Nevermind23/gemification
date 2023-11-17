package nf0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import b41.C31128a;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import ie0.C25190j;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.galtandtaggart.presentation.exchange.GTTransferAccountsViewModel$ViewModel;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p642vh.C18368l;
import ue0.C28718d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: nf0.a */
public final class C26457a extends C26480i {

    /* renamed from: K */
    public static final C26459b f67031K = new C26459b((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f67032G;

    /* renamed from: H */
    private C28718d f67033H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C26470d f67034I = new C26470d();
    /* access modifiers changed from: private */

    /* renamed from: J */
    public C26458a f67035J;

    /* renamed from: nf0.a$a */
    public interface C26458a {
        /* renamed from: H */
        void mo60236H(TransferAccountItem transferAccountItem);

        /* renamed from: f */
        void mo60238f(List list);

        /* renamed from: m0 */
        void mo60239m0();
    }

    /* renamed from: nf0.a$b */
    public static final class C26459b {
        private C26459b() {
        }

        public /* synthetic */ C26459b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C26457a mo65755a(List list) {
            C26457a aVar = new C26457a();
            aVar.setArguments(C0908e.m3336b(C41233s.m119492a("ACCOUNTS_KEY", list)));
            return aVar;
        }
    }

    /* renamed from: nf0.a$c */
    static final class C26460c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26457a f67036d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26460c(C26457a aVar) {
            super(1);
            this.f67036d = aVar;
        }

        /* renamed from: a */
        public final void mo65756a(TransferAccountItem transferAccountItem) {
            C41536l.m120489i(transferAccountItem, "acc");
            C26458a f2 = this.f67036d.f67035J;
            if (f2 != null) {
                f2.mo60236H(transferAccountItem);
            }
            this.f67036d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65756a((TransferAccountItem) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nf0.a$d */
    static final class C26461d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26457a f67037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26461d(C26457a aVar) {
            super(1);
            this.f67037d = aVar;
        }

        /* renamed from: a */
        public final void mo65757a(C31128a aVar) {
            if (aVar instanceof C31128a.C31129a) {
                C1505h requireActivity = this.f67037d.requireActivity();
                C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
                ((C35388f2) requireActivity).mo74709H1(((C31128a.C31129a) aVar).mo71342c());
                this.f67037d.mo4577k1();
            } else if (aVar instanceof C31128a.C31130b) {
                this.f67037d.m82755g2().f73162g.mo53597e();
            } else if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                if (((List) cVar.mo71340a()).isEmpty()) {
                    C26458a f2 = this.f67037d.f67035J;
                    if (f2 != null) {
                        f2.mo60239m0();
                    }
                    this.f67037d.mo4577k1();
                    return;
                }
                this.f67037d.f67034I.mo65762h((List) cVar.mo71340a());
                C26458a f22 = this.f67037d.f67035J;
                if (f22 != null) {
                    f22.mo60238f((List) cVar.mo71340a());
                }
                this.f67037d.m82755g2().f73162g.mo53595c();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo65757a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: nf0.a$e */
    static final class C26462e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f67038a;

        C26462e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f67038a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f67038a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f67038a.invoke(obj);
        }
    }

    /* renamed from: nf0.a$f */
    public static final class C26463f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f67039d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26463f(Fragment fragment) {
            super(0);
            this.f67039d = fragment;
        }

        public final Fragment invoke() {
            return this.f67039d;
        }
    }

    /* renamed from: nf0.a$g */
    public static final class C26464g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f67040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26464g(C43064a aVar) {
            super(0);
            this.f67040d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f67040d.invoke();
        }
    }

    /* renamed from: nf0.a$h */
    public static final class C26465h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f67041d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26465h(C41217g gVar) {
            super(0);
            this.f67041d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f67041d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: nf0.a$i */
    public static final class C26466i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f67042d;

        /* renamed from: e */
        final /* synthetic */ C41217g f67043e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26466i(C43064a aVar, C41217g gVar) {
            super(0);
            this.f67042d = aVar;
            this.f67043e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f67042d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f67043e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: nf0.a$j */
    public static final class C26467j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f67044d;

        /* renamed from: e */
        final /* synthetic */ C41217g f67045e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C26467j(Fragment fragment, C41217g gVar) {
            super(0);
            this.f67044d = fragment;
            this.f67045e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f67045e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f67044d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C26457a() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C26464g(new C26463f(this)));
        this.f67032G = C1514j0.m5374c(this, C41520a0.m120436b(GTTransferAccountsViewModel$ViewModel.class), new C26465h(a), new C26466i((C43064a) null, a), new C26467j(this, a));
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final C28718d m82755g2() {
        C28718d dVar = this.f67033H;
        C41536l.m120486f(dVar);
        return dVar;
    }

    /* renamed from: h2 */
    private final GTTransferAccountsViewModel$ViewModel m82756h2() {
        return (GTTransferAccountsViewModel$ViewModel) this.f67032G.getValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f67033H = C28718d.m87991d(layoutInflater, viewGroup, true);
        mo26369Z1(C18368l.m62762k(290));
        m82755g2().f73160e.setLayoutManager(new LinearLayoutManager(requireContext()));
        m82755g2().f73160e.setAdapter(this.f67034I);
        this.f67034I.mo65761g(new C26460c(this));
    }

    public void onAttach(Context context) {
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C26458a) {
            this.f67035J = (C26458a) context;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C25190j.gt_account_sheet_title));
        List list = (List) requireArguments().get("ACCOUNTS_KEY");
        if (list == null) {
            C21481a.onRefresh$default(m82756h2(), 0, 1, (Object) null);
        } else {
            this.f67034I.mo65762h(list);
        }
        m82756h2().mo60230jw().mo60228J().mo4819k(getViewLifecycleOwner(), new C26462e(new C26461d(this)));
    }
}
