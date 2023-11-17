package o31;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: o31.w */
public final class C37621w extends RecyclerView.C1746o {

    /* renamed from: a */
    private final int f90383a;

    /* renamed from: b */
    private final int f90384b;

    /* renamed from: c */
    private final int f90385c;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37621w(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? i : i2, i3);
    }

    /* renamed from: e */
    public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
        boolean z;
        int i;
        C41536l.m120489i(rect, "outRect");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(recyclerView, "parent");
        C41536l.m120489i(b0Var, "state");
        int k0 = recyclerView.mo5355k0(view);
        boolean z2 = false;
        if (k0 == 0) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView.C1736h adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount() - 1;
        } else {
            i = -1;
        }
        if (k0 == i) {
            z2 = true;
        }
        if (this.f90385c == 0) {
            if (z) {
                rect.left = this.f90383a;
            } else if (z2) {
                rect.left = this.f90384b;
                rect.right = this.f90383a;
            } else {
                rect.left = this.f90384b;
            }
        } else if (z) {
            rect.top = this.f90383a;
        } else if (z2) {
            rect.top = this.f90384b;
            rect.bottom = this.f90383a;
        } else {
            rect.top = this.f90384b;
        }
    }

    public C37621w(int i, int i2, int i3) {
        this.f90383a = i;
        this.f90384b = i2;
        this.f90385c = i3;
    }
}
