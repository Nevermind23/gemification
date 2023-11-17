package xf0;

import kotlin.jvm.internal.C41536l;

/* renamed from: xf0.c */
public final class C29764c {

    /* renamed from: a */
    private Integer f75292a;

    public C29764c(Integer num) {
        this.f75292a = num;
    }

    /* renamed from: a */
    public final Integer mo69916a() {
        return this.f75292a;
    }

    /* renamed from: b */
    public final void mo69917b(Integer num) {
        this.f75292a = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29764c) && C41536l.m120484d(this.f75292a, ((C29764c) obj).f75292a);
    }

    public int hashCode() {
        Integer num = this.f75292a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.f75292a;
        return "InvestorInfoUIModel(annualIncome=" + num + ")";
    }
}
