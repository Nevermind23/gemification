package ii0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import i91.C36370c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ii0.b */
public final class C25215b {

    /* renamed from: b */
    public static final C25216a f64782b = new C25216a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f64783a;

    /* renamed from: ii0.b$a */
    public static final class C25216a {
        private C25216a() {
        }

        public /* synthetic */ C25216a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C25215b(Context context) {
        C41536l.m120489i(context, "context");
        this.f64783a = context;
    }

    /* renamed from: b */
    public static /* synthetic */ Cursor m80278b(C25215b bVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return bVar.mo63741a(str);
    }

    /* renamed from: a */
    public final Cursor mo63741a(String str) {
        ContentResolver contentResolver;
        C41536l.m120489i(str, "searchText");
        if (!C36370c.m107927h(this.f64783a) || (contentResolver = this.f64783a.getContentResolver()) == null) {
            return null;
        }
        return contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data1", "data4", "photo_uri", "sort_key"}, "data4 LIKE ? OR display_name LIKE ? OR data1 LIKE ?", new String[]{"%" + str + "%", "%" + str + "%", "%" + str + "%"}, "sort_key");
    }
}
