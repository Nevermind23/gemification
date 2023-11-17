package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.u */
abstract class C1831u {
    /* renamed from: a */
    static int m7117a(RecyclerView.C1726b0 b0Var, C1824r rVar, View view, View view2, RecyclerView.C1747p pVar, boolean z) {
        if (pVar.mo5660V() == 0 || b0Var.mo5461b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.mo5700q0(view) - pVar.mo5700q0(view2)) + 1;
        }
        return Math.min(rVar.mo6045o(), rVar.mo6034d(view2) - rVar.mo6037g(view));
    }

    /* renamed from: b */
    static int m7118b(RecyclerView.C1726b0 b0Var, C1824r rVar, View view, View view2, RecyclerView.C1747p pVar, boolean z, boolean z2) {
        int i;
        if (pVar.mo5660V() == 0 || b0Var.mo5461b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(pVar.mo5700q0(view), pVar.mo5700q0(view2));
        int max = Math.max(pVar.mo5700q0(view), pVar.mo5700q0(view2));
        if (z2) {
            i = Math.max(0, (b0Var.mo5461b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(rVar.mo6034d(view2) - rVar.mo6037g(view))) / ((float) (Math.abs(pVar.mo5700q0(view) - pVar.mo5700q0(view2)) + 1)))) + ((float) (rVar.mo6044n() - rVar.mo6037g(view))));
    }

    /* renamed from: c */
    static int m7119c(RecyclerView.C1726b0 b0Var, C1824r rVar, View view, View view2, RecyclerView.C1747p pVar, boolean z) {
        if (pVar.mo5660V() == 0 || b0Var.mo5461b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b0Var.mo5461b();
        }
        return (int) ((((float) (rVar.mo6034d(view2) - rVar.mo6037g(view))) / ((float) (Math.abs(pVar.mo5700q0(view) - pVar.mo5700q0(view2)) + 1))) * ((float) b0Var.mo5461b()));
    }
}
