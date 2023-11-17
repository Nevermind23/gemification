package z20;

import a30.C19159d;
import a30.C19166f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n20.C26359a;
import p366bk.C10320i;
import p832mv.C26305b;
import w10.C29190a;

/* renamed from: z20.c */
public final class C30142c {
    /* renamed from: a */
    public final C19159d mo70495a(C26305b bVar) {
        boolean z;
        String str;
        String str2;
        C41536l.m120489i(bVar, "receiver");
        if (bVar instanceof C26305b.C26306a) {
            C26305b.C26306a aVar = (C26305b.C26306a) bVar;
            String o = aVar.mo65477h().mo67859o();
            if (o == null || o.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = aVar.mo65477h().mo67858n();
            } else {
                str = aVar.mo65477h().mo67859o();
            }
            String a = bVar.mo65470a();
            C19166f fVar = C19166f.CONTACT;
            C26305b.C26306a aVar2 = (C26305b.C26306a) bVar;
            String a2 = C26359a.m82388a(aVar2.mo65477h());
            if (a2 == null) {
                str2 = "";
            } else {
                str2 = a2;
            }
            int a3 = C29190a.m89129a(aVar2.mo65477h());
            String b = C29190a.m89130b(aVar2.mo65477h());
            Long valueOf = Long.valueOf(aVar2.mo65477h().mo67857m());
            if (str == null) {
                str = "";
            }
            return new C19159d(a, fVar, str2, a3, b, valueOf, str, aVar2.mo65477h().mo67859o());
        } else if (bVar instanceof C26305b.C26307b) {
            C26305b.C26307b bVar2 = (C26305b.C26307b) bVar;
            return new C19159d(bVar.mo65470a(), C19166f.PHONE_NUMBER, bVar2.mo65482h(), C10320i.ic_money_request_receiver_phone, (String) null, (Long) null, bVar2.mo65484i(), bVar2.mo65484i(), 48, (DefaultConstructorMarker) null);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public final List mo70496b(List list) {
        C41536l.m120489i(list, "receivers");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo70495a((C26305b) it.next()));
        }
        return arrayList;
    }
}
