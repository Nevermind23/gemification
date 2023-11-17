package o81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import l81.C37106c;
import l81.C37107d;

/* renamed from: o81.b */
public abstract class C37694b extends C37106c {

    /* renamed from: d */
    private List f90557d = new ArrayList();

    /* renamed from: e */
    private C37693a f90558e;

    /* renamed from: f */
    private boolean f90559f = false;

    /* renamed from: g */
    private boolean f90560g = false;

    /* renamed from: h */
    private RecyclerView f90561h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C37698d f90562i;

    /* renamed from: j */
    private boolean f90563j;

    /* renamed from: k */
    private C37697c f90564k;

    /* renamed from: o81.b$a */
    class C37695a extends C37698d {
        C37695a() {
        }

        /* renamed from: k */
        public void mo90888k() {
            C37694b.this.m110779u();
        }
    }

    /* renamed from: o81.b$b */
    class C37696b implements View.OnClickListener {
        C37696b() {
        }

        public void onClick(View view) {
            C37694b.this.f90562i.mo90893l(true);
            C37694b.this.m110779u();
        }
    }

    public C37694b(C37693a aVar) {
        this.f90558e = aVar;
        this.f90562i = new C37695a();
    }

    /* renamed from: E */
    private void m110773E(List list) {
        if (list == null) {
            throw new IllegalArgumentException("You can't use a null List<Item> instance.");
        }
    }

    /* renamed from: l */
    private void m110776l() {
        if (this.f90563j && !this.f90562i.mo90892i(this.f90561h)) {
            this.f90562i.mo90890g(this.f90561h);
        }
    }

    /* renamed from: s */
    private boolean m110777s(int i) {
        return i == -3 || i == -2;
    }

    /* renamed from: t */
    private boolean m110778t(int i) {
        int itemCount = getItemCount() - 1;
        if (!mo90885q() || i != itemCount) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m110779u() {
        C37697c cVar = this.f90564k;
        if (cVar != null) {
            cVar.mo86390z();
        }
    }

    /* renamed from: x */
    private C37107d m110780x(ViewGroup viewGroup, int i) {
        View view;
        C37693a aVar = this.f90558e;
        if (aVar == null) {
            return null;
        }
        if (i == -3) {
            view = mo90035h(aVar.mo90871b(), viewGroup);
            view.findViewById(this.f90558e.mo90870a()).setOnClickListener(new C37696b());
        } else {
            view = mo90035h(aVar.mo90872c(), viewGroup);
        }
        return new C37107d(view);
    }

    /* renamed from: A */
    public void mo90876A() {
        this.f90562i.mo90893l(false);
    }

    /* renamed from: B */
    public void mo90877B(List list) {
        m110773E(list);
        this.f90557d = list;
        notifyDataSetChanged();
    }

    /* renamed from: C */
    public void mo90878C(C37697c cVar) {
        this.f90564k = cVar;
    }

    /* renamed from: D */
    public void mo90879D(boolean z) {
        this.f90560g = z;
        if (!this.f90559f) {
            this.f90559f = true;
            notifyDataSetChanged();
            return;
        }
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public LayoutInflater mo90034f(View view) {
        return LayoutInflater.from(view.getContext());
    }

    public int getItemCount() {
        int size = this.f90557d.size();
        if (mo90885q()) {
            return size + 1;
        }
        return size;
    }

    public int getItemViewType(int i) {
        if (!m110778t(i)) {
            return -1;
        }
        if (this.f90560g) {
            return -2;
        }
        return -3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public View mo90035h(int i, ViewGroup viewGroup) {
        return mo90034f(viewGroup).inflate(i, viewGroup, false);
    }

    /* renamed from: i */
    public void onBindViewHolder(C37107d dVar, int i) {
        if (m110778t(i)) {
            mo72619v(dVar, i);
        } else {
            mo72620w(dVar, i);
        }
    }

    public boolean isEmpty() {
        List list = this.f90557d;
        return list == null || list.size() == 0;
    }

    /* renamed from: m */
    public void mo90881m() {
        if (this.f90563j) {
            this.f90563j = false;
            mo90886r();
            this.f90562i.mo90891h(this.f90561h);
        }
    }

    /* renamed from: n */
    public void mo90882n() {
        if (!this.f90563j) {
            this.f90563j = true;
            mo90879D(true);
            m110776l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public Object mo90883o(int i) {
        if (i >= 0) {
            return this.f90557d.get(i);
        }
        return null;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f90561h = recyclerView;
        m110776l();
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f90562i.mo90891h(recyclerView);
        this.f90561h = null;
    }

    /* renamed from: p */
    public List mo90884p() {
        return this.f90557d;
    }

    /* renamed from: q */
    public boolean mo90885q() {
        return this.f90558e != null && this.f90559f;
    }

    /* renamed from: r */
    public void mo90886r() {
        if (this.f90559f) {
            this.f90559f = false;
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo72619v(C37107d dVar, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo72620w(C37107d dVar, int i);

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract C37107d mo72621y(ViewGroup viewGroup, int i);

    /* renamed from: z */
    public C37107d onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (m110777s(i)) {
            return m110780x(viewGroup, i);
        }
        return mo72621y(viewGroup, i);
    }
}
