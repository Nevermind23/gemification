package p342j$.util.stream;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.BaseStream;
import p342j$.util.C9370O;
import p342j$.util.stream.IntStream;

/* renamed from: j$.util.stream.h */
public final /* synthetic */ class C9659h implements BaseStream {

    /* renamed from: a */
    public final /* synthetic */ C9664i f26388a;

    private /* synthetic */ C9659h(C9664i iVar) {
        this.f26388a = iVar;
    }

    /* renamed from: u */
    public static /* synthetic */ BaseStream m35523u(C9664i iVar) {
        if (iVar == null) {
            return null;
        }
        return iVar instanceof C9654g ? ((C9654g) iVar).f26385a : iVar instanceof C9543G ? C9538F.m34982u((C9543G) iVar) : iVar instanceof IntStream ? IntStream.Wrapper.convert((IntStream) iVar) : iVar instanceof C9690n0 ? C9685m0.m35637u((C9690n0) iVar) : iVar instanceof Stream ? C9595S2.m35238u((Stream) iVar) : new C9659h(iVar);
    }

    public final /* synthetic */ void close() {
        this.f26388a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        C9664i iVar = this.f26388a;
        if (obj instanceof C9659h) {
            obj = ((C9659h) obj).f26388a;
        }
        return iVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f26388a.hashCode();
    }

    public final /* synthetic */ boolean isParallel() {
        return this.f26388a.isParallel();
    }

    public final /* synthetic */ Iterator iterator() {
        return this.f26388a.iterator();
    }

    public final /* synthetic */ BaseStream onClose(Runnable runnable) {
        return m35523u(this.f26388a.onClose(runnable));
    }

    public final /* synthetic */ BaseStream parallel() {
        return m35523u(this.f26388a.parallel());
    }

    public final /* synthetic */ BaseStream sequential() {
        return m35523u(this.f26388a.sequential());
    }

    public final /* synthetic */ Spliterator spliterator() {
        return C9370O.m34602a(this.f26388a.spliterator());
    }

    public final /* synthetic */ BaseStream unordered() {
        return m35523u(this.f26388a.unordered());
    }
}
