package w31;

/* renamed from: w31.a */
public final class C39513a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: l50.r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final p341ge.bog.mobilebank.model.account.ProductProperties.CardBackgroundInfoContainer m114845a(long r4) {
        /*
            r3 = this;
            r0 = 0
            l50.p r1 = p341ge.bog.mobilebank.model.account.ProductProperties.cardsAndDetailsUIModel     // Catch:{ Exception -> 0x003e }
            l50.l r4 = n50.C26371b.m82431a(r1, r4)     // Catch:{ Exception -> 0x003e }
            if (r4 == 0) goto L_0x003e
            java.util.List r4 = r4.mo64522a()     // Catch:{ Exception -> 0x003e }
            if (r4 == 0) goto L_0x003e
            java.util.Iterator r5 = r4.iterator()     // Catch:{ Exception -> 0x003e }
        L_0x0013:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x003e }
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x003e }
            r2 = r1
            l50.r r2 = (l50.C25838r) r2     // Catch:{ Exception -> 0x003e }
            boolean r2 = r2.mo64602z()     // Catch:{ Exception -> 0x003e }
            if (r2 == 0) goto L_0x0013
            goto L_0x0028
        L_0x0027:
            r1 = r0
        L_0x0028:
            l50.r r1 = (l50.C25838r) r1     // Catch:{ Exception -> 0x003e }
            if (r1 != 0) goto L_0x0033
            java.lang.Object r4 = ie1.C41358y.m120009Y(r4)     // Catch:{ Exception -> 0x003e }
            r1 = r4
            l50.r r1 = (l50.C25838r) r1     // Catch:{ Exception -> 0x003e }
        L_0x0033:
            if (r1 == 0) goto L_0x003e
            java.lang.String r4 = r1.mo64595t()     // Catch:{ Exception -> 0x003e }
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = p341ge.bog.mobilebank.model.account.ProductProperties.getCardBackgroundInfo(r4)     // Catch:{ Exception -> 0x003e }
            r0 = r4
        L_0x003e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w31.C39513a.m114845a(long):ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer");
    }

    /* JADX WARNING: type inference failed for: r11v4, types: [ge.bog.designsystem.components.common.Image$Resource] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo93147b(java.util.List r29, java.util.List r30) {
        /*
            r28 = this;
            r0 = r29
            java.lang.String r1 = "filteredAccounts"
            kotlin.jvm.internal.C41536l.m120489i(r0, r1)
            java.lang.String r1 = "allAccounts"
            r2 = r30
            kotlin.jvm.internal.C41536l.m120489i(r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = ie1.C41343r.m119925u(r0, r3)
            r1.<init>(r3)
            java.util.Iterator r0 = r29.iterator()
        L_0x001d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r0.next()
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r3 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r3
            xg.d r10 = new xg.d
            java.lang.String r4 = r3.mo52142i()
            java.lang.String r11 = ""
            if (r4 != 0) goto L_0x0034
            r4 = r11
        L_0x0034:
            java.util.Currency r5 = java.util.Currency.getInstance(r4)
            java.lang.String r4 = "getInstance(account.ccy ?: \"\")"
            kotlin.jvm.internal.C41536l.m120488h(r5, r4)
            java.math.BigDecimal r6 = r3.mo52139g()
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.Iterator r4 = r30.iterator()
        L_0x004c:
            boolean r5 = r4.hasNext()
            r7 = 0
            if (r5 == 0) goto L_0x006c
            java.lang.Object r5 = r4.next()
            r8 = r5
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r8 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r8
            long r8 = r8.mo52146m()
            long r12 = r3.mo52147p()
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 != 0) goto L_0x0068
            r8 = 1
            goto L_0x0069
        L_0x0068:
            r8 = 0
        L_0x0069:
            if (r8 == 0) goto L_0x004c
            goto L_0x006d
        L_0x006c:
            r5 = r7
        L_0x006d:
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem r5 = (p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem) r5
            if (r5 == 0) goto L_0x007c
            long r8 = r5.mo52146m()
            r14 = r28
            ge.bog.mobilebank.model.account.ProductProperties$CardBackgroundInfoContainer r4 = r14.m114845a(r8)
            goto L_0x007f
        L_0x007c:
            r14 = r28
            r4 = r7
        L_0x007f:
            long r12 = r3.mo52146m()
            java.lang.String r8 = r3.mo52148q()
            if (r8 != 0) goto L_0x0090
            java.lang.String r8 = r3.mo52134d()
            if (r8 != 0) goto L_0x0090
            r8 = r11
        L_0x0090:
            java.util.List r9 = ie1.C41339p.m119900e(r10)
            boolean r3 = r3.mo52154v()
            if (r5 == 0) goto L_0x00be
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r15 = r5.mo52143j()
            if (r15 == 0) goto L_0x00be
            java.lang.String r17 = r15.mo52204a()
            if (r17 == 0) goto L_0x00be
            ge.bog.designsystem.components.common.Image$Url r15 = new ge.bog.designsystem.components.common.Image$Url
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 126(0x7e, float:1.77E-43)
            r25 = 0
            r16 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            goto L_0x00cb
        L_0x00be:
            if (r4 == 0) goto L_0x00ca
            int r15 = r4.resId
            ge.bog.designsystem.components.common.Image$Resource r11 = new ge.bog.designsystem.components.common.Image$Resource
            r6 = 2
            r11.<init>(r15, r7, r6, r7)
            r15 = r11
            goto L_0x00cb
        L_0x00ca:
            r15 = r7
        L_0x00cb:
            if (r5 == 0) goto L_0x00d8
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r6 = r5.mo52143j()
            if (r6 == 0) goto L_0x00d8
            java.lang.String r6 = r6.mo52204a()
            goto L_0x00d9
        L_0x00d8:
            r6 = r7
        L_0x00d9:
            if (r6 == 0) goto L_0x00ec
            ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferExternalFile r4 = r5.mo52143j()
            if (r4 == 0) goto L_0x00f6
            boolean r4 = r4.mo52205b()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            goto L_0x00f4
        L_0x00ec:
            if (r4 == 0) goto L_0x00f6
            boolean r4 = r4.isLightText
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
        L_0x00f4:
            r11 = r4
            goto L_0x00f7
        L_0x00f6:
            r11 = r7
        L_0x00f7:
            r16 = 16
            r17 = 0
            ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a r7 = new ge.bog.designsystem.components.accountselector.AccountSelectorItemView$a
            r4 = r7
            r5 = r8
            r6 = r10
            r10 = r7
            r7 = r9
            r8 = r3
            r3 = 0
            r9 = r3
            r3 = r10
            r10 = r15
            r26 = r12
            r12 = r16
            r13 = r17
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            z11.b r4 = new z11.b
            r5 = r26
            r4.<init>(r5, r3)
            r1.add(r4)
            goto L_0x001d
        L_0x011c:
            r14 = r28
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w31.C39513a.mo93147b(java.util.List, java.util.List):java.util.List");
    }
}
