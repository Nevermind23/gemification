package k91;

import android.graphics.Typeface;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.content.res.C0808h;
import iu0.C36546y;
import p341ge.bog.mobilebank.util.font.CustomTypefaceSpan;

/* renamed from: k91.a */
public abstract class C36928a {
    /* renamed from: a */
    public static CharSequence m109356a(CharSequence charSequence, int i) {
        Typeface h = C0808h.m3033h(C36546y.m108285N(), i);
        if (h == null) {
            return charSequence;
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new CustomTypefaceSpan("", h), 0, spannableString.length(), 18);
        return spannableString;
    }

    /* renamed from: b */
    public static void m109357b(Menu menu, int i) {
        for (int i2 = 0; i2 < menu.size(); i2++) {
            MenuItem item = menu.getItem(i2);
            SubMenu subMenu = item.getSubMenu();
            if (subMenu != null && subMenu.size() > 0) {
                for (int i3 = 0; i3 < subMenu.size(); i3++) {
                    MenuItem item2 = subMenu.getItem(i3);
                    item2.setTitle(m109356a(item2.getTitle(), i));
                }
            }
            item.setTitle(m109356a(item.getTitle(), i));
        }
    }
}
