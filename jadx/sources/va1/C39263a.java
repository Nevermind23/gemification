package va1;

import android.content.Context;
import he1.C41238w;
import ih1.C41368a;
import ih1.C41372d;
import ih1.C41373e;
import ih1.C41374f;
import ih1.C41375g;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh1.C41702a;
import lh1.C41703b;
import mh1.C41769a;
import nh1.C41806a;
import p267u0.C8502v;
import p341ge.bog.sso_client.database.SsoDatabase;
import ph1.C42203a;
import rh1.C42385b;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: va1.a */
public abstract class C39263a {

    /* renamed from: a */
    private static final C41702a f93464a = C42385b.m122932b(false, false, C39264a.f93465d, 3, (Object) null);

    /* renamed from: va1.a$a */
    static final class C39264a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39264a f93465d = new C39264a();

        /* renamed from: va1.a$a$a */
        static final class C39265a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39265a f93466d = new C39265a();

            C39265a() {
                super(2);
            }

            /* renamed from: a */
            public final SsoDatabase invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return C39263a.m114403c((Context) aVar.mo97675g(C41520a0.m120436b(Context.class), (C41806a) null, (C43064a) null));
            }
        }

        C39264a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo92899a(C41702a aVar) {
            C41536l.m120489i(aVar, "$this$module");
            C39265a aVar2 = C39265a.f93466d;
            C41374f e = aVar.mo96505e(false, false);
            C41372d dVar = C41372d.f97416a;
            C41703b.m120958a(aVar.mo96501a(), new C41368a(aVar.mo96502b(), C41520a0.m120436b(SsoDatabase.class), (C41806a) null, aVar2, C41373e.Single, C41341q.m119907j(), e, (C41375g) null, 128, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92899a((C41702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: b */
    public static final C41702a m114402b() {
        return f93464a;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final SsoDatabase m114403c(Context context) {
        return (SsoDatabase) C8502v.m31831a(context, SsoDatabase.class, "SSO_Database").mo23826e().mo23825d();
    }
}
