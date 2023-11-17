package o31;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.C41536l;

/* renamed from: o31.d */
public abstract class C37594d {
    /* renamed from: a */
    public static final Bitmap m110560a(View view) {
        C41536l.m120489i(view, "<this>");
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    /* renamed from: b */
    public static final boolean m110561b(Date date, Date date2) {
        C41536l.m120489i(date, "<this>");
        C41536l.m120489i(date2, "otherDate");
        if (!m110562c(date, date2) || !m110563d(date, date2) || !m110564e(date, date2)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static final boolean m110562c(Date date, Date date2) {
        C41536l.m120489i(date, "<this>");
        C41536l.m120489i(date2, "other");
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(5);
        instance.setTime(date2);
        if (i == instance.get(5)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static final boolean m110563d(Date date, Date date2) {
        C41536l.m120489i(date, "<this>");
        C41536l.m120489i(date2, "other");
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(2);
        instance.setTime(date2);
        if (i == instance.get(2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static final boolean m110564e(Date date, Date date2) {
        C41536l.m120489i(date, "<this>");
        C41536l.m120489i(date2, "other");
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        int i = instance.get(1);
        instance.setTime(date2);
        if (i == instance.get(1)) {
            return true;
        }
        return false;
    }
}
