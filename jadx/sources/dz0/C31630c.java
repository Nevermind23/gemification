package dz0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import ez0.C31897c;
import g91.C32303f;
import g91.C32343x;
import hy0.C36270d;
import i31.C36344a;
import iy0.C36622o1;
import iy0.C36625p1;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p615tg.C17963d;
import ue1.C43075l;
import x11.C39770c;
import z31.C40143a;
import z31.C40144b;
import z31.C40145c;
import z31.C40146d;

/* renamed from: dz0.c */
public final class C31630c extends C1819o {

    /* renamed from: f */
    private final C43075l f78200f;

    /* renamed from: dz0.c$a */
    public static final class C31631a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C36622o1 f78201d;

        /* renamed from: e */
        private final C43075l f78202e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31631a(C36622o1 o1Var, C43075l lVar) {
            super(o1Var.mo3946b());
            C41536l.m120489i(o1Var, "binding");
            this.f78201d = o1Var;
            this.f78202e = lVar;
        }

        /* renamed from: i */
        private final void m93756i(C36344a aVar) {
            Double d;
            String str;
            AppCompatTextView appCompatTextView = this.f78201d.f88347i;
            Double d2 = null;
            if (aVar != null) {
                d = aVar.mo89060c();
            } else {
                d = null;
            }
            if (d != null) {
                Double c = aVar.mo89060c();
                C41536l.m120486f(c);
                if (c.doubleValue() > Utils.DOUBLE_EPSILON) {
                    Double c2 = aVar.mo89060c();
                    C41536l.m120486f(c2);
                    str = C32303f.m95200k(c2.doubleValue(), "GEL");
                    appCompatTextView.setText(str);
                }
            }
            if (aVar != null) {
                d2 = Double.valueOf(aVar.mo89058a());
            }
            if (d2 == null || aVar.mo89058a() <= Utils.DOUBLE_EPSILON) {
                str = C32343x.m95388F("text.insurence.fee.free", new Object[0]);
            } else {
                str = C32303f.m95200k(aVar.mo89058a(), "GEL");
            }
            appCompatTextView.setText(str);
        }

        /* renamed from: j */
        private final void m93757j(C31897c cVar, C31897c cVar2) {
            C36625p1 p1Var = this.f78201d.f88355q;
            C41536l.m120488h(p1Var, "binding.posLimit");
            m93761o(p1Var, cVar);
            C36625p1 p1Var2 = this.f78201d.f88354p;
            C41536l.m120488h(p1Var2, "binding.onlinePaymentsLimit");
            m93761o(p1Var2, cVar2);
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static final void m93758l(C31631a aVar, C40145c cVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cVar, "$item");
            C43075l lVar = aVar.f78202e;
            if (lVar != null) {
                lVar.invoke(cVar.mo94082c());
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x005a, code lost:
            if (r1 != null) goto L_0x0065;
         */
        /* renamed from: m */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m93759m(z31.C40143a r8) {
            /*
                r7 = this;
                iy0.o1 r0 = r7.f78201d
                ge.bog.designsystem.components.list.SingleLineTextItem r0 = r0.f88352n
                i31.c r1 = r8.mo94077d()
                java.lang.String r1 = r1.mo89072c()
                r2 = 0
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r3)
                r0.setText(r1)
                i31.a r0 = r8.mo94075b()
                r7.m93756i(r0)
                iy0.o1 r0 = r7.f78201d
                androidx.appcompat.widget.AppCompatTextView r0 = r0.f88351m
                i31.a r1 = r8.mo94075b()
                if (r1 == 0) goto L_0x005d
                java.lang.Double r1 = r1.mo89060c()
                if (r1 == 0) goto L_0x005d
                double r3 = r1.doubleValue()
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 <= 0) goto L_0x0059
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                i31.a r3 = r8.mo94075b()
                kotlin.jvm.internal.C41536l.m120486f(r3)
                double r3 = r3.mo89058a()
                java.lang.String r5 = "GEL"
                java.lang.String r3 = g91.C32303f.m95200k(r3, r5)
                java.lang.String r4 = "getFormattedAmount(details.fee!!.fee, Consts.GEL)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r4)
                r1[r2] = r3
                java.lang.String r3 = "card.insurance.actionsheet.instead"
                java.lang.String r1 = g91.C32343x.m95388F(r3, r1)
                goto L_0x005a
            L_0x0059:
                r1 = 0
            L_0x005a:
                if (r1 == 0) goto L_0x005d
                goto L_0x0065
            L_0x005d:
                java.lang.String r1 = "card.insurance.price.annualy"
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r3)
            L_0x0065:
                r0.setText(r1)
                i31.c r8 = r8.mo94077d()
                ez0.c r0 = new ez0.c
                java.lang.String r1 = "card.insurance.limit.pos.description"
                java.lang.Object[] r3 = new java.lang.Object[r2]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r3)
                java.lang.String r3 = r8.mo89076f()
                r0.<init>(r1, r3)
                ez0.c r1 = new ez0.c
                java.lang.String r3 = "card.insurance.limit.online.payments.description"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.String r2 = g91.C32343x.m95388F(r3, r2)
                java.lang.String r8 = r8.mo89074e()
                r1.<init>(r2, r8)
                r7.m93757j(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dz0.C31630c.C31631a.m93759m(z31.a):void");
        }

        /* renamed from: n */
        private final void m93760n() {
            TwoLineReverseTextItem twoLineReverseTextItem = this.f78201d.f88353o;
            C40146d dVar = C40146d.f95398a;
            twoLineReverseTextItem.setText(C32343x.m95388F(dVar.mo94088c(), new Object[0]));
            this.f78201d.f88353o.setTitle(C32343x.m95388F(dVar.mo94087b(), new Object[0]));
        }

        /* renamed from: o */
        private final void m93761o(C36625p1 p1Var, C31897c cVar) {
            p1Var.f88376e.setText(cVar.mo72325a());
            p1Var.f88377f.setText(cVar.mo72326b());
        }

        /* renamed from: p */
        private final void m93762p(boolean z) {
            int i;
            C36622o1 o1Var = this.f78201d;
            FrameLayout frameLayout = o1Var.f88356r;
            Context context = o1Var.mo3946b().getContext();
            if (z) {
                i = C36270d.rounded_stroke_radius_12_primary;
            } else {
                i = C39770c.rounded_stroke_radius_12_tr_25;
            }
            frameLayout.setForeground(C0767a.m2895e(context, i));
            NotificationBadgeView notificationBadgeView = this.f78201d.f88343e;
            C41536l.m120488h(notificationBadgeView, "binding.checkedBadge");
            C32343x.m95483r1(notificationBadgeView, z, false, 2, (Object) null);
        }

        /* renamed from: k */
        public final void mo72069k(C40145c cVar) {
            C41536l.m120489i(cVar, "item");
            this.f78201d.f88356r.setOnClickListener(new C31629b(this, cVar));
            m93762p(cVar.mo94083d());
            LinearLayoutCompat linearLayoutCompat = this.f78201d.f88350l;
            C41536l.m120488h(linearLayoutCompat, "binding.insuranceFeeContainer");
            Group group = this.f78201d.f88349k;
            C41536l.m120488h(group, "binding.insuranceDetailsGroup");
            SingleLineTextItem singleLineTextItem = this.f78201d.f88352n;
            C41536l.m120488h(singleLineTextItem, "binding.insuranceTitle");
            for (View r1 : C41341q.m119910m(linearLayoutCompat, group, singleLineTextItem)) {
                C32343x.m95483r1(r1, cVar.mo94082c() instanceof C40143a, false, 2, (Object) null);
            }
            TwoLineReverseTextItem twoLineReverseTextItem = this.f78201d.f88353o;
            C41536l.m120488h(twoLineReverseTextItem, "binding.noInsuranceTitle");
            C32343x.m95483r1(twoLineReverseTextItem, cVar.mo94082c() instanceof C40146d, false, 2, (Object) null);
            C40144b c = cVar.mo94082c();
            if (c instanceof C40143a) {
                C40144b c2 = cVar.mo94082c();
                C41536l.m120487g(c2, "null cannot be cast to non-null type ge.bog.mobilebank.shared.presentation.model.insurance.InsuranceDetails");
                m93759m((C40143a) c2);
            } else if (C41536l.m120484d(c, C40146d.f95398a)) {
                m93760n();
            }
        }
    }

    public C31630c(C43075l lVar) {
        super(C17963d.f51158a.mo45633d());
        this.f78200f = lVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C31631a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo72069k((C40145c) g);
    }

    /* renamed from: l */
    public C31631a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C36622o1 d = C36622o1.m108623d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C31631a(d, this.f78200f);
    }
}
