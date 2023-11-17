package ac1;

import af1.C40303i;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10195g0;
import he1.C41238w;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import lb1.C37121c;
import p341ge.bog.designsystem.components.infocard.InfoCardView;
import p341ge.bog.sso_client.onboarding.model.StringSource;
import p642vh.C18338b0;
import ua1.C28683t1;
import ue1.C43064a;

/* renamed from: ac1.b */
public final class C31002b extends RecyclerView.C1736h {

    /* renamed from: h */
    static final /* synthetic */ C40303i[] f77152h = {C41520a0.m120439e(new C41539o(C31002b.class, "items", "getItems()Ljava/util/List;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C10195g0 f77153d;

    /* renamed from: e */
    private C18338b0 f77154e = C18338b0.C18346e.f51796d;

    /* renamed from: f */
    private RecyclerView f77155f;

    /* renamed from: g */
    private final C41555e f77156g;

    /* renamed from: ac1.b$a */
    public final class C31003a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28683t1 f77157d;

        /* renamed from: e */
        final /* synthetic */ C31002b f77158e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31003a(C31002b bVar, C28683t1 t1Var) {
            super(t1Var.mo3946b());
            C41536l.m120489i(t1Var, "binding");
            this.f77158e = bVar;
            this.f77157d = t1Var;
        }

        /* renamed from: i */
        private final CharSequence m92348i(StringSource stringSource) {
            String a;
            if (stringSource instanceof StringSource.Dictionary) {
                C10195g0 g = this.f77158e.f77153d;
                if (g == null || (a = g.mo26763a(((StringSource.Dictionary) stringSource).mo88661a(), new Object[0])) == null) {
                    return ((StringSource.Dictionary) stringSource).mo88661a();
                }
                return a;
            } else if (stringSource instanceof StringSource.Resource) {
                String string = this.f77157d.mo3946b().getContext().getString(((StringSource.Resource) stringSource).mo88681a());
                C41536l.m120488h(string, "binding.root.context.getString(this.resId)");
                return string;
            } else if (stringSource instanceof StringSource.Raw) {
                return ((StringSource.Raw) stringSource).mo88671a();
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: h */
        public final void mo71209h(C37121c cVar) {
            C41536l.m120489i(cVar, "infoCardModel");
            InfoCardView c = this.f77157d.mo3946b();
            c.setTitle(m92348i(cVar.mo90049d()));
            c.setText(m92348i(cVar.mo90046a()));
            c.setIcon(Integer.valueOf(cVar.mo90047b()));
            c.setCardNumber(Integer.valueOf(cVar.mo90048c()));
        }
    }

    /* renamed from: ac1.b$b */
    static final class C31004b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31002b f77159d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31004b(C31002b bVar) {
            super(0);
            this.f77159d = bVar;
        }

        public final void invoke() {
            C31002b bVar = this.f77159d;
            bVar.notifyItemRangeChanged(0, bVar.getItemCount());
        }
    }

    /* renamed from: ac1.b$c */
    public static final class C31005c extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C31002b f77160a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31005c(Object obj, C31002b bVar) {
            super(obj);
            this.f77160a = bVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj2;
            List list2 = (List) obj;
            if (!(!list2.isEmpty()) || list2.size() == list.size()) {
                this.f77160a.m92340j();
                return;
            }
            throw new IllegalStateException("New items must have the same length as old items");
        }
    }

    public C31002b(C10195g0 g0Var) {
        this.f77153d = g0Var;
        C41551a aVar = C41551a.f97718a;
        this.f77156g = new C31005c(C41341q.m119907j(), this);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final void m92340j() {
        m92341m(this.f77155f, new C31004b(this));
    }

    /* renamed from: m */
    private final void m92341m(RecyclerView recyclerView, C43064a aVar) {
        C41238w wVar = null;
        if (recyclerView != null) {
            if (!recyclerView.isLaidOut()) {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.postOnAnimation(new C31001a(aVar));
                wVar = C41238w.f97225a;
            }
        }
        if (wVar == null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m92342n(C43064a aVar) {
        C41536l.m120489i(aVar, "$block");
        aVar.invoke();
    }

    public int getItemCount() {
        return this.f77154e.mo46117b().mo46120b(mo71204i().size());
    }

    /* renamed from: i */
    public final List mo71204i() {
        return (List) this.f77156g.getValue(this, f77152h[0]);
    }

    /* renamed from: k */
    public void onBindViewHolder(C31003a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        if (!mo71204i().isEmpty()) {
            aVar.mo71209h((C37121c) mo71204i().get(this.f77154e.mo46117b().mo46119a(mo71204i().size(), i)));
        }
    }

    /* renamed from: l */
    public C31003a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28683t1 d = C28683t1.m87849d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C31003a(this, d);
    }

    /* renamed from: o */
    public final void mo71207o(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f77156g.setValue(this, f77152h[0], list);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setOverScrollMode(2);
        this.f77155f = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f77155f = null;
    }

    /* renamed from: p */
    public final void mo71208p(C18338b0 b0Var) {
        C41536l.m120489i(b0Var, "<set-?>");
        this.f77154e = b0Var;
    }
}
