package o31;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.v */
final class C37620v extends RecyclerView.C1756u implements RecyclerView.C1755t {

    /* renamed from: a */
    private int f90377a;

    /* renamed from: b */
    private int f90378b = -1;

    /* renamed from: c */
    private int f90379c;

    /* renamed from: d */
    private int f90380d;

    /* renamed from: e */
    private int f90381e;

    /* renamed from: f */
    private int f90382f;

    /* renamed from: a */
    public void mo5736a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C41536l.m120489i(recyclerView, "rv");
        C41536l.m120489i(motionEvent, "e");
    }

    /* renamed from: b */
    public boolean mo5737b(RecyclerView recyclerView, MotionEvent motionEvent) {
        C41536l.m120489i(recyclerView, "rv");
        C41536l.m120489i(motionEvent, "e");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f90378b = motionEvent.getPointerId(0);
            this.f90379c = (int) (motionEvent.getX() + 0.5f);
            this.f90380d = (int) (motionEvent.getY() + 0.5f);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f90378b);
            if (findPointerIndex >= 0 && this.f90377a != 1) {
                this.f90381e = ((int) (motionEvent.getX(findPointerIndex) + 0.5f)) - this.f90379c;
                this.f90382f = ((int) (motionEvent.getY(findPointerIndex) + 0.5f)) - this.f90380d;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            this.f90378b = motionEvent.getPointerId(actionIndex);
            this.f90379c = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f90380d = (int) (motionEvent.getY(actionIndex) + 0.5f);
        }
        return false;
    }

    /* renamed from: c */
    public void mo5738c(boolean z) {
    }

    /* renamed from: d */
    public void mo5739d(RecyclerView recyclerView, int i) {
        RecyclerView.C1747p layoutManager;
        boolean v;
        boolean w;
        C41536l.m120489i(recyclerView, "recyclerView");
        int i2 = this.f90377a;
        this.f90377a = i;
        if (i2 == 0 && i == 1 && (layoutManager = recyclerView.getLayoutManager()) != null && (v = layoutManager.mo5226v()) != (w = layoutManager.mo5227w())) {
            if ((v && Math.abs(this.f90382f) > Math.abs(this.f90381e)) || (w && Math.abs(this.f90381e) > Math.abs(this.f90382f))) {
                recyclerView.mo5275M1();
            }
        }
    }
}
