package kotlinx.coroutines.internal;

import ef1.C40825j2;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import me1.C41752f;
import ue1.C43079p;

/* renamed from: kotlinx.coroutines.internal.e0 */
public abstract class C41592e0 {

    /* renamed from: a */
    public static final C41584a0 f97780a = new C41584a0("NO_THREAD_ELEMENTS");

    /* renamed from: b */
    private static final C43079p f97781b = C41593a.f97784d;

    /* renamed from: c */
    private static final C43079p f97782c = C41594b.f97785d;

    /* renamed from: d */
    private static final C43079p f97783d = C41595c.f97786d;

    /* renamed from: kotlinx.coroutines.internal.e0$a */
    static final class C41593a extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C41593a f97784d = new C41593a();

        C41593a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, C41752f.C41755b bVar) {
            Integer num;
            int i;
            if (!(bVar instanceof C40825j2)) {
                return obj;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i = num.intValue();
            } else {
                i = 1;
            }
            if (i == 0) {
                return bVar;
            }
            return Integer.valueOf(i + 1);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.e0$b */
    static final class C41594b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C41594b f97785d = new C41594b();

        C41594b() {
            super(2);
        }

        /* renamed from: a */
        public final C40825j2 invoke(C40825j2 j2Var, C41752f.C41755b bVar) {
            if (j2Var != null) {
                return j2Var;
            }
            if (bVar instanceof C40825j2) {
                return (C40825j2) bVar;
            }
            return null;
        }
    }

    /* renamed from: kotlinx.coroutines.internal.e0$c */
    static final class C41595c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C41595c f97786d = new C41595c();

        C41595c() {
            super(2);
        }

        /* renamed from: a */
        public final C41605j0 invoke(C41605j0 j0Var, C41752f.C41755b bVar) {
            if (bVar instanceof C40825j2) {
                C40825j2 j2Var = (C40825j2) bVar;
                j0Var.mo96385a(j2Var, j2Var.mo95174a0(j0Var.f97801a));
            }
            return j0Var;
        }
    }

    /* renamed from: a */
    public static final void m120647a(C41752f fVar, Object obj) {
        if (obj != f97780a) {
            if (obj instanceof C41605j0) {
                ((C41605j0) obj).mo96386b(fVar);
                return;
            }
            Object U = fVar.mo23734U((Object) null, f97782c);
            if (U != null) {
                ((C40825j2) U).mo95173R(fVar, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    /* renamed from: b */
    public static final Object m120648b(C41752f fVar) {
        Object U = fVar.mo23734U(0, f97781b);
        C41536l.m120486f(U);
        return U;
    }

    /* renamed from: c */
    public static final Object m120649c(C41752f fVar, Object obj) {
        if (obj == null) {
            obj = m120648b(fVar);
        }
        if (obj == 0) {
            return f97780a;
        }
        if (obj instanceof Integer) {
            return fVar.mo23734U(new C41605j0(fVar, ((Number) obj).intValue()), f97783d);
        }
        return ((C40825j2) obj).mo95174a0(fVar);
    }
}
