package u30;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o30.C26715e;
import o30.C26719g;
import p341ge.bog.mobilebank.cleanarch.presentation.common.StateView;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import r30.C27892a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: u30.b */
public final class C28550b extends C28567n {

    /* renamed from: h */
    public static final C28552b f72473h = new C28552b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final RecyclerView f72474d;

    /* renamed from: e */
    private final StateView f72475e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C43075l f72476f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C43064a f72477g;

    /* renamed from: u30.b$a */
    public static final class C28551a extends RecyclerView.C1746o {

        /* renamed from: a */
        final /* synthetic */ View f72478a;

        C28551a(View view) {
            this.f72478a = view;
        }

        /* renamed from: e */
        public void mo5615e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1726b0 b0Var) {
            C41536l.m120489i(rect, "outRect");
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            C41536l.m120489i(b0Var, "state");
            rect.bottom = this.f72478a.getContext().getResources().getDimensionPixelSize(C10319h.f28654x0);
        }
    }

    /* renamed from: u30.b$b */
    public static final class C28552b {
        private C28552b() {
        }

        public /* synthetic */ C28552b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C28550b mo68291a(ViewGroup viewGroup, C43075l lVar, C43064a aVar) {
            C41536l.m120489i(viewGroup, "parent");
            C28550b bVar = new C28550b(C32343x.m95473o0(viewGroup, C10324m.item_transfers_group, false, 2, (Object) null));
            bVar.f72476f = lVar;
            bVar.f72477g = aVar;
            return bVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28550b(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C10322k.transfers_recycler);
        this.f72474d = recyclerView;
        this.f72475e = (StateView) view.findViewById(C10322k.f28887r9);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(), 4));
        recyclerView.mo5351j(new C28551a(view));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m87497l(C28550b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        C43064a aVar = bVar.f72477g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: k */
    public void onBind(C27892a aVar) {
        C41536l.m120489i(aVar, "item");
        if (C41536l.m120484d(aVar, C27892a.C27894b.f71039b)) {
            this.f72475e.mo53598f();
            this.f72474d.setAdapter((RecyclerView.C1736h) null);
        } else if (aVar instanceof C27892a.C27893a) {
            this.f72475e.mo53595c();
            this.f72474d.setAdapter(new C26715e(((C27892a.C27893a) aVar).mo67430b(), (C26719g) null, this.f72476f, 2, (DefaultConstructorMarker) null));
        }
        View noDataView = this.f72475e.getNoDataView();
        if (noDataView != null) {
            noDataView.setOnClickListener(new C28549a(this));
        }
    }
}
