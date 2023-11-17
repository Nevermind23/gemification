package as0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import pr0.C37975z;
import zr0.C40247d;

/* renamed from: as0.f */
public final class C31062f extends C1819o {

    /* renamed from: as0.f$a */
    public static final class C31063a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37975z f77255d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31063a(C37975z zVar) {
            super(zVar.mo3946b());
            C41536l.m120489i(zVar, "binding");
            this.f77255d = zVar;
        }

        /* renamed from: h */
        public final void mo71259h(C40247d dVar) {
            String str;
            C41536l.m120489i(dVar, "item");
            C37975z zVar = this.f77255d;
            zVar.f91282f.setText(C32343x.m95388F(dVar.mo94198c(), new Object[0]));
            TextView textView = zVar.f91281e;
            String b = dVar.mo94197b();
            if (b != null) {
                str = C32343x.m95408P(dVar.mo94196a(), b);
            } else {
                str = null;
            }
            textView.setText(str);
        }
    }

    public C31062f() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C31063a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo71259h((C40247d) g);
    }

    /* renamed from: l */
    public C31063a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C37975z d = C37975z.m111646d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C31063a(d);
    }
}
