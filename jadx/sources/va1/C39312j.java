package va1;

import af1.C40296c;
import android.content.Context;
import android.content.SharedPreferences;
import ba1.C10196h;
import com.google.gson.C5490d;
import com.google.gson.Gson;
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
import ph1.C42203a;
import qa1.C27700a1;
import rh1.C42385b;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: va1.j */
public abstract class C39312j {

    /* renamed from: a */
    private static final C41702a f93514a = C42385b.m122932b(false, false, C39313a.f93515d, 3, (Object) null);

    /* renamed from: va1.j$a */
    static final class C39313a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39313a f93515d = new C39313a();

        /* renamed from: va1.j$a$a */
        static final class C39314a extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39314a f93516d = new C39314a();

            C39314a() {
                super(2);
            }

            /* renamed from: a */
            public final SharedPreferences invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$factory");
                C41536l.m120489i(aVar2, "it");
                return C39312j.m114467g((Context) aVar.mo97675g(C41520a0.m120436b(Context.class), (C41806a) null, (C43064a) null));
            }
        }

        /* renamed from: va1.j$a$b */
        static final class C39315b extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39315b f93517d = new C39315b();

            C39315b() {
                super(2);
            }

            /* renamed from: a */
            public final Gson invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$factory");
                C41536l.m120489i(aVar2, "it");
                return C39312j.m114465e();
            }
        }

        /* renamed from: va1.j$a$c */
        static final class C39316c extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39316c f93518d = new C39316c();

            C39316c() {
                super(2);
            }

            /* renamed from: a */
            public final C10196h invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return C39312j.m114466f((Context) aVar.mo97675g(C41520a0.m120436b(Context.class), (C41806a) null, (C43064a) null));
            }
        }

        /* renamed from: va1.j$a$d */
        static final class C39317d extends C41537m implements C43079p {

            /* renamed from: d */
            public static final C39317d f93519d = new C39317d();

            C39317d() {
                super(2);
            }

            /* renamed from: a */
            public final C27700a1 invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$this$single");
                C41536l.m120489i(aVar2, "it");
                return new C27700a1((SharedPreferences) aVar.mo97675g(C41520a0.m120436b(SharedPreferences.class), (C41806a) null, (C43064a) null), (Gson) aVar.mo97675g(C41520a0.m120436b(Gson.class), (C41806a) null, (C43064a) null));
            }
        }

        C39313a() {
            super(1);
        }

        /* renamed from: a */
        public final void mo92942a(C41702a aVar) {
            C41702a aVar2 = aVar;
            C41536l.m120489i(aVar2, "$this$module");
            C39314a aVar3 = C39314a.f93516d;
            C41374f f = C41702a.m120951f(aVar2, false, false, 2, (Object) null);
            C41372d dVar = C41372d.f97416a;
            C41806a b = aVar.mo96502b();
            List j = C41341q.m119907j();
            C40296c b2 = C41520a0.m120436b(SharedPreferences.class);
            C41373e eVar = C41373e.Factory;
            C41703b.m120958a(aVar.mo96501a(), new C41368a(b, b2, (C41806a) null, aVar3, eVar, j, f, (C41375g) null, 128, (DefaultConstructorMarker) null));
            C39315b bVar = C39315b.f93517d;
            C41374f f2 = C41702a.m120951f(aVar2, false, false, 2, (Object) null);
            C41703b.m120958a(aVar.mo96501a(), new C41368a(aVar.mo96502b(), C41520a0.m120436b(Gson.class), (C41806a) null, bVar, eVar, C41341q.m119907j(), f2, (C41375g) null, 128, (DefaultConstructorMarker) null));
            C39316c cVar = C39316c.f93518d;
            C41374f e = aVar2.mo96505e(false, false);
            C41806a b3 = aVar.mo96502b();
            List j2 = C41341q.m119907j();
            C40296c b4 = C41520a0.m120436b(C10196h.class);
            C41373e eVar2 = C41373e.Single;
            C41703b.m120958a(aVar.mo96501a(), new C41368a(b3, b4, (C41806a) null, cVar, eVar2, j2, e, (C41375g) null, 128, (DefaultConstructorMarker) null));
            C39317d dVar2 = C39317d.f93519d;
            C41374f e2 = aVar2.mo96505e(false, true);
            C41703b.m120958a(aVar.mo96501a(), new C41368a(aVar.mo96502b(), C41520a0.m120436b(C27700a1.class), (C41806a) null, dVar2, eVar2, C41341q.m119907j(), e2, (C41375g) null, 128, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92942a((C41702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: d */
    public static final C41702a m114464d() {
        return f93514a;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Gson m114465e() {
        Gson b = new C5490d().mo18203b();
        C41536l.m120488h(b, "GsonBuilder().create()");
        return b;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C10196h m114466f(Context context) {
        return new C10196h(context);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final SharedPreferences m114467g(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("sso_prefs", 0);
        C41536l.m120488h(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return sharedPreferences;
    }
}
