package g20;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32307h;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l50.C25838r;
import p669xh.C18763a;
import p90.C27375n4;
import q31.C38122f;
import q31.C38125h;

/* renamed from: g20.g */
public final class C20607g extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27375n4 f55676d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20607g(C27375n4 n4Var) {
        super(n4Var.mo3946b());
        C41536l.m120489i(n4Var, "binding");
        this.f55676d = n4Var;
    }

    /* renamed from: i */
    private final List m66887i(List list) {
        List c = C41339p.m119898c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25838r rVar = (C25838r) it.next();
            int d = C32307h.m95227d(rVar.mo64577d());
            if (d == 0) {
                c.add(C18763a.MASTER_CARD);
            } else if (d == 1) {
                c.add(C18763a.VISA);
            } else if (d == 2) {
                c.add(C18763a.AMERICAN_EXPRESS);
            }
            if (rVar.mo64601y()) {
                c.add(C18763a.DIGITAL_CARD);
            }
        }
        return C41339p.m119896a(c);
    }

    /* renamed from: k */
    private final void m66888k(long j) {
        this.itemView.setOnClickListener(new C20605f(this, j));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66889l(C20607g gVar, long j, View view) {
        C41536l.m120489i(gVar, "this$0");
        Context context = gVar.itemView.getContext();
        C41536l.m120488h(context, "itemView.context");
        C38122f c = C38125h.m112238c(context);
        Context context2 = gVar.itemView.getContext();
        C41536l.m120488h(context2, "itemView.context");
        c.mo91593b(context2, j);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v30, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x012c  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49153j(l50.C25832l r25, boolean r26) {
        /*
            r24 = this;
            r0 = r24
            java.lang.String r1 = "data"
            r2 = r25
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            java.util.List r1 = r25.mo64522a()
            java.util.Iterator r1 = r1.iterator()
        L_0x0011:
            boolean r3 = r1.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x002a
            java.lang.Object r3 = r1.next()
            r5 = r3
            l50.r r5 = (l50.C25838r) r5
            hd0.b r5 = r5.mo64600x()
            boolean r5 = r5.mo63390c()
            if (r5 == 0) goto L_0x0011
            goto L_0x002b
        L_0x002a:
            r3 = r4
        L_0x002b:
            l50.r r3 = (l50.C25838r) r3
            if (r3 == 0) goto L_0x0035
            java.lang.String r1 = r3.mo64595t()
            if (r1 != 0) goto L_0x005c
        L_0x0035:
            java.util.List r1 = r25.mo64522a()
            java.util.Iterator r1 = r1.iterator()
        L_0x003d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0051
            java.lang.Object r3 = r1.next()
            r5 = r3
            l50.r r5 = (l50.C25838r) r5
            boolean r5 = r5.mo64602z()
            if (r5 == 0) goto L_0x003d
            goto L_0x0052
        L_0x0051:
            r3 = r4
        L_0x0052:
            l50.r r3 = (l50.C25838r) r3
            if (r3 == 0) goto L_0x005b
            java.lang.String r1 = r3.mo64595t()
            goto L_0x005c
        L_0x005b:
            r1 = r4
        L_0x005c:
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r1 = p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(r1)
            java.lang.String r6 = r25.mo64524c()
            ge.bog.designsystem.components.Amount r7 = new ge.bog.designsystem.components.Amount
            double r8 = r25.mo64532i()
            java.lang.String r3 = r25.mo64533j()
            r7.<init>((double) r8, (java.lang.String) r3)
            java.util.List r3 = r25.mo64522a()
            java.util.List r12 = r0.m66887i(r3)
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r3 = r25.mo64535l()
            if (r3 == 0) goto L_0x0084
            java.lang.String r3 = r3.getFileUrl()
            goto L_0x0085
        L_0x0084:
            r3 = r4
        L_0x0085:
            java.lang.String r14 = g91.C32289b0.m95091c(r3)
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r3 = r25.mo64535l()
            if (r3 == 0) goto L_0x0094
            java.lang.String r3 = r3.getFileUrl()
            goto L_0x0095
        L_0x0094:
            r3 = r4
        L_0x0095:
            if (r3 == 0) goto L_0x00b3
            ge.bog.designsystem.components.common.Image$Url r3 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r5 = "imageUrl"
            kotlin.jvm.internal.C41536l.m120488h(r14, r5)
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 126(0x7e, float:1.77E-43)
            r22 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
        L_0x00b1:
            r8 = r3
            goto L_0x00c2
        L_0x00b3:
            int r3 = r1.resId
            r5 = -1
            if (r3 == r5) goto L_0x00c1
            ge.bog.designsystem.components.common.Image$Resource r3 = new ge.bog.designsystem.components.common.Image$Resource
            int r5 = r1.resId
            r8 = 2
            r3.<init>(r5, r4, r8, r4)
            goto L_0x00b1
        L_0x00c1:
            r8 = r4
        L_0x00c2:
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r3 = r25.mo64535l()
            if (r3 == 0) goto L_0x00cc
            java.lang.String r4 = r3.getFileUrl()
        L_0x00cc:
            r5 = 1
            if (r4 == 0) goto L_0x00d8
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r1 = r25.mo64535l()
            boolean r1 = r1.isDark()
            goto L_0x00df
        L_0x00d8:
            boolean r1 = r1.isLightText
            if (r1 != 0) goto L_0x00de
            r1 = r5
            goto L_0x00df
        L_0x00de:
            r1 = 0
        L_0x00df:
            p90.n4 r4 = r0.f55676d
            ge.bog.designsystem.components.productcards.AccountCardView r4 = r4.mo3946b()
            boolean r10 = r25.mo64542s()
            if (r8 != 0) goto L_0x00ef
            ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.CLEAR
        L_0x00ed:
            r11 = r1
            goto L_0x00f7
        L_0x00ef:
            if (r1 == 0) goto L_0x00f4
            ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.BLACK
            goto L_0x00ed
        L_0x00f4:
            ge.bog.designsystem.components.productcards.basecard.a$b r1 = p341ge.bog.designsystem.components.productcards.basecard.C13473a.C13476b.WHITE
            goto L_0x00ed
        L_0x00f7:
            java.util.List r1 = ie1.C41339p.m119898c()
            l50.h r14 = r25.mo64523b()
            if (r14 == 0) goto L_0x0158
            l50.h r14 = r25.mo64523b()
            java.util.List r14 = r14.mo64496e()
            int r14 = r14.size()
            if (r14 <= r5) goto L_0x0158
            l50.h r14 = r25.mo64523b()
            java.util.List r14 = r14.mo64496e()
            java.util.ArrayList r15 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r14, r3)
            r15.<init>(r3)
            java.util.Iterator r3 = r14.iterator()
        L_0x0126:
            boolean r14 = r3.hasNext()
            if (r14 == 0) goto L_0x0155
            java.lang.Object r14 = r3.next()
            l50.q r14 = (l50.C25837q) r14
            ge.bog.designsystem.components.productcards.AccountCardView$b r13 = new ge.bog.designsystem.components.productcards.AccountCardView$b
            java.lang.String r9 = r14.mo64566b()
            java.math.BigDecimal r14 = r14.mo64569e()
            r19 = 0
            if (r14 == 0) goto L_0x0145
            double r21 = r14.doubleValue()
            goto L_0x0147
        L_0x0145:
            r21 = r19
        L_0x0147:
            int r14 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x014d
            r14 = r5
            goto L_0x014e
        L_0x014d:
            r14 = 0
        L_0x014e:
            r13.<init>(r9, r14)
            r15.add(r13)
            goto L_0x0126
        L_0x0155:
            r1.addAll(r15)
        L_0x0158:
            he1.w r3 = he1.C41238w.f97225a
            java.util.List r14 = ie1.C41339p.m119896a(r1)
            r15 = r26 ^ 1
            r16 = 0
            r1 = 1160(0x488, float:1.626E-42)
            r3 = 0
            ge.bog.designsystem.components.productcards.AccountCardView$a r13 = new ge.bog.designsystem.components.productcards.AccountCardView$a
            r5 = r13
            r9 = 0
            r23 = r13
            r13 = 0
            r17 = r1
            r18 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r1 = r23
            r4.setData((p341ge.bog.designsystem.components.productcards.AccountCardView.C13445a) r1)
            long r1 = r25.mo64529g()
            r0.m66888k(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g20.C20607g.mo49153j(l50.l, boolean):void");
    }
}
