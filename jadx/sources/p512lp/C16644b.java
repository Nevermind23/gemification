package p512lp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p380ck.C10463g;
import p380ck.C10464h;
import p413eo.C12749i0;
import p526mp.C16883a;
import p526mp.C16886c;

/* renamed from: lp.b */
public final class C16644b extends C1819o {

    /* renamed from: f */
    private final C16652e f46842f;

    /* renamed from: lp.b$a */
    public static final class C16645a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C12749i0 f46843d;

        /* renamed from: e */
        private final C16652e f46844e;

        /* renamed from: lp.b$a$a */
        public /* synthetic */ class C16646a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f46845a;

            /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    mp.a[] r0 = p526mp.C16883a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    mp.a r1 = p526mp.C16883a.Y     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    mp.a r1 = p526mp.C16883a.A     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    mp.a r1 = p526mp.C16883a.P     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    mp.a r1 = p526mp.C16883a.N     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    mp.a r1 = p526mp.C16883a.D     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    mp.a r1 = p526mp.C16883a.S     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    f46845a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p512lp.C16644b.C16645a.C16646a.<clinit>():void");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C16645a(C12749i0 i0Var, C16652e eVar) {
            super(i0Var.mo3946b());
            C41536l.m120489i(i0Var, "binding");
            C41536l.m120489i(eVar, "onBenefitClick");
            this.f46843d = i0Var;
            this.f46844e = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m58968j(C16645a aVar, C16886c cVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(cVar, "$benefit");
            aVar.f46844e.mo41051a(cVar);
            C10463g F = C36546y.m108282F();
            String k = aVar.m58969k(cVar.mo44032e());
            String a = cVar.mo44028a();
            String F2 = C32343x.m95388F(cVar.mo44028a(), new Object[0]);
            F.mo27137H("My_Package_Page_Benefit", k, " " + a + "_" + F2, (Bundle) null, C10464h.C10465a.FIREBASE);
        }

        /* renamed from: k */
        private final String m58969k(C16883a aVar) {
            switch (aVar == null ? -1 : C16646a.f46845a[aVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    return "ACTIVE";
                case 4:
                case 5:
                case 6:
                    return "NOT_ACTIVE";
                default:
                    return "NONE";
            }
        }

        /* renamed from: i */
        public final void mo43787i(C16886c cVar, boolean z) {
            Drawable drawable;
            boolean z2;
            boolean z3;
            boolean z4;
            C41536l.m120489i(cVar, "benefit");
            C12749i0 i0Var = this.f46843d;
            ImageView imageView = i0Var.f37752f;
            Integer b = cVar.mo44029b();
            if (b != null) {
                drawable = C32343x.m95426Y(b.intValue(), (Context) null, 1, (Object) null);
            } else {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            i0Var.f37756j.setText(C32343x.m95388F(cVar.mo44028a(), new Object[0]));
            TextView textView = i0Var.f37753g;
            C41536l.m120488h(textView, "bindData$lambda$4$lambda$0");
            if (cVar.mo44035g() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            C32343x.m95483r1(textView, z2, false, 2, (Object) null);
            textView.setText(C32343x.m95388F(cVar.mo44035g(), new Object[0]));
            NotificationBadgeView notificationBadgeView = i0Var.f37751e;
            C41536l.m120488h(notificationBadgeView, "badge");
            if (cVar.mo44032e() == C16883a.A || cVar.mo44032e() == C16883a.Y) {
                z3 = true;
            } else {
                z3 = false;
            }
            C32343x.m95483r1(notificationBadgeView, z3, false, 2, (Object) null);
            ImageView imageView2 = i0Var.f37755i;
            C41536l.m120488h(imageView2, "bindData$lambda$4$lambda$2");
            if (cVar.mo44030c() != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            C32343x.m95480q1(imageView2, z4, true);
            Integer c = cVar.mo44030c();
            if (c != null) {
                imageView2.setImageDrawable(C32343x.m95424X(c.intValue(), this.itemView.getContext()));
            }
            View view = i0Var.f37754h;
            C41536l.m120488h(view, "divider");
            C32343x.m95483r1(view, !z, false, 2, (Object) null);
            i0Var.mo3946b().setOnClickListener(new C16643a(this, cVar));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16644b(C16652e eVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(eVar, "onBenefitClick");
        this.f46842f = eVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C16645a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        C16886c cVar = (C16886c) obj;
        boolean z = true;
        if (mo6026f().size() - 1 != i) {
            z = false;
        }
        aVar.mo43787i(cVar, z);
    }

    /* renamed from: l */
    public C16645a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C12749i0 d = C12749i0.m48391d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(\n               …      false\n            )");
        return new C16645a(d, this.f46842f);
    }
}
