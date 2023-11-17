package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.C0214c;
import androidx.appcompat.view.menu.C0313m;
import p030c.C2216g;

/* renamed from: androidx.appcompat.view.menu.h */
class C0300h implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, C0313m.C0314a {

    /* renamed from: d */
    private C0297g f1613d;

    /* renamed from: e */
    private C0214c f1614e;

    /* renamed from: f */
    C0294e f1615f;

    /* renamed from: g */
    private C0313m.C0314a f1616g;

    public C0300h(C0297g gVar) {
        this.f1613d = gVar;
    }

    /* renamed from: a */
    public void mo1044a() {
        C0214c cVar = this.f1614e;
        if (cVar != null) {
            cVar.dismiss();
        }
    }

    /* renamed from: b */
    public void mo1045b(IBinder iBinder) {
        C0297g gVar = this.f1613d;
        C0214c.C0215a aVar = new C0214c.C0215a(gVar.mo1040w());
        C0294e eVar = new C0294e(aVar.getContext(), C2216g.f6589j);
        this.f1615f = eVar;
        eVar.mo905f(this);
        this.f1613d.mo1002b(this.f1615f);
        aVar.setAdapter(this.f1615f.mo947b(), this);
        View A = gVar.mo968A();
        if (A != null) {
            aVar.setCustomTitle(A);
        } else {
            aVar.setIcon(gVar.mo1042y()).setTitle(gVar.mo1043z());
        }
        aVar.setOnKeyListener(this);
        C0214c create = aVar.create();
        this.f1614e = create;
        create.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1614e.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1614e.show();
    }

    /* renamed from: c */
    public void mo519c(C0297g gVar, boolean z) {
        if (z || gVar == this.f1613d) {
            mo1044a();
        }
        C0313m.C0314a aVar = this.f1616g;
        if (aVar != null) {
            aVar.mo519c(gVar, z);
        }
    }

    /* renamed from: d */
    public boolean mo520d(C0297g gVar) {
        C0313m.C0314a aVar = this.f1616g;
        if (aVar != null) {
            return aVar.mo520d(gVar);
        }
        return false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1613d.mo980N((C0301i) this.f1615f.mo947b().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1615f.mo902c(this.f1613d, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1614e.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1614e.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1613d.mo1011e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1613d.performShortcut(i, keyEvent, 0);
    }
}
