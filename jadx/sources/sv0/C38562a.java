package sv0;

import bv0.C31206f;
import g91.C32299e;
import g91.C32343x;
import g91.C32359z0;
import iv0.C36553e;
import iv0.C36554f;
import iv0.C36556h;
import iv0.C36557i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankProductUiModel;
import p341ge.bog.mobilebank.openbanking.presentation.products.BankWithProductsUiModel;

/* renamed from: sv0.a */
public final class C38562a {

    /* renamed from: a */
    public static final C38563a f92414a = new C38563a((DefaultConstructorMarker) null);

    /* renamed from: sv0.a$a */
    public static final class C38563a {
        private C38563a() {
        }

        public /* synthetic */ C38563a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: sv0.a$b */
    public /* synthetic */ class C38564b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f92415a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                iv0.i[] r0 = iv0.C36557i.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                iv0.i r1 = iv0.C36557i.DEPOSIT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                iv0.i r1 = iv0.C36557i.ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                iv0.i r1 = iv0.C36557i.LOAN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f92415a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sv0.C38562a.C38564b.<clinit>():void");
        }
    }

    /* renamed from: a */
    private final BankProductUiModel m113144a(C36553e eVar) {
        String str;
        if (eVar.mo89350b().size() == 1) {
            str = ((C36554f) C41358y.m120007W(eVar.mo89350b())).mo89361f();
        } else {
            str = null;
        }
        return new BankProductUiModel(eVar.mo89349a(), m113145c(eVar.mo89349a()), C32343x.m95410Q(eVar.mo89351c().mo89364a(), eVar.mo89351c().mo89365b(), false, 2, (Object) null), str);
    }

    /* renamed from: c */
    private final int m113145c(C36557i iVar) {
        int i = C38564b.f92415a[iVar.ordinal()];
        if (i == 1) {
            return C31206f.open_banking_product_deposits;
        }
        if (i == 2) {
            return C31206f.open_banking_product_accounts;
        }
        if (i == 3) {
            return C31206f.open_banking_product_loans;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public final List mo92163b(List list) {
        long j;
        C41536l.m120489i(list, "products");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C36556h hVar = (C36556h) it.next();
            String b = hVar.mo89370b();
            String a = hVar.mo89369a();
            String d = hVar.mo89372d();
            Integer valueOf = Integer.valueOf(C32299e.m95163a(hVar.mo89369a()));
            String c = hVar.mo89371c();
            if (c == null) {
                c = "";
            }
            String str = c;
            if (hVar.mo89377h()) {
                j = hVar.mo89375f();
            } else {
                j = hVar.mo89376g();
            }
            String Q = C32359z0.m95546Q(j, "dd.MM.yy HH:mm");
            C41536l.m120488h(Q, "getFormattedDate(\n      …_FORMAT\n                )");
            List<C36553e> e = hVar.mo89373e();
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(e, 10));
            for (C36553e a2 : e) {
                arrayList2.add(m113144a(a2));
            }
            arrayList.add(new BankWithProductsUiModel(b, a, d, valueOf, str, Q, arrayList2, hVar.mo89377h()));
        }
        return arrayList;
    }
}
