package a90;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import h80.C24906m;
import i90.C25135a;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;

/* renamed from: a90.a */
public final class C19199a extends C1819o {

    /* renamed from: a90.a$a */
    public static final class C19200a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C24906m f53404d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19200a(C24906m mVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            this.f53404d = mVar;
        }

        /* renamed from: h */
        public final void mo47422h(C25135a aVar) {
            C41536l.m120489i(aVar, "contract");
            C24906m mVar = this.f53404d;
            mVar.f64026f.setText(aVar.mo63683d());
            mVar.f64025e.setText(C32343x.m95416T(aVar.mo63681b()));
        }
    }

    public C19199a() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C19200a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        aVar.mo47422h((C25135a) obj);
    }

    /* renamed from: l */
    public C19200a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C24906m d = C24906m.m79609d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C19200a(d);
    }
}
