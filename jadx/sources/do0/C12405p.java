package do0;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import ro0.C17708g;
import so0.C17905a;
import so0.C17906b;
import uo0.C18274f;
import xn0.C18865w;

/* renamed from: do0.p */
public final class C12405p extends C1819o {

    /* renamed from: f */
    private final Map f37059f = new LinkedHashMap();

    /* renamed from: g */
    private final RecyclerView.C1757v f37060g = new RecyclerView.C1757v();

    /* renamed from: h */
    private C17906b f37061h;

    /* renamed from: i */
    private C17905a f37062i;

    public C12405p() {
        super(C37599g.f90345a.mo90787d());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m47406p(C12405p pVar, long j, String str, boolean z) {
        C41536l.m120489i(pVar, "this$0");
        C17906b bVar = pVar.f37061h;
        if (bVar != null) {
            bVar.mo32992a(j, str, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m47407q(C12405p pVar, Long l, Integer num) {
        C41536l.m120489i(pVar, "this$0");
        C17905a aVar = pVar.f37062i;
        if (aVar != null) {
            aVar.mo32993a(l, num);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m47408r(long j, Integer num) {
    }

    /* renamed from: n */
    public void onBindViewHolder(C17708g gVar, int i) {
        C41536l.m120489i(gVar, "holder");
        C18274f fVar = (C18274f) mo6027g(i);
        C41536l.m120487g(fVar, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.model.LifestyleOfferViewType.Offers");
        gVar.mo45272i((C18274f.C18278d) fVar, (Parcelable) this.f37059f.get(fVar.mo45970b()));
    }

    /* renamed from: o */
    public C17708g onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18865w d = C18865w.m63831d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        RecyclerView.C1757v vVar = this.f37060g;
        C12402m mVar = new C12402m(this);
        C12403n nVar = new C12403n(this);
        C12404o oVar = new C12404o();
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C17708g(d, vVar, mVar, oVar, nVar);
    }

    /* renamed from: s */
    public void onViewRecycled(C17708g gVar) {
        Parcelable parcelable;
        C41536l.m120489i(gVar, "holder");
        super.onViewRecycled(gVar);
        String b = ((C18274f) mo6027g(gVar.getBindingAdapterPosition())).mo45970b();
        Map map = this.f37059f;
        RecyclerView.C1747p layoutManager = gVar.mo45273k().f52792i.getLayoutManager();
        if (layoutManager != null) {
            parcelable = layoutManager.mo5220o1();
        } else {
            parcelable = null;
        }
        map.put(b, parcelable);
    }

    /* renamed from: t */
    public final void mo33009t(C17905a aVar) {
        this.f37062i = aVar;
    }

    /* renamed from: u */
    public final void mo33010u(C17906b bVar) {
        this.f37061h = bVar;
    }
}
