package rq0;

import com.salesforce.marketingcloud.C11398b;
import g91.C32343x;
import j31.C36725a;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem;
import vp0.C39436a;

/* renamed from: rq0.a */
public final class C38329a {

    /* renamed from: a */
    public static final C38330a f91843a = new C38330a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private static final List f91844b = C41341q.m119910m("UNIVERSAL", "STANDART");

    /* renamed from: rq0.a$a */
    public static final class C38330a {
        private C38330a() {
        }

        public /* synthetic */ C38330a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    private final LoanAccountListItem m112626a(C39436a aVar, TransferAccountItem transferAccountItem, LoanAccountSelectorData loanAccountSelectorData) {
        String str;
        TransferExternalFile transferExternalFile;
        String f = aVar.mo93060f();
        if (f == null || (str = C32343x.m95388F(f, new Object[0])) == null) {
            str = aVar.mo93055b();
        }
        String str2 = str;
        String P = C32343x.m95408P(transferAccountItem.mo52139g(), loanAccountSelectorData.mo73222a());
        Long a = aVar.mo93054a();
        String b = aVar.mo93055b();
        BigDecimal g = transferAccountItem.mo52139g();
        String a2 = loanAccountSelectorData.mo73222a();
        C36725a d = aVar.mo93057d();
        TransferExternalFile transferExternalFile2 = null;
        if (d != null) {
            transferExternalFile = new TransferExternalFile(d.mo89542e(), d.mo89541d());
        } else {
            transferExternalFile = null;
        }
        C36725a c = aVar.mo93056c();
        if (c != null) {
            transferExternalFile2 = new TransferExternalFile(c.mo89542e(), c.mo89541d());
        }
        return new LoanAccountListItem(str2, P, a, b, g, transferExternalFile, transferExternalFile2, a2, aVar.mo93058e(), C41536l.m120484d(loanAccountSelectorData.mo73224d(), aVar.mo93054a()));
    }

    /* renamed from: b */
    private final List m112627b(TransferAccounts transferAccounts, Long l) {
        List b;
        TransferExternalFile transferExternalFile;
        boolean z;
        TransferAccount a = transferAccounts.mo52161a();
        if (a == null || (b = a.mo52123b()) == null) {
            return C41341q.m119907j();
        }
        ArrayList<TransferAccountItem> arrayList = new ArrayList<>();
        for (Object next : b) {
            if (C41358y.m119999O(f91844b, ((TransferAccountItem) next).mo52149r())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (TransferAccountItem transferAccountItem : arrayList) {
            String q = transferAccountItem.mo52148q();
            if (q == null) {
                q = transferAccountItem.mo52134d();
            }
            String str = q;
            BigDecimal g = transferAccountItem.mo52139g();
            String i = transferAccountItem.mo52142i();
            C41536l.m120486f(i);
            String P = C32343x.m95408P(g, i);
            long p = transferAccountItem.mo52147p();
            String d = transferAccountItem.mo52134d();
            BigDecimal g2 = transferAccountItem.mo52139g();
            String i2 = transferAccountItem.mo52142i();
            C41536l.m120486f(i2);
            TransferExternalFile h = transferAccountItem.mo52140h();
            TransferExternalFile transferExternalFile2 = null;
            if (h != null) {
                transferExternalFile = new TransferExternalFile(h.mo52205b(), h.mo52204a());
            } else {
                transferExternalFile = null;
            }
            TransferExternalFile j = transferAccountItem.mo52143j();
            if (j != null) {
                transferExternalFile2 = new TransferExternalFile(j.mo52205b(), j.mo52204a());
            }
            TransferExternalFile transferExternalFile3 = transferExternalFile2;
            long p2 = transferAccountItem.mo52147p();
            if (l != null && l.longValue() == p2) {
                z = true;
            } else {
                z = false;
            }
            arrayList2.add(new LoanAccountListItem(str, P, Long.valueOf(p), d, g2, transferExternalFile, transferExternalFile3, i2, (String) null, z, C11398b.f33139r, (DefaultConstructorMarker) null));
        }
        return arrayList2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc A[EDGE_INSN: B:48:0x00cc->B:34:0x00cc ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo91876c(java.util.List r11, p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts r12, p341ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData r13) {
        /*
            r10 = this;
            java.lang.String r0 = "loanAccounts"
            kotlin.jvm.internal.C41536l.m120489i(r11, r0)
            java.lang.String r0 = "transferAccounts"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r13, r0)
            lq0.a r0 = r13.mo73223b()
            lq0.a r1 = lq0.C37124a.RL
            if (r0 != r1) goto L_0x0020
            java.lang.Long r11 = r13.mo73224d()
            java.util.List r11 = r10.m112627b(r12, r11)
            return r11
        L_0x0020:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x002e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r11.next()
            r3 = r2
            vp0.a r3 = (vp0.C39436a) r3
            java.lang.Long r3 = r3.mo93054a()
            boolean r3 = r0.add(r3)
            if (r3 == 0) goto L_0x002e
            r1.add(r2)
            goto L_0x002e
        L_0x0049:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r0 = r1.iterator()
        L_0x0052:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00dc
            java.lang.Object r1 = r0.next()
            vp0.a r1 = (vp0.C39436a) r1
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccount r2 = r12.mo52161a()
            r3 = 0
            if (r2 == 0) goto L_0x00d5
            java.util.List r2 = r2.mo52123b()
            if (r2 == 0) goto L_0x00d5
            java.util.Iterator r2 = r2.iterator()
        L_0x006f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x00cb
            java.lang.Object r4 = r2.next()
            r5 = r4
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r5 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r5
            long r6 = r5.mo52147p()
            java.lang.Long r8 = r1.mo93054a()
            if (r8 != 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            long r8 = r8.longValue()
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x00c7
        L_0x008f:
            java.util.List r5 = r5.mo52151t()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = ie1.C41343r.m119925u(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x00a2:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00ba
            java.lang.Object r7 = r5.next()
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r7 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r7
            long r7 = r7.mo52146m()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r6.add(r7)
            goto L_0x00a2
        L_0x00ba:
            java.lang.Long r5 = r1.mo93054a()
            boolean r5 = ie1.C41358y.m119999O(r6, r5)
            if (r5 == 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r5 = 0
            goto L_0x00c8
        L_0x00c7:
            r5 = 1
        L_0x00c8:
            if (r5 == 0) goto L_0x006f
            goto L_0x00cc
        L_0x00cb:
            r4 = r3
        L_0x00cc:
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r4 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r4
            if (r4 != 0) goto L_0x00d1
            goto L_0x00d5
        L_0x00d1:
            ge.bog.mobilebank.loanactivation.presentation.activation.model.form.account.LoanAccountListItem r3 = r10.m112626a(r1, r4, r13)
        L_0x00d5:
            if (r3 == 0) goto L_0x0052
            r11.add(r3)
            goto L_0x0052
        L_0x00dc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rq0.C38329a.mo91876c(java.util.List, ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccounts, ge.bog.mobilebank.loanactivation.presentation.activation.form.actionsheet.accountselector.model.LoanAccountSelectorData):java.util.List");
    }
}
