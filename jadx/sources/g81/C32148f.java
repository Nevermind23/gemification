package g81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import iu0.C36546y;
import j81.C36771m;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g81.f */
public abstract class C32148f extends RecyclerView.C1736h {

    /* renamed from: d */
    private boolean f79177d;

    /* renamed from: e */
    private boolean f79178e;

    /* renamed from: f */
    private Animation f79179f = AnimationUtils.loadAnimation(C36546y.m108285N(), C10313b.infinite_alpha);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C36771m f79180g;

    /* renamed from: g81.f$a */
    class C32149a extends RecyclerView.C1734f0 {
        C32149a(View view) {
            super(view);
        }
    }

    /* renamed from: g81.f$b */
    class C32150b implements View.OnClickListener {
        C32150b() {
        }

        public void onClick(View view) {
            if (C32148f.this.f79180g != null) {
                C32148f.this.f79180g.mo89649k0();
            }
        }
    }

    /* renamed from: g81.f$c */
    class C32151c extends RecyclerView.C1734f0 {
        C32151c(View view) {
            super(view);
        }
    }

    /* renamed from: g */
    public abstract int mo72656g();

    public final int getItemCount() {
        int g = mo72656g();
        if (this.f79177d || this.f79178e) {
            return g + 1;
        }
        return g;
    }

    public final int getItemViewType(int i) {
        int h = mo72657h(i);
        if (i != getItemCount() - 1) {
            return h;
        }
        if (this.f79177d) {
            return -3;
        }
        if (this.f79178e) {
            return -2;
        }
        return h;
    }

    /* renamed from: h */
    public abstract int mo72657h(int i);

    /* renamed from: i */
    public void mo72663i() {
        if (this.f79177d) {
            this.f79177d = false;
            notifyItemRemoved(getItemCount() - 1);
        }
    }

    /* renamed from: j */
    public void mo72664j() {
        if (this.f79178e) {
            this.f79178e = false;
            notifyItemRemoved(getItemCount() - 1);
        }
    }

    /* renamed from: k */
    public abstract void mo72658k(RecyclerView.C1734f0 f0Var, int i);

    /* renamed from: l */
    public abstract RecyclerView.C1734f0 mo72659l(ViewGroup viewGroup, int i);

    /* renamed from: m */
    public void mo72665m(C36771m mVar) {
        this.f79180g = mVar;
    }

    /* renamed from: n */
    public void mo72666n() {
        if (!this.f79177d) {
            mo72664j();
            this.f79177d = true;
            notifyItemInserted(getItemCount() - 1);
        }
    }

    /* renamed from: o */
    public void mo72667o() {
        if (!this.f79178e) {
            mo72663i();
            this.f79178e = true;
            notifyItemInserted(getItemCount() - 1);
        }
    }

    public final void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == -3) {
            f0Var.itemView.findViewById(C10322k.animation_container).startAnimation(this.f79179f);
        } else if (itemViewType != -2) {
            mo72658k(f0Var, i);
        }
    }

    public final RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == -3) {
            return new C32149a(from.inflate(C10324m.operaion_loading_item, viewGroup, false));
        }
        if (i != -2) {
            return mo72659l(viewGroup, i);
        }
        View inflate = from.inflate(C10324m.operation_error_item, viewGroup, false);
        inflate.findViewById(C10322k.f28793Ts).setOnClickListener(new C32150b());
        return new C32151c(inflate);
    }
}
