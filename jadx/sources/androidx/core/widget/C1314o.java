package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.C1008h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: androidx.core.widget.o */
public abstract class C1314o {

    /* renamed from: androidx.core.widget.o$a */
    static class C1315a {
        /* renamed from: a */
        static boolean m4579a(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        /* renamed from: b */
        static int m4580b(TextView textView) {
            return textView.getMaxLines();
        }

        /* renamed from: c */
        static int m4581c(TextView textView) {
            return textView.getMinLines();
        }
    }

    /* renamed from: androidx.core.widget.o$b */
    static class C1316b {
        /* renamed from: a */
        static Drawable[] m4582a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        /* renamed from: b */
        static int m4583b(View view) {
            return view.getLayoutDirection();
        }

        /* renamed from: c */
        static int m4584c(View view) {
            return view.getTextDirection();
        }

        /* renamed from: d */
        static Locale m4585d(TextView textView) {
            return textView.getTextLocale();
        }

        /* renamed from: e */
        static void m4586e(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: f */
        static void m4587f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m4588g(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        /* renamed from: h */
        static void m4589h(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.core.widget.o$c */
    static class C1317c {
        /* renamed from: a */
        static int m4590a(TextView textView) {
            return textView.getBreakStrategy();
        }

        /* renamed from: b */
        static ColorStateList m4591b(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        /* renamed from: c */
        static PorterDuff.Mode m4592c(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        /* renamed from: d */
        static int m4593d(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        /* renamed from: e */
        static void m4594e(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        /* renamed from: f */
        static void m4595f(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        /* renamed from: g */
        static void m4596g(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        /* renamed from: h */
        static void m4597h(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }
    }

    /* renamed from: androidx.core.widget.o$d */
    static class C1318d {
        /* renamed from: a */
        static DecimalFormatSymbols m4598a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    /* renamed from: androidx.core.widget.o$e */
    static class C1319e {
        /* renamed from: a */
        static int m4599a(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        /* renamed from: b */
        static int m4600b(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        /* renamed from: c */
        static int m4601c(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        /* renamed from: d */
        static int[] m4602d(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }

        /* renamed from: e */
        static int m4603e(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        /* renamed from: f */
        static void m4604f(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        /* renamed from: g */
        static void m4605g(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        /* renamed from: h */
        static void m4606h(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: androidx.core.widget.o$f */
    static class C1320f {
        /* renamed from: a */
        static String[] m4607a(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        /* renamed from: b */
        static PrecomputedText.Params m4608b(TextView textView) {
            return textView.getTextMetricsParams();
        }

        /* renamed from: c */
        static void m4609c(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    /* renamed from: androidx.core.widget.o$g */
    private static class C1321g implements ActionMode.Callback {

        /* renamed from: a */
        private final ActionMode.Callback f3873a;

        /* renamed from: b */
        private final TextView f3874b;

        /* renamed from: c */
        private Class f3875c;

        /* renamed from: d */
        private Method f3876d;

        /* renamed from: e */
        private boolean f3877e;

        /* renamed from: f */
        private boolean f3878f = false;

        C1321g(ActionMode.Callback callback, TextView textView) {
            this.f3873a = callback;
            this.f3874b = textView;
        }

        /* renamed from: a */
        private Intent m4610a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        /* renamed from: b */
        private Intent m4611b(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = m4610a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m4613e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        /* renamed from: c */
        private List m4612c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo next : packageManager.queryIntentActivities(m4610a(), 0)) {
                if (m4614f(next, context)) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        /* renamed from: e */
        private boolean m4613e(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        private boolean m4614f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        private void m4615g(Menu menu) {
            Method method;
            Context context = this.f3874b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3878f) {
                this.f3878f = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3875c = cls;
                    this.f3876d = cls.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f3877e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3875c = null;
                    this.f3876d = null;
                    this.f3877e = false;
                }
            }
            try {
                if (!this.f3877e || !this.f3875c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f3876d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List c = m4612c(context, packageManager);
                for (int i = 0; i < c.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) c.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m4611b(resolveInfo, this.f3874b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public ActionMode.Callback mo3875d() {
            return this.f3873a;
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3873a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3873a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f3873a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m4615g(menu);
            return this.f3873a.onPrepareActionMode(actionMode, menu);
        }
    }

    /* renamed from: a */
    public static Drawable[] m4559a(TextView textView) {
        return C1316b.m4582a(textView);
    }

    /* renamed from: b */
    public static int m4560b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: c */
    public static int m4561c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static int m4562d(TextView textView) {
        return C1315a.m4580b(textView);
    }

    /* renamed from: e */
    private static int m4563e(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m4564f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (Build.VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (C1316b.m4583b(textView) == 1) {
                z = true;
            }
            switch (C1316b.m4584c(textView)) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(C1320f.m4607a(C1318d.m4598a(C1316b.m4585d(textView)))[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: g */
    public static PrecomputedTextCompat.Params m4565g(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PrecomputedTextCompat.Params(C1320f.m4608b(textView));
        }
        PrecomputedTextCompat.Params.C0962a aVar = new PrecomputedTextCompat.Params.C0962a(new TextPaint(textView.getPaint()));
        aVar.mo3420b(C1317c.m4590a(textView));
        aVar.mo3421c(C1317c.m4593d(textView));
        aVar.mo3422d(m4564f(textView));
        return aVar.mo3419a();
    }

    /* renamed from: h */
    public static void m4566h(TextView textView, int i, int i2, int i3, int i4) {
        if (Build.VERSION.SDK_INT >= 27) {
            C1319e.m4604f(textView, i, i2, i3, i4);
        } else if (textView instanceof C1291b) {
            ((C1291b) textView).setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }
    }

    /* renamed from: i */
    public static void m4567i(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 27) {
            C1319e.m4606h(textView, i);
        } else if (textView instanceof C1291b) {
            ((C1291b) textView).setAutoSizeTextTypeWithDefaults(i);
        }
    }

    /* renamed from: j */
    public static void m4568j(TextView textView, ColorStateList colorStateList) {
        C1008h.m3530g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C1317c.m4595f(textView, colorStateList);
        } else if (textView instanceof C1290a0) {
            ((C1290a0) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: k */
    public static void m4569k(TextView textView, PorterDuff.Mode mode) {
        C1008h.m3530g(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            C1317c.m4596g(textView, mode);
        } else if (textView instanceof C1290a0) {
            ((C1290a0) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }

    /* renamed from: l */
    public static void m4570l(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        C1316b.m4586e(textView, drawable, drawable2, drawable3, drawable4);
    }

    /* renamed from: m */
    public static void m4571m(TextView textView, int i) {
        int i2;
        C1008h.m3527d(i);
        if (Build.VERSION.SDK_INT >= 28) {
            C1320f.m4609c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C1315a.m4579a(textView)) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: n */
    public static void m4572n(TextView textView, int i) {
        int i2;
        C1008h.m3527d(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (C1315a.m4579a(textView)) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: o */
    public static void m4573o(TextView textView, int i) {
        C1008h.m3527d(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: p */
    public static void m4574p(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        m4565g(textView);
        throw null;
    }

    /* renamed from: q */
    public static void m4575q(TextView textView, int i) {
        textView.setTextAppearance(i);
    }

    /* renamed from: r */
    public static void m4576r(TextView textView, PrecomputedTextCompat.Params params) {
        C1316b.m4589h(textView, m4563e(params.mo3414d()));
        textView.getPaint().set(params.mo3415e());
        C1317c.m4594e(textView, params.mo3412b());
        C1317c.m4597h(textView, params.mo3413c());
    }

    /* renamed from: s */
    public static ActionMode.Callback m4577s(ActionMode.Callback callback) {
        if (!(callback instanceof C1321g) || Build.VERSION.SDK_INT < 26) {
            return callback;
        }
        return ((C1321g) callback).mo3875d();
    }

    /* renamed from: t */
    public static ActionMode.Callback m4578t(TextView textView, ActionMode.Callback callback) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26 || i > 27 || (callback instanceof C1321g) || callback == null) {
            return callback;
        }
        return new C1321g(callback, textView);
    }
}
