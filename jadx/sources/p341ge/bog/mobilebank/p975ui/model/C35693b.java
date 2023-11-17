package p341ge.bog.mobilebank.p975ui.model;

import android.content.Context;
import g91.C32359z0;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.model.b */
public enum C35693b {
    DEPOSIT(500, C10328q.bonus_product_deposit),
    LOAN(500, C10328q.bonus_product_loan),
    CREDIT_CARD(1000, C10328q.bonus_product_credit_card),
    MORTGAGE_LOAN(5000, C10328q.bonus_product_mortgage_loan),
    SOLO(7500, C10328q.bonus_product_plus_solo),
    SOLO_CLUB(10000, C10328q.bonus_product_plus_solo_club);
    

    /* renamed from: d */
    private int f86287d;

    /* renamed from: e */
    private int f86288e;

    private C35693b(int i, int i2) {
        this.f86287d = i;
        this.f86288e = i2;
    }

    /* renamed from: b */
    public int mo86824b() {
        return this.f86287d;
    }

    /* renamed from: c */
    public int mo86825c() {
        return this.f86288e;
    }

    /* renamed from: e */
    public String mo86826e(Context context) {
        return context.getString(this.f86288e) + " (" + C32359z0.m95530A((long) this.f86287d) + " " + context.getString(C10328q.f28959ib) + ")";
    }
}
