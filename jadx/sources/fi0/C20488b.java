package fi0;

import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C2394j;
import ed1.C40749p;
import gd1.C40992a;
import hd1.C41204a;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p035c4.C2247a;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;
import p435gi.C15279a;
import th0.C28419p0;
import ue1.C43075l;

/* renamed from: fi0.b */
public final class C20488b extends RecyclerView.C1734f0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28419p0 f55490d;

    /* renamed from: fi0.b$a */
    static final class C20489a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C20489a f55491d = new C20489a();

        C20489a() {
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

    /* renamed from: fi0.b$b */
    static final class C20490b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C20488b f55492d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20490b(C20488b bVar) {
            super(1);
            this.f55492d = bVar;
        }

        /* renamed from: a */
        public final void mo49032a(C15279a aVar) {
            GyroAnimationView gyroAnimationView = this.f55492d.f55490d.f72182g;
            C41536l.m120488h(aVar, "sensorEvent");
            gyroAnimationView.mo35780a(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49032a((C15279a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20488b(C28419p0 p0Var) {
        super(p0Var.mo3946b());
        C41536l.m120489i(p0Var, "binding");
        this.f55490d = p0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66702l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [ge.bog.designsystem.components.common.Image] */
    /* JADX WARNING: type inference failed for: r16v2, types: [ge.bog.designsystem.components.common.Image$Url] */
    /* JADX WARNING: type inference failed for: r10v4, types: [ge.bog.designsystem.components.common.Image$Animation$Url] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49029j(hi0.C25028a r27) {
        /*
            r26 = this;
            java.lang.String r0 = "animationUiModel"
            r1 = r27
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            r0 = r26
            th0.p0 r2 = r0.f55490d
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r3 = r2.f72182g
            java.lang.String r4 = "giftCardGyroAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            java.util.List r4 = r27.mo63428b()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x0023
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r4 = r6
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            r4 = r4 ^ r5
            r7 = 8
            if (r4 == 0) goto L_0x002b
            r4 = r6
            goto L_0x002c
        L_0x002b:
            r4 = r7
        L_0x002c:
            r3.setVisibility(r4)
            com.airbnb.lottie.LottieAnimationView r3 = r2.f72181f
            java.lang.String r4 = "giftCardAnimationView"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            java.util.List r8 = r27.mo63428b()
            if (r8 == 0) goto L_0x0045
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x0043
            goto L_0x0045
        L_0x0043:
            r8 = r6
            goto L_0x0046
        L_0x0045:
            r8 = r5
        L_0x0046:
            if (r8 == 0) goto L_0x004a
            r8 = r6
            goto L_0x004b
        L_0x004a:
            r8 = r7
        L_0x004b:
            r3.setVisibility(r8)
            java.util.List r3 = r27.mo63428b()
            if (r3 == 0) goto L_0x005b
            ge.bog.designsystem.components.gyroanimation.GyroAnimationView r8 = r2.f72182g
            fi0.b$a r9 = fi0.C20488b.C20489a.f55491d
            r8.mo35781d(r3, r9)
        L_0x005b:
            java.lang.String r11 = r27.mo63429c()
            r3 = 2
            r8 = 0
            if (r11 == 0) goto L_0x006e
            ge.bog.designsystem.components.common.Image$Animation$Url r9 = new ge.bog.designsystem.components.common.Image$Animation$Url
            r12 = 0
            r13 = 0
            r14 = 6
            r15 = 0
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15)
            goto L_0x0090
        L_0x006e:
            ge.bog.designsystem.components.common.Image$Url r9 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r17 = r27.mo63434g()
            ge.bog.designsystem.components.common.Image$Resource r10 = new ge.bog.designsystem.components.common.Image$Resource
            int r11 = oh0.C27009d.f67791j
            r10.<init>(r11, r8, r3, r8)
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 124(0x7c, float:1.74E-43)
            r25 = 0
            r16 = r9
            r18 = r10
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0090:
            com.airbnb.lottie.LottieAnimationView r10 = r2.f72181f
            kotlin.jvm.internal.C41536l.m120488h(r10, r4)
            p642vh.C18368l.m62746A(r10, r9, r8, r3, r8)
            androidx.appcompat.widget.AppCompatImageView r4 = r2.f72183h
            java.lang.String r9 = "giftCardImageView"
            kotlin.jvm.internal.C41536l.m120488h(r4, r9)
            java.lang.String r11 = r27.mo63435h()
            if (r11 == 0) goto L_0x00b8
            ge.bog.designsystem.components.common.Image$Url r9 = new ge.bog.designsystem.components.common.Image$Url
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 126(0x7e, float:1.77E-43)
            r19 = 0
            r10 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x00b9
        L_0x00b8:
            r9 = r8
        L_0x00b9:
            p642vh.C18368l.m62746A(r4, r9, r8, r3, r8)
            android.widget.TextView r3 = r2.f72185j
            java.lang.String r4 = "tvAvailableAmount"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            java.lang.String r4 = r27.mo63427a()
            boolean r4 = g91.C32343x.m95485s0(r4)
            if (r4 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r6 = r7
        L_0x00cf:
            r3.setVisibility(r6)
            android.widget.TextView r3 = r2.f72185j
            java.lang.String r4 = r27.mo63427a()
            r3.setText(r4)
            android.widget.TextView r3 = r2.f72185j
            androidx.constraintlayout.widget.ConstraintLayout r4 = r2.mo3946b()
            android.content.Context r4 = r4.getContext()
            java.lang.String r6 = "root.context"
            kotlin.jvm.internal.C41536l.m120488h(r4, r6)
            java.lang.Boolean r1 = r27.mo63437i()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r1 = kotlin.jvm.internal.C41536l.m120484d(r1, r6)
            if (r1 == 0) goto L_0x00f9
            int r1 = oh0.C27006a.f67782f
            goto L_0x00fb
        L_0x00f9:
            int r1 = oh0.C27006a.f67778b
        L_0x00fb:
            int r1 = p642vh.C18368l.m62755d(r4, r1)
            r3.setTextColor(r1)
            android.widget.FrameLayout r1 = r2.f72180e
            java.lang.String r2 = "frameContainerGiftCard"
            kotlin.jvm.internal.C41536l.m120488h(r1, r2)
            r2 = 0
            lj0.C26041d.m81682c(r1, r2, r5, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi0.C20488b.mo49029j(hi0.a):void");
    }

    /* renamed from: k */
    public final void mo49030k(C40749p pVar, C41204a aVar) {
        C41536l.m120489i(pVar, "gyroSensorData");
        C41536l.m120489i(aVar, "compositeDisposable");
        aVar.mo95660b(pVar.mo95027o0(C40992a.m118827a()).mo94981F0(new C20487a(new C20490b(this))));
    }
}
