package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.C0767a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.core.app.i1 */
public final class C0707i1 implements Iterable {

    /* renamed from: d */
    private final ArrayList f3293d = new ArrayList();

    /* renamed from: e */
    private final Context f3294e;

    /* renamed from: androidx.core.app.i1$a */
    public interface C0708a {
        Intent getSupportParentActivityIntent();
    }

    private C0707i1(Context context) {
        this.f3294e = context;
    }

    /* renamed from: j */
    public static C0707i1 m2731j(Context context) {
        return new C0707i1(context);
    }

    /* renamed from: b */
    public C0707i1 mo3142b(Intent intent) {
        this.f3293d.add(intent);
        return this;
    }

    /* renamed from: c */
    public C0707i1 mo3143c(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f3294e.getPackageManager());
        }
        if (component != null) {
            mo3145i(component);
        }
        mo3142b(intent);
        return this;
    }

    /* renamed from: g */
    public C0707i1 mo3144g(Activity activity) {
        Intent intent;
        if (activity instanceof C0708a) {
            intent = ((C0708a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C0745v.m2795a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f3294e.getPackageManager());
            }
            mo3145i(component);
            mo3142b(intent);
        }
        return this;
    }

    /* renamed from: i */
    public C0707i1 mo3145i(ComponentName componentName) {
        int size = this.f3293d.size();
        try {
            Intent b = C0745v.m2796b(this.f3294e, componentName);
            while (b != null) {
                this.f3293d.add(size, b);
                b = C0745v.m2796b(this.f3294e, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public Iterator iterator() {
        return this.f3293d.iterator();
    }

    /* renamed from: k */
    public Intent mo3147k(int i) {
        return (Intent) this.f3293d.get(i);
    }

    /* renamed from: l */
    public int mo3148l() {
        return this.f3293d.size();
    }

    /* renamed from: n */
    public void mo3149n() {
        mo3150o((Bundle) null);
    }

    /* renamed from: o */
    public void mo3150o(Bundle bundle) {
        if (!this.f3293d.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f3293d.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C0767a.m2902l(this.f3294e, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.f3294e.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
