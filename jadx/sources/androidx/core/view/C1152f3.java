package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import bf1.C40342g;
import bf1.C40344i;
import he1.C41238w;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import oe1.C41861k;
import ue1.C43079p;
import ve1.C43151a;

/* renamed from: androidx.core.view.f3 */
public abstract class C1152f3 {

    /* renamed from: androidx.core.view.f3$a */
    public static final class C1153a implements C40342g {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3808a;

        C1153a(ViewGroup viewGroup) {
            this.f3808a = viewGroup;
        }

        public Iterator iterator() {
            return C1152f3.m4217d(this.f3808a);
        }
    }

    /* renamed from: androidx.core.view.f3$b */
    static final class C1154b extends C41861k implements C43079p {

        /* renamed from: f */
        Object f3809f;

        /* renamed from: g */
        Object f3810g;

        /* renamed from: h */
        int f3811h;

        /* renamed from: i */
        int f3812i;

        /* renamed from: j */
        int f3813j;

        /* renamed from: k */
        private /* synthetic */ Object f3814k;

        /* renamed from: l */
        final /* synthetic */ ViewGroup f3815l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1154b(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.f3815l = viewGroup;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            C1154b bVar = new C1154b(this.f3815l, continuation);
            bVar.f3814k = obj;
            return bVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x004e  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x008f  */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo3709f(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ne1.C41793d.m121157c()
                int r1 = r11.f3813j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x003d
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                int r1 = r11.f3812i
                int r4 = r11.f3811h
                java.lang.Object r5 = r11.f3809f
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                java.lang.Object r6 = r11.f3814k
                bf1.i r6 = (bf1.C40344i) r6
                he1.C41228o.m119483b(r12)
                r12 = r11
                goto L_0x0091
            L_0x0020:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0028:
                int r1 = r11.f3812i
                int r4 = r11.f3811h
                java.lang.Object r5 = r11.f3810g
                android.view.View r5 = (android.view.View) r5
                java.lang.Object r6 = r11.f3809f
                android.view.ViewGroup r6 = (android.view.ViewGroup) r6
                java.lang.Object r7 = r11.f3814k
                bf1.i r7 = (bf1.C40344i) r7
                he1.C41228o.m119483b(r12)
                r12 = r11
                goto L_0x0071
            L_0x003d:
                he1.C41228o.m119483b(r12)
                java.lang.Object r12 = r11.f3814k
                bf1.i r12 = (bf1.C40344i) r12
                android.view.ViewGroup r1 = r11.f3815l
                int r4 = r1.getChildCount()
                r5 = 0
                r6 = r11
            L_0x004c:
                if (r5 >= r4) goto L_0x00a1
                android.view.View r7 = r1.getChildAt(r5)
                java.lang.String r8 = "getChildAt(index)"
                kotlin.jvm.internal.C41536l.m120488h(r7, r8)
                r6.f3814k = r12
                r6.f3809f = r1
                r6.f3810g = r7
                r6.f3811h = r5
                r6.f3812i = r4
                r6.f3813j = r3
                java.lang.Object r8 = r12.mo94381d(r7, r6)
                if (r8 != r0) goto L_0x006a
                return r0
            L_0x006a:
                r9 = r7
                r7 = r12
                r12 = r6
                r6 = r1
                r1 = r4
                r4 = r5
                r5 = r9
            L_0x0071:
                boolean r8 = r5 instanceof android.view.ViewGroup
                if (r8 == 0) goto L_0x0098
                android.view.ViewGroup r5 = (android.view.ViewGroup) r5
                bf1.g r5 = androidx.core.view.C1152f3.m4216c(r5)
                r12.f3814k = r7
                r12.f3809f = r6
                r8 = 0
                r12.f3810g = r8
                r12.f3811h = r4
                r12.f3812i = r1
                r12.f3813j = r2
                java.lang.Object r5 = r7.mo94388f(r5, r12)
                if (r5 != r0) goto L_0x008f
                return r0
            L_0x008f:
                r5 = r6
                r6 = r7
            L_0x0091:
                r9 = r6
                r6 = r12
                r12 = r9
                r10 = r5
                r5 = r1
                r1 = r10
                goto L_0x009c
            L_0x0098:
                r5 = r1
                r1 = r6
                r6 = r12
                r12 = r7
            L_0x009c:
                int r4 = r4 + r3
                r9 = r5
                r5 = r4
                r4 = r9
                goto L_0x004c
            L_0x00a1:
                he1.w r12 = he1.C41238w.f97225a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.C1152f3.C1154b.mo3709f(java.lang.Object):java.lang.Object");
        }

        /* renamed from: m */
        public final Object invoke(C40344i iVar, Continuation continuation) {
            return ((C1154b) mo3708a(iVar, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: androidx.core.view.f3$c */
    public static final class C1155c implements Iterator, C43151a {

        /* renamed from: d */
        private int f3816d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f3817e;

        C1155c(ViewGroup viewGroup) {
            this.f3817e = viewGroup;
        }

        /* renamed from: b */
        public View next() {
            ViewGroup viewGroup = this.f3817e;
            int i = this.f3816d;
            this.f3816d = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        public boolean hasNext() {
            return this.f3816d < this.f3817e.getChildCount();
        }

        public void remove() {
            ViewGroup viewGroup = this.f3817e;
            int i = this.f3816d - 1;
            this.f3816d = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final View m4214a(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    /* renamed from: b */
    public static final C40342g m4215b(ViewGroup viewGroup) {
        C41536l.m120489i(viewGroup, "<this>");
        return new C1153a(viewGroup);
    }

    /* renamed from: c */
    public static final C40342g m4216c(ViewGroup viewGroup) {
        C41536l.m120489i(viewGroup, "<this>");
        return C40346k.m116841b(new C1154b(viewGroup, (Continuation) null));
    }

    /* renamed from: d */
    public static final Iterator m4217d(ViewGroup viewGroup) {
        C41536l.m120489i(viewGroup, "<this>");
        return new C1155c(viewGroup);
    }
}
