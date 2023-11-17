package p576qj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p352ak.C10022u;
import p352ak.C10029v;
import p590rj.C17618a;
import p615tg.C17963d;
import p642vh.C18368l;

/* renamed from: qj.b */
public final class C17515b extends C1819o {

    /* renamed from: qj.b$a */
    private enum C17516a {
        REGULAR,
        TOTAL
    }

    /* renamed from: qj.b$b */
    public final class C17517b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C6201a f49048d;

        /* renamed from: e */
        final /* synthetic */ C17515b f49049e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17517b(C17515b bVar, C6201a aVar) {
            super(aVar.mo3946b());
            C41536l.m120489i(aVar, "binding");
            this.f49049e = bVar;
            this.f49048d = aVar;
        }

        /* renamed from: h */
        public final void mo45040h(C17618a aVar) {
            C41536l.m120489i(aVar, "item");
            C6201a aVar2 = this.f49048d;
            if ((aVar2 instanceof C10022u) && (aVar instanceof C17618a.C17619a)) {
                C10022u uVar = (C10022u) aVar2;
                C17618a.C17619a aVar3 = (C17618a.C17619a) aVar;
                uVar.f27601e.setText(aVar3.mo45203b());
                uVar.f27602f.setText(aVar3.mo45202a().toString());
            } else if ((aVar2 instanceof C10029v) && (aVar instanceof C17618a.C17620b)) {
                C10029v vVar = (C10029v) aVar2;
                C17618a.C17620b bVar = (C17618a.C17620b) aVar;
                vVar.f27632f.setText(bVar.mo45209c());
                vVar.f27633g.setText(bVar.mo45207a().toString());
                View view = vVar.f27631e;
                C41536l.m120488h(view, "divider");
                C18368l.m62751F(view, bVar.mo45208b(), false, 2, (Object) null);
            }
        }
    }

    public C17515b() {
        super(C17963d.f51158a.mo45633d());
    }

    public int getItemViewType(int i) {
        if (((C17618a) mo6026f().get(i)) instanceof C17618a.C17620b) {
            return C17516a.TOTAL.ordinal();
        }
        return C17516a.REGULAR.ordinal();
    }

    /* renamed from: k */
    public void onBindViewHolder(C17517b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo45040h((C17618a) obj);
    }

    /* renamed from: l */
    public C17517b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C6201a aVar;
        C41536l.m120489i(viewGroup, "parent");
        if (i == C17516a.TOTAL.ordinal()) {
            aVar = C10029v.m36785d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(aVar, "inflate(\n               …      false\n            )");
        } else {
            aVar = C10022u.m36759d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(aVar, "inflate(\n               …      false\n            )");
        }
        return new C17517b(this, aVar);
    }
}
