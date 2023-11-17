package g20;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import d20.C19843c;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p366bk.C10322k;

/* renamed from: g20.c */
public final class C20597c extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final Context f55649d;

    /* renamed from: e */
    private RecyclerView f55650e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20597c(View view, Context context) {
        super(view);
        C41536l.m120489i(view, "itemView");
        C41536l.m120489i(context, "context");
        this.f55649d = context;
    }

    /* renamed from: h */
    public final void mo49141h(List list) {
        C41536l.m120489i(list, "bonusProgramList");
        if (!list.isEmpty()) {
            View findViewById = this.itemView.findViewById(C10322k.bonus_programs_recycler);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.….bonus_programs_recycler)");
            RecyclerView recyclerView = (RecyclerView) findViewById;
            this.f55650e = recyclerView;
            RecyclerView recyclerView2 = null;
            if (recyclerView == null) {
                C41536l.m120506z("bonusProgramsRecycler");
                recyclerView = null;
            }
            recyclerView.setLayoutManager(new LinearLayoutManager(this.f55649d, 0, false));
            C19843c cVar = new C19843c(list);
            cVar.mo48143f();
            RecyclerView recyclerView3 = this.f55650e;
            if (recyclerView3 == null) {
                C41536l.m120506z("bonusProgramsRecycler");
            } else {
                recyclerView2 = recyclerView3;
            }
            recyclerView2.setAdapter(cVar);
        }
    }
}
