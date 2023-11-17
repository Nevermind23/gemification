package d20;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g20.C20607g;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25832l;
import p366bk.C10324m;
import p90.C27366m4;
import p90.C27375n4;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import x00.C29615f;

/* renamed from: d20.f */
public final class C19848f extends C29615f {

    /* renamed from: i */
    public static final C19850b f54274i = new C19850b((DefaultConstructorMarker) null);

    /* renamed from: f */
    private ArrayList f54275f = new ArrayList();

    /* renamed from: g */
    private boolean f54276g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C43064a f54277h;

    /* renamed from: d20.f$a */
    public final class C19849a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C19848f f54278d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19849a(C19848f fVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f54278d = fVar;
            view.setOnClickListener(new C19847e(view));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m65651i(View view, View view2) {
            C41536l.m120489i(view, "$itemView");
            C36546y.m108282F().mo27152s("home", "from_accounts_slider_card", "open_debit_card_choice");
            Context context = view.getContext();
            C41536l.m120488h(context, "itemView.context");
            C38122f c = C38125h.m112238c(context);
            Context context2 = view.getContext();
            C41536l.m120488h(context2, "itemView.context");
            c.mo91597c0(context2);
        }
    }

    /* renamed from: d20.f$b */
    public static final class C19850b {
        private C19850b() {
        }

        public /* synthetic */ C19850b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d20.f$c */
    public final class C19851c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C19848f f54279d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19851c(C19848f fVar, C27366m4 m4Var) {
            super(m4Var.mo3946b());
            C41536l.m120489i(m4Var, "binding");
            this.f54279d = fVar;
            m4Var.f69302e.setOnClickListener(new C19852g(fVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m65653i(C19848f fVar, View view) {
            C41536l.m120489i(fVar, "this$0");
            C43064a E = fVar.f54277h;
            if (E != null) {
                E.invoke();
            }
        }
    }

    /* renamed from: F */
    public final void mo48150F(List list, boolean z) {
        boolean z2;
        C41536l.m120489i(list, "data");
        this.f54276g = z;
        this.f54275f.clear();
        ArrayList arrayList = this.f54275f;
        ArrayList arrayList2 = new ArrayList();
        for (Object next : list) {
            if (!((C25832l) next).mo64545u()) {
                arrayList2.add(next);
            }
        }
        arrayList.addAll(arrayList2);
        C29615f.m89897A(this, 3, this.f54275f.size(), false, 4, (Object) null);
        int i = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    List a = ((C25832l) it.next()).mo64522a();
                    if (a == null || a.isEmpty()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        i = 1;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C29615f.m89897A(this, 2, i ^ 1, false, 4, (Object) null);
        C29615f.m89897A(this, 1, 0, false, 4, (Object) null);
    }

    /* renamed from: G */
    public final void mo48151G(C43064a aVar) {
        this.f54275f.clear();
        this.f54277h = aVar;
        C29615f.m89897A(this, 3, 0, false, 4, (Object) null);
        C29615f.m89897A(this, 2, 0, false, 4, (Object) null);
        C29615f.m89897A(this, 1, 1, false, 4, (Object) null);
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(1, 0), new C29615f.C29617b(2, 0), new C29615f.C29617b(3, 0, 2, (DefaultConstructorMarker) null));
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            C27366m4 d = C27366m4.m84774d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
            return new C19851c(this, d);
        } else if (i == 2) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_card_swiper_banner_layout, viewGroup, false);
            C41536l.m120488h(inflate, "from(parent.context)\n   …er_layout, parent, false)");
            return new C19849a(this, inflate);
        } else if (i == 3) {
            C27375n4 d2 = C27375n4.m84808d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C20607g(d2);
        } else {
            String name = C19848f.class.getName();
            throw new IllegalStateException("Illegal View type " + i + " in " + name);
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C20607g) {
            Object obj = this.f54275f.get(i2);
            C41536l.m120488h(obj, "accountData[positionInSection]");
            ((C20607g) f0Var).mo49153j((C25832l) obj, this.f54276g);
        }
    }
}
