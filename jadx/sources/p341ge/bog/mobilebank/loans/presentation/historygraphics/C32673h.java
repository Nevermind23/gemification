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
import tr0.C38788i;
import tr0.C38791l;
import tr0.C38792m;
import zr0.C40247d;

/* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.h */
public final class C32673h {

    /* renamed from: a */
    public static final C32674a f80426a = new C32674a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.loans.presentation.historygraphics.h$a */
    public static final class C32674a {
        private C32674a() {
        }

        public /* synthetic */ C32674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: b */
    private final List m96536b(List list) {
        List<C38791l> R = C41358y.m120002R(list, 1);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(R, 10));
        for (C38791l f : R) {
            arrayList.add(m96540f(f));
        }
        return arrayList;
    }

    /* renamed from: c */
    private final C32648f.C32653e m96537c(C38788i iVar, boolean z) {
        int i = C37129d.first_item_image;
        BigDecimal i2 = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92480i();
        Long f = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92476f();
        String a = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92470a();
        C40247d[] dVarArr = new C40247d[5];
        BigDecimal g = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92477g();
        if (g == null) {
            g = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[0] = new C40247d(g, "text.lnd_schedule_col_names.pri_amt", ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92470a());
        BigDecimal e = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92474e();
        if (e == null) {
            e = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[1] = new C40247d(e, "text.lnd_schedule_col_names.int_amt", ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92470a());
        String c = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92472c();
        BigDecimal b = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92471b();
        if (b == null) {
            b = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[2] = new C40247d(b, c, ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92470a());
        BigDecimal d = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92473d();
        if (d == null) {
            d = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[3] = new C40247d(d, "text.lnd_schedule_col_names.ins_amt", ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92470a());
        BigDecimal h = ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92478h();
        if (h == null) {
            h = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[4] = new C40247d(h, "text.lnd_schedule_col_names.rli_amt", ((C38791l) C41358y.m120007W(iVar.mo92456a())).mo92470a());
        List m = C41341q.m119910m(dVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object next : m) {
            if (C37603j.m110583f(((C40247d) next).mo94196a())) {
                arrayList.add(next);
            }
        }
        return new C32648f.C32653e(i, a, i2, f, "text.loan.schedule.page.next.payment", false, arrayList, z, 32, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    static /* synthetic */ C32648f.C32653e m96538d(C32673h hVar, C38788i iVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return hVar.m96537c(iVar, z);
    }

    /* renamed from: e */
    private final List m96539e(C38791l lVar) {
        C40247d[] dVarArr = new C40247d[5];
        BigDecimal g = lVar.mo92477g();
        if (g == null) {
            g = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[0] = new C40247d(g, "text.lnd_schedule_col_names.pri_amt", lVar.mo92470a());
        BigDecimal e = lVar.mo92474e();
        if (e == null) {
            e = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[1] = new C40247d(e, "text.lnd_schedule_col_names.int_amt", lVar.mo92470a());
        String c = lVar.mo92472c();
        BigDecimal b = lVar.mo92471b();
        if (b == null) {
            b = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[2] = new C40247d(b, c, lVar.mo92470a());
        BigDecimal d = lVar.mo92473d();
        if (d == null) {
            d = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[3] = new C40247d(d, "text.lnd_schedule_col_names.ins_amt", lVar.mo92470a());
        BigDecimal h = lVar.mo92478h();
        if (h == null) {
            h = new BigDecimal(Utils.DOUBLE_EPSILON);
        }
        dVarArr[4] = new C40247d(h, "text.lnd_schedule_col_names.rli_amt", lVar.mo92470a());
        List m = C41341q.m119910m(dVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object next : m) {
            if (C37603j.m110583f(((C40247d) next).mo94196a())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private final C32648f.C32654f m96540f(C38791l lVar) {
        String str;
        Long f = lVar.mo92476f();
        C41536l.m120486f(f);
        String b = C32319m.m95295b(f.longValue());
        C41536l.m120488h(b, "formatDate(scheduleData.payDate!!)");
        BigDecimal i = lVar.mo92480i();
        if (i != null) {
            String a = lVar.mo92470a();
            C41536l.m120486f(a);
            str = C32343x.m95408P(i, a);
        } else {
            str = null;
        }
        C41536l.m120486f(str);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(m96539e(lVar));
        C41238w wVar = C41238w.f97225a;
        return new C32648f.C32654f(b, str, true, arrayList);
    }

    /* renamed from: g */
    private final C32648f.C32650b m96541g(C38788i iVar, String str) {
        BigDecimal b;
        C38792m b2 = iVar.mo92457b();
        String str2 = null;
        if (!(b2 == null || (b = b2.mo92483b()) == null)) {
            C38792m b3 = iVar.mo92457b();
            if (b3 != null) {
                str2 = b3.mo92482a();
            }
            C41536l.m120486f(str2);
            str2 = C32343x.m95408P(b, str2);
        }
        return new C32648f.C32650b(C37129d.ic_pdf, String.valueOf(str2), str, "text.loan.schedule.page.total.amount", "text.loan.schedule.page.download.schedule.button");
    }

    /* renamed from: a */
    public final List mo74279a(C38788i iVar, String str) {
        C41536l.m120489i(iVar, "result");
        C41536l.m120489i(str, "loanName");
        ArrayList arrayList = new ArrayList();
        if (iVar.mo92456a().isEmpty()) {
            arrayList.add(new C32648f.C32649a("text.loan.schedule.empty.state.text", "text.loan.schedule.empty.state.description"));
        } else {
            arrayList.add(m96541g(iVar, str));
            if (iVar.mo92456a().size() == 1) {
                arrayList.add(m96537c(iVar, false));
                arrayList.add(C32648f.C32651c.f80372a);
            } else {
                arrayList.add(m96538d(this, iVar, false, 2, (Object) null));
                arrayList.addAll(m96536b(iVar.mo92456a()));
                arrayList.add(C32648f.C32651c.f80372a);
            }
        }
        return arrayList;
    }
}
