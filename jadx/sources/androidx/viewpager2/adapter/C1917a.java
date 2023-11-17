package androidx.viewpager2.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.adapter.a */
public final class C1917a extends RecyclerView.C1734f0 {
    private C1917a(FrameLayout frameLayout) {
        super(frameLayout);
    }

    /* renamed from: h */
    static C1917a m7524h(ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(ViewCompat.m3604k());
        frameLayout.setSaveEnabled(false);
        return new C1917a(frameLayout);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public FrameLayout mo6587i() {
        return (FrameLayout) this.itemView;
    }
}
