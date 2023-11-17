package p160la;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p134ja.C6763a;
import p212pa.C7778b;
import p212pa.C7779c;
import p225qa.C7979i;

/* renamed from: la.e */
public abstract class C7034e {
    /* renamed from: a */
    private static List m27237a(C7979i iVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (iVar.mo23103h()) {
            arrayList.add(new C7033d(iVar.mo23104j()));
        }
        if (iVar.mo23101b()) {
            arrayList.add(new C7032c(iVar.mo23102c(), context));
        }
        if (iVar.mo23099Y()) {
            arrayList.add(new C7030a(iVar.mo23098X()));
        }
        if (iVar.mo23100a()) {
            arrayList.add(new C7031b(iVar.mo23105k()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m27238b(C7979i iVar, Context context) {
        List<C7034e> a = m27237a(iVar, context);
        if (a.isEmpty()) {
            C6763a.m26371e().mo20804a("No validators found for PerfMetric.");
            return false;
        }
        for (C7034e c : a) {
            if (!c.mo21243c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m27239d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40}));
        } else if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100}));
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    /* renamed from: e */
    public static String m27240e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (C7778b bVar : C7778b.values()) {
                if (bVar.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    /* renamed from: f */
    public static String m27241f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith("_")) {
            return null;
        } else {
            for (C7779c cVar : C7779c.values()) {
                if (cVar.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith("_st_")) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
    }

    /* renamed from: c */
    public abstract boolean mo21243c();
}
