package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.C0272g;
import androidx.appcompat.view.menu.C0297g;
import androidx.appcompat.view.menu.C0310l;
import p030c.C2210a;

/* renamed from: androidx.appcompat.widget.g1 */
public class C0430g1 {

    /* renamed from: a */
    private final Context f2089a;

    /* renamed from: b */
    private final C0297g f2090b;

    /* renamed from: c */
    private final View f2091c;

    /* renamed from: d */
    final C0310l f2092d;

    /* renamed from: e */
    C0433c f2093e;

    /* renamed from: androidx.appcompat.widget.g1$a */
    class C0431a implements C0297g.C0298a {
        C0431a() {
        }

        /* renamed from: a */
        public boolean mo462a(C0297g gVar, MenuItem menuItem) {
            C0433c cVar = C0430g1.this.f2093e;
            if (cVar != null) {
                return cVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public void mo464b(C0297g gVar) {
        }
    }

    /* renamed from: androidx.appcompat.widget.g1$b */
    class C0432b implements PopupWindow.OnDismissListener {
        C0432b() {
        }

        public void onDismiss() {
            C0430g1.this.getClass();
        }
    }

    /* renamed from: androidx.appcompat.widget.g1$c */
    public interface C0433c {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0430g1(Context context, View view) {
        this(context, view, 0);
    }

    /* renamed from: a */
    public Menu mo2096a() {
        return this.f2090b;
    }

    /* renamed from: b */
    public MenuInflater mo2097b() {
        return new C0272g(this.f2089a);
    }

    /* renamed from: c */
    public void mo2098c(int i) {
        mo2097b().inflate(i, this.f2090b);
    }

    /* renamed from: d */
    public void mo2099d(C0433c cVar) {
        this.f2093e = cVar;
    }

    /* renamed from: e */
    public void mo2100e() {
        this.f2092d.mo1187k();
    }

    public C0430g1(Context context, View view, int i) {
        this(context, view, i, C2210a.f6435F, 0);
    }

    public C0430g1(Context context, View view, int i, int i2, int i3) {
        this.f2089a = context;
        this.f2091c = view;
        C0297g gVar = new C0297g(context);
        this.f2090b = gVar;
        gVar.mo987V(new C0431a());
        C0310l lVar = new C0310l(context, gVar, view, false, i2, i3);
        this.f2092d = lVar;
        lVar.mo1184h(i);
        lVar.mo1185i(new C0432b());
    }
}
