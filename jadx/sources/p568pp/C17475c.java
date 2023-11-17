package p568pp;

import android.os.Bundle;
import g91.C32289b0;
import g91.C32343x;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p356ao.C10110b;
import p380ck.C10463g;
import p380ck.C10464h;
import p455ho.C15550d;
import p469io.C15709b;
import p568pp.C17472b;
import ue1.C43064a;

/* renamed from: pp.c */
public abstract class C17475c {

    /* renamed from: pp.c$a */
    public /* synthetic */ class C17476a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f48906a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                io.c[] r0 = p469io.C15710c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.c r1 = p469io.C15710c.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                io.c r1 = p469io.C15710c.PENDING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                io.c r1 = p469io.C15710c.RECOMMENDED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f48906a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p568pp.C17475c.C17476a.<clinit>():void");
        }
    }

    /* renamed from: pp.c$b */
    static final class C17477b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15709b f48907d;

        /* renamed from: e */
        final /* synthetic */ C43064a f48908e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17477b(C15709b bVar, C43064a aVar) {
            super(0);
            this.f48907d = bVar;
            this.f48908e = aVar;
        }

        public final void invoke() {
            C17475c.m60976f(this.f48907d.mo43083g(), "click_details_button", "packages_page_click_details");
            C43064a aVar = this.f48908e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: pp.c$c */
    static final class C17478c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15709b f48909d;

        /* renamed from: e */
        final /* synthetic */ C43064a f48910e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17478c(C15709b bVar, C43064a aVar) {
            super(0);
            this.f48909d = bVar;
            this.f48910e = aVar;
        }

        public final void invoke() {
            C17475c.m60976f(this.f48909d.mo43083g(), "click_activate_button", "packages_page_click_activate");
            C43064a aVar = this.f48910e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: pp.c$d */
    static final class C17479d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C15709b f48911d;

        /* renamed from: e */
        final /* synthetic */ C43064a f48912e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17479d(C15709b bVar, C43064a aVar) {
            super(0);
            this.f48911d = bVar;
            this.f48912e = aVar;
        }

        public final void invoke() {
            C17475c.m60976f(this.f48911d.mo43083g(), "click_see_more_button", "packages_page_click_see_more");
            C43064a aVar = this.f48912e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: b */
    private static final String m60972b(double d) {
        String Q = C32343x.m95410Q(d, "GEL", false, 2, (Object) null);
        String U0 = C40445z.m117190U0(Q, 5);
        String Z0 = C40445z.m117195Z0(Q, 2);
        return U0 + Z0;
    }

    /* renamed from: c */
    public static final Integer m60973c(C15709b bVar, boolean z, Integer num) {
        int i;
        C41536l.m120489i(bVar, "<this>");
        if (!z) {
            return null;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = C10110b.color_brand_solo_se_tr_100;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: d */
    public static /* synthetic */ Integer m60974d(C15709b bVar, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return m60973c(bVar, z, num);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p684yi.C18919a m60975e(p469io.C15709b r11) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            yi.a r0 = new yi.a
            java.lang.String r1 = r11.mo43083g()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r1
        L_0x0012:
            java.lang.Double r1 = r11.mo43089l()
            if (r1 == 0) goto L_0x0031
            double r4 = r1.doubleValue()
            java.lang.String r1 = r11.mo43090m()
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = "GEL"
        L_0x0024:
            r6 = r1
            r7 = 0
            r8 = 2
            r9 = 0
            java.lang.String r1 = g91.C32343x.m95410Q(r4, r6, r7, r8, r9)
            if (r1 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r4 = r1
            goto L_0x0032
        L_0x0031:
            r4 = r2
        L_0x0032:
            java.lang.Double r1 = r11.mo43089l()
            r5 = 0
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = "text.rb.packages.default.period"
            java.lang.Object[] r2 = new java.lang.Object[r5]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
            r6 = r1
            goto L_0x0044
        L_0x0043:
            r6 = r2
        L_0x0044:
            io.c r1 = r11.mo43094q()
            r2 = -1
            if (r1 != 0) goto L_0x004d
            r1 = r2
            goto L_0x0055
        L_0x004d:
            int[] r7 = p568pp.C17475c.C17476a.f48906a
            int r1 = r1.ordinal()
            r1 = r7[r1]
        L_0x0055:
            r7 = 0
            r8 = 3
            r9 = 2
            r10 = 1
            if (r1 == r10) goto L_0x0073
            if (r1 == r9) goto L_0x006a
            if (r1 == r8) goto L_0x0061
            r5 = r7
            goto L_0x007c
        L_0x0061:
            java.lang.String r1 = "text.packages.recomended.status.badge"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r5)
            goto L_0x007b
        L_0x006a:
            java.lang.String r1 = "text.packages.pending.status.badge"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r5)
            goto L_0x007b
        L_0x0073:
            java.lang.String r1 = "text.packages.activated.status.badge"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = g91.C32343x.m95388F(r1, r5)
        L_0x007b:
            r5 = r1
        L_0x007c:
            io.c r11 = r11.mo43094q()
            if (r11 != 0) goto L_0x0083
            goto L_0x008b
        L_0x0083:
            int[] r1 = p568pp.C17475c.C17476a.f48906a
            int r11 = r11.ordinal()
            r2 = r1[r11]
        L_0x008b:
            if (r2 == r10) goto L_0x00a3
            if (r2 == r9) goto L_0x009b
            if (r2 == r8) goto L_0x0093
            r11 = r7
            goto L_0x00aa
        L_0x0093:
            ge.bog.designsystem.components.common.Color$Attribute r11 = new ge.bog.designsystem.components.common.Color$Attribute
            int r1 = p356ao.C10109a.f27894d
            r11.<init>(r1)
            goto L_0x00aa
        L_0x009b:
            ge.bog.designsystem.components.common.Color$Attribute r11 = new ge.bog.designsystem.components.common.Color$Attribute
            int r1 = p356ao.C10109a.f27894d
            r11.<init>(r1)
            goto L_0x00aa
        L_0x00a3:
            ge.bog.designsystem.components.common.Color$Resource r11 = new ge.bog.designsystem.components.common.Color$Resource
            int r1 = p356ao.C10110b.f27903l
            r11.<init>(r1)
        L_0x00aa:
            r1 = r0
            r2 = r3
            r3 = r4
            r4 = r6
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p568pp.C17475c.m60975e(io.b):yi.a");
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final void m60976f(String str, String str2, String str3) {
        C36546y.m108282F().mo27152s("packages_page", str, str2);
        C10463g F = C36546y.m108282F();
        F.mo27137H(str3 + "_" + str, "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
    }

    /* renamed from: g */
    public static final C17471a m60977g(C15550d dVar) {
        C41536l.m120489i(dVar, "<this>");
        String c = dVar.mo42727c();
        String a = dVar.mo42725a();
        String c2 = C32289b0.m95091c(dVar.mo42726b());
        C41536l.m120488h(c2, "generateImageUrl(fileUrl)");
        return new C17471a(c, a, c2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:95:0x0271  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x027f  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p568pp.C17472b.C17474b m60978h(p469io.C15709b r39, boolean r40, ue1.C43064a r41, ue1.C43064a r42, java.lang.Integer r43) {
        /*
            r0 = r39
            r8 = r40
            r1 = r41
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r0, r2)
            java.lang.String r2 = r39.mo43093p()
            java.lang.String r3 = r39.mo43083g()
            java.lang.String r4 = r39.mo43092o()
            java.lang.String r5 = r39.mo43087j()
            int r6 = r39.mo43096s()
            java.lang.Boolean r10 = r39.mo43097t()
            java.lang.Double r7 = r39.mo43089l()
            java.lang.String r9 = "GEL"
            if (r7 == 0) goto L_0x0043
            double r12 = r7.doubleValue()
            java.lang.String r7 = r39.mo43090m()
            if (r7 != 0) goto L_0x0037
            r14 = r9
            goto L_0x0038
        L_0x0037:
            r14 = r7
        L_0x0038:
            r15 = 0
            r16 = 2
            r17 = 0
            java.lang.String r7 = g91.C32343x.m95410Q(r12, r14, r15, r16, r17)
            r12 = r7
            goto L_0x0044
        L_0x0043:
            r12 = 0
        L_0x0044:
            java.lang.Double r7 = r39.mo43079d()
            if (r7 == 0) goto L_0x0065
            double r13 = r7.doubleValue()
            java.lang.String r7 = r39.mo43080e()
            if (r7 != 0) goto L_0x0056
            r15 = r9
            goto L_0x0057
        L_0x0056:
            r15 = r7
        L_0x0057:
            r16 = 0
            r17 = 2
            r18 = 0
            java.lang.String r7 = g91.C32343x.m95410Q(r13, r15, r16, r17, r18)
            r9 = r7
            r7 = r43
            goto L_0x0068
        L_0x0065:
            r7 = r43
            r9 = 0
        L_0x0068:
            java.lang.Integer r13 = m60973c(r0, r8, r7)
            yi.a r14 = m60975e(r39)
            java.lang.Double r7 = r39.mo43088k()
            r15 = 0
            if (r7 == 0) goto L_0x0099
            double r16 = r7.doubleValue()
            yi.c r7 = new yi.c
            java.lang.String r11 = "text.packages.initial.limit.amount"
            r43 = r14
            java.lang.Object[] r14 = new java.lang.Object[r15]
            java.lang.String r11 = g91.C32343x.m95388F(r11, r14)
            java.lang.String r14 = m60972b(r16)
            ge.bog.designsystem.components.common.Color$Resource r15 = new ge.bog.designsystem.components.common.Color$Resource
            r17 = r10
            int r10 = p356ao.C10110b.f27904m
            r15.<init>(r10)
            r7.<init>(r11, r14, r15)
            r14 = r7
            goto L_0x009e
        L_0x0099:
            r17 = r10
            r43 = r14
            r14 = 0
        L_0x009e:
            java.util.List r7 = r39.mo43091n()
            r10 = 10
            if (r7 == 0) goto L_0x017d
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x00af:
            boolean r19 = r7.hasNext()
            if (r19 == 0) goto L_0x00ce
            java.lang.Object r11 = r7.next()
            r20 = r11
            ho.h r20 = (p455ho.C15555h) r20
            java.lang.String r20 = r20.mo42760i()
            if (r20 != 0) goto L_0x00c6
            r20 = 1
            goto L_0x00c8
        L_0x00c6:
            r20 = 0
        L_0x00c8:
            if (r20 == 0) goto L_0x00af
            r15.add(r11)
            goto L_0x00af
        L_0x00ce:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = ie1.C41343r.m119925u(r15, r10)
            r7.<init>(r11)
            java.util.Iterator r11 = r15.iterator()
        L_0x00db:
            boolean r15 = r11.hasNext()
            if (r15 == 0) goto L_0x0173
            java.lang.Object r15 = r11.next()
            ho.h r15 = (p455ho.C15555h) r15
            yi.b r10 = new yi.b
            r27 = r11
            java.lang.String r11 = r15.mo42751b()
            r29 = r13
            r28 = r14
            r14 = 0
            java.lang.Object[] r13 = new java.lang.Object[r14]
            java.lang.String r21 = g91.C32343x.m95388F(r11, r13)
            hd0.b r11 = r15.mo42750a()
            hd0.b r13 = hd0.C24978b.YES
            if (r11 != r13) goto L_0x0105
            int r11 = p356ao.C10112d.f27914c
            goto L_0x0107
        L_0x0105:
            int r11 = p356ao.C10112d.icons_16_system_subtract
        L_0x0107:
            r22 = r11
            ge.bog.designsystem.components.common.Color$Resource r11 = new ge.bog.designsystem.components.common.Color$Resource
            hd0.b r14 = r15.mo42750a()
            if (r14 != r13) goto L_0x0114
            int r14 = p356ao.C10110b.f27902k
            goto L_0x011b
        L_0x0114:
            if (r8 == 0) goto L_0x0119
            int r14 = p356ao.C10110b.f27907p
            goto L_0x011b
        L_0x0119:
            int r14 = p356ao.C10110b.f27899h
        L_0x011b:
            r11.<init>(r14)
            ge.bog.designsystem.components.common.Color$Resource r14 = new ge.bog.designsystem.components.common.Color$Resource
            r30 = r9
            hd0.b r9 = r15.mo42750a()
            if (r9 != r13) goto L_0x012b
            int r9 = p356ao.C10110b.f27904m
            goto L_0x0132
        L_0x012b:
            if (r8 == 0) goto L_0x0130
            int r9 = p356ao.C10110b.f27896d
            goto L_0x0132
        L_0x0130:
            int r9 = p356ao.C10110b.f27900i
        L_0x0132:
            r14.<init>(r9)
            ge.bog.designsystem.components.common.Color$Resource r9 = new ge.bog.designsystem.components.common.Color$Resource
            r31 = r12
            hd0.b r12 = r15.mo42750a()
            if (r12 != r13) goto L_0x0142
            int r12 = p356ao.C10110b.f27904m
            goto L_0x0149
        L_0x0142:
            if (r8 == 0) goto L_0x0147
            int r12 = p356ao.C10110b.f27896d
            goto L_0x0149
        L_0x0147:
            int r12 = p356ao.C10110b.f27900i
        L_0x0149:
            r9.<init>(r12)
            hd0.b r12 = r15.mo42750a()
            if (r12 == r13) goto L_0x0155
            r26 = 1
            goto L_0x0157
        L_0x0155:
            r26 = 0
        L_0x0157:
            r20 = r10
            r23 = r11
            r24 = r14
            r25 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r7.add(r10)
            r11 = r27
            r14 = r28
            r13 = r29
            r9 = r30
            r12 = r31
            r10 = 10
            goto L_0x00db
        L_0x0173:
            r30 = r9
            r31 = r12
            r29 = r13
            r28 = r14
            r14 = r7
            goto L_0x0186
        L_0x017d:
            r30 = r9
            r31 = r12
            r29 = r13
            r28 = r14
            r14 = 0
        L_0x0186:
            java.util.List r7 = r39.mo43091n()
            if (r7 == 0) goto L_0x01ed
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x0195:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x01b1
            java.lang.Object r10 = r7.next()
            r11 = r10
            ho.h r11 = (p455ho.C15555h) r11
            java.lang.String r11 = r11.mo42760i()
            if (r11 == 0) goto L_0x01aa
            r11 = 1
            goto L_0x01ab
        L_0x01aa:
            r11 = 0
        L_0x01ab:
            if (r11 == 0) goto L_0x0195
            r9.add(r10)
            goto L_0x0195
        L_0x01b1:
            java.util.ArrayList r7 = new java.util.ArrayList
            r10 = 10
            int r10 = ie1.C41343r.m119925u(r9, r10)
            r7.<init>(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x01c0:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x01eb
            java.lang.Object r10 = r9.next()
            ho.h r10 = (p455ho.C15555h) r10
            yi.e r11 = new yi.e
            java.lang.String r12 = r10.mo42751b()
            r13 = 0
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.String r12 = g91.C32343x.m95388F(r12, r15)
            java.lang.String r10 = r10.mo42760i()
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.String r10 = g91.C32343x.m95388F(r10, r15)
            r13 = 0
            r11.<init>(r12, r10, r13)
            r7.add(r11)
            goto L_0x01c0
        L_0x01eb:
            r13 = r7
            goto L_0x01ee
        L_0x01ed:
            r13 = 0
        L_0x01ee:
            io.c r7 = r39.mo43094q()
            r9 = -1
            if (r7 != 0) goto L_0x01f7
            r7 = r9
            goto L_0x01ff
        L_0x01f7:
            int[] r10 = p568pp.C17475c.C17476a.f48906a
            int r7 = r7.ordinal()
            r7 = r10[r7]
        L_0x01ff:
            r10 = 1
            if (r7 == r10) goto L_0x024a
            r10 = 2
            if (r7 == r10) goto L_0x024a
            if (r8 == 0) goto L_0x0227
            yi.d r7 = new yi.d
            java.lang.String r10 = "text.packages.activate.button"
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r21 = g91.C32343x.m95388F(r10, r11)
            pp.c$c r10 = new pp.c$c
            r10.<init>(r0, r1)
            r23 = 0
            r24 = 0
            r25 = 12
            r26 = 0
            r20 = r7
            r22 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26)
            goto L_0x0269
        L_0x0227:
            yi.d r1 = new yi.d
            java.lang.String r7 = "text.packages.package.card.middle.page.button"
            r10 = 0
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r33 = g91.C32343x.m95388F(r7, r10)
            pp.c$d r7 = new pp.c$d
            r10 = r42
            r7.<init>(r0, r10)
            r35 = 0
            r36 = 0
            r37 = 12
            r38 = 0
            r32 = r1
            r34 = r7
            r32.<init>(r33, r34, r35, r36, r37, r38)
            r15 = r1
            goto L_0x026a
        L_0x024a:
            yi.d r7 = new yi.d
            r21 = 0
            r22 = 0
            java.lang.String r10 = "text.packages.details.button"
            r11 = 0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            java.lang.String r23 = g91.C32343x.m95388F(r10, r11)
            pp.c$b r10 = new pp.c$b
            r10.<init>(r0, r1)
            r25 = 3
            r26 = 0
            r20 = r7
            r24 = r10
            r20.<init>(r21, r22, r23, r24, r25, r26)
        L_0x0269:
            r15 = r7
        L_0x026a:
            io.c r0 = r39.mo43094q()
            if (r0 != 0) goto L_0x0271
            goto L_0x0279
        L_0x0271:
            int[] r1 = p568pp.C17475c.C17476a.f48906a
            int r0 = r0.ordinal()
            r9 = r1[r0]
        L_0x0279:
            r0 = 1
            if (r9 != r0) goto L_0x027f
            op.b r0 = p554op.C17297b.ACTIVE
            goto L_0x0281
        L_0x027f:
            op.b r0 = p554op.C17297b.ELIGIBLE
        L_0x0281:
            r16 = r0
            pp.b$b r18 = new pp.b$b
            r0 = r18
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r31
            r6 = r30
            r8 = r40
            r9 = r29
            r10 = r17
            r11 = r43
            r12 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: p568pp.C17475c.m60978h(io.b, boolean, ue1.a, ue1.a, java.lang.Integer):pp.b$b");
    }

    /* renamed from: i */
    public static /* synthetic */ C17472b.C17474b m60979i(C15709b bVar, boolean z, C43064a aVar, C43064a aVar2, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            aVar = null;
        }
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        return m60978h(bVar, z, aVar, aVar2, num);
    }
}
