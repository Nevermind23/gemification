package p297w4;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.C2626d;
import com.facebook.login.C2671a;
import p149l.C6856b;
import p149l.C6859d;
import p334z4.C9207a;

/* renamed from: w4.e */
public class C8796e {

    /* renamed from: a */
    private Uri f24689a;

    public C8796e(String str, Bundle bundle) {
        this.f24689a = m32767a(str, bundle == null ? new Bundle() : bundle);
    }

    /* renamed from: a */
    public static Uri m32767a(String str, Bundle bundle) {
        Class<C8796e> cls = C8796e.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            String b = C8845v.m32932b();
            return C8769a0.m32662e(b, C2626d.m10144o() + C11110u2.f31950c + "dialog/" + str, bundle);
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo24227b(Activity activity, String str) {
        if (C9207a.m34024c(this)) {
            return false;
        }
        try {
            C2671a.m10386a();
            C6856b a = new C6856b.C6857a((C6859d) null).mo20931a();
            a.f20535a.setPackage(str);
            a.f20535a.addFlags(1073741824);
            try {
                a.mo20930a(activity, this.f24689a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return false;
        }
    }
}
