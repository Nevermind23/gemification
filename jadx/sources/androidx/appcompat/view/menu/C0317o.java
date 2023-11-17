package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p279v.C8681a;

/* renamed from: androidx.appcompat.view.menu.o */
public class C0317o extends C0287c implements Menu {

    /* renamed from: d */
    private final C8681a f1674d;

    public C0317o(Context context, C8681a aVar) {
        super(context);
        if (aVar != null) {
            this.f1674d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo917c(this.f1674d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr3 != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.f1674d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr3[i5] = mo917c(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo918d(this.f1674d.addSubMenu(charSequence));
    }

    public void clear() {
        mo919e();
        this.f1674d.clear();
    }

    public void close() {
        this.f1674d.close();
    }

    public MenuItem findItem(int i) {
        return mo917c(this.f1674d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo917c(this.f1674d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f1674d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f1674d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f1674d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f1674d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo920f(i);
        this.f1674d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo921g(i);
        this.f1674d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f1674d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f1674d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f1674d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f1674d.setQwertyMode(z);
    }

    public int size() {
        return this.f1674d.size();
    }

    public MenuItem add(int i) {
        return mo917c(this.f1674d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo918d(this.f1674d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo917c(this.f1674d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo918d(this.f1674d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo917c(this.f1674d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo918d(this.f1674d.addSubMenu(i, i2, i3, i4));
    }
}
