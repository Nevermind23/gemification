package p341ge.bog.mobilebank.p975ui.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import g91.C32359z0;
import l81.C37112h;
import p366bk.C10327p;
import p366bk.C10330s;

/* renamed from: ge.bog.mobilebank.ui.components.BogSwipeRefreshLayout */
public class BogSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: U */
    private boolean f85886U;

    /* renamed from: V */
    private int[] f85887V = {C10327p.ui_refresh_start, C10327p.ui_refresh_start_1, C10327p.ui_refresh_start_2, C10327p.ui_refresh_start_3};

    /* renamed from: W */
    private int[] f85888W = {C10327p.ui_refresh_finish, C10327p.ui_refresh_end_1, C10327p.ui_refresh_end_2, C10327p.ui_refresh_end_3};

    /* renamed from: a0 */
    int f85889a0 = 0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public C37112h f85890b0;

    /* renamed from: c0 */
    private boolean f85891c0;

    /* renamed from: d0 */
    boolean f85892d0;

    /* renamed from: ge.bog.mobilebank.ui.components.BogSwipeRefreshLayout$a */
    class C35549a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f85893d;

        C35549a(int i) {
            this.f85893d = i;
        }

        public void run() {
            BogSwipeRefreshLayout.this.f85890b0.mo90044b(this.f85893d);
        }
    }

    public BogSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10330s.f29009D0);
        if (obtainStyledAttributes != null) {
            this.f85886U = obtainStyledAttributes.getBoolean(C10330s.f29019E0, false);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: w */
    private void m105558w(int i) {
        post(new C35549a(i));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f85886U) {
            C37112h hVar = new C37112h();
            this.f85890b0 = hVar;
            hVar.mo90043a(getContext(), this.f85887V);
            this.f85890b0.mo90043a(getContext(), this.f85888W);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C37112h hVar;
        super.onDetachedFromWindow();
        if (this.f85886U && (hVar = this.f85890b0) != null) {
            hVar.mo90045c();
        }
    }

    public void setCurrentlyOnScreen(boolean z) {
        this.f85891c0 = z;
    }

    public void setRefreshing(boolean z) {
        super.setRefreshing(z);
        if (this.f85886U && z != this.f85892d0 && this.f85891c0 && C32359z0.m95569g0()) {
            if (z) {
                m105558w(this.f85887V[this.f85889a0]);
                this.f85889a0++;
            } else {
                m105558w(this.f85888W[this.f85889a0]);
            }
            if (this.f85889a0 == this.f85887V.length) {
                this.f85889a0 = 0;
            }
        }
        this.f85892d0 = z;
    }
}
