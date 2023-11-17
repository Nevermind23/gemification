package p341ge.bog.designsystem.components.carousel;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import p560ph.C17355e;

/* renamed from: ge.bog.designsystem.components.carousel.CarouselLayoutManager */
public final class CarouselLayoutManager extends LinearLayoutManager {

    /* renamed from: L */
    private Integer f39002L;

    /* renamed from: M */
    private C13217a f39003M;

    /* renamed from: ge.bog.designsystem.components.carousel.CarouselLayoutManager$a */
    public interface C13217a {
        /* renamed from: K */
        void mo35110K(int i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CarouselLayoutManager(Context context) {
        super(context, 0, false);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: c3 */
    private final int m49712c3() {
        float x0 = ((float) mo5716x0()) / 2.0f;
        int V = mo5660V();
        float f = Utils.FLOAT_EPSILON;
        int i = -1;
        for (int i2 = 0; i2 < V; i2++) {
            View U = mo5658U(i2);
            C41536l.m120486f(U);
            float abs = Math.abs((((float) (U.getLeft() + U.getRight())) / 2.0f) - x0);
            if (i2 == 0 || abs <= f) {
                i = i2;
                f = abs;
            }
        }
        return i;
    }

    /* renamed from: d3 */
    private final C17355e.C17356a m49713d3(C17355e eVar, int i) {
        boolean z;
        int c3 = m49712c3();
        C17355e.C17357b viewType = eVar.getViewType();
        if (i == c3) {
            return viewType.mo44789b();
        }
        boolean z2 = false;
        if (i == c3 - 1 || i == c3 + 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return viewType.mo44790c();
        }
        if (i == c3 - 2 || i == c3 + 2) {
            z2 = true;
        }
        if (z2) {
            return viewType.mo44791d();
        }
        return viewType.mo44788a();
    }

    /* renamed from: e3 */
    private final void m49714e3() {
        int V = mo5660V();
        int i = 0;
        while (i < V) {
            View U = mo5658U(i);
            C41536l.m120486f(U);
            C17355e eVar = (C17355e) U;
            C17355e.C17356a d3 = m49713d3(eVar, i);
            if (d3 != null) {
                eVar.mo44765d(d3);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f3 */
    public final void mo35109f3(C13217a aVar) {
        this.f39003M = aVar;
    }

    /* renamed from: j1 */
    public void mo5171j1(RecyclerView.C1726b0 b0Var) {
        super.mo5171j1(b0Var);
        C41238w wVar = C41238w.f97225a;
        m49714e3();
    }

    /* renamed from: p1 */
    public void mo5699p1(int i) {
        Integer num;
        super.mo5699p1(i);
        if (i == 0) {
            int V = mo5660V();
            int i2 = 0;
            while (i2 < V) {
                View U = mo5658U(i2);
                C41536l.m120486f(U);
                C17355e eVar = (C17355e) U;
                int parseInt = Integer.parseInt(eVar.getValue());
                if (!C41536l.m120484d(eVar.getAppliedType(), eVar.getViewType().mo44789b()) || ((num = this.f39002L) != null && parseInt == num.intValue())) {
                    i2++;
                } else {
                    this.f39002L = Integer.valueOf(parseInt);
                    C13217a aVar = this.f39003M;
                    if (aVar != null) {
                        aVar.mo35110K(parseInt);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
