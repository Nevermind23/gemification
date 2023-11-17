package kotlinx.coroutines.flow;

import gf1.C41097e;
import he1.C41238w;
import hf1.C41250h;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.internal.C41586b0;
import me1.C41752f;
import oe1.C41862l;
import ue1.C43079p;
import ue1.C43080q;

/* renamed from: kotlinx.coroutines.flow.h */
abstract /* synthetic */ class C41564h {

    /* renamed from: a */
    private static final int f97726a = C41586b0.m120626b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    /* renamed from: kotlinx.coroutines.flow.h$a */
    static final class C41565a extends C41862l implements C43080q {

        /* renamed from: h */
        int f97727h;

        /* renamed from: i */
        private /* synthetic */ Object f97728i;

        /* renamed from: j */
        /* synthetic */ Object f97729j;

        /* renamed from: k */
        final /* synthetic */ C43079p f97730k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41565a(C43079p pVar, Continuation continuation) {
            super(3, continuation);
            this.f97730k = pVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.b} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo3709f(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = ne1.C41793d.m121157c()
                int r1 = r5.f97727h
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                he1.C41228o.m119483b(r6)
                goto L_0x0045
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r1 = r5.f97728i
                kotlinx.coroutines.flow.b r1 = (kotlinx.coroutines.flow.C41557b) r1
                he1.C41228o.m119483b(r6)
                goto L_0x0039
            L_0x0022:
                he1.C41228o.m119483b(r6)
                java.lang.Object r6 = r5.f97728i
                r1 = r6
                kotlinx.coroutines.flow.b r1 = (kotlinx.coroutines.flow.C41557b) r1
                java.lang.Object r6 = r5.f97729j
                ue1.p r4 = r5.f97730k
                r5.f97728i = r1
                r5.f97727h = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L_0x0039
                return r0
            L_0x0039:
                r3 = 0
                r5.f97728i = r3
                r5.f97727h = r2
                java.lang.Object r6 = r1.mo95721b(r6, r5)
                if (r6 != r0) goto L_0x0045
                return r0
            L_0x0045:
                he1.w r6 = he1.C41238w.f97225a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.C41564h.C41565a.mo3709f(java.lang.Object):java.lang.Object");
        }

        /* renamed from: n */
        public final Object invoke(C41557b bVar, Object obj, Continuation continuation) {
            C41565a aVar = new C41565a(this.f97730k, continuation);
            aVar.f97728i = bVar;
            aVar.f97729j = obj;
            return aVar.mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: a */
    public static final C41556a m120533a(C41556a aVar, C43079p pVar) {
        return C41558c.m120523j(aVar, new C41565a(pVar, (Continuation) null));
    }

    /* renamed from: b */
    public static final C41556a m120534b(C41556a aVar, C43080q qVar) {
        return new C41250h(qVar, aVar, (C41752f) null, 0, (C41097e) null, 28, (DefaultConstructorMarker) null);
    }
}
