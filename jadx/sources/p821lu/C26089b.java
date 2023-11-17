package p821lu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p863pw.C27623a;
import p863pw.C27626d;
import p863pw.C27629g;
import p863pw.C27631i;
import ue1.C43079p;

/* renamed from: lu.b */
public final class C26089b {

    /* renamed from: lu.b$a */
    static final class C26090a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ long f66203d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26090a(long j) {
            super(2);
            this.f66203d = j;
        }

        /* renamed from: a */
        public final Integer invoke(AccountLov accountLov, AccountLov accountLov2) {
            int i;
            if (accountLov.getMainAcctKey() == this.f66203d) {
                i = -1;
            } else if (accountLov2.getMainAcctKey() == this.f66203d) {
                i = 1;
            } else {
                i = C41536l.m120492l(accountLov.getMainAcctKey(), accountLov2.getMainAcctKey());
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: b */
    private final List m81778b(List list, C27631i iVar) {
        Object obj;
        long j;
        boolean z;
        boolean z2;
        List list2 = list;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list2, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((PaymentsCard) it.next()).getAcctKey()));
        }
        hashSet.addAll(arrayList);
        Iterator it2 = iVar.mo67075a().mo67081a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (((C27623a) obj).mo67021s()) {
                break;
            }
        }
        C27623a aVar = (C27623a) obj;
        if (aVar != null) {
            j = aVar.mo67012j();
        } else {
            j = -1;
        }
        long j2 = j;
        List b = iVar.mo67076b();
        ArrayList<C27626d> arrayList2 = new ArrayList<>();
        for (Object next : b) {
            C27626d dVar = (C27626d) next;
            boolean z3 = false;
            if (!(list2 instanceof Collection) || !list.isEmpty()) {
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    PaymentsCard paymentsCard = (PaymentsCard) it3.next();
                    List f = dVar.mo67040f();
                    if (!(f instanceof Collection) || !f.isEmpty()) {
                        Iterator it4 = f.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            if (((C27629g) it4.next()).mo67059a() == paymentsCard.getAcctKey()) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z = true;
                                continue;
                                break;
                            }
                        }
                    }
                    z = false;
                    continue;
                    if (z) {
                        z3 = true;
                        break;
                    }
                }
            }
            if (z3) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C41343r.m119925u(arrayList2, 10));
        for (C27626d e : arrayList2) {
            arrayList3.add(m81781e(this, e, hashSet, false, 4, (Object) null));
        }
        return C41358y.m120030t0(arrayList3, new C26088a(new C26090a(j2)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final int m81779c(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return ((Number) pVar.invoke(obj, obj2)).intValue();
    }

    /* renamed from: d */
    private final AccountLov m81780d(C27626d dVar, HashSet hashSet, boolean z) {
        ArrayList arrayList;
        Object obj;
        AccountLov accountLov = new AccountLov();
        C27629g gVar = (C27629g) C41358y.m120007W(dVar.mo67040f());
        Iterator it = dVar.mo67040f().iterator();
        while (true) {
            arrayList = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hashSet.contains(Long.valueOf(((C27629g) obj).mo67059a()))) {
                break;
            }
        }
        C41536l.m120486f(obj);
        C27629g gVar2 = (C27629g) obj;
        accountLov.setId(gVar.mo67059a());
        accountLov.setAcctNo(dVar.mo67034a());
        accountLov.setCcy(gVar2.mo67061c());
        accountLov.setAvailableAmount(gVar2.mo67060b());
        accountLov.setMainAcctKey(gVar.mo67059a());
        accountLov.setRealAmount(gVar2.mo67066g());
        if (z) {
            arrayList = C41341q.m119903f(m81780d(dVar, hashSet, false));
        }
        accountLov.setSubAccounts(arrayList);
        accountLov.setProductCode(dVar.mo67036c());
        return accountLov;
    }

    /* renamed from: e */
    static /* synthetic */ AccountLov m81781e(C26089b bVar, C27626d dVar, HashSet hashSet, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return bVar.m81780d(dVar, hashSet, z);
    }

    /* renamed from: f */
    public final List mo65002f(List list, C27631i iVar) {
        C41536l.m120489i(list, "cards");
        C41536l.m120489i(iVar, "accountsWrapper");
        return m81778b(list, iVar);
    }
}
