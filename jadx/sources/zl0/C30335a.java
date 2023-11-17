package zl0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import z71.C40194u;

/* renamed from: zl0.a */
public final class C30335a extends C1819o {

    /* renamed from: f */
    private final C30336b f76256f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30335a(C30336b bVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(bVar, "itemClickListener");
        this.f76256f = bVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C30339e eVar, int i) {
        C41536l.m120489i(eVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        eVar.mo70668i((C30337c) g, this.f76256f);
    }

    /* renamed from: l */
    public C30339e onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C40194u d = C40194u.m116484d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C30339e(d);
    }
}
