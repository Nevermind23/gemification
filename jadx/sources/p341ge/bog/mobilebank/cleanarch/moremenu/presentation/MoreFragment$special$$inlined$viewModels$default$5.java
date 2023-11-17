package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1638u0;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$special$$inlined$viewModels$default$5 */
public final class MoreFragment$special$$inlined$viewModels$default$5 extends C41537m implements C43064a {
    final /* synthetic */ C41217g $owner$delegate;
    final /* synthetic */ Fragment $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MoreFragment$special$$inlined$viewModels$default$5(Fragment fragment, C41217g gVar) {
        super(0);
        this.$this_viewModels = fragment;
        this.$owner$delegate = gVar;
    }

    public final C1620q0.C1624b invoke() {
        C1620q0.C1624b bVar;
        C1638u0 a = C1514j0.m5375d(this.$owner$delegate);
        C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
        if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
            bVar = this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
        C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
        return bVar;
    }
}
