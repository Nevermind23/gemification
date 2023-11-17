package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.C0266c;
import androidx.core.view.C1111b;
import java.lang.reflect.Method;
import p279v.C8682b;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0303j extends C0287c implements MenuItem {

    /* renamed from: d */
    private final C8682b f1649d;

    /* renamed from: e */
    private Method f1650e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0304a extends C1111b {

        /* renamed from: d */
        final ActionProvider f1651d;

        C0304a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f1651d = actionProvider;
        }

        /* renamed from: b */
        public boolean mo1163b() {
            return this.f1651d.hasSubMenu();
        }

        /* renamed from: e */
        public boolean mo1164e() {
            return this.f1651d.onPerformDefaultAction();
        }

        /* renamed from: f */
        public void mo1165f(SubMenu subMenu) {
            this.f1651d.onPrepareSubMenu(C0303j.this.mo918d(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0305b extends C0304a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        private C1111b.C1113b f1653f;

        C0305b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: c */
        public boolean mo1166c() {
            return this.f1651d.isVisible();
        }

        /* renamed from: d */
        public View mo1167d(MenuItem menuItem) {
            return this.f1651d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo1168g() {
            return this.f1651d.overridesItemVisibility();
        }

        /* renamed from: j */
        public void mo1169j(C1111b.C1113b bVar) {
            C0305b bVar2;
            this.f1653f = bVar;
            ActionProvider actionProvider = this.f1651d;
            if (bVar != null) {
                bVar2 = this;
            } else {
                bVar2 = null;
            }
            actionProvider.setVisibilityListener(bVar2);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C1111b.C1113b bVar = this.f1653f;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0306c extends FrameLayout implements C0266c {

        /* renamed from: d */
        final CollapsibleActionView f1655d;

        C0306c(View view) {
            super(view.getContext());
            this.f1655d = (CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo1171a() {
            return (View) this.f1655d;
        }

        /* renamed from: b */
        public void mo741b() {
            this.f1655d.onActionViewExpanded();
        }

        /* renamed from: f */
        public void mo742f() {
            this.f1655d.onActionViewCollapsed();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0307d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f1656a;

        C0307d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f1656a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f1656a.onMenuItemActionCollapse(C0303j.this.mo917c(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f1656a.onMenuItemActionExpand(C0303j.this.mo917c(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0308e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: a */
        private final MenuItem.OnMenuItemClickListener f1658a;

        C0308e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f1658a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f1658a.onMenuItemClick(C0303j.this.mo917c(menuItem));
        }
    }

    public C0303j(Context context, C8682b bVar) {
        super(context);
        if (bVar != null) {
            this.f1649d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public boolean collapseActionView() {
        return this.f1649d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f1649d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C1111b a = this.f1649d.mo841a();
        if (a instanceof C0304a) {
            return ((C0304a) a).f1651d;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f1649d.getActionView();
        if (actionView instanceof C0306c) {
            return ((C0306c) actionView).mo1171a();
        }
        return actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f1649d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f1649d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f1649d.getContentDescription();
    }

    public int getGroupId() {
        return this.f1649d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f1649d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f1649d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f1649d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f1649d.getIntent();
    }

    public int getItemId() {
        return this.f1649d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f1649d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f1649d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f1649d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f1649d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo918d(this.f1649d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f1649d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f1649d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f1649d.getTooltipText();
    }

    /* renamed from: h */
    public void mo1129h(boolean z) {
        try {
            if (this.f1650e == null) {
                this.f1650e = this.f1649d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1650e.invoke(this.f1649d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean hasSubMenu() {
        return this.f1649d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f1649d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f1649d.isCheckable();
    }

    public boolean isChecked() {
        return this.f1649d.isChecked();
    }

    public boolean isEnabled() {
        return this.f1649d.isEnabled();
    }

    public boolean isVisible() {
        return this.f1649d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C0305b bVar = new C0305b(this.f1528a, actionProvider);
        C8682b bVar2 = this.f1649d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo842b(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0306c(view);
        }
        this.f1649d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1649d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1649d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1649d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f1649d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1649d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1649d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f1649d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f1649d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1649d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1649d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        C0307d dVar;
        C8682b bVar = this.f1649d;
        if (onActionExpandListener != null) {
            dVar = new C0307d(onActionExpandListener);
        } else {
            dVar = null;
        }
        bVar.setOnActionExpandListener(dVar);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        C0308e eVar;
        C8682b bVar = this.f1649d;
        if (onMenuItemClickListener != null) {
            eVar = new C0308e(onMenuItemClickListener);
        } else {
            eVar = null;
        }
        bVar.setOnMenuItemClickListener(eVar);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1649d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f1649d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f1649d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1649d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1649d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f1649d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f1649d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f1649d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1649d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f1649d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f1649d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f1649d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f1649d.setActionView(i);
        View actionView = this.f1649d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f1649d.setActionView((View) new C0306c(actionView));
        }
        return this;
    }
}
