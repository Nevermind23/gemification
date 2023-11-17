package gi0;

import android.database.Cursor;
import hi0.C25032e;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: gi0.b */
public final class C24727b {

    /* renamed from: gi0.b$a */
    public static final class C24728a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C25032e) obj).mo63456a(), ((C25032e) obj2).mo63456a());
        }
    }

    /* renamed from: a */
    private final String m79289a(Cursor cursor, int i) {
        String string;
        if (i < 0 || (string = cursor.getString(i)) == null) {
            return "";
        }
        return string;
    }

    /* renamed from: b */
    public final List mo63118b(Cursor cursor) {
        boolean z;
        Cursor cursor2 = cursor;
        HashMap hashMap = new HashMap();
        while (true) {
            boolean z2 = true;
            if (cursor2 == null || !cursor.moveToNext()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                break;
            }
            String a = m79289a(cursor2, cursor2.getColumnIndex("data1"));
            String a2 = m79289a(cursor2, cursor2.getColumnIndex("data4"));
            String a3 = m79289a(cursor2, cursor2.getColumnIndex("display_name"));
            String a4 = m79289a(cursor2, cursor2.getColumnIndex("photo_uri"));
            if (a2.length() != 0) {
                z2 = false;
            }
            if (z2) {
                a2 = C40439w.m117103B(C40439w.m117103B(a, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null);
            }
            C25032e eVar = new C25032e(a3, a, a4, a2);
            if (!hashMap.containsKey(eVar.mo63457b() + "-" + eVar.mo63456a())) {
                hashMap.put(eVar.mo63457b() + "-" + eVar.mo63456a(), eVar);
            }
        }
        if (cursor2 != null) {
            cursor.close();
        }
        Collection values = hashMap.values();
        C41536l.m120488h(values, "contactsHashMap.values");
        return C41358y.m120030t0(C41358y.m120036z0(values), new C24728a());
    }
}
