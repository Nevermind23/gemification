package p341ge.bog.mobilebank.openbanking.presentation.details;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import bv0.C31205e;
import bv0.C31206f;
import bv0.C31207g;
import ev0.C31816a0;
import ev0.C31832m;
import ev0.C31835p;
import ev0.C31836q;
import ev0.C31837r;
import ev0.C31838s;
import ev0.C31842w;
import ev0.C31843x;
import ev0.C31844y;
import g91.C32343x;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nv0.C37469a;
import nv0.C37470b;
import nv0.C37471c;
import nv0.C37472d;
import nv0.C37473e;
import nv0.C37475g;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.loading.LoadingView;
import p341ge.bog.mobilebank.openbanking.presentation.details.C33425d;
import p630ui.C18168a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b */
public final class C33412b extends C1819o {

    /* renamed from: j */
    public static final C33415c f81591j = new C33415c((DefaultConstructorMarker) null);

    /* renamed from: k */
    private static final C33414b f81592k = new C33414b();

    /* renamed from: f */
    private final C37475g f81593f;

    /* renamed from: g */
    private C43064a f81594g;

    /* renamed from: h */
    private C43075l f81595h;

    /* renamed from: i */
    private C43075l f81596i;

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$a */
    public final class C33413a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31832m f81597d;

        /* renamed from: e */
        final /* synthetic */ C33412b f81598e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33413a(C33412b bVar, C31832m mVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            this.f81598e = bVar;
            this.f81597d = mVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m98168k(C33412b bVar, C33425d.C33426a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$data");
            C43075l n = bVar.mo79233n();
            if (n != null) {
                n.invoke(aVar.mo79245a());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m98169l(C33412b bVar, C33425d.C33426a aVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(aVar, "$data");
            C43075l m = bVar.mo79232m();
            if (m != null) {
                m.invoke(aVar.mo79245a());
            }
        }

        /* renamed from: j */
        public final void mo79238j(C33425d.C33426a aVar) {
            C41536l.m120489i(aVar, "data");
            this.f81597d.f78530e.setTitle(this.itemView.getContext().getString(C31206f.open_bank_details_label_account_number));
            this.f81597d.f78530e.setText(aVar.mo79245a());
            this.f81597d.f78531f.setOnClickListener(new C37471c(this.f81598e, aVar));
            this.f81597d.f78530e.setOnClickListener(new C37472d(this.f81598e, aVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$b */
    public static final class C33414b extends C1796h.C1802f {
        C33414b() {
        }

        /* renamed from: d */
        public boolean mo5976a(C33425d dVar, C33425d dVar2) {
            C41536l.m120489i(dVar, "oldItem");
            C41536l.m120489i(dVar2, "newItem");
            return C41536l.m120484d(dVar, dVar2);
        }

        /* renamed from: e */
        public boolean mo5977b(C33425d dVar, C33425d dVar2) {
            C41536l.m120489i(dVar, "oldItem");
            C41536l.m120489i(dVar2, "newItem");
            return C41536l.m120484d(dVar, dVar2);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$c */
    public static final class C33415c {
        private C33415c() {
        }

        public /* synthetic */ C33415c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$d */
    public static final class C33416d extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33416d(C31835p pVar) {
            super(pVar.mo3946b());
            C41536l.m120489i(pVar, "binding");
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$e */
    public static final class C33417e extends RecyclerView.C1734f0 {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33417e(C31836q qVar) {
            super(qVar.mo3946b());
            C41536l.m120489i(qVar, "binding");
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$f */
    public static final class C33418f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31842w f81599d;

        /* renamed from: e */
        private final C18168a f81600e;

        /* renamed from: f */
        private final C18168a f81601f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33418f(C31842w wVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            this.f81599d = wVar;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f81600e = new C18168a(context, C31207g.LayerRadiusBottom40Shadow20);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f81601f = new C18168a(context2, C31207g.f77549a);
        }

        /* renamed from: h */
        public final void mo79241h(C33425d.C33429d dVar, boolean z) {
            C41536l.m120489i(dVar, "data");
            this.f81599d.f78548f.setTitle(dVar.mo79247b());
            this.f81599d.f78548f.setText(dVar.mo79248c());
            this.f81599d.f78547e.setText(dVar.mo79246a());
            if (z) {
                C18168a aVar = this.f81600e;
                ListItem c = this.f81599d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                aVar.mo45824a(c);
                return;
            }
            C18168a aVar2 = this.f81601f;
            ListItem c2 = this.f81599d.mo3946b();
            C41536l.m120488h(c2, "binding.root");
            aVar2.mo45824a(c2);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$g */
    public final class C33419g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C33412b f81602d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33419g(C33412b bVar, C31837r rVar) {
            super(rVar.mo3946b());
            C41536l.m120489i(rVar, "binding");
            this.f81602d = bVar;
            rVar.f78537e.setOnClickListener(new C37473e(bVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m98177i(C33412b bVar, View view) {
            C41536l.m120489i(bVar, "this$0");
            C43064a o = bVar.mo79234o();
            if (o != null) {
                o.invoke();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$h */
    public final class C33420h extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C33412b f81603d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33420h(C33412b bVar, C31838s sVar) {
            super(sVar.mo3946b());
            C41536l.m120489i(sVar, "binding");
            this.f81603d = bVar;
            sVar.f78539e.setText(C32343x.m95388F("open.bank.transaction.permission.text", new Object[0]));
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$i */
    public static final class C33421i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31843x f81604d;

        /* renamed from: e */
        private final C18168a f81605e;

        /* renamed from: f */
        private final C18168a f81606f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33421i(C31843x xVar) {
            super(xVar.mo3946b());
            C41536l.m120489i(xVar, "binding");
            this.f81604d = xVar;
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            this.f81605e = new C18168a(context, C31207g.LayerRadiusBottom40Shadow20);
            Context context2 = this.itemView.getContext();
            C41536l.m120488h(context2, "itemView.context");
            this.f81606f = new C18168a(context2, C31207g.f77549a);
        }

        /* renamed from: h */
        public final void mo79242h(boolean z) {
            if (z) {
                C18168a aVar = this.f81605e;
                LoadingView c = this.f81604d.mo3946b();
                C41536l.m120488h(c, "binding.root");
                aVar.mo45824a(c);
                return;
            }
            C18168a aVar2 = this.f81606f;
            LoadingView c2 = this.f81604d.mo3946b();
            C41536l.m120488h(c2, "binding.root");
            aVar2.mo45824a(c2);
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$j */
    public static final class C33422j extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C31816a0 f81607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C33422j(C31816a0 a0Var) {
            super(a0Var.mo3946b());
            C41536l.m120489i(a0Var, "binding");
            this.f81607d = a0Var;
        }

        /* renamed from: h */
        public final void mo79243h(C33425d.C33434i iVar) {
            C41536l.m120489i(iVar, "data");
            this.f81607d.mo3946b().setData(iVar.mo79249a());
        }
    }

    /* renamed from: ge.bog.mobilebank.openbanking.presentation.details.b$k */
    public static final class C33423k extends RecyclerView.C1734f0 {
        C33423k(LayerView layerView) {
            super(layerView);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33412b(C37475g gVar) {
        super(f81592k);
        C41536l.m120489i(gVar, "viewModel");
        this.f81593f = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m98157p(C33412b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.f81593f.mo79214o1();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m98158t(int i, C33412b bVar, Runnable runnable) {
        C41536l.m120489i(bVar, "this$0");
        if (i != -1) {
            bVar.notifyItemChanged(i);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public int getItemViewType(int i) {
        C33425d dVar = (C33425d) mo6027g(i);
        if (dVar instanceof C33425d.C33434i) {
            return C31205e.item_product_details_header;
        }
        if (dVar instanceof C33425d.C33426a) {
            return C31205e.f77543m;
        }
        if (dVar instanceof C33425d.C33427b) {
            return C31205e.item_last_operation_header;
        }
        if (dVar instanceof C33425d.C33429d) {
            return C31205e.item_operation;
        }
        if (dVar instanceof C33425d.C33432g) {
            return C31205e.item_layout_operations_loading_error;
        }
        if (dVar instanceof C33425d.C33433h) {
            return C31205e.item_layout_operations_permission_denied;
        }
        if (dVar instanceof C33425d.C33430e) {
            return C31205e.item_operation_loading_skeleton;
        }
        if (dVar instanceof C33425d.C33428c) {
            return C31205e.item_layout_no_operations;
        }
        if (dVar instanceof C33425d.C33431f) {
            return C31205e.item_operations_paging_page_load_error;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: j */
    public void mo6030j(List list, Runnable runnable) {
        super.mo6030j(list, new C37470b(getItemCount() - 1, this, runnable));
    }

    /* renamed from: m */
    public final C43075l mo79232m() {
        return this.f81596i;
    }

    /* renamed from: n */
    public final C43075l mo79233n() {
        return this.f81595h;
    }

    /* renamed from: o */
    public final C43064a mo79234o() {
        return this.f81594g;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        boolean z = true;
        if (i != getItemCount() - 1) {
            z = false;
        }
        C33425d dVar = (C33425d) mo6027g(i);
        if (dVar instanceof C33425d.C33434i) {
            ((C33422j) f0Var).mo79243h((C33425d.C33434i) dVar);
        } else if (dVar instanceof C33425d.C33426a) {
            ((C33413a) f0Var).mo79238j((C33425d.C33426a) dVar);
        } else if (dVar instanceof C33425d.C33427b) {
        } else {
            if (dVar instanceof C33425d.C33429d) {
                ((C33418f) f0Var).mo79241h((C33425d.C33429d) dVar, z);
            } else if (dVar instanceof C33425d.C33430e) {
                ((C33421i) f0Var).mo79242h(z);
            }
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C31205e.item_product_details_header) {
            C31816a0 d = C31816a0.m94049d(from, viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C33422j(d);
        } else if (i == C31205e.f77543m) {
            C31832m d2 = C31832m.m94118d(from, viewGroup, false);
            C41536l.m120488h(d2, "inflate(inflater, parent, false)");
            return new C33413a(this, d2);
        } else if (i == C31205e.item_last_operation_header) {
            C31835p d3 = C31835p.m94130d(from, viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …lse\n                    )");
            return new C33416d(d3);
        } else if (i == C31205e.item_operation) {
            C31842w d4 = C31842w.m94158d(from, viewGroup, false);
            C41536l.m120488h(d4, "inflate(inflater, parent, false)");
            return new C33418f(d4);
        } else if (i == C31205e.item_layout_operations_loading_error) {
            C31837r d5 = C31837r.m94138d(from, viewGroup, false);
            C41536l.m120488h(d5, "inflate(\n               …lse\n                    )");
            return new C33419g(this, d5);
        } else if (i == C31205e.item_layout_operations_permission_denied) {
            C31838s d6 = C31838s.m94142d(from, viewGroup, false);
            C41536l.m120488h(d6, "inflate(\n               …lse\n                    )");
            return new C33420h(this, d6);
        } else if (i == C31205e.item_layout_no_operations) {
            C31836q d7 = C31836q.m94134d(from, viewGroup, false);
            C41536l.m120488h(d7, "inflate(\n               …lse\n                    )");
            return new C33417e(d7);
        } else if (i == C31205e.item_operation_loading_skeleton) {
            C31843x d8 = C31843x.m94162d(from, viewGroup, false);
            C41536l.m120488h(d8, "inflate(\n               …lse\n                    )");
            return new C33421i(d8);
        } else if (i == C31205e.item_operations_paging_page_load_error) {
            C31844y d9 = C31844y.m94166d(from, viewGroup, false);
            d9.f78551e.setOnClickListener(new C37469a(this));
            return new C33423k(d9.mo3946b());
        } else {
            throw new UnsupportedOperationException("Unknown view type");
        }
    }

    /* renamed from: q */
    public final void mo79235q(C43075l lVar) {
        this.f81596i = lVar;
    }

    /* renamed from: r */
    public final void mo79236r(C43075l lVar) {
        this.f81595h = lVar;
    }

    /* renamed from: s */
    public final void mo79237s(C43064a aVar) {
        this.f81594g = aVar;
    }
}
