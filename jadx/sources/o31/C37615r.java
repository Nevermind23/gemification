package o31;

import androidx.recyclerview.widget.C1785g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.r */
public final class C37615r extends C1785g {

    /* renamed from: t */
    private final Set f90372t;

    public C37615r(Set set) {
        C41536l.m120489i(set, "disableAnimationViewTypes");
        this.f90372t = set;
    }

    /* renamed from: x */
    public boolean mo5948x(RecyclerView.C1734f0 f0Var, RecyclerView.C1734f0 f0Var2, int i, int i2, int i3, int i4) {
        Integer num;
        Set set = this.f90372t;
        Integer num2 = null;
        if (f0Var != null) {
            num = Integer.valueOf(f0Var.getItemViewType());
        } else {
            num = null;
        }
        if (!C41358y.m119999O(set, num)) {
            Set set2 = this.f90372t;
            if (f0Var2 != null) {
                num2 = Integer.valueOf(f0Var2.getItemViewType());
            }
            if (!C41358y.m119999O(set2, num2)) {
                return super.mo5948x(f0Var, f0Var2, i, i2, i3, i4);
            }
        }
        mo6058C(f0Var, false);
        mo6058C(f0Var2, false);
        return false;
    }
}
