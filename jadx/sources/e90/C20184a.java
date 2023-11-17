package e90;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import h80.C24908o;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;

/* renamed from: e90.a */
public final class C20184a extends C1819o {

    /* renamed from: e90.a$a */
    public final class C20185a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24908o f54868d;

        /* renamed from: e */
        final /* synthetic */ C20184a f54869e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C20185a(C20184a aVar, C24908o oVar) {
            super(oVar.mo3946b());
            C41536l.m120489i(oVar, "binding");
            this.f54869e = aVar;
            this.f54868d = oVar;
        }

        /* renamed from: h */
        public final void mo48601h(String str) {
            C41536l.m120489i(str, "info");
            this.f54868d.f64039f.setText(str);
        }
    }

    public C20184a() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C20185a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo48601h((String) obj);
    }

    /* renamed from: l */
    public C20185a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24908o d = C24908o.m79618d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C20185a(this, d);
    }
}
