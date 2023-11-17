package jw0;

import kotlin.jvm.internal.C41536l;
import p190o1.C7397t;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;

/* renamed from: jw0.c */
public final class C36806c {

    /* renamed from: a */
    private final int f88778a;

    /* renamed from: b */
    private final CreditCardSmallPickerView.C13279b.C13281b f88779b;

    /* renamed from: c */
    private final String f88780c;

    /* renamed from: d */
    private final double f88781d;

    /* renamed from: e */
    private final long f88782e;

    /* renamed from: f */
    private final String f88783f;

    public C36806c(int i, CreditCardSmallPickerView.C13279b.C13281b bVar, String str, double d, long j, String str2) {
        C41536l.m120489i(bVar, "selected");
        C41536l.m120489i(str, "titleText");
        C41536l.m120489i(str2, "ccy");
        this.f88778a = i;
        this.f88779b = bVar;
        this.f88780c = str;
        this.f88781d = d;
        this.f88782e = j;
        this.f88783f = str2;
    }

    /* renamed from: a */
    public final long mo89705a() {
        return this.f88782e;
    }

    /* renamed from: b */
    public final double mo89706b() {
        return this.f88781d;
    }

    /* renamed from: c */
    public final String mo89707c() {
        return this.f88783f;
    }

    /* renamed from: d */
    public final CreditCardSmallPickerView.C13279b.C13281b mo89708d() {
        return this.f88779b;
    }

    /* renamed from: e */
    public final int mo89709e() {
        return this.f88778a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36806c)) {
            return false;
        }
        C36806c cVar = (C36806c) obj;
        return this.f88778a == cVar.f88778a && C41536l.m120484d(this.f88779b, cVar.f88779b) && C41536l.m120484d(this.f88780c, cVar.f88780c) && Double.compare(this.f88781d, cVar.f88781d) == 0 && this.f88782e == cVar.f88782e && C41536l.m120484d(this.f88783f, cVar.f88783f);
    }

    /* renamed from: f */
    public final String mo89711f() {
        return this.f88780c;
    }

    public int hashCode() {
        return (((((((((this.f88778a * 31) + this.f88779b.hashCode()) * 31) + this.f88780c.hashCode()) * 31) + Double.doubleToLongBits(this.f88781d)) * 31) + C7397t.m28148a(this.f88782e)) * 31) + this.f88783f.hashCode();
    }

    public String toString() {
        int i = this.f88778a;
        CreditCardSmallPickerView.C13279b.C13281b bVar = this.f88779b;
        String str = this.f88780c;
        double d = this.f88781d;
        long j = this.f88782e;
        String str2 = this.f88783f;
        return "CardPickerUiState(selectedPosition=" + i + ", selected=" + bVar + ", titleText=" + str + ", availableAmount=" + d + ", acctKey=" + j + ", ccy=" + str2 + ")";
    }
}
