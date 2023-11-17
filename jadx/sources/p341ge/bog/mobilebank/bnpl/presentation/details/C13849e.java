package p341ge.bog.mobilebank.bnpl.presentation.details;

import a41.C30483b;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.mobilebank.bnpl.presentation.details.C13838d;
import p394dj.C12132a;
import p394dj.C12138g;
import p422fj.C12920b;
import p480jl.C16212c;
import p606sl.C17837c;
import p606sl.C17838d;
import p606sl.C17840f;
import p606sl.C17843i;
import p606sl.C17847m;
import p606sl.C17848n;
import p606sl.C17849o;
import p606sl.C17850p;
import p606sl.C17851q;
import p606sl.C17853s;
import p617ti.C17966a;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.e */
public final class C13849e {

    /* renamed from: a */
    public static final C13850a f41137a = new C13850a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private static final List f41138b = C41341q.m119910m(C17853s.P, C17853s.F);

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.e$a */
    public static final class C13850a {
        private C13850a() {
        }

        public /* synthetic */ C13850a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: e */
    private final List m51595e(C17848n nVar) {
        double d;
        long j;
        double d2;
        double d3;
        ArrayList arrayList = new ArrayList();
        String b = nVar.mo45512b();
        if (b == null) {
            b = "";
        }
        Double a = nVar.mo45511a();
        if (a != null) {
            d = a.doubleValue();
        } else {
            d = 0.0d;
        }
        String Q = C32343x.m95410Q(d, b, false, 2, (Object) null);
        Long f = nVar.mo45517f();
        if (f != null) {
            j = f.longValue();
        } else {
            j = 0;
        }
        String u = C32319m.m95314u(j);
        ArrayList arrayList2 = new ArrayList();
        if (nVar.mo45519h() != null && nVar.mo45519h().doubleValue() > Utils.DOUBLE_EPSILON) {
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.pri.amt", new Object[0]) + ":", C32343x.m95410Q(nVar.mo45519h().doubleValue(), b, false, 2, (Object) null)));
        }
        String str = C32343x.m95388F("text.bnpl.repayments.and.schedule.page.int.amt", new Object[0]) + ":";
        Double e = nVar.mo45515e();
        if (e != null) {
            d2 = e.doubleValue();
        } else {
            d2 = 0.0d;
        }
        arrayList2.add(C41233s.m119492a(str, C32343x.m95410Q(d2, b, false, 2, (Object) null)));
        if (nVar.mo45513c() == null || nVar.mo45513c().doubleValue() <= Utils.DOUBLE_EPSILON) {
            d3 = 0.0d;
        } else {
            d3 = nVar.mo45513c().doubleValue() + Utils.DOUBLE_EPSILON;
        }
        if (nVar.mo45521i() != null && nVar.mo45521i().doubleValue() > Utils.DOUBLE_EPSILON) {
            d3 += nVar.mo45521i().doubleValue();
        }
        if (d3 > Utils.DOUBLE_EPSILON) {
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.fee.amt", new Object[0]) + ":", C32343x.m95410Q(d3, b, false, 2, (Object) null)));
        }
        if (nVar.mo45514d() != null && nVar.mo45514d().doubleValue() > Utils.DOUBLE_EPSILON) {
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.ins.amt", new Object[0]) + ":", C32343x.m95410Q(nVar.mo45514d().doubleValue(), b, false, 2, (Object) null)));
        }
        if (nVar.mo45518g() != null && nVar.mo45518g().doubleValue() > Utils.DOUBLE_EPSILON) {
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.penalty.amt", new Object[0]) + ":", C32343x.m95410Q(nVar.mo45518g().doubleValue(), b, false, 2, (Object) null)));
        }
        C41536l.m120488h(u, "date");
        arrayList.add(new C13838d.C13846h(Q, u, C13838d.C13840b.POSITIVE, arrayList2));
        return arrayList;
    }

    /* renamed from: f */
    private final List m51596f(C17849o oVar) {
        double d;
        long j;
        int i;
        double d2;
        long j2;
        C13838d.C13840b bVar;
        ArrayList arrayList = new ArrayList();
        String a = oVar.mo45523a();
        if (a == null) {
            a = "";
        }
        Double g = oVar.mo45530g();
        if (g != null) {
            d = g.doubleValue();
        } else {
            d = 0.0d;
        }
        String Q = C32343x.m95410Q(d, a, false, 2, (Object) null);
        Long e = oVar.mo45527e();
        if (e != null) {
            j = e.longValue();
        } else {
            j = 0;
        }
        String u = C32319m.m95314u(j);
        ArrayList arrayList2 = new ArrayList();
        if (oVar.mo45529f() == null || oVar.mo45529f().doubleValue() <= Utils.DOUBLE_EPSILON) {
            i = 0;
        } else {
            i = 0;
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.pri.amt", new Object[0]) + ":", C32343x.m95410Q(oVar.mo45529f().doubleValue(), a, false, 2, (Object) null)));
        }
        String str = C32343x.m95388F("text.bnpl.repayments.and.schedule.page.int.amt", new Object[i]) + ":";
        Double d3 = oVar.mo45526d();
        if (d3 != null) {
            d2 = d3.doubleValue();
        } else {
            d2 = 0.0d;
        }
        arrayList2.add(C41233s.m119492a(str, C32343x.m95410Q(d2, a, false, 2, (Object) null)));
        if (oVar.mo45524b() != null && oVar.mo45524b().doubleValue() > Utils.DOUBLE_EPSILON) {
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.fee.amt", new Object[i]) + ":", C32343x.m95410Q(oVar.mo45524b().doubleValue(), a, false, 2, (Object) null)));
        }
        if (oVar.mo45525c() != null && oVar.mo45525c().doubleValue() > Utils.DOUBLE_EPSILON) {
            arrayList2.add(C41233s.m119492a(C32343x.m95388F("text.bnpl.repayments.and.schedule.page.ins.amt", new Object[i]) + ":", C32343x.m95410Q(oVar.mo45525c().doubleValue(), a, false, 2, (Object) null)));
        }
        C41536l.m120488h(u, "date");
        Long e2 = oVar.mo45527e();
        if (e2 != null) {
            j2 = e2.longValue();
        } else {
            j2 = 0;
        }
        if (j2 < Calendar.getInstance().getTimeInMillis()) {
            bVar = C13838d.C13840b.NEGATIVE;
        } else {
            bVar = C13838d.C13840b.PENDING;
        }
        arrayList.add(new C13838d.C13846h(Q, u, bVar, arrayList2));
        return arrayList;
    }

    /* renamed from: a */
    public final C13838d.C13839a mo38212a(C17843i iVar, C17838d dVar) {
        Long l;
        Double d;
        C41536l.m120489i(iVar, "bnplItem");
        C41536l.m120489i(dVar, "bnplDetails");
        long c = iVar.mo45476c();
        String d2 = iVar.mo45477d();
        if (d2 == null) {
            d2 = C32343x.m95388F(iVar.mo45480f(), new Object[0]);
        }
        String str = d2;
        String F = C32343x.m95388F(iVar.mo45480f(), new Object[0]);
        C17840f e = dVar.mo45449e();
        if (e != null) {
            l = e.mo45463a();
        } else {
            l = null;
        }
        C17840f e2 = dVar.mo45449e();
        if (e2 != null) {
            d = e2.mo45464b();
        } else {
            d = null;
        }
        return new C13838d.C13839a(c, str, F, l, d, iVar.mo45475b());
    }

    /* renamed from: b */
    public final C13838d.C13841c mo38213b(List list, long j, C17853s sVar) {
        boolean z;
        boolean z2;
        C41536l.m120489i(list, "productFunctions");
        boolean contains = list.contains("STATEMENT");
        boolean contains2 = list.contains("REVERSAL");
        if (sVar == null || !f41138b.contains(sVar)) {
            z = false;
        } else {
            z = true;
        }
        if (sVar == null || sVar != C17853s.Y) {
            z2 = false;
        } else {
            z2 = true;
        }
        return new C13838d.C13841c(j, contains, contains2, z, z2);
    }

    /* renamed from: c */
    public final List mo38214c(C17847m mVar) {
        Object obj;
        double d;
        String str;
        C17851q c;
        C17837c a;
        Double b;
        boolean z;
        C41536l.m120489i(mVar, "bnplObject");
        ArrayList arrayList = new ArrayList();
        for (C17843i iVar : mVar.mo45506b()) {
            Iterator it = mVar.mo45505a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Long b2 = ((C17838d) obj).mo45446b();
                long c2 = iVar.mo45476c();
                if (b2 != null && b2.longValue() == c2) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C17838d dVar = (C17838d) obj;
            String d2 = iVar.mo45477d();
            if (d2 == null) {
                d2 = C32343x.m95388F(iVar.mo45480f(), new Object[0]);
            }
            String str2 = d2;
            List p = C41341q.m119913p(new C17966a(iVar.mo45474a(), iVar.mo45475b()));
            if (dVar == null || (a = dVar.mo45445a()) == null || (b = a.mo45438b()) == null) {
                d = Utils.DOUBLE_EPSILON;
            } else {
                d = b.doubleValue();
            }
            String h = C32303f.m95197h(iVar.mo45475b());
            C41536l.m120488h(h, "getCcyLogo(bnplItem.ccy)");
            C12132a aVar = new C12132a(str2, p, (List) null, new TextProgressBarView.ProgressModel.Progress((float) (d - iVar.mo45474a()), (float) d, h, C32343x.m95388F("text.bnpl.product.details.page.payed.amt", new Object[0]), C32343x.m95388F("text.bnpl.product.details.page.started.amt", new Object[0]), false, (C12920b) null, (C12920b) null, 224, (DefaultConstructorMarker) null), (C12138g) null, false, false, 20, (DefaultConstructorMarker) null);
            NewProductHeaderView.C13482a aVar2 = NewProductHeaderView.C13482a.COLOR;
            long c3 = iVar.mo45476c();
            if (dVar == null || (c = dVar.mo45447c()) == null || (str = c.mo45538a()) == null) {
                str = "";
            }
            String c4 = C32289b0.m95091c(str);
            C41536l.m120488h(c4, "generateImageUrl(details…s?.merchantLogoURL ?: \"\")");
            arrayList.add(new C30483b(aVar, (String) null, (Image) null, aVar2, c3, new Image.Url(c4, new Image.Resource(C16212c.f45713a, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null)));
        }
        return arrayList;
    }

    /* renamed from: d */
    public final List mo38215d(C17850p pVar) {
        C41536l.m120489i(pVar, "bnplScheduleHisotryItem");
        ArrayList arrayList = new ArrayList();
        for (C17848n e : pVar.mo45533a()) {
            arrayList.addAll(m51595e(e));
        }
        for (C17849o f : pVar.mo45534b()) {
            arrayList.addAll(m51596f(f));
        }
        return arrayList;
    }
}
