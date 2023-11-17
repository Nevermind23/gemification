package ef1;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41596f;
import kotlinx.coroutines.internal.C41606k;
import kotlinx.coroutines.internal.C41607l;
import me1.C41741a;
import me1.C41742b;
import me1.C41748d;
import me1.C41752f;
import ue1.C43075l;

/* renamed from: ef1.d0 */
public abstract class C40793d0 extends C41741a implements C41748d {

    /* renamed from: e */
    public static final C40794a f96519e = new C40794a((DefaultConstructorMarker) null);

    /* renamed from: ef1.d0$a */
    public static final class C40794a extends C41742b {

        /* renamed from: ef1.d0$a$a */
        static final class C40795a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C40795a f96520d = new C40795a();

            C40795a() {
                super(1);
            }

            /* renamed from: a */
            public final C40793d0 invoke(C41752f.C41755b bVar) {
                if (bVar instanceof C40793d0) {
                    return (C40793d0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ C40794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C40794a() {
            super(C41748d.f98026f3, C40795a.f96520d);
        }
    }

    public C40793d0() {
        super(C41748d.f98026f3);
    }

    /* renamed from: c */
    public C41752f.C41755b mo23736c(C41752f.C41757c cVar) {
        return C41748d.C41749a.m121030a(this, cVar);
    }

    /* renamed from: d */
    public final void mo95146d(Continuation continuation) {
        ((C41596f) continuation).mo96368s();
    }

    /* renamed from: f */
    public final Continuation mo95147f(Continuation continuation) {
        return new C41596f(this, continuation);
    }

    /* renamed from: h */
    public abstract void mo95148h(C41752f fVar, Runnable runnable);

    /* renamed from: i */
    public boolean mo95149i(C41752f fVar) {
        return true;
    }

    /* renamed from: q */
    public C41752f mo23740q(C41752f.C41757c cVar) {
        return C41748d.C41749a.m121031b(this, cVar);
    }

    public String toString() {
        return C40832l0.m118329a(this) + '@' + C40832l0.m118330b(this);
    }

    /* renamed from: y */
    public C40793d0 mo95151y(int i) {
        C41607l.m120708a(i);
        return new C41606k(this, i);
    }
}
