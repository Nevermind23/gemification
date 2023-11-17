package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11969r1;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.threatmetrix.TrustDefender.z */
public class C12016z {

    /* renamed from: b */
    private static final String f35388b = C11907h.m43615j(C12016z.class);

    /* renamed from: c */
    private static final Hashtable f35389c = new Hashtable();

    /* renamed from: d */
    private static volatile int f35390d = 0;

    /* renamed from: a */
    private long f35391a = C11969r1.C11986o.m44003c();

    /* renamed from: com.threatmetrix.TrustDefender.z$a */
    public static class C12017a implements Comparator {
        /* renamed from: a */
        public int compare(Map.Entry entry, Map.Entry entry2) {
            return ((Long) entry2.getValue()).compareTo((Long) entry.getValue());
        }
    }

    /* renamed from: a */
    public static void m44147a() {
        f35389c.clear();
    }

    /* renamed from: b */
    public static String m44148b(long j) {
        long c = C11969r1.C11986o.m44003c() - j;
        if (f35390d <= 0 || c <= TimeUnit.MILLISECONDS.convert((long) f35390d, TimeUnit.SECONDS)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(f35389c.entrySet());
        Collections.sort(arrayList, new C12017a());
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("tt:%s;", new Object[]{decimalFormat.format(((double) c) / 1000.0d)}));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String[] split = ((String) entry.getKey()).split(":");
            sb.append(String.format("%s:%s;", new Object[]{split[split.length - 1], decimalFormat.format(((Long) entry.getValue()).doubleValue() / 1000.0d)}));
            i++;
            if (i >= 10) {
                break;
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static void m44149d(int i) {
        if (i > 0) {
            f35390d = i;
        }
    }

    /* renamed from: c */
    public void mo32108c(String str, String str2) {
        long c = C11969r1.C11986o.m44003c() - this.f35391a;
        Hashtable hashtable = f35389c;
        hashtable.put(String.format(Locale.getDefault(), "%03d:%s:%s", new Object[]{Integer.valueOf(hashtable.size()), str, str2}), Long.valueOf(c));
        this.f35391a = C11969r1.C11986o.m44003c();
    }
}
