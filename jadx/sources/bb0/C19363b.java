package bb0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import db0.C19960e;
import g91.C32343x;
import ha0.C24944u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import za0.C30272c;

/* renamed from: bb0.b */
public final class C19363b extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C19960e f53588f;

    /* renamed from: bb0.b$a */
    public final class C19364a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24944u f53589d;

        /* renamed from: e */
        final /* synthetic */ C19363b f53590e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19364a(C19363b bVar, C24944u uVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            this.f53590e = bVar;
            this.f53589d = uVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64826j(C19363b bVar, C19364a aVar, View view) {
            C30272c.C30273a aVar2;
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C30272c k = C19363b.m64823k(bVar, aVar.getAdapterPosition());
            if (k instanceof C30272c.C30273a) {
                aVar2 = (C30272c.C30273a) k;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                bVar.f53588f.mo48332A6(aVar2.mo70599b(), aVar2.mo70600c());
            }
        }

        /* renamed from: i */
        public final void mo47569i(C30272c.C30273a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f53589d.f64254f.setImageResource(aVar.mo70598a());
            this.f53589d.f64255g.setText(aVar.mo70601d());
            AppCompatTextView appCompatTextView = this.f53589d.f64253e;
            C41536l.m120488h(appCompatTextView, "binding.descText");
            C32343x.m95455i0(appCompatTextView);
            this.f53589d.mo3946b().setOnClickListener(new C19362a(this.f53590e, this));
        }
    }

    /* renamed from: bb0.b$b */
    public final class C19365b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24944u f53591d;

        /* renamed from: e */
        final /* synthetic */ C19363b f53592e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19365b(C19363b bVar, C24944u uVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            this.f53592e = bVar;
            this.f53591d = uVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64829j(C19363b bVar, C19365b bVar2, View view) {
            C30272c.C30274b bVar3;
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(bVar2, "this$1");
            C30272c k = C19363b.m64823k(bVar, bVar2.getAdapterPosition());
            if (k instanceof C30272c.C30274b) {
                bVar3 = (C30272c.C30274b) k;
            } else {
                bVar3 = null;
            }
            if (bVar3 != null) {
                bVar.f53588f.mo48334ch(bVar3.mo70608d());
            }
        }

        /* renamed from: i */
        public final void mo47570i(C30272c.C30274b bVar) {
            C41536l.m120489i(bVar, "data");
            this.f53591d.f64254f.setImageResource(bVar.mo70606b());
            this.f53591d.f64255g.setText(bVar.mo70607c());
            this.f53591d.f64253e.setText(bVar.mo70605a());
            this.f53591d.mo3946b().setOnClickListener(new C19367c(this.f53592e, this));
        }
    }

    /* renamed from: bb0.b$c */
    public final class C19366c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24944u f53593d;

        /* renamed from: e */
        final /* synthetic */ C19363b f53594e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19366c(C19363b bVar, C24944u uVar) {
            super(uVar.mo3946b());
            C41536l.m120489i(uVar, "binding");
            this.f53594e = bVar;
            this.f53593d = uVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64832j(C19363b bVar, C19366c cVar, View view) {
            C30272c.C30275c cVar2;
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(cVar, "this$1");
            C30272c k = C19363b.m64823k(bVar, cVar.getAdapterPosition());
            if (k instanceof C30272c.C30275c) {
                cVar2 = (C30272c.C30275c) k;
            } else {
                cVar2 = null;
            }
            if (cVar2 != null) {
                bVar.f53588f.mo48333Zb(cVar2.mo70615d());
            }
        }

        /* renamed from: i */
        public final void mo47571i(C30272c.C30275c cVar) {
            C41536l.m120489i(cVar, "data");
            this.f53593d.f64254f.setImageResource(cVar.mo70613b());
            this.f53593d.f64255g.setText(cVar.mo70614c());
            this.f53593d.f64253e.setText(cVar.mo70612a());
            this.f53593d.mo3946b().setOnClickListener(new C19368d(this.f53594e, this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19363b(C19960e eVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(eVar, "viewModel");
        this.f53588f = eVar;
    }

    /* renamed from: k */
    public static final /* synthetic */ C30272c m64823k(C19363b bVar, int i) {
        return (C30272c) bVar.mo6027g(i);
    }

    public int getItemViewType(int i) {
        return i;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C19365b) {
            Object g = mo6027g(i);
            C41536l.m120487g(g, "null cannot be cast to non-null type ge.bog.mobilebank.depositapplication.presentation.depositadvisor.DepositAdvisorSelectorListItem.DepositReason");
            ((C19365b) f0Var).mo47570i((C30272c.C30274b) g);
        } else if (f0Var instanceof C19366c) {
            Object g2 = mo6027g(i);
            C41536l.m120487g(g2, "null cannot be cast to non-null type ge.bog.mobilebank.depositapplication.presentation.depositadvisor.DepositAdvisorSelectorListItem.DepositTerm");
            ((C19366c) f0Var).mo47571i((C30272c.C30275c) g2);
        } else if (f0Var instanceof C19364a) {
            Object g3 = mo6027g(i);
            C41536l.m120487g(g3, "null cannot be cast to non-null type ge.bog.mobilebank.depositapplication.presentation.depositadvisor.DepositAdvisorSelectorListItem.DepositPurpose");
            ((C19364a) f0Var).mo47569i((C30272c.C30273a) g3);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C30272c cVar = (C30272c) mo6027g(i);
        if (cVar instanceof C30272c.C30274b) {
            C24944u d = C24944u.m79757d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …, false\n                )");
            return new C19365b(this, d);
        } else if (cVar instanceof C30272c.C30275c) {
            C24944u d2 = C24944u.m79757d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …, false\n                )");
            return new C19366c(this, d2);
        } else if (cVar instanceof C30272c.C30273a) {
            C24944u d3 = C24944u.m79757d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …, false\n                )");
            return new C19364a(this, d3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
