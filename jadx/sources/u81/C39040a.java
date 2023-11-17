package u81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import l81.C37107d;
import o81.C37693a;
import p366bk.C10324m;

/* renamed from: u81.a */
public abstract class C39040a extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f93177d = new ArrayList();

    /* renamed from: e */
    private C37693a f93178e;

    /* renamed from: f */
    private boolean f93179f = false;

    /* renamed from: g */
    private boolean f93180g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f93181h = false;

    /* renamed from: i */
    private C39044b f93182i;

    /* renamed from: j */
    private RecyclerView f93183j;

    /* renamed from: u81.a$a */
    class C39041a extends C39044b {
        C39041a() {
        }

        /* renamed from: f */
        public boolean mo92733f() {
            return C39040a.this.f93181h;
        }

        /* renamed from: g */
        public boolean mo92734g() {
            return C39040a.this.m113981m();
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo92735h() {
            C39040a.this.m113985t();
        }
    }

    /* renamed from: u81.a$b */
    class C39042b implements View.OnClickListener {
        C39042b() {
        }

        public void onClick(View view) {
            C39040a.this.m113985t();
        }
    }

    /* renamed from: u81.a$c */
    class C39043c implements Runnable {
        C39043c() {
        }

        public void run() {
            C39040a.this.notifyDataSetChanged();
        }
    }

    public C39040a() {
        C37693a aVar = new C37693a();
        this.f93178e = aVar;
        aVar.mo90874e(C10324m.operation_error_item);
        this.f93178e.mo90875f(C10324m.operaion_loading_item);
        this.f93182i = new C39041a();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public boolean m113981m() {
        return this.f93180g || this.f93179f;
    }

    /* renamed from: o */
    private View m113982o(int i, ViewGroup viewGroup) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }

    /* renamed from: p */
    private boolean m113983p(int i) {
        return i == -3 || i == -2;
    }

    /* renamed from: q */
    private boolean m113984q(int i) {
        int itemCount = getItemCount() - 1;
        if (!m113981m() || i != itemCount) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m113985t() {
        this.f93180g = mo92730s();
        this.f93179f = false;
        m113987y();
    }

    /* renamed from: w */
    private C37107d m113986w(ViewGroup viewGroup, int i) {
        View view;
        C37693a aVar = this.f93178e;
        if (aVar == null) {
            return null;
        }
        if (i == -3) {
            view = m113982o(aVar.mo90871b(), viewGroup);
            view.findViewById(this.f93178e.mo90870a()).setOnClickListener(new C39042b());
        } else {
            view = m113982o(aVar.mo90872c(), viewGroup);
        }
        return new C37107d(view);
    }

    /* renamed from: y */
    private void m113987y() {
        RecyclerView recyclerView = this.f93183j;
        if (recyclerView != null) {
            recyclerView.post(new C39043c());
        }
    }

    /* renamed from: A */
    public void mo92722A(boolean z) {
        this.f93181h = z;
    }

    /* renamed from: B */
    public void mo92723B() {
        this.f93180g = false;
        this.f93179f = true;
        m113987y();
    }

    public int getItemCount() {
        int size = this.f93177d.size();
        if (m113981m()) {
            return size + 1;
        }
        return size;
    }

    public int getItemViewType(int i) {
        if (!m113984q(i)) {
            return -1;
        }
        if (this.f93180g) {
            return -2;
        }
        return -3;
    }

    /* renamed from: i */
    public void mo92724i(Object obj) {
        this.f93177d.add(obj);
        notifyItemInserted(this.f93177d.size() - 1);
    }

    /* renamed from: j */
    public void mo92725j(List list) {
        for (Object i : list) {
            mo92724i(i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public Object mo92726k(int i) {
        if (i < 0 || i >= this.f93177d.size()) {
            return null;
        }
        return this.f93177d.get(i);
    }

    /* renamed from: l */
    public List mo92727l() {
        return this.f93177d;
    }

    /* renamed from: n */
    public void mo92728n() {
        if (m113981m()) {
            this.f93180g = false;
            this.f93179f = false;
            notifyItemRemoved(getItemCount() - 1);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f93183j = recyclerView;
        recyclerView.mo5363n(this.f93182i);
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        if (m113984q(i)) {
            mo92731u(f0Var, i);
        } else {
            mo70851v(f0Var, i);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (m113983p(i)) {
            return m113986w(viewGroup, i);
        }
        return mo70852x(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo5367o1(this.f93182i);
        this.f93183j = null;
    }

    /* renamed from: r */
    public void mo92729r(List list) {
        mo92728n();
        mo92725j(list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract boolean mo92730s();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo92731u(RecyclerView.C1734f0 f0Var, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract void mo70851v(RecyclerView.C1734f0 f0Var, int i);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract RecyclerView.C1734f0 mo70852x(ViewGroup viewGroup, int i);

    /* renamed from: z */
    public void mo92732z(List list) {
        this.f93177d = list;
        this.f93180g = false;
        this.f93179f = false;
        m113987y();
    }
}
