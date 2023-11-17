package p565pm;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p537nm.C17097n;
import p537nm.C17103t;

/* renamed from: pm.c */
public final class C17388c {

    /* renamed from: a */
    private final List f48782a;

    /* renamed from: b */
    private final C17389d f48783b;

    /* renamed from: c */
    private final C17103t f48784c;

    /* renamed from: d */
    private final C17097n f48785d;

    public C17388c(List list, C17389d dVar, C17103t tVar, C17097n nVar) {
        C41536l.m120489i(list, "deliveryPoints");
        C41536l.m120489i(dVar, "deliveryCity");
        C41536l.m120489i(tVar, "fee");
        C41536l.m120489i(nVar, "card");
        this.f48782a = list;
        this.f48783b = dVar;
        this.f48784c = tVar;
        this.f48785d = nVar;
    }

    /* renamed from: a */
    public final C17097n mo44903a() {
        return this.f48785d;
    }

    /* renamed from: b */
    public final C17389d mo44904b() {
        return this.f48783b;
    }

    /* renamed from: c */
    public final List mo44905c() {
        return this.f48782a;
    }

    /* renamed from: d */
    public final C17103t mo44906d() {
        return this.f48784c;
    }
}
