package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0315n;
import androidx.core.graphics.drawable.C0836a;
import androidx.core.view.C1111b;
import com.salesforce.marketingcloud.C11398b;
import p030c.C2217h;
import p045d.C5769a;
import p279v.C8682b;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0301i implements C8682b {

    /* renamed from: A */
    private View f1617A;

    /* renamed from: B */
    private C1111b f1618B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f1619C;

    /* renamed from: D */
    private boolean f1620D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f1621E;

    /* renamed from: a */
    private final int f1622a;

    /* renamed from: b */
    private final int f1623b;

    /* renamed from: c */
    private final int f1624c;

    /* renamed from: d */
    private final int f1625d;

    /* renamed from: e */
    private CharSequence f1626e;

    /* renamed from: f */
    private CharSequence f1627f;

    /* renamed from: g */
    private Intent f1628g;

    /* renamed from: h */
    private char f1629h;

    /* renamed from: i */
    private int f1630i = C11398b.f33143v;

    /* renamed from: j */
    private char f1631j;

    /* renamed from: k */
    private int f1632k = C11398b.f33143v;

    /* renamed from: l */
    private Drawable f1633l;

    /* renamed from: m */
    private int f1634m = 0;

    /* renamed from: n */
    C0297g f1635n;

    /* renamed from: o */
    private C0322r f1636o;

    /* renamed from: p */
    private Runnable f1637p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f1638q;

    /* renamed from: r */
    private CharSequence f1639r;

    /* renamed from: s */
    private CharSequence f1640s;

    /* renamed from: t */
    private ColorStateList f1641t = null;

    /* renamed from: u */
    private PorterDuff.Mode f1642u = null;

    /* renamed from: v */
    private boolean f1643v = false;

    /* renamed from: w */
    private boolean f1644w = false;

    /* renamed from: x */
    private boolean f1645x = false;

    /* renamed from: y */
    private int f1646y = 16;

    /* renamed from: z */
    private int f1647z;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0302a implements C1111b.C1113b {
        C0302a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0301i iVar = C0301i.this;
            iVar.f1635n.mo978L(iVar);
        }
    }

    C0301i(C0297g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f1635n = gVar;
        this.f1622a = i2;
        this.f1623b = i;
        this.f1624c = i3;
        this.f1625d = i4;
        this.f1626e = charSequence;
        this.f1647z = i5;
    }

    /* renamed from: d */
    private static void m1134d(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: e */
    private Drawable m1135e(Drawable drawable) {
        if (drawable != null && this.f1645x && (this.f1643v || this.f1644w)) {
            drawable = C0836a.m3156r(drawable).mutate();
            if (this.f1643v) {
                C0836a.m3153o(drawable, this.f1641t);
            }
            if (this.f1644w) {
                C0836a.m3154p(drawable, this.f1642u);
            }
            this.f1645x = false;
        }
        return drawable;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public boolean mo1049A() {
        return this.f1635n.mo976J() && mo1053g() != 0;
    }

    /* renamed from: B */
    public boolean mo1050B() {
        return (this.f1647z & 4) == 4;
    }

    /* renamed from: a */
    public C1111b mo841a() {
        return this.f1618B;
    }

    /* renamed from: b */
    public C8682b mo842b(C1111b bVar) {
        C1111b bVar2 = this.f1618B;
        if (bVar2 != null) {
            bVar2.mo3672h();
        }
        this.f1617A = null;
        this.f1618B = bVar;
        this.f1635n.mo979M(true);
        C1111b bVar3 = this.f1618B;
        if (bVar3 != null) {
            bVar3.mo1169j(new C0302a());
        }
        return this;
    }

    /* renamed from: c */
    public void mo1051c() {
        this.f1635n.mo977K(this);
    }

    public boolean collapseActionView() {
        if ((this.f1647z & 8) == 0) {
            return false;
        }
        if (this.f1617A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1619C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f1635n.mo1013f(this);
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo1073j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f1619C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f1635n.mo1021m(this);
        }
        return false;
    }

    /* renamed from: f */
    public int mo1052f() {
        return this.f1625d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public char mo1053g() {
        return this.f1635n.mo975I() ? this.f1631j : this.f1629h;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f1617A;
        if (view != null) {
            return view;
        }
        C1111b bVar = this.f1618B;
        if (bVar == null) {
            return null;
        }
        View d = bVar.mo1167d(this);
        this.f1617A = d;
        return d;
    }

    public int getAlphabeticModifiers() {
        return this.f1632k;
    }

    public char getAlphabeticShortcut() {
        return this.f1631j;
    }

    public CharSequence getContentDescription() {
        return this.f1639r;
    }

    public int getGroupId() {
        return this.f1623b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f1633l;
        if (drawable != null) {
            return m1135e(drawable);
        }
        if (this.f1634m == 0) {
            return null;
        }
        Drawable b = C5769a.m23210b(this.f1635n.mo1040w(), this.f1634m);
        this.f1634m = 0;
        this.f1633l = b;
        return m1135e(b);
    }

    public ColorStateList getIconTintList() {
        return this.f1641t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1642u;
    }

    public Intent getIntent() {
        return this.f1628g;
    }

    public int getItemId() {
        return this.f1622a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1621E;
    }

    public int getNumericModifiers() {
        return this.f1630i;
    }

    public char getNumericShortcut() {
        return this.f1629h;
    }

    public int getOrder() {
        return this.f1624c;
    }

    public SubMenu getSubMenu() {
        return this.f1636o;
    }

    public CharSequence getTitle() {
        return this.f1626e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f1627f;
        return charSequence != null ? charSequence : this.f1626e;
    }

    public CharSequence getTooltipText() {
        return this.f1640s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public String mo1066h() {
        int i;
        char g = mo1053g();
        if (g == 0) {
            return "";
        }
        Resources resources = this.f1635n.mo1040w().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f1635n.mo1040w()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C2217h.f6612m));
        }
        if (this.f1635n.mo975I()) {
            i = this.f1632k;
        } else {
            i = this.f1630i;
        }
        m1134d(sb, i, 65536, resources.getString(C2217h.f6608i));
        m1134d(sb, i, C11398b.f33143v, resources.getString(C2217h.f6604e));
        m1134d(sb, i, 2, resources.getString(C2217h.f6603d));
        m1134d(sb, i, 1, resources.getString(C2217h.f6609j));
        m1134d(sb, i, 4, resources.getString(C2217h.f6611l));
        m1134d(sb, i, 8, resources.getString(C2217h.f6607h));
        if (g == 8) {
            sb.append(resources.getString(C2217h.f6605f));
        } else if (g == 10) {
            sb.append(resources.getString(C2217h.f6606g));
        } else if (g != ' ') {
            sb.append(g);
        } else {
            sb.append(resources.getString(C2217h.f6610k));
        }
        return sb.toString();
    }

    public boolean hasSubMenu() {
        return this.f1636o != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public CharSequence mo1068i(C0315n.C0316a aVar) {
        if (aVar == null || !aVar.mo806e()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    public boolean isActionViewExpanded() {
        return this.f1620D;
    }

    public boolean isCheckable() {
        return (this.f1646y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f1646y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f1646y & 16) != 0;
    }

    public boolean isVisible() {
        C1111b bVar = this.f1618B;
        if (bVar == null || !bVar.mo1168g()) {
            if ((this.f1646y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f1646y & 8) != 0 || !this.f1618B.mo1166c()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean mo1073j() {
        C1111b bVar;
        if ((this.f1647z & 8) == 0) {
            return false;
        }
        if (this.f1617A == null && (bVar = this.f1618B) != null) {
            this.f1617A = bVar.mo1167d(this);
        }
        if (this.f1617A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo1074k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f1638q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0297g gVar = this.f1635n;
        if (gVar.mo1017h(gVar, this)) {
            return true;
        }
        Runnable runnable = this.f1637p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f1628g != null) {
            try {
                this.f1635n.mo1040w().startActivity(this.f1628g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C1111b bVar = this.f1618B;
        if (bVar == null || !bVar.mo1164e()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public boolean mo1075l() {
        return (this.f1646y & 32) == 32;
    }

    /* renamed from: m */
    public boolean mo1076m() {
        return (this.f1646y & 4) != 0;
    }

    /* renamed from: n */
    public boolean mo1077n() {
        return (this.f1647z & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo1078o() {
        return (this.f1647z & 2) == 2;
    }

    /* renamed from: p */
    public C8682b setActionView(int i) {
        Context w = this.f1635n.mo1040w();
        setActionView(LayoutInflater.from(w).inflate(i, new LinearLayout(w), false));
        return this;
    }

    /* renamed from: q */
    public C8682b setActionView(View view) {
        int i;
        this.f1617A = view;
        this.f1618B = null;
        if (view != null && view.getId() == -1 && (i = this.f1622a) > 0) {
            view.setId(i);
        }
        this.f1635n.mo977K(this);
        return this;
    }

    /* renamed from: r */
    public void mo1081r(boolean z) {
        this.f1620D = z;
        this.f1635n.mo979M(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo1082s(boolean z) {
        int i;
        int i2 = this.f1646y;
        int i3 = i2 & -3;
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        int i4 = i | i3;
        this.f1646y = i4;
        if (i2 != i4) {
            this.f1635n.mo979M(false);
        }
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f1631j == c) {
            return this;
        }
        this.f1631j = Character.toLowerCase(c);
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f1646y;
        boolean z2 = z | (i & true);
        this.f1646y = z2 ? 1 : 0;
        if (i != z2) {
            this.f1635n.mo979M(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f1646y & 4) != 0) {
            this.f1635n.mo989X(this);
        } else {
            mo1082s(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f1646y |= 16;
        } else {
            this.f1646y &= -17;
        }
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1634m = 0;
        this.f1633l = drawable;
        this.f1645x = true;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1641t = colorStateList;
        this.f1643v = true;
        this.f1645x = true;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1642u = mode;
        this.f1644w = true;
        this.f1645x = true;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1628g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f1629h == c) {
            return this;
        }
        this.f1629h = c;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f1619C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f1638q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1629h = c;
        this.f1631j = Character.toLowerCase(c2);
        this.f1635n.mo979M(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f1647z = i;
            this.f1635n.mo977K(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1626e = charSequence;
        this.f1635n.mo979M(false);
        C0322r rVar = this.f1636o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1627f = charSequence;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo1105y(z)) {
            this.f1635n.mo978L(this);
        }
        return this;
    }

    /* renamed from: t */
    public void mo1099t(boolean z) {
        this.f1646y = (z ? 4 : 0) | (this.f1646y & -5);
    }

    public String toString() {
        CharSequence charSequence = this.f1626e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: u */
    public void mo1101u(boolean z) {
        if (z) {
            this.f1646y |= 32;
        } else {
            this.f1646y &= -33;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo1102v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f1621E = contextMenuInfo;
    }

    /* renamed from: w */
    public C8682b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* renamed from: x */
    public void mo1104x(C0322r rVar) {
        this.f1636o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo1105y(boolean z) {
        int i;
        int i2 = this.f1646y;
        int i3 = i2 & -9;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        int i4 = i | i3;
        this.f1646y = i4;
        if (i2 != i4) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public boolean mo1106z() {
        return this.f1635n.mo970C();
    }

    public C8682b setContentDescription(CharSequence charSequence) {
        this.f1639r = charSequence;
        this.f1635n.mo979M(false);
        return this;
    }

    public C8682b setTooltipText(CharSequence charSequence) {
        this.f1640s = charSequence;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f1631j == c && this.f1632k == i) {
            return this;
        }
        this.f1631j = Character.toLowerCase(c);
        this.f1632k = KeyEvent.normalizeMetaState(i);
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f1629h == c && this.f1630i == i) {
            return this;
        }
        this.f1629h = c;
        this.f1630i = KeyEvent.normalizeMetaState(i);
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1629h = c;
        this.f1630i = KeyEvent.normalizeMetaState(i);
        this.f1631j = Character.toLowerCase(c2);
        this.f1632k = KeyEvent.normalizeMetaState(i2);
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1633l = null;
        this.f1634m = i;
        this.f1645x = true;
        this.f1635n.mo979M(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        return setTitle((CharSequence) this.f1635n.mo1040w().getString(i));
    }
}
