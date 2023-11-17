package bf1;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;

/* renamed from: bf1.n */
abstract class C40353n extends C40349m {

    /* renamed from: bf1.n$a */
    static final class C40354a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Class f95848d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40354a(Class cls) {
            super(1);
            this.f95848d = cls;
        }

        /* renamed from: a */
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(this.f95848d.isInstance(obj));
        }
    }

    /* renamed from: i */
    public static C40342g m116848i(C40342g gVar, Class cls) {
        C41536l.m120489i(gVar, "<this>");
        C41536l.m120489i(cls, "klass");
        C40342g l = C40355o.m116854l(gVar, new C40354a(cls));
        C41536l.m120487g(l, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return l;
    }
}
