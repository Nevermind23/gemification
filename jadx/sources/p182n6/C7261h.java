package p182n6;

import p143k6.C6819b;
import p143k6.C6823e;
import p337z7.C9227g;
import p337z7.Task;

/* renamed from: n6.h */
public abstract class C7261h {

    /* renamed from: a */
    private static final C7253d0 f21456a = new C7246a0();

    /* renamed from: n6.h$a */
    public interface C7262a {
        /* renamed from: a */
        Object mo11802a(C6823e eVar);
    }

    /* renamed from: a */
    public static Task m27888a(C6819b bVar, C7262a aVar) {
        C7253d0 d0Var = f21456a;
        C9227g gVar = new C9227g();
        bVar.mo11970b(new C7248b0(bVar, gVar, aVar, d0Var));
        return gVar.mo24883a();
    }

    /* renamed from: b */
    public static Task m27889b(C6819b bVar) {
        return m27888a(bVar, new C7251c0());
    }
}
