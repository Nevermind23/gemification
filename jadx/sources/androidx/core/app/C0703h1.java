package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import androidx.core.util.C1008h;
import java.util.ArrayList;

/* renamed from: androidx.core.app.h1 */
public class C0703h1 {

    /* renamed from: a */
    private final Context f3286a;

    /* renamed from: b */
    private final Intent f3287b;

    /* renamed from: c */
    private CharSequence f3288c;

    /* renamed from: d */
    private ArrayList f3289d;

    /* renamed from: e */
    private ArrayList f3290e;

    /* renamed from: f */
    private ArrayList f3291f;

    /* renamed from: g */
    private ArrayList f3292g;

    public C0703h1(Context context) {
        Activity activity;
        this.f3286a = (Context) C1008h.m3530g(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.f3287b = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            this.f3287b.putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            this.f3287b.putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    /* renamed from: a */
    private void m2721a(String str, ArrayList arrayList) {
        int i;
        String[] stringArrayExtra = this.f3287b.getStringArrayExtra(str);
        if (stringArrayExtra != null) {
            i = stringArrayExtra.length;
        } else {
            i = 0;
        }
        String[] strArr = new String[(arrayList.size() + i)];
        arrayList.toArray(strArr);
        if (stringArrayExtra != null) {
            System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), i);
        }
        this.f3287b.putExtra(str, strArr);
    }

    /* renamed from: c */
    public static C0703h1 m2722c(Activity activity) {
        return new C0703h1(activity);
    }

    /* renamed from: b */
    public Intent mo3132b() {
        return Intent.createChooser(mo3133d(), this.f3288c);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r0.size() > 1) goto L_0x0030;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent mo3133d() {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.f3289d
            r1 = 0
            if (r0 == 0) goto L_0x000c
            java.lang.String r2 = "android.intent.extra.EMAIL"
            r4.m2721a(r2, r0)
            r4.f3289d = r1
        L_0x000c:
            java.util.ArrayList r0 = r4.f3290e
            if (r0 == 0) goto L_0x0017
            java.lang.String r2 = "android.intent.extra.CC"
            r4.m2721a(r2, r0)
            r4.f3290e = r1
        L_0x0017:
            java.util.ArrayList r0 = r4.f3291f
            if (r0 == 0) goto L_0x0022
            java.lang.String r2 = "android.intent.extra.BCC"
            r4.m2721a(r2, r0)
            r4.f3291f = r1
        L_0x0022:
            java.util.ArrayList r0 = r4.f3292g
            r1 = 0
            if (r0 == 0) goto L_0x002f
            int r0 = r0.size()
            r2 = 1
            if (r0 <= r2) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r2 = r1
        L_0x0030:
            java.lang.String r0 = "android.intent.extra.STREAM"
            if (r2 != 0) goto L_0x0065
            android.content.Intent r2 = r4.f3287b
            java.lang.String r3 = "android.intent.action.SEND"
            r2.setAction(r3)
            java.util.ArrayList r2 = r4.f3292g
            if (r2 == 0) goto L_0x005a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x005a
            android.content.Intent r2 = r4.f3287b
            java.util.ArrayList r3 = r4.f3292g
            java.lang.Object r1 = r3.get(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            r2.putExtra(r0, r1)
            android.content.Intent r0 = r4.f3287b
            java.util.ArrayList r1 = r4.f3292g
            androidx.core.app.C0699g1.m2715b(r0, r1)
            goto L_0x007a
        L_0x005a:
            android.content.Intent r1 = r4.f3287b
            r1.removeExtra(r0)
            android.content.Intent r0 = r4.f3287b
            androidx.core.app.C0699g1.m2716c(r0)
            goto L_0x007a
        L_0x0065:
            android.content.Intent r1 = r4.f3287b
            java.lang.String r2 = "android.intent.action.SEND_MULTIPLE"
            r1.setAction(r2)
            android.content.Intent r1 = r4.f3287b
            java.util.ArrayList r2 = r4.f3292g
            r1.putParcelableArrayListExtra(r0, r2)
            android.content.Intent r0 = r4.f3287b
            java.util.ArrayList r1 = r4.f3292g
            androidx.core.app.C0699g1.m2715b(r0, r1)
        L_0x007a:
            android.content.Intent r0 = r4.f3287b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.C0703h1.mo3133d():android.content.Intent");
    }

    /* renamed from: e */
    public C0703h1 mo3134e(CharSequence charSequence) {
        this.f3288c = charSequence;
        return this;
    }

    /* renamed from: f */
    public C0703h1 mo3135f(CharSequence charSequence) {
        this.f3287b.putExtra("android.intent.extra.TEXT", charSequence);
        return this;
    }

    /* renamed from: g */
    public C0703h1 mo3136g(String str) {
        this.f3287b.setType(str);
        return this;
    }

    /* renamed from: h */
    public void mo3137h() {
        this.f3286a.startActivity(mo3132b());
    }
}
