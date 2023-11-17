package p687yl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32300e0;
import he1.C41217g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import o31.C37599g;
import o31.C37616s;
import p480jl.C16211b;
import p536nl.C17060m;
import p606sl.C17835b;
import ue1.C43064a;

/* renamed from: yl.c */
public final class C18943c extends C1819o {

    /* renamed from: f */
    private final C18946b f52940f;

    /* renamed from: g */
    private final C18947c f52941g;

    /* renamed from: h */
    private Map f52942h = new LinkedHashMap();

    /* renamed from: yl.c$a */
    public static final class C18944a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C17060m f52943d;

        /* renamed from: e */
        private final C41217g f52944e = C41219i.m119470b(C18945a.f52945d);

        /* renamed from: yl.c$a$a */
        static final class C18945a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C18945a f52945d = new C18945a();

            C18945a() {
                super(0);
            }

            /* renamed from: b */
            public final C18949e invoke() {
                return new C18949e();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18944a(C17060m mVar) {
            super(mVar.mo3946b());
            C41536l.m120489i(mVar, "binding");
            this.f52943d = mVar;
            mVar.f47657f.setAdapter(m64031m());
            RecyclerView recyclerView = mVar.f47657f;
            C41536l.m120488h(recyclerView, "binding.recycler");
            C37616s.m110618b(recyclerView, C16211b.f45712a, 0, false, 4, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m64029k(C18946b bVar, C17835b bVar2, View view) {
            C41536l.m120489i(bVar, "$onCategoryClickedListener");
            C41536l.m120489i(bVar2, "$item");
            bVar.mo38334a(bVar2.mo45430c());
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m64030l(C18947c cVar, long j, String str) {
            C41536l.m120489i(cVar, "$onOfferClickedListener");
            cVar.mo38335a(j, str);
        }

        /* renamed from: m */
        private final C18949e m64031m() {
            return (C18949e) this.f52944e.getValue();
        }

        /* renamed from: j */
        public final void mo46988j(C17835b bVar, int i, C18946b bVar2, C18947c cVar) {
            C41536l.m120489i(bVar, "item");
            C41536l.m120489i(bVar2, "onCategoryClickedListener");
            C41536l.m120489i(cVar, "onOfferClickedListener");
            C17060m mVar = this.f52943d;
            mVar.f47658g.setText((CharSequence) C32300e0.f79712a.mo72818d(bVar.mo45428a(), bVar.mo45429b()));
            mVar.f47656e.setOnClickListener(new C18941a(bVar2, bVar));
            m64031m().mo6029i(bVar.mo45432e());
            m64031m().mo46994n(new C18942b(cVar));
            mVar.f47657f.setScrollX(i);
        }

        /* renamed from: n */
        public final int mo46989n() {
            return this.f52943d.f47657f.getScrollX();
        }
    }

    /* renamed from: yl.c$b */
    public interface C18946b {
        /* renamed from: a */
        void mo38334a(long j);
    }

    /* renamed from: yl.c$c */
    public interface C18947c {
        /* renamed from: a */
        void mo38335a(long j, String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18943c(C18946b bVar, C18947c cVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(bVar, "onCategoryClickedListener");
        C41536l.m120489i(cVar, "onOfferClickedListener");
        this.f52940f = bVar;
        this.f52941g = cVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C18944a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        int i2 = this.f52942h.get(Integer.valueOf(i));
        if (i2 == null) {
            i2 = 0;
        }
        int intValue = ((Number) i2).intValue();
        C17835b bVar = (C17835b) mo6027g(i);
        C41536l.m120487g(bVar, "null cannot be cast to non-null type ge.bog.mobilebank.bnpl.domain.model.BnplCategoryWithMerchants");
        aVar.mo46988j(bVar, intValue, this.f52940f, this.f52941g);
    }

    /* renamed from: l */
    public C18944a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C17060m d = C17060m.m59947d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C18944a(d);
    }

    /* renamed from: m */
    public void onViewRecycled(C18944a aVar) {
        C41536l.m120489i(aVar, "holder");
        if (this.f52942h.size() > aVar.getLayoutPosition()) {
            this.f52942h.put(Integer.valueOf(aVar.getLayoutPosition()), Integer.valueOf(aVar.mo46989n()));
        }
        super.onViewRecycled(aVar);
    }

    /* renamed from: n */
    public final void mo46987n(List list) {
        C41536l.m120489i(list, "items");
        this.f52942h = new LinkedHashMap();
        mo6029i(list);
        notifyDataSetChanged();
    }
}
