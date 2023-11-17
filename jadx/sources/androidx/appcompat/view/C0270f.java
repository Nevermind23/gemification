package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.view.menu.C0303j;
import androidx.appcompat.view.menu.C0317o;
import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;
import p279v.C8681a;
import p279v.C8682b;

/* renamed from: androidx.appcompat.view.f */
public class C0270f extends ActionMode {

    /* renamed from: a */
    final Context f1409a;

    /* renamed from: b */
    final C0264b f1410b;

    /* renamed from: androidx.appcompat.view.f$a */
    public static class C0271a implements C0264b.C0265a {

        /* renamed from: a */
        final ActionMode.Callback f1411a;

        /* renamed from: b */
        final Context f1412b;

        /* renamed from: c */
        final ArrayList f1413c = new ArrayList();

        /* renamed from: d */
        final SimpleArrayMap f1414d = new SimpleArrayMap();

        public C0271a(Context context, ActionMode.Callback callback) {
            this.f1412b = context;
            this.f1411a = callback;
        }

        /* renamed from: f */
        private Menu m933f(Menu menu) {
            Menu menu2 = (Menu) this.f1414d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            C0317o oVar = new C0317o(this.f1412b, (C8681a) menu);
            this.f1414d.put(menu, oVar);
            return oVar;
        }

        /* renamed from: a */
        public void mo521a(C0264b bVar) {
            this.f1411a.onDestroyActionMode(mo769e(bVar));
        }

        /* renamed from: b */
        public boolean mo522b(C0264b bVar, Menu menu) {
            return this.f1411a.onCreateActionMode(mo769e(bVar), m933f(menu));
        }

        /* renamed from: c */
        public boolean mo523c(C0264b bVar, MenuItem menuItem) {
            return this.f1411a.onActionItemClicked(mo769e(bVar), new C0303j(this.f1412b, (C8682b) menuItem));
        }

        /* renamed from: d */
        public boolean mo524d(C0264b bVar, Menu menu) {
            return this.f1411a.onPrepareActionMode(mo769e(bVar), m933f(menu));
        }

        /* renamed from: e */
        public ActionMode mo769e(C0264b bVar) {
            int size = this.f1413c.size();
            for (int i = 0; i < size; i++) {
                C0270f fVar = (C0270f) this.f1413c.get(i);
                if (fVar != null && fVar.f1410b == bVar) {
                    return fVar;
                }
            }
            C0270f fVar2 = new C0270f(this.f1412b, bVar);
            this.f1413c.add(fVar2);
            return fVar2;
        }
    }

    public C0270f(Context context, C0264b bVar) {
        this.f1409a = context;
        this.f1410b = bVar;
    }

    public void finish() {
        this.f1410b.mo684c();
    }

    public View getCustomView() {
        return this.f1410b.mo685d();
    }

    public Menu getMenu() {
        return new C0317o(this.f1409a, (C8681a) this.f1410b.mo686e());
    }

    public MenuInflater getMenuInflater() {
        return this.f1410b.mo687f();
    }

    public CharSequence getSubtitle() {
        return this.f1410b.mo688g();
    }

    public Object getTag() {
        return this.f1410b.mo738h();
    }

    public CharSequence getTitle() {
        return this.f1410b.mo689i();
    }

    public boolean getTitleOptionalHint() {
        return this.f1410b.mo739j();
    }

    public void invalidate() {
        this.f1410b.mo690k();
    }

    public boolean isTitleOptional() {
        return this.f1410b.mo691l();
    }

    public void setCustomView(View view) {
        this.f1410b.mo692m(view);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1410b.mo694o(charSequence);
    }

    public void setTag(Object obj) {
        this.f1410b.mo740p(obj);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1410b.mo696r(charSequence);
    }

    public void setTitleOptionalHint(boolean z) {
        this.f1410b.mo697s(z);
    }

    public void setSubtitle(int i) {
        this.f1410b.mo693n(i);
    }

    public void setTitle(int i) {
        this.f1410b.mo695q(i);
    }
}
