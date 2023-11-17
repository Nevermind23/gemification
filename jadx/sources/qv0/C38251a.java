package qv0;

import com.github.mikephil.charting.utils.Utils;
import g91.C32319m;
import g91.C32343x;
import iv0.C36552d;
import iv0.C36554f;
import iv0.C36558j;
import iv0.C36559k;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.mobilebank.openbanking.presentation.details.C33425d;
import p394dj.C12137f;

/* renamed from: qv0.a */
public final class C38251a {
    /* renamed from: a */
    public final C33425d.C33434i mo91783a(C36554f fVar) {
        BigDecimal bigDecimal;
        C41536l.m120489i(fVar, "acct");
        String e = fVar.mo89359e();
        if (e == null) {
            e = fVar.mo89358d();
        }
        Double a = fVar.mo89355a();
        if (a != null) {
            bigDecimal = new BigDecimal(String.valueOf(a.doubleValue()));
        } else {
            bigDecimal = BigDecimal.valueOf(Utils.DOUBLE_EPSILON);
        }
        C41536l.m120488h(bigDecimal, "acct.amount?.toBigDecima…: BigDecimal.valueOf(0.0)");
        Amount amount = new Amount(bigDecimal, fVar.mo89357c());
        List<C36552d> b = fVar.mo89356b();
        boolean z = true;
        if (b.size() <= 1) {
            z = false;
        }
        ArrayList arrayList = null;
        if (!z) {
            b = null;
        }
        if (b != null) {
            arrayList = new ArrayList(C41343r.m119925u(b, 10));
            for (C36552d dVar : b) {
                arrayList.add(new Amount(new BigDecimal(String.valueOf(dVar.mo89345a().mo89328a())), dVar.mo89345a().mo89329b()));
            }
        }
        return new C33425d.C33434i(new C12137f(e, amount, arrayList));
    }

    /* renamed from: b */
    public final List mo91784b(C36559k kVar) {
        C41536l.m120489i(kVar, "data");
        List<C36558j> b = kVar.mo89387b();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
        for (C36558j jVar : b) {
            String b2 = C32319m.m95295b(jVar.mo89380a());
            C41536l.m120488h(b2, "formatDate(tr.operationDate)");
            String b3 = jVar.mo89381b();
            if (b3 == null) {
                b3 = "";
            }
            arrayList.add(new C33425d.C33429d(b2, b3, C32343x.m95410Q(jVar.mo89382c().mo63386b(), jVar.mo89382c().mo63385a(), false, 2, (Object) null)));
        }
        return arrayList;
    }

    /* renamed from: c */
    public final C33425d.C33426a mo91785c(C36554f fVar) {
        C41536l.m120489i(fVar, "acct");
        return new C33425d.C33426a(fVar.mo89358d());
    }
}
