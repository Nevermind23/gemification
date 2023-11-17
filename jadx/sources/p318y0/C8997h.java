package p318y0;

import android.content.ContentResolver;
import android.database.Cursor;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: y0.h */
public final class C8997h {

    /* renamed from: a */
    public static final C8997h f25027a = new C8997h();

    private C8997h() {
    }

    /* renamed from: a */
    public static final List m33290a(Cursor cursor) {
        C41536l.m120489i(cursor, "cursor");
        List a = cursor.getNotificationUris();
        C41536l.m120486f(a);
        return a;
    }

    /* renamed from: b */
    public static final void m33291b(Cursor cursor, ContentResolver contentResolver, List list) {
        C41536l.m120489i(cursor, "cursor");
        C41536l.m120489i(contentResolver, "cr");
        C41536l.m120489i(list, "uris");
        cursor.setNotificationUris(contentResolver, list);
    }
}
