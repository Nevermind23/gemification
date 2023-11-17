package o30;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43075l;

/* renamed from: o30.e */
public final class C26715e extends RecyclerView.C1736h {

    /* renamed from: d */
    private final List f67348d;

    /* renamed from: e */
    private final C26719g f67349e;

    /* renamed from: f */
    private final C43075l f67350f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26715e(List list, C26719g gVar, C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C41341q.m119907j() : list, (i & 2) != 0 ? new C26711b() : gVar, (i & 4) != 0 ? null : lVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final void m83158h(C26715e eVar, int i, View view) {
        C41536l.m120489i(eVar, "this$0");
        C43075l lVar = eVar.f67350f;
        if (lVar != null) {
            lVar.invoke(eVar.f67348d.get(i));
        }
    }

    /* renamed from: g */
    public void onBindViewHolder(C26710a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo65920j((C26720h) this.f67348d.get(i));
        aVar.itemView.setOnClickListener(new C26714d(this, i));
    }

    public int getItemCount() {
        return this.f67348d.size();
    }

    public int getItemViewType(int i) {
        return ((C26720h) this.f67348d.get(i)).mo65925d();
    }

    /* renamed from: i */
    public C26710a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return this.f67349e.mo65921a(viewGroup, i);
    }

    public C26715e(List list, C26719g gVar, C43075l lVar) {
        C41536l.m120489i(list, "items");
        C41536l.m120489i(gVar, "holderFactory");
        this.f67348d = list;
        this.f67349e = gVar;
        this.f67350f = lVar;
    }
}
