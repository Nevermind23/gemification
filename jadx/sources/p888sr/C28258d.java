package p888sr;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;

/* renamed from: sr.d */
public final class C28258d {

    /* renamed from: a */
    private final int f71719a;

    /* renamed from: b */
    private final int f71720b;

    /* renamed from: c */
    private final int f71721c;

    /* renamed from: d */
    private final BigDecimal f71722d;

    /* renamed from: e */
    private final InsuranceProviderUiModel f71723e;

    /* renamed from: f */
    private final Boolean f71724f;

    /* renamed from: g */
    private final Boolean f71725g;

    public C28258d(int i, int i2, int i3, BigDecimal bigDecimal, InsuranceProviderUiModel insuranceProviderUiModel, Boolean bool, Boolean bool2) {
        C41536l.m120489i(bigDecimal, "amountValue");
        this.f71719a = i;
        this.f71720b = i2;
        this.f71721c = i3;
        this.f71722d = bigDecimal;
        this.f71723e = insuranceProviderUiModel;
        this.f71724f = bool;
        this.f71725g = bool2;
    }

    /* renamed from: b */
    public static /* synthetic */ C28258d m86853b(C28258d dVar, int i, int i2, int i3, BigDecimal bigDecimal, InsuranceProviderUiModel insuranceProviderUiModel, Boolean bool, Boolean bool2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = dVar.f71719a;
        }
        if ((i4 & 2) != 0) {
            i2 = dVar.f71720b;
        }
        int i5 = i2;
        if ((i4 & 4) != 0) {
            i3 = dVar.f71721c;
        }
        int i6 = i3;
        if ((i4 & 8) != 0) {
            bigDecimal = dVar.f71722d;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        if ((i4 & 16) != 0) {
            insuranceProviderUiModel = dVar.f71723e;
        }
        InsuranceProviderUiModel insuranceProviderUiModel2 = insuranceProviderUiModel;
        if ((i4 & 32) != 0) {
            bool = dVar.f71724f;
        }
        Boolean bool3 = bool;
        if ((i4 & 64) != 0) {
            bool2 = dVar.f71725g;
        }
        return dVar.mo67831a(i, i5, i6, bigDecimal2, insuranceProviderUiModel2, bool3, bool2);
    }

    /* renamed from: a */
    public final C28258d mo67831a(int i, int i2, int i3, BigDecimal bigDecimal, InsuranceProviderUiModel insuranceProviderUiModel, Boolean bool, Boolean bool2) {
        C41536l.m120489i(bigDecimal, "amountValue");
        return new C28258d(i, i2, i3, bigDecimal, insuranceProviderUiModel, bool, bool2);
    }

    /* renamed from: c */
    public final BigDecimal mo67832c() {
        return this.f71722d;
    }

    /* renamed from: d */
    public final InsuranceProviderUiModel mo67833d() {
        return this.f71723e;
    }

    /* renamed from: e */
    public final Boolean mo67834e() {
        return this.f71725g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28258d)) {
            return false;
        }
        C28258d dVar = (C28258d) obj;
        return this.f71719a == dVar.f71719a && this.f71720b == dVar.f71720b && this.f71721c == dVar.f71721c && C41536l.m120484d(this.f71722d, dVar.f71722d) && C41536l.m120484d(this.f71723e, dVar.f71723e) && C41536l.m120484d(this.f71724f, dVar.f71724f) && C41536l.m120484d(this.f71725g, dVar.f71725g);
    }

    /* renamed from: f */
    public final Boolean mo67836f() {
        return this.f71724f;
    }

    /* renamed from: g */
    public final int mo67837g() {
        return this.f71721c;
    }

    /* renamed from: h */
    public final int mo67838h() {
        return this.f71720b;
    }

    public int hashCode() {
        int hashCode = ((((((this.f71719a * 31) + this.f71720b) * 31) + this.f71721c) * 31) + this.f71722d.hashCode()) * 31;
        InsuranceProviderUiModel insuranceProviderUiModel = this.f71723e;
        int i = 0;
        int hashCode2 = (hashCode + (insuranceProviderUiModel == null ? 0 : insuranceProviderUiModel.hashCode())) * 31;
        Boolean bool = this.f71724f;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f71725g;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode3 + i;
    }

    /* renamed from: i */
    public final int mo67840i() {
        return this.f71719a;
    }

    public String toString() {
        int i = this.f71719a;
        int i2 = this.f71720b;
        int i3 = this.f71721c;
        BigDecimal bigDecimal = this.f71722d;
        InsuranceProviderUiModel insuranceProviderUiModel = this.f71723e;
        Boolean bool = this.f71724f;
        Boolean bool2 = this.f71725g;
        return "LoanDecisionInputData(selectedTermIndex=" + i + ", selectedDateIndex=" + i2 + ", selectedCardIndex=" + i3 + ", amountValue=" + bigDecimal + ", chosenProvider=" + insuranceProviderUiModel + ", hasLifeInsurance=" + bool + ", hasIncomeInsurance=" + bool2 + ")";
    }
}
