package xg1;

import android.app.Application;
import android.content.Context;
import fh1.C40951a;
import fh1.C40952b;
import he1.C41238w;
import ih1.C41368a;
import ih1.C41372d;
import ih1.C41373e;
import ih1.C41374f;
import ih1.C41375g;
import kh1.C41517b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh1.C41702a;
import lh1.C41703b;
import mh1.C41769a;
import nh1.C41806a;
import ph1.C42203a;
import rh1.C42384a;
import rh1.C42385b;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: xg1.a */
public abstract class C43288a {

    /* renamed from: xg1.a$a */
    static final class C43289a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Context f101055d;

        /* renamed from: xg1.a$a$a */
        static final class C43290a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C43289a f101056d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43290a(C43289a aVar) {
                super(2);
                this.f101056d = aVar;
            }

            /* renamed from: a */
            public final Context invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$receiver");
                C41536l.m120489i(aVar2, "it");
                return this.f101056d.f101055d;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43289a(Context context) {
            super(1);
            this.f101055d = context;
        }

        /* renamed from: a */
        public final void mo101990a(C41702a aVar) {
            C41536l.m120489i(aVar, "$receiver");
            C43290a aVar2 = new C43290a(this);
            C41374f e = aVar.mo96505e(false, false);
            C41372d dVar = C41372d.f97416a;
            C41368a aVar3 = new C41368a(aVar.mo96502b(), C41520a0.m120436b(Context.class), (C41806a) null, aVar2, C41373e.Single, C41341q.m119907j(), e, (C41375g) null, 128, (DefaultConstructorMarker) null);
            C41703b.m120958a(aVar.mo96501a(), aVar3);
            C42384a.m122930a(aVar3, C41520a0.m120436b(Application.class));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo101990a((C41702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: xg1.a$b */
    static final class C43291b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ Context f101057d;

        /* renamed from: xg1.a$b$a */
        static final class C43292a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C43291b f101058d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43292a(C43291b bVar) {
                super(2);
                this.f101058d = bVar;
            }

            /* renamed from: a */
            public final Context invoke(C42203a aVar, C41769a aVar2) {
                C41536l.m120489i(aVar, "$receiver");
                C41536l.m120489i(aVar2, "it");
                return this.f101058d.f101057d;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43291b(Context context) {
            super(1);
            this.f101057d = context;
        }

        /* renamed from: a */
        public final void mo101992a(C41702a aVar) {
            C41536l.m120489i(aVar, "$receiver");
            C43292a aVar2 = new C43292a(this);
            C41374f e = aVar.mo96505e(false, false);
            C41372d dVar = C41372d.f97416a;
            C41703b.m120958a(aVar.mo96501a(), new C41368a(aVar.mo96502b(), C41520a0.m120436b(Context.class), (C41806a) null, aVar2, C41373e.Single, C41341q.m119907j(), e, (C41375g) null, 128, (DefaultConstructorMarker) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo101992a((C41702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: a */
    public static final C40952b m124321a(C40952b bVar, Context context) {
        C41536l.m120489i(bVar, "$this$androidContext");
        C41536l.m120489i(context, "androidContext");
        if (bVar.mo95348c().mo95344b().mo96287f(C41517b.INFO)) {
            bVar.mo95348c().mo95344b().mo96286e("[init] declare Android Context");
        }
        if (context instanceof Application) {
            C40951a.m118737e(bVar.mo95348c(), C41339p.m119900e(C42385b.m122932b(false, false, new C43289a(context), 3, (Object) null)), false, 2, (Object) null);
        } else {
            C40951a.m118737e(bVar.mo95348c(), C41339p.m119900e(C42385b.m122932b(false, false, new C43291b(context), 3, (Object) null)), false, 2, (Object) null);
        }
        return bVar;
    }
}
