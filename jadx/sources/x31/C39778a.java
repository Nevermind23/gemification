package x31;

import android.database.Cursor;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import y31.C40019a;

/* renamed from: x31.a */
public final class C39778a {

    /* renamed from: x31.a$a */
    public static final class C39779a implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C40019a) obj).mo93839a(), ((C40019a) obj2).mo93839a());
        }
    }

    /* renamed from: b */
    private final String m115546b(Cursor cursor, int i) {
        String string;
        if (i < 0 || (string = cursor.getString(i)) == null) {
            return "";
        }
        return string;
    }

    /* renamed from: a */
    public final List mo93510a(Cursor cursor) {
        boolean z;
        Cursor cursor2 = cursor;
        C41536l.m120489i(cursor2, "cursor");
        HashMap hashMap = new HashMap();
        while (cursor.moveToNext()) {
            String b = m115546b(cursor2, cursor2.getColumnIndex("data1"));
            String b2 = m115546b(cursor2, cursor2.getColumnIndex("data4"));
            String b3 = m115546b(cursor2, cursor2.getColumnIndex("display_name"));
            if (b2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b2 = C40439w.m117103B(C40439w.m117103B(b, " ", "", false, 4, (Object) null), "-", "", false, 4, (Object) null);
            }
            C40019a aVar = new C40019a(b3, b, b2, m115546b(cursor2, cursor2.getColumnIndex("photo_uri")));
            String b4 = aVar.mo93840b();
            String a = aVar.mo93839a();
            if (!hashMap.containsKey(b4 + "-" + a)) {
                String b5 = aVar.mo93840b();
                String a2 = aVar.mo93839a();
                hashMap.put(b5 + "-" + a2, aVar);
            }
        }
        cursor.close();
        Collection values = hashMap.values();
        C41536l.m120488h(values, "hashMap.values");
        return C41358y.m120030t0(C41358y.m120036z0(values), new C39779a());
    }
}
