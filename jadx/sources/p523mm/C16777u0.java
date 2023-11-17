package p523mm;

import c21.C31260a;
import ed0.C20217b;
import ed1.C40735b0;
import ed1.C40762x;
import g91.C32289b0;
import h31.C36149a;
import he1.C41224m;
import he1.C41233s;
import i31.C36345b;
import j51.C36734f;
import j51.C36735g;
import j70.C25339b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import m51.C37228a;
import m70.C26148a;
import m70.C26156i;
import md0.C26186e;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p537nm.C17070a0;
import p537nm.C17078d0;
import p537nm.C17090i0;
import p537nm.C17094k;
import p537nm.C17097n;
import p537nm.C17098o;
import p537nm.C17104u;
import p537nm.C17106w;
import p579qm.C17539c;
import p843nw.C26633o;
import p863pw.C27635m;
import p863pw.C27637o;
import p959yw.C30120b;
import p970zw.C30412a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43081r;
import ue1.C43086w;

/* renamed from: mm.u0 */
public final class C16777u0 {

    /* renamed from: a */
    private final C16795y f47022a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C36735g f47023b;

    /* renamed from: c */
    private final C16791w f47024c;

    /* renamed from: d */
    private final C16767q f47025d;

    /* renamed from: e */
    private final C16769r f47026e;

    /* renamed from: f */
    private final C16789v f47027f;

    /* renamed from: g */
    private final C16775u f47028g;

    /* renamed from: h */
    private final C25339b f47029h;

    /* renamed from: i */
    private final C30120b f47030i;

    /* renamed from: j */
    private final C16793x f47031j;

    /* renamed from: k */
    private final C20217b f47032k;

    /* renamed from: l */
    private final C16742g f47033l;

    /* renamed from: m */
    private final C16765p f47034m;

    /* renamed from: n */
    private final C16771s f47035n;

    /* renamed from: o */
    private final C26633o f47036o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C36734f f47037p;

    /* renamed from: q */
    private final C16734c1 f47038q;

    /* renamed from: mm.u0$a */
    private static final class C16778a {

        /* renamed from: a */
        private final C17090i0 f47039a;

        public C16778a(C17090i0 i0Var) {
            this.f47039a = i0Var;
        }

        /* renamed from: a */
        public final C17090i0 mo43891a() {
            return this.f47039a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C16778a) && C41536l.m120484d(this.f47039a, ((C16778a) obj).f47039a);
        }

        public int hashCode() {
            C17090i0 i0Var = this.f47039a;
            if (i0Var == null) {
                return 0;
            }
            return i0Var.hashCode();
        }

        public String toString() {
            C17090i0 i0Var = this.f47039a;
            return "ScoolCardInfoWrapper(info=" + i0Var + ")";
        }
    }

    /* renamed from: mm.u0$b */
    private static final class C16779b {

        /* renamed from: a */
        private final List f47040a;

        /* renamed from: b */
        private final List f47041b;

        public C16779b(List list, List list2) {
            C41536l.m120489i(list, "cities");
            C41536l.m120489i(list2, "csDefaultDepartments");
            this.f47040a = list;
            this.f47041b = list2;
        }

        /* renamed from: a */
        public final List mo43895a() {
            return this.f47040a;
        }

        /* renamed from: b */
        public final List mo43896b() {
            return this.f47041b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C16779b)) {
                return false;
            }
            C16779b bVar = (C16779b) obj;
            return C41536l.m120484d(this.f47040a, bVar.f47040a) && C41536l.m120484d(this.f47041b, bVar.f47041b);
        }

        public int hashCode() {
            return (this.f47040a.hashCode() * 31) + this.f47041b.hashCode();
        }

        public String toString() {
            List list = this.f47040a;
            List list2 = this.f47041b;
            return "ServiceCenterInfo(cities=" + list + ", csDefaultDepartments=" + list2 + ")";
        }
    }

    /* renamed from: mm.u0$c */
    static final class C16780c extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C16780c f47042d = new C16780c();

        C16780c() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C26156i iVar, C27637o oVar) {
            C41536l.m120489i(iVar, "acc");
            C41536l.m120489i(oVar, "selAcc");
            return C41233s.m119492a(iVar, oVar);
        }
    }

    /* renamed from: mm.u0$d */
    static final class C16781d extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C16781d f47043d = new C16781d();

        C16781d() {
            super(2);
        }

        /* renamed from: a */
        public final C41224m invoke(C36345b bVar, C16778a aVar) {
            C41536l.m120489i(bVar, "insurance");
            C41536l.m120489i(aVar, "scool");
            return C41233s.m119492a(bVar, aVar);
        }
    }

    /* renamed from: mm.u0$e */
    static final class C16782e extends C41537m implements C43086w {

        /* renamed from: d */
        final /* synthetic */ boolean f47044d;

        /* renamed from: e */
        final /* synthetic */ C16777u0 f47045e;

        /* renamed from: f */
        final /* synthetic */ C17097n f47046f;

        /* renamed from: g */
        final /* synthetic */ boolean f47047g;

        /* renamed from: h */
        final /* synthetic */ List f47048h;

        /* renamed from: i */
        final /* synthetic */ Long f47049i;

        /* renamed from: j */
        final /* synthetic */ Long f47050j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16782e(boolean z, C16777u0 u0Var, C17097n nVar, boolean z2, List list, Long l, Long l2) {
            super(9);
            this.f47044d = z;
            this.f47045e = u0Var;
            this.f47046f = nVar;
            this.f47047g = z2;
            this.f47048h = list;
            this.f47049i = l;
            this.f47050j = l2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:75:0x0224, code lost:
            if (r4 == null) goto L_0x0229;
         */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x011e A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final p579qm.C17539c mo43902N0(java.util.List r27, java.util.List r28, java.util.List r29, java.util.List r30, p523mm.C16777u0.C16779b r31, p537nm.C17104u r32, he1.C41224m r33, java.util.List r34, he1.C41224m r35) {
            /*
                r26 = this;
                r0 = r26
                r3 = r28
                java.lang.String r1 = "regTypes"
                r2 = r27
                kotlin.jvm.internal.C41536l.m120489i(r2, r1)
                java.lang.String r1 = "cardAccounts"
                kotlin.jvm.internal.C41536l.m120489i(r3, r1)
                java.lang.String r1 = "currencies"
                r5 = r29
                kotlin.jvm.internal.C41536l.m120489i(r5, r1)
                java.lang.String r1 = "deliveryTypes"
                r4 = r30
                kotlin.jvm.internal.C41536l.m120489i(r4, r1)
                java.lang.String r1 = "serviceCenters"
                r6 = r31
                kotlin.jvm.internal.C41536l.m120489i(r6, r1)
                java.lang.String r1 = "nickname"
                r7 = r32
                kotlin.jvm.internal.C41536l.m120489i(r7, r1)
                java.lang.String r1 = "<name for destructuring parameter 6>"
                r8 = r33
                kotlin.jvm.internal.C41536l.m120489i(r8, r1)
                java.lang.String r1 = "debitCardTypes"
                r9 = r34
                kotlin.jvm.internal.C41536l.m120489i(r9, r1)
                java.lang.String r1 = "<name for destructuring parameter 8>"
                r10 = r35
                kotlin.jvm.internal.C41536l.m120489i(r10, r1)
                java.lang.Object r1 = r33.mo95675a()
                m70.i r1 = (m70.C26156i) r1
                java.lang.Object r8 = r33.mo95676b()
                pw.o r8 = (p863pw.C27637o) r8
                java.lang.Object r11 = r35.mo95675a()
                r15 = r11
                i31.b r15 = (i31.C36345b) r15
                java.lang.Object r10 = r35.mo95676b()
                mm.u0$a r10 = (p523mm.C16777u0.C16778a) r10
                java.util.ArrayList r11 = new java.util.ArrayList
                r12 = 10
                int r13 = ie1.C41343r.m119925u(r3, r12)
                r11.<init>(r13)
                java.util.Iterator r13 = r28.iterator()
            L_0x0069:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x0081
                java.lang.Object r14 = r13.next()
                nm.o r14 = (p537nm.C17098o) r14
                long r16 = r14.mo44451a()
                java.lang.Long r14 = java.lang.Long.valueOf(r16)
                r11.add(r14)
                goto L_0x0069
            L_0x0081:
                m70.h r13 = r1.mo65188a()
                java.util.List r13 = r13.mo65182a()
                boolean r14 = r0.f47047g
                java.util.List r12 = r0.f47048h
                r35 = r11
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                java.util.Iterator r13 = r13.iterator()
            L_0x0098:
                boolean r16 = r13.hasNext()
                r17 = 1
                r18 = 0
                if (r16 == 0) goto L_0x00c7
                java.lang.Object r2 = r13.next()
                r16 = r2
                m70.a r16 = (m70.C26148a) r16
                if (r14 == 0) goto L_0x00bb
                long r19 = r16.mo65099l()
                java.lang.Long r4 = java.lang.Long.valueOf(r19)
                boolean r4 = r12.contains(r4)
                if (r4 == 0) goto L_0x00bb
                goto L_0x00bd
            L_0x00bb:
                r17 = r18
            L_0x00bd:
                if (r17 == 0) goto L_0x00c2
                r11.add(r2)
            L_0x00c2:
                r2 = r27
                r4 = r30
                goto L_0x0098
            L_0x00c7:
                m70.h r2 = r1.mo65188a()
                java.util.List r2 = r2.mo65182a()
                boolean r4 = r0.f47047g
                java.util.List r12 = r0.f47048h
                java.lang.Long r13 = r0.f47049i
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00de:
                boolean r16 = r2.hasNext()
                if (r16 == 0) goto L_0x0125
                java.lang.Object r5 = r2.next()
                r16 = r5
                m70.a r16 = (m70.C26148a) r16
                r19 = r2
                if (r4 == 0) goto L_0x00f2
                r2 = r12
                goto L_0x00f4
            L_0x00f2:
                r2 = r35
            L_0x00f4:
                long r20 = r16.mo65087b()
                r22 = r4
                java.lang.Long r4 = java.lang.Long.valueOf(r20)
                boolean r2 = r2.contains(r4)
                if (r2 != 0) goto L_0x0117
                long r20 = r16.mo65087b()
                if (r13 != 0) goto L_0x010b
                goto L_0x0114
            L_0x010b:
                long r23 = r13.longValue()
                int r2 = (r20 > r23 ? 1 : (r20 == r23 ? 0 : -1))
                if (r2 != 0) goto L_0x0114
                goto L_0x0117
            L_0x0114:
                r2 = r18
                goto L_0x0119
            L_0x0117:
                r2 = r17
            L_0x0119:
                if (r2 == 0) goto L_0x011e
                r14.add(r5)
            L_0x011e:
                r5 = r29
                r2 = r19
                r4 = r22
                goto L_0x00de
            L_0x0125:
                boolean r2 = r14.isEmpty()
                if (r2 == 0) goto L_0x015a
                boolean r2 = r11.isEmpty()
                if (r2 == 0) goto L_0x015a
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r4 = r27.iterator()
            L_0x013a:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x018d
                java.lang.Object r5 = r4.next()
                r12 = r5
                nm.y r12 = (p537nm.C17108y) r12
                nm.g0 r12 = r12.mo44517b()
                nm.g0 r13 = p537nm.C17085g0.NEW_ACCOUNT
                if (r12 != r13) goto L_0x0152
                r12 = r17
                goto L_0x0154
            L_0x0152:
                r12 = r18
            L_0x0154:
                if (r12 == 0) goto L_0x013a
                r2.add(r5)
                goto L_0x013a
            L_0x015a:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r4 = r27.iterator()
            L_0x0163:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L_0x018d
                java.lang.Object r5 = r4.next()
                r12 = r5
                nm.y r12 = (p537nm.C17108y) r12
                r13 = 2
                nm.g0[] r13 = new p537nm.C17085g0[r13]
                nm.g0 r16 = p537nm.C17085g0.NEW_ACCOUNT
                r13[r18] = r16
                nm.g0 r16 = p537nm.C17085g0.EXISTING_ACCOUNT
                r13[r17] = r16
                java.util.List r13 = ie1.C41341q.m119910m(r13)
                nm.g0 r12 = r12.mo44517b()
                boolean r12 = r13.contains(r12)
                if (r12 == 0) goto L_0x0163
                r2.add(r5)
                goto L_0x0163
            L_0x018d:
                boolean r4 = r0.f47044d
                if (r4 == 0) goto L_0x01c8
                java.lang.Long r4 = r0.f47050j
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.Iterator r12 = r30.iterator()
            L_0x019c:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x01c6
                java.lang.Object r13 = r12.next()
                r16 = r13
                nm.x r16 = (p537nm.C17107x) r16
                r19 = r4
                if (r4 == 0) goto L_0x01ba
                nm.e0 r4 = r16.mo44509a()
                nm.e0 r6 = p537nm.C17081e0.SMS
                if (r4 != r6) goto L_0x01b7
                goto L_0x01ba
            L_0x01b7:
                r4 = r18
                goto L_0x01bc
            L_0x01ba:
                r4 = r17
            L_0x01bc:
                if (r4 == 0) goto L_0x01c1
                r5.add(r13)
            L_0x01c1:
                r6 = r31
                r4 = r19
                goto L_0x019c
            L_0x01c6:
                r6 = r5
                goto L_0x01ca
            L_0x01c8:
                r6 = r30
            L_0x01ca:
                java.util.List r12 = r31.mo43895a()
                java.util.List r13 = ie1.C41341q.m119907j()
                java.util.List r16 = ie1.C41341q.m119907j()
                java.util.List r17 = ie1.C41341q.m119907j()
                java.util.List r18 = ie1.C41341q.m119907j()
                java.util.List r19 = r31.mo43896b()
                mm.u0 r4 = r0.f47045e
                j51.f r4 = r4.f47037p
                java.util.List r4 = r4.mo89561a()
                java.util.ArrayList r5 = new java.util.ArrayList
                r7 = 10
                int r7 = ie1.C41343r.m119925u(r4, r7)
                r5.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
            L_0x01fb:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x020f
                java.lang.Object r7 = r4.next()
                k51.b r7 = (k51.C36874b) r7
                java.lang.String r7 = r7.mo89806a()
                r5.add(r7)
                goto L_0x01fb
            L_0x020f:
                java.lang.String r4 = "insuranceInfo"
                kotlin.jvm.internal.C41536l.m120488h(r15, r4)
                nm.i0 r4 = r10.mo43891a()
                if (r4 == 0) goto L_0x0227
                mm.u0 r7 = r0.f47045e
                r27 = r5
                nm.n r5 = r0.f47046f
                nm.n r4 = r7.m59230q(r4, r5)
                if (r4 != 0) goto L_0x022b
                goto L_0x0229
            L_0x0227:
                r27 = r5
            L_0x0229:
                nm.n r4 = r0.f47046f
            L_0x022b:
                r21 = r4
                boolean r4 = r0.f47047g
                java.lang.String r5 = "cardsAndDetails"
                if (r4 == 0) goto L_0x0245
                mm.u0 r4 = r0.f47045e
                m70.h r1 = r1.mo65188a()
                java.util.List r1 = r1.mo65182a()
                kotlin.jvm.internal.C41536l.m120488h(r8, r5)
                java.util.List r1 = r4.m59209B(r11, r1, r8)
                goto L_0x0256
            L_0x0245:
                mm.u0 r4 = r0.f47045e
                m70.h r1 = r1.mo65188a()
                java.util.List r1 = r1.mo65182a()
                kotlin.jvm.internal.C41536l.m120488h(r8, r5)
                java.util.List r1 = r4.m59208A(r3, r1, r8)
            L_0x0256:
                r22 = r1
                nm.i0 r20 = r10.mo43891a()
                qm.c r23 = new qm.c
                r1 = r23
                r3 = r28
                r4 = r14
                r24 = r27
                r5 = r29
                r7 = r32
                r8 = r12
                r9 = r34
                r10 = r13
                r25 = r11
                r11 = r16
                r12 = r17
                r13 = r18
                r14 = r19
                r17 = r15
                r15 = r24
                r16 = r25
                r18 = r21
                r19 = r22
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return r23
            */
            throw new UnsupportedOperationException("Method not decompiled: p523mm.C16777u0.C16782e.mo43902N0(java.util.List, java.util.List, java.util.List, java.util.List, mm.u0$b, nm.u, he1.m, java.util.List, he1.m):qm.c");
        }
    }

    /* renamed from: mm.u0$f */
    static final class C16783f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16777u0 f47051d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16783f(C16777u0 u0Var) {
            super(1);
            this.f47051d = u0Var;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C17539c cVar) {
            C41536l.m120489i(cVar, "resources");
            return this.f47051d.m59236w(cVar);
        }
    }

    /* renamed from: mm.u0$g */
    static final class C16784g extends C41537m implements C43081r {

        /* renamed from: d */
        final /* synthetic */ C17539c f47052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16784g(C17539c cVar) {
            super(4);
            this.f47052d = cVar;
        }

        /* renamed from: a */
        public final C17539c invoke(List list, List list2, List list3, List list4) {
            C41536l.m120489i(list, "orderTypes");
            C41536l.m120489i(list2, "deliveryTypes");
            C41536l.m120489i(list3, "recipientTypes");
            C41536l.m120489i(list4, "addresses");
            return C17539c.m61073b(this.f47052d, (List) null, (List) null, (List) null, (List) null, (List) null, (C17104u) null, (List) null, (List) null, list, list2, list3, list4, (List) null, (List) null, (List) null, (C36345b) null, (C17097n) null, (List) null, (C17090i0) null, 520447, (Object) null);
        }
    }

    /* renamed from: mm.u0$h */
    /* synthetic */ class C16785h extends C41535k implements C43075l {

        /* renamed from: d */
        public static final C16785h f47053d = new C16785h();

        C16785h() {
            super(1, C16778a.class, "<init>", "<init>(Lge/bog/mobilebank/cardapplications/domain/model/ScoolCardInfo;)V", 0);
        }

        /* renamed from: b */
        public final C16778a invoke(C17090i0 i0Var) {
            return new C16778a(i0Var);
        }
    }

    /* renamed from: mm.u0$i */
    static final class C16786i extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C16786i f47054d = new C16786i();

        C16786i() {
            super(2);
        }

        /* renamed from: a */
        public final C16779b invoke(C30412a aVar, List list) {
            C41536l.m120489i(aVar, "serviceCenterRoot");
            C41536l.m120489i(list, "defaultDepartments");
            List i = aVar.mo70769i();
            if (i == null) {
                i = C41341q.m119907j();
            }
            return new C16779b(i, list);
        }
    }

    /* renamed from: mm.u0$j */
    static final class C16787j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f47055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16787j(String str) {
            super(1);
            this.f47055d = str;
        }

        /* renamed from: a */
        public final C17097n invoke(List list) {
            Object obj;
            C41536l.m120489i(list, "it");
            String str = this.f47055d;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(str, ((C17097n) obj).mo44417J())) {
                    break;
                }
            }
            return (C17097n) obj;
        }
    }

    /* renamed from: mm.u0$k */
    static final class C16788k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C16777u0 f47056d;

        /* renamed from: e */
        final /* synthetic */ boolean f47057e;

        /* renamed from: f */
        final /* synthetic */ boolean f47058f;

        /* renamed from: g */
        final /* synthetic */ String f47059g;

        /* renamed from: h */
        final /* synthetic */ Long f47060h;

        /* renamed from: i */
        final /* synthetic */ Long f47061i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C16788k(C16777u0 u0Var, boolean z, boolean z2, String str, Long l, Long l2) {
            super(1);
            this.f47056d = u0Var;
            this.f47057e = z;
            this.f47058f = z2;
            this.f47059g = str;
            this.f47060h = l;
            this.f47061i = l2;
        }

        /* renamed from: a */
        public final C40735b0 invoke(C17097n nVar) {
            Long l;
            C41536l.m120489i(nVar, "card");
            C16777u0 u0Var = this.f47056d;
            boolean z = this.f47057e;
            boolean z2 = this.f47058f;
            String str = this.f47059g;
            Long l2 = this.f47060h;
            Long l3 = this.f47061i;
            long A = nVar.mo44408A();
            String F = nVar.mo44413F();
            String D = nVar.mo44411D();
            List<C17106w> p = nVar.mo44439p();
            ArrayList arrayList = new ArrayList();
            for (C17106w a : p) {
                Long a2 = a.mo44501a();
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            C37228a a3 = u0Var.f47023b.mo89562a();
            if (a3 != null) {
                l = Long.valueOf(a3.mo90305b());
            } else {
                l = null;
            }
            return u0Var.m59231r(A, F, D, z, z2, arrayList, String.valueOf(l), str, nVar, l2, l3);
        }
    }

    public C16777u0(C16795y yVar, C36735g gVar, C16791w wVar, C16767q qVar, C16769r rVar, C16789v vVar, C16775u uVar, C25339b bVar, C30120b bVar2, C16793x xVar, C20217b bVar3, C16742g gVar2, C16765p pVar, C16771s sVar, C26633o oVar, C36734f fVar, C16734c1 c1Var) {
        C16795y yVar2 = yVar;
        C36735g gVar3 = gVar;
        C16791w wVar2 = wVar;
        C16767q qVar2 = qVar;
        C16769r rVar2 = rVar;
        C16789v vVar2 = vVar;
        C16775u uVar2 = uVar;
        C25339b bVar4 = bVar;
        C30120b bVar5 = bVar2;
        C16793x xVar2 = xVar;
        C20217b bVar6 = bVar3;
        C16742g gVar4 = gVar2;
        C16765p pVar2 = pVar;
        C16771s sVar2 = sVar;
        C36734f fVar2 = fVar;
        C41536l.m120489i(yVar2, "getDebitCards");
        C41536l.m120489i(gVar3, "getLoginInfo");
        C41536l.m120489i(wVar2, "getDebitCardRegTypes");
        C41536l.m120489i(qVar2, "getDebitCardAccounts");
        C41536l.m120489i(rVar2, "getDebitCardCurrencies");
        C41536l.m120489i(vVar2, "getDebitCardPinDeliveryTypes");
        C41536l.m120489i(uVar2, "getDebitCardNickname");
        C41536l.m120489i(bVar4, "getAccounts");
        C41536l.m120489i(bVar5, "getServiceCenters");
        C41536l.m120489i(xVar2, "getDebitCardTypes");
        C41536l.m120489i(bVar6, "getLookupData");
        C41536l.m120489i(gVar4, "getCardDeliveryAddresses");
        C41536l.m120489i(pVar2, "getCsDefaultDepartments");
        C41536l.m120489i(sVar2, "getDebitCardInsuranceTypeInfo");
        C41536l.m120489i(oVar, "getCardsAndDetails");
        C41536l.m120489i(fVar, "getClientPhones");
        C41536l.m120489i(c1Var, "validateAndGetChildSchoolCard");
        this.f47022a = yVar2;
        this.f47023b = gVar3;
        this.f47024c = wVar2;
        this.f47025d = qVar2;
        this.f47026e = rVar2;
        this.f47027f = vVar2;
        this.f47028g = uVar2;
        this.f47029h = bVar4;
        this.f47030i = bVar5;
        this.f47031j = xVar2;
        this.f47032k = bVar6;
        this.f47033l = gVar4;
        this.f47034m = pVar2;
        this.f47035n = sVar2;
        this.f47036o = oVar;
        this.f47037p = fVar;
        this.f47038q = c1Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final List m59208A(List list, List list2, C27637o oVar) {
        C27635m mVar;
        Object obj;
        String str;
        boolean z;
        boolean z2;
        CardExternalFile s;
        CardExternalFile s2;
        String fileUrl;
        boolean z3;
        boolean z4;
        ArrayList<C17098o> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z5 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C17098o oVar2 = (C17098o) next;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C26148a aVar = (C26148a) it2.next();
                    if (aVar.mo65087b() == oVar2.mo44451a() && aVar.mo65087b() == aVar.mo65099l()) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
            z5 = false;
            if (z5) {
                arrayList.add(next);
            }
        }
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C17098o oVar3 : arrayList) {
            List list4 = (List) oVar.mo67167a().get(Long.valueOf(oVar3.mo44451a()));
            String str2 = null;
            if (list4 != null) {
                mVar = (C27635m) C41358y.m120009Y(list4);
            } else {
                mVar = null;
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((C26148a) obj).mo65087b() == oVar3.mo44451a()) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            C26148a aVar2 = (C26148a) obj;
            if (mVar != null) {
                str = mVar.mo67105E();
            } else {
                str = null;
            }
            ProductProperties.CardBackgroundInfoContainer cardBackgroundInfo = ProductProperties.getCardBackgroundInfo(str);
            long a = oVar3.mo44451a();
            String b = oVar3.mo44452b();
            double parseDouble = Double.parseDouble(oVar3.mo44454d());
            String g = oVar3.mo44458g();
            int i = cardBackgroundInfo.resId;
            if (!(mVar == null || (s2 = mVar.mo67135s()) == null || (fileUrl = s2.getFileUrl()) == null)) {
                str2 = C32289b0.m95091c(fileUrl);
            }
            String str3 = str2;
            String c = oVar3.mo44453c();
            boolean z6 = cardBackgroundInfo.isLightText;
            if (mVar == null || (s = mVar.mo67135s()) == null || !s.isDark()) {
                z = false;
            } else {
                z = true;
            }
            boolean z7 = !z;
            if (aVar2 == null || !aVar2.mo65084F()) {
                z2 = false;
            } else {
                z2 = true;
            }
            arrayList2.add(new C31260a(a, b, parseDouble, g, i, str3, c, z6, z7, z2));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final List m59209B(List list, List list2, C27637o oVar) {
        C27635m mVar;
        Object obj;
        String str;
        boolean z;
        boolean z2;
        CardExternalFile s;
        CardExternalFile s2;
        String fileUrl;
        boolean z3;
        boolean z4;
        ArrayList<C26148a> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (true) {
            boolean z5 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C26148a aVar = (C26148a) next;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C26148a aVar2 = (C26148a) it2.next();
                    if (aVar2.mo65087b() == aVar.mo65087b() && aVar2.mo65087b() == aVar2.mo65099l()) {
                        z4 = true;
                        continue;
                    } else {
                        z4 = false;
                        continue;
                    }
                    if (z4) {
                        break;
                    }
                }
            }
            z5 = false;
            if (z5) {
                arrayList.add(next);
            }
        }
        List list3 = list2;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C26148a aVar3 : arrayList) {
            List list4 = (List) oVar.mo67167a().get(Long.valueOf(aVar3.mo65087b()));
            String str2 = null;
            if (list4 != null) {
                mVar = (C27635m) C41358y.m120009Y(list4);
            } else {
                mVar = null;
            }
            Iterator it3 = list2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((C26148a) obj).mo65087b() == aVar3.mo65087b()) {
                    z3 = true;
                    continue;
                } else {
                    z3 = false;
                    continue;
                }
                if (z3) {
                    break;
                }
            }
            C26148a aVar4 = (C26148a) obj;
            if (mVar != null) {
                str = mVar.mo67105E();
            } else {
                str = null;
            }
            ProductProperties.CardBackgroundInfoContainer cardBackgroundInfo = ProductProperties.getCardBackgroundInfo(str);
            long b = aVar3.mo65087b();
            String c = aVar3.mo65088c();
            if (c == null) {
                c = aVar3.mo65111w();
            }
            String str3 = c;
            double doubleValue = aVar3.mo65093g().doubleValue();
            String h = aVar3.mo65094h();
            int i = cardBackgroundInfo.resId;
            if (!(mVar == null || (s2 = mVar.mo67135s()) == null || (fileUrl = s2.getFileUrl()) == null)) {
                str2 = C32289b0.m95091c(fileUrl);
            }
            String str4 = str2;
            String w = aVar3.mo65111w();
            boolean z6 = cardBackgroundInfo.isLightText;
            if (mVar == null || (s = mVar.mo67135s()) == null || !s.isDark()) {
                z = false;
            } else {
                z = true;
            }
            boolean z7 = !z;
            if (aVar4 == null || !aVar4.mo65084F()) {
                z2 = false;
            } else {
                z2 = true;
            }
            arrayList2.add(new C31260a(b, str3, doubleValue, h, i, str4, w, z6, z7, z2));
        }
        return arrayList2;
    }

    /* renamed from: C */
    private final C40762x m59210C() {
        C40762x T = C40762x.m118154T(C30120b.m91112c(this.f47030i, (String) null, 1, (Object) null), this.f47034m.mo43883b(), new C16774t0(C16786i.f47054d));
        C41536l.m120488h(T, "zip(\n            getServ…ultDepartments)\n        }");
        return T;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public static final C16779b m59211D(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C16779b) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final C17097n m59212F(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C17097n) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final C40735b0 m59213G(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public final C17097n m59230q(C17090i0 i0Var, C17097n nVar) {
        return C17097n.m60092b(nVar, i0Var.mo44369e(), i0Var.mo44371f(), i0Var.mo44376j(), (String) null, (String) null, (String) null, i0Var.mo44372g(), i0Var.mo44368d(), (String) null, i0Var.mo44375i(), (String) null, false, i0Var.mo44365a(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (C17070a0) null, (List) null, i0Var.mo44367c(), (List) null, i0Var.mo44366b(), false, (List) null, (String) null, (C17094k) null, (C17078d0) null, (String) null, (String) null, false, (String) null, (List) null, (List) null, -167776968, C11051p3.f31760d, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public final C40762x m59231r(long j, String str, String str2, boolean z, boolean z2, List list, String str3, String str4, C17097n nVar, Long l, Long l2) {
        String str5;
        String str6 = str;
        String str7 = str2;
        Long l3 = l;
        C40762x a = this.f47024c.mo43912a();
        C40762x a2 = this.f47025d.mo43885a(str6, str7, z);
        C40762x a3 = this.f47026e.mo43886a(j);
        C40762x a4 = this.f47027f.mo43910a(str7, str6);
        C40762x C = m59210C();
        C40762x c = this.f47028g.mo43888c();
        C40762x T = C40762x.m118154T(C26186e.m81990h(this.f47029h.mo63908a(false)), this.f47036o.mo65886c(false).mo94996P(), new C16762n0(C16780c.f47042d));
        C40762x a5 = this.f47031j.mo43914a();
        C16771s sVar = this.f47035n;
        if (l3 != null) {
            str5 = l.toString();
        } else {
            str5 = null;
        }
        C40762x r = C40762x.m118150P(a, a2, a3, a4, C, c, T, a5, C40762x.m118154T(C36149a.C36150a.m107539a(sVar, str3, str2, str, str4, (String) null, str5, 16, (Object) null), m59238y(l3), new C16764o0(C16781d.f47043d)), new C16766p0(new C16782e(z2, this, nVar, z, list, l2, l))).mo95087r(new C16768q0(new C16783f(this)));
        C41536l.m120488h(r, "private fun getDebitCard…esources)\n        }\n    }");
        return r;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final C41224m m59232s(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final C41224m m59233t(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C41224m) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final C17539c m59234u(C43086w wVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        C41536l.m120489i(wVar, "$tmp0");
        return (C17539c) wVar.mo43902N0(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final C40735b0 m59235v(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40735b0) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final C40762x m59236w(C17539c cVar) {
        C40762x R = C40762x.m118152R(this.f47032k.mo48650b("CARD_APPLICATIONS_ORDER_TYPE"), this.f47032k.mo48650b("CARD_APPLICATIONS_DELIVERY_TYPE"), this.f47032k.mo48650b("CARD_APPLICATIONS_RECIPIENT_TYPE"), this.f47033l.mo43870a(), new C16772s0(new C16784g(cVar)));
        C41536l.m120488h(R, "resources: OrderDebitCar…,\n            )\n        }");
        return R;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final C17539c m59237x(C43081r rVar, Object obj, Object obj2, Object obj3, Object obj4) {
        C41536l.m120489i(rVar, "$tmp0");
        return (C17539c) rVar.invoke(obj, obj2, obj3, obj4);
    }

    /* renamed from: y */
    private final C40762x m59238y(Long l) {
        C40762x xVar;
        Long l2;
        if (l != null) {
            l.longValue();
            C16734c1 c1Var = this.f47038q;
            C37228a a = this.f47023b.mo89562a();
            if (a != null) {
                l2 = Long.valueOf(a.mo90305b());
            } else {
                l2 = null;
            }
            xVar = c1Var.mo43863a(String.valueOf(l2), l.longValue()).mo95062A(new C16770r0(C16785h.f47053d));
        } else {
            xVar = null;
        }
        if (xVar != null) {
            return xVar;
        }
        C40762x z = C40762x.m118162z(new C16778a((C17090i0) null));
        C41536l.m120488h(z, "just(ScoolCardInfoWrapper(null))");
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final C16778a m59239z(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C16778a) lVar.invoke(obj);
    }

    /* renamed from: E */
    public final C40762x mo43890E(String str, List list, boolean z, Long l, Long l2, boolean z2, boolean z3) {
        String str2 = str;
        C41536l.m120489i(str2, "subProductCode");
        C40762x r = C16795y.m59259b(this.f47022a, list, z, (Long) null, (Long) null, (Boolean) null, (Boolean) null, z2, 60, (Object) null).mo95062A(new C16757l0(new C16787j(str2))).mo95087r(new C16760m0(new C16788k(this, z, z3, str2, l, l2)));
        C41536l.m120488h(r, "operator fun invoke(\n   …          }\n            }");
        return r;
    }
}
