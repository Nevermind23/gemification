package p341ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.helper;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ao.C10111c;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.mypackagedetails.helper.HorizontalRatioLinearLayoutManager */
public final class HorizontalRatioLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: L */
    private final Context f42741L;

    /* renamed from: M */
    private final int f42742M;

    /* renamed from: N */
    private final boolean f42743N;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HorizontalRatioLinearLayoutManager(Context context, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? C10111c.f27910b : i, (i2 & 4) != 0 ? false : z);
    }

    /* renamed from: c3 */
    private final int m54235c3() {
        return (mo5716x0() - getPaddingStart()) - getPaddingEnd();
    }

    /* renamed from: d3 */
    private final RecyclerView.C1752q m54236d3(RecyclerView.C1752q qVar) {
        int i;
        Resources resources = this.f42741L.getResources();
        if (this.f42743N) {
            i = C10111c.f27911c;
        } else {
            i = this.f42742M;
        }
        qVar.width = m54235c3() - resources.getDimensionPixelOffset(i);
        return qVar;
    }

    /* renamed from: P */
    public RecyclerView.C1752q mo5154P() {
        RecyclerView.C1752q P = super.mo5154P();
        C41536l.m120488h(P, "super.generateDefaultLayoutParams()");
        return m54236d3(P);
    }

    /* renamed from: Q */
    public RecyclerView.C1752q mo5156Q(Context context, AttributeSet attributeSet) {
        RecyclerView.C1752q Q = super.mo5156Q(context, attributeSet);
        C41536l.m120488h(Q, "super.generateLayoutParams(c, attrs)");
        return m54236d3(Q);
    }

    /* renamed from: R */
    public RecyclerView.C1752q mo5157R(ViewGroup.LayoutParams layoutParams) {
        RecyclerView.C1752q R = super.mo5157R(layoutParams);
        C41536l.m120488h(R, "super.generateLayoutParams(lp)");
        return m54236d3(R);
    }

    /* renamed from: v */
    public boolean mo5226v() {
        return !this.f42743N;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HorizontalRatioLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
        C41536l.m120489i(context, "context");
        this.f42741L = context;
        this.f42742M = i;
        this.f42743N = z;
    }
}
