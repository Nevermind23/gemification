package xe0;

import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: xe0.o */
public final class C29757o {

    /* renamed from: a */
    private final BigDecimal f75259a;

    /* renamed from: b */
    private final double f75260b;

    /* renamed from: c */
    private final String f75261c;

    /* renamed from: d */
    private final C29755m f75262d;

    public C29757o(BigDecimal bigDecimal, double d, String str, C29755m mVar) {
        C41536l.m120489i(bigDecimal, "profitRate");
        this.f75259a = bigDecimal;
        this.f75260b = d;
        this.f75261c = str;
        this.f75262d = mVar;
    }

    /* renamed from: a */
    public final C29755m mo69865a() {
        return this.f75262d;
    }

    /* renamed from: b */
    public final String mo69866b() {
        return this.f75261c;
    }

    /* renamed from: c */
    public final double mo69867c() {
        return this.f75260b;
    }

    /* renamed from: d */
    public final BigDecimal mo69868d() {
        return this.f75259a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29757o)) {
            return false;
        }
        C29757o oVar = (C29757o) obj;
        return C41536l.m120484d(this.f75259a, oVar.f75259a) && Double.compare(this.f75260b, oVar.f75260b) == 0 && C41536l.m120484d(this.f75261c, oVar.f75261c) && C41536l.m120484d(this.f75262d, oVar.f75262d);
    }

    public int hashCode() {
        int hashCode = ((this.f75259a.hashCode() * 31) + Double.doubleToLongBits(this.f75260b)) * 31;
        String str = this.f75261c;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C29755m mVar = this.f75262d;
        if (mVar != null) {
            i = mVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        BigDecimal bigDecimal = this.f75259a;
        double d = this.f75260b;
        String str = this.f75261c;
        C29755m mVar = this.f75262d;
        return "ShareSymbolOnlineData(profitRate=" + bigDecimal + ", mktPrice=" + d + ", image=" + str + ", fundamentals=" + mVar + ")";
    }
}
