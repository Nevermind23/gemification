package p442gp;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p356ao.C10112d;
import p413eo.C12771t0;
import p456hp.C15584a;

/* renamed from: gp.l */
public final class C15443l extends C1819o {

    /* renamed from: f */
    private final boolean f43849f;

    /* renamed from: gp.l$a */
    public static final class C15444a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12771t0 f43850d;

        /* renamed from: e */
        private final boolean f43851e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15444a(C12771t0 t0Var, boolean z) {
            super(t0Var.mo3946b());
            C41536l.m120489i(t0Var, "binding");
            this.f43850d = t0Var;
            this.f43851e = z;
        }

        /* renamed from: h */
        public final void mo42528h(C15584a aVar) {
            int i;
            String str;
            C41536l.m120489i(aVar, "transaction");
            C12771t0 t0Var = this.f43850d;
            if (this.f43851e) {
                i = C10112d.f27913b;
            } else {
                i = C10112d.f27912a;
            }
            t0Var.f37867f.setImageDrawable(C32343x.m95424X(i, this.itemView.getContext()));
            t0Var.f37868g.setText(aVar.mo42836c());
            TextView textView = t0Var.f37866e;
            BigDecimal a = aVar.mo42834a();
            if (a != null) {
                String b = aVar.mo42835b();
                if (b == null) {
                    b = "";
                }
                str = C32343x.m95408P(a, b);
            } else {
                str = null;
            }
            textView.setText(str);
        }
    }

    public C15443l(boolean z) {
        super(C37599g.f90345a.mo90787d());
        this.f43849f = z;
    }

    /* renamed from: k */
    public void onBindViewHolder(C15444a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo42528h((C15584a) obj);
    }

    /* renamed from: l */
    public C15444a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12771t0 d = C12771t0.m48484d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C15444a(d, this.f43849f);
    }
}
