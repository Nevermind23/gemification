package qi0;

import android.widget.FrameLayout;
import ce1.C40397a;
import com.bumptech.glide.C2394j;
import com.github.mikephil.charting.utils.Utils;
import gd1.C40992a;
import hd1.C41205b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import lj0.C26041d;
import mi0.C26234b;
import mj0.C26238b;
import p035c4.C2247a;
import p435gi.C15279a;
import th0.C28419p0;
import ue1.C43075l;

/* renamed from: qi0.i */
public final class C27822i extends C26238b {

    /* renamed from: qi0.i$a */
    static final class C27823a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27823a f70954d = new C27823a();

        C27823a() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setupAnimation");
            C2247a o0 = jVar.mo7242o0(false);
            C41536l.m120488h(o0, "skipMemoryCache(false)");
            return (C2394j) o0;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27822i(C28419p0 p0Var, C26234b bVar) {
        super(p0Var);
        C41536l.m120489i(p0Var, "binding");
        C41536l.m120489i(bVar, "eventHandler");
        C41205b F0 = bVar.mo61799a().mo95027o0(C40992a.m118827a()).mo94981F0(new C27821h(p0Var));
        C41536l.m120488h(F0, "eventHandler.getObservab…eFrames(result)\n        }");
        C40397a.m116967a(F0, bVar.mo61800b());
        FrameLayout frameLayout = p0Var.f72180e;
        C41536l.m120488h(frameLayout, "binding.frameContainerGiftCard");
        C26041d.m81682c(frameLayout, Utils.FLOAT_EPSILON, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m86007n(C28419p0 p0Var, Object obj) {
        C41536l.m120489i(p0Var, "$binding");
        if (obj instanceof C15279a) {
            p0Var.f72182g.mo35780a((C15279a) obj);
        }
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r14v2, types: [ge.bog.designsystem.components.common.Image$Url] */
    /* JADX WARNING: type inference failed for: r8v4, types: [ge.bog.designsystem.components.common.Image$Animation$Url] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48397j(pi0.C27534a.C27539e.C27540a r25) {
        /*
            r24 = this;
            java.lang.String r0 = "item"
            r1 = r25
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            g1.a r0 = r24.mo65241h()
            th0.p0 r0 = (th0.C28419p0) r0
            super.mo48397j(r25)
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r2 = r0.f72182g
            java.lang.String r3 = "giftCardGyroAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.util.List r3 = r25.mo66886b()
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0028
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r3 = r5
            goto L_0x0029
        L_0x0028:
            r3 = r4
        L_0x0029:
            r3 = r3 ^ r4
            r6 = 8
            if (r3 == 0) goto L_0x0030
            r3 = r5
            goto L_0x0031
        L_0x0030:
            r3 = r6
        L_0x0031:
            r2.setVisibility(r3)
            com.airbnb.lottie.LottieAnimationView r2 = r0.f72181f
            java.lang.String r3 = "giftCardAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.util.List r7 = r25.mo66886b()
            if (r7 == 0) goto L_0x0049
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0048
            goto L_0x0049
        L_0x0048:
            r4 = r5
        L_0x0049:
            if (r4 == 0) goto L_0x004d
            r4 = r5
            goto L_0x004e
        L_0x004d:
            r4 = r6
        L_0x004e:
            r2.setVisibility(r4)
            java.util.List r2 = r25.mo66886b()
            if (r2 == 0) goto L_0x005e
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r4 = r0.f72182g
            qi0.i$a r7 = qi0.C27822i.C27823a.f70954d
            r4.mo35781d(r2, r7)
        L_0x005e:
            java.lang.String r9 = r25.mo66887c()
            r2 = 2
            r4 = 0
            if (r9 == 0) goto L_0x0071
            ge.bog.designsystem.components.common.Image$Animation$Url r7 = new ge.bog.designsystem.components.common.Image$Animation$Url
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            goto L_0x0092
        L_0x0071:
            ge.bog.designsystem.components.common.Image$Url r7 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r15 = r25.mo66888d()
            ge.bog.designsystem.components.common.Image$Resource r8 = new ge.bog.designsystem.components.common.Image$Resource
            int r9 = oh0.C27009d.f67791j
            r8.<init>(r9, r4, r2, r4)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 124(0x7c, float:1.74E-43)
            r23 = 0
            r14 = r7
            r16 = r8
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
        L_0x0092:
            com.airbnb.lottie.LottieAnimationView r8 = r0.f72181f
            kotlin.jvm.internal.C41536l.m120488h(r8, r3)
            p642vh.C18368l.m62746A(r8, r7, r4, r2, r4)
            androidx.appcompat.widget.AppCompatImageView r3 = r0.f72183h
            java.lang.String r7 = "giftCardImageView"
            kotlin.jvm.internal.C41536l.m120488h(r3, r7)
            java.lang.String r9 = r25.mo66889e()
            if (r9 == 0) goto L_0x00b8
            ge.bog.designsystem.components.common.Image$Url r7 = new ge.bog.designsystem.components.common.Image$Url
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r17 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x00b9
        L_0x00b8:
            r7 = r4
        L_0x00b9:
            p642vh.C18368l.m62746A(r3, r7, r4, r2, r4)
            android.widget.TextView r2 = r0.f72185j
            java.lang.String r3 = "tvAvailableAmount"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.lang.String r3 = r25.mo66885a()
            boolean r3 = g91.C32343x.m95485s0(r3)
            if (r3 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r5 = r6
        L_0x00cf:
            r2.setVisibility(r5)
            android.widget.TextView r2 = r0.f72185j
            java.lang.String r3 = r25.mo66885a()
            r2.setText(r3)
            android.widget.TextView r2 = r0.f72185j
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo3946b()
            android.content.Context r0 = r0.getContext()
            java.lang.String r3 = "root.context"
            kotlin.jvm.internal.C41536l.m120488h(r0, r3)
            java.lang.Boolean r1 = r25.mo66891f()
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r3)
            if (r1 == 0) goto L_0x00f9
            int r1 = oh0.C27006a.f67782f
            goto L_0x00fb
        L_0x00f9:
            int r1 = oh0.C27006a.f67778b
        L_0x00fb:
            int r0 = p642vh.C18368l.m62755d(r0, r1)
            r2.setTextColor(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qi0.C27822i.mo48397j(pi0.a$e$a):void");
    }
}
