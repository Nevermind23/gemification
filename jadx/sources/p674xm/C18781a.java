package p674xm;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: xm.a */
public enum C18781a {
    SC_CITY("text.card.applications.choose.city", "CITYID", (String) null, 4, (C18781a) null),
    SC_DISTRICT("text.card.applications.choose.district", "DISTRICT", r0),
    SC_DEPARTMENT("text.card.applications.choose.department", "STREET", r0),
    DELIVERY_CITY("text.applications.debitcard.delivery.person.choose.city", "DELIVERY_CITY", (String) null, 4, (C18781a) null),
    DELIVERY_DISTRICT("text.applications.debitcard.delivery.person.choose.district", "DELIVERY_DISTRICT", r1),
    INSTANT_COUNTRY("text.order.iic.card.choose.country", "INSTANT_COUNTRY", (String) null, 4, (C18781a) null),
    INSTANT_CITY("text.order.iic.card.choose.city", "INSTANT_CITY", r8),
    INSTANT_SERVICE_CENTER("text.order.iic.card.choose.post.office", "INSTANT_POST_OFFICE", r8),
    INSTANT_DELIVERY_DISTRICT("text.applications.debitcard.delivery.person.choose.district", "INSTANT_DELIVERY_DISTRICT", (String) null, 4, (C18781a) null);
    

    /* renamed from: g */
    public static final C18782a f52495g = null;

    /* renamed from: d */
    private final String f52506d;

    /* renamed from: e */
    private final String f52507e;

    /* renamed from: f */
    private final C18781a f52508f;

    /* renamed from: xm.a$a */
    public static final class C18782a {
        private C18782a() {
        }

        public /* synthetic */ C18782a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18781a mo46584a(String str) {
            C41536l.m120489i(str, C11755a.C11756a.f34100b);
            for (C18781a aVar : C18781a.values()) {
                if (C41536l.m120484d(aVar.mo46582e(), str)) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* renamed from: xm.a$b */
    public /* synthetic */ class C18783b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52509a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                xm.a[] r0 = p674xm.C18781a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xm.a r1 = p674xm.C18781a.SC_CITY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                xm.a r1 = p674xm.C18781a.SC_DISTRICT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                xm.a r1 = p674xm.C18781a.DELIVERY_CITY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                xm.a r1 = p674xm.C18781a.INSTANT_COUNTRY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xm.a r1 = p674xm.C18781a.INSTANT_CITY     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f52509a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p674xm.C18781a.C18783b.<clinit>():void");
        }
    }

    static {
        f52495g = new C18782a((DefaultConstructorMarker) null);
    }

    private C18781a(String str, String str2, C18781a aVar) {
        this.f52506d = str;
        this.f52507e = str2;
        this.f52508f = aVar;
    }

    /* renamed from: b */
    public final C18781a mo46580b() {
        return this.f52508f;
    }

    /* renamed from: c */
    public final String mo46581c() {
        return this.f52506d;
    }

    /* renamed from: e */
    public final String mo46582e() {
        return this.f52507e;
    }

    /* renamed from: f */
    public final C18781a mo46583f() {
        int i = C18783b.f52509a[ordinal()];
        if (i == 1) {
            return SC_DISTRICT;
        }
        if (i == 2) {
            return SC_DEPARTMENT;
        }
        if (i == 3) {
            return DELIVERY_DISTRICT;
        }
        if (i == 4) {
            return INSTANT_CITY;
        }
        if (i != 5) {
            return null;
        }
        return INSTANT_SERVICE_CENTER;
    }
}
