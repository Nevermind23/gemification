package od0;

import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import od0.C26941b;
import pd0.C27503h;

/* renamed from: od0.a */
public final class C26940a implements C26941b {

    /* renamed from: d */
    private final ArrayList f67716d = new ArrayList();

    /* renamed from: a */
    public C27503h mo66226a(C27503h hVar) {
        return C26941b.C26942a.m83772a(this, hVar);
    }

    public void addStore(C27503h hVar) {
        C41536l.m120489i(hVar, "store");
        this.f67716d.add(hVar);
    }

    /* renamed from: b */
    public void mo66227b() {
        for (C27503h l : this.f67716d) {
            l.mo66811l();
        }
    }
}
