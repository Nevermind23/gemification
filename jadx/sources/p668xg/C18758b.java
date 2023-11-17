package p668xg;

import af1.C40303i;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.amountbadge.AmountSignBigBadgeView;
import p352ak.C9923h;
import p682yg.C18915a;

/* renamed from: xg.b */
public final class C18758b extends RecyclerView.C1736h {

    /* renamed from: f */
    static final /* synthetic */ C40303i[] f52433f = {C41520a0.m120439e(new C41539o(C18758b.class, "data", "getData()Ljava/util/List;", 0))};

    /* renamed from: d */
    private C18915a f52434d;

    /* renamed from: e */
    private final C41555e f52435e = new C18760b(C41341q.m119907j(), this);

    /* renamed from: xg.b$a */
    public static final class C18759a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C9923h f52436d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18759a(C9923h hVar) {
            super(hVar.mo3946b());
            C41536l.m120489i(hVar, "binding");
            this.f52436d = hVar;
        }

        /* renamed from: h */
        public final void mo46536h(C18761c cVar) {
            C41536l.m120489i(cVar, "info");
            AmountSignBigBadgeView c = this.f52436d.mo3946b();
            String currencyCode = cVar.mo46538b().getCurrencyCode();
            C41536l.m120488h(currencyCode, "info.currency.currencyCode");
            c.setSign(currencyCode);
            this.f52436d.mo3946b().setEnabled(cVar.mo46539c());
            this.f52436d.mo3946b().setActivated(cVar.mo46537a());
        }
    }

    /* renamed from: xg.b$b */
    public static final class C18760b extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C18758b f52437a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18760b(Object obj, C18758b bVar) {
            super(obj);
            this.f52437a = bVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            List list = (List) obj2;
            List list2 = (List) obj;
            this.f52437a.notifyDataSetChanged();
        }
    }

    public C18758b() {
        C41551a aVar = C41551a.f97718a;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m63493i(C18758b bVar, int i, View view) {
        C41536l.m120489i(bVar, "this$0");
        C18915a aVar = bVar.f52434d;
        if (aVar != null) {
            aVar.mo42840a(i, (C18761c) bVar.mo46530g().get(i));
        }
    }

    /* renamed from: k */
    private final void m63494k(C18761c cVar) {
        List<C18761c> g = mo46530g();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(g, 10));
        for (C18761c cVar2 : g) {
            arrayList.add(new C18761c(cVar2.mo46538b(), C41536l.m120484d(cVar2, cVar), true));
        }
        mo46534m(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: g */
    public final List mo46530g() {
        return (List) this.f52435e.getValue(this, f52433f[0]);
    }

    public int getItemCount() {
        return mo46530g().size();
    }

    /* renamed from: h */
    public void onBindViewHolder(C18759a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        aVar.mo46536h((C18761c) mo46530g().get(i));
        aVar.itemView.setOnClickListener(new C18757a(this, i));
    }

    /* renamed from: j */
    public C18759a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C9923h d = C9923h.m36399d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …rent, false\n            )");
        return new C18759a(d);
    }

    /* renamed from: l */
    public final boolean mo46533l(Currency currency) {
        Object obj;
        C41536l.m120489i(currency, "currency");
        Iterator it = mo46530g().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C18761c) obj).mo46538b().getCurrencyCode(), currency.getCurrencyCode())) {
                break;
            }
        }
        C18761c cVar = (C18761c) obj;
        if (cVar == null) {
            return false;
        }
        m63494k(cVar);
        return true;
    }

    /* renamed from: m */
    public final void mo46534m(List list) {
        C41536l.m120489i(list, "<set-?>");
        this.f52435e.setValue(this, f52433f[0], list);
    }

    /* renamed from: n */
    public final void mo46535n(C18915a aVar) {
        C41536l.m120489i(aVar, "onCurrencyItemSelectedListener");
        this.f52434d = aVar;
    }
}
