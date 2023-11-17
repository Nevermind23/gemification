package jj0;

import android.graphics.drawable.Drawable;
import hi0.C25028a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame;
import p642vh.C18368l;
import xh0.C29780a;
import xh0.C29781b;

/* renamed from: jj0.a */
public final class C25459a {

    /* renamed from: jj0.a$a */
    public static final class C25460a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C29781b) obj).mo69953f(), ((C29781b) obj2).mo69953f());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ C25028a m80628b(C25459a aVar, C29780a aVar2, String str, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 4) != 0) {
            bigDecimal = null;
        }
        return aVar.mo64028a(aVar2, str, bigDecimal);
    }

    /* renamed from: d */
    private final GyroAnimationFrame m80629d(C29781b bVar) {
        String a = bVar.mo69947a();
        if (a == null) {
            a = "";
        }
        return new GyroAnimationFrame(new Image.Url(a, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), C18368l.m62762k(bVar.mo69950d()), C18368l.m62762k(bVar.mo69951e()), C18368l.m62762k(bVar.mo69948b()), C18368l.m62762k(bVar.mo69949c()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final hi0.C25028a mo64028a(xh0.C29780a r13, java.lang.String r14, java.math.BigDecimal r15) {
        /*
            r12 = this;
            java.lang.String r0 = "externalFile"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            long r2 = r13.mo69942d()
            java.lang.String r5 = r13.mo69940b()
            java.lang.String r6 = r13.mo69941c()
            if (r14 != 0) goto L_0x0015
            java.lang.String r14 = ""
        L_0x0015:
            r7 = r14
            r14 = 0
            if (r15 == 0) goto L_0x0021
            java.lang.String r0 = "GEL"
            java.lang.String r15 = g91.C32343x.m95408P(r15, r0)
            r4 = r15
            goto L_0x0022
        L_0x0021:
            r4 = r14
        L_0x0022:
            java.util.List r15 = r13.mo69939a()
            if (r15 == 0) goto L_0x005f
            java.util.Iterator r15 = r15.iterator()
        L_0x002c:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r15.next()
            r1 = r0
            xh0.c r1 = (xh0.C29782c) r1
            xh0.d r1 = r1.mo69957b()
            xh0.d$a r8 = xh0.C29783d.C29784a.f75337c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r8)
            if (r1 == 0) goto L_0x002c
            goto L_0x0047
        L_0x0046:
            r0 = r14
        L_0x0047:
            xh0.c r0 = (xh0.C29782c) r0
            if (r0 == 0) goto L_0x005f
            java.util.List r15 = r0.mo69956a()
            java.lang.Object r15 = ie1.C41358y.m120009Y(r15)
            xh0.b r15 = (xh0.C29781b) r15
            if (r15 == 0) goto L_0x005c
            java.lang.String r15 = r15.mo69947a()
            goto L_0x005d
        L_0x005c:
            r15 = r14
        L_0x005d:
            r8 = r15
            goto L_0x0060
        L_0x005f:
            r8 = r14
        L_0x0060:
            java.util.List r15 = r13.mo69939a()
            if (r15 == 0) goto L_0x00bd
            java.util.Iterator r15 = r15.iterator()
        L_0x006a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0084
            java.lang.Object r0 = r15.next()
            r1 = r0
            xh0.c r1 = (xh0.C29782c) r1
            xh0.d r1 = r1.mo69957b()
            xh0.d$c r9 = xh0.C29783d.C29786c.f75338c
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r9)
            if (r1 == 0) goto L_0x006a
            goto L_0x0085
        L_0x0084:
            r0 = r14
        L_0x0085:
            xh0.c r0 = (xh0.C29782c) r0
            if (r0 == 0) goto L_0x00bd
            java.util.List r15 = r0.mo69956a()
            if (r15 == 0) goto L_0x00bd
            jj0.a$a r0 = new jj0.a$a
            r0.<init>()
            java.util.List r15 = ie1.C41358y.m120030t0(r15, r0)
            if (r15 == 0) goto L_0x00bd
            java.util.ArrayList r14 = new java.util.ArrayList
            r0 = 10
            int r0 = ie1.C41343r.m119925u(r15, r0)
            r14.<init>(r0)
            java.util.Iterator r15 = r15.iterator()
        L_0x00a9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r15.next()
            xh0.b r0 = (xh0.C29781b) r0
            ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame r0 = r12.m80629d(r0)
            r14.add(r0)
            goto L_0x00a9
        L_0x00bd:
            r9 = r14
            java.lang.Boolean r10 = r13.mo69943e()
            hi0.a r14 = new hi0.a
            r1 = r14
            r11 = r13
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: jj0.C25459a.mo64028a(xh0.a, java.lang.String, java.math.BigDecimal):hi0.a");
    }

    /* renamed from: c */
    public final List mo64029c(List list, String str, BigDecimal bigDecimal) {
        C41536l.m120489i(list, "list");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo64028a((C29780a) it.next(), str, bigDecimal));
        }
        return arrayList;
    }
}
