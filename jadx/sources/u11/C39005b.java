package u11;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import g11.C32041b;
import j11.C36696d;
import kotlin.jvm.internal.C41536l;
import p615tg.C17963d;
import v11.C39196c;

/* renamed from: u11.b */
public final class C39005b extends C1819o {

    /* renamed from: f */
    private C39006a f93125f;

    /* renamed from: u11.b$a */
    public interface C39006a {
        /* renamed from: h */
        void mo84106h(C32041b bVar);
    }

    public C39005b(C39006a aVar) {
        super(C17963d.f51158a.mo45633d());
        this.f93125f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m113904n(C39005b bVar, C32041b bVar2) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(bVar2, "productType");
        C39006a aVar = bVar.f93125f;
        if (aVar != null) {
            aVar.mo84106h(bVar2);
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C39196c cVar, int i) {
        C41536l.m120489i(cVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        cVar.mo92833l((C32041b) g);
    }

    /* renamed from: m */
    public C39196c onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36696d d = C36696d.m108831d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        return new C39196c(d, new C39004a(this));
    }
}
