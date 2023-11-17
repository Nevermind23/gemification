package g91;

import android.net.Uri;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p244s3.C8175h;

/* renamed from: g91.y0 */
class C32357y0 extends C8175h {

    /* renamed from: i */
    public String f79793i;

    public C32357y0(String str) {
        super(str);
        HashSet hashSet = new HashSet();
        hashSet.add("keycloakSessionToken");
        hashSet.add("timestamp");
        this.f79793i = m95526i(str, hashSet);
    }

    /* renamed from: i */
    private String m95526i(String str, Set set) {
        Uri parse = Uri.parse(str);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String queryParameter = parse.getQueryParameter((String) it.next());
            if (queryParameter != null) {
                str = str.replace(queryParameter, "");
            }
        }
        return str;
    }

    /* renamed from: c */
    public String mo23366c() {
        return this.f79793i;
    }
}
