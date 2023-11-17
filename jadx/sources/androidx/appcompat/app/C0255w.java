package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.view.C0267d;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0410c;
import androidx.appcompat.widget.C0418e;
import androidx.appcompat.widget.C0425f;
import androidx.appcompat.widget.C0454j;
import androidx.appcompat.widget.C0462l0;
import androidx.appcompat.widget.C0471o;
import androidx.appcompat.widget.C0473o1;
import androidx.appcompat.widget.C0481r;
import androidx.appcompat.widget.C0484s;
import androidx.appcompat.widget.C0502v;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p030c.C2219j;

/* renamed from: androidx.appcompat.app.w */
public class C0255w {

    /* renamed from: b */
    private static final Class[] f1375b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final int[] f1376c = {16843375};

    /* renamed from: d */
    private static final int[] f1377d = {16844160};

    /* renamed from: e */
    private static final int[] f1378e = {16844156};

    /* renamed from: f */
    private static final int[] f1379f = {16844148};

    /* renamed from: g */
    private static final String[] f1380g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: h */
    private static final SimpleArrayMap f1381h = new SimpleArrayMap();

    /* renamed from: a */
    private final Object[] f1382a = new Object[2];

    /* renamed from: androidx.appcompat.app.w$a */
    private static class C0256a implements View.OnClickListener {

        /* renamed from: d */
        private final View f1383d;

        /* renamed from: e */
        private final String f1384e;

        /* renamed from: f */
        private Method f1385f;

        /* renamed from: g */
        private Context f1386g;

        public C0256a(View view, String str) {
            this.f1383d = view;
            this.f1384e = str;
        }

        /* renamed from: a */
        private void m872a(Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f1384e, new Class[]{View.class})) != null) {
                        this.f1385f = method;
                        this.f1386g = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f1383d.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f1383d.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f1384e + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f1383d.getClass() + str);
        }

        public void onClick(View view) {
            if (this.f1385f == null) {
                m872a(this.f1383d.getContext());
            }
            try {
                this.f1385f.invoke(this.f1386g, new Object[]{view});
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (InvocationTargetException e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    /* renamed from: a */
    private void m850a(Context context, View view, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1377d);
            if (obtainStyledAttributes.hasValue(0)) {
                ViewCompat.m3621s0(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1378e);
            if (obtainStyledAttributes2.hasValue(0)) {
                ViewCompat.m3625u0(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f1379f);
            if (obtainStyledAttributes3.hasValue(0)) {
                ViewCompat.m3556I0(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    /* renamed from: b */
    private void m851b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && ViewCompat.m3571Q(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1376c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0256a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: s */
    private View m852s(Context context, String str, String str2) {
        String str3;
        SimpleArrayMap simpleArrayMap = f1381h;
        Constructor<? extends U> constructor = (Constructor) simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1375b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1382a);
    }

    /* renamed from: t */
    private View m853t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue((String) null, "class");
        }
        try {
            Object[] objArr = this.f1382a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i = 0;
                while (true) {
                    String[] strArr = f1380g;
                    if (i < strArr.length) {
                        View s = m852s(context, str, strArr[i]);
                        if (s != null) {
                            return s;
                        }
                        i++;
                    } else {
                        Object[] objArr2 = this.f1382a;
                        objArr2[0] = null;
                        objArr2[1] = null;
                        return null;
                    }
                }
            } else {
                View s2 = m852s(context, str, (String) null);
                Object[] objArr3 = this.f1382a;
                objArr3[0] = null;
                objArr3[1] = null;
                return s2;
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr4 = this.f1382a;
            objArr4[0] = null;
            objArr4[1] = null;
        }
    }

    /* renamed from: u */
    private static Context m854u(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        int i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2219j.f6699P3, 0, 0);
        if (z) {
            i = obtainStyledAttributes.getResourceId(C2219j.f6704Q3, 0);
        } else {
            i = 0;
        }
        if (z2 && i == 0 && (i = obtainStyledAttributes.getResourceId(C2219j.f6709R3, 0)) != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i == 0) {
            return context;
        }
        if (!(context instanceof C0267d) || ((C0267d) context).mo745c() != i) {
            return new C0267d(context, i);
        }
        return context;
    }

    /* renamed from: v */
    private void m855v(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public C0410c mo712c(Context context, AttributeSet attributeSet) {
        return new C0410c(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public AppCompatButton mo713d(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0418e mo714e(Context context, AttributeSet attributeSet) {
        return new C0418e(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public C0425f mo715f(Context context, AttributeSet attributeSet) {
        return new C0425f(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C0454j mo716g(Context context, AttributeSet attributeSet) {
        return new C0454j(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public AppCompatImageButton mo717h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public AppCompatImageView mo718i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public C0471o mo719j(Context context, AttributeSet attributeSet) {
        return new C0471o(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public C0481r mo720k(Context context, AttributeSet attributeSet) {
        return new C0481r(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C0484s mo721l(Context context, AttributeSet attributeSet) {
        return new C0484s(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C0502v mo722m(Context context, AttributeSet attributeSet) {
        return new C0502v(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public AppCompatSpinner mo723n(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public AppCompatTextView mo724o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public C0462l0 mo725p(Context context, AttributeSet attributeSet) {
        return new C0462l0(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public View mo726q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    /* renamed from: r */
    public final View mo727r(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2;
        View view2;
        if (!z || view == null) {
            context2 = context;
        } else {
            context2 = view.getContext();
        }
        if (z2 || z3) {
            context2 = m854u(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = C0473o1.m1931b(context2);
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = 8;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = 9;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = 10;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = 12;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = 13;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                view2 = mo721l(context2, attributeSet);
                m855v(view2, str);
                break;
            case 1:
                view2 = mo715f(context2, attributeSet);
                m855v(view2, str);
                break;
            case 2:
                view2 = mo719j(context2, attributeSet);
                m855v(view2, str);
                break;
            case 3:
                view2 = mo724o(context2, attributeSet);
                m855v(view2, str);
                break;
            case 4:
                view2 = mo717h(context2, attributeSet);
                m855v(view2, str);
                break;
            case 5:
                view2 = mo722m(context2, attributeSet);
                m855v(view2, str);
                break;
            case 6:
                view2 = mo723n(context2, attributeSet);
                m855v(view2, str);
                break;
            case 7:
                view2 = mo720k(context2, attributeSet);
                m855v(view2, str);
                break;
            case 8:
                view2 = mo725p(context2, attributeSet);
                m855v(view2, str);
                break;
            case 9:
                view2 = mo718i(context2, attributeSet);
                m855v(view2, str);
                break;
            case 10:
                view2 = mo712c(context2, attributeSet);
                m855v(view2, str);
                break;
            case 11:
                view2 = mo714e(context2, attributeSet);
                m855v(view2, str);
                break;
            case 12:
                view2 = mo716g(context2, attributeSet);
                m855v(view2, str);
                break;
            case 13:
                view2 = mo713d(context2, attributeSet);
                m855v(view2, str);
                break;
            default:
                view2 = mo726q(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = m853t(context2, str, attributeSet);
        }
        if (view2 != null) {
            m851b(view2, attributeSet);
            m850a(context2, view2, attributeSet);
        }
        return view2;
    }
}
