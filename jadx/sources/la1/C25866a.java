package la1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;
import ua1.C28656k1;
import ue1.C43075l;

/* renamed from: la1.a */
public final class C25866a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C43075l f65846f;

    /* renamed from: g */
    private List f65847g = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C25867a f65848h;

    /* renamed from: la1.a$a */
    public interface C25867a {
        /* renamed from: a */
        void mo64660a(Object obj);
    }

    /* renamed from: la1.a$b */
    public final class C25868b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28656k1 f65849d;

        /* renamed from: e */
        final /* synthetic */ C25866a f65850e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25868b(C25866a aVar, C28656k1 k1Var) {
            super(k1Var.mo3946b());
            C41536l.m120489i(k1Var, "binding");
            this.f65850e = aVar;
            this.f65849d = k1Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m81297j(C25866a aVar, Object obj, View view) {
            C41536l.m120489i(aVar, "this$0");
            C25867a l = aVar.f65848h;
            if (l != null) {
                l.mo64660a(obj);
            }
        }

        /* renamed from: i */
        public final void mo64661i(Object obj) {
            this.f65849d.f72797e.setText((CharSequence) this.f65850e.f65846f.invoke(obj));
            this.f65849d.mo3946b().setOnClickListener(new C25869b(this.f65850e, obj));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25866a(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(lVar, "mapper");
        this.f65846f = lVar;
    }

    /* renamed from: m */
    public final void mo64655m(C43075l lVar) {
        C41536l.m120489i(lVar, "filter");
        List list = this.f65847g;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        mo6029i(arrayList);
    }

    /* renamed from: n */
    public void onBindViewHolder(C25868b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        bVar.mo64661i(mo6027g(i));
    }

    /* renamed from: o */
    public C25868b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28656k1 d = C28656k1.m87733d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C25868b(this, d);
    }

    /* renamed from: p */
    public final void mo64658p(List list) {
        C41536l.m120489i(list, "list");
        this.f65847g = list;
        mo6029i(list);
    }

    /* renamed from: q */
    public final void mo64659q(C25867a aVar) {
        C41536l.m120489i(aVar, "onItemSelectedListener");
        this.f65848h = aVar;
    }
}
