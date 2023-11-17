package p060e1;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: e1.n1 */
abstract class C5971n1 {

    /* renamed from: a */
    private static Field f18672a;

    /* renamed from: b */
    private static boolean f18673b;

    C5971n1() {
    }

    /* renamed from: a */
    public abstract void mo19257a(View view);

    /* renamed from: b */
    public abstract float mo19258b(View view);

    /* renamed from: c */
    public abstract void mo19259c(View view);

    /* renamed from: d */
    public abstract void mo19304d(View view, Matrix matrix);

    /* renamed from: e */
    public abstract void mo19370e(View view, int i, int i2, int i3, int i4);

    /* renamed from: f */
    public abstract void mo19260f(View view, float f);

    /* renamed from: g */
    public void mo19392g(View view, int i) {
        if (!f18673b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f18672a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f18673b = true;
        }
        Field field = f18672a;
        if (field != null) {
            try {
                f18672a.setInt(view, i | (field.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: h */
    public abstract void mo19305h(View view, Matrix matrix);

    /* renamed from: i */
    public abstract void mo19306i(View view, Matrix matrix);
}
