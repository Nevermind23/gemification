package p221q6;

import android.util.Log;
import java.util.Locale;
import p182n6.C7252d;

/* renamed from: q6.a */
public class C7895a {

    /* renamed from: a */
    private final String f22860a;

    /* renamed from: b */
    private final String f22861b;

    /* renamed from: c */
    private final C7252d f22862c;

    /* renamed from: d */
    private final int f22863d;

    public C7895a(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str3 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str3);
            }
            sb.append("] ");
            str2 = sb.toString();
        }
        this.f22861b = str2;
        this.f22860a = str;
        this.f22862c = new C7252d(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f22860a, i)) {
            i++;
        }
        this.f22863d = i;
    }

    /* renamed from: a */
    public void mo22863a(String str, Object... objArr) {
        if (mo22866d(3)) {
            Log.d(this.f22860a, mo22865c(str, objArr));
        }
    }

    /* renamed from: b */
    public void mo22864b(String str, Object... objArr) {
        Log.e(this.f22860a, mo22865c(str, objArr));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo22865c(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f22861b.concat(str);
    }

    /* renamed from: d */
    public boolean mo22866d(int i) {
        return this.f22863d <= i;
    }
}
