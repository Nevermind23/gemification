package ef0;

import kotlin.jvm.internal.C41536l;

/* renamed from: ef0.d */
public final class C20229d {

    /* renamed from: a */
    private final Integer f55103a;

    public C20229d(Integer num) {
        this.f55103a = num;
    }

    /* renamed from: a */
    public final Integer mo48674a() {
        return this.f55103a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C20229d) && C41536l.m120484d(this.f55103a, ((C20229d) obj).f55103a);
    }

    public int hashCode() {
        Integer num = this.f55103a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        Integer num = this.f55103a;
        return "InvestorInfoModel(annualIncome=" + num + ")";
    }
}
