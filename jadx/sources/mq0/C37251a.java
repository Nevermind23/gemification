package mq0;

import np0.C37438d;

/* renamed from: mq0.a */
public enum C37251a {
    ODI("credit.offers.RL.conditions.AS.forgiveOdiAmount", C37438d.icons_16_statement_bank_statement),
    FEE("credit.offers.RL.conditions.AS.forgiveFeeAmount", C37438d.icons_16_general_fee),
    INT("credit.offers.RL.conditions.AS.forgiveIntAmount", C37438d.f89974h);
    

    /* renamed from: d */
    private final String f89685d;

    /* renamed from: e */
    private final int f89686e;

    private C37251a(String str, int i) {
        this.f89685d = str;
        this.f89686e = i;
    }

    /* renamed from: b */
    public final int mo90331b() {
        return this.f89686e;
    }

    /* renamed from: c */
    public final String mo90332c() {
        return this.f89685d;
    }
}
