package tk0;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import rk0.C28049b;

/* renamed from: tk0.l */
public final class C28459l {

    /* renamed from: a */
    private final C28447b f72260a;

    /* renamed from: b */
    private final C28049b f72261b;

    public C28459l(C28447b bVar, C28049b bVar2) {
        C41536l.m120489i(bVar, "filterHubsAndSettings");
        C41536l.m120489i(bVar2, "searchItemMapper");
        this.f72260a = bVar;
        this.f72261b = bVar2;
    }

    /* renamed from: a */
    public final List mo68085a(String str, boolean z, boolean z2) {
        C41536l.m120489i(str, "searchWord");
        List a = this.f72260a.mo68075a(str, z, z2);
        if (a != null) {
            return this.f72261b.mo67594a(a);
        }
        return null;
    }
}
