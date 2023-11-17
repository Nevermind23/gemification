package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.events.C11437g;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.events.predicates.c */
public class C11446c extends C11456h<Double> {

    /* renamed from: com.salesforce.marketingcloud.events.predicates.c$a */
    static /* synthetic */ class C11447a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33293a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.salesforce.marketingcloud.events.g$a[] r0 = com.salesforce.marketingcloud.events.C11437g.C11438a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33293a = r0
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.EQ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33293a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.NEQ     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33293a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.LT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33293a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.GT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33293a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.LTEQ     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33293a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.GTEQ     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.predicates.C11446c.C11447a.<clinit>():void");
        }
    }

    public C11446c(Object obj, C11437g.C11438a aVar, Object obj2) {
        super(obj, aVar, obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Double mo29946a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29948a(Double d, C11437g.C11438a aVar, Double d2) {
        if (d == null || d2 == null) {
            return false;
        }
        double doubleValue = d.doubleValue();
        double doubleValue2 = d2.doubleValue();
        switch (C11447a.f33293a[aVar.ordinal()]) {
            case 1:
                if (doubleValue != doubleValue2) {
                    return false;
                }
                break;
            case 2:
                if (doubleValue == doubleValue2) {
                    return false;
                }
                break;
            case 3:
                if (doubleValue >= doubleValue2) {
                    return false;
                }
                break;
            case 4:
                if (doubleValue <= doubleValue2) {
                    return false;
                }
                break;
            case 5:
                if (doubleValue > doubleValue2) {
                    return false;
                }
                break;
            case 6:
                if (doubleValue < doubleValue2) {
                    return false;
                }
                break;
            default:
                throw new UnsupportedOperationException(String.format(Locale.ENGLISH, "Operator %s not supported for Double data types.", new Object[]{aVar}));
        }
        return true;
    }
}
