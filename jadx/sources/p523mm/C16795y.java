package p523mm;

import ed1.C40762x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p509lm.C16586a;

/* renamed from: mm.y */
public final class C16795y {

    /* renamed from: a */
    private final C16586a f47068a;

    public C16795y(C16586a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f47068a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m59259b(C16795y yVar, List list, boolean z, Long l, Long l2, Boolean bool, Boolean bool2, boolean z2, int i, Object obj) {
        boolean z3 = false;
        boolean z4 = (i & 2) != 0 ? false : z;
        Boolean bool3 = null;
        Long l3 = (i & 4) != 0 ? null : l;
        Long l4 = (i & 8) != 0 ? null : l2;
        Boolean bool4 = (i & 16) != 0 ? null : bool;
        if ((i & 32) == 0) {
            bool3 = bool2;
        }
        if ((i & 64) == 0) {
            z3 = z2;
        }
        return yVar.mo43915a(list, z4, l3, l4, bool4, bool3, z3);
    }

    /* renamed from: a */
    public final C40762x mo43915a(List list, boolean z, Long l, Long l2, Boolean bool, Boolean bool2, boolean z2) {
        return this.f47068a.mo42391Ca(list, z, l, l2, bool, bool2, z2);
    }
}
