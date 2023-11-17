package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.core.content.res.C0799e;
import androidx.core.provider.C0953g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;

/* renamed from: androidx.core.provider.d */
abstract class C0944d {

    /* renamed from: a */
    private static final Comparator f3563a = new C0943c();

    /* renamed from: androidx.core.provider.d$a */
    static class C0945a {
        /* renamed from: a */
        static Cursor m3400a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    /* renamed from: b */
    private static List m3393b(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    /* renamed from: c */
    private static boolean m3394c(List list, List list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static List m3395d(C0946e eVar, Resources resources) {
        if (eVar.mo3386b() != null) {
            return eVar.mo3386b();
        }
        return C0799e.m3001c(resources, eVar.mo3387c());
    }

    /* renamed from: e */
    static C0953g.C0954a m3396e(Context context, C0946e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo f = m3397f(context.getPackageManager(), eVar, context.getResources());
        if (f == null) {
            return C0953g.C0954a.m3421a(1, (C0953g.C0955b[]) null);
        }
        return C0953g.C0954a.m3421a(0, m3399h(context, eVar, f.authority, cancellationSignal));
    }

    /* renamed from: f */
    static ProviderInfo m3397f(PackageManager packageManager, C0946e eVar, Resources resources) {
        String e = eVar.mo3389e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e);
        } else if (resolveContentProvider.packageName.equals(eVar.mo3390f())) {
            List b = m3393b(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(b, f3563a);
            List d = m3395d(eVar, resources);
            for (int i = 0; i < d.size(); i++) {
                ArrayList arrayList = new ArrayList((Collection) d.get(i));
                Collections.sort(arrayList, f3563a);
                if (m3394c(b, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e + ", but package was not " + eVar.mo3390f());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ int m3398g(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = bArr2[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    /* renamed from: h */
    static C0953g.C0955b[] m3399h(Context context, C0946e eVar, String str, CancellationSignal cancellationSignal) {
        int i;
        int i2;
        int i3;
        Uri uri;
        int i4;
        boolean z;
        int i5;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            int i6 = 0;
            cursor = C0945a.m3400a(context.getContentResolver(), build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{eVar.mo3391g()}, (String) null, cancellationSignal);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    if (columnIndex != -1) {
                        i = cursor.getInt(columnIndex);
                    } else {
                        i = i6;
                    }
                    if (columnIndex4 != -1) {
                        i2 = cursor.getInt(columnIndex4);
                    } else {
                        i2 = i6;
                    }
                    if (columnIndex3 == -1) {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i3 = i;
                        uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    if (columnIndex5 != -1) {
                        i4 = cursor.getInt(columnIndex5);
                    } else {
                        i4 = TextTypeView.SEPARATOR_FULL;
                    }
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i5 = i3;
                        z = false;
                    } else {
                        i5 = i3;
                        z = true;
                    }
                    arrayList2.add(C0953g.C0955b.m3424a(uri, i2, i4, z, i5));
                    i6 = 0;
                }
                arrayList = arrayList2;
            }
            return (C0953g.C0955b[]) arrayList.toArray(new C0953g.C0955b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
