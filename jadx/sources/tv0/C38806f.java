package tv0;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31201a;
import bv0.C31203c;
import bv0.C31206f;
import ev0.C31827h;
import he1.C41217g;
import he1.C41238w;
import java.util.ArrayList;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel;
import p349ah.C9860d;
import ue1.C43064a;
import ue1.C43075l;
import x00.C29606a;

/* renamed from: tv0.f */
public final class C38806f extends C9860d {

    /* renamed from: F */
    public static final C38807a f92869F = new C38807a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private final ArrayList f92870B;

    /* renamed from: C */
    private final C41217g f92871C = C41219i.m119470b(new C38809c(this));

    /* renamed from: D */
    private C31827h f92872D;

    /* renamed from: E */
    private C38805e f92873E;

    /* renamed from: tv0.f$a */
    public static final class C38807a {
        private C38807a() {
        }

        public /* synthetic */ C38807a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38806f mo92527a(BankWithProductsUiModel bankWithProductsUiModel) {
            C41536l.m120489i(bankWithProductsUiModel, "bank");
            C38806f fVar = new C38806f();
            Bundle bundle = new Bundle();
            bundle.putParcelable("BANK_ARG_KEY", bankWithProductsUiModel);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: tv0.f$b */
    public enum C38808b {
        REFRESH,
        DELETE
    }

    /* renamed from: tv0.f$c */
    static final class C38809c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C38806f f92877d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38809c(C38806f fVar) {
            super(0);
            this.f92877d = fVar;
        }

        /* renamed from: b */
        public final BankWithProductsUiModel invoke() {
            Bundle arguments = this.f92877d.getArguments();
            BankWithProductsUiModel bankWithProductsUiModel = arguments != null ? (BankWithProductsUiModel) arguments.getParcelable("BANK_ARG_KEY") : null;
            C41536l.m120486f(bankWithProductsUiModel);
            return bankWithProductsUiModel;
        }
    }

    /* renamed from: tv0.f$d */
    /* synthetic */ class C38810d extends C41535k implements C43075l {
        C38810d(Object obj) {
            super(1, obj, C38806f.class, "onMenuItemClicked", "onMenuItemClicked(Lge/bog/mobilebank/openbanking/presentation/products/menu/ProductMoreMenuDialogFragment$MenuItemType;)V", 0);
        }

        /* renamed from: b */
        public final void mo92529b(C38808b bVar) {
            C41536l.m120489i(bVar, "p0");
            ((C38806f) this.receiver).m113589g2(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92529b((C38808b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: tv0.f$e */
    public static final class C38811e extends C29606a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38811e(Context context, int i) {
            super(context, i);
            C41536l.m120488h(context, "requireContext()");
        }

        /* renamed from: j */
        public boolean mo39050j(View view, RecyclerView recyclerView) {
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            int k0 = recyclerView.mo5355k0(view);
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            if (k0 == -1 || adapter == null || k0 == adapter.getItemCount() - 1) {
                return false;
            }
            return true;
        }
    }

    public C38806f() {
        C38808b bVar = C38808b.DELETE;
        int i = C31206f.delete_bank;
        int i2 = C31203c.f77504c;
        int i3 = C31201a.f77498a;
        this.f92870B = C41341q.m119903f(new C38801a(bVar, i, i2, i3, Integer.valueOf(i3), C31201a.f77499b));
    }

    /* renamed from: e2 */
    private final BankWithProductsUiModel m113587e2() {
        return (BankWithProductsUiModel) this.f92871C.getValue();
    }

    /* renamed from: f2 */
    private final C31827h m113588f2() {
        C31827h hVar = this.f92872D;
        C41536l.m120486f(hVar);
        return hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public final void m113589g2(C38808b bVar) {
        C38805e eVar = this.f92873E;
        if (eVar != null) {
            eVar.mo79317Y(m113587e2(), bVar);
        }
        mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f92872D = C31827h.m94098d(layoutInflater, viewGroup, true);
    }

    public void onAttach(Context context) {
        C38805e eVar;
        C41536l.m120489i(context, "context");
        super.onAttach(context);
        if (context instanceof C38805e) {
            this.f92873E = (C38805e) context;
        } else if (getParentFragment() instanceof C38805e) {
            Fragment parentFragment = getParentFragment();
            if (parentFragment instanceof C38805e) {
                eVar = (C38805e) parentFragment;
            } else {
                eVar = null;
            }
            this.f92873E = eVar;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C31206f.additional_bank_product_settings));
        m113588f2().f78504e.setAdapter(new C38804d(this.f92870B, new C38810d(this)));
        m113588f2().f78504e.mo5351j(new C38811e(requireContext(), C31203c.f77502a));
    }
}
