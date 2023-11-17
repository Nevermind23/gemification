package t51;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import b50.C19335b;
import b50.C19336c;
import f50.C20432f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o51.C37653j;
import o51.C37654k;
import p341ge.bog.mobilebank.shared.presentation.layoutmanagers.stickyheader.StickyHeaderLinearLayoutManager;
import p366bk.C10318g;
import p366bk.C10319h;
import ue1.C43075l;

/* renamed from: t51.m */
public final class C38672m extends RecyclerView.C1736h implements StickyHeaderLinearLayoutManager.C34655a.C34656a {

    /* renamed from: g */
    public static final C38673a f92558g = new C38673a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C43075l f92559d;

    /* renamed from: e */
    private final Activity f92560e;

    /* renamed from: f */
    private List f92561f = new ArrayList();

    /* renamed from: t51.m$a */
    public static final class C38673a {
        private C38673a() {
        }

        public /* synthetic */ C38673a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: t51.m$b */
    public static final class C38674b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37653j f92562d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38674b(C37653j jVar) {
            super(jVar.mo3946b());
            C41536l.m120489i(jVar, "binding");
            this.f92562d = jVar;
            int dimensionPixelOffset = jVar.mo3946b().getContext().getResources().getDimensionPixelOffset(C10319h.f28652v0);
            jVar.mo3946b().setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            jVar.mo3946b().setBackgroundColor(C0767a.m2893c(jVar.mo3946b().getContext(), C10318g.f28616A));
        }

        /* renamed from: h */
        public final void mo92328h(C38667h hVar) {
            C41536l.m120489i(hVar, "item");
            this.f92562d.f90501e.setText(hVar.mo92309a());
        }
    }

    /* renamed from: t51.m$c */
    public static final class C38675c extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38675c(C37654k kVar) {
            super(kVar.mo3946b());
            C41536l.m120489i(kVar, "binding");
        }
    }

    public C38672m(C43075l lVar, Activity activity) {
        C41536l.m120489i(activity, "activity");
        this.f92559d = lVar;
        this.f92560e = activity;
    }

    /* renamed from: b */
    public boolean mo84615b(int i) {
        return getItemViewType(i) == 2;
    }

    /* renamed from: d */
    public void mo84616d(View view) {
        StickyHeaderLinearLayoutManager.C34655a.C34656a.C34657a.m101834a(this, view);
    }

    /* renamed from: e */
    public void mo84617e(View view) {
        StickyHeaderLinearLayoutManager.C34655a.C34656a.C34657a.m101835b(this, view);
    }

    /* renamed from: f */
    public final void mo92327f(List list) {
        C41536l.m120489i(list, "items");
        this.f92561f = C41358y.m119991B0(list);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f92561f.size();
    }

    public int getItemViewType(int i) {
        C38670k kVar = (C38670k) this.f92561f.get(i);
        if (kVar instanceof C38669j) {
            return 1;
        }
        if (kVar instanceof C38667h) {
            return 2;
        }
        return 3;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        String str;
        RecyclerView.C1734f0 f0Var2 = f0Var;
        C41536l.m120489i(f0Var2, "holder");
        C38670k kVar = (C38670k) this.f92561f.get(i);
        if (f0Var2 instanceof C38674b) {
            C41536l.m120487g(kVar, "null cannot be cast to non-null type ge.bog.mobilebank.statements.presentation.landing.HeaderItem");
            ((C38674b) f0Var2).mo92328h((C38667h) kVar);
        } else if (f0Var2 instanceof C20432f) {
            C20432f fVar = (C20432f) f0Var2;
            C41536l.m120487g(kVar, "null cannot be cast to non-null type ge.bog.mobilebank.statements.presentation.landing.RegularItem");
            C38669j jVar = (C38669j) kVar;
            Integer b = jVar.mo92317b();
            BigDecimal f = jVar.mo92322f();
            C19335b g = jVar.mo92323g();
            if (g != null) {
                str = g.mo47537b();
            } else {
                str = null;
            }
            C20432f.m66575q(fVar, new C20432f.C20434b.C20436b(b, f, str, jVar.mo92324h(), Boolean.valueOf(jVar.mo92318c()), jVar.mo92316a(), (String) null, (String) null, (Long) null, (String) null, (C19336c) null, (Boolean) null, 4032, (DefaultConstructorMarker) null), this.f92559d, Boolean.TRUE, (C43075l) null, 8, (Object) null);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 1) {
            return C20432f.f55387t.mo48921a(viewGroup, this.f92560e, "statement", false);
        }
        if (i == 2) {
            C37653j d = C37653j.m110704d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …  false\n                )");
            return new C38674b(d);
        } else if (i == 3) {
            C37654k d2 = C37654k.m110708d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
            return new C38675c(d2);
        } else {
            throw new IllegalStateException("Unknown view type");
        }
    }
}
