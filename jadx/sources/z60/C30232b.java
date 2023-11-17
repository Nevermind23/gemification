package z60;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.products.cards.mcc.presentation.model.MccStateUiModel;
import p366bk.C10318g;
import p90.C27394p5;

/* renamed from: z60.b */
public final class C30232b extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f76133d = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C30234c f76134e;

    /* renamed from: z60.b$a */
    public final class C30233a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27394p5 f76135d;

        /* renamed from: e */
        final /* synthetic */ C30232b f76136e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30233a(C30232b bVar, C27394p5 p5Var) {
            super(p5Var.mo3946b());
            C41536l.m120489i(p5Var, "binding");
            this.f76136e = bVar;
            this.f76135d = p5Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m91334j(C30232b bVar, int i, CompoundButton compoundButton, boolean z) {
            C41536l.m120489i(bVar, "this$0");
            C30234c f = bVar.f76134e;
            if (f != null) {
                f.mo70246a(i, z);
            }
        }

        /* renamed from: k */
        private final void m91335k(boolean z) {
            int i;
            if (z) {
                i = C10318g.f28630R0;
            } else {
                i = C10318g.f28627N0;
            }
            int c = C0767a.m2893c(this.itemView.getContext(), i);
            this.f76135d.f69536f.setTextColor(c);
            this.f76135d.f69535e.setTextColor(c);
            this.f76135d.f69537g.setEnabled(z);
        }

        /* renamed from: i */
        public final void mo70569i(MccStateUiModel mccStateUiModel, int i) {
            C41536l.m120489i(mccStateUiModel, "state");
            this.f76135d.f69536f.setText(C32343x.m95420V(mccStateUiModel.mo55621i(), mccStateUiModel.mo55619h(), new Object[0]));
            this.f76135d.f69535e.setText(C32343x.m95420V(mccStateUiModel.mo55618g(), mccStateUiModel.mo55617f(), new Object[0]));
            this.f76135d.f69537g.setChecked(mccStateUiModel.mo55622j());
            this.f76135d.f69537g.setOnCheckedChangeListener(new C30231a(this.f76136e, i));
            m91335k(mccStateUiModel.mo55613d());
        }
    }

    /* renamed from: i */
    private final void m91328i(List list) {
        this.f76133d = list;
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public void onBindViewHolder(C30233a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        boolean z = false;
        if (i >= 0 && i < this.f76133d.size()) {
            z = true;
        }
        if (z) {
            aVar.mo70569i((MccStateUiModel) this.f76133d.get(i), i);
        }
    }

    public int getItemCount() {
        return this.f76133d.size();
    }

    /* renamed from: h */
    public C30233a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27394p5 d = C27394p5.m84881d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C30233a(this, d);
    }

    /* renamed from: j */
    public final void mo70567j(C30234c cVar) {
        this.f76134e = cVar;
    }

    /* renamed from: k */
    public final void mo70568k(List list) {
        C41536l.m120489i(list, "items");
        m91328i(new ArrayList(list));
    }
}
