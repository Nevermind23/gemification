package w51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o51.C37650g;
import o51.C37655l;
import o51.C37656m;
import p086g1.C6201a;
import ue1.C43064a;
import w51.C39527c;
import xy0.C39934a;
import xy0.C39949m;

/* renamed from: w51.e0 */
public final class C39550e0 extends C1819o {

    /* renamed from: g */
    public static final C39552b f94024g = new C39552b((DefaultConstructorMarker) null);

    /* renamed from: h */
    private static final C39551a f94025h = new C39551a();

    /* renamed from: f */
    private C43064a f94026f;

    /* renamed from: w51.e0$a */
    public static final class C39551a extends C1796h.C1802f {
        C39551a() {
        }

        /* renamed from: d */
        public boolean mo5976a(C39527c cVar, C39527c cVar2) {
            C41536l.m120489i(cVar, "oldItem");
            C41536l.m120489i(cVar2, "newItem");
            if ((cVar instanceof C39527c.C39530c) && (cVar2 instanceof C39527c.C39530c)) {
                return C41536l.m120484d(((C39527c.C39530c) cVar).mo93184b(), ((C39527c.C39530c) cVar2).mo93184b());
            }
            if (cVar.mo93183a() == cVar2.mo93183a()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo5977b(C39527c cVar, C39527c cVar2) {
            C41536l.m120489i(cVar, "oldItem");
            C41536l.m120489i(cVar2, "newItem");
            if (cVar.mo93183a() == cVar2.mo93183a()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: w51.e0$b */
    public static final class C39552b {
        private C39552b() {
        }

        public /* synthetic */ C39552b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w51.e0$c */
    private static final class C39553c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37650g f94027d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39553c(C37650g gVar) {
            super(gVar.mo3946b());
            C41536l.m120489i(gVar, "binding");
            this.f94027d = gVar;
        }

        /* renamed from: h */
        public final void mo93223h(C39934a aVar) {
            C41536l.m120489i(aVar, "statement");
            C39949m mVar = (C39949m) C41358y.m120009Y(aVar.mo93665a());
            if (mVar != null) {
                this.f94027d.f90489e.setText(C32343x.m95408P(mVar.mo93740a(), mVar.mo93741b()));
            }
            this.f94027d.f90491g.setText(aVar.mo93666b());
            this.f94027d.f90490f.setText(aVar.mo93667c());
        }
    }

    /* renamed from: w51.e0$d */
    private static final class C39554d extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39554d(C6201a aVar) {
            super(aVar.mo3946b());
            C41536l.m120489i(aVar, "binding");
        }
    }

    public C39550e0() {
        super(f94025h);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m114961l(C39550e0 e0Var, View view) {
        C41536l.m120489i(e0Var, "this$0");
        C43064a aVar = e0Var.f94026f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public int getItemViewType(int i) {
        return ((C39527c) mo6027g(i)).mo93183a().ordinal();
    }

    /* renamed from: m */
    public final void mo93220m(C43064a aVar) {
        this.f94026f = aVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C39553c) {
            C39527c cVar = (C39527c) mo6027g(i);
            if (cVar instanceof C39527c.C39530c) {
                ((C39553c) f0Var).mo93223h(((C39527c.C39530c) cVar).mo93184b());
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C39527c.C39531d.STATEMENT.ordinal()) {
            C37650g d = C37650g.m110694d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C39553c(d);
        } else if (i == C39527c.C39531d.MORE_FAILED.ordinal()) {
            C37656m d2 = C37656m.m110716d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
            C39554d dVar = new C39554d(d2);
            dVar.itemView.setOnClickListener(new C39548d0(this));
            return dVar;
        } else if (i == C39527c.C39531d.MORE_LOADING.ordinal()) {
            C37655l d3 = C37655l.m110712d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C39554d(d3);
        } else {
            C37655l d4 = C37655l.m110712d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …lse\n                    )");
            return new C39554d(d4);
        }
    }
}
