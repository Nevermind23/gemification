package gj0;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
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
import p341ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel;
import p435gi.C15279a;
import p615tg.C17963d;
import th0.C28429u0;
import ue1.C43075l;

/* renamed from: gj0.g */
public final class C24750g extends C1819o {

    /* renamed from: f */
    private final C40749p f63635f;

    /* renamed from: g */
    private final C41204a f63636g;

    /* renamed from: gj0.g$a */
    public static final class C24751a extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final C28429u0 f63637d;

        /* renamed from: gj0.g$a$a */
        static final class C24752a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C24752a f63638d = new C24752a();

            C24752a() {
                super(1);
            }

            /* renamed from: a */
            public final C2394j invoke(C2394j jVar) {
                C41536l.m120489i(jVar, "$this$setupAnimation");
                C2247a o0 = jVar.mo7242o0(true);
                C41536l.m120488h(o0, "skipMemoryCache(true)");
                return (C2394j) o0;
            }
        }

        /* renamed from: gj0.g$a$b */
        static final class C24753b extends C41537m implements C43075l {

            /* renamed from: d */
            final /* synthetic */ C24751a f63639d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C24753b(C24751a aVar) {
                super(1);
                this.f63639d = aVar;
            }

            /* renamed from: a */
            public final void mo63138a(C15279a aVar) {
                GyroAnimationView gyroAnimationView = this.f63639d.f63637d.f72219g;
                C41536l.m120488h(aVar, "sensorEvent");
                gyroAnimationView.mo35780a(aVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo63138a((C15279a) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24751a(C28429u0 u0Var) {
            super(u0Var.mo3946b());
            C41536l.m120489i(u0Var, "binding");
            this.f63637d = u0Var;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m79327l(C43075l lVar, Object obj) {
            C41536l.m120489i(lVar, "$tmp0");
            lVar.invoke(obj);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.designsystem.components.common.Image$Animation$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: ge.bog.designsystem.components.common.Image} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: ge.bog.designsystem.components.common.Image$Animation$Url} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: ge.bog.designsystem.components.common.Image$Animation$Url} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo63135j(p341ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel r12) {
            /*
                r11 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r12, r0)
                th0.u0 r0 = r11.f63637d
                ge.bog.designsystem.components.gyroanimation.GyroAnimationView r1 = r0.f72219g
                java.lang.String r2 = "giftCardGyroAnimationView"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                java.util.List r2 = r12.mo62063e()
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x001f
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r2 = r4
                goto L_0x0020
            L_0x001f:
                r2 = r3
            L_0x0020:
                r2 = r2 ^ r3
                r5 = 8
                if (r2 == 0) goto L_0x0027
                r2 = r4
                goto L_0x0028
            L_0x0027:
                r2 = r5
            L_0x0028:
                r1.setVisibility(r2)
                com.airbnb.lottie.LottieAnimationView r1 = r0.f72218f
                java.lang.String r2 = "giftCardAnimationView"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                java.util.List r6 = r12.mo62063e()
                if (r6 == 0) goto L_0x0040
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L_0x003f
                goto L_0x0040
            L_0x003f:
                r3 = r4
            L_0x0040:
                if (r3 == 0) goto L_0x0043
                goto L_0x0044
            L_0x0043:
                r4 = r5
            L_0x0044:
                r1.setVisibility(r4)
                java.util.List r1 = r12.mo62063e()
                if (r1 == 0) goto L_0x0054
                ge.bog.designsystem.components.gyroanimation.GyroAnimationView r3 = r0.f72219g
                gj0.g$a$a r4 = gj0.C24750g.C24751a.C24752a.f63638d
                r3.mo35781d(r1, r4)
            L_0x0054:
                java.lang.String r6 = r12.mo62065f()
                if (r6 == 0) goto L_0x0065
                ge.bog.designsystem.components.common.Image$Animation$Url r1 = new ge.bog.designsystem.components.common.Image$Animation$Url
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r1
                r5.<init>(r6, r7, r8, r9, r10)
                goto L_0x0069
            L_0x0065:
                ge.bog.designsystem.components.common.Image r1 = r12.mo62060b()
            L_0x0069:
                com.airbnb.lottie.LottieAnimationView r3 = r0.f72218f
                kotlin.jvm.internal.C41536l.m120488h(r3, r2)
                r2 = 0
                r4 = 2
                p642vh.C18368l.m62746A(r3, r1, r2, r4, r2)
                android.widget.ImageView r1 = r0.f72220h
                java.lang.String r3 = "merchantLogo"
                kotlin.jvm.internal.C41536l.m120488h(r1, r3)
                ge.bog.designsystem.components.common.Image r3 = r12.mo62067h()
                p642vh.C18368l.m62746A(r1, r3, r2, r4, r2)
                android.widget.TextView r1 = r0.f72217e
                java.lang.String r2 = r12.mo62059a()
                r1.setText(r2)
                android.widget.TextView r1 = r0.f72217e
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo3946b()
                android.content.Context r0 = r0.getContext()
                java.lang.String r2 = "root.context"
                kotlin.jvm.internal.C41536l.m120488h(r0, r2)
                java.lang.Boolean r12 = r12.mo62070j()
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                boolean r12 = kotlin.jvm.internal.C41536l.m120484d(r12, r2)
                if (r12 == 0) goto L_0x00a8
                int r12 = oh0.C27006a.f67782f
                goto L_0x00aa
            L_0x00a8:
                int r12 = oh0.C27006a.f67778b
            L_0x00aa:
                int r12 = p642vh.C18368l.m62755d(r0, r12)
                r1.setTextColor(r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: gj0.C24750g.C24751a.mo63135j(ge.bog.mobilebank.giftcards.presentation.received.ReceivedGiftCardUiModel):void");
        }

        /* renamed from: k */
        public final void mo63136k(C40749p pVar, C41204a aVar) {
            C41536l.m120489i(pVar, "gyroSensorData");
            C41536l.m120489i(aVar, "compositeDisposable");
            aVar.mo95660b(pVar.mo95027o0(C40992a.m118827a()).mo94981F0(new C24749f(new C24753b(this))));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24750g(C40749p pVar, C41204a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(pVar, "gyroSensorData");
        C41536l.m120489i(aVar, "compositeDisposable");
        this.f63635f = pVar;
        this.f63636g = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C24751a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo63135j((ReceivedGiftCardUiModel) g);
    }

    /* renamed from: l */
    public C24751a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28429u0 d = C28429u0.m87239d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n            Lay…          false\n        )");
        C24751a aVar = new C24751a(d);
        aVar.mo63136k(this.f63635f, this.f63636g);
        return aVar;
    }
}
