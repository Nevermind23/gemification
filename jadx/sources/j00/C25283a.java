package j00;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;

/* renamed from: j00.a */
public final class C25283a {

    /* renamed from: a */
    public static final C25283a f64955a = new C25283a();

    private C25283a() {
    }

    /* renamed from: a */
    private final Set m80448a(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ResolveInfo) it.next()).activityInfo.packageName);
        }
        return C41358y.m119993D0(arrayList);
    }

    /* renamed from: b */
    private final void m80449b(Context context, Uri uri) {
        Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268435456);
        C41536l.m120488h(addFlags, "Intent(Intent.ACTION_VIE…t.FLAG_ACTIVITY_NEW_TASK)");
        try {
            context.startActivity(addFlags);
        } catch (ActivityNotFoundException unused) {
        }
    }

    /* renamed from: c */
    private final boolean m80450c(Context context, Uri uri) {
        Intent addFlags = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE").addFlags(268436480);
        C41536l.m120488h(addFlags, "Intent(Intent.ACTION_VIE…VITY_REQUIRE_NON_BROWSER)");
        try {
            context.startActivity(addFlags);
            return true;
        } catch (ActivityNotFoundException unused) {
            m80449b(context, uri);
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m80451d(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.fromParts("http", "", (String) null)).addCategory("android.intent.category.BROWSABLE");
        C41536l.m120488h(addCategory, "Intent(Intent.ACTION_VIE…ntent.CATEGORY_BROWSABLE)");
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(addCategory, 0);
        C41536l.m120488h(queryIntentActivities, "pm.queryIntentActivities(browserActivityIntent, 0)");
        Set a = m80448a(queryIntentActivities);
        Intent addCategory2 = new Intent("android.intent.action.VIEW", uri).addCategory("android.intent.category.BROWSABLE");
        C41536l.m120488h(addCategory2, "Intent(Intent.ACTION_VIE…ntent.CATEGORY_BROWSABLE)");
        List<ResolveInfo> queryIntentActivities2 = packageManager.queryIntentActivities(addCategory2, 0);
        C41536l.m120488h(queryIntentActivities2, "pm.queryIntentActivities…ializedActivityIntent, 0)");
        Set C0 = C41358y.m119992C0(m80448a(queryIntentActivities2));
        C0.removeAll(a);
        if (C0.isEmpty()) {
            return false;
        }
        try {
            Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage((String) C41358y.m120006V(C0));
            if (launchIntentForPackage != null) {
                Intent data = launchIntentForPackage.setData(uri);
                C41536l.m120488h(data, "checkNotNull(pm.getLaunc…           }.setData(uri)");
                context.startActivity(data);
                return true;
            }
            throw new IllegalStateException("launchIntent == null".toString());
        } catch (Exception unused) {
            m80449b(context, uri);
            return false;
        }
    }

    /* renamed from: e */
    public final boolean mo63861e(Context context, Uri uri) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(uri, "uri");
        if (Build.VERSION.SDK_INT >= 30) {
            return m80450c(context, uri);
        }
        return m80451d(context, uri);
    }
}
