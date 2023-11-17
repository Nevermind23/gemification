package p341ge.bog.mobilebank.shared.products.presentation;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;

/* renamed from: ge.bog.mobilebank.shared.products.presentation.LinearLayoutManagerAccurateOffset */
public final class LinearLayoutManagerAccurateOffset extends LinearLayoutManager {

    /* renamed from: L */
    private final Map f83814L = new LinkedHashMap();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LinearLayoutManagerAccurateOffset(Context context) {
        super(context);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: F */
    public int mo5148F(RecyclerView.C1726b0 b0Var) {
        View U;
        int i;
        C41536l.m120489i(b0Var, "state");
        if (mo5660V() == 0 || (U = mo5658U(0)) == null) {
            return 0;
        }
        int q0 = mo5700q0(U);
        int i2 = -((int) U.getY());
        for (int i3 = 0; i3 < q0; i3++) {
            Integer num = (Integer) this.f83814L.get(Integer.valueOf(i3));
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            i2 += i;
        }
        return i2;
    }

    /* renamed from: j1 */
    public void mo5171j1(RecyclerView.C1726b0 b0Var) {
        super.mo5171j1(b0Var);
        int V = mo5660V();
        for (int i = 0; i < V; i++) {
            View U = mo5658U(i);
            if (U != null) {
                this.f83814L.put(Integer.valueOf(mo5700q0(U)), Integer.valueOf(U.getHeight()));
            }
        }
    }
}
