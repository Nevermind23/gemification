package p341ge.bog.mobilebank.loans.presentation.historygraphics;

import com.github.mikephil.charting.utils.Utils;
import g91.C32319m;
import g91.C32343x;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;
import o31.C37603j;
import p341ge.bog.mobilebank.loans.presentation.historygraphics.C32648f;
import tr0.C38780a;
import tr0.C38781b;
import tr0.C38782c;
import zr0.C40247d;

/* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.b */
public final class C32643b {

    /* renamed from: a */
    public static final C32644a f80363a = new C32644a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.b$a */
    public static final class C32644a {
        private C32644a() {
        }

        public /* synthetic */ C32644a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final C32648f.C32654f m96447b(C38781b bVar) {
        String str;
        Long f = bVar.mo92412f();
        C41536l.m120486f(f);
        String b = C32319m.m95295b(f.longValue());
        C41536l.m120488h(b, "formatDate(loanHistoryRepayment.paymentDate!!)");
        BigDecimal a = bVar.mo92406a();
        if (a != null) {
            String b2 = bVar.mo92407b();
            C41536l.m120486f(b2);
            str = C32343x.m95408P(a, b2);
        } else {
            str = null;
        }
        C41536l.m120486f(str);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m96448c(bVar));
        C41238w wVar = C41238w.f97225a;
        return new C32648f.C32654f(b, str, true, arrayList);
    }

    /* renamed from: c */
    private final List m96448c(C38781b bVar) {
        C40247d[] dVarArr = new C40247d[6];
        BigDecimal h = bVar.mo92414h();
        if (h == null) {
            h = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[0] = new C40247d(h, "text.lnd_schedule_col_names.pri_amt", bVar.mo92407b());
        BigDecimal e = bVar.mo92410e();
        if (e == null) {
            e = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[1] = new C40247d(e, "text.lnd_schedule_col_names.int_amt", bVar.mo92407b());
        BigDecimal c = bVar.mo92408c();
        if (c == null) {
            c = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[2] = new C40247d(c, "text.lnd_schedule_col_names.fee", bVar.mo92407b());
        String d = bVar.mo92409d();
        BigDecimal j = bVar.mo92417j();
        if (j == null) {
            j = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[3] = new C40247d(j, d, bVar.mo92407b());
        BigDecimal i = bVar.mo92416i();
        if (i == null) {
            i = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[4] = new C40247d(i, "text.lnd_schedule_col_names.rli_amt", bVar.mo92407b());
        BigDecimal g = bVar.mo92413g();
        if (g == null) {
            g = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[5] = new C40247d(g, "text.lnd_repeyment_col_names.penalty", bVar.mo92407b());
        List m = C41341q.m119910m(dVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object next : m) {
            if (C37603j.m110583f(((C40247d) next).mo94196a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    private final C32648f.C32653e m96449d(C38780a aVar, boolean z) {
        C38781b bVar = (C38781b) C41358y.m120007W(aVar.mo92401a());
        int i = C37129d.history_item_image;
        BigDecimal a = bVar.mo92406a();
        Long f = bVar.mo92412f();
        String b = bVar.mo92407b();
        C40247d[] dVarArr = new C40247d[6];
        BigDecimal h = bVar.mo92414h();
        if (h == null) {
            h = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[0] = new C40247d(h, "text.lnd_schedule_col_names.pri_amt", bVar.mo92407b());
        BigDecimal e = bVar.mo92410e();
        if (e == null) {
            e = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[1] = new C40247d(e, "text.lnd_schedule_col_names.int_amt", bVar.mo92407b());
        BigDecimal c = bVar.mo92408c();
        if (c == null) {
            c = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[2] = new C40247d(c, "text.lnd_schedule_col_names.fee", bVar.mo92407b());
        String d = bVar.mo92409d();
        BigDecimal j = bVar.mo92417j();
        if (j == null) {
            j = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[3] = new C40247d(j, d, bVar.mo92407b());
        BigDecimal i2 = bVar.mo92416i();
        if (i2 == null) {
            i2 = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[4] = new C40247d(i2, "text.lnd_schedule_col_names.rli_amt", bVar.mo92407b());
        BigDecimal g = bVar.mo92413g();
        if (g == null) {
            g = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[5] = new C40247d(g, "text.lnd_repeyment_col_names.penalty", bVar.mo92407b());
        List m = C41341q.m119910m(dVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object next : m) {
            if (C37603j.m110583f(((C40247d) next).mo94196a())) {
                arrayList.add(next);
            }
        }
        return new C32648f.C32653e(i, b, a, f, "text.loan.repayments.history.page.last.payment", false, arrayList, z, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    static /* synthetic */ C32648f.C32653e m96450e(C32643b bVar, C38780a aVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return bVar.m96449d(aVar, z);
    }

    /* renamed from: f */
    private final C32648f.C32650b m96451f(C38780a aVar, String str) {
        BigDecimal a;
        C38782c b = aVar.mo92402b();
        String str2 = null;
        if (!(b == null || (a = b.mo92419a()) == null)) {
            C38782c b2 = aVar.mo92402b();
            if (b2 != null) {
                str2 = b2.mo92420b();
            }
            C41536l.m120486f(str2);
            str2 = C32343x.m95408P(a, str2);
        }
        return new C32648f.C32650b(C37129d.ic_pdf, String.valueOf(str2), str, "text.loan.repayments.history.page.total.amount", "text.loan.repayments.history.page.download.button");
    }

    /* renamed from: g */
    private final List m96452g(List list) {
        List<C38781b> R = C41358y.m120002R(list, 1);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(R, 10));
        for (C38781b b : R) {
            arrayList.add(m96447b(b));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo74210a(C38780a aVar, String str) {
        C41536l.m120489i(aVar, "result");
        C41536l.m120489i(str, "loanName");
        ArrayList arrayList = new ArrayList();
        if (aVar.mo92401a().isEmpty()) {
            arrayList.add(new C32648f.C32649a("text.loan.repayments.history.empty.state.text", "text.loan.repayments.history.empty.state.description"));
        } else {
            arrayList.add(m96451f(aVar, str));
            if (aVar.mo92401a().size() == 1) {
                arrayList.add(m96449d(aVar, false));
                arrayList.add(C32648f.C32651c.f80372a);
            } else {
                arrayList.add(m96450e(this, aVar, false, 2, (Object) null));
                arrayList.addAll(m96452g(aVar.mo92401a()));
                arrayList.add(C32648f.C32651c.f80372a);
            }
        }
        return arrayList;
    }
}
