package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0767a;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1111b;
import com.salesforce.marketingcloud.C11398b;
import p279v.C8682b;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0285a implements C8682b {

    /* renamed from: a */
    private final int f1498a;

    /* renamed from: b */
    private final int f1499b;

    /* renamed from: c */
    private final int f1500c;

    /* renamed from: d */
    private CharSequence f1501d;

    /* renamed from: e */
    private CharSequence f1502e;

    /* renamed from: f */
    private Intent f1503f;

    /* renamed from: g */
    private char f1504g;

    /* renamed from: h */
    private int f1505h = C11398b.f33143v;

    /* renamed from: i */
    private char f1506i;

    /* renamed from: j */
    private int f1507j = C11398b.f33143v;

    /* renamed from: k */
    private Drawable f1508k;

    /* renamed from: l */
    private Context f1509l;

    /* renamed from: m */
    private MenuItem.OnMenuItemClickListener f1510m;

    /* renamed from: n */
    private CharSequence f1511n;

    /* renamed from: o */
    private CharSequence f1512o;

    /* renamed from: p */
    private ColorStateList f1513p = null;

    /* renamed from: q */
    private PorterDuff.Mode f1514q = null;

    /* renamed from: r */
    private boolean f1515r = false;

    /* renamed from: s */
    private boolean f1516s = false;

    /* renamed from: t */
    private int f1517t = 16;

    public C0285a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1509l = context;
        this.f1498a = i2;
        this.f1499b = i;
        this.f1500c = i4;
        this.f1501d = charSequence;
    }

    /* renamed from: c */
    private void m989c() {
        Drawable drawable = this.f1508k;
        if (drawable == null) {
            return;
        }
        if (this.f1515r || this.f1516s) {
            Drawable r = C0836a.m3156r(drawable);
            this.f1508k = r;
            Drawable mutate = r.mutate();
            this.f1508k = mutate;
            if (this.f1515r) {
                C0836a.m3153o(mutate, this.f1513p);
            }
            if (this.f1516s) {
                C0836a.m3154p(this.f1508k, this.f1514q);
            }
        }
    }

    /* renamed from: a */
    public C1111b mo841a() {
        return null;
    }

    /* renamed from: b */
    public C8682b mo842b(C1111b bVar) {
        throw new UnsupportedOperationException();
    }

    public boolean collapseActionView() {
        return false;
    }

    /* renamed from: d */
    public C8682b setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public C8682b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public boolean expandActionView() {
        return false;
    }

    /* renamed from: f */
    public C8682b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f1507j;
    }

    public char getAlphabeticShortcut() {
        return this.f1506i;
    }

    public CharSequence getContentDescription() {
        return this.f1511n;
    }

    public int getGroupId() {
        return this.f1499b;
    }

    public Drawable getIcon() {
        return this.f1508k;
    }

    public ColorStateList getIconTintList() {
        return this.f1513p;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1514q;
    }

    public Intent getIntent() {
        return this.f1503f;
    }

    public int getItemId() {
        return this.f1498a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f1505h;
    }

    public char getNumericShortcut() {
        return this.f1504g;
    }

    public int getOrder() {
        return this.f1500c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1501d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1502e;
        return charSequence != null ? charSequence : this.f1501d;
    }

    public CharSequence getTooltipText() {
        return this.f1512o;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1517t & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1517t & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1517t & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1517t & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1506i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1517t = z | (this.f1517t & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1517t = (z ? 2 : 0) | (this.f1517t & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1517t = (z ? 16 : 0) | (this.f1517t & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1508k = drawable;
        m989c();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1513p = colorStateList;
        this.f1515r = true;
        m989c();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1514q = mode;
        this.f1516s = true;
        m989c();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1503f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1504g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1510m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1504g = c;
        this.f1506i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1501d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1502e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f1517t & 8;
        if (z) {
            i = 0;
        }
        this.f1517t = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1506i = Character.toLowerCase(c);
        this.f1507j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C8682b setContentDescription(CharSequence charSequence) {
        this.f1511n = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1504g = c;
        this.f1505h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1501d = this.f1509l.getResources().getString(i);
        return this;
    }

    public C8682b setTooltipText(CharSequence charSequence) {
        this.f1512o = charSequence;
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1508k = C0767a.m2895e(this.f1509l, i);
        m989c();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1504g = c;
        this.f1505h = KeyEvent.normalizeMetaState(i);
        this.f1506i = Character.toLowerCase(c2);
        this.f1507j = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
