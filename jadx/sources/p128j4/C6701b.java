package p128j4;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p154l4.C6888f;
import p334z4.C9207a;

/* renamed from: j4.b */
abstract class C6701b {
    /* renamed from: a */
    static List m26136a(View view) {
        Class<C6701b> cls = C6701b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup j = C6888f.m26746j(view);
            if (j != null) {
                for (View view2 : C6888f.m26738b(j)) {
                    if (view != view2) {
                        arrayList.addAll(m26138c(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|(1:6)|7|(1:9)|10|11|(2:13|(1:15))|16|17|(4:20|(2:24|33)|29|18)|30|25) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0053 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0062 A[Catch:{ all -> 0x007f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List m26137b(android.view.View r6) {
        /*
            java.lang.Class<j4.b> r0 = p128j4.C6701b.class
            boolean r1 = p334z4.C9207a.m34024c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r1.<init>()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = p154l4.C6888f.m26745i(r6)     // Catch:{ all -> 0x007f }
            r1.add(r3)     // Catch:{ all -> 0x007f }
            java.lang.Object r3 = r6.getTag()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0023
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007f }
            r1.add(r3)     // Catch:{ all -> 0x007f }
        L_0x0023:
            java.lang.CharSequence r3 = r6.getContentDescription()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x0030
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x007f }
            r1.add(r3)     // Catch:{ all -> 0x007f }
        L_0x0030:
            int r3 = r6.getId()     // Catch:{ NotFoundException -> 0x0053 }
            r4 = -1
            if (r3 == r4) goto L_0x0053
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ NotFoundException -> 0x0053 }
            int r6 = r6.getId()     // Catch:{ NotFoundException -> 0x0053 }
            java.lang.String r6 = r3.getResourceName(r6)     // Catch:{ NotFoundException -> 0x0053 }
            java.lang.String r3 = "/"
            java.lang.String[] r6 = r6.split(r3)     // Catch:{ NotFoundException -> 0x0053 }
            int r3 = r6.length     // Catch:{ NotFoundException -> 0x0053 }
            r4 = 2
            if (r3 != r4) goto L_0x0053
            r3 = 1
            r6 = r6[r3]     // Catch:{ NotFoundException -> 0x0053 }
            r1.add(r6)     // Catch:{ NotFoundException -> 0x0053 }
        L_0x0053:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            r6.<init>()     // Catch:{ all -> 0x007f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x007f }
        L_0x005c:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x007f }
            if (r3 == 0) goto L_0x007e
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x007f }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x007f }
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x007f }
            if (r4 != 0) goto L_0x005c
            int r4 = r3.length()     // Catch:{ all -> 0x007f }
            r5 = 100
            if (r4 > r5) goto L_0x005c
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x007f }
            r6.add(r3)     // Catch:{ all -> 0x007f }
            goto L_0x005c
        L_0x007e:
            return r6
        L_0x007f:
            r6 = move-exception
            p334z4.C9207a.m34023b(r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p128j4.C6701b.m26137b(android.view.View):java.util.List");
    }

    /* renamed from: c */
    static List m26138c(View view) {
        Class<C6701b> cls = C6701b.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (view instanceof EditText) {
                return arrayList;
            }
            if (view instanceof TextView) {
                String charSequence = ((TextView) view).getText().toString();
                if (!charSequence.isEmpty() && charSequence.length() < 100) {
                    arrayList.add(charSequence.toLowerCase());
                }
                return arrayList;
            }
            for (View c : C6888f.m26738b(view)) {
                arrayList.addAll(m26138c(c));
            }
            return arrayList;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: d */
    static boolean m26139d(String str, List list) {
        Class<C6701b> cls = C6701b.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (str.contains((String) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: e */
    static boolean m26140e(List list, List list2) {
        Class<C6701b> cls = C6701b.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (m26139d((String) it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }

    /* renamed from: f */
    static boolean m26141f(String str, String str2) {
        Class<C6701b> cls = C6701b.class;
        if (C9207a.m34024c(cls)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return false;
        }
    }
}
