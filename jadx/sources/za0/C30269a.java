package za0;

import da0.C19950d;
import fd0.C20463a;
import g91.C32343x;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ka0.C25694c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import ue1.C43075l;
import za0.C30272c;

/* renamed from: za0.a */
public final class C30269a {

    /* renamed from: a */
    private final Map f76168a = C41340p0.m119902b(C41344r0.m119931m(C41233s.m119492a("Auto deposit", Integer.valueOf(C19950d.icons_24_payment_category_automotive)), C41233s.m119492a("Educational deposit", Integer.valueOf(C19950d.icons_24_payment_category_education)), C41233s.m119492a("Travel deposit", Integer.valueOf(C19950d.icons_24_payment_category_airline)), C41233s.m119492a("Rainy days deposit", Integer.valueOf(C19950d.icons_24_unforeseen_fill)), C41233s.m119492a("Real estate deposit", Integer.valueOf(C19950d.icons_24_general_home)), C41233s.m119492a("Retirement deposit", Integer.valueOf(C19950d.icons_24_pension_fill)), C41233s.m119492a("Special purpose deposit", Integer.valueOf(C19950d.icons_24_special_purposes_fill)), C41233s.m119492a("Startup deposit", Integer.valueOf(C19950d.icons_24_business_fill)), C41233s.m119492a("Other", Integer.valueOf(C19950d.icons_24_security_passcode))), C30270a.f76169d);

    /* renamed from: za0.a$a */
    static final class C30270a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C30270a f76169d = new C30270a();

        C30270a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(String str) {
            C41536l.m120489i(str, "it");
            return Integer.valueOf(C19950d.icons_24_security_passcode);
        }
    }

    /* renamed from: a */
    private final String m91362a(List list, String str) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C40439w.m117115s(((C20463a) obj).mo49003c(), str, true)) {
                break;
            }
        }
        C20463a aVar = (C20463a) obj;
        if (aVar != null) {
            return aVar.mo49001a();
        }
        return null;
    }

    /* renamed from: b */
    public final C30271b mo70588b(List list) {
        C41536l.m120489i(list, "lookups");
        String a = m91362a(list, "deposit.term.question");
        String a2 = m91362a(list, "deposit.term.1.answer");
        String a3 = m91362a(list, "deposit.term.1.hint");
        String a4 = m91362a(list, "deposit.term.2.answer");
        String a5 = m91362a(list, "deposit.term.2.hint");
        return new C30271b(C19950d.ic_deposit_illustration, C32343x.m95388F(a, new Object[0]), C41341q.m119910m(new C30272c.C30275c(C30277e.SPECIFIED_DURATION, C19950d.f54499h, C32343x.m95388F(a2, new Object[0]), C32343x.m95388F(a3, new Object[0])), new C30272c.C30275c(C30277e.UNSPECIFIED_DURATION, C19950d.icons_24_security_passcode, C32343x.m95388F(a4, new Object[0]), C32343x.m95388F(a5, new Object[0]))));
    }

    /* renamed from: c */
    public final C30271b mo70589c(List list) {
        C41536l.m120489i(list, "lookups");
        String a = m91362a(list, "opening.reason.question");
        String a2 = m91362a(list, "opening.reason.1.answer");
        String a3 = m91362a(list, "opening.reason.1.hint");
        String a4 = m91362a(list, "opening.reason.2.answer");
        String a5 = m91362a(list, "opening.reason.2.hint");
        return new C30271b(C19950d.ic_illustration_deposit_reason, C32343x.m95388F(a, new Object[0]), C41341q.m119910m(new C30272c.C30274b(C30276d.ADDITIONAL_MONEY, C19950d.f54498g, C32343x.m95388F(a2, new Object[0]), C32343x.m95388F(a3, new Object[0])), new C30272c.C30274b(C30276d.SPECIFIC_GOAL, C19950d.f54500r, C32343x.m95388F(a4, new Object[0]), C32343x.m95388F(a5, new Object[0]))));
    }

    /* renamed from: d */
    public final C30271b mo70590d(List list) {
        C41536l.m120489i(list, "purposes");
        int i = C19950d.ic_illustration_deposit_purpose;
        String F = C32343x.m95388F("applications.deposits.advisor.deposit.purpose", new Object[0]);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25694c cVar = (C25694c) it.next();
            arrayList.add(new C30272c.C30273a(cVar.mo64207d(), ((Number) C41344r0.m119929k(this.f76168a, cVar.mo64210f())).intValue(), C32343x.m95388F(cVar.mo64204a(), new Object[0]), cVar.mo64210f()));
        }
        return new C30271b(i, F, arrayList);
    }
}
