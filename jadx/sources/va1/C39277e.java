package va1;

import af1.C40296c;
import db1.C31552b;
import he1.C41238w;
import ih1.C41368a;
import ih1.C41372d;
import ih1.C41373e;
import ih1.C41374f;
import ih1.C41375g;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh1.C41702a;
import lh1.C41703b;
import mh1.C41769a;
import nh1.C41806a;
import ob1.C37704a;
import ph1.C42203a;
import rh1.C42385b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: va1.e */
public abstract class C39277e {

    /* renamed from: a */
    private static final C41702a f93478a = C42385b.m122932b(false, false, C39278a.f93479d, 3, (Object) null);

    /* renamed from: va1.e$a */
    static final class C39278a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39278a f93479d = new C39278a();

        /* renamed from: va1.e$a$a */
        static final class C39279a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39279a f93480d = new C39279a();

            C39279a() {
                super(2);
            }

            /* renamed from: a */
            public final C31552b invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return new C31552b();
            }
        }

        /* renamed from: va1.e$a$b */
        static final class C39280b extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39280b f93481d = new C39280b();

            C39280b() {
                super(2);
            }

            /* renamed from: a */
            public final C37704a invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return new C37704a();
            }
        }

        C39278a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo92909a(C41702a aVar) {
            C41702a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$module");
            C39279a aVar3 = C39279a.f93480d;
            C41374f e = aVar2.mo96505e(false, false);
            C41372d dVar = C41372d.f97416a;
            C41806a b = aVar.mo96502b();
            List j = C41341q.m119907j();
            C40296c b2 = C41520a0.m120436b(C31552b.class);
            C41373e eVar = C41373e.Single;
            C41703b.m120958a(aVar.mo96501a(), new C41368a(b, b2, (C41806a) null, aVar3, eVar, j, e, (C41375g) null, 128, (DefaultConstructorMarker) null));
            C39280b bVar = C39280b.f93481d;
            C41374f e2 = aVar2.mo96505e(false, false);
            C41703b.m120958a(aVar.mo96501a(), new C41368a(aVar.mo96502b(), C41520a0.m120436b(C37704a.class), (C41806a) null, bVar, eVar, C41341q.m119907j(), e2, (C41375g) null, 128, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92909a((C41702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: a */
    public static final C41702a m114417a() {
        return f93478a;
    }
}
