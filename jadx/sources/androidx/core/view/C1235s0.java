package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import p279v.C8682b;

/* renamed from: androidx.core.view.s0 */
public abstract class C1235s0 {

    /* renamed from: androidx.core.view.s0$a */
    static class C1236a {
        /* renamed from: a */
        static int m4327a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        /* renamed from: b */
        static CharSequence m4328b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        /* renamed from: c */
        static ColorStateList m4329c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        /* renamed from: d */
        static PorterDuff.Mode m4330d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        /* renamed from: e */
        static int m4331e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        /* renamed from: f */
        static CharSequence m4332f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        /* renamed from: g */
        static MenuItem m4333g(MenuItem menuItem, char c, int i) {
            return menuItem.setAlphabeticShortcut(c, i);
        }

        /* renamed from: h */
        static MenuItem m4334h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        /* renamed from: i */
        static MenuItem m4335i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        /* renamed from: j */
        static MenuItem m4336j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        /* renamed from: k */
        static MenuItem m4337k(MenuItem menuItem, char c, int i) {
            return menuItem.setNumericShortcut(c, i);
        }

        /* renamed from: l */
        static MenuItem m4338l(MenuItem menuItem, char c, char c2, int i, int i2) {
            return menuItem.setShortcut(c, c2, i, i2);
        }

        /* renamed from: m */
        static MenuItem m4339m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static C1111b m4319a(MenuItem menuItem) {
        if (menuItem instanceof C8682b) {
            return ((C8682b) menuItem).mo841a();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    /* renamed from: b */
    public static MenuItem m4320b(MenuItem menuItem, C1111b bVar) {
        if (menuItem instanceof C8682b) {
            return ((C8682b) menuItem).mo842b(bVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: c */
    public static void m4321c(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C8682b) {
            ((C8682b) menuItem).setAlphabeticShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1236a.m4333g(menuItem, c, i);
        }
    }

    /* renamed from: d */
    public static void m4322d(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C8682b) {
            ((C8682b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1236a.m4334h(menuItem, charSequence);
        }
    }

    /* renamed from: e */
    public static void m4323e(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof C8682b) {
            ((C8682b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1236a.m4335i(menuItem, colorStateList);
        }
    }

    /* renamed from: f */
    public static void m4324f(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof C8682b) {
            ((C8682b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1236a.m4336j(menuItem, mode);
        }
    }

    /* renamed from: g */
    public static void m4325g(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof C8682b) {
            ((C8682b) menuItem).setNumericShortcut(c, i);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1236a.m4337k(menuItem, c, i);
        }
    }

    /* renamed from: h */
    public static void m4326h(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof C8682b) {
            ((C8682b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            C1236a.m4339m(menuItem, charSequence);
        }
    }
}
