package l81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: l81.c */
public abstract class C37106c extends RecyclerView.C1736h {
    /* access modifiers changed from: protected */
    /* renamed from: f */
    public LayoutInflater mo90034f(View view) {
        return LayoutInflater.from(view.getContext());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public boolean mo70863g() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public View mo90035h(int i, ViewGroup viewGroup) {
        return mo90034f(viewGroup).inflate(i, viewGroup, false);
    }

    /* renamed from: i */
    public void mo65512i(C37107d dVar, int i) {
        if (mo70863g() && dVar.f89288e != null) {
            if (i == getItemCount() - 1) {
                dVar.f89288e.setVisibility(4);
            } else {
                dVar.f89288e.setVisibility(0);
            }
        }
    }
}
