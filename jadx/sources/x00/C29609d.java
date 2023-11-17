package x00;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37107d;
import o81.C37693a;
import p366bk.C10313b;
import p366bk.C10324m;
import ue1.C43064a;
import x00.C29615f;

/* renamed from: x00.d */
public abstract class C29609d extends C29615f {

    /* renamed from: k */
    public static final C29611b f74769k = new C29611b((DefaultConstructorMarker) null);

    /* renamed from: f */
    private C37693a f74770f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f74771g;

    /* renamed from: h */
    private ArrayList f74772h;

    /* renamed from: i */
    private final C29614e f74773i;

    /* renamed from: j */
    private RecyclerView f74774j;

    /* renamed from: x00.d$a */
    public static final class C29610a extends C29614e {

        /* renamed from: a */
        final /* synthetic */ C29609d f74775a;

        C29610a(C29609d dVar) {
            this.f74775a = dVar;
        }

        /* renamed from: f */
        public boolean mo69510f() {
            return this.f74775a.mo69514i(-3);
        }

        /* renamed from: g */
        public boolean mo69511g() {
            return this.f74775a.f74771g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo69512h() {
            this.f74775a.m89870S();
        }
    }

    /* renamed from: x00.d$b */
    public static final class C29611b {
        private C29611b() {
        }

        public /* synthetic */ C29611b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: x00.d$c */
    public static final class C29612c extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C29612c(View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
        }
    }

    /* renamed from: x00.d$d */
    static final class C29613d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29609d f74776d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29613d(C29609d dVar) {
            super(0);
            this.f74776d = dVar;
        }

        public final void invoke() {
            this.f74776d.mo69502R();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29609d(boolean z, C37693a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? new C37693a(C10324m.operaion_loading_item, C10324m.operation_error_item) : aVar);
    }

    /* renamed from: I */
    private final void m89865I(Object obj) {
        this.f74772h.add(obj);
        mo69513f(-1, 1);
    }

    /* renamed from: L */
    private final boolean m89866L() {
        return mo69514i(-3) || mo69514i(-2);
    }

    /* renamed from: O */
    private final View m89867O(int i, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C41536l.m120488h(inflate, "from(parent.context).inflate(resId, parent, false)");
        return inflate;
    }

    /* renamed from: P */
    private final boolean m89868P(int i) {
        return i == -3 || i == -2;
    }

    /* renamed from: Q */
    private final boolean m89869Q(int i) {
        int itemViewType = getItemViewType(i);
        if (!m89866L() || (itemViewType != -3 && itemViewType != -2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final void m89870S() {
        mo69506Z();
        m89874a0(new C29613d(this));
    }

    /* renamed from: U */
    private final void m89871U(RecyclerView.C1734f0 f0Var) {
        if (f0Var instanceof C29612c) {
            View view = f0Var.itemView;
            view.startAnimation(AnimationUtils.loadAnimation(view.getContext(), C10313b.infinite_alpha));
        }
    }

    /* renamed from: W */
    private final RecyclerView.C1734f0 m89872W(ViewGroup viewGroup, int i) {
        if (i != -3) {
            return new C29612c(m89867O(this.f74770f.mo90872c(), viewGroup));
        }
        View O = m89867O(this.f74770f.mo90871b(), viewGroup);
        O.findViewById(this.f74770f.mo90870a()).setOnClickListener(new C29608c(this));
        return new C37107d(O);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public static final void m89873X(C29609d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m89870S();
    }

    /* renamed from: a0 */
    private final void m89874a0(C43064a aVar) {
        RecyclerView recyclerView = this.f74774j;
        if (recyclerView != null) {
            recyclerView.post(new C29607b(aVar));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public static final void m89875b0(C43064a aVar) {
        C41536l.m120489i(aVar, "$tmp0");
        aVar.invoke();
    }

    /* renamed from: J */
    public final void mo69498J() {
        this.f74772h.clear();
        mo69517s(-1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final Object mo69499K(int i) {
        if (i < 0 || i >= this.f74772h.size()) {
            return null;
        }
        return this.f74772h.get(i);
    }

    /* renamed from: M */
    public final void mo69500M() {
        mo69517s(-3);
    }

    /* renamed from: N */
    public final void mo69501N() {
        mo69517s(-2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public abstract void mo69502R();

    /* renamed from: T */
    public final void mo69503T(List list) {
        C41536l.m120489i(list, "items");
        for (Object I : list) {
            m89865I(I);
        }
    }

    /* renamed from: V */
    public abstract void mo69504V(RecyclerView.C1734f0 f0Var, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public abstract RecyclerView.C1734f0 mo69505Y(ViewGroup viewGroup, int i);

    /* renamed from: Z */
    public final void mo69506Z() {
        this.f74771g = true;
    }

    /* renamed from: c0 */
    public final void mo69507c0() {
        this.f74771g = false;
    }

    /* renamed from: d0 */
    public final void mo69508d0() {
        mo69501N();
        C29615f.m89897A(this, -3, 1, false, 4, (Object) null);
    }

    /* renamed from: e0 */
    public final void mo69509e0() {
        mo69500M();
        C29615f.m89897A(this, -2, 1, false, 4, (Object) null);
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(-1, 0), new C29615f.C29617b(-2, 0), new C29615f.C29617b(-3, 0));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f74774j = recyclerView;
        recyclerView.mo5363n(this.f74773i);
    }

    public final RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (m89868P(i)) {
            return m89872W(viewGroup, i);
        }
        return mo69505Y(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.mo5367o1(this.f74773i);
        this.f74774j = null;
    }

    /* renamed from: p */
    public final void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (m89869Q(i)) {
            m89871U(f0Var);
        } else {
            mo69504V(f0Var, i, i2);
        }
    }

    public C29609d(boolean z, C37693a aVar) {
        C41536l.m120489i(aVar, "footer");
        this.f74770f = aVar;
        this.f74771g = z;
        this.f74772h = new ArrayList();
        this.f74773i = new C29610a(this);
    }
}
