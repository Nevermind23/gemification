package p271u4;

import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: u4.a */
public final class C8567a {

    /* renamed from: e */
    private static final String f24303e = "a";

    /* renamed from: a */
    private boolean f24304a;

    /* renamed from: b */
    private Object f24305b;

    /* renamed from: c */
    private Field f24306c;

    /* renamed from: d */
    private Field f24307d;

    /* renamed from: u4.a$b */
    public static class C8569b {

        /* renamed from: a */
        public final View f24308a;

        /* renamed from: b */
        public final WindowManager.LayoutParams f24309b;

        private C8569b(View view, WindowManager.LayoutParams layoutParams) {
            this.f24308a = view;
            this.f24309b = layoutParams;
        }
    }

    /* renamed from: a */
    private void m32038a() {
        this.f24304a = true;
        try {
            Class<?> cls = Class.forName("android.view.WindowManagerGlobal");
            this.f24305b = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            Field declaredField = cls.getDeclaredField("mViews");
            this.f24306c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = cls.getDeclaredField("mParams");
            this.f24307d = declaredField2;
            declaredField2.setAccessible(true);
        } catch (InvocationTargetException e) {
            Log.d(f24303e, String.format("could not invoke: %s on %s", new Object[]{"getInstance", "android.view.WindowManagerGlobal"}), e.getCause());
        } catch (ClassNotFoundException e2) {
            Log.d(f24303e, String.format("could not find class: %s", new Object[]{"android.view.WindowManagerGlobal"}), e2);
        } catch (NoSuchFieldException e3) {
            Log.d(f24303e, String.format("could not find field: %s or %s on %s", new Object[]{"mParams", "mViews", "android.view.WindowManagerGlobal"}), e3);
        } catch (NoSuchMethodException e4) {
            Log.d(f24303e, String.format("could not find method: %s on %s", new Object[]{"getInstance", "android.view.WindowManagerGlobal"}), e4);
        } catch (RuntimeException e5) {
            Log.d(f24303e, String.format("reflective setup failed using obj: %s method: %s field: %s", new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}), e5);
        } catch (IllegalAccessException e6) {
            Log.d(f24303e, String.format("reflective setup failed using obj: %s method: %s field: %s", new Object[]{"android.view.WindowManagerGlobal", "getInstance", "mViews"}), e6);
        }
    }

    /* renamed from: b */
    public List mo23916b() {
        if (!this.f24304a) {
            m32038a();
        }
        Object obj = this.f24305b;
        if (obj == null) {
            Log.d(f24303e, "No reflective access to windowmanager object.");
            return null;
        }
        Field field = this.f24306c;
        if (field == null) {
            Log.d(f24303e, "No reflective access to mViews");
            return null;
        } else if (this.f24307d == null) {
            Log.d(f24303e, "No reflective access to mPArams");
            return null;
        } else {
            try {
                List list = (List) field.get(obj);
                List list2 = (List) this.f24307d.get(this.f24305b);
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(new C8569b((View) list.get(i), (WindowManager.LayoutParams) list2.get(i)));
                }
                return arrayList;
            } catch (RuntimeException e) {
                Log.d(f24303e, String.format("Reflective access to %s or %s on %s failed.", new Object[]{this.f24306c, this.f24307d, this.f24305b}), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.d(f24303e, String.format("Reflective access to %s or %s on %s failed.", new Object[]{this.f24306c, this.f24307d, this.f24305b}), e2);
                return null;
            }
        }
    }
}
