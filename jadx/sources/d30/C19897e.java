package d30;

import com.github.mikephil.charting.utils.Utils;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: d30.e */
public final class C19897e {

    /* renamed from: a */
    private final String f54400a;

    /* renamed from: b */
    private int f54401b;

    /* renamed from: c */
    private BigDecimal f54402c;

    public C19897e(String str, int i, BigDecimal bigDecimal) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(bigDecimal, "totalAmount");
        this.f54400a = str;
        this.f54401b = i;
        this.f54402c = bigDecimal;
    }

    /* renamed from: a */
    public final String mo48257a() {
        return this.f54400a;
    }

    /* renamed from: b */
    public final int mo48258b() {
        return this.f54401b;
    }

    /* renamed from: c */
    public final BigDecimal mo48259c() {
        return this.f54402c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19897e)) {
            return false;
        }
        C19897e eVar = (C19897e) obj;
        return C41536l.m120484d(this.f54400a, eVar.f54400a) && this.f54401b == eVar.f54401b && C41536l.m120484d(this.f54402c, eVar.f54402c);
    }

    public int hashCode() {
        return (((this.f54400a.hashCode() * 31) + this.f54401b) * 31) + this.f54402c.hashCode();
    }

    public String toString() {
        String str = this.f54400a;
        int i = this.f54401b;
        BigDecimal bigDecimal = this.f54402c;
        return "RequestInfoModel(id=" + str + ", peopleCount=" + i + ", totalAmount=" + bigDecimal + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C19897e(String str, int i, BigDecimal bigDecimal, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "REQUEST_INFO_MODEL" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? new BigDecimal(Utils.DOUBLE_EPSILON) : bigDecimal);
    }
}
