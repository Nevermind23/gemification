package ro0;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import g91.C32343x;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37608o;
import o31.C37621w;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager;
import ro0.C17703e;
import sn0.C17899c;
import sn0.C17900d;
import so0.C17905a;
import so0.C17906b;
import so0.C17907c;
import uo0.C18269a;
import uo0.C18273e;
import uo0.C18274f;
import xn0.C18865w;

/* renamed from: ro0.g */
public final class C17708g extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C18865w f49440d;

    /* renamed from: e */
    private final C17905a f49441e;

    /* renamed from: f */
    private final int f49442f;

    /* renamed from: g */
    private final C17697a f49443g;

    /* renamed from: h */
    private final C37621w f49444h;

    /* renamed from: i */
    private final C37608o f49445i;

    /* renamed from: j */
    private int f49446j = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17708g(C18865w wVar, RecyclerView.C1757v vVar, C17906b bVar, C17907c cVar, C17905a aVar) {
        super(wVar.mo3946b());
        C41536l.m120489i(wVar, "binding");
        C41536l.m120489i(vVar, "recyclerViewPool");
        this.f49440d = wVar;
        this.f49441e = aVar;
        int dimensionPixelSize = this.itemView.getContext().getResources().getDimensionPixelSize(C17899c.f50936a);
        this.f49442f = dimensionPixelSize;
        C17697a aVar2 = new C17697a();
        this.f49443g = aVar2;
        C37621w wVar2 = new C37621w(dimensionPixelSize, (int) (((float) dimensionPixelSize) / 2.0f), 0);
        this.f49444h = wVar2;
        C37608o oVar = new C37608o(8388611, true, (C37608o.C37610b) null, 4, (DefaultConstructorMarker) null);
        this.f49445i = oVar;
        RecyclerView recyclerView = wVar.f52792i;
        VisibilityPercentageLayoutManager visibilityPercentageLayoutManager = new VisibilityPercentageLayoutManager(wVar.mo3946b().getContext());
        visibilityPercentageLayoutManager.mo5203R2(0);
        recyclerView.setLayoutManager(visibilityPercentageLayoutManager);
        recyclerView.setRecycledViewPool(vVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.mo5351j(wVar2);
        recyclerView.setAdapter(aVar2);
        oVar.mo6073b(wVar.f52792i);
        aVar2.mo45254p(bVar);
        aVar2.mo45255q(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m61390j(C17708g gVar, C18274f.C18278d dVar, View view) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(dVar, "$data");
        C17905a aVar = gVar.f49441e;
        if (aVar != null) {
            aVar.mo32993a(dVar.mo45987f(), dVar.mo45988g());
        }
    }

    /* renamed from: l */
    private final int m61391l(Context context, int i) {
        return C0767a.m2893c(context, i);
    }

    /* renamed from: i */
    public final void mo45272i(C18274f.C18278d dVar, Parcelable parcelable) {
        int i;
        C41536l.m120489i(dVar, "data");
        Context context = this.f49440d.mo3946b().getContext();
        Integer g = dVar.mo45988g();
        if (g != null) {
            i = g.intValue();
        } else {
            i = -1;
        }
        this.f49446j = i;
        this.f49443g.mo45256r(dVar.mo45993k(), this.f49446j);
        this.f49440d.f52789f.setTitle(dVar.mo45991i());
        ((C2394j) C2379b.m9210t(this.itemView.getContext()).mo7756x(dVar.mo45992j().mo35313a()).mo7232j(C17900d.f50940f)).mo7718L0(this.f49440d.f52791h);
        Button button = this.f49440d.f52788e;
        button.setButtonText(C32343x.m95388F("life.style.offers.main.page.last.minute.all.button.label", new Object[0]));
        button.setVisibility(dVar.mo45985e());
        button.setOnClickListener(new C17707f(this, dVar));
        C18269a h = dVar.mo45989h();
        LayerView layerView = this.f49440d.f52790g;
        C41536l.m120488h(context, "context");
        layerView.setBackgroundColor(m61391l(context, h.mo45919a()));
        this.f49440d.f52791h.setColorFilter(m61391l(context, h.mo45920b()), PorterDuff.Mode.SRC_IN);
        this.f49440d.f52789f.setTitleTextColor(new Color.Resource(h.mo45921c()));
        if (parcelable != null) {
            RecyclerView.C1747p layoutManager = this.f49440d.f52792i.getLayoutManager();
            if (layoutManager != null) {
                layoutManager.mo5218n1(parcelable);
                return;
            }
            return;
        }
        RecyclerView.C1747p layoutManager2 = this.f49440d.f52792i.getLayoutManager();
        if (layoutManager2 != null) {
            layoutManager2.mo5197J1(0);
        }
    }

    /* renamed from: k */
    public final C18865w mo45273k() {
        return this.f49440d;
    }

    /* renamed from: m */
    public final Map mo45274m(String str) {
        boolean z;
        String str2;
        C41536l.m120489i(str, "page");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.f49440d.f52792i.getScrollState() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return linkedHashMap;
        }
        RecyclerView.C1747p layoutManager = this.f49440d.f52792i.getLayoutManager();
        C41536l.m120487g(layoutManager, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.presentation.shared.VisibilityPercentageLayoutManager");
        VisibilityPercentageLayoutManager visibilityPercentageLayoutManager = (VisibilityPercentageLayoutManager) layoutManager;
        int j2 = visibilityPercentageLayoutManager.mo5215j2();
        int o2 = visibilityPercentageLayoutManager.mo5221o2();
        int i = this.f49446j;
        if (i == 1) {
            str2 = "lastMinute";
        } else if (i == 2) {
            str2 = "recommendedOffers";
        } else if (i == 3) {
            str2 = "mainPageTopCategory";
        } else if (i != 4) {
            str2 = null;
        } else {
            str2 = "installment";
        }
        String str3 = str2;
        List f = this.f49443g.mo6026f();
        if (j2 <= o2) {
            int i2 = j2;
            while (true) {
                Long valueOf = Long.valueOf(((C18273e) f.get(i2)).mo45962k());
                C17703e.C17705b bVar = r2;
                C17703e.C17705b bVar2 = new C17703e.C17705b(str, ((C18273e) f.get(i2)).mo45962k(), ((C18273e) f.get(i2)).mo45954e(), str3, (String) null, 16, (DefaultConstructorMarker) null);
                linkedHashMap.put(valueOf, bVar);
                if (i2 == o2) {
                    break;
                }
                i2++;
            }
        }
        return linkedHashMap;
    }
}
