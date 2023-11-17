package wi0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kj0.C25740a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj0.C26237a;
import th0.C28421q0;
import th0.C28422r;
import th0.C28424s;
import th0.C28430v;
import wi0.C29440h;
import xi0.C29803c;
import xi0.C29808e;
import xi0.C29809f;
import xi0.C29810g;

/* renamed from: wi0.f */
public final class C29435f extends C1819o {

    /* renamed from: i */
    public static final C29436a f74525i = new C29436a((DefaultConstructorMarker) null);

    /* renamed from: f */
    private final C29438c f74526f;

    /* renamed from: g */
    private final Map f74527g = new LinkedHashMap();

    /* renamed from: h */
    private final RecyclerView.C1757v f74528h = new RecyclerView.C1757v();

    /* renamed from: wi0.f$a */
    public static final class C29436a {
        private C29436a() {
        }

        public /* synthetic */ C29436a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: wi0.f$b */
    private static final class C29437b extends C1796h.C1802f {

        /* renamed from: a */
        public static final C29437b f74529a = new C29437b();

        private C29437b() {
        }

        /* renamed from: d */
        public boolean mo5976a(C29440h hVar, C29440h hVar2) {
            C41536l.m120489i(hVar, "oldItem");
            C41536l.m120489i(hVar2, "newItem");
            if (!(hVar instanceof C29440h.C29445e) || !(hVar2 instanceof C29440h.C29445e)) {
                return C41536l.m120484d(hVar, hVar2);
            }
            if (((C29440h.C29445e) hVar).mo69293c() || !((C29440h.C29445e) hVar2).mo69293c()) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public boolean mo5977b(C29440h hVar, C29440h hVar2) {
            C41536l.m120489i(hVar, "oldItem");
            C41536l.m120489i(hVar2, "newItem");
            if (!(hVar instanceof C29440h.C29445e) || !(hVar2 instanceof C29440h.C29445e)) {
                return C41536l.m120484d(hVar, hVar2);
            }
            if (((C29440h.C29445e) hVar).mo69293c() || !((C29440h.C29445e) hVar2).mo69293c()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: wi0.f$c */
    public interface C29438c {
        /* renamed from: G */
        void mo69262G();

        /* renamed from: f */
        void mo69263f(String str);

        /* renamed from: f0 */
        void mo69264f0(long j);

        /* renamed from: k */
        void mo69265k(C25740a aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29435f(C29438c cVar) {
        super(C29437b.f74529a);
        C41536l.m120489i(cVar, "listener");
        this.f74526f = cVar;
    }

    public int getItemViewType(int i) {
        return ((C29440h) mo6027g(i)).mo69278a();
    }

    /* renamed from: k */
    public void onBindViewHolder(C26237a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo65239h(g);
    }

    /* renamed from: l */
    public C26237a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 1) {
            C28421q0 d = C28421q0.m87206d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …      false\n            )");
            return new C29810g(d, this.f74526f);
        } else if (i == 2) {
            C28422r d2 = C28422r.m87210d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d2, "inflate(\n               …      false\n            )");
            return new C29808e(d2, this.f74526f);
        } else if (i == 3) {
            C28424s d3 = C28424s.m87218d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d3, "inflate(\n               …      false\n            )");
            return new C29803c(d3, this.f74528h, this.f74527g, this.f74526f);
        } else if (i == 4) {
            C28430v d4 = C28430v.m87243d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d4, "inflate(\n               …      false\n            )");
            return new C29809f(d4);
        } else {
            throw new IllegalStateException("Unsupported ViewType".toString());
        }
    }

    /* renamed from: m */
    public void onViewRecycled(C26237a aVar) {
        C41536l.m120489i(aVar, "holder");
        super.onViewRecycled(aVar);
        if (aVar.getBindingAdapterPosition() != -1) {
            Object g = mo6027g(aVar.getBindingAdapterPosition());
            C41536l.m120488h(g, "getItem(holder.bindingAdapterPosition)");
            aVar.mo65240i(g);
        }
    }
}
