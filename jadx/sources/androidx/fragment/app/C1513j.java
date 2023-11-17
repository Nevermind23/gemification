package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* renamed from: androidx.fragment.app.j */
public abstract class C1513j {
    /* renamed from: b */
    public Fragment mo4716b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo4327c(int i);

    /* renamed from: d */
    public abstract boolean mo4328d();
}
