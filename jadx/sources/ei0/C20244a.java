package ei0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import ed1.C40749p;
import fi0.C20488b;
import hd1.C41204a;
import hi0.C25028a;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import th0.C28419p0;

/* renamed from: ei0.a */
public final class C20244a extends C1819o {

    /* renamed from: f */
    private final C40749p f55133f;

    /* renamed from: g */
    private final C41204a f55134g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20244a(C40749p pVar, C41204a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(pVar, "gyroSensorData");
        C41536l.m120489i(aVar, "compositeDisposable");
        this.f55133f = pVar;
        this.f55134g = aVar;
    }

    /* renamed from: k */
    public final C25028a mo48716k(int i) {
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        return (C25028a) g;
    }

    /* renamed from: l */
    public void onBindViewHolder(C20488b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        bVar.mo49029j((C25028a) g);
    }

    /* renamed from: m */
    public C20488b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28419p0 d = C28419p0.m87198d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        C20488b bVar = new C20488b(d);
        bVar.mo49030k(this.f55133f, this.f55134g);
        return bVar;
    }
}
