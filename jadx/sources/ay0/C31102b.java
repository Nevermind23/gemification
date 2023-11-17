package ay0;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p603si.C17799b;

/* renamed from: ay0.b */
public final class C31102b implements C17799b {

    /* renamed from: d */
    private final BigDecimal f77305d;

    /* renamed from: e */
    private final String f77306e;

    public C31102b(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, C11755a.C11756a.f34100b);
        this.f77305d = bigDecimal;
        this.f77306e = str;
    }

    /* renamed from: b */
    public String mo45383b() {
        return C17799b.C17802c.m61542a(this);
    }

    /* renamed from: c */
    public Object[] mo45384c() {
        return new Object[]{this.f77305d};
    }

    /* renamed from: g */
    public boolean mo45386g(String... strArr) {
        boolean z;
        String str;
        C41536l.m120489i(strArr, "inputs");
        try {
            int length = strArr.length;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= length) {
                    return true;
                }
                String str2 = strArr[i];
                String str3 = this.f77306e;
                if (str3 != null) {
                    if (C40439w.m117114r(str2, str3, false, 2, (Object) null)) {
                        str = str2.substring(0, str2.length() - str3.length());
                        C41536l.m120488h(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    } else {
                        str = str2;
                    }
                    if (str != null) {
                        str2 = str;
                    }
                }
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z || new BigDecimal(str2).compareTo(this.f77305d) <= 0) {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                i++;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31102b(BigDecimal bigDecimal, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, (i & 2) != 0 ? null : str);
    }
}
