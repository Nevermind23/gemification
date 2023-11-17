package p158l8;

import android.content.ContentResolver;
import android.provider.Settings;

/* renamed from: l8.a */
public class C7014a {
    /* renamed from: a */
    public float mo21227a(ContentResolver contentResolver) {
        return Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
    }
}
