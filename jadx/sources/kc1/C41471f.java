package kc1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ua1.C28651j;
import ue1.C43064a;

/* renamed from: kc1.f */
public final class C41471f extends RecyclerView.C1736h {

    /* renamed from: d */
    private final ArrayList f97618d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C41472a f97619e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f97620f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List f97621g;

    /* renamed from: kc1.f$a */
    public interface C41472a {
        /* renamed from: U */
        void mo96231U();
    }

    /* renamed from: kc1.f$b */
    public final class C41473b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28651j f97622d;

        /* renamed from: e */
        final /* synthetic */ C41471f f97623e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41473b(C41471f fVar, C28651j jVar) {
            super(jVar.mo3946b());
            C41536l.m120489i(jVar, "binding");
            this.f97623e = fVar;
            this.f97622d = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m120323j(C41471f fVar, C41473b bVar, View view) {
            C41536l.m120489i(fVar, "this$0");
            C41536l.m120489i(bVar, "this$1");
            if (fVar.f97620f) {
                fVar.f97620f = false;
                C41472a g = fVar.f97619e;
                if (g != null) {
                    g.mo96231U();
                }
            }
            List h = fVar.f97621g;
            if (h == null) {
                C41536l.m120506z("checkArr");
                h = null;
            }
            h.set(bVar.getAdapterPosition(), Boolean.valueOf(bVar.f97622d.f72772e.isChecked()));
        }

        /* renamed from: i */
        public final void mo96239i(C41463a aVar) {
            C41536l.m120489i(aVar, "device");
            this.f97622d.f72773f.setText(aVar.mo96219b());
            this.f97622d.f72772e.setChecked(this.f97623e.f97620f);
            List h = this.f97623e.f97621g;
            if (h == null) {
                C41536l.m120506z("checkArr");
                h = null;
            }
            h.set(getAdapterPosition(), Boolean.valueOf(this.f97622d.f72772e.isChecked()));
            this.f97622d.f72772e.setOnClickListener(new C41475g(this.f97623e, this));
        }
    }

    /* renamed from: kc1.f$c */
    static final class C41474c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C41474c f97624d = new C41474c();

        C41474c() {
            super(0);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public int getItemCount() {
        return this.f97618d.size();
    }

    /* renamed from: j */
    public final void mo96235j(List list) {
        C41536l.m120489i(list, "usedDevices");
        this.f97618d.clear();
        this.f97618d.addAll(list);
        this.f97621g = C40355o.m116851B(C40355o.m116866x(C40349m.m116846g(C41474c.f97624d), list.size()));
        notifyDataSetChanged();
    }

    /* renamed from: k */
    public final void mo96236k(boolean z) {
        this.f97620f = z;
        notifyDataSetChanged();
    }

    /* renamed from: l */
    public final List mo96237l() {
        List list = this.f97621g;
        if (list != null) {
            return list;
        }
        C41536l.m120506z("checkArr");
        return null;
    }

    /* renamed from: m */
    public final void mo96238m(C41472a aVar) {
        C41536l.m120489i(aVar, "callback");
        this.f97619e = aVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C41473b) {
            Object obj = this.f97618d.get(i);
            C41536l.m120488h(obj, "usedDevices[position]");
            ((C41473b) f0Var).mo96239i((C41463a) obj);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28651j d = C28651j.m87710d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C41473b(this, d);
    }
}
