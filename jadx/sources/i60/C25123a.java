package i60;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import g60.C20742c;
import g60.C20749g;
import java.util.ArrayList;
import java.util.List;
import k60.C25668a;
import k60.C25670b;
import k60.C25672c;
import k60.C25675e;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p794ix.C25265a;
import ue1.C43075l;

/* renamed from: i60.a */
public final class C25123a extends RecyclerView.C1736h {

    /* renamed from: d */
    private C43075l f64570d;

    /* renamed from: e */
    private List f64571e = new ArrayList();

    /* renamed from: i60.a$b */
    public enum C25125b {
        RatesHeader,
        CardChoiceHeader,
        CardChoiceHeaderSubtitle,
        UmtsCard,
        Separator
    }

    /* renamed from: f */
    public void onBindViewHolder(C20742c cVar, int i) {
        C25265a a;
        C41536l.m120489i(cVar, "holder");
        if ((cVar instanceof C25675e) && (a = ((C25124a) this.f64571e.get(i)).mo63674a()) != null) {
            ((C25675e) cVar).onBind(a);
        }
    }

    /* renamed from: g */
    public C20742c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C25125b.CardChoiceHeader.ordinal()) {
            return C25670b.f65391e.mo64175a(viewGroup);
        }
        if (i == C25125b.CardChoiceHeaderSubtitle.ordinal()) {
            return C25668a.f65390d.mo64174a(viewGroup);
        }
        if (i == C25125b.UmtsCard.ordinal()) {
            C25675e a = C25675e.f65396i.mo64180a(viewGroup);
            a.mo64179k(this.f64570d);
            return a;
        } else if (i == C25125b.Separator.ordinal()) {
            return C20749g.f55944d.mo49292a(viewGroup);
        } else {
            if (i == C25125b.RatesHeader.ordinal()) {
                return C25672c.f65393d.mo64176a(viewGroup);
            }
            return C25675e.f65396i.mo64180a(viewGroup);
        }
    }

    public int getItemCount() {
        if (this.f64571e.isEmpty()) {
            return 0;
        }
        return this.f64571e.size();
    }

    public int getItemViewType(int i) {
        return ((C25124a) this.f64571e.get(i)).mo63675b().ordinal();
    }

    /* renamed from: h */
    public final void mo63672h(C43075l lVar) {
        this.f64570d = lVar;
    }

    /* renamed from: i */
    public final void mo63673i(List list) {
        this.f64571e.clear();
        this.f64571e.add(new C25124a(C25125b.RatesHeader, (C25265a) null, 2, (DefaultConstructorMarker) null));
        this.f64571e.add(new C25124a(C25125b.CardChoiceHeader, (C25265a) null, 2, (DefaultConstructorMarker) null));
        this.f64571e.add(new C25124a(C25125b.CardChoiceHeaderSubtitle, (C25265a) null, 2, (DefaultConstructorMarker) null));
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C41341q.m119917t();
                }
                this.f64571e.add(new C25124a(C25125b.UmtsCard, (C25265a) next));
                if (i != list.size() - 1) {
                    this.f64571e.add(new C25124a(C25125b.Separator, (C25265a) null, 2, (DefaultConstructorMarker) null));
                }
                i = i2;
            }
        }
        notifyDataSetChanged();
    }

    /* renamed from: i60.a$a */
    private static final class C25124a {

        /* renamed from: a */
        private final C25125b f64572a;

        /* renamed from: b */
        private final C25265a f64573b;

        public C25124a(C25125b bVar, C25265a aVar) {
            C41536l.m120489i(bVar, "viewType");
            this.f64572a = bVar;
            this.f64573b = aVar;
        }

        /* renamed from: a */
        public final C25265a mo63674a() {
            return this.f64573b;
        }

        /* renamed from: b */
        public final C25125b mo63675b() {
            return this.f64572a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C25124a)) {
                return false;
            }
            C25124a aVar = (C25124a) obj;
            return this.f64572a == aVar.f64572a && C41536l.m120484d(this.f64573b, aVar.f64573b);
        }

        public int hashCode() {
            int hashCode = this.f64572a.hashCode() * 31;
            C25265a aVar = this.f64573b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            C25125b bVar = this.f64572a;
            C25265a aVar = this.f64573b;
            return "DataModel(viewType=" + bVar + ", umtsCard=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C25124a(C25125b bVar, C25265a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(bVar, (i & 2) != 0 ? null : aVar);
        }
    }
}
