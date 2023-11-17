package wr0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import pr0.C37972w;
import xr0.C39840c;

/* renamed from: wr0.m */
public final class C39668m extends C1819o {

    /* renamed from: wr0.m$a */
    public static final class C39669a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37972w f94289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39669a(C37972w wVar) {
            super(wVar.mo3946b());
            C41536l.m120489i(wVar, "binding");
            this.f94289d = wVar;
        }

        /* renamed from: h */
        public final void mo93416h(C39840c cVar) {
            C41536l.m120489i(cVar, "item");
            C37972w wVar = this.f94289d;
            wVar.f91270e.setText(C34646b.m101752f(cVar.mo93545b(), (Context) null, 1, (Object) null));
            wVar.f91271f.setText(cVar.mo93544a());
        }
    }

    public C39668m() {
        super(C37599g.f90345a.mo90787d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C39669a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo93416h((C39840c) g);
    }

    /* renamed from: l */
    public C39669a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C37972w d = C37972w.m111634d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C39669a(d);
    }
}
