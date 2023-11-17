package gj0;

import android.graphics.drawable.Drawable;
import java.util.Comparator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame;
import p642vh.C18368l;
import xh0.C29781b;

/* renamed from: gj0.i */
public abstract class C24757i {

    /* renamed from: gj0.i$a */
    public static final class C24758a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C29781b) obj).mo69953f(), ((C29781b) obj2).mo69953f());
        }
    }

    /* renamed from: a */
    private static final GyroAnimationFrame m79334a(C29781b bVar) {
        String a = bVar.mo69947a();
        if (a == null) {
            a = "";
        }
        return new GyroAnimationFrame(new Image.Url(a, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), C18368l.m62762k(bVar.mo69950d()), C18368l.m62762k(bVar.mo69951e()), C18368l.m62762k(bVar.mo69948b()), C18368l.m62762k(bVar.mo69949c()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f5 A[LOOP:2: B:43:0x00ef->B:45:0x00f5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x00ca A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final p341ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel m79335b(xh0.C29789f r29) {
        /*
            java.lang.String r0 = "<this>"
            r1 = r29
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            long r3 = r29.mo69970e()
            ge.bog.designsystem.components.common.Image$Url r0 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r2 = r29.mo69967b()
            java.lang.String r15 = ""
            if (r2 != 0) goto L_0x0017
            r6 = r15
            goto L_0x0018
        L_0x0017:
            r6 = r2
        L_0x0018:
            ge.bog.designsystem.components.common.Image$Resource r7 = new ge.bog.designsystem.components.common.Image$Resource
            int r2 = oh0.C27009d.f67789h
            r14 = 0
            r13 = 2
            r7.<init>(r2, r14, r13, r14)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r2 = 124(0x7c, float:1.74E-43)
            r16 = 0
            r5 = r0
            r13 = r2
            r2 = r14
            r14 = r16
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            ge.bog.designsystem.components.common.Image$Url r8 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r5 = r29.mo69978k()
            if (r5 != 0) goto L_0x003d
            r20 = r15
            goto L_0x003f
        L_0x003d:
            r20 = r5
        L_0x003f:
            ge.bog.designsystem.components.common.Image$Resource r5 = new ge.bog.designsystem.components.common.Image$Resource
            int r6 = oh0.C27009d.f67790i
            r7 = 2
            r5.<init>(r6, r2, r7, r2)
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 124(0x7c, float:1.74E-43)
            r28 = 0
            r19 = r8
            r21 = r5
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28)
            xh0.a r5 = r29.mo69969d()
            if (r5 == 0) goto L_0x009f
            java.util.List r5 = r5.mo69939a()
            if (r5 == 0) goto L_0x009f
            java.util.Iterator r5 = r5.iterator()
        L_0x006c:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0086
            java.lang.Object r14 = r5.next()
            r6 = r14
            xh0.c r6 = (xh0.C29782c) r6
            xh0.d r6 = r6.mo69957b()
            xh0.d$a r7 = xh0.C29783d.C29784a.f75337c
            boolean r6 = kotlin.jvm.internal.C41536l.m120484d(r6, r7)
            if (r6 == 0) goto L_0x006c
            goto L_0x0087
        L_0x0086:
            r14 = r2
        L_0x0087:
            xh0.c r14 = (xh0.C29782c) r14
            if (r14 == 0) goto L_0x009f
            java.util.List r5 = r14.mo69956a()
            java.lang.Object r5 = ie1.C41358y.m120009Y(r5)
            xh0.b r5 = (xh0.C29781b) r5
            if (r5 == 0) goto L_0x009c
            java.lang.String r14 = r5.mo69947a()
            goto L_0x009d
        L_0x009c:
            r14 = r2
        L_0x009d:
            r6 = r14
            goto L_0x00a0
        L_0x009f:
            r6 = r2
        L_0x00a0:
            xh0.a r5 = r29.mo69969d()
            if (r5 == 0) goto L_0x0103
            java.util.List r5 = r5.mo69939a()
            if (r5 == 0) goto L_0x0103
            java.util.Iterator r5 = r5.iterator()
        L_0x00b0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00ca
            java.lang.Object r14 = r5.next()
            r7 = r14
            xh0.c r7 = (xh0.C29782c) r7
            xh0.d r7 = r7.mo69957b()
            xh0.d$c r9 = xh0.C29783d.C29786c.f75338c
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)
            if (r7 == 0) goto L_0x00b0
            goto L_0x00cb
        L_0x00ca:
            r14 = r2
        L_0x00cb:
            xh0.c r14 = (xh0.C29782c) r14
            if (r14 == 0) goto L_0x0103
            java.util.List r5 = r14.mo69956a()
            if (r5 == 0) goto L_0x0103
            gj0.i$a r7 = new gj0.i$a
            r7.<init>()
            java.util.List r5 = ie1.C41358y.m120030t0(r5, r7)
            if (r5 == 0) goto L_0x0103
            java.util.ArrayList r7 = new java.util.ArrayList
            r9 = 10
            int r9 = ie1.C41343r.m119925u(r5, r9)
            r7.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x00ef:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0104
            java.lang.Object r9 = r5.next()
            xh0.b r9 = (xh0.C29781b) r9
            ge.bog.designsystem.components.gyroanimation.GyroAnimationFrame r9 = m79334a(r9)
            r7.add(r9)
            goto L_0x00ef
        L_0x0103:
            r7 = r2
        L_0x0104:
            java.math.BigDecimal r5 = r29.mo69966a()
            java.lang.String r9 = "GEL"
            if (r5 == 0) goto L_0x0111
            java.lang.String r14 = g91.C32343x.m95408P(r5, r9)
            goto L_0x0112
        L_0x0111:
            r14 = r2
        L_0x0112:
            if (r14 != 0) goto L_0x0115
            r14 = r15
        L_0x0115:
            java.lang.String r5 = r29.mo69974h()
            if (r5 != 0) goto L_0x011c
            r5 = r15
        L_0x011c:
            java.lang.String r11 = f51.C31925a.m94279b(r5)
            java.lang.String r5 = r29.mo69980m()
            if (r5 != 0) goto L_0x0127
            r5 = r15
        L_0x0127:
            java.lang.String r10 = r29.mo69981n()
            if (r10 != 0) goto L_0x012e
            r10 = r15
        L_0x012e:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r5 = " "
            r12.append(r5)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r5 = r29.mo69972f()
            if (r5 != 0) goto L_0x014a
            r13 = r15
            goto L_0x014b
        L_0x014a:
            r13 = r5
        L_0x014b:
            java.util.List r16 = r29.mo69977j()
            java.lang.Long r5 = r29.mo69968c()
            if (r5 == 0) goto L_0x015a
            long r17 = r5.longValue()
            goto L_0x015c
        L_0x015a:
            r17 = 0
        L_0x015c:
            java.lang.String r17 = g91.C32319m.m95295b(r17)
            java.lang.String r5 = r29.mo69979l()
            if (r5 != 0) goto L_0x0167
            r5 = r15
        L_0x0167:
            java.math.BigDecimal r10 = r29.mo69982o()
            if (r10 == 0) goto L_0x0172
            java.lang.String r9 = g91.C32343x.m95408P(r10, r9)
            goto L_0x0173
        L_0x0172:
            r9 = r2
        L_0x0173:
            if (r9 != 0) goto L_0x0177
            r10 = r15
            goto L_0x0178
        L_0x0177:
            r10 = r9
        L_0x0178:
            boolean r18 = r29.mo69976i()
            xh0.a r1 = r29.mo69969d()
            if (r1 == 0) goto L_0x0189
            java.lang.Boolean r1 = r1.mo69943e()
            r19 = r1
            goto L_0x018b
        L_0x0189:
            r19 = r2
        L_0x018b:
            ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel r20 = new ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel
            r1 = r20
            r2 = r5
            r5 = r0
            r9 = r14
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r19
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: gj0.C24757i.m79335b(xh0.f):ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel");
    }
}
