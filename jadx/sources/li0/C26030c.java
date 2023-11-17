package li0;

import android.graphics.drawable.Drawable;
import b41.C31128a;
import g91.C32319m;
import g91.C32343x;
import hj0.C25034b;
import ij0.C25218a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import li0.C26035g;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame;
import p341ge.bog.mobilebank.model.payment.PaymentServiceConfig;
import pi0.C27534a;
import xh0.C29781b;
import xh0.C29789f;
import xh0.C29794k;

/* renamed from: li0.c */
public final class C26030c {

    /* renamed from: a */
    private final C25034b f66105a;

    /* renamed from: li0.c$a */
    public static final class C26031a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C29781b) obj).mo69953f(), ((C29781b) obj2).mo69953f());
        }
    }

    public C26030c(C25034b bVar) {
        C41536l.m120489i(bVar, "provideDictValue");
        this.f66105a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d7 A[LOOP:3: B:48:0x00d1->B:50:0x00d7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f2 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00ae A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final pi0.C27534a.C27539e m81653a(java.util.List r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r2 = ie1.C41343r.m119925u(r13, r1)
            r0.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L_0x000f:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x00fe
            java.lang.Object r2 = r13.next()
            xh0.f r2 = (xh0.C29789f) r2
            java.math.BigDecimal r3 = r2.mo69966a()
            r4 = 0
            if (r3 == 0) goto L_0x002a
            java.lang.String r5 = "GEL"
            java.lang.String r3 = g91.C32343x.m95408P(r3, r5)
            r6 = r3
            goto L_0x002b
        L_0x002a:
            r6 = r4
        L_0x002b:
            xh0.a r3 = r2.mo69969d()
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = r3.mo69941c()
            goto L_0x0037
        L_0x0036:
            r3 = r4
        L_0x0037:
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = ""
        L_0x003b:
            r7 = r3
            java.lang.String r8 = r2.mo69978k()
            xh0.a r3 = r2.mo69969d()
            if (r3 == 0) goto L_0x0083
            java.util.List r3 = r3.mo69939a()
            if (r3 == 0) goto L_0x0083
            java.util.Iterator r3 = r3.iterator()
        L_0x0050:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x006a
            java.lang.Object r5 = r3.next()
            r9 = r5
            xh0.c r9 = (xh0.C29782c) r9
            xh0.d r9 = r9.mo69957b()
            xh0.d$a r10 = xh0.C29783d.C29784a.f75337c
            boolean r9 = kotlin.jvm.internal.C41536l.m120484d(r9, r10)
            if (r9 == 0) goto L_0x0050
            goto L_0x006b
        L_0x006a:
            r5 = r4
        L_0x006b:
            xh0.c r5 = (xh0.C29782c) r5
            if (r5 == 0) goto L_0x0083
            java.util.List r3 = r5.mo69956a()
            java.lang.Object r3 = ie1.C41358y.m120009Y(r3)
            xh0.b r3 = (xh0.C29781b) r3
            if (r3 == 0) goto L_0x0080
            java.lang.String r3 = r3.mo69947a()
            goto L_0x0081
        L_0x0080:
            r3 = r4
        L_0x0081:
            r9 = r3
            goto L_0x0084
        L_0x0083:
            r9 = r4
        L_0x0084:
            xh0.a r3 = r2.mo69969d()
            if (r3 == 0) goto L_0x00e7
            java.util.List r3 = r3.mo69939a()
            if (r3 == 0) goto L_0x00e7
            java.util.Iterator r3 = r3.iterator()
        L_0x0094:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r3.next()
            r10 = r5
            xh0.c r10 = (xh0.C29782c) r10
            xh0.d r10 = r10.mo69957b()
            xh0.d$c r11 = xh0.C29783d.C29786c.f75338c
            boolean r10 = kotlin.jvm.internal.C41536l.m120484d(r10, r11)
            if (r10 == 0) goto L_0x0094
            goto L_0x00af
        L_0x00ae:
            r5 = r4
        L_0x00af:
            xh0.c r5 = (xh0.C29782c) r5
            if (r5 == 0) goto L_0x00e7
            java.util.List r3 = r5.mo69956a()
            if (r3 == 0) goto L_0x00e7
            li0.c$a r5 = new li0.c$a
            r5.<init>()
            java.util.List r3 = ie1.C41358y.m120030t0(r3, r5)
            if (r3 == 0) goto L_0x00e7
            java.util.ArrayList r5 = new java.util.ArrayList
            int r10 = ie1.C41343r.m119925u(r3, r1)
            r5.<init>(r10)
            java.util.Iterator r3 = r3.iterator()
        L_0x00d1:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x00e5
            java.lang.Object r10 = r3.next()
            xh0.b r10 = (xh0.C29781b) r10
            ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame r10 = r12.m81658l(r10)
            r5.add(r10)
            goto L_0x00d1
        L_0x00e5:
            r10 = r5
            goto L_0x00e8
        L_0x00e7:
            r10 = r4
        L_0x00e8:
            xh0.a r2 = r2.mo69969d()
            if (r2 == 0) goto L_0x00f2
            java.lang.Boolean r4 = r2.mo69943e()
        L_0x00f2:
            r11 = r4
            pi0.a$e$a r2 = new pi0.a$e$a
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r2)
            goto L_0x000f
        L_0x00fe:
            pi0.a$e r13 = new pi0.a$e
            r13.<init>(r0, r14)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: li0.C26030c.m81653a(java.util.List, int):pi0.a$e");
    }

    /* renamed from: g */
    private final C26035g m81654g(List list, int i, C29789f fVar) {
        C29789f fVar2 = fVar;
        C27534a.C27539e a = m81653a(list, i);
        C27534a.C27544i iVar = r2;
        C27534a.C27544i iVar2 = new C27534a.C27544i(false, 1, (DefaultConstructorMarker) null);
        C27534a.C27546k d = mo64908d(fVar2);
        C27534a.C27543h hVar = r2;
        C27534a.C27543h hVar2 = new C27534a.C27543h(this.f66105a.mo63467a("giftcard.owner.banner.usage.terms"), this.f66105a.mo63467a("giftcard.owner.banner.see.more"));
        return new C26035g((C27534a.C27542g) null, (C27534a.C27549n) null, (C25218a) null, a, hVar, mo64906b(fVar2), iVar, d, mo64907c(fVar2), (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 15879, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    private final C26035g m81655h(List list, int i, C29789f fVar) {
        return C26035g.m81666d(m81654g(list, i, fVar), (C27534a.C27542g) null, (C27534a.C27549n) null, C25218a.f64784a, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16379, (Object) null);
    }

    /* renamed from: i */
    private final C26035g m81656i(List list, int i, C29789f fVar) {
        return C26035g.m81666d(m81654g(list, i, fVar), (C27534a.C27542g) null, C27534a.C27549n.f70455a, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, (C27534a.C27547l) null, (List) null, (C27534a.C27535a) null, (C27534a.C27538d) null, (C27534a.C27545j) null, 16381, (Object) null);
    }

    /* renamed from: j */
    private final C26035g m81657j(List list, int i, C29789f fVar, List list2) {
        C27534a.C27547l lVar;
        List list3;
        C27534a.C27538d dVar;
        C27534a.C27535a aVar;
        C26035g g = m81654g(list, i, fVar);
        if (!list2.isEmpty()) {
            lVar = mo64909e(fVar);
            list3 = list2;
        } else {
            list3 = list2;
            lVar = null;
        }
        List f = mo64910f(list3);
        if (!list2.isEmpty()) {
            dVar = new C27534a.C27538d(this.f66105a.mo63467a("giftcard.payment.list.transaction.not.found"));
        } else {
            dVar = null;
        }
        if (!list2.isEmpty()) {
            aVar = C27534a.C27535a.f70424a;
        } else {
            aVar = null;
        }
        return C26035g.m81666d(g, (C27534a.C27542g) null, (C27534a.C27549n) null, (C25218a) null, (C27534a.C27539e) null, (C27534a.C27543h) null, (C27534a.C27541f) null, (C27534a.C27544i) null, (C27534a.C27546k) null, (C27534a.C27536b) null, lVar, f, aVar, dVar, (C27534a.C27545j) null, 8703, (Object) null);
    }

    /* renamed from: l */
    private final GyroAnimationFrame m81658l(C29781b bVar) {
        String a = bVar.mo69947a();
        if (a == null) {
            a = "";
        }
        return new GyroAnimationFrame(new Image.Url(a, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), bVar.mo69950d(), bVar.mo69951e(), bVar.mo69948b(), bVar.mo69949c());
    }

    /* renamed from: b */
    public final C27534a.C27541f mo64906b(C29789f fVar) {
        C41536l.m120489i(fVar, "giftCard");
        String f = fVar.mo69972f();
        if (f == null) {
            f = "";
        }
        return new C27534a.C27541f(f);
    }

    /* renamed from: c */
    public final C27534a.C27536b mo64907c(C29789f fVar) {
        long j;
        String str;
        C41536l.m120489i(fVar, "giftCard");
        long e = fVar.mo69970e();
        String m = fVar.mo69980m();
        if (m == null) {
            m = "";
        }
        String str2 = m + " " + fVar.mo69981n();
        Long c = fVar.mo69968c();
        if (c != null) {
            j = c.longValue();
        } else {
            j = 0;
        }
        String b = C32319m.m95295b(j);
        String l = fVar.mo69979l();
        if (l == null) {
            str = "";
        } else {
            str = l;
        }
        return new C27534a.C27536b(e, str2, b, str, fVar.mo69977j(), false, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public final C27534a.C27546k mo64908d(C29789f fVar) {
        C41536l.m120489i(fVar, "giftCard");
        if (fVar.mo69976i()) {
            return new C27534a.C27546k(this.f66105a.mo63467a("giftcard.owner.giveaway.info"), this.f66105a.mo63467a("giftcard.owner.giveaway.button"));
        }
        return null;
    }

    /* renamed from: e */
    public final C27534a.C27547l mo64909e(C29789f fVar) {
        String str;
        C41536l.m120489i(fVar, "giftCard");
        BigDecimal o = fVar.mo69982o();
        String str2 = null;
        if (o != null) {
            str = C32343x.m95408P(o, "GEL");
        } else {
            str = null;
        }
        String str3 = "";
        if (str == null) {
            str = str3;
        }
        BigDecimal a = fVar.mo69966a();
        if (a != null) {
            str2 = C32343x.m95408P(a, "GEL");
        }
        if (str2 != null) {
            str3 = str2;
        }
        return new C27534a.C27547l(str, str3);
    }

    /* renamed from: f */
    public final List mo64910f(List list) {
        boolean z;
        C41536l.m120489i(list, "list");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : list) {
            Long valueOf = Long.valueOf(((C29794k) next).mo70017f());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(next);
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            long longValue = ((Number) entry.getKey()).longValue();
            List<C29794k> list2 = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(list2, 10));
            for (C29794k kVar : list2) {
                if (kVar.mo70013c() == C29794k.C29795a.PAYMENT) {
                    z = true;
                } else {
                    z = false;
                }
                BigDecimal d = kVar.mo70014d();
                String b = kVar.mo70012b();
                String a = kVar.mo70011a();
                arrayList2.add(new C26035g.C26036a(d, kVar.mo70015e(), b, z, a));
            }
            arrayList.add(new C26035g.C26037b(C32319m.m95295b(longValue), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: k */
    public final C26035g mo64911k(List list, int i, C29789f fVar, C31128a aVar) {
        C41536l.m120489i(list, PaymentServiceConfig.TYPE_GIFT_CARD);
        C41536l.m120489i(fVar, "giftCard");
        C41536l.m120489i(aVar, "result");
        if (aVar instanceof C31128a.C31129a) {
            return m81655h(list, i, fVar);
        }
        if (aVar instanceof C31128a.C31130b) {
            return m81656i(list, i, fVar);
        }
        if (aVar instanceof C31128a.C31131c) {
            return m81657j(list, i, fVar, (List) ((C31128a.C31131c) aVar).mo71340a());
        }
        throw new NoWhenBranchMatchedException();
    }
}
