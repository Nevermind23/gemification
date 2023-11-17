package vv0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.p2p.data.model.CardsApiModel;

/* renamed from: vv0.b */
public final class C39476b {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0065, code lost:
        if (r15 == true) goto L_0x0069;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final bw0.C31209b m114759a(p341ge.bog.mobilebank.p2p.data.model.CardsApiModel r28, boolean r29) {
        /*
            r27 = this;
            bw0.b r25 = new bw0.b
            long r1 = r28.getCardId()
            java.lang.String r3 = r28.getCardClass()
            java.lang.String r4 = r28.getCardClassCode()
            java.lang.String r5 = r28.getCardType()
            java.lang.String r6 = r28.getProductCode()
            java.lang.String r7 = r28.getSubProductCode()
            long r8 = r28.getClientKey()
            java.lang.String r10 = r28.getLastFour()
            long r11 = r28.getExpDate()
            long r13 = r28.getAcctKey()
            java.lang.String r15 = r28.getAcctNo()
            java.lang.String r16 = r28.getCcy()
            java.lang.String r17 = r28.getPan2()
            java.lang.String r18 = r28.getCardName()
            double r19 = r28.getAvailableAmountBaseCcy()
            java.lang.String r0 = "Y"
            r21 = r15
            if (r29 == 0) goto L_0x0049
            java.lang.String r15 = r28.getDefaultAcc()
            goto L_0x004d
        L_0x0049:
            java.lang.String r15 = r28.isDefault()
        L_0x004d:
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r15, r0)
            r22 = r0
            if (r29 == 0) goto L_0x0075
            java.lang.String r15 = r28.getAcctDesc()
            if (r15 == 0) goto L_0x0068
            int r15 = r15.length()
            r0 = 1
            if (r15 <= 0) goto L_0x0064
            r15 = r0
            goto L_0x0065
        L_0x0064:
            r15 = 0
        L_0x0065:
            if (r15 != r0) goto L_0x0068
            goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = r28.getAcctDesc()
            goto L_0x008e
        L_0x0070:
            java.lang.String r0 = r28.getAcctNo()
            goto L_0x008e
        L_0x0075:
            java.lang.String r0 = r28.getNameDictionaryKey()
            if (r0 == 0) goto L_0x0084
            r15 = 0
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r0 = g91.C32343x.m95388F(r0, r15)
            if (r0 != 0) goto L_0x008e
        L_0x0084:
            java.lang.String r0 = r28.getNameDictionaryValue()
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = r28.getCardClass()
        L_0x008e:
            r26 = r0
            ge.bog.mobilebank.shared.data.ExternalFileEntity r0 = r28.getCardImage()
            j31.a r23 = r0.asDomainModel()
            ge.bog.mobilebank.shared.data.ExternalFileEntity r0 = r28.getCardSmallImage()
            j31.a r24 = r0.asDomainModel()
            r0 = r25
            r15 = r21
            r21 = r22
            r22 = r26
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r10, r11, r13, r15, r16, r17, r18, r19, r21, r22, r23, r24)
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: vv0.C39476b.m114759a(ge.bog.mobilebank.p2p.data.model.CardsApiModel, boolean):bw0.b");
    }

    /* renamed from: b */
    public final List mo93106b(List list, boolean z) {
        C41536l.m120489i(list, "cardsApiModels");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m114759a((CardsApiModel) it.next(), z));
        }
        return arrayList;
    }
}
