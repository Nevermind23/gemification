package p341ge.bog.designsystem.components.toolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p352ak.C9970m6;
import p657wj.C18597a;
import p657wj.C18598b;

/* renamed from: ge.bog.designsystem.components.toolbar.IconActionButtonProvider */
public class IconActionButtonProvider extends C18597a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IconActionButtonProvider(Context context) {
        super(context);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m50839p(IconActionButtonProvider iconActionButtonProvider, MenuItem menuItem, View view) {
        C41536l.m120489i(iconActionButtonProvider, "this$0");
        C41536l.m120489i(menuItem, "$forItem");
        iconActionButtonProvider.mo46444m(menuItem);
    }

    /* renamed from: d */
    public View mo1167d(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "forItem");
        C9970m6 d = C9970m6.m36569d(LayoutInflater.from(mo3671a()));
        C41536l.m120488h(d, "inflate(LayoutInflater.from(context))");
        d.f27280e.setButtonIcon(menuItem.getIcon());
        d.f27280e.setOnClickListener(new C18598b(this, menuItem));
        return d.mo3946b();
    }

    /* renamed from: k */
    public void mo37098k(View view, ColorStateList colorStateList) {
        if (view != null) {
            Button button = C9970m6.m36568a(view).f27280e;
            C41536l.m120488h(button, "bind(actionView).actionButton");
            button.setButtonIconTint(colorStateList);
        }
    }
}
