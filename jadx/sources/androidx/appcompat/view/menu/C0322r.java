package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0297g;

/* renamed from: androidx.appcompat.view.menu.r */
public class C0322r extends C0297g implements SubMenu {

    /* renamed from: B */
    private C0297g f1698B;

    /* renamed from: C */
    private C0301i f1699C;

    public C0322r(Context context, C0297g gVar, C0301i iVar) {
        super(context);
        this.f1698B = gVar;
        this.f1699C = iVar;
    }

    /* renamed from: F */
    public C0297g mo972F() {
        return this.f1698B.mo972F();
    }

    /* renamed from: H */
    public boolean mo974H() {
        return this.f1698B.mo974H();
    }

    /* renamed from: I */
    public boolean mo975I() {
        return this.f1698B.mo975I();
    }

    /* renamed from: J */
    public boolean mo976J() {
        return this.f1698B.mo976J();
    }

    /* renamed from: V */
    public void mo987V(C0297g.C0298a aVar) {
        this.f1698B.mo987V(aVar);
    }

    /* renamed from: f */
    public boolean mo1013f(C0301i iVar) {
        return this.f1698B.mo1013f(iVar);
    }

    public MenuItem getItem() {
        return this.f1699C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo1017h(C0297g gVar, MenuItem menuItem) {
        if (super.mo1017h(gVar, menuItem) || this.f1698B.mo1017h(gVar, menuItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: i0 */
    public Menu mo1221i0() {
        return this.f1698B;
    }

    /* renamed from: m */
    public boolean mo1021m(C0301i iVar) {
        return this.f1698B.mo1021m(iVar);
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f1698B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.mo991Z(drawable);
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.mo1005c0(charSequence);
    }

    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.mo1010d0(view);
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f1699C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f1698B.setQwertyMode(z);
    }

    /* renamed from: v */
    public String mo1039v() {
        int i;
        C0301i iVar = this.f1699C;
        if (iVar != null) {
            i = iVar.getItemId();
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return super.mo1039v() + ":" + i;
    }

    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.mo990Y(i);
    }

    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.mo1003b0(i);
    }

    public SubMenu setIcon(int i) {
        this.f1699C.setIcon(i);
        return this;
    }
}
