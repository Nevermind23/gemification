package androidx.core.p016os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.o */
final class C0925o implements C0926p {

    /* renamed from: c */
    private static final Locale[] f3543c = new Locale[0];

    /* renamed from: d */
    private static final Locale f3544d = new Locale("en", "XA");

    /* renamed from: e */
    private static final Locale f3545e = new Locale("ar", "XB");

    /* renamed from: f */
    private static final Locale f3546f = C0918j.m3350b("en-Latn");

    /* renamed from: a */
    private final Locale[] f3547a;

    /* renamed from: b */
    private final String f3548b;

    C0925o(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f3547a = f3543c;
            this.f3548b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    m3368c(sb, locale2);
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
                i++;
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.f3547a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f3548b = sb.toString();
    }

    /* renamed from: c */
    static void m3368c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public String mo3371a() {
        return this.f3548b;
    }

    /* renamed from: b */
    public Object mo3372b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0925o)) {
            return false;
        }
        Locale[] localeArr = ((C0925o) obj).f3547a;
        if (this.f3547a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f3547a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f3547a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        for (Locale hashCode : this.f3547a) {
            i = (i * 31) + hashCode.hashCode();
        }
        return i;
    }

    public boolean isEmpty() {
        return this.f3547a.length == 0;
    }

    public int size() {
        return this.f3547a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f3547a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f3547a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
