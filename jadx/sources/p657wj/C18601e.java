package p657wj;

import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p601sg.C17782g;

/* renamed from: wj.e */
public abstract class C18601e {
    /* renamed from: a */
    public static final Button m63153a(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "<this>");
        View actionView = menuItem.getActionView();
        if (actionView != null) {
            return (Button) actionView.findViewById(C17782g.f49759g);
        }
        return null;
    }

    /* renamed from: b */
    public static final BadgeRelativeLayout m63154b(MenuItem menuItem) {
        C41536l.m120489i(menuItem, "<this>");
        View actionView = menuItem.getActionView();
        if (actionView instanceof BadgeRelativeLayout) {
            return (BadgeRelativeLayout) actionView;
        }
        return null;
    }
}
