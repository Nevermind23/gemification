package b90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import h80.C24897d0;
import kotlin.jvm.internal.C41536l;
import n80.C26380d;
import o31.C37599g;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import ue1.C43075l;

/* renamed from: b90.n */
public final class C19356n extends C1819o {

    /* renamed from: f */
    private final String f53580f;

    /* renamed from: g */
    private final C43075l f53581g;

    /* renamed from: b90.n$a */
    public final class C19357a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24897d0 f53582d;

        /* renamed from: e */
        final /* synthetic */ C19356n f53583e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19357a(C19356n nVar, C24897d0 d0Var) {
            super(d0Var.mo3946b());
            C41536l.m120489i(d0Var, "binding");
            this.f53583e = nVar;
            this.f53582d = d0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m64818j(C19356n nVar, C19357a aVar, View view) {
            C41536l.m120489i(nVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            nVar.mo47561k().invoke(Integer.valueOf(aVar.getBindingAdapterPosition()));
        }

        /* renamed from: i */
        public final void mo47565i(C26380d dVar) {
            C41536l.m120489i(dVar, "fileModel");
            this.f53582d.f63919f.setText(dVar.mo65601b());
            this.f53582d.f63920g.setButtonText(C32343x.m95388F(this.f53583e.mo47562l(), new Object[0]));
            BigDividerView bigDividerView = this.f53582d.f63918e;
            C41536l.m120488h(bigDividerView, "binding.divider");
            boolean z = true;
            if (getBindingAdapterPosition() == this.f53583e.getItemCount() - 1) {
                z = false;
            }
            C32343x.m95483r1(bigDividerView, z, false, 2, (Object) null);
            this.f53582d.f63920g.setOnClickListener(new C19355m(this.f53583e, this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19356n(String str, C43075l lVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(str, "removeTextKey");
        C41536l.m120489i(lVar, "onRemoveFileClick");
        this.f53580f = str;
        this.f53581g = lVar;
    }

    /* renamed from: k */
    public final C43075l mo47561k() {
        return this.f53581g;
    }

    /* renamed from: l */
    public final String mo47562l() {
        return this.f53580f;
    }

    /* renamed from: m */
    public void onBindViewHolder(C19357a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47565i((C26380d) g);
    }

    /* renamed from: n */
    public C19357a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24897d0 d = C24897d0.m79570d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C19357a(this, d);
    }
}
