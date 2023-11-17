package p248s7;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import p182n6.C7264i;

/* renamed from: s7.w */
public abstract class C8269w {
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[Catch:{ IOException | ClassNotFoundException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d A[Catch:{ IOException | ClassNotFoundException -> 0x0041 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m31111a(java.lang.Object r4) {
        /*
            r0 = 0
            if (r4 == 0) goto L_0x0041
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r1)     // Catch:{ all -> 0x0032 }
            r2.writeObject(r4)     // Catch:{ all -> 0x002e }
            r2.flush()     // Catch:{ all -> 0x002e }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ all -> 0x002e }
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x002e }
            byte[] r1 = r1.toByteArray()     // Catch:{ all -> 0x002e }
            r3.<init>(r1)     // Catch:{ all -> 0x002e }
            r4.<init>(r3)     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r4.readObject()     // Catch:{ all -> 0x002c }
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
            return r1
        L_0x002c:
            r1 = move-exception
            goto L_0x0036
        L_0x002e:
            r4 = move-exception
            r1 = r4
            r4 = r0
            goto L_0x0036
        L_0x0032:
            r4 = move-exception
            r1 = r4
            r4 = r0
            r2 = r4
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
        L_0x003b:
            if (r4 == 0) goto L_0x0040
            r4.close()     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
        L_0x0040:
            throw r1     // Catch:{ IOException | ClassNotFoundException -> 0x0041 }
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p248s7.C8269w.m31111a(java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public static String m31112b(String str, String[] strArr, String[] strArr2) {
        C7264i.m27902k(strArr);
        C7264i.m27902k(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: c */
    public static String m31113c(Context context, String str, String str2) {
        C7264i.m27902k(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = C8259m.m31089a(context);
        }
        return C8259m.m31090b("google_app_id", resources, str2);
    }
}
