package bu0;

import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import cu0.C31431a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.model.statusbenefits.StatusBenefitsUiModel;

/* renamed from: bu0.k */
public final class C31198k extends FragmentStateAdapter {

    /* renamed from: l */
    private final List f77495l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31198k(C1505h hVar, List list) {
        super(hVar);
        C41536l.m120489i(hVar, "activity");
        C41536l.m120489i(list, "statusBenefits");
        this.f77495l = list;
    }

    public int getItemCount() {
        return this.f77495l.size();
    }

    /* renamed from: h */
    public Fragment mo6571h(int i) {
        return C31431a.f77979f.mo71786a((StatusBenefitsUiModel) this.f77495l.get(i));
    }
}
