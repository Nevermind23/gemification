package o31;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import i91.C36370c;
import java.math.BigDecimal;
import java.util.Collection;
import kotlin.jvm.internal.C41536l;
import p669xh.C18763a;

/* renamed from: o31.j */
public abstract class C37603j {

    /* renamed from: a */
    private static final String[] f90347a = {"VISA"};

    /* renamed from: b */
    private static final String[] f90348b = {"MC", "Mastercard"};

    /* renamed from: c */
    private static final String[] f90349c = {"AMEX", "AMEXP", "AMEXGRG", "AMEXD", "American Express"};

    /* renamed from: a */
    public static final boolean m110578a(String str) {
        C41536l.m120489i(str, "<this>");
        if (new BigDecimal(str).compareTo(BigDecimal.ZERO) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final void m110579b(Collection collection, Collection collection2) {
        C41536l.m120489i(collection, "<this>");
        C41536l.m120489i(collection2, "newCollection");
        collection.clear();
        collection.addAll(collection2);
    }

    /* renamed from: c */
    public static final String m110580c(String str) {
        C41536l.m120489i(str, "<this>");
        BigDecimal multiply = new BigDecimal(str).multiply(new BigDecimal(100));
        C41536l.m120488h(multiply, "this.multiply(other)");
        String bigDecimal = multiply.toString();
        C41536l.m120488h(bigDecimal, "this.toBigDecimal().time…gDecimal(100)).toString()");
        return bigDecimal;
    }

    /* renamed from: d */
    public static final String m110581d(String str) {
        C41536l.m120489i(str, "<this>");
        if (C40440x.m117139M(str, ".", false, 2, (Object) null)) {
            return str;
        }
        return str + ".00";
    }

    /* renamed from: e */
    public static final Cursor m110582e(Context context, String str) {
        ContentResolver contentResolver;
        C41536l.m120489i(context, "<this>");
        C41536l.m120489i(str, "searchText");
        if (!C36370c.m107927h(context) || (contentResolver = context.getContentResolver()) == null) {
            return null;
        }
        String B = C40439w.m117103B(C40440x.m117146P0(str).toString(), " ", "", false, 4, (Object) null);
        String B2 = C40439w.m117103B(C40440x.m117146P0(str).toString(), " ", "", false, 4, (Object) null);
        return contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", "data1", "data4", "photo_uri", "sort_key"}, "data4 LIKE ? OR display_name LIKE ? OR data1 LIKE ?", new String[]{"%" + B + "%", "%" + str + "%", "%" + B2 + "%"}, "sort_key");
    }

    /* renamed from: f */
    public static final boolean m110583f(BigDecimal bigDecimal) {
        return (bigDecimal == null || bigDecimal.compareTo(BigDecimal.ZERO) == 0) ? false : true;
    }

    /* renamed from: g */
    public static final C18763a m110584g(String str) {
        C41536l.m120489i(str, "<this>");
        for (String d : f90348b) {
            if (C41536l.m120484d(d, str)) {
                return C18763a.MASTER_CARD;
            }
        }
        for (String d2 : f90347a) {
            if (C41536l.m120484d(d2, str)) {
                return C18763a.VISA;
            }
        }
        for (String d3 : f90349c) {
            if (C41536l.m120484d(d3, str)) {
                return C18763a.AMERICAN_EXPRESS;
            }
        }
        return null;
    }
}
