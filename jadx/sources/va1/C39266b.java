package va1;

import af1.C40296c;
import android.content.Context;
import hb1.C36175k;
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
import p341ge.bog.sso_client.database.SsoDatabase;
import ph1.C42203a;
import rh1.C42385b;
import sa1.C28172a;
import sa1.C28178g;
import sa1.C28181h;
import sa1.C28183j;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: va1.b */
public abstract class C39266b {

    /* renamed from: a */
    private static final C41702a f93467a = C42385b.m122932b(false, false, C39267a.f93468d, 3, (Object) null);

    /* renamed from: va1.b$a */
    static final class C39267a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39267a f93468d = new C39267a();

        /* renamed from: va1.b$a$a */
        static final class C39268a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39268a f93469d = new C39268a();

            C39268a() {
                super(2);
            }

            /* renamed from: a */
            public final C28172a invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return new C28178g((Context) aVar.mo97675g(C41520a0.m120436b(Context.class), (C41806a) null, (C43064a) null), (SsoDatabase) aVar.mo97675g(C41520a0.m120436b(SsoDatabase.class), (C41806a) null, (C43064a) null));
            }
        }

        /* renamed from: va1.b$a$b */
        static final class C39269b extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39269b f93470d = new C39269b();

            C39269b() {
                super(2);
            }

            /* renamed from: a */
            public final C28181h invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return new C28183j((C36175k) aVar.mo97675g(C41520a0.m120436b(C36175k.class), (C41806a) null, (C43064a) null));
            }
        }

        C39267a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo92901a(C41702a aVar) {
            C41702a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$module");
            C39268a aVar3 = C39268a.f93469d;
            C41374f e = aVar2.mo96505e(false, false);
            C41372d dVar = C41372d.f97416a;
            C41806a b = aVar.mo96502b();
            List j = C41341q.m119907j();
            C40296c b2 = C41520a0.m120436b(C28172a.class);
            C41373e eVar = C41373e.Single;
            C41703b.m120958a(aVar.mo96501a(), new C41368a(b, b2, (C41806a) null, aVar3, eVar, j, e, (C41375g) null, 128, (DefaultConstructorMarker) null));
            C39269b bVar = C39269b.f93470d;
            C41374f e2 = aVar2.mo96505e(false, false);
            C41703b.m120958a(aVar.mo96501a(), new C41368a(aVar.mo96502b(), C41520a0.m120436b(C28181h.class), (C41806a) null, bVar, eVar, C41341q.m119907j(), e2, (C41375g) null, 128, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92901a((C41702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: a */
    public static final C41702a m114406a() {
        return f93467a;
    }
}
