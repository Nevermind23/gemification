package androidx.core.view;

import android.view.View;
import bf1.C40342g;
import bf1.C40344i;
import he1.C41238w;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41861k;
import ue1.C43079p;

/* renamed from: androidx.core.view.g3 */
public abstract class C1161g3 {

    /* renamed from: androidx.core.view.g3$a */
    static final class C1162a extends C41861k implements C43079p {

        /* renamed from: f */
        int f3818f;

        /* renamed from: g */
        private /* synthetic */ Object f3819g;

        /* renamed from: h */
        final /* synthetic */ View f3820h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1162a(View view, Continuation continuation) {
            super(2, continuation);
            this.f3820h = view;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C1162a aVar = new C1162a(this.f3820h, continuation);
            aVar.f3819g = obj;
            return aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: bf1.i} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo3709f(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = ne1.C41793d.m121157c()
                int r1 = r4.f3818f
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                he1.C41228o.m119483b(r5)
                goto L_0x004f
            L_0x0012:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L_0x001a:
                java.lang.Object r1 = r4.f3819g
                bf1.i r1 = (bf1.C40344i) r1
                he1.C41228o.m119483b(r5)
                goto L_0x0037
            L_0x0022:
                he1.C41228o.m119483b(r5)
                java.lang.Object r5 = r4.f3819g
                r1 = r5
                bf1.i r1 = (bf1.C40344i) r1
                android.view.View r5 = r4.f3820h
                r4.f3819g = r1
                r4.f3818f = r3
                java.lang.Object r5 = r1.mo94381d(r5, r4)
                if (r5 != r0) goto L_0x0037
                return r0
            L_0x0037:
                android.view.View r5 = r4.f3820h
                boolean r3 = r5 instanceof android.view.ViewGroup
                if (r3 == 0) goto L_0x004f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                bf1.g r5 = androidx.core.view.C1152f3.m4216c(r5)
                r3 = 0
                r4.f3819g = r3
                r4.f3818f = r2
                java.lang.Object r5 = r1.mo94388f(r5, r4)
                if (r5 != r0) goto L_0x004f
                return r0
            L_0x004f:
                he1.w r5 = he1.C41238w.f97225a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1161g3.C1162a.mo3709f(java.lang.Object):java.lang.Object");
        }

        /* renamed from: m */
        public final Object invoke(C40344i iVar, Continuation continuation) {
            return ((C1162a) mo3708a(iVar, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: a */
    public static final C40342g m4227a(View view) {
        C41536l.m120489i(view, "<this>");
        return C40346k.m116841b(new C1162a(view, (Continuation) null));
    }
}
